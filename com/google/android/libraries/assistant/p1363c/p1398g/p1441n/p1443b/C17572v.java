package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.binaries.satin.app.ajv;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1439m.C17528a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1441n.C17550b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1442a.C17538a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.android.libraries.search.assistant.p2498ac.p2499a.p2500a.C32432a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.p4449cd.p4456g.p4458b.C57994m;
import com.google.p4449cd.p4462i.C58048g;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.v */
/* compiled from: PG */
public final class C17572v implements C17550b {

    /* renamed from: a */
    public static final C59071e f50658a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.n.b.v");

    /* renamed from: b */
    public final C17477am f50659b;

    /* renamed from: c */
    public final ScheduledExecutorService f50660c;

    /* renamed from: d */
    public final C32432a f50661d;

    /* renamed from: e */
    public final C58881cr f50662e;

    /* renamed from: f */
    public final C57987f f50663f = new C57987f();

    /* renamed from: g */
    public final C57987f f50664g = new C57987f();

    /* renamed from: h */
    public final AtomicReference f50665h = new AtomicReference();

    /* renamed from: i */
    private final C17485au f50666i;

    /* renamed from: j */
    private final Executor f50667j;

    /* renamed from: k */
    private final AtomicBoolean f50668k = new AtomicBoolean(false);

    /* renamed from: l */
    private final C60870cx f50669l;

    public C17572v(C17485au auVar, C17477am amVar, ajv ajv, C58048g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService, C32432a aVar) {
        this.f50666i = auVar;
        this.f50659b = amVar;
        this.f50667j = executor;
        this.f50660c = scheduledExecutorService;
        this.f50661d = aVar;
        this.f50662e = C58886cw.m90973a(new C17568r(ajv, auVar, gVar));
        this.f50669l = C2169h.m6027a(new C17569s(this, amVar, executor));
    }

    /* renamed from: a */
    public final void mo23386a() {
        C59104x b = f50658a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) b).mo56372aa(42794)).mo56389s("Closing Server synthesizer for sessionToken %s", C17377g.m34655c(this.f50659b));
        ((C2164c) this.f50665h.get()).mo5437b(C17586a.m34876c(4));
        C46459k.m82829b(((C17538a) this.f50662e.mo6453a()).mo23384b(), "Failed to cancel S3 synthesis for sessionToken %s", C17377g.m34655c(this.f50659b));
    }

    /* renamed from: b */
    public final C17528a mo23387b() {
        if (this.f50668k.compareAndSet(false, true)) {
            C59104x b = f50658a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS.Server");
            ((C59052c) ((C59052c) b).mo56372aa(42793)).mo56389s("Server synthesis started for sessionToken %s", C17377g.m34655c(this.f50659b));
            C32432a aVar = this.f50661d;
            C17477am amVar = this.f50659b;
            C69664n.m101061g(amVar, "sessionToken");
            aVar.mo38058a(C37176a.f97053eL.mo40815i(C62722b.OK), amVar);
            C57994m.m88733a(((C17538a) this.f50662e.mo6453a()).mo23385c(), this.f50667j).mo20440jJ(new C17571u(this, this.f50666i.f50488f));
        }
        return new C17528a(this.f50663f, this.f50669l, Optional.m71637of(this.f50664g));
    }
}
