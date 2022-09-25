package com.google.android.apps.search.googleapp.searchwidget.p10478b;

import android.content.Context;
import android.widget.RemoteViews;
import com.google.android.apps.search.googleapp.searchwidget.C138926b;
import com.google.android.apps.search.googleapp.searchwidget.p10477a.C138924a;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139072ax;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139080be;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.b.b */
/* compiled from: PG */
public final class C138928b {

    /* renamed from: a */
    public final Context f377867a;

    /* renamed from: b */
    public final Boolean f377868b;

    /* renamed from: c */
    public final C138926b f377869c;

    /* renamed from: d */
    private final C138924a f377870d;

    /* renamed from: e */
    private final C60887da f377871e;

    /* renamed from: f */
    private final C42876ab f377872f;

    public C138928b(Context context, C138924a aVar, C42876ab abVar, Boolean bool, C60887da daVar, C138926b bVar) {
        this.f377867a = context;
        this.f377870d = aVar;
        this.f377872f = abVar;
        this.f377868b = bool;
        this.f377871e = daVar;
        this.f377869c = bVar;
    }

    /* renamed from: b */
    public static boolean m225761b(C139080be beVar, boolean z) {
        int a = C139072ax.m225890a(beVar.f378254e);
        return a != 0 && a == 3 && z;
    }

    /* renamed from: a */
    public final C60870cx mo114638a(RemoteViews remoteViews, boolean z) {
        C60870cx b = this.f377870d.mo103996b();
        C60870cx d = this.f377872f.mo46042d();
        return C47638k.m84753d(b, d).mo51520a(new C138927a(this, b, d, remoteViews, z), this.f377871e);
    }
}
