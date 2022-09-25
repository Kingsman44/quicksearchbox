package com.google.android.apps.search.googleapp.customtabs.p10155e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.p8867w.p8879i.C118797a;
import com.google.android.apps.gsa.p8867w.p8879i.C118803d;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.C133827d;
import com.google.android.apps.search.googleapp.customtabs.features.p10161c.C133871c;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133678ac;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133749j;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p5124m.p5125a.C65599b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.e.l */
/* compiled from: PG */
public final class C133769l {

    /* renamed from: a */
    public static final C59071e f364346a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.e.l");

    /* renamed from: b */
    public final C133871c f364347b;

    /* renamed from: c */
    public final C133827d f364348c;

    /* renamed from: d */
    public final C133749j f364349d;

    /* renamed from: e */
    public final C133678ac f364350e;

    /* renamed from: f */
    public final PendingIntent f364351f;

    /* renamed from: g */
    public final Context f364352g;

    /* renamed from: h */
    public final AccountId f364353h;

    /* renamed from: i */
    public final C46128f f364354i;

    /* renamed from: j */
    public final PackageManager f364355j;

    /* renamed from: k */
    public final C60888db f364356k;

    /* renamed from: l */
    public final C46180e f364357l;

    /* renamed from: m */
    public final boolean f364358m;

    /* renamed from: n */
    public final boolean f364359n;

    /* renamed from: o */
    public final boolean f364360o;

    /* renamed from: p */
    public final boolean f364361p;

    /* renamed from: q */
    public final C65599b f364362q;

    /* renamed from: r */
    public final long f364363r;

    /* renamed from: s */
    public final long f364364s;

    /* renamed from: t */
    public final Duration f364365t;

    /* renamed from: u */
    public final C118803d f364366u;

    /* renamed from: v */
    public final C118797a f364367v;

    public C133769l(C133871c cVar, C133827d dVar, C133749j jVar, C133678ac acVar, Context context, AccountId accountId, C46128f fVar, C118803d dVar2, C118797a aVar, PackageManager packageManager, C46180e eVar, C60888db dbVar, boolean z, boolean z2, boolean z3, C65599b bVar, long j, boolean z4, long j2, C62910ar arVar) {
        this.f364347b = cVar;
        this.f364348c = dVar;
        this.f364349d = jVar;
        this.f364350e = acVar;
        this.f364352g = context;
        this.f364353h = accountId;
        this.f364354i = fVar;
        this.f364366u = dVar2;
        this.f364367v = aVar;
        this.f364356k = dbVar;
        this.f364355j = packageManager;
        this.f364357l = eVar;
        this.f364359n = z;
        this.f364360o = z2;
        this.f364361p = z3;
        this.f364362q = bVar;
        this.f364363r = j;
        this.f364358m = z4;
        this.f364364s = j2;
        this.f364365t = C62950b.m95473d(arVar);
        Intent intent = new Intent();
        intent.setClassName("com.google.android.googlequicksearchbox", e.b());
        PendingIntent activity = PendingIntent.getActivity(context, 0, C147798a.m240896b(intent, 201326592, 0), 201326592);
        C58893dc.m90996a(activity);
        this.f364351f = activity;
    }
}
