#!/bin/sh

ifconfig -a
/bin/sed "s/ssid=sam-wifi/ssid=sam_`ifconfig wlan0 | grep HWaddr | awk '{print $5}'`/g" /etc/hostapd.conf > /tmp/hostapd.conf
