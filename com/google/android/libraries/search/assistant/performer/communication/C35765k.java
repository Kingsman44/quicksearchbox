package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35506p;
import com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a.C35507q;
import com.google.android.libraries.search.assistant.performer.communication.p2735c.C35569a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.common.util.concurrent.C60888db;
import p3186j$.util.function.Function;
import p5304e.p5305a.p5306a.p5369g.p5373b.p5374a.C68754r;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.k */
/* compiled from: PG */
public final /* synthetic */ class C35765k implements Function {

    /* renamed from: a */
    public final /* synthetic */ TelephonyManager f93700a;

    /* renamed from: b */
    public final /* synthetic */ C35569a f93701b;

    public /* synthetic */ C35765k(TelephonyManager telephonyManager, C35569a aVar) {
        this.f93700a = telephonyManager;
        this.f93701b = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = this.f93700a;
        C35569a aVar = this.f93701b;
        C35507q qVar = (C35507q) obj;
        Context context = (Context) qVar.f93247a.mo17428b();
        context.getClass();
        C60888db dbVar = (C60888db) qVar.f93248b.mo17428b();
        dbVar.getClass();
        C68754r rVar = (C68754r) qVar.f93249c.mo17428b();
        rVar.getClass();
        C46877q qVar2 = (C46877q) qVar.f93250d.mo17428b();
        qVar2.getClass();
        C21370a aVar2 = (C21370a) qVar.f93251e.mo17428b();
        aVar2.getClass();
        aVar.getClass();
        return new C35506p(context, dbVar, rVar, qVar2, aVar2, telephonyManager, aVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
