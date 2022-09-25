package com.google.android.apps.gsa.staticplugins.smartspace.widget;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.widget.g */
/* compiled from: PG */
final class C117449g extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C117450h f325995a;

    /* renamed from: b */
    private final RemoteViews f325996b;

    /* renamed from: c */
    private final int f325997c;

    /* renamed from: d */
    private final String f325998d;

    /* renamed from: e */
    private final SettableFuture f325999e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117449g(C117450h hVar, RemoteViews remoteViews, int i, String str, SettableFuture settableFuture) {
        super("SSWidgetRndr");
        this.f325995a = hVar;
        this.f325996b = remoteViews;
        this.f325997c = i;
        this.f325998d = str;
        this.f325999e = settableFuture;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (drawable != null) {
            this.f325996b.setImageViewBitmap(this.f325997c, ((BitmapDrawable) drawable).getBitmap());
            C117450h.m195198j(this.f325996b, this.f325997c, this.f325998d);
        }
        this.f325995a.mo103308i(this.f325996b);
        this.f325999e.mo57356n(C118826c.f331422a);
    }
}
