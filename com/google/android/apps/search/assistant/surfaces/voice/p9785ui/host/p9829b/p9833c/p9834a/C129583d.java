package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9834a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129579a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128624c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.p4582b.C60943b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5579e.C71703ak;
import kotlinx.coroutines.p5584j.C71787a;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71794h;
import kotlinx.coroutines.p5584j.C71799m;
import kotlinx.coroutines.p5584j.C71800n;
import kotlinx.p5572a.C71342e;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.a.d */
/* compiled from: PG */
public final class C129583d implements C129579a {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f355664a;

    /* renamed from: b */
    public static final Duration f355665b = C60943b.m93086b(500);

    /* renamed from: c */
    public static final C59071e f355666c = C59071e.m91331h();

    /* renamed from: d */
    private final C71422aw f355667d;

    /* renamed from: e */
    private final C71788b f355668e = new C71799m();

    /* renamed from: f */
    private final C69684c f355669f = new C128624c();

    static {
        C69669s sVar = new C69669s(C129583d.class, "postponeJob", "getPostponeJob()Lkotlinx/coroutines/Job;");
        int i = C69649af.f186028a;
        f355664a = new C69713k[]{sVar};
    }

    public C129583d(Fragment fragment, C71422aw awVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(awVar, "fragmentScope");
        this.f355667d = awVar;
    }

    /* renamed from: d */
    private final void m211584d(C71643cp cpVar) {
        this.f355669f.mo42045b(f355664a[0], cpVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109116a(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9834a.C129582c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.a.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9834a.C129582c) r0
            int r1 = r0.f355663d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355663d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.a.c r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.a.c
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f355661b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355663d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            java.lang.Object r0 = r0.f355660a
            p5462h.C69714l.m101134b(r7)
            goto L_0x005b
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0032:
            p5462h.C69714l.m101134b(r7)
            com.google.common.f.e r7 = f355666c
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r2 = new com.google.common.f.n
            r5 = 38369(0x95e1, float:5.3766E-41)
            r2.<init>(r5)
            r7.mo56379ah(r2)
            java.lang.String r2 = "#waitPostponedTransitionsStarted"
            r7.mo56386p(r2)
            kotlinx.coroutines.j.b r7 = r6.f355668e
            r0.f355660a = r7
            r0.f355663d = r4
            java.lang.Object r0 = r7.mo63025b(r3, r0)
            if (r0 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0 = r7
        L_0x005b:
            r0.mo63026c(r3)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9834a.C129583d.mo109116a(h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo109117b() {
        Object obj = ((C71799m) this.f355668e).f191328a.f190532a;
        if (obj instanceof C71787a) {
            if (((C71787a) obj).f191310a != "OWNER_POSTPONE") {
                return;
            }
        } else if (!(obj instanceof C71794h) || ((C71794h) obj).owner != "OWNER_POSTPONE") {
            return;
        }
        C59052c cVar = (C59052c) f355666c.mo56224b();
        cVar.mo56379ah(new C59094n(38370));
        cVar.mo56386p("unlock postpone mutex to start postponed transitions");
        this.f355668e.mo63026c("OWNER_POSTPONE");
        m211584d((C71643cp) null);
    }

    /* renamed from: c */
    public final boolean mo109118c() {
        boolean z;
        C59052c cVar = (C59052c) f355666c.mo56224b();
        cVar.mo56379ah(new C59094n(38371));
        cVar.mo56386p("#postponeTransitions");
        C71788b bVar = this.f355668e;
        C71342e eVar = ((C71799m) bVar).f191328a;
        while (true) {
            Object obj = eVar.f190532a;
            z = false;
            if (obj instanceof C71787a) {
                if (((C71787a) obj).f191310a == C71800n.f191332d && this.f355668e.mo63027d("OWNER_POSTPONE")) {
                    z = true;
                }
            } else if (obj instanceof C71794h) {
                break;
            } else if (obj instanceof C71703ak) {
                ((C71703ak) obj).mo62930d(bVar);
            } else {
                new StringBuilder("Illegal state ").append(obj);
                throw new IllegalStateException("Illegal state ".concat(String.valueOf(obj)));
            }
        }
        if (z) {
            C59052c cVar2 = (C59052c) f355666c.mo56224b();
            cVar2.mo56379ah(new C59094n(38372));
            cVar2.mo56386p("launch postpone transitions timeout job");
            m211584d(C71803m.m105043d(this.f355667d, (C69585o) null, (C71424ay) null, new C129581b(this, (C69577g) null), 3));
        }
        return z;
    }
}
