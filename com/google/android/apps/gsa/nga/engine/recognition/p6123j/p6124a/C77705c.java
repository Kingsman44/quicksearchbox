package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77740h;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60870cx;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.c */
/* compiled from: PG */
public final /* synthetic */ class C77705c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C77710h f214041a;

    /* renamed from: b */
    public final /* synthetic */ C77740h f214042b;

    public /* synthetic */ C77705c(C77710h hVar, C77740h hVar2) {
        this.f214041a = hVar;
        this.f214042b = hVar2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C77710h hVar = this.f214041a;
        C77740h hVar2 = this.f214042b;
        InputStream a = hVar.f214058j.mo72590a(hVar.f214055g);
        C60870cx g = hVar.f214061m.mo28207g("[NGA] S3Microphone.readMic", new C77707e(hVar, a, hVar2));
        g.mo4106b(new C77708f(a), new C77709g(hVar));
        return g;
    }
}
