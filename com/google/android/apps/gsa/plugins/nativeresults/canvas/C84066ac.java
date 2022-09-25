package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.search.shared.p6928f.C87550f;
import com.google.android.libraries.componentview.p1675a.p1676a.C19740a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.ac */
/* compiled from: PG */
final class C84066ac extends C87545a {

    /* renamed from: a */
    final /* synthetic */ C84067ad f228960a;

    /* renamed from: b */
    private final C19740a f228961b;

    public C84066ac(C84067ad adVar, C19740a aVar) {
        this.f228960a = adVar;
        this.f228961b = aVar;
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return this.f228961b.mo25099b();
    }

    /* renamed from: c */
    public final String mo25097c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo77517d(C87550f fVar) {
        C84154z zVar = this.f228960a.f228963a;
        String c = this.f228961b.mo25097c();
        if (!TextUtils.isEmpty(c)) {
            zVar.f229097a.mo54920x(c, fVar);
        }
    }

    /* renamed from: e */
    public final byte[] mo77518e() {
        return this.f228961b.mo25096d().toByteArray();
    }

    /* renamed from: kH */
    public final View mo25098kH() {
        return this.f228961b.mo25098kH();
    }
}
