package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9342a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124182b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124211d;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124186b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124187c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124188d;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124189e;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124190f;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124195k;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124197m;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.a.g */
/* compiled from: PG */
final class C124177g implements C124211d {

    /* renamed from: a */
    public static final C59071e f342922a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.a.a.g");

    /* renamed from: b */
    public final C17597g f342923b;

    /* renamed from: c */
    public final C124182b f342924c;

    /* renamed from: d */
    public final C2164c f342925d;

    /* renamed from: e */
    public final Executor f342926e;

    /* renamed from: f */
    public final Executor f342927f;

    public C124177g(C124186b bVar, C124182b bVar2, Executor executor, C2164c cVar, C124195k kVar, Executor executor2) {
        this.f342924c = bVar2;
        this.f342925d = cVar;
        this.f342926e = new C60904dr(executor2);
        this.f342927f = new C60904dr(executor);
        ((C59052c) ((C59052c) f342922a.mo56224b()).mo56372aa(36113)).mo56386p("#connect");
        C17602l lVar = new C17602l(executor2, C70876o.m103761b(kVar.f189039a.mo39510a(C124197m.m203641a(), kVar.f189040b), C47686k.m84827a(new C124176f(this)), true));
        this.f342923b = lVar;
        C124187c cVar2 = (C124187c) C124190f.f342945c.createBuilder();
        C124188d dVar = (C124188d) C124189e.f342942b.createBuilder();
        dVar.copyOnWrite();
        bVar.getClass();
        ((C124189e) dVar.instance).f342944a = bVar;
        cVar2.copyOnWrite();
        C124190f fVar = (C124190f) cVar2.instance;
        C124189e eVar = (C124189e) dVar.build();
        eVar.getClass();
        fVar.f342948b = eVar;
        fVar.f342947a = 1;
        lVar.mo20123c((C124190f) cVar2.build());
    }

    /* renamed from: a */
    public final void mo106320a() {
        this.f342923b.mo20121a();
    }

    /* renamed from: b */
    public final void mo106321b(Throwable th) {
        this.f342927f.execute(C47810es.m84977q(new C124171a(this, th)));
    }
}
