package com.google.android.libraries.web.webview.p3472b.p3473a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.web.coordinator.internal.fragment.C43751j;
import com.google.android.libraries.web.p3343a.C43226b;
import com.google.android.libraries.web.p3343a.C43228d;
import com.google.android.libraries.web.p3343a.p3344a.C43223c;
import com.google.android.libraries.web.webview.p3491j.C44454f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.web.webview.b.a.d */
/* compiled from: PG */
public final class C44346d implements C43223c {

    /* renamed from: a */
    private final C44348f f115327a;

    public C44346d(C44348f fVar) {
        this.f115327a = fVar;
    }

    /* renamed from: b */
    public static C60870cx m78296b(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            return C60856cj.m92900i(createBitmap);
        } catch (Error | Exception e) {
            return C60856cj.m92899h(new C43226b(e));
        }
    }

    /* renamed from: a */
    public final C60870cx mo46276a() {
        C44454f fVar;
        try {
            Fragment a = C43751j.m77264a(this.f115327a.f115329a).mo46774a();
            if (a == null) {
                fVar = null;
            } else {
                fVar = C44348f.m78298a(a);
            }
            if (fVar == null) {
                return C60856cj.m92899h(new C43226b("View is not created yet."));
            }
            return m78296b(fVar);
        } catch (IllegalStateException unused) {
            return C60856cj.m92899h(new C43228d("WebFragment is destroyed or not attached yet."));
        }
    }
}
