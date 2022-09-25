package com.google.apps.tiktok.dataservice;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3315b.C42824aj;
import com.google.android.libraries.storage.p3315b.C42826al;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.q */
/* compiled from: PG */
public final class C46877q {

    /* renamed from: a */
    public final C46761ce f122310a;

    /* renamed from: b */
    public final Context f122311b;

    /* renamed from: c */
    public final C46778cv f122312c;

    /* renamed from: d */
    public final C21370a f122313d;

    /* renamed from: e */
    public final C47770dh f122314e;

    /* renamed from: f */
    public final Executor f122315f;

    /* renamed from: g */
    private final C60887da f122316g;

    public C46877q(C46761ce ceVar, Context context, C46778cv cvVar, C60887da daVar, C21370a aVar, C47770dh dhVar, Executor executor) {
        this.f122310a = ceVar;
        this.f122311b = context;
        this.f122312c = cvVar;
        this.f122316g = daVar;
        this.f122313d = aVar;
        this.f122314e = dhVar;
        this.f122315f = executor;
    }

    /* renamed from: h */
    private final C46463o m83503h(C42826al alVar) {
        alVar.mo45911f(this.f122316g);
        return new C46463o(C60817ay.m92816d(alVar, C60826bg.f164896a));
    }

    /* renamed from: c */
    public final C46689ag mo50873c(Uri uri, String[] strArr, Bundle bundle, C58817ah ahVar, Executor executor) {
        return new C46704av(new C46874n(this, uri, strArr, bundle), new C46812e(ahVar), executor);
    }

    /* renamed from: d */
    public final C60870cx mo50874d(C46875o oVar) {
        return C60856cj.m92904m(C47810es.m84978r(new C46821j(this, oVar)), this.f122316g);
    }

    /* renamed from: e */
    public final void mo50875e(Uri uri, boolean z, C46783d dVar) {
        this.f122311b.getContentResolver().registerContentObserver(uri, z, dVar);
    }

    /* renamed from: f */
    public final void mo50876f(C46783d dVar) {
        this.f122311b.getContentResolver().unregisterContentObserver(dVar);
    }

    /* renamed from: g */
    public final C60870cx mo50877g(Uri uri) {
        return mo50874d(new C46817f(uri));
    }

    /* renamed from: a */
    public final C46463o mo50871a(Uri uri, String[] strArr, Bundle bundle) {
        uri.getClass();
        C46822k kVar = new C46822k(this, uri, strArr, bundle);
        int i = C42826al.f112106a;
        return m83503h(new C42824aj(kVar));
    }

    /* renamed from: b */
    public final C46463o mo50872b(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        strArr.getClass();
        uri.getClass();
        C46823l lVar = new C46823l(this, uri, strArr, str, strArr2, str2);
        int i = C42826al.f112106a;
        return m83503h(new C42824aj(lVar));
    }
}
