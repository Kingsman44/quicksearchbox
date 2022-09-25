package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92444a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92452i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66615cm;
import com.google.speech.p5208h.p5209a.C66535f;
import com.google.speech.p5208h.p5209a.C66540k;
import com.google.speech.p5224k.p5225a.C67242t;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.i */
/* compiled from: PG */
public final class C92403i implements C92400f {

    /* renamed from: a */
    public static final C59071e f257687a = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.enrollmentutils.i");

    /* renamed from: b */
    public final C89859i f257688b;

    /* renamed from: c */
    private final C89994f f257689c;

    /* renamed from: d */
    private final C68214a f257690d;

    /* renamed from: e */
    private final C92302a f257691e;

    /* renamed from: f */
    private final C90931ca f257692f;

    /* renamed from: g */
    private final C68214a f257693g;

    /* renamed from: h */
    private final C68214a f257694h;

    /* renamed from: i */
    private final C68214a f257695i;

    public C92403i(C89994f fVar, C68214a aVar, C92302a aVar2, C90931ca caVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C89859i iVar) {
        this.f257689c = fVar;
        this.f257690d = aVar;
        this.f257691e = aVar2;
        this.f257692f = caVar;
        this.f257693g = aVar3;
        this.f257694h = aVar4;
        this.f257695i = aVar5;
        this.f257688b = iVar;
    }

    /* renamed from: d */
    public static int m151724d(C67242t tVar) {
        if (tVar == null) {
            return 3;
        }
        int ordinal = tVar.ordinal();
        if (ordinal == 3) {
            return 2;
        }
        if (ordinal == 14) {
            return 3;
        }
        if (ordinal == 18) {
            return 4;
        }
        ((C59052c) ((C59052c) f257687a.mo56225c()).mo56372aa(12495)).mo56387q("invalid utterance type-%d", tVar.f182766u);
        return 3;
    }

    /* renamed from: e */
    static int m151725e(C90584f fVar, Map map, C89859i iVar) {
        if (fVar == C90584f.OK_HEY_GOOGLE) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            int g = m151726g(map, C67242t.ENROLLMENT_TISID);
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160115b |= 67108864;
            cbVar.f160090ab = g;
            int g2 = m151726g(map, C67242t.ENROLLMENT_GOOGLE_HOME);
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            cbVar2.f160115b |= 268435456;
            cbVar2.f160092ad = g2;
            C89856f fVar2 = new C89856f();
            fVar2.f246201a = C89849ae.VOICE_MATCH_GET_CLOUD_UTTERANCE_SET;
            fVar2.f246203c = (C59687cb) ajVar.build();
            iVar.mo74236a(fVar2.mo83699a());
            if (m151728i(map, C67242t.ENROLLMENT_TISID)) {
                return 4;
            }
            if (m151728i(map, C67242t.ENROLLMENT_GOOGLE_HOME)) {
                return 3;
            }
            iVar.mo83702b(C89849ae.VOICE_MATCH_NOT_ENOUGH_CLOUD_UTTERANCES);
            return 1;
        }
        iVar.mo83702b(C89849ae.VOICE_MATCH_INVALID_CLOUD_UTTERANCE_MODEL_TYPE);
        return 1;
    }

    /* renamed from: g */
    private static int m151726g(Map map, C67242t tVar) {
        if (!map.containsKey(Integer.valueOf(tVar.f182766u))) {
            return 0;
        }
        Integer num = (Integer) map.get(Integer.valueOf(tVar.f182766u));
        num.getClass();
        return num.intValue();
    }

    /* renamed from: h */
    private final C66615cm m151727h(Account account, C66595bu buVar) {
        C92444a aVar = new C92444a();
        aVar.mo87128d(this.f257691e);
        aVar.mo87130f(this.f257689c);
        aVar.f257829j = C58833ax.m90833j(account);
        aVar.f257830k = C58833ax.m90833j(buVar);
        try {
            return (C66615cm) C90877ak.m148473g(this.f257692f.mo85138c(new C92452i(aVar.mo87125a())), 1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f257687a.mo56225c()).mo56382g(e)).mo56372aa(12497)).mo56386p("Unable to fetch S3UserInfo with AuthToken; Exception");
            return null;
        }
    }

    /* renamed from: i */
    private static boolean m151728i(Map map, C67242t tVar) {
        return m151726g(map, tVar) >= 4;
    }

    /* renamed from: a */
    public final C60870cx mo87043a(C90584f fVar, boolean z, String str, C92399e eVar, Account account, C66595bu buVar) {
        return this.f257692f.mo85138c(new C92401g(this, str, account, buVar, fVar, eVar, z));
    }

    /* renamed from: b */
    public final C60870cx mo87044b(C90584f fVar, boolean z, String str, C92399e eVar, Account account, C66595bu buVar) {
        Account account2 = account;
        if (account2 != null) {
            String str2 = account2.name;
        }
        return this.f257692f.mo85138c(new C92402h(this, str, account, buVar, fVar, eVar, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map mo87047c(C66540k kVar, C92399e eVar) {
        HashMap hashMap = new HashMap();
        if (kVar == null) {
            ((C59052c) ((C59052c) f257687a.mo56225c()).mo56372aa(12511)).mo56386p("EnrollmentFetcherResponse is null");
            return hashMap;
        }
        for (C66535f fVar : kVar.f180974b) {
            if (eVar != C92399e.NEW_UTTERANCES || fVar.f180957c <= 180) {
                Integer valueOf = Integer.valueOf(fVar.f180958d);
                if (!hashMap.containsKey(valueOf) || hashMap.get(valueOf) == null) {
                    hashMap.put(valueOf, 1);
                } else {
                    Integer num = (Integer) hashMap.get(valueOf);
                    num.getClass();
                    hashMap.put(valueOf, Integer.valueOf(num.intValue() + 1));
                }
            } else {
                ((C59052c) ((C59052c) f257687a.mo56224b()).mo56372aa(12510)).mo56386p("The request is for fresh user enrollment utterances, do not count older utterances");
            }
        }
        if (hashMap.isEmpty()) {
            this.f257688b.mo83702b(C89849ae.VOICE_MATCH_NO_ENROLLMENT_UTTERANCES_FOUND);
            ((C59052c) ((C59052c) f257687a.mo56225c()).mo56372aa(12508)).mo56386p("No Enrollment utterances found");
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01be  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.speech.p5208h.p5209a.C66540k mo87048f(java.lang.String r9, android.accounts.Account r10, com.google.speech.p5208h.C66595bu r11, boolean r12) {
        /*
            r8 = this;
            com.google.android.apps.gsa.z.f.a.a r0 = new com.google.android.apps.gsa.z.f.a.a
            com.google.android.apps.gsa.shared.m.b.f r1 = r8.f257689c
            dagger.a r2 = r8.f257693g
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.z r2 = (com.google.android.apps.gsa.search.core.p6805i.C86130z) r2
            dagger.a r3 = r8.f257694h
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.google.cq r3 = (com.google.android.apps.gsa.search.core.google.C85923cq) r3
            dagger.a r4 = r8.f257695i
            r0.<init>(r1, r2, r3, r4)
            com.google.al.c.c.b.ai r0 = r0.mo104107b()
            r1 = 1
            r2 = 0
            java.lang.String r3 = ""
            com.google.android.apps.gsa.shared.aa.aq r3 = com.google.android.apps.gsa.p6487s3.C84334w.m134551a(r0, r3)     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.shared.aa.ar r3 = r3.mo82989a()     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.shared.aa.bk r4 = new com.google.android.apps.gsa.shared.aa.bk     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            dagger.a r5 = r8.f257690d     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.shared.aa.aj r5 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r5     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.shared.aa.h r5 = r5.mo27509a()     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.s3.a.c r5 = new com.google.android.apps.gsa.s3.a.c     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            java.lang.String r0 = r0.f29402f     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            r5.<init>(r4, r0)     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            dagger.a r0 = r8.f257690d     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.shared.aa.aj r0 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r0     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            dagger.a r6 = r8.f257690d     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.shared.aa.aj r6 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r6     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.shared.aa.v r7 = com.google.android.apps.gsa.shared.p6968aa.C89066v.f241382a     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.android.apps.gsa.shared.aa.q r6 = r6.mo27510b(r7)     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.common.util.concurrent.cx r0 = r0.mo27495f(r3, r4, r6)     // Catch:{ InterruptedException -> 0x0189, ExecutionException -> 0x0187, all -> 0x0184 }
            com.google.speech.h.cd r3 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197403a()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            java.lang.String r4 = "enrollment-fetcher"
            r3.copyOnWrite()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r6 = r3.instance     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ce r6 = (com.google.speech.p5208h.C66607ce) r6     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ce r7 = com.google.speech.p5208h.C66607ce.f181191f     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            int r7 = r6.f181193a     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r7 = r7 | r1
            r6.f181193a = r7     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r6.f181194b = r4     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.cm r10 = r8.m151727h(r10, r11)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            if (r10 == 0) goto L_0x007c
            com.google.protobuf.bt r11 = com.google.speech.p5208h.C66615cm.f181221k     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r3.mo58885m(r11, r10)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
        L_0x007c:
            com.google.protobuf.bt r10 = com.google.speech.p5208h.C66550ag.f180993d     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ag r11 = com.google.speech.p5208h.C66550ag.f180992c     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.af r11 = (com.google.speech.p5208h.C66549af) r11     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r11.copyOnWrite()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r4 = r11.instance     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ag r4 = (com.google.speech.p5208h.C66550ag) r4     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            int r6 = r4.f180995a     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r6 = r6 | r1
            r4.f180995a = r6     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r6 = 0
            r4.f180996b = r6     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ag r11 = (com.google.speech.p5208h.C66550ag) r11     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r3.mo58885m(r10, r11)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r10 = r3.build()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ce r10 = (com.google.speech.p5208h.C66607ce) r10     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r5.mo77820a(r10, r6)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.a.i r10 = com.google.speech.p5208h.p5209a.C66538i.f180961g     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.a.g r10 = (com.google.speech.p5208h.p5209a.C66536g) r10     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r10.copyOnWrite()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.a.i r11 = (com.google.speech.p5208h.p5209a.C66538i) r11     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r9.getClass()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            int r4 = r11.f180964a     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r4 = r4 | 8
            r11.f180964a = r4     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r11.f180968e = r9     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r10.copyOnWrite()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r9 = r10.instance     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.a.i r9 = (com.google.speech.p5208h.p5209a.C66538i) r9     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            int r11 = r9.f180964a     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r11 = r11 | 4
            r9.f180964a = r11     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r9.f180967d = r12     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.android.apps.gsa.shared.m.b.f r9 = r8.f257689c     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            boolean r9 = r9.mo83850M()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r10.copyOnWrite()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.a.i r11 = (com.google.speech.p5208h.p5209a.C66538i) r11     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            int r12 = r11.f180964a     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r12 = r12 | 32
            r11.f180964a = r12     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r11.f180969f = r9     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r9 = r10.build()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.a.i r9 = (com.google.speech.p5208h.p5209a.C66538i) r9     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bt r10 = com.google.speech.p5208h.p5209a.C66538i.f180962h     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r3.mo58885m(r10, r9)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.protobuf.bv r9 = r3.build()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ce r9 = (com.google.speech.p5208h.C66607ce) r9     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r5.mo77820a(r9, r6)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ce r9 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197405c()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r5.mo77820a(r9, r1)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            java.lang.Object r9 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r0)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.android.apps.gsa.shared.aa.m r9 = (com.google.android.apps.gsa.shared.p6968aa.C89057m) r9     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.android.apps.gsa.shared.aa.i r9 = r9.mo83034a()     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.android.apps.gsa.s3.a.d r10 = new com.google.android.apps.gsa.s3.a.d     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.android.apps.gsa.shared.aa.ae r11 = new com.google.android.apps.gsa.shared.aa.ae     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r11.<init>(r9)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            r10.<init>(r11)     // Catch:{ InterruptedException -> 0x0181, ExecutionException -> 0x017f, all -> 0x017d }
            com.google.speech.h.ci r9 = r10.mo77821a()     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            if (r9 != 0) goto L_0x013f
            com.google.common.f.e r9 = f257687a     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.common.f.x r9 = r9.mo56225c()     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            r11 = 12500(0x30d4, float:1.7516E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r11)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            java.lang.String r11 = "s3Response is null for enrollment fether request!"
            r9.mo56386p(r11)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.android.apps.gsa.shared.logger.b.i r9 = r8.f257688b     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_UTTS_READY_CHECK_NULL_S3_RESPONSE     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            r9.mo83702b(r11)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.common.p4541l.C59337t.m92223c(r10)
            if (r0 == 0) goto L_0x013e
            r0.cancel(r1)
        L_0x013e:
            return r2
        L_0x013f:
            com.google.common.f.e r11 = f257687a     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            r12 = 12498(0x30d2, float:1.7513E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            java.lang.String r12 = "Enrollment fetcher request sent successfully."
            r11.mo56386p(r12)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.protobuf.bt r11 = com.google.speech.p5208h.p5209a.C66540k.f180971e     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            r9.mo58887l(r11)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.protobuf.bf r9 = r9.f169962ag     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.protobuf.bs r12 = r11.f169971d     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            java.lang.Object r9 = r9.mo58854l(r12)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            if (r9 != 0) goto L_0x016a
            java.lang.Object r9 = r11.f169969b     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            goto L_0x016e
        L_0x016a:
            java.lang.Object r9 = r11.mo58889c(r9)     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
        L_0x016e:
            com.google.speech.h.a.k r9 = (com.google.speech.p5208h.p5209a.C66540k) r9     // Catch:{ InterruptedException -> 0x017b, ExecutionException -> 0x0179 }
            com.google.common.p4541l.C59337t.m92223c(r10)
            if (r0 == 0) goto L_0x0178
            r0.cancel(r1)
        L_0x0178:
            return r9
        L_0x0179:
            r9 = move-exception
            goto L_0x018c
        L_0x017b:
            r9 = move-exception
            goto L_0x018c
        L_0x017d:
            r9 = move-exception
            goto L_0x01b9
        L_0x017f:
            r9 = move-exception
            goto L_0x0182
        L_0x0181:
            r9 = move-exception
        L_0x0182:
            r10 = r2
            goto L_0x018c
        L_0x0184:
            r9 = move-exception
            r0 = r2
            goto L_0x01b9
        L_0x0187:
            r9 = move-exception
            goto L_0x018a
        L_0x0189:
            r9 = move-exception
        L_0x018a:
            r10 = r2
            r0 = r10
        L_0x018c:
            com.google.common.f.e r11 = f257687a     // Catch:{ all -> 0x01b7 }
            com.google.common.f.x r11 = r11.mo56225c()     // Catch:{ all -> 0x01b7 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x01b7 }
            com.google.common.f.x r9 = r11.mo56382g(r9)     // Catch:{ all -> 0x01b7 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x01b7 }
            r11 = 12499(0x30d3, float:1.7515E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r11)     // Catch:{ all -> 0x01b7 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x01b7 }
            java.lang.String r11 = "Enrollment fetcher request failed."
            r9.mo56386p(r11)     // Catch:{ all -> 0x01b7 }
            com.google.android.apps.gsa.shared.logger.b.i r9 = r8.f257688b     // Catch:{ all -> 0x01b7 }
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_UTTS_READY_CHECK_FETCHER_REQUEST_FAILED     // Catch:{ all -> 0x01b7 }
            r9.mo83702b(r11)     // Catch:{ all -> 0x01b7 }
            com.google.common.p4541l.C59337t.m92223c(r10)
            if (r0 == 0) goto L_0x01b6
            r0.cancel(r1)
        L_0x01b6:
            return r2
        L_0x01b7:
            r9 = move-exception
            r2 = r10
        L_0x01b9:
            com.google.common.p4541l.C59337t.m92223c(r2)
            if (r0 == 0) goto L_0x01c1
            r0.cancel(r1)
        L_0x01c1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92403i.mo87048f(java.lang.String, android.accounts.Account, com.google.speech.h.bu, boolean):com.google.speech.h.a.k");
    }
}
