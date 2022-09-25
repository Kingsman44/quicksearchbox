package com.google.android.apps.gsa.shared.p6983ah;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.shared.ah.d */
/* compiled from: PG */
public final /* synthetic */ class C89147d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C89150g f241675a;

    /* renamed from: b */
    public final /* synthetic */ boolean f241676b;

    /* renamed from: c */
    public final /* synthetic */ long f241677c;

    public /* synthetic */ C89147d(C89150g gVar, boolean z, long j) {
        this.f241675a = gVar;
        this.f241676b = z;
        this.f241677c = j;
    }

    public final void run() {
        C89150g gVar = this.f241675a;
        boolean z = this.f241676b;
        long j = this.f241677c;
        C89151h hVar = (C89151h) C89154k.f241700e.createBuilder();
        hVar.copyOnWrite();
        C89154k kVar = (C89154k) hVar.instance;
        kVar.f241704c = 2;
        kVar.f241702a = 2 | kVar.f241702a;
        hVar.copyOnWrite();
        C89154k kVar2 = (C89154k) hVar.instance;
        kVar2.f241702a |= 4;
        kVar2.f241705d = z;
        hVar.copyOnWrite();
        C89154k kVar3 = (C89154k) hVar.instance;
        kVar3.f241702a |= 1;
        kVar3.f241703b = j;
        gVar.f241690f = (C89154k) hVar.build();
        gVar.f241688d.mo5708l(gVar.f241690f);
    }
}
