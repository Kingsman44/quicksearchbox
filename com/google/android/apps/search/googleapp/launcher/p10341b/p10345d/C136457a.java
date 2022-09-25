package com.google.android.apps.search.googleapp.launcher.p10341b.p10345d;

import com.google.android.apps.search.googleapp.launcher.p10341b.C136443b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.p10346a.C136458a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.p10346a.C136459b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.d.a */
/* compiled from: PG */
public final /* synthetic */ class C136457a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136460b f371511a;

    /* renamed from: b */
    public final /* synthetic */ int f371512b;

    /* renamed from: c */
    public final /* synthetic */ int f371513c;

    /* renamed from: d */
    public final /* synthetic */ C136443b f371514d;

    public /* synthetic */ C136457a(C136460b bVar, int i, int i2, C136443b bVar2) {
        this.f371511a = bVar;
        this.f371512b = i;
        this.f371513c = i2;
        this.f371514d = bVar2;
    }

    public final Object apply(Object obj) {
        C136460b bVar = this.f371511a;
        int i = this.f371512b;
        int i2 = this.f371513c;
        C136443b bVar2 = this.f371514d;
        C136458a aVar = (C136458a) ((C136459b) obj).toBuilder();
        aVar.copyOnWrite();
        C136459b bVar3 = (C136459b) aVar.instance;
        bVar3.f371517a |= 2;
        bVar3.f371519c = i;
        aVar.copyOnWrite();
        C136459b bVar4 = (C136459b) aVar.instance;
        bVar4.f371517a |= 4;
        bVar4.f371520d = i2;
        boolean e = bVar2.mo113044e();
        aVar.copyOnWrite();
        C136459b bVar5 = (C136459b) aVar.instance;
        bVar5.f371517a |= 8;
        bVar5.f371521e = e;
        boolean h = bVar2.mo113047h();
        aVar.copyOnWrite();
        C136459b bVar6 = (C136459b) aVar.instance;
        bVar6.f371517a |= 16;
        bVar6.f371522f = h;
        boolean f = bVar2.mo113045f();
        aVar.copyOnWrite();
        C136459b bVar7 = (C136459b) aVar.instance;
        bVar7.f371517a |= 32;
        bVar7.f371523g = f;
        boolean i3 = bVar2.mo113048i();
        aVar.copyOnWrite();
        C136459b bVar8 = (C136459b) aVar.instance;
        bVar8.f371517a |= 64;
        bVar8.f371524h = i3;
        boolean d = bVar2.mo113043d();
        aVar.copyOnWrite();
        C136459b bVar9 = (C136459b) aVar.instance;
        bVar9.f371517a |= 128;
        bVar9.f371525i = d;
        long b = bVar.f371527b.mo26870b();
        aVar.copyOnWrite();
        C136459b bVar10 = (C136459b) aVar.instance;
        bVar10.f371517a |= 1;
        bVar10.f371518b = b;
        return (C136459b) aVar.build();
    }
}
