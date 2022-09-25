package com.google.android.apps.gsa.search.core.webview;

import android.content.Context;
import android.webkit.GeolocationPermissions;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.search.core.webview.s */
/* compiled from: PG */
public final class C87273s {

    /* renamed from: a */
    public static final C59071e f235725a = C59071e.m91332i("com.google.android.apps.gsa.search.core.webview.s");

    /* renamed from: b */
    public final Context f235726b;

    /* renamed from: c */
    public final C85881bd f235727c;

    /* renamed from: d */
    public GeolocationPermissions.Callback f235728d;

    /* renamed from: e */
    private final C60887da f235729e;

    /* renamed from: f */
    private final C60887da f235730f;

    /* renamed from: g */
    private final C60887da f235731g;

    /* renamed from: h */
    private final C86034c f235732h;

    public C87273s(C60887da daVar, C60887da daVar2, C60887da daVar3, Context context, C86034c cVar, C85881bd bdVar) {
        this.f235729e = daVar;
        this.f235730f = daVar2;
        this.f235731g = daVar3;
        this.f235726b = context;
        this.f235732h = cVar;
        this.f235727c = bdVar;
    }

    /* renamed from: a */
    public final void mo80919a(String str, boolean z) {
        GeolocationPermissions.Callback callback = this.f235728d;
        this.f235728d = null;
        if (callback != null) {
            callback.invoke(str, z, false);
        }
    }

    /* renamed from: b */
    public final void mo80920b(String str, GeolocationPermissions.Callback callback) {
        this.f235728d = callback;
        C60870cx h = C60922j.m93045h(this.f235732h.mo79697b(), new C87270p(this), this.f235729e);
        C60870cx b = this.f235730f.mo19399b(new C87271q(this));
        C60856cj.m92893b(h, b).mo57334a(new C87272r(this, h, b, str), this.f235731g);
    }
}
