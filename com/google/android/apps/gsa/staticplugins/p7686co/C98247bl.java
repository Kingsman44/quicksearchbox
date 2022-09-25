package com.google.android.apps.gsa.staticplugins.p7686co;

import android.accounts.Account;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7975qx;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.bl */
/* compiled from: PG */
public final class C98247bl extends C68247h {

    /* renamed from: a */
    private final C98236ba f274342a;

    public C98247bl(C98236ba baVar, C69464a aVar, C69464a aVar2) {
        super(aVar2, new C68277d(C98247bl.class), aVar);
        this.f274342a = baVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Void voidR = (Void) obj;
        C98236ba baVar = this.f274342a;
        C98158an anVar = baVar.f274279f.f274297h;
        Account account = baVar.f274274a;
        C7975qx qxVar = baVar.f274275b.f27925f;
        if (qxVar == null) {
            qxVar = C7975qx.f28007u;
        }
        return anVar.f274100a.mo28201a("SensorSignalsOracle#buildCurrentSensorSignals", new C98157am(anVar, account, qxVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60866ct.f164955a;
    }
}
