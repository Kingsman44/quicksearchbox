package com.google.android.libraries.web.contrib.p3367d.p3368a.p3369a;

import com.google.android.libraries.web.contrib.p3367d.p3368a.C43462a;
import com.google.android.libraries.web.contrib.p3367d.p3368a.C43465b;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.libraries.web.contrib.d.a.a.b */
/* compiled from: PG */
public final class C43464b {

    /* renamed from: a */
    public final C46723bg f113536a;

    /* renamed from: b */
    public final C44080d f113537b;

    /* renamed from: c */
    public final C46778cv f113538c;

    public C43464b(C46723bg bgVar, C46778cv cvVar, C44078b bVar) {
        this.f113536a = bgVar;
        this.f113537b = bVar.mo47044a(C44082a.f114755a, "WebX_FindInPageState", C43465b.f113539h);
        this.f113538c = cvVar;
    }

    /* renamed from: a */
    public final String mo46532a() {
        return ((C43465b) this.f113537b.mo47045a()).f113546f;
    }

    /* renamed from: b */
    public final void mo46533b() {
        this.f113537b.mo47046b(C43465b.f113539h);
        this.f113538c.mo50787a(C60866ct.f164955a, "WebX_FindInPageState");
    }

    /* renamed from: c */
    public final boolean mo46534c() {
        return ((C43465b) this.f113537b.mo47045a()).f113547g;
    }

    /* renamed from: d */
    public final void mo46535d(int i, int i2, boolean z) {
        C43465b bVar = (C43465b) this.f113537b.mo47045a();
        C43462a aVar = (C43462a) bVar.toBuilder();
        aVar.copyOnWrite();
        C43465b bVar2 = (C43465b) aVar.instance;
        bVar2.f113541a |= 1;
        bVar2.f113542b = i;
        aVar.copyOnWrite();
        C43465b bVar3 = (C43465b) aVar.instance;
        bVar3.f113541a |= 2;
        bVar3.f113543c = i2;
        aVar.copyOnWrite();
        C43465b bVar4 = (C43465b) aVar.instance;
        bVar4.f113541a |= 4;
        bVar4.f113544d = true;
        aVar.copyOnWrite();
        C43465b bVar5 = (C43465b) aVar.instance;
        bVar5.f113541a |= 8;
        bVar5.f113545e = z;
        C43465b bVar6 = (C43465b) aVar.build();
        if (!bVar6.equals(bVar)) {
            this.f113537b.mo47046b(bVar6);
            this.f113538c.mo50787a(C60866ct.f164955a, "WebX_FindInPageState");
        }
    }
}
