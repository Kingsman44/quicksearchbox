package com.google.android.apps.gsa.speech.hotword.p7285c;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.audio.C92196g;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92444a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92452i;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66615cm;
import dagger.C68214a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.f */
/* compiled from: PG */
public final class C92373f implements C92372e {

    /* renamed from: a */
    private static final C59071e f257565a = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.c.f");

    /* renamed from: b */
    private final C89994f f257566b;

    /* renamed from: c */
    private final C68214a f257567c;

    /* renamed from: d */
    private final C92302a f257568d;

    /* renamed from: e */
    private final C90931ca f257569e;

    /* renamed from: f */
    private final C68214a f257570f;

    /* renamed from: g */
    private final C68214a f257571g;

    /* renamed from: h */
    private final C68214a f257572h;

    /* renamed from: i */
    private final C68214a f257573i;

    /* renamed from: j */
    private final C68214a f257574j;

    /* renamed from: k */
    private final String f257575k;

    /* renamed from: l */
    private final C92196g f257576l;

    /* renamed from: m */
    private final String f257577m;

    public C92373f(C89994f fVar, C68214a aVar, C92302a aVar2, C90931ca caVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, String str, C92196g gVar, String str2) {
        this.f257566b = fVar;
        this.f257567c = aVar;
        this.f257568d = aVar2;
        this.f257569e = caVar;
        this.f257570f = aVar3;
        this.f257571g = aVar4;
        this.f257572h = aVar5;
        this.f257573i = aVar6;
        this.f257574j = aVar7;
        this.f257575k = str;
        this.f257576l = gVar;
        this.f257577m = str2;
    }

    /* renamed from: b */
    private final C66599by m151706b() {
        C58976aa aaVar = C58975e.f156826a;
        try {
            return (C66599by) C90877ak.m148473g(this.f257569e.mo85138c(new C92448e(this.f257566b, this.f257575k, (C92461a) this.f257570f.mo27525b(), (String) null, (amo) null, (String) null, (String) null)), 1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final C66615cm m151707c(Account account, C66595bu buVar) {
        String str;
        if (!TextUtils.isEmpty(this.f257577m)) {
            str = this.f257577m;
        } else {
            str = this.f257566b.mo83863Z();
            C58976aa aaVar = C58975e.f156826a;
        }
        C59104x b = f257565a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "S3UtteranceSender");
        ((C59052c) ((C59052c) b).mo56372aa(12558)).mo56389s("Enrollment locale is %s", str);
        C90931ca caVar = this.f257569e;
        C92444a aVar = new C92444a();
        aVar.mo87128d(this.f257568d);
        aVar.mo87130f(this.f257566b);
        aVar.f257825f = C58833ax.m90834k(str);
        aVar.f257826g = C58833ax.m90834k(str);
        aVar.f257827h = C58833ax.m90834k(this.f257566b.mo83890aj());
        aVar.f257829j = C58833ax.m90833j(account);
        aVar.f257830k = C58833ax.m90833j(buVar);
        try {
            return (C66615cm) C90877ak.m148473g(caVar.mo85138c(new C92452i(aVar.mo87125a())), 1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            C59104x c = f257565a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "S3UtteranceSender");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12553)).mo56386p("Unable to fetch S3UserInfo with AuthToken; Exception");
            C59104x c2 = f257565a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "S3UtteranceSender");
            ((C59052c) ((C59052c) c2).mo56372aa(12554)).mo56386p("Null S3UserInfo");
            return null;
        } catch (TimeoutException e2) {
            C59104x c3 = f257565a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "S3UtteranceSender");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(12555)).mo56386p("Timeout for S3UserInfo fetch with AuthToken; Exception");
            C59104x c22 = f257565a.mo56225c();
            c22.mo56378ag(C58975e.f156826a, "S3UtteranceSender");
            ((C59052c) ((C59052c) c22).mo56372aa(12554)).mo56386p("Null S3UserInfo");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: com.google.android.apps.gsa.s3.a.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v65, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: java.util.Map} */
    /* JADX WARNING: type inference failed for: r14v9, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: type inference failed for: r14v15 */
    /* JADX WARNING: type inference failed for: r14v25, types: [com.google.common.f.a, com.google.common.f.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e0 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87036a(java.lang.String r22, com.google.speech.p5208h.C66595bu r23, com.google.android.apps.gsa.speech.audio.C92173d r24) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r0 = r24
            com.google.common.f.e r3 = f257565a
            com.google.common.f.x r4 = r3.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "S3UtteranceSender"
            r4.mo56378ag(r5, r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 12565(0x3115, float:1.7607E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r5 = "send account: %s, audioType: %s"
            r4.mo56354G(r5, r2, r0)
            com.google.android.apps.gsa.shared.m.b.f r4 = r1.f257566b
            int r4 = r4.mo83854Q(r2)
            r5 = 5
            if (r4 >= r5) goto L_0x0366
            dagger.a r4 = r1.f257571g
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.aa.bh r4 = (com.google.android.apps.gsa.shared.p6968aa.C89037bh) r4
            com.google.android.apps.gsa.shared.aa.r r4 = r4.mo27377b()
            boolean r4 = r4.mo83040a()
            if (r4 == 0) goto L_0x0366
            com.google.android.apps.gsa.speech.audio.g r4 = r1.f257576l
            com.google.android.apps.gsa.speech.audio.e r5 = com.google.android.apps.gsa.speech.audio.C92185e.f257011b
            com.google.android.apps.gsa.speech.audio.f r4 = r4.mo86868a(r5)
            java.util.Map r4 = r4.mo86862i(r2, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0354
            com.google.android.apps.gsa.z.f.a.a r0 = new com.google.android.apps.gsa.z.f.a.a
            com.google.android.apps.gsa.shared.m.b.f r3 = r1.f257566b
            dagger.a r5 = r1.f257572h
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.z r5 = (com.google.android.apps.gsa.search.core.p6805i.C86130z) r5
            dagger.a r8 = r1.f257573i
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.google.cq r8 = (com.google.android.apps.gsa.search.core.google.C85923cq) r8
            dagger.a r9 = r1.f257574j
            r0.<init>(r3, r5, r8, r9)
            com.google.al.c.c.b.ai r3 = r0.mo104107b()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r5 = r0.iterator()
            r0 = 1
        L_0x0075:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0320
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r4.get(r9)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x0075
            java.util.Iterator r10 = r10.iterator()
        L_0x008d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x031c
            java.lang.Object r11 = r10.next()
            java.io.File r11 = (java.io.File) r11
            java.lang.String r12 = r11.getName()
            com.google.android.apps.gsa.shared.m.b.f r13 = r1.f257566b
            boolean r13 = r13.mo83873aJ(r12)
            if (r13 != 0) goto L_0x0309
            com.google.common.l.ac r13 = new com.google.common.l.ac     // Catch:{ IOException -> 0x02e6 }
            r13.<init>(r11)     // Catch:{ IOException -> 0x02e6 }
            byte[] r11 = r13.mo56803a()     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.gsa.speech.helper.a r13 = r1.f257568d     // Catch:{ IOException -> 0x02e6 }
            android.accounts.Account r13 = r13.mo79689w(r2)     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r15 = ""
            com.google.android.apps.gsa.shared.aa.aq r15 = com.google.android.apps.gsa.p6487s3.C84334w.m134551a(r3, r15)     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            com.google.android.apps.gsa.shared.aa.ar r15 = r15.mo82989a()     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            com.google.android.apps.gsa.shared.aa.bk r14 = new com.google.android.apps.gsa.shared.aa.bk     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            dagger.a r7 = r1.f257567c     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            com.google.android.apps.gsa.shared.aa.aj r7 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r7     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            com.google.android.apps.gsa.shared.aa.h r7 = r7.mo27509a()     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            r14.<init>(r7)     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            com.google.android.apps.gsa.s3.a.c r7 = new com.google.android.apps.gsa.s3.a.c     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            java.lang.String r8 = r3.f29402f     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            r7.<init>(r14, r8)     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            dagger.a r8 = r1.f257567c     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            com.google.android.apps.gsa.shared.aa.aj r8 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r8     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            r17 = r0
            dagger.a r0 = r1.f257567c     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            com.google.android.apps.gsa.shared.aa.aj r0 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r0     // Catch:{ InterruptedException -> 0x02c2, ExecutionException -> 0x02b1, all -> 0x02a7 }
            r18 = r3
            com.google.android.apps.gsa.shared.aa.v r3 = com.google.android.apps.gsa.shared.p6968aa.C89066v.f241382a     // Catch:{ InterruptedException -> 0x02a5, ExecutionException -> 0x02a3, all -> 0x02a1 }
            com.google.android.apps.gsa.shared.aa.q r0 = r0.mo27510b(r3)     // Catch:{ InterruptedException -> 0x02a5, ExecutionException -> 0x02a3, all -> 0x02a1 }
            com.google.common.util.concurrent.cx r3 = r8.mo27495f(r15, r14, r0)     // Catch:{ InterruptedException -> 0x02a5, ExecutionException -> 0x02a3, all -> 0x02a1 }
            com.google.speech.h.cd r0 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197403a()     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            java.lang.String r8 = "audio-logging"
            r0.copyOnWrite()     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            com.google.protobuf.bv r14 = r0.instance     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            com.google.speech.h.ce r14 = (com.google.speech.p5208h.C66607ce) r14     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            com.google.speech.h.ce r15 = com.google.speech.p5208h.C66607ce.f181191f     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            int r15 = r14.f181193a     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            r16 = 1
            r15 = r15 | 1
            r14.f181193a = r15     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            r14.f181194b = r8     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            r8 = r23
            com.google.speech.h.cm r13 = r1.m151707c(r13, r8)     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            if (r13 == 0) goto L_0x011a
            com.google.protobuf.bt r14 = com.google.speech.p5208h.C66615cm.f181221k     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            r0.mo58885m(r14, r13)     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
        L_0x011a:
            com.google.speech.recognizer.a.at r13 = com.google.android.apps.gsa.speech.hotword.C92350b.f257469a     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            com.google.speech.h.l r14 = com.google.speech.p5208h.C66678l.f181384f     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            com.google.speech.h.k r14 = (com.google.speech.p5208h.C66677k) r14     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            r14.copyOnWrite()     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            com.google.protobuf.bv r15 = r14.instance     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            com.google.speech.h.l r15 = (com.google.speech.p5208h.C66678l) r15     // Catch:{ InterruptedException -> 0x0299, ExecutionException -> 0x0291, all -> 0x028b }
            r19 = r4
            int r4 = r13.f183321p     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            r15.f181389b = r4     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            int r4 = r15.f181388a     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            r16 = 1
            r4 = r4 | 1
            r15.f181388a = r4     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            int r4 = com.google.android.libraries.p590as.p591a.C10771e.m25764a(r13)     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            float r4 = (float) r4     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            r14.copyOnWrite()     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            com.google.protobuf.bv r13 = r14.instance     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            com.google.speech.h.l r13 = (com.google.speech.p5208h.C66678l) r13     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            int r15 = r13.f181388a     // Catch:{ InterruptedException -> 0x0289, ExecutionException -> 0x0287, all -> 0x0285 }
            r20 = r5
            r5 = 2
            r15 = r15 | r5
            r13.f181388a = r15     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r13.f181390c = r4     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bv r4 = r14.build()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.l r4 = (com.google.speech.p5208h.C66678l) r4     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bt r13 = com.google.speech.p5208h.C66678l.f181386h     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r0.mo58885m(r13, r4)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.k.a.v r4 = com.google.speech.p5224k.p5225a.C67244v.f182771s     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.k.a.q r4 = (com.google.speech.p5224k.p5225a.C67239q) r4     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.android.apps.gsa.speech.audio.d r13 = com.google.android.apps.gsa.speech.audio.C92173d.m151313a(r9)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            int r14 = r13.ordinal()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            if (r14 == r5) goto L_0x0175
            r5 = 3
            if (r14 == r5) goto L_0x0172
            com.google.speech.k.a.t r5 = com.google.speech.p5224k.p5225a.C67242t.ENROLLMENT     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            goto L_0x0177
        L_0x0172:
            com.google.speech.k.a.t r5 = com.google.speech.p5224k.p5225a.C67242t.ENROLLMENT_TISID     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            goto L_0x0177
        L_0x0175:
            com.google.speech.k.a.t r5 = com.google.speech.p5224k.p5225a.C67242t.ENROLLMENT_GOOGLE_HOME     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
        L_0x0177:
            com.google.common.f.e r14 = f257565a     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.common.f.x r15 = r14.mo56224b()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r15.mo56378ag(r8, r6)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.common.f.c r15 = (com.google.common.p4526f.C59052c) r15     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r8 = 12556(0x310c, float:1.7595E-41)
            com.google.common.f.x r8 = r15.mo56372aa(r8)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            java.lang.String r15 = "audioType-%s preambleType-%s"
            r8.mo56354G(r15, r13, r5)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.k.a.u r8 = com.google.speech.p5224k.p5225a.C67243u.f182767c     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.k.a.r r8 = (com.google.speech.p5224k.p5225a.C67240r) r8     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r8.copyOnWrite()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bv r13 = r8.instance     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.k.a.u r13 = (com.google.speech.p5224k.p5225a.C67243u) r13     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            int r5 = r5.f182766u     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r13.f182770b = r5     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            int r5 = r13.f182769a     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r15 = 1
            r5 = r5 | r15
            r13.f182769a = r5     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bv r5 = r8.build()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.k.a.u r5 = (com.google.speech.p5224k.p5225a.C67243u) r5     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r4.copyOnWrite()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bv r8 = r4.instance     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.k.a.v r8 = (com.google.speech.p5224k.p5225a.C67244v) r8     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r5.getClass()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r8.f182787n = r5     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            int r5 = r8.f182774a     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 | r13
            r8.f182774a = r5     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.k.a.v r4 = (com.google.speech.p5224k.p5225a.C67244v) r4     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bt r5 = com.google.speech.p5224k.p5225a.C67244v.f182772t     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r0.mo58885m(r5, r4)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.ag r4 = com.google.speech.p5208h.C66550ag.f180992c     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.af r4 = (com.google.speech.p5208h.C66549af) r4     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r4.copyOnWrite()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.ag r5 = (com.google.speech.p5208h.C66550ag) r5     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            int r8 = r5.f180995a     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r13 = 1
            r8 = r8 | r13
            r5.f180995a = r8     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r5.f180996b = r13     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.ag r4 = (com.google.speech.p5208h.C66550ag) r4     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.protobuf.bt r5 = com.google.speech.p5208h.C66550ag.f180993d     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r0.mo58885m(r5, r4)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.by r4 = r21.m151706b()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            if (r4 == 0) goto L_0x01fb
            com.google.protobuf.bt r5 = com.google.speech.p5208h.C66599by.f181160q     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r0.mo58885m(r5, r4)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
        L_0x01fb:
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.ce r0 = (com.google.speech.p5208h.C66607ce) r0     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r4 = 0
            r7.mo77820a(r0, r4)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.recognizer.a.at r0 = com.google.android.apps.gsa.speech.hotword.C92350b.f257469a     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.android.libraries.as.a.d r0 = com.google.android.libraries.p590as.p591a.C10770d.m25763a(r0)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            byte[] r0 = com.google.android.libraries.p590as.p591a.C10771e.m25769f(r0, r11)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            int r4 = r0.length     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.ce r0 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197406d(r0, r4)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r4 = 0
            r7.mo77820a(r0, r4)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.ce r0 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197405c()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r4 = 1
            r7.mo77820a(r0, r4)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r3)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.android.apps.gsa.shared.aa.m r0 = (com.google.android.apps.gsa.shared.p6968aa.C89057m) r0     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.android.apps.gsa.shared.aa.i r0 = r0.mo83034a()     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.android.apps.gsa.s3.a.d r4 = new com.google.android.apps.gsa.s3.a.d     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.android.apps.gsa.shared.aa.ae r5 = new com.google.android.apps.gsa.shared.aa.ae     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r5.<init>(r0)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x0283, ExecutionException -> 0x0281, all -> 0x027f }
            com.google.speech.h.ci r0 = r4.mo77821a()     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            int r0 = r0.f181209b     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.m97260a(r0)     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            if (r0 != 0) goto L_0x0242
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.IN_PROGRESS     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
        L_0x0242:
            com.google.speech.h.ch r5 = com.google.speech.p5208h.C66610ch.DONE_SUCCESS     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            if (r0 != r5) goto L_0x026e
            com.google.common.f.x r0 = r14.mo56224b()     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            r0.mo56378ag(r5, r6)     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            r5 = 12564(0x3114, float:1.7606E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            java.lang.String r5 = "Enrollment utterance sent successfully."
            r0.mo56386p(r5)     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            com.google.common.p4541l.C59337t.m92223c(r4)     // Catch:{ IOException -> 0x02e4 }
            if (r3 == 0) goto L_0x0267
            r4 = 1
            r3.cancel(r4)     // Catch:{ IOException -> 0x02e2 }
        L_0x0267:
            com.google.android.apps.gsa.shared.m.b.f r0 = r1.f257566b     // Catch:{ IOException -> 0x02e4 }
            r0.mo83896ap(r12)     // Catch:{ IOException -> 0x02e4 }
            goto L_0x0311
        L_0x026e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            java.lang.String r5 = "Wrong response"
            r0.<init>(r5)     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
            throw r0     // Catch:{ InterruptedException -> 0x027c, ExecutionException -> 0x0279, all -> 0x0276 }
        L_0x0276:
            r0 = move-exception
            goto L_0x02d5
        L_0x0279:
            r0 = move-exception
            r14 = r3
            goto L_0x02ba
        L_0x027c:
            r0 = move-exception
            r14 = r3
            goto L_0x02cb
        L_0x027f:
            r0 = move-exception
            goto L_0x02af
        L_0x0281:
            r0 = move-exception
            goto L_0x0296
        L_0x0283:
            r0 = move-exception
            goto L_0x029e
        L_0x0285:
            r0 = move-exception
            goto L_0x028e
        L_0x0287:
            r0 = move-exception
            goto L_0x0294
        L_0x0289:
            r0 = move-exception
            goto L_0x029c
        L_0x028b:
            r0 = move-exception
            r19 = r4
        L_0x028e:
            r20 = r5
            goto L_0x02af
        L_0x0291:
            r0 = move-exception
            r19 = r4
        L_0x0294:
            r20 = r5
        L_0x0296:
            r14 = r3
            r4 = 0
            goto L_0x02ba
        L_0x0299:
            r0 = move-exception
            r19 = r4
        L_0x029c:
            r20 = r5
        L_0x029e:
            r14 = r3
            r4 = 0
            goto L_0x02cb
        L_0x02a1:
            r0 = move-exception
            goto L_0x02aa
        L_0x02a3:
            r0 = move-exception
            goto L_0x02b4
        L_0x02a5:
            r0 = move-exception
            goto L_0x02c5
        L_0x02a7:
            r0 = move-exception
            r18 = r3
        L_0x02aa:
            r19 = r4
            r20 = r5
            r3 = 0
        L_0x02af:
            r14 = 0
            goto L_0x02d6
        L_0x02b1:
            r0 = move-exception
            r18 = r3
        L_0x02b4:
            r19 = r4
            r20 = r5
            r4 = 0
            r14 = 0
        L_0x02ba:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x02d3 }
            java.lang.String r5 = "Unexpected failure."
            r3.<init>(r5, r0)     // Catch:{ all -> 0x02d3 }
            throw r3     // Catch:{ all -> 0x02d3 }
        L_0x02c2:
            r0 = move-exception
            r18 = r3
        L_0x02c5:
            r19 = r4
            r20 = r5
            r4 = 0
            r14 = 0
        L_0x02cb:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x02d3 }
            java.lang.String r5 = "Interrupted."
            r3.<init>(r5, r0)     // Catch:{ all -> 0x02d3 }
            throw r3     // Catch:{ all -> 0x02d3 }
        L_0x02d3:
            r0 = move-exception
            r3 = r14
        L_0x02d5:
            r14 = r4
        L_0x02d6:
            com.google.common.p4541l.C59337t.m92223c(r14)     // Catch:{ IOException -> 0x02e4 }
            if (r3 == 0) goto L_0x02e0
            r4 = 1
            r3.cancel(r4)     // Catch:{ IOException -> 0x02e2 }
            goto L_0x02e1
        L_0x02e0:
            r4 = 1
        L_0x02e1:
            throw r0     // Catch:{ IOException -> 0x02e2 }
        L_0x02e2:
            r0 = move-exception
            goto L_0x02ee
        L_0x02e4:
            r0 = move-exception
            goto L_0x02ed
        L_0x02e6:
            r0 = move-exception
            r18 = r3
            r19 = r4
            r20 = r5
        L_0x02ed:
            r4 = 1
        L_0x02ee:
            com.google.common.f.e r3 = f257565a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r5, r6)
            java.lang.String r5 = "Unable to send enrollment utterance"
            r7 = 12570(0x311a, float:1.7614E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r7)).mo56386p(r5)
            r3 = r18
            r4 = r19
            r5 = r20
            r0 = 0
            goto L_0x008d
        L_0x0309:
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
        L_0x0311:
            r4 = 1
            r0 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            goto L_0x008d
        L_0x031c:
            r17 = r0
            goto L_0x0075
        L_0x0320:
            if (r0 == 0) goto L_0x033c
            com.google.android.apps.gsa.shared.m.b.f r3 = r1.f257566b
            r4 = 100
            r3.mo83901au(r4, r2)
            com.google.common.f.e r2 = f257565a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r6)
            java.lang.String r3 = "All utterances sent successfully."
            r4 = 12568(0x3118, float:1.7612E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0353
        L_0x033c:
            com.google.android.apps.gsa.shared.m.b.f r3 = r1.f257566b
            r3.mo83895ao(r2)
            com.google.common.f.e r2 = f257565a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r6)
            java.lang.String r3 = "Utterance send failure."
            r4 = 12567(0x3117, float:1.761E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x0353:
            return r0
        L_0x0354:
            com.google.common.f.x r0 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r6)
            java.lang.String r2 = "No utterances found. Returning!"
            r3 = 12572(0x311c, float:1.7617E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            r2 = 0
            return r2
        L_0x0366:
            r2 = 0
            com.google.common.f.x r0 = r3.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r6)
            java.lang.String r3 = "Should not send utterances."
            r4 = 12573(0x311d, float:1.7619E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.hotword.p7285c.C92373f.mo87036a(java.lang.String, com.google.speech.h.bu, com.google.android.apps.gsa.speech.audio.d):boolean");
    }
}
