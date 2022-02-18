package com.siuzannasmolianinova.news.core

import android.view.MenuItem
import com.siuzannasmolianinova.news.R
import com.siuzannasmolianinova.news.data.Country
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.channels.trySendBlocking
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

fun MenuItem.itemClickFlow(): Flow<Country> {
    return callbackFlow {
        val itemClickListener = MenuItem.OnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.ae -> {
                    trySendBlocking(Country.AE)
                    true
                }
                R.id.ar -> {
                    trySendBlocking(Country.AR)
                    true
                }
                R.id.at -> {
                    trySendBlocking(Country.AT)
                    true
                }
                R.id.au -> {
                    trySendBlocking(Country.AU)
                    true
                }
                R.id.be -> {
                    trySendBlocking(Country.BE)
                    true
                }
                R.id.bg -> {
                    trySendBlocking(Country.BG)
                    true
                }
                R.id.br -> {
                    trySendBlocking(Country.BR)
                    true
                }
                R.id.ca -> {
                    trySendBlocking(Country.CA)
                    true
                }
                R.id.ch -> {
                    trySendBlocking(Country.CH)
                    true
                }
                R.id.cn -> {
                    trySendBlocking(Country.CN)
                    true
                }
                R.id.co -> {
                    trySendBlocking(Country.CO)
                    true
                }
                R.id.cu -> {
                    trySendBlocking(Country.CU)
                    true
                }
                R.id.cz -> {
                    trySendBlocking(Country.CZ)
                    true
                }
                R.id.de -> {
                    trySendBlocking(Country.DE)
                    true
                }
                R.id.eg -> {
                    trySendBlocking(Country.EG)
                    true
                }
                R.id.fr -> {
                    trySendBlocking(Country.FR)
                    true
                }
                R.id.gb -> {
                    trySendBlocking(Country.GB)
                    true
                }
                R.id.gr -> {
                    trySendBlocking(Country.GR)
                    true
                }
                R.id.hk -> {
                    trySendBlocking(Country.HK)
                    true
                }
                R.id.hu -> {
                    trySendBlocking(Country.HU)
                    true
                }
                R.id.id -> {
                    trySendBlocking(Country.ID)
                    true
                }
                R.id.ie -> {
                    trySendBlocking(Country.IE)
                    true
                }
                R.id.il -> {
                    trySendBlocking(Country.IL)
                    true
                }
                R.id.ind -> {
                    trySendBlocking(Country.IN)
                    true
                }
                R.id.it -> {
                    trySendBlocking(Country.IT)
                    true
                }
                R.id.jp -> {
                    trySendBlocking(Country.JP)
                    true
                }
                R.id.kr -> {
                    trySendBlocking(Country.KR)
                    true
                }
                R.id.lt -> {
                    trySendBlocking(Country.LT)
                    true
                }
                R.id.lv -> {
                    trySendBlocking(Country.LV)
                    true
                }
                R.id.ma -> {
                    trySendBlocking(Country.MA)
                    true
                }
                R.id.mx -> {
                    trySendBlocking(Country.MX)
                    true
                }
                R.id.my -> {
                    trySendBlocking(Country.MY)
                    true
                }
                R.id.ng -> {
                    trySendBlocking(Country.NG)
                    true
                }
                R.id.nl -> {
                    trySendBlocking(Country.NL)
                    true
                }
                R.id.no -> {
                    trySendBlocking(Country.NO)
                    true
                }
                R.id.nz -> {
                    trySendBlocking(Country.NZ)
                    true
                }
                R.id.ph -> {
                    trySendBlocking(Country.PH)
                    true
                }
                R.id.pl -> {
                    trySendBlocking(Country.PL)
                    true
                }
                R.id.pt -> {
                    trySendBlocking(Country.PT)
                    true
                }
                R.id.ro -> {
                    trySendBlocking(Country.RO)
                    true
                }
                R.id.rs -> {
                    trySendBlocking(Country.RS)
                    true
                }
                R.id.ru -> {
                    trySendBlocking(Country.RU)
                    true
                }
                R.id.sa -> {
                    trySendBlocking(Country.SA)
                    true
                }
                R.id.se -> {
                    trySendBlocking(Country.SE)
                    true
                }
                R.id.sg -> {
                    trySendBlocking(Country.SG)
                    true
                }
                R.id.si -> {
                    trySendBlocking(Country.SI)
                    true
                }
                R.id.sk -> {
                    trySendBlocking(Country.SK)
                    true
                }
                R.id.th -> {
                    trySendBlocking(Country.TH)
                    true
                }
                R.id.tr -> {
                    trySendBlocking(Country.TR)
                    true
                }
                R.id.tw -> {
                    trySendBlocking(Country.TW)
                    true
                }
                R.id.ua -> {
                    trySendBlocking(Country.UA)
                    true
                }
                R.id.us -> {
                    trySendBlocking(Country.US)
                    true
                }
                R.id.ve -> {
                    trySendBlocking(Country.VE)
                    true
                }
                R.id.za -> {
                    trySendBlocking(Country.ZA)
                    true
                }
                else -> error("Unexpected id")
            }
        }
        this@itemClickFlow.setOnMenuItemClickListener(itemClickListener)
        awaitClose {
            this@itemClickFlow.setOnMenuItemClickListener(null)
        }
    }
}
