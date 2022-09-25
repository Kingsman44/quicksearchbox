package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82912fa;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82915fd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.cd */
/* compiled from: PG */
public final class C83165cd implements C83134b {
    /* renamed from: a */
    public final void mo76647a(C82885ea eaVar, C82883dz dzVar) {
        C82915fd fdVar;
        if (eaVar.f225979a == 37) {
            fdVar = (C82915fd) eaVar.f225980b;
        } else {
            fdVar = C82915fd.f226204f;
        }
        C82912fa faVar = (C82912fa) C82915fd.f226204f.createBuilder();
        int i = fdVar.f226206a;
        Objects.requireNonNull(fdVar);
        C83158bx bxVar = new C83158bx(fdVar);
        Objects.requireNonNull(faVar);
        boolean z = true;
        C83080bg.m132478b(1 == (i & 1), bxVar, new C83159by(faVar));
        boolean z2 = (fdVar.f226206a & 2) != 0;
        Objects.requireNonNull(fdVar);
        C83160bz bzVar = new C83160bz(fdVar);
        Objects.requireNonNull(faVar);
        C83080bg.m132478b(z2, bzVar, new C83162ca(faVar));
        if ((fdVar.f226206a & 4) == 0) {
            z = false;
        }
        Objects.requireNonNull(fdVar);
        C83163cb cbVar = new C83163cb(fdVar);
        Objects.requireNonNull(faVar);
        C83080bg.m132478b(z, cbVar, new C83164cc(faVar));
        C82915fd fdVar2 = (C82915fd) faVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar2 = (C82885ea) dzVar.instance;
        fdVar2.getClass();
        eaVar2.f225980b = fdVar2;
        eaVar2.f225979a = 37;
    }
}
