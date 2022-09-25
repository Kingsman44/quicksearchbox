package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7499a;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7492j.C95473c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60094kn;
import com.google.common.p4552o.C60096kp;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.a.c */
/* compiled from: PG */
public final class C95507c {

    /* renamed from: a */
    public static final C59071e f267247a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.a.c");

    /* renamed from: b */
    public static final Long f267248b = Long.valueOf(TimeUnit.DAYS.toMillis(1));

    /* renamed from: c */
    public final C21370a f267249c;

    /* renamed from: d */
    public final C95473c f267250d;

    /* renamed from: e */
    public final C22871g f267251e;

    /* renamed from: f */
    public final Context f267252f;

    /* renamed from: g */
    public final NotificationManager f267253g;

    /* renamed from: h */
    public C95506b f267254h;

    /* renamed from: i */
    private final C95307m f267255i;

    public C95507c(Context context, C21370a aVar, C95473c cVar, C22871g gVar, C95307m mVar) {
        this.f267249c = aVar;
        this.f267251e = gVar;
        this.f267250d = cVar;
        this.f267252f = context;
        this.f267255i = mVar;
        this.f267253g = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public final PendingIntent mo89397a(Intent intent, int i) {
        intent.setPackage(this.f267252f.getPackageName());
        return PendingIntent.getBroadcast(this.f267252f, i, intent, 201326592);
    }

    /* renamed from: b */
    public final void mo89398b(int i) {
        C60094kn knVar = (C60094kn) C60096kp.f162493d.createBuilder();
        knVar.copyOnWrite();
        C60096kp kpVar = (C60096kp) knVar.instance;
        kpVar.f162497c = 3;
        kpVar.f162495a |= 2;
        knVar.copyOnWrite();
        C60096kp kpVar2 = (C60096kp) knVar.instance;
        kpVar2.f162496b = i - 1;
        kpVar2.f162495a |= 1;
        C60096kp kpVar3 = (C60096kp) knVar.build();
        C95307m mVar = this.f267255i;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        kpVar3.getClass();
        nmVar.f163171y = kpVar3;
        nmVar.f163148b |= 128;
        mVar.mo83545c(nkVar);
    }
}
