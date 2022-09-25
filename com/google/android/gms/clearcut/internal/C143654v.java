package com.google.android.gms.clearcut.internal;

import android.content.Context;
import com.google.android.gms.clearcut.C143621ab;
import com.google.android.gms.phenotype.C145738p;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import java.nio.charset.Charset;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.clearcut.internal.v */
/* compiled from: PG */
public final class C143654v implements C143621ab {

    /* renamed from: a */
    public static final Charset f389453a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final C31652ah f389454b;

    /* renamed from: c */
    public static final ConcurrentHashMap f389455c = new ConcurrentHashMap();

    /* renamed from: d */
    static Boolean f389456d = null;

    /* renamed from: e */
    static Long f389457e = null;

    /* renamed from: f */
    public final Context f389458f;

    static {
        C31652ah ahVar = new C31652ah(C145738p.m237002a("com.google.android.gms.clearcut.public"));
        if (!ahVar.f85141e) {
            f389454b = new C31652ah(ahVar.f85137a, ahVar.f85138b, "gms:playlog:service:samplingrules_", ahVar.f85140d, false, ahVar.f85142f, ahVar.f85143g, ahVar.f85144h).mo37299d("LogSamplingRulesV2__");
            return;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public C143654v(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f389458f = applicationContext;
        if (applicationContext != null) {
            C31654aj.m58985d(applicationContext);
        }
    }
}
