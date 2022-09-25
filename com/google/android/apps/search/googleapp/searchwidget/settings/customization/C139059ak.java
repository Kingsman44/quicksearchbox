package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47770dh;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.ak */
/* compiled from: PG */
public final class C139059ak {

    /* renamed from: a */
    public final C139057ai f378204a;

    /* renamed from: b */
    public final C28306ab f378205b;

    /* renamed from: c */
    public final C47770dh f378206c;

    /* renamed from: d */
    public final C47400m f378207d;

    /* renamed from: e */
    public final C139045c f378208e;

    /* renamed from: f */
    public final C139093br f378209f;

    /* renamed from: g */
    public C139080be f378210g;

    public C139059ak(C139057ai aiVar, C28306ab abVar, C47770dh dhVar, C47400m mVar, C139045c cVar, C139093br brVar, C139080be beVar) {
        this.f378204a = aiVar;
        this.f378205b = abVar;
        this.f378206c = dhVar;
        this.f378207d = mVar;
        this.f378208e = cVar;
        this.f378209f = brVar;
        this.f378210g = beVar;
    }

    /* renamed from: a */
    public static int m225878a(int i) {
        if (i < 102) {
            return 102;
        }
        return i > 255 ? PrivateKeyType.INVALID : i;
    }
}
