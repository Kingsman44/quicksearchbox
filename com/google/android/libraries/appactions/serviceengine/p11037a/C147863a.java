package com.google.android.libraries.appactions.serviceengine.p11037a;

import com.google.common.base.C58837ba;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71087ef;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71088eg;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71089eh;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71090ei;

/* renamed from: com.google.android.libraries.appactions.serviceengine.a.a */
/* compiled from: PG */
public final class C147863a {
    /* renamed from: a */
    public static C71090ei m240981a(String str, String str2) {
        int i;
        C71089eh ehVar = (C71089eh) C71090ei.f189598c.createBuilder();
        C71087ef efVar = (C71087ef) C71088eg.f189593d.createBuilder();
        String g = C58837ba.m90858g(str);
        int i2 = 6;
        if (g.equals("aga_gab")) {
            i = 2;
        } else if (g.equals("aga_cct")) {
            i = 3;
        } else if (g.equals("chrome")) {
            i = 4;
        } else if (g.equals("messages")) {
            i = 5;
        } else if (g.equals("tasks")) {
            i = 6;
        } else if (g.equals("toast")) {
            i = 7;
        } else {
            i = g.equals("yt") ? 8 : 1;
        }
        efVar.copyOnWrite();
        C71088eg egVar = (C71088eg) efVar.instance;
        egVar.f189596b = i - 1;
        egVar.f189595a |= 1;
        String g2 = C58837ba.m90858g(str2);
        if (g2.equals("com.instacart.client")) {
            i2 = 2;
        } else if (g2.equals("com.ubercab.eats")) {
            i2 = 3;
        } else if (g2.equals("com.starbucks.mobilecard")) {
            i2 = 4;
        } else if (g2.equals("com.mcdonalds.app")) {
            i2 = 5;
        } else if (!g2.equals("com.dunkinbrands.otgo")) {
            if (g2.equals("com.spotify.music")) {
                i2 = 102;
            } else if (g2.equals("com.clearchannel.iheartradio.controller")) {
                i2 = 103;
            } else if (g2.equals("deezer.android.app")) {
                i2 = 104;
            } else {
                i2 = g2.equals("com.pandora.android") ? 105 : 1;
            }
        }
        efVar.copyOnWrite();
        C71088eg egVar2 = (C71088eg) efVar.instance;
        egVar2.f189597c = i2 - 1;
        egVar2.f189595a |= 2;
        C71088eg egVar3 = (C71088eg) efVar.build();
        ehVar.copyOnWrite();
        C71090ei eiVar = (C71090ei) ehVar.instance;
        egVar3.getClass();
        eiVar.f189602b = egVar3;
        eiVar.f189601a |= 1;
        return (C71090ei) ehVar.build();
    }
}
