package com.google.android.libraries.search.silk.p3162a.p3173k;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.lens.sdk.C62647m;
import com.google.lens.sdk.LensApi;

/* renamed from: com.google.android.libraries.search.silk.a.k.b */
/* compiled from: PG */
public final /* synthetic */ class C40607b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C40618m f106571a;

    /* renamed from: b */
    public final /* synthetic */ C62647m f106572b;

    /* renamed from: c */
    public final /* synthetic */ LensApi f106573c;

    public /* synthetic */ C40607b(C40618m mVar, C62647m mVar2, LensApi lensApi) {
        this.f106571a = mVar;
        this.f106572b = mVar2;
        this.f106573c = lensApi;
    }

    public final C60870cx apply(Object obj) {
        C40618m mVar = this.f106571a;
        C62647m mVar2 = this.f106572b;
        LensApi lensApi = this.f106573c;
        if (((Integer) obj).intValue() == 0) {
            C60870cx a = C2169h.m6027a(new C40608c(mVar, mVar2));
            C60931s f = C47810es.m84966f(new C40614i(mVar));
            return C60922j.m93045h(a, C47810es.m84966f(f), mVar.f106589a);
        }
        lensApi.onPause();
        throw new C41742a(C41749b.m73223b("Failed to start Lens. Lens is not available."));
    }
}
