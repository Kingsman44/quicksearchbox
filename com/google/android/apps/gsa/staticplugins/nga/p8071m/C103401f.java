package com.google.android.apps.gsa.staticplugins.nga.p8071m;

import android.net.Network;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80097al;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80146bx;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80147by;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80155cd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80156ce;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.m.f */
/* compiled from: PG */
public final class C103401f implements C103651a {

    /* renamed from: a */
    public static final C58974d f288243a = C58974d.m91136j();

    /* renamed from: b */
    public final C58889cz f288244b;

    /* renamed from: c */
    private final C91142g f288245c;

    /* renamed from: d */
    private final C22871g f288246d;

    public C103401f(C91142g gVar, C58889cz czVar, C90821bm bmVar) {
        this.f288245c = gVar;
        this.f288244b = czVar;
        this.f288246d = bmVar.mo85163a(C103400e.class);
    }

    /* renamed from: b */
    public final int mo93777b() {
        return (((int) this.f288245c.mo85399d(C90126fx.f251665nB)) * 10) / 100;
    }

    /* renamed from: c */
    public final Duration mo93778c() {
        return Duration.ofMillis(this.f288245c.mo85399d(C90126fx.f251664nA));
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80097al alVar;
        if (bnVar.f219917a == 4) {
            SettableFuture settableFuture = new SettableFuture();
            if (bnVar.f219917a == 4) {
                alVar = (C80097al) bnVar.f219918b;
            } else {
                alVar = C80097al.f219798c;
            }
            long j = alVar.f219801b;
            Network fromNetworkHandle = Network.fromNetworkHandle(j);
            if (fromNetworkHandle == null) {
                C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
                C80155cd cdVar = (C80155cd) C80156ce.f219955d.createBuilder();
                cdVar.copyOnWrite();
                C80156ce ceVar = (C80156ce) cdVar.instance;
                ceVar.f219957a = 1 | ceVar.f219957a;
                ceVar.f219958b = j;
                cdVar.copyOnWrite();
                C80156ce ceVar2 = (C80156ce) cdVar.instance;
                ceVar2.f219957a |= 2;
                ceVar2.f219959c = false;
                C80156ce ceVar3 = (C80156ce) cdVar.build();
                buVar.copyOnWrite();
                C80275dd ddVar = (C80275dd) buVar.instance;
                ceVar3.getClass();
                ddVar.f220291b = ceVar3;
                ddVar.f220290a = 3;
                settableFuture.mo57356n((C80275dd) buVar.build());
            } else {
                this.f288246d.mo28212l("[NGA] scheduleMeasure", new C103399d(this, fromNetworkHandle, j, settableFuture));
            }
            return settableFuture;
        }
        C80143bu buVar2 = (C80143bu) C80275dd.f220288c.createBuilder();
        C80146bx bxVar = (C80146bx) C80147by.f219936c.createBuilder();
        bxVar.copyOnWrite();
        C80147by byVar = (C80147by) bxVar.instance;
        byVar.f219938a |= 1;
        byVar.f219939b = "No network to measure";
        C80147by byVar2 = (C80147by) bxVar.build();
        buVar2.copyOnWrite();
        C80275dd ddVar2 = (C80275dd) buVar2.instance;
        byVar2.getClass();
        ddVar2.f220291b = byVar2;
        ddVar2.f220290a = 1;
        return C60856cj.m92900i((C80275dd) buVar2.build());
    }
}
