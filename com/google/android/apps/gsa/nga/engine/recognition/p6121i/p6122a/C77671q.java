package com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a;

import com.google.android.apps.gsa.nga.api.a.bu;
import com.google.android.apps.gsa.nga.api.a.bw;
import com.google.android.apps.gsa.nga.api.p5884b.C74700a;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.bisto.C75309c;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.p5970d.C75156a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77564aq;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.p6111d.C77616b;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81065f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.i.a.q */
/* compiled from: PG */
public final class C77671q implements C77564aq {

    /* renamed from: a */
    public static final C58974d f213946a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f213947b;

    /* renamed from: c */
    public final C77616b f213948c;

    /* renamed from: d */
    public C77655a f213949d = null;

    /* renamed from: e */
    private final C77656b f213950e;

    /* renamed from: f */
    private final C75156a f213951f;

    /* renamed from: g */
    private final C75309c f213952g;

    /* renamed from: h */
    private final C75050a f213953h;

    public C77671q(C22871g gVar, C77656b bVar, C75156a aVar, C75309c cVar, C77616b bVar2, C75050a aVar2) {
        this.f213947b = gVar;
        this.f213950e = bVar;
        this.f213951f = aVar;
        this.f213952g = cVar;
        this.f213948c = bVar2;
        this.f213953h = aVar2;
    }

    /* renamed from: i */
    private final void m124642i(C77566as asVar) {
        if (asVar.mo72682e().isPresent()) {
            this.f213951f.mo71505c((HotwordResult) asVar.mo72682e().get());
        }
    }

    /* renamed from: a */
    public final void mo72673a(ac acVar) {
    }

    /* renamed from: b */
    public final boolean mo72674b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo72675c(C77566as asVar, C79856d dVar) {
        m124642i(asVar);
        this.f213947b.mo28212l("[NGA] RohanSpeechRecognizer.reset", new C77668n(this, asVar, dVar));
        return false;
    }

    /* renamed from: d */
    public final boolean mo72676d(C77566as asVar, C79856d dVar) {
        if (!asVar.mo72683f().isPresent()) {
            ((C58970a) ((C58970a) f213946a.mo56226d()).mo56372aa(4372)).mo56386p("SpeechSessionParams don't have invocation token!");
            this.f213948c.mo72746b(asVar);
            return false;
        }
        m124642i(asVar);
        this.f213947b.mo28212l("[NGA] RohanSpeechRecognizer.start", new C77666l(this, asVar, dVar));
        return true;
    }

    /* renamed from: e */
    public final boolean mo72677e() {
        this.f213947b.mo28212l("[NGA] RohanSpeechRecognizer.stop", new C77665k(this, this.f213953h.mo71417a().mo71460d().equals(C83016y.SESSION_CANCELLATION)));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x00aa A[LOOP:0: B:8:0x00aa->B:11:0x00b6, LOOP_START] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72763f(com.google.android.apps.gsa.nga.engine.recognition.C77566as r9, com.google.android.apps.gsa.nga.engine.p6260x.C79856d r10, p3186j$.util.Optional r11) {
        /*
            r8 = this;
            com.google.android.apps.gsa.nga.engine.recognition.i.a.a r0 = r8.f213949d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r11.isPresent()
            if (r0 != 0) goto L_0x0032
            j$.util.Optional r11 = r9.mo72683f()
            java.lang.Object r11 = r11.get()
            com.google.android.libraries.search.c.hs r11 = (com.google.android.libraries.search.p2904c.C37672hs) r11
            com.google.android.apps.gsa.nga.engine.bisto.c r0 = r8.f213952g
            com.google.common.util.concurrent.cx r0 = r0.mo71651g(r11)
            com.google.android.libraries.gsa.k.g r1 = r8.f213947b
            com.google.android.apps.gsa.nga.engine.recognition.i.a.o r2 = new com.google.android.apps.gsa.nga.engine.recognition.i.a.o
            r2.<init>(r8, r9, r10, r11)
            com.google.android.apps.gsa.shared.util.c.ag r10 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r3 = "[NGA] RohanSpeechRecognizer.start"
            r10.<init>(r0, r1, r3, r2)
            com.google.android.apps.gsa.nga.engine.recognition.i.a.p r0 = new com.google.android.apps.gsa.nga.engine.recognition.i.a.p
            r0.<init>(r8, r11, r9)
            r10.mo85223a(r0)
            return
        L_0x0032:
            com.google.common.f.a.d r0 = f213946a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 4364(0x110c, float:6.115E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            com.google.android.apps.gsa.nga.engine.b.g.ac r1 = r10.f218924a
            java.lang.String r1 = r1.c()
            java.lang.Object r2 = r11.get()
            com.google.android.apps.gsa.nga.api.a.cf r2 = (com.google.android.apps.gsa.nga.api.a.cf) r2
            java.lang.String r2 = com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81065f.m129012a(r2)
            java.lang.String r3 = "Starting Rohan session with utterance id %s and %s"
            r0.mo56354G(r3, r1, r2)
            com.google.android.apps.gsa.nga.engine.recognition.i.a.b r0 = r8.f213950e
            java.lang.Object r11 = r11.get()
            r3 = r11
            com.google.android.apps.gsa.nga.api.a.cf r3 = (com.google.android.apps.gsa.nga.api.a.cf) r3
            com.google.android.apps.gsa.nga.engine.recognition.i.a.a r11 = new com.google.android.apps.gsa.nga.engine.recognition.i.a.a
            r3.getClass()
            r9.getClass()
            g.a.a r1 = r0.f213893a
            dagger.a.l r1 = (dagger.p5294a.C68226l) r1
            g.a.a r1 = r1.f184585a
            dagger.a r5 = dagger.p5294a.C68219e.m98518a(r1)
            r5.getClass()
            g.a.a r1 = r0.f213894b
            dagger.a.l r1 = (dagger.p5294a.C68226l) r1
            g.a.a r1 = r1.f184585a
            dagger.a r6 = dagger.p5294a.C68219e.m98518a(r1)
            r6.getClass()
            g.a.a r0 = r0.f213895c
            java.lang.Object r0 = r0.mo17428b()
            r7 = r0
            com.google.common.base.cz r7 = (com.google.common.base.C58889cz) r7
            r7.getClass()
            r1 = r11
            r2 = r10
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            dagger.a r9 = r11.f213888d
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.nga.engine.recognition.i.a.i r9 = (com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a.C77663i) r9
            com.google.android.apps.gsa.nga.engine.x.d r10 = r11.f213890f
            com.google.android.apps.gsa.nga.engine.b.g.ac r0 = r10.f218924a
            r0.c()
            java.util.concurrent.atomic.AtomicReference r0 = r9.f213924m
            r0.set(r10)
            java.util.concurrent.atomic.AtomicReference r9 = r9.f213923l
        L_0x00aa:
            r0 = 0
            boolean r0 = r9.compareAndSet(r0, r10)
            if (r0 == 0) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            java.lang.Object r0 = r9.get()
            if (r0 == 0) goto L_0x00aa
        L_0x00b8:
            dagger.a r9 = r11.f213886b
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.nga.api.b.a r9 = (com.google.android.apps.gsa.nga.api.p5884b.C74700a) r9
            dagger.a r10 = r11.f213888d
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.libraries.assistant.soda.o r10 = (com.google.android.libraries.assistant.soda.C19347o) r10
            com.google.android.apps.gsa.nga.api.a.cf r0 = r11.f213887c
            r9.mo71057a(r10, r0)
            com.google.common.f.a.d r9 = com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a.C77655a.f213885a
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9
            r10 = 4346(0x10fa, float:6.09E-42)
            com.google.common.f.x r9 = r9.mo56372aa(r10)
            com.google.common.f.a.a r9 = (com.google.common.p4526f.p4527a.C58970a) r9
            com.google.android.apps.gsa.nga.api.a.cf r10 = r11.f213887c
            java.lang.String r10 = com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81065f.m129012a(r10)
            java.lang.String r0 = r11.f213891g
            java.lang.String r1 = "Starting Rohan session %s for utteranceid %s"
            r9.mo56354G(r1, r10, r0)
            r8.f213949d = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a.C77671q.mo72763f(com.google.android.apps.gsa.nga.engine.recognition.as, com.google.android.apps.gsa.nga.engine.x.d, j$.util.Optional):void");
    }

    /* renamed from: g */
    public final void mo72764g() {
        C77655a aVar = this.f213949d;
        this.f213949d = null;
        if (aVar != null) {
            ((C58970a) ((C58970a) f213946a.mo56224b()).mo56372aa(4365)).mo56389s("Stopping Rohan session %s", aVar.f213890f.f218924a);
            ((C74700a) aVar.f213886b.mo27525b()).mo71058b(aVar.f213887c);
            ((C58970a) ((C58970a) C77655a.f213885a.mo56224b()).mo56372aa(4347)).mo56354G("Stopped Rohan session %s for utteranceid %s", C81065f.m129012a(aVar.f213887c), aVar.f213891g);
            ((C58970a) ((C58970a) C77655a.f213885a.mo56224b()).mo56372aa(4345)).mo56359L("Rohan session %s for utteranceid %s duration is %d ms", C81065f.m129012a(aVar.f213887c), aVar.f213891g, Long.valueOf(aVar.f213889e.mo56158a(TimeUnit.MILLISECONDS)));
        }
    }

    /* renamed from: h */
    public final void mo72765h(C77566as asVar, int i) {
        bu createBuilder = bw.c.createBuilder();
        C37672hs hsVar = (C37672hs) asVar.mo72683f().get();
        createBuilder.copyOnWrite();
        hsVar.getClass();
        createBuilder.instance.a = hsVar;
        createBuilder.copyOnWrite();
        createBuilder.instance.b = i - 2;
        this.f213952g.mo71653i(createBuilder.build());
    }
}
