package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.view.View;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.a */
/* compiled from: PG */
public final class C101806a extends C101836d {

    /* renamed from: a */
    public C101837e f283949a;

    /* renamed from: b */
    public String f283950b;

    /* renamed from: c */
    private View f283951c;

    /* renamed from: d */
    private String f283952d;

    /* renamed from: e */
    private boolean f283953e;

    /* renamed from: f */
    private C90584f f283954f;

    /* renamed from: g */
    private C58833ax f283955g = C58836b.f156633a;

    /* renamed from: h */
    private byte f283956h;

    /* renamed from: a */
    public final C101838f mo92585a() {
        View view;
        String str;
        C101837e eVar;
        C90584f fVar;
        String str2;
        if (this.f283956h == 1 && (view = this.f283951c) != null && (str = this.f283952d) != null && (eVar = this.f283949a) != null && (fVar = this.f283954f) != null && (str2 = this.f283950b) != null) {
            return new C101834b(view, str, this.f283953e, eVar, fVar, str2, this.f283955g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f283951c == null) {
            sb.append(" loadingIndicatorView");
        }
        if (this.f283952d == null) {
            sb.append(" accountName");
        }
        if (this.f283956h == 0) {
            sb.append(" isGoogleHomeEnrollment");
        }
        if (this.f283949a == null) {
            sb.append(" callback");
        }
        if (this.f283954f == null) {
            sb.append(" modelType");
        }
        if (this.f283950b == null) {
            sb.append(" locale");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92586b(String str) {
        if (str != null) {
            this.f283952d = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: c */
    public final void mo92587c(C58833ax axVar) {
        if (axVar != null) {
            this.f283955g = axVar;
            return;
        }
        throw new NullPointerException("Null impersonatedUser");
    }

    /* renamed from: d */
    public final void mo92588d(boolean z) {
        this.f283953e = z;
        this.f283956h = 1;
    }

    /* renamed from: e */
    public final void mo92589e(View view) {
        if (view != null) {
            this.f283951c = view;
            return;
        }
        throw new NullPointerException("Null loadingIndicatorView");
    }

    /* renamed from: f */
    public final void mo92590f(C90584f fVar) {
        if (fVar != null) {
            this.f283954f = fVar;
            return;
        }
        throw new NullPointerException("Null modelType");
    }
}
