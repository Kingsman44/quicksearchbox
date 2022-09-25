package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.aeb;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.s */
/* compiled from: PG */
public final /* synthetic */ class C82233s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C82235u f224724a;

    /* renamed from: b */
    public final /* synthetic */ aeb f224725b;

    public /* synthetic */ C82233s(C82235u uVar, aeb aeb) {
        this.f224724a = uVar;
        this.f224725b = aeb;
    }

    public final void run() {
        C82235u uVar = this.f224724a;
        aeb aeb = this.f224725b;
        uVar.f224729d = uVar.f224728c.mo85399d(C90126fx.f251559lB);
        uVar.f224730e = uVar.f224728c.mo85399d(C90126fx.f251563lF);
        uVar.f224731f = Duration.ofSeconds(uVar.f224728c.mo85399d(C90126fx.f251564lG)).toMillis();
        uVar.f224732g = Duration.ofSeconds(uVar.f224728c.mo85399d(C90126fx.f251562lE)).toMillis();
        uVar.f224733h = Duration.ofSeconds(uVar.f224728c.mo85399d(C90126fx.f251565lH)).toMillis();
        uVar.f224737l.add(aeb);
        C83334w wVar = uVar.f224726a;
        C82887ec ecVar = C82887ec.MONITORING_EVENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        aeb.getClass();
        eaVar.f225980b = aeb;
        eaVar.f225979a = 93;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), C83320io.f227132d);
        long j = uVar.f224732g;
        if (((long) uVar.f224737l.size()) >= uVar.f224729d) {
            uVar.f224734i = false;
            j = uVar.f224733h;
        }
        uVar.mo75575b(j);
    }
}
