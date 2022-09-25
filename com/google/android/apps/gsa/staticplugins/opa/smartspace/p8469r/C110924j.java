package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.j */
/* compiled from: PG */
final class C110924j extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C110925k f308993a;

    /* renamed from: b */
    private final RemoteViews f308994b;

    /* renamed from: c */
    private final int f308995c;

    /* renamed from: d */
    private final String f308996d;

    /* renamed from: e */
    private final SettableFuture f308997e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110924j(C110925k kVar, RemoteViews remoteViews, int i, String str, SettableFuture settableFuture) {
        super("AmbientWidgetRndr");
        this.f308993a = kVar;
        this.f308994b = remoteViews;
        this.f308995c = i;
        this.f308996d = str;
        this.f308997e = settableFuture;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            this.f308994b.setImageViewBitmap(this.f308995c, ((BitmapDrawable) drawable).getBitmap());
            C110925k.m184667g(this.f308994b, this.f308995c, this.f308996d);
        }
        this.f308993a.mo98938f(this.f308994b);
        this.f308997e.mo57356n(C118826c.f331422a);
    }
}
