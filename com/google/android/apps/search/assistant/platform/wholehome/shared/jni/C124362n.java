package com.google.android.apps.search.assistant.platform.wholehome.shared.jni;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124206v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.jni.n */
/* compiled from: PG */
final class C124362n implements C60845bz {

    /* renamed from: a */
    public final String f343270a;

    /* renamed from: b */
    final /* synthetic */ WholeHomeJniNative f343271b;

    public C124362n(WholeHomeJniNative wholeHomeJniNative, String str) {
        this.f343271b = wholeHomeJniNative;
        this.f343270a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f343271b.f343241b.execute(C47810es.m84977q(new C124361m(this, th)));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f343271b.f343241b.execute(C47810es.m84977q(new C124360l(this, (C124206v) obj)));
    }
}
