package org.chromium.weblayer;

import android.graphics.Bitmap;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47727d;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47728e;
import org.chromium.p5643b.p5644a.C72362u;

/* renamed from: org.chromium.weblayer.x */
/* compiled from: PG */
final class C72635x extends C72362u {

    /* renamed from: a */
    final /* synthetic */ C72636y f193207a;

    public C72635x(C72636y yVar) {
        this.f193207a = yVar;
    }

    /* renamed from: a */
    public final void mo63822a(Bitmap bitmap) {
        C72634w wVar = this.f193207a.f193208a;
        if (C47831fm.m85027v()) {
            C47558bi a = C47831fm.m85006a("onFaviconChanged");
            try {
                ((C47728e) wVar).f123696a.mo47200a(bitmap);
                a.close();
                return;
            } catch (Throwable th) {
                C47727d.m84878a(th, th);
            }
        } else {
            C47538ax c = ((C47728e) wVar).f123697b.f123698a.mo51613c("onFaviconChanged");
            try {
                ((C47728e) wVar).f123696a.mo47200a(bitmap);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                C47727d.m84878a(th, th2);
            }
        }
        throw th;
        throw th;
    }
}
