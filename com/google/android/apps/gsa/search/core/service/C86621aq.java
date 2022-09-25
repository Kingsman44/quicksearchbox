package com.google.android.apps.gsa.search.core.service;

import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.service.aq */
/* compiled from: PG */
public final /* synthetic */ class C86621aq implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86626av f234004a;

    /* renamed from: b */
    public final /* synthetic */ Intent f234005b;

    public /* synthetic */ C86621aq(C86626av avVar, Intent intent) {
        this.f234004a = avVar;
        this.f234005b = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0296, code lost:
        if (r7 != false) goto L_0x0298;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0175 A[SYNTHETIC, Splitter:B:46:0x0175] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018a A[Catch:{ ct -> 0x01d9, all -> 0x02ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0202 A[Catch:{ ct -> 0x01d9, all -> 0x02ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0209 A[Catch:{ ct -> 0x01d9, all -> 0x02ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x021a A[Catch:{ ct -> 0x01d9, all -> 0x02ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "searchservice"
            com.google.android.apps.gsa.search.core.service.av r1 = r14.f234004a
            android.content.Intent r2 = r14.f234005b
            com.google.android.apps.gsa.shared.util.ac r3 = com.google.android.apps.gsa.shared.util.C90719ac.f253778a
            java.util.Random r3 = r3.f253779b
            long r3 = r3.nextLong()
            com.google.common.o.uf r5 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.tz r5 = (com.google.common.p4552o.C60548tz) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            int r7 = r6.f164093a
            r8 = 2
            r7 = r7 | r8
            r6.f164093a = r7
            r7 = 557(0x22d, float:7.8E-43)
            r6.f164258m = r7
            com.google.common.o.ed r6 = com.google.android.libraries.search.logging.p3043f.p3045b.C39194a.m68627b(r2)
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7
            r6.getClass()
            r7.f164134ao = r6
            int r6 = r7.f164249d
            r6 = r6 | 128(0x80, float:1.794E-43)
            r7.f164249d = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            int r7 = r6.f164093a
            r7 = r7 | 16
            r6.f164093a = r7
            r6.f164261p = r3
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            r6 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r5, r6, r6, r6)
            r5 = 561(0x231, float:7.86E-43)
            java.lang.String r7 = "com.google.android.search.core.action.ACTION_PROCESS_GENERIC_CLIENT_EVENT"
            java.lang.String r9 = r2.getAction()     // Catch:{ all -> 0x02ca }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x02ca }
            r9 = 0
            java.lang.String r11 = "SearchServiceCore"
            if (r7 == 0) goto L_0x0143
            java.lang.String r0 = "com.google.android.search.core.extra.EXTRA_GENERIC_CLIENT_EVENT"
            android.os.Parcelable r0 = r2.getParcelableExtra(r0)     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = (com.google.android.apps.gsa.search.shared.service.ClientEventData) r0     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x0090
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.service.C86626av.f234016a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x02ca }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02ca }
            r0.mo56378ag(r1, r11)     // Catch:{ all -> 0x02ca }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x02ca }
            r1 = 8433(0x20f1, float:1.1817E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x02ca }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x02ca }
            java.lang.String r1 = "Client event data is null. No task to perform!"
            r0.mo56386p(r1)     // Catch:{ all -> 0x02ca }
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x02ca }
            goto L_0x029b
        L_0x0090:
            com.google.common.b.ij r2 = com.google.android.apps.gsa.search.shared.service.C87678af.f237029e     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.shared.service.b.bw r7 = r0.f236955a     // Catch:{ all -> 0x02ca }
            int r7 = r7.f237480b     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.shared.service.b.bu r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r7)     // Catch:{ all -> 0x02ca }
            if (r7 != 0) goto L_0x009e
            com.google.android.apps.gsa.search.shared.service.b.bu r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN     // Catch:{ all -> 0x02ca }
        L_0x009e:
            boolean r2 = r2.contains(r7)     // Catch:{ all -> 0x02ca }
            if (r2 != 0) goto L_0x00ce
            com.google.common.f.e r1 = com.google.android.apps.gsa.search.core.service.C86626av.f234016a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x02ca }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02ca }
            r1.mo56378ag(r2, r11)     // Catch:{ all -> 0x02ca }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x02ca }
            r2 = 8432(0x20f0, float:1.1816E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x02ca }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = "Client event [%s] is not whitelisted"
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a     // Catch:{ all -> 0x02ca }
            int r0 = r0.f237480b     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.shared.service.b.bu r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r0)     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x00c7
            com.google.android.apps.gsa.search.shared.service.b.bu r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN     // Catch:{ all -> 0x02ca }
        L_0x00c7:
            r1.mo56389s(r2, r0)     // Catch:{ all -> 0x02ca }
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x02ca }
            goto L_0x029b
        L_0x00ce:
            com.google.android.apps.gsa.search.shared.service.b.bw r2 = r0.f236955a     // Catch:{ all -> 0x02ca }
            int r2 = r2.f237480b     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r2)     // Catch:{ all -> 0x02ca }
            if (r2 != 0) goto L_0x00da
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN     // Catch:{ all -> 0x02ca }
        L_0x00da:
            com.google.android.apps.gsa.search.shared.service.b.bu r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED     // Catch:{ all -> 0x02ca }
            if (r2 == r7) goto L_0x00e2
            com.google.android.apps.gsa.search.shared.service.b.bu r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.HOTWORD_TRIGGERED_ON_DSP     // Catch:{ all -> 0x02ca }
            if (r2 != r7) goto L_0x0136
        L_0x00e2:
            com.google.common.base.ax r2 = r1.f234035m     // Catch:{ all -> 0x02ca }
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.nga.api.bx r2 = (com.google.android.apps.gsa.nga.api.C74720bx) r2     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.nga.api.NgaState r2 = r2.mo71089f()     // Catch:{ all -> 0x02ca }
            boolean r2 = r2.b()     // Catch:{ all -> 0x02ca }
            if (r2 == 0) goto L_0x0127
            com.google.common.base.ax r1 = r1.f234036n     // Catch:{ all -> 0x02ca }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.nga.api.bq r1 = (com.google.android.apps.gsa.nga.api.bq) r1     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a     // Catch:{ all -> 0x02ca }
            int r0 = r0.f237480b     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.shared.service.b.bu r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r0)     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x0108
            com.google.android.apps.gsa.search.shared.service.b.bu r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN     // Catch:{ all -> 0x02ca }
        L_0x0108:
            r1.d(r0)     // Catch:{ all -> 0x02ca }
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.service.C86626av.f234016a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x02ca }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02ca }
            r0.mo56378ag(r1, r11)     // Catch:{ all -> 0x02ca }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x02ca }
            r1 = 8431(0x20ef, float:1.1814E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x02ca }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x02ca }
            java.lang.String r1 = "Skip handling generic client because action is redirected to Nga."
            r0.mo56386p(r1)     // Catch:{ all -> 0x02ca }
            goto L_0x029b
        L_0x0127:
            dagger.a r2 = r1.f234034l     // Catch:{ all -> 0x02ca }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.core.service.e.q r2 = (com.google.android.apps.gsa.search.core.service.p6848e.C86695q) r2     // Catch:{ all -> 0x02ca }
            java.lang.String r7 = "search"
            com.google.android.apps.gsa.search.shared.service.c.b.bb r11 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a     // Catch:{ all -> 0x02ca }
            r2.mo80275j(r7, r11)     // Catch:{ all -> 0x02ca }
        L_0x0136:
            dagger.a r1 = r1.f234028f     // Catch:{ all -> 0x02ca }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.core.service.af r1 = (com.google.android.apps.gsa.search.core.service.C86610af) r1     // Catch:{ all -> 0x02ca }
            r1.mo80224e(r9, r0)     // Catch:{ all -> 0x02ca }
            goto L_0x029b
        L_0x0143:
            java.lang.String r7 = "com.google.android.search.core.action.ACTION_START_SESSION"
            java.lang.String r12 = r2.getAction()     // Catch:{ all -> 0x02ca }
            boolean r7 = r7.equals(r12)     // Catch:{ all -> 0x02ca }
            if (r7 == 0) goto L_0x0235
            android.net.Uri r2 = r2.getData()     // Catch:{ all -> 0x02ca }
            java.lang.String r7 = r2.getScheme()     // Catch:{ all -> 0x02ca }
            boolean r7 = r0.equals(r7)     // Catch:{ all -> 0x02ca }
            java.lang.String r9 = "/session"
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = r2.getPath()     // Catch:{ all -> 0x02ca }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x02ca }
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = "sessionType"
            java.lang.String r7 = r2.getQueryParameter(r7)     // Catch:{ all -> 0x02ca }
            goto L_0x0171
        L_0x0170:
            r7 = r6
        L_0x0171:
            java.lang.String r10 = "SSIDataUriParser"
            if (r7 != 0) goto L_0x018a
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.shared.service.C87679ag.f237030a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x02ca }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02ca }
            r0.mo56378ag(r2, r10)     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = "No session type found"
            r7 = 9773(0x262d, float:1.3695E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r2)     // Catch:{ all -> 0x02ca }
        L_0x0187:
            r2 = r6
            goto L_0x0207
        L_0x018a:
            java.lang.String r12 = r2.getScheme()     // Catch:{ all -> 0x02ca }
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x02ca }
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = r2.getPath()     // Catch:{ all -> 0x02ca }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x019f
            goto L_0x01ed
        L_0x019f:
            java.lang.String r0 = "sessionContext"
            java.lang.String r0 = r2.getQueryParameter(r0)     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x01ba
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.shared.service.C87679ag.f237030a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x02ca }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02ca }
            r0.mo56378ag(r2, r10)     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = "No session context provided."
            r9 = 9776(0x2630, float:1.3699E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56386p(r2)     // Catch:{ all -> 0x02ca }
            goto L_0x01ff
        L_0x01ba:
            com.google.android.apps.gsa.search.shared.service.c.b.bb r2 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a     // Catch:{ ct -> 0x01d9 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ ct -> 0x01d9 }
            com.google.android.apps.gsa.search.shared.service.c.b.ba r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba) r2     // Catch:{ ct -> 0x01d9 }
            r9 = 11
            byte[] r0 = android.util.Base64.decode(r0, r9)     // Catch:{ ct -> 0x01d9 }
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x01d9 }
            com.google.protobuf.b r0 = r2.mergeFrom((byte[]) r0, (com.google.protobuf.C62921ba) r9)     // Catch:{ ct -> 0x01d9 }
            com.google.android.apps.gsa.search.shared.service.c.b.ba r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba) r0     // Catch:{ ct -> 0x01d9 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ ct -> 0x01d9 }
            com.google.android.apps.gsa.search.shared.service.c.b.bb r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb) r0     // Catch:{ ct -> 0x01d9 }
            goto L_0x0200
        L_0x01d9:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.shared.service.C87679ag.f237030a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x02ca }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02ca }
            r2.mo56378ag(r9, r10)     // Catch:{ all -> 0x02ca }
            java.lang.String r9 = "Failed to parse the proto."
            r10 = 9775(0x262f, float:1.3698E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x02ca }
            goto L_0x01ff
        L_0x01ed:
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.shared.service.C87679ag.f237030a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x02ca }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02ca }
            r0.mo56378ag(r2, r10)     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = "Invalid scheme or path"
            r9 = 9774(0x262e, float:1.3696E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56386p(r2)     // Catch:{ all -> 0x02ca }
        L_0x01ff:
            r0 = r6
        L_0x0200:
            if (r0 == 0) goto L_0x0187
            com.google.android.apps.gsa.search.shared.service.e r2 = new com.google.android.apps.gsa.search.shared.service.e     // Catch:{ all -> 0x02ca }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x02ca }
        L_0x0207:
            if (r2 == 0) goto L_0x021a
            dagger.a r0 = r1.f234034l     // Catch:{ all -> 0x02ca }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.core.service.e.q r0 = (com.google.android.apps.gsa.search.core.service.p6848e.C86695q) r0     // Catch:{ all -> 0x02ca }
            java.lang.String r1 = r2.f239197a     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.shared.service.c.b.bb r2 = r2.f239198b     // Catch:{ all -> 0x02ca }
            r0.mo80275j(r1, r2)     // Catch:{ all -> 0x02ca }
            goto L_0x029b
        L_0x021a:
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.service.C86626av.f234016a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x02ca }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02ca }
            r0.mo56378ag(r1, r11)     // Catch:{ all -> 0x02ca }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x02ca }
            r1 = 8430(0x20ee, float:1.1813E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x02ca }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x02ca }
            java.lang.String r1 = "Unable to start a session"
            r0.mo56386p(r1)     // Catch:{ all -> 0x02ca }
            goto L_0x029b
        L_0x0235:
            dagger.a r0 = r1.f234030h     // Catch:{ all -> 0x02ca }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.search.core.state.d.bo r0 = (com.google.android.apps.gsa.search.core.state.p6872d.C86948bo) r0     // Catch:{ all -> 0x02ca }
            int r1 = r0.f234852j     // Catch:{ all -> 0x02ca }
            r7 = 1
            r11 = 0
            if (r1 != r7) goto L_0x0246
            r0.f234852j = r8     // Catch:{ all -> 0x02ca }
            goto L_0x0247
        L_0x0246:
            r7 = 0
        L_0x0247:
            java.lang.String r1 = r2.getAction()     // Catch:{ all -> 0x02ca }
            if (r1 == 0) goto L_0x0296
            java.lang.String r1 = r2.getAction()     // Catch:{ all -> 0x02ca }
            int r12 = r1.hashCode()     // Catch:{ all -> 0x02ca }
            r13 = 1600111666(0x5f5fc432, float:1.6124068E19)
            if (r12 == r13) goto L_0x025b
            goto L_0x0265
        L_0x025b:
            java.lang.String r12 = "com.google.android.search.core.action.DEVICE_LOCKED_STATE_CHANGE"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0265
            r1 = 0
            goto L_0x0266
        L_0x0265:
            r1 = -1
        L_0x0266:
            if (r1 == 0) goto L_0x0287
            android.content.Intent r1 = r0.f234851i     // Catch:{ all -> 0x02ca }
            if (r1 == 0) goto L_0x027d
            java.lang.String r1 = r1.getAction()     // Catch:{ all -> 0x02ca }
            com.google.common.f.e r7 = com.google.android.apps.gsa.search.core.state.p6872d.C86948bo.f234843a     // Catch:{ all -> 0x02ca }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x02ca }
            java.lang.String r11 = "Dropping unhandled serviceIntent with action: %s"
            r12 = 9238(0x2416, float:1.2945E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r12)).mo56389s(r11, r1)     // Catch:{ all -> 0x02ca }
        L_0x027d:
            r0.f234851i = r2     // Catch:{ all -> 0x02ca }
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r0.f234848f     // Catch:{ all -> 0x02ca }
            r11 = 64
            r1.mo85049c(r9, r11)     // Catch:{ all -> 0x02ca }
            goto L_0x0298
        L_0x0287:
            java.lang.String r1 = "com.google.android.search.core.extra.IS_LOCKED"
            boolean r1 = r2.getBooleanExtra(r1, r11)     // Catch:{ all -> 0x02ca }
            boolean r2 = r0.f234847e     // Catch:{ all -> 0x02ca }
            if (r2 == r1) goto L_0x0296
            r0.f234847e = r1     // Catch:{ all -> 0x02ca }
            r0.mo80591ar()     // Catch:{ all -> 0x02ca }
        L_0x0296:
            if (r7 == 0) goto L_0x029b
        L_0x0298:
            r0.mo80591ar()     // Catch:{ all -> 0x02ca }
        L_0x029b:
            com.google.common.o.uf r0 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.tz r0 = (com.google.common.p4552o.C60548tz) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r2 = r1.f164093a
            r2 = r2 | r8
            r1.f164093a = r2
            r1.f164258m = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r2 = r1.f164093a
            r2 = r2 | 16
            r1.f164093a = r2
            r1.f164261p = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r6, r6, r6)
            return
        L_0x02ca:
            r0 = move-exception
            com.google.common.o.uf r1 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            int r7 = r2.f164093a
            r7 = r7 | r8
            r2.f164093a = r7
            r2.f164258m = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            int r5 = r2.f164093a
            r5 = r5 | 16
            r2.f164093a = r5
            r2.f164261p = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r6, r6, r6)
            goto L_0x02fb
        L_0x02fa:
            throw r0
        L_0x02fb:
            goto L_0x02fa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.C86621aq.run():void");
    }
}
