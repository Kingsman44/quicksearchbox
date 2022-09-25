package androidx.media;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: androidx.media.w */
/* compiled from: PG */
final class C2446w extends C2443t {

    /* renamed from: b */
    final /* synthetic */ C2447x f6739b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2446w(C2447x xVar, Context context) {
        super(xVar, context);
        this.f6739b = xVar;
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        MediaSessionCompat.m652b(bundle);
        C2447x xVar = this.f6739b;
        xVar.f6740e.mo5833e(str, new C2445v(str, new C2403aa(result), bundle));
    }
}
