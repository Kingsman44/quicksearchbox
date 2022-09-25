package com.google.android.apps.search.assistant.surfaces.onboarding.web;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.web.l */
/* compiled from: PG */
final class C126751l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f349056a;

    /* renamed from: b */
    final /* synthetic */ C126752m f349057b;

    public C126751l(C126752m mVar, String str) {
        this.f349057b = mVar;
        this.f349056a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C126752m.f349058a.mo56226d()).mo56382g(th)).mo56372aa(37132)).mo56386p("Failed to update the tooltip proto data.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Integer num = (Integer) obj;
        ((C59052c) ((C59052c) C126752m.f349058a.mo56224b()).mo56372aa(37133)).mo56389s("seen count %d", num);
        this.f349057b.f349059b.mo40293a(this.f349056a, num.intValue() + 1);
    }
}
