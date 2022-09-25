package com.google.android.libraries.assistant.p1363c.p1398g.p1432i.p1433a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.p1363c.p1398g.p1404c.C17365c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1432i.C17438a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1432i.C17447b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17465aa;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17471ag;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.assistant.c.g.i.a.g */
/* compiled from: PG */
public final class C17445g implements C17447b {

    /* renamed from: a */
    public static final C59071e f50383a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.i.a.g");

    /* renamed from: b */
    public final C17508k f50384b;

    /* renamed from: c */
    public final C17477am f50385c;

    /* renamed from: d */
    public final C57981b f50386d;

    /* renamed from: e */
    public final C17522y f50387e;

    /* renamed from: f */
    public final C17365c f50388f;

    /* renamed from: g */
    public final AtomicReference f50389g = new AtomicReference();

    /* renamed from: h */
    public final AtomicReference f50390h = new AtomicReference();

    /* renamed from: i */
    private final Executor f50391i;

    /* renamed from: j */
    private final C60870cx f50392j;

    /* renamed from: k */
    private final C60870cx f50393k;

    /* renamed from: l */
    private final AtomicBoolean f50394l = new AtomicBoolean(false);

    public C17445g(C17508k kVar, C17477am amVar, C57981b bVar, C17522y yVar, C17365c cVar, Executor executor) {
        this.f50384b = kVar;
        this.f50385c = amVar;
        this.f50386d = bVar;
        this.f50387e = yVar;
        this.f50388f = cVar;
        this.f50391i = executor;
        this.f50392j = C2169h.m6027a(new C17439a(this));
        this.f50393k = C2169h.m6027a(new C17440b(this));
    }

    /* renamed from: a */
    public final void mo23357a() {
        this.f50388f.mo23316b(this.f50384b, this.f50385c);
        if (this.f50394l.get()) {
            ((C2164c) this.f50389g.get()).mo5437b(C17586a.m34875b(C17471ag.PLAYBACK_CLOSED_BY_CLIENT_BEFORE_STARTING));
            ((C2164c) this.f50390h.get()).mo5437b(C17586a.m34874a(C17465aa.PLAYBACK_CLOSED_BY_CLIENT_BEFORE_ENDED));
            return;
        }
        ((C2164c) this.f50389g.get()).mo5437b(C17586a.m34875b(C17471ag.SESSION_CLOSED_PLAY_NOT_CALLED_NOTHING_TO_START));
        ((C2164c) this.f50390h.get()).mo5437b(C17586a.m34874a(C17465aa.SESSION_CLOSED_PLAY_NOT_CALLED_NOTHING_TO_END));
    }

    /* renamed from: b */
    public final C17438a mo23358b() {
        return new C17438a(this.f50392j, this.f50393k);
    }

    /* renamed from: c */
    public final void mo23359c() {
        if (this.f50394l.compareAndSet(false, true)) {
            C17438a d = this.f50388f.mo23318d(this.f50384b, this.f50385c, this.f50386d, this.f50387e);
            ((C2164c) this.f50389g.get()).mo5436a(new C17441c(d), this.f50391i);
            ((C2164c) this.f50390h.get()).mo5436a(new C17442d(d), this.f50391i);
            C60856cj.m92911t(d.f50375a, C47810es.m84974n(new C17443e(this)), this.f50391i);
            C60856cj.m92911t(d.f50376b, C47810es.m84974n(new C17444f(this)), this.f50391i);
        }
    }
}
