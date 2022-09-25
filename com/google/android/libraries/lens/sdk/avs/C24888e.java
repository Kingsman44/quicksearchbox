package com.google.android.libraries.lens.sdk.avs;

import android.util.Size;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.sdk.avs.e */
/* compiled from: PG */
final class C24888e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24876k f67974a;

    /* renamed from: b */
    final /* synthetic */ Size f67975b;

    /* renamed from: c */
    final /* synthetic */ C24890g f67976c;

    public C24888e(C24890g gVar, C24876k kVar, Size size) {
        this.f67976c = gVar;
        this.f67974a = kVar;
        this.f67975b = size;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C24890g.f67980a.mo56226d()).mo56382g(th)).mo56372aa(48861)).mo56386p("Engine processing failed");
        this.f67976c.f67982c.f67907e.mo57061a(12);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24890g gVar = this.f67976c;
        C24876k kVar = this.f67974a;
        Size size = this.f67975b;
        C24286d f = ((C24288f) obj).mo29838f();
        f.getClass();
        C60870cx a = f.mo29848a();
        C24889f fVar = new C24889f(gVar, size, kVar);
        C60856cj.m92911t(a, C47810es.m84974n(fVar), C60826bg.f164896a);
    }
}
