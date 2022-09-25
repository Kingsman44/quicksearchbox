package com.google.android.apps.gsa.staticplugins.p7714cv.p7723g;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.C90604l;
import com.google.android.apps.gsa.speech.p7294j.C92435e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.g.r */
/* compiled from: PG */
public final class C98771r implements C98769p, C98760g {

    /* renamed from: a */
    private final C92435e f275910a;

    /* renamed from: b */
    private final List f275911b = new ArrayList();

    /* renamed from: c */
    private final C98770q f275912c;

    /* renamed from: d */
    private final C58833ax f275913d;

    /* renamed from: e */
    private final u f275914e;

    /* renamed from: f */
    private boolean f275915f;

    /* renamed from: g */
    private final C98763j f275916g;

    public C98771r(C98763j jVar, C92435e eVar, C98770q qVar, u uVar, C58833ax axVar) {
        this.f275910a = eVar;
        this.f275912c = qVar;
        this.f275916g = jVar;
        this.f275913d = axVar;
        this.f275914e = uVar;
    }

    /* renamed from: d */
    private final void m163622d(int i) {
        if (!this.f275915f) {
            this.f275915f = true;
            if (i == 1) {
                C89949q.m146523g(70);
            } else if (i == 2) {
                C89949q.m146523g(71);
            } else {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo91292a(C90603k kVar) {
        C90604l lVar = (C90604l) kVar;
        int i = lVar.f253274c;
        C58976aa aaVar = C58975e.f156826a;
        C98770q qVar = this.f275912c;
        if (qVar.f275909a.contains(Integer.valueOf(i))) {
            if (((Integer) qVar.f275909a.get(0)).intValue() == i) {
                m163622d(i);
                mo91297c(lVar.f253275a);
                return;
            }
            this.f275911b.add(lVar);
        }
    }

    /* renamed from: b */
    public final void mo91294b() {
        for (C90604l lVar : this.f275911b) {
            m163622d(lVar.f253274c);
            mo91297c(lVar.f253275a);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b A[LOOP:0: B:26:0x0085->B:28:0x008b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91297c(com.google.speech.p5208h.C66611ci r11) {
        /*
            r10 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.IN_PROGRESS
            int r0 = r11.f181209b
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.m97260a(r0)
            if (r0 != 0) goto L_0x000e
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.IN_PROGRESS
        L_0x000e:
            int r0 = r0.ordinal()
            r1 = 0
            java.lang.String r2 = "S3RecognitionResponseP"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r5) goto L_0x002c
            if (r0 == r4) goto L_0x0024
            if (r0 == r3) goto L_0x0021
            goto L_0x007b
        L_0x0021:
            java.lang.String r0 = ""
            goto L_0x003b
        L_0x0024:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "S3Status.DONE_ERROR should be propagated as a ServerRecognizeException"
            r11.<init>(r0)
            throw r11
        L_0x002c:
            r0 = 10
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r0)
            com.google.android.apps.gsa.c.f.u r0 = r10.f275914e
            com.google.common.base.ax r6 = r10.f275913d
            r0.g(r2, r6, r1)
            goto L_0x007b
        L_0x0039:
            java.lang.String r0 = "IN_PROGRESS"
        L_0x003b:
            com.google.common.base.C58879cp.m90962d(r0)
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67238p.f182737f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r11.mo58887l(r0)
            com.google.protobuf.bf r6 = r11.f169962ag
            com.google.protobuf.bs r7 = r0.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x0054
            java.lang.Object r0 = r0.f169969b
            goto L_0x0058
        L_0x0054:
            java.lang.Object r0 = r0.mo58889c(r6)
        L_0x0058:
            com.google.speech.k.a.p r0 = (com.google.speech.p5224k.p5225a.C67238p) r0
            int r6 = r0.f182740b
            if (r6 != r5) goto L_0x0063
            java.lang.Object r0 = r0.f182741c
            com.google.speech.recognizer.a.ag r0 = (com.google.speech.recognizer.p5233a.C67438ag) r0
            goto L_0x0065
        L_0x0063:
            com.google.speech.recognizer.a.ag r0 = com.google.speech.recognizer.p5233a.C67438ag.f183256k
        L_0x0065:
            int r0 = r0.f183259b
            int r0 = com.google.speech.recognizer.p5233a.C67437af.m97466a(r0)
            if (r0 == 0) goto L_0x007b
            if (r0 != r4) goto L_0x007b
            r0 = 11
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r0)
            com.google.android.apps.gsa.c.f.u r0 = r10.f275914e
            com.google.common.base.ax r6 = r10.f275913d
            r0.h(r2, r6)
        L_0x007b:
            com.google.android.apps.gsa.staticplugins.cv.g.j r0 = r10.f275916g
            com.google.android.apps.gsa.speech.j.e r2 = r10.f275910a
            com.google.protobuf.cq r6 = r11.f181213f
            java.util.Iterator r6 = r6.iterator()
        L_0x0085:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00a7
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.p7714cv.p7723g.C98763j.f275899a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r9 = 31103(0x797f, float:4.3585E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r9)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            java.lang.String r9 = "DBG: %s"
            r8.mo56389s(r9, r7)
            goto L_0x0085
        L_0x00a7:
            int r6 = r11.f181209b
            com.google.speech.h.ch r6 = com.google.speech.p5208h.C66610ch.m97260a(r6)
            if (r6 != 0) goto L_0x00b1
            com.google.speech.h.ch r6 = com.google.speech.p5208h.C66610ch.IN_PROGRESS
        L_0x00b1:
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x00ef
            if (r6 == r5) goto L_0x00eb
            if (r6 == r4) goto L_0x00e3
            if (r6 == r3) goto L_0x00be
            goto L_0x012b
        L_0x00be:
            com.google.common.f.e r11 = com.google.android.apps.gsa.staticplugins.p7714cv.p7723g.C98763j.f275899a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r3 = "NOT_STARTED received"
            r4 = 31102(0x797e, float:4.3583E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.shared.speech.a.n r11 = new com.google.android.apps.gsa.shared.speech.a.n
            r11.<init>(r1)
            dagger.a r0 = r0.f275900b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r0 = (com.google.android.apps.gsa.shared.logger.C89911f) r0
            com.google.android.apps.gsa.shared.logger.e r0 = r0.mo83756b(r11)
            r0.mo83721a()
            r2.mo87095a(r11)
            return
        L_0x00e3:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Error S3Response received via onResult"
            r11.<init>(r0)
            throw r11
        L_0x00eb:
            r2.mo87104j()
            return
        L_0x00ef:
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67238p.f182737f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r11.mo58887l(r0)
            com.google.protobuf.bf r1 = r11.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x012b
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67238p.f182737f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r11.mo58887l(r0)
            com.google.protobuf.bf r11 = r11.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r11 = r11.mo58854l(r1)
            if (r11 != 0) goto L_0x0118
            java.lang.Object r11 = r0.f169969b
            goto L_0x011c
        L_0x0118:
            java.lang.Object r11 = r0.mo58889c(r11)
        L_0x011c:
            com.google.speech.k.a.p r11 = (com.google.speech.p5224k.p5225a.C67238p) r11
            int r0 = r11.f182740b
            if (r0 != r5) goto L_0x012b
            java.lang.Object r0 = r11.f182741c
            com.google.speech.recognizer.a.ag r0 = (com.google.speech.recognizer.p5233a.C67438ag) r0
            java.lang.String r11 = r11.f182742d
            r2.mo87114t(r0, r11)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7714cv.p7723g.C98771r.mo91297c(com.google.speech.h.ci):void");
    }
}
