package com.google.android.libraries.lens.view.p2085ax;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119097af;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119099ah;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119100ai;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.android.libraries.lens.common.text.C24141q;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.textoverlay.C28078k;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import com.google.lens.p4707j.C62511eg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.ax.p */
/* compiled from: PG */
public final class C25614p {

    /* renamed from: a */
    public static final C59071e f69669a = C59071e.m91332i("com.google.android.libraries.lens.view.ax.p");

    /* renamed from: b */
    public final C68214a f69670b;

    /* renamed from: c */
    public final Executor f69671c;

    /* renamed from: d */
    public final AtomicBoolean f69672d = new AtomicBoolean();

    /* renamed from: e */
    public final C25758g f69673e;

    /* renamed from: f */
    public C25613o f69674f;

    /* renamed from: g */
    public final C37215b f69675g;

    /* renamed from: h */
    public AtomicReference f69676h;

    /* renamed from: i */
    public C25604f f69677i;

    /* renamed from: j */
    private final Executor f69678j;

    /* renamed from: k */
    private final C60887da f69679k;

    public C25614p(C68214a aVar, C37215b bVar, Executor executor, Executor executor2, C60887da daVar) {
        this.f69670b = aVar;
        this.f69675g = bVar;
        this.f69678j = executor;
        this.f69671c = executor2;
        this.f69679k = daVar;
        C25601c cVar = new C25601c();
        cVar.f69650b = 1;
        cVar.f69651c = 1;
        cVar.f69649a = null;
        this.f69673e = new C25758g(cVar.mo30699a());
    }

    /* renamed from: e */
    private final void m47242e(Consumer consumer) {
        this.f69678j.execute(C47810es.m84977q(new C25609k(this, consumer)));
    }

    /* renamed from: a */
    public final void mo30724a(C56242aw awVar, C62511eg egVar, String str) {
        C119097af afVar = (C119097af) C119103al.f332227e.createBuilder();
        C119099ah ahVar = (C119099ah) C119100ai.f332220c.createBuilder();
        for (C56235ap apVar : awVar.f149801a) {
            StringBuilder sb = new StringBuilder();
            String str2 = BuildConfig.FLAVOR;
            for (C56233an anVar : apVar.f149783b) {
                for (C56241av avVar : anVar.f149778b) {
                    sb.append(str2);
                    sb.append(avVar.f149795c);
                    str2 = C24141q.m44843e(avVar, C58836b.f156633a);
                }
            }
            ahVar.mo104188b(sb.toString());
        }
        C119100ai aiVar = (C119100ai) ahVar.build();
        afVar.copyOnWrite();
        C119103al alVar = (C119103al) afVar.instance;
        aiVar.getClass();
        alVar.f332230b = aiVar;
        alVar.f332229a = 2;
        C119103al alVar2 = (C119103al) afVar.build();
        C58833ax k = C58833ax.m90834k(awVar);
        String str3 = egVar.f168777a;
        C25615q a = ((C25616r) this.f69673e.mo3842a()).mo30703a();
        a.mo30700b(str);
        C25616r a2 = a.mo30699a();
        C25758g gVar = this.f69673e;
        a2.getClass();
        gVar.mo5708l(a2);
        C25604f fVar = this.f69677i;
        if (fVar == null || !fVar.mo30693a().equals(alVar2)) {
            int d = a2.mo30706d();
            if (d == 0) {
                throw null;
            } else if (d == 2) {
                ((C119096ae) this.f69670b.mo27525b()).mo104114f();
            } else {
                m47242e(C25610l.f69659a);
                this.f69679k.execute(C47810es.m84977q(new C25611m(this, str3, k, (C119096ae) this.f69670b.mo27525b(), alVar2)));
                return;
            }
        }
        int c = a2.mo30705c();
        if (c == 0) {
            throw null;
        } else if (c != 2) {
            int d2 = a2.mo30706d();
            if (d2 == 0) {
                throw null;
            } else if (d2 == 2) {
                ((C119096ae) this.f69670b.mo27525b()).mo104114f();
            } else {
                ((C119096ae) this.f69670b.mo27525b()).mo104117i(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo30725b() {
        if (this.f69677i != null) {
            this.f69677i = C25604f.m47222d().mo30689a();
            mo30727d(1);
            ((C119096ae) this.f69670b.mo27525b()).mo104116h();
            AtomicReference atomicReference = this.f69676h;
            if (atomicReference != null && atomicReference.get() != null) {
                ((C28078k) this.f69676h.get()).mo33536a(C58485gu.m89845m());
            }
        }
    }

    /* renamed from: c */
    public final void mo30726c(int i) {
        m47242e(new C25607i(i));
    }

    /* renamed from: d */
    public final void mo30727d(int i) {
        m47242e(new C25608j(i));
    }
}
