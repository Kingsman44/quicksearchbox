package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.p6452a.C83725a;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.g */
/* compiled from: PG */
public final class C110547g {

    /* renamed from: a */
    public static final long f308188a = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: b */
    public static final long f308189b = TimeUnit.MINUTES.toSeconds(30);

    /* renamed from: c */
    public static final long f308190c = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: d */
    public final C22871g f308191d;

    /* renamed from: e */
    public final C21370a f308192e;

    /* renamed from: f */
    public final C118561t f308193f;

    /* renamed from: g */
    public final C85299b f308194g;

    /* renamed from: h */
    public final C83725a f308195h;

    /* renamed from: i */
    public final C83794j f308196i;

    /* renamed from: j */
    public final C58974d f308197j;

    /* renamed from: k */
    public final Context f308198k;

    /* renamed from: l */
    public final C83793i f308199l;

    /* renamed from: m */
    public final C42876ab f308200m;

    public C110547g(C22871g gVar, C21370a aVar, C118561t tVar, C85299b bVar, C110560t tVar2, C83794j jVar, C83564a aVar2, Context context, C83793i iVar, C42876ab abVar) {
        this.f308191d = gVar;
        this.f308192e = aVar;
        this.f308193f = tVar;
        this.f308194g = bVar;
        this.f308195h = tVar2.mo98766a(C39226b.TAG_CLASSIC_ASSISTANT_AMBIENT_CLASSIC);
        this.f308196i = jVar;
        this.f308197j = aVar2.mo76900a("OpaCalCtrl");
        this.f308198k = context;
        this.f308199l = iVar;
        this.f308200m = abVar;
    }

    /* renamed from: b */
    private final void m184156b(long j) {
        C60856cj.m92911t(this.f308200m.mo46039a(new C110544d(j), C60826bg.f164896a), new C110546f(this, j), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo98762a(long j, Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b(new Intent().setAction("com.google.android.apps.gsa.broadcastreceiver.CALENDAR_DATA_UPDATE").setPackage("com.google.android.googlequicksearchbox").setComponent(new ComponentName(context, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver")), 201326592, 0), 201326592);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        alarmManager.getClass();
        broadcast.getClass();
        try {
            alarmManager.setExactAndAllowWhileIdle(1, j, broadcast);
            ((C58970a) ((C58970a) this.f308197j.mo56224b()).mo56372aa(26533)).mo56386p("Exact alarm scheduled for Smartspace calendar update.");
            m184156b(j);
        } catch (SecurityException e) {
            ((C58970a) ((C58970a) ((C58970a) this.f308197j.mo56226d()).mo56382g(e)).mo56372aa(26534)).mo56386p("Failed to set exact alarm, fallback to inexact alarm");
            broadcast.getClass();
            alarmManager.setAndAllowWhileIdle(1, j, broadcast);
            ((C58970a) ((C58970a) this.f308197j.mo56224b()).mo56372aa(26535)).mo56386p("Inexact alarm scheduled for Smartspace calendar update.");
            m184156b(j);
        } catch (Exception e2) {
            C58970a aVar = (C58970a) this.f308197j.mo56226d();
            aVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_CALENDAR_UPDATE_FAILED_TO_SET_ALARM_VALUE));
            ((C58970a) ((C58970a) aVar.mo56382g(e2)).mo56372aa(26536)).mo56386p("Failed to set alarm for Smartspace calendar refresh!");
        }
    }
}
