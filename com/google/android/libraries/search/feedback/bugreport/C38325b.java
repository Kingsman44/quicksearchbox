package com.google.android.libraries.search.feedback.bugreport;

import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46674l;
import com.google.apps.tiktok.p3633d.p3634a.C46676n;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.feedback.bugreport.b */
/* compiled from: PG */
public final /* synthetic */ class C38325b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46674l f101500a;

    public /* synthetic */ C38325b(C46674l lVar) {
        this.f101500a = lVar;
    }

    public final C60870cx apply(Object obj) {
        C46676n e = C46677o.m83168e();
        e.mo50705e(2000, TimeUnit.MILLISECONDS);
        e.mo50695c(true);
        e.mo50694b(C58485gu.m89847o(C46667e.TEXT, C46667e.KEY_VALUE));
        return this.f101500a.mo50704a(e.mo50693a(), (Map) obj, C58729pv.f156485a);
    }
}
