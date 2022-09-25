package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26750b;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26783ah;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26784ai;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26808s;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.t */
/* compiled from: PG */
final class C26877t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C26878u f73207a;

    /* renamed from: b */
    private final C28097c f73208b;

    public C26877t(C26878u uVar, C28097c cVar) {
        this.f73207a = uVar;
        this.f73208b = cVar;
    }

    public final void run() {
        this.f73207a.f73261w.mo32219a("capture/bitmap");
        Bitmap createBitmap = Bitmap.createBitmap(this.f73207a.f73257s.getWidth(), this.f73207a.f73257s.getHeight(), Bitmap.Config.ARGB_8888);
        this.f73207a.f73225N.rewind();
        createBitmap.copyPixelsFromBuffer(this.f73207a.f73225N);
        this.f73207a.f73223L = false;
        C26750b bVar = this.f73208b.f76490h;
        bVar.getClass();
        if (bVar.mo32086g()) {
            C47538ax c = this.f73207a.f73231T.mo51613c("capture");
            try {
                C26783ah ahVar = this.f73207a.f73237Z;
                C28097c cVar = this.f73208b;
                C26784ai aiVar = ahVar.f72970a;
                RectF rectF = (RectF) aiVar.f73023o.get();
                C58838bb.m90866a(rectF, "Prefetch requested before user visible region set");
                C26784ai.m49585w(aiVar.f73011c, new C26808s(aiVar, createBitmap, cVar, rectF));
                if (c != null) {
                    c.close();
                }
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        this.f73207a.f73261w.mo32220b();
        return;
        throw th;
    }
}
