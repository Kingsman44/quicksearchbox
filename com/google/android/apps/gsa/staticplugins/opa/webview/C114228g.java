package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.search.core.C85676c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.g */
/* compiled from: PG */
final class C114228g extends C85676c {

    /* renamed from: e */
    public static final C59071e f316744e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.webview.g");

    /* renamed from: f */
    public final OpaWebView f316745f;

    /* renamed from: g */
    private final C22871g f316746g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C114228g(com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView r18, com.google.android.apps.gsa.p8852u.C118575h r19, com.google.android.apps.gsa.search.core.service.C86610af r20, com.google.android.libraries.gsa.p1876k.C22871g r21, com.google.android.libraries.gsa.p1876k.C22871g r22, android.content.Context r23, com.google.android.apps.gsa.search.core.google.C85923cq r24, dagger.C68214a r25, dagger.C68214a r26, dagger.C68214a r27, dagger.C68214a r28, com.google.android.libraries.p1730f.C21370a r29, com.google.android.apps.gsa.p8885y.C118827a r30, com.google.android.apps.gsa.shared.util.p7184t.C91097g r31, com.google.android.apps.gsa.search.core.p6805i.C86124t r32) {
        /*
            r17 = this;
            r15 = r17
            r14 = r18
            r13 = r22
            com.google.android.apps.gsa.search.core.webview.v r2 = new com.google.android.apps.gsa.search.core.webview.v
            r6 = r24
            r2.<init>(r6)
            com.google.android.apps.gsa.staticplugins.opa.webview.c r3 = new com.google.android.apps.gsa.staticplugins.opa.webview.c
            r0 = r20
            r1 = r21
            r3.<init>(r1, r0)
            android.content.pm.PackageManager r5 = r23.getPackageManager()
            com.google.android.apps.gsa.staticplugins.opa.webview.f r12 = new com.google.android.apps.gsa.staticplugins.opa.webview.f
            r11 = r31
            r0 = r32
            r12.<init>(r11, r14, r13, r0)
            r0 = r17
            r1 = r19
            r4 = r23
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r16 = r12
            r12 = r30
            r13 = r31
            r14 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r18
            r15.f316745f = r0
            r0 = r22
            r15.f316746g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.webview.C114228g.<init>(com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView, com.google.android.apps.gsa.u.h, com.google.android.apps.gsa.search.core.service.af, com.google.android.libraries.gsa.k.g, com.google.android.libraries.gsa.k.g, android.content.Context, com.google.android.apps.gsa.search.core.google.cq, dagger.a, dagger.a, dagger.a, dagger.a, com.google.android.libraries.f.a, com.google.android.apps.gsa.y.a, com.google.android.apps.gsa.shared.util.t.g, com.google.android.apps.gsa.search.core.i.t):void");
    }

    @JavascriptInterface
    public int getHeaderPaddingHeight() {
        mo79206a(C118569b.JS_EXT_GET_HEADER_PADDING_HEIGHT_CALL_COUNT);
        return this.f316745f.f316493b;
    }

    @JavascriptInterface
    public void setNativeUiState(int i, int i2) {
        mo79206a(C118569b.JS_EXT_SET_NATIVE_UI_STATE_CALL_COUNT);
        this.f316746g.mo28212l("setNativeUiState", new C114212b(this, i, i2));
    }
}
