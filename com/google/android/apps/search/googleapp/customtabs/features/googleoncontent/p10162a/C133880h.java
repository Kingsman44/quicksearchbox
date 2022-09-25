package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.p8867w.p8879i.C118803d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3604b.C46064e;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.a.h */
/* compiled from: PG */
public final class C133880h {

    /* renamed from: a */
    public static final C59071e f364642a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.a.h");

    /* renamed from: b */
    public final Context f364643b;

    /* renamed from: c */
    public final C47449e f364644c;

    /* renamed from: d */
    public final C46064e f364645d;

    /* renamed from: e */
    public final AccountId f364646e;

    /* renamed from: f */
    public final C60887da f364647f;

    /* renamed from: g */
    public final long f364648g;

    /* renamed from: h */
    public final long f364649h;

    /* renamed from: i */
    public final C118803d f364650i;

    public C133880h(Context context, C47449e eVar, C46064e eVar2, AccountId accountId, C118803d dVar, C60887da daVar, long j, long j2) {
        this.f364643b = context;
        this.f364644c = eVar;
        this.f364645d = eVar2;
        this.f364646e = accountId;
        this.f364650i = dVar;
        this.f364647f = daVar;
        this.f364648g = j;
        this.f364649h = j2;
    }

    /* renamed from: a */
    public static void m217160a(RemoteViews remoteViews, int i, Optional optional) {
        if (optional.isPresent()) {
            remoteViews.setImageViewBitmap(i, (Bitmap) optional.get());
            remoteViews.setViewVisibility(i, 0);
        }
    }
}
