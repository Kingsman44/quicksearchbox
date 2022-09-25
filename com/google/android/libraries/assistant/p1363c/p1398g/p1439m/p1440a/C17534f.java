package com.google.android.libraries.assistant.p1363c.p1398g.p1439m.p1440a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17484at;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1439m.C17528a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1439m.C17536b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1441n.C17537a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1441n.C17550b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.m.a.f */
/* compiled from: PG */
public final class C17534f implements C17536b {

    /* renamed from: a */
    public static final C59071e f50569a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.m.a.f");

    /* renamed from: b */
    public final C17508k f50570b;

    /* renamed from: c */
    public final C17477am f50571c;

    /* renamed from: d */
    public final C17485au f50572d;

    /* renamed from: e */
    public final Executor f50573e;

    /* renamed from: f */
    public final C58881cr f50574f;

    /* renamed from: g */
    public final C57987f f50575g = new C57987f();

    /* renamed from: h */
    public final C57987f f50576h = new C57987f();

    /* renamed from: i */
    public final AtomicReference f50577i = new AtomicReference();

    /* renamed from: j */
    private final C60870cx f50578j;

    public C17534f(C17508k kVar, C17477am amVar, C17485au auVar, Executor executor, C17537a aVar, C17537a aVar2) {
        this.f50570b = kVar;
        this.f50571c = amVar;
        this.f50572d = auVar;
        this.f50573e = executor;
        this.f50574f = C58886cw.m90973a(new C17530b(kVar, auVar, aVar, aVar2, amVar));
        this.f50578j = C2169h.m6027a(new C17531c(this));
    }

    /* renamed from: a */
    public final void mo23381a() {
        C59104x b = f50569a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42765)).mo56354G("Closing synthesis for clientInfo %s, sessionToken %s", C17377g.m34653a(this.f50570b), C17377g.m34655c(this.f50571c));
        ((C17550b) this.f50574f.mo6453a()).mo23386a();
        ((C2164c) this.f50577i.get()).mo5437b(C17586a.m34876c(4));
    }

    /* renamed from: b */
    public final C17528a mo23382b() {
        Optional optional;
        C57987f fVar = this.f50575g;
        C60870cx cxVar = this.f50578j;
        C17484at a = C17484at.m34786a(this.f50572d.f50486d);
        if (a == null) {
            a = C17484at.UNKNOWN_MODE;
        }
        if (a == C17484at.SERVER) {
            optional = Optional.m71637of(this.f50576h);
        } else {
            optional = Optional.empty();
        }
        return new C17528a(fVar, cxVar, optional);
    }
}
