package androidx.media;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* renamed from: androidx.media.t */
/* compiled from: PG */
class C2443t extends C2440q {
    public C2443t(C2444u uVar, Context context) {
        super(uVar, context);
    }

    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C2416an.m6441f(new C2442s(str, new C2403aa(result)));
    }
}
