package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6350k.C81338a;
import com.google.android.libraries.assistant.p1484g.p1502d.C18175l;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.l */
/* compiled from: PG */
public final /* synthetic */ class C93218l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93225o f259959a;

    /* renamed from: b */
    public final /* synthetic */ Instant f259960b;

    /* renamed from: c */
    public final /* synthetic */ String f259961c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f259962d;

    /* renamed from: e */
    public final /* synthetic */ boolean f259963e;

    /* renamed from: f */
    public final /* synthetic */ Instant f259964f;

    public /* synthetic */ C93218l(C93225o oVar, Instant instant, String str, Bundle bundle, boolean z, Instant instant2) {
        this.f259959a = oVar;
        this.f259960b = instant;
        this.f259961c = str;
        this.f259962d = bundle;
        this.f259963e = z;
        this.f259964f = instant2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93225o oVar = this.f259959a;
        Instant instant = this.f259960b;
        String str = this.f259961c;
        Bundle bundle = this.f259962d;
        boolean z = this.f259963e;
        Instant instant2 = this.f259964f;
        Exception exc = (Exception) obj;
        boolean z2 = exc instanceof C81338a;
        if (!z2 && (!(exc instanceof C18175l) || ((C18175l) exc).f51669a != 5)) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.ABORTED, exc.getMessage()));
        }
        if (z2 && ((C81338a) exc).f222622a == 3 && oVar.f259980c.mo57444a().isAfter(instant)) {
            return C60856cj.m92900i(C93225o.m153298b());
        }
        if (str.equals("checkout")) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.NOT_FOUND, exc.getMessage()));
        }
        ((C58970a) ((C58970a) C93225o.f259976a.mo56224b()).mo56372aa(13059)).mo56386p("Retrying performing dynamic action.");
        return oVar.f259979b.mo28203c("Retry performing dynamic action.", 200, new C93222m(oVar, str, bundle, z, instant, instant2));
    }
}
