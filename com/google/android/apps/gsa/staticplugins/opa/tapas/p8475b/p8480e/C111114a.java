package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8480e;

import android.content.Context;
import android.os.BatteryManager;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48657r;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48658s;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.e.a */
/* compiled from: PG */
public final class C111114a extends C112473ar {

    /* renamed from: a */
    private final Context f309362a;

    /* renamed from: b */
    private final C21370a f309363b;

    public C111114a(Context context, C21370a aVar) {
        this.f309362a = context;
        this.f309363b = aVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return TimeUnit.MINUTES.toMillis(1);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        BatteryManager batteryManager = (BatteryManager) this.f309362a.getSystemService("batterymanager");
        if (batteryManager == null) {
            return m186307l(this.f309363b);
        }
        C48657r rVar = (C48657r) C48658s.f125753c.createBuilder();
        long longProperty = batteryManager.getLongProperty(4);
        if (longProperty != Long.MIN_VALUE) {
            rVar.copyOnWrite();
            ((C48658s) rVar.instance).f125756b = (int) longProperty;
        }
        boolean isCharging = batteryManager.isCharging();
        rVar.copyOnWrite();
        ((C48658s) rVar.instance).f125755a = isCharging;
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = this.f309363b.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        C48658s sVar = (C48658s) rVar.build();
        bvVar.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar.instance;
        sVar.getClass();
        bxVar.f125707b = sVar;
        bxVar.f125706a = 13;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }

    /* renamed from: m */
    public final long mo99046m() {
        return TimeUnit.MINUTES.toMillis(1);
    }
}
