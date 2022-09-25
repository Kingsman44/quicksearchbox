package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83315ij;
import com.google.android.apps.gsa.nga.shared.p6407v.C83317il;
import com.google.android.apps.gsa.nga.shared.p6407v.C83318im;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.an */
/* compiled from: PG */
public final /* synthetic */ class C82212an implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C82215aq f224684a;

    /* renamed from: b */
    public final /* synthetic */ int f224685b;

    /* renamed from: c */
    public final /* synthetic */ int f224686c;

    /* renamed from: d */
    public final /* synthetic */ int f224687d;

    public /* synthetic */ C82212an(C82215aq aqVar, int i, int i2, int i3) {
        this.f224684a = aqVar;
        this.f224685b = i;
        this.f224686c = i2;
        this.f224687d = i3;
    }

    public final void run() {
        C82215aq aqVar = this.f224684a;
        int i = this.f224685b;
        int i2 = this.f224686c;
        int i3 = this.f224687d;
        C83334w wVar = aqVar.f224694a;
        C82887ec ecVar = C82887ec.TRIGGERING;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C83315ij ijVar = (C83315ij) C83318im.f227126e.createBuilder();
        int a = C83317il.m132618a(i);
        ijVar.copyOnWrite();
        C83318im imVar = (C83318im) ijVar.instance;
        int i4 = a - 1;
        if (a != 0) {
            imVar.f227129b = i4;
            imVar.f227128a |= 1;
            e a2 = e.a(i2);
            ijVar.copyOnWrite();
            C83318im imVar2 = (C83318im) ijVar.instance;
            imVar2.f227130c = a2.ca;
            imVar2.f227128a |= 2;
            C83318im imVar3 = (C83318im) ijVar.build();
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            imVar3.getClass();
            eaVar.f225980b = imVar3;
            eaVar.f225979a = 104;
            wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
            aqVar.mo75558e(i, i2, i3);
            return;
        }
        throw null;
    }
}
