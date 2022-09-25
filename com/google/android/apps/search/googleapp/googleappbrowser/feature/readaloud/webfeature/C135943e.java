package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.webfeature;

import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63033ey;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.webfeature.e */
/* compiled from: PG */
final class C135943e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f370243a;

    /* renamed from: b */
    final /* synthetic */ C135944f f370244b;

    public C135943e(C135944f fVar, String str) {
        this.f370244b = fVar;
        this.f370243a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C135944f.f370245a.mo56226d()).mo56382g(th)).mo56372aa(40639)).mo56386p("Error reading from cache.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || !this.f370244b.f370250f.mo112621a(((C46370ah) axVar.mo56107c()).f121385b)) {
            C60870cx f = this.f370244b.f370247c.mo50346f(C63033ey.m95859a(this.f370243a), this.f370244b.f370246b.mo112624a(this.f370243a));
            C135942d dVar = new C135942d();
            C60856cj.m92911t(f, C47810es.m84974n(dVar), C60826bg.f164896a);
        }
    }
}
