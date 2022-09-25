package com.google.android.apps.gsa.p8839t;

import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62946bz;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.t.g */
/* compiled from: PG */
public final class C118366g {

    /* renamed from: a */
    public final C42880af f328546a;

    /* renamed from: b */
    public final Executor f328547b;

    /* renamed from: c */
    public final C22871g f328548c;

    /* renamed from: d */
    private final Context f328549d;

    public C118366g(Context context, C42880af afVar, C22871g gVar) {
        this.f328549d = context;
        this.f328546a = afVar;
        this.f328547b = new C118349d(gVar);
        this.f328548c = gVar;
    }

    /* renamed from: a */
    public final C42878ad mo103683a(String str, MessageLite messageLite) {
        C42877ac i = C42878ad.m75739i();
        C42718e a = C42719f.m75461a(this.f328549d);
        C42719f.m75463c("opa");
        a.f111968c = "opa";
        a.mo45821b(str);
        i.mo45968e(a.mo45820a());
        i.mo45967d(messageLite);
        return i.mo45964a();
    }

    /* renamed from: b */
    public final C60870cx mo103684b(String str) {
        return this.f328548c.mo28209i(this.f328546a.mo45979a(mo103683a(str, C62946bz.f169983b)).mo46042d(), "proactive-client-platform-store", C118338a.f328480a);
    }

    /* renamed from: c */
    public final C60870cx mo103685c(String str, Long l) {
        return this.f328546a.mo45979a(mo103683a(str, C62946bz.f169983b)).mo46039a(new C118358f(l), this.f328547b);
    }
}
