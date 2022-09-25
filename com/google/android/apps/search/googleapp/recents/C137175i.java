package com.google.android.apps.search.googleapp.recents;

import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Random;

/* renamed from: com.google.android.apps.search.googleapp.recents.i */
/* compiled from: PG */
public final /* synthetic */ class C137175i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137177k f373261a;

    /* renamed from: b */
    public final /* synthetic */ C137176j f373262b;

    /* renamed from: c */
    public final /* synthetic */ Uri f373263c;

    /* renamed from: d */
    public final /* synthetic */ String f373264d;

    /* renamed from: e */
    public final /* synthetic */ String f373265e;

    /* renamed from: f */
    public final /* synthetic */ C60494rz f373266f;

    public /* synthetic */ C137175i(C137177k kVar, C137176j jVar, Uri uri, String str, String str2, C60494rz rzVar) {
        this.f373261a = kVar;
        this.f373262b = jVar;
        this.f373263c = uri;
        this.f373264d = str;
        this.f373265e = str2;
        this.f373266f = rzVar;
    }

    public final C60870cx apply(Object obj) {
        C137177k kVar = this.f373261a;
        C137176j jVar = this.f373262b;
        Uri uri = this.f373263c;
        String str = this.f373264d;
        String str2 = this.f373265e;
        C60494rz rzVar = this.f373266f;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        long nextLong = new Random().nextLong();
        C60870cx b = kVar.mo113581b(nextLong, jVar.mo113579a());
        C137172f fVar = new C137172f(kVar, uri, str, str2, rzVar, nextLong);
        return C60922j.m93045h(b, C47810es.m84966f(fVar), kVar.f373272f);
    }
}
