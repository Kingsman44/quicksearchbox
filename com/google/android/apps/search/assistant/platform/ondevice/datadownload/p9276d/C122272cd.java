package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.C122179b;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17040ag;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17156s;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17157t;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17158u;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17596f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p5488io.grpc.C70148al;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.cd */
/* compiled from: PG */
public final class C122272cd extends C17040ag {

    /* renamed from: a */
    public static final C58974d f339049a = C58974d.m91136j();

    /* renamed from: b */
    public final C60888db f339050b;

    /* renamed from: c */
    public final C122179b f339051c;

    /* renamed from: d */
    public final Optional f339052d;

    /* renamed from: e */
    private final C122277d f339053e;

    /* renamed from: f */
    private final C122264bw f339054f;

    /* renamed from: g */
    private final C122290q f339055g;

    /* renamed from: h */
    private final boolean f339056h;

    /* renamed from: i */
    private final boolean f339057i;

    /* renamed from: j */
    private final boolean f339058j;

    public C122272cd(C60888db dbVar, C122277d dVar, C122264bw bwVar, C122179b bVar, Optional optional, C122290q qVar, C122218ad adVar, boolean z, boolean z2, boolean z3) {
        this.f339050b = dbVar;
        this.f339053e = dVar;
        this.f339054f = bwVar;
        this.f339051c = bVar;
        this.f339052d = optional;
        this.f339055g = qVar;
        this.f339056h = z;
        this.f339057i = z2;
        this.f339058j = z3;
        adVar.mo105574a();
    }

    /* renamed from: b */
    public final C60870cx mo105582b(C17044ak akVar, String str) {
        if (!this.f339057i) {
            C17036ac acVar = akVar.f49653b;
            if (acVar == null) {
                acVar = C17036ac.f49640d;
            }
            C60870cx a = this.f339053e.mo105583a();
            C122270cb cbVar = new C122270cb(this, str, acVar);
            return C60922j.m93045h(a, C47810es.m84966f(cbVar), this.f339050b);
        }
        ((C58970a) ((C58970a) f339049a.mo56225c()).mo56372aa(34744)).mo56389s("Filegroup %s was requested but did not exist in the local assets.", str);
        throw new C122271cc();
    }

    /* renamed from: c */
    public final void mo23173c(C17044ak akVar, C70862aj ajVar) {
        C70148al m = C70148al.m102135m();
        if (this.f339056h) {
            C122290q qVar = this.f339055g;
            C17156s sVar = new C17156s();
            C60870cx a = qVar.mo105591a(sVar, new C122282i(qVar, akVar));
            C17036ac acVar = akVar.f49653b;
            if (acVar == null) {
                acVar = C17036ac.f49640d;
            }
            C122285l lVar = new C122285l(qVar, acVar.f49644c, (String) C17158u.m34308a(acVar).orElse(BuildConfig.FLAVOR));
            C60856cj.m92911t(a, C47810es.m84974n(lVar), qVar.f339107d);
            ajVar = new C17596f(Arrays.asList(new C70862aj[]{ajVar, sVar}));
        }
        C17036ac acVar2 = akVar.f49653b;
        if (acVar2 == null) {
            acVar2 = C17036ac.f49640d;
        }
        C60870cx a2 = this.f339054f.mo105581a(acVar2);
        C122266by byVar = new C122266by(this, acVar2, akVar);
        C17157t.m34306b(m, C60856cj.m92908q(C60922j.m93045h(a2, C47810es.m84966f(byVar), this.f339050b), 60, TimeUnit.SECONDS, this.f339050b), ajVar, this.f339050b, this.f339058j);
    }
}
