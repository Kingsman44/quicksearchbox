package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.p740a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12036c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.C12025a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.p735a.C12035j;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.C12094a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.d.a.i */
/* compiled from: PG */
public final class C12103i implements C12094a {

    /* renamed from: a */
    public static final C59071e f38695a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.d.a.i");

    /* renamed from: b */
    public final Context f38696b;

    /* renamed from: c */
    public final C12154a f38697c;

    /* renamed from: d */
    public final C16850a f38698d;

    /* renamed from: e */
    public final C12025a f38699e;

    /* renamed from: f */
    public final C15481g f38700f;

    /* renamed from: g */
    public final C42876ab f38701g;

    /* renamed from: h */
    public final C21370a f38702h;

    /* renamed from: i */
    public final Executor f38703i;

    /* renamed from: j */
    public final C69464a f38704j;

    /* renamed from: k */
    public final AtomicBoolean f38705k = new AtomicBoolean(false);

    /* renamed from: l */
    final AtomicReference f38706l = new AtomicReference();

    /* renamed from: m */
    public final AtomicReference f38707m = new AtomicReference();

    /* renamed from: n */
    public final AtomicReference f38708n = new AtomicReference();

    public C12103i(Context context, C12154a aVar, C16850a aVar2, C12025a aVar3, C15481g gVar, C42876ab abVar, C21370a aVar4, Executor executor, C69464a aVar5) {
        this.f38696b = context;
        this.f38697c = aVar;
        this.f38698d = aVar2;
        this.f38699e = aVar3;
        this.f38700f = gVar;
        this.f38701g = abVar;
        this.f38702h = aVar4;
        this.f38703i = executor;
        this.f38704j = aVar5;
    }

    /* renamed from: a */
    public final void mo20408a(C12093d dVar) {
        hashCode();
        if (!this.f38705k.get()) {
            this.f38700f.mo22352b(C37179a.f97450aV);
            C60870cx d = this.f38701g.mo46042d();
            C12096b bVar = new C12096b(this);
            C60870cx g = C60922j.m93044g(d, C47810es.m84963c(bVar), this.f38703i);
            C12095a aVar = new C12095a(this);
            C60870cx h = C60922j.m93045h(g, C47810es.m84966f(aVar), this.f38703i);
            C12098d dVar2 = new C12098d(this);
            C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(dVar2), this.f38703i);
            this.f38706l.set(h2);
            C12101g gVar = new C12101g(this);
            C60856cj.m92911t(h2, C47810es.m84974n(gVar), this.f38703i);
        }
    }

    /* renamed from: b */
    public final void mo20409b() {
        boolean z;
        hashCode();
        boolean z2 = true;
        this.f38705k.set(true);
        if (this.f38706l.get() != null) {
            ((C60870cx) this.f38706l.get()).cancel(false);
            z = true;
        } else {
            z = false;
        }
        if (this.f38707m.get() == null || ((C12036c) this.f38707m.get()).mo20381a().isDone()) {
            z2 = z;
        } else {
            C46459k.m82829b(((C12036c) this.f38707m.get()).mo20382b(), "Failed to stop Limited Connectivity TTS", new Object[0]);
        }
        if (this.f38708n.get() != null) {
            C46459k.m82829b(((C12035j) this.f38708n.get()).mo20380a(), "Failed to stop audio spinner", new Object[0]);
        } else if (!z2) {
            return;
        }
        this.f38700f.mo22352b(C37179a.f97453aY);
    }
}
