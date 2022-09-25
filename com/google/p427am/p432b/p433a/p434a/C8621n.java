package com.google.p427am.p432b.p433a.p434a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.am.b.a.a.n */
/* compiled from: PG */
public final class C8621n implements C61373ao {

    /* renamed from: a */
    public static final C31164au f29867a = C31164au.m58092b("google.internal.home.foyer.v1.AssistantFamilyService.");

    /* renamed from: b */
    public static final C61372an f29868b = new C8612e();

    /* renamed from: c */
    public static final C61372an f29869c = new C8613f();

    /* renamed from: d */
    public static final C61372an f29870d = new C8614g();

    /* renamed from: e */
    public static final C61372an f29871e = new C8615h();

    /* renamed from: f */
    public static final C61372an f29872f = new C8616i();

    /* renamed from: g */
    public static final C61372an f29873g = new C8617j();

    /* renamed from: h */
    public static final C61372an f29874h = new C8618k();

    /* renamed from: i */
    public static final C61372an f29875i = new C8619l();

    /* renamed from: j */
    public static final C61372an f29876j = new C8620m();

    /* renamed from: k */
    public static final C61372an f29877k = new C8608a();

    /* renamed from: l */
    public static final C61372an f29878l = new C8609b();

    /* renamed from: m */
    public static final C61372an f29879m = new C8610c();

    /* renamed from: n */
    public static final C61372an f29880n = new C8611d();

    /* renamed from: o */
    public static final C8621n f29881o = new C8621n();

    /* renamed from: r */
    private static final C31164au f29882r = C31164au.m58092b("google.internal.home.foyer.v1.AssistantFamilyService/");

    /* renamed from: s */
    private static final C31164au f29883s = C31164au.m58092b("googlehomefoyer-pa.googleapis.com");

    /* renamed from: p */
    public final C58485gu f29884p;

    /* renamed from: q */
    public final C58528ij f29885q = new C58526ih().mo55486f();

    /* renamed from: t */
    private final C58495hd f29886t;

    static {
        C31164au.m58092b("google.internal.home.foyer.v1.AssistantFamilyService");
    }

    private C8621n() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-googlehomefoyer-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-googlehomefoyer-pa.sandbox.googleapis.com");
        e.mo55395g("googlehomefoyer-pa.mtls.googleapis.com");
        e.mo55395g("preprod-googlehomefoyer-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("preprod-googlehomefoyer-pa.sandbox.googleapis.com");
        e.mo55395g("staging-googlehomefoyer-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-googlehomefoyer-pa.sandbox.googleapis.com");
        e.mo55395g("googlehomefoyer-pa.googleapis.com");
        this.f29884p = e.mo55394f();
        C61372an anVar = f29868b;
        C61372an anVar2 = f29869c;
        C61372an anVar3 = f29870d;
        C61372an anVar4 = f29871e;
        C61372an anVar5 = f29872f;
        C61372an anVar6 = f29873g;
        C61372an anVar7 = f29874h;
        C61372an anVar8 = f29875i;
        C61372an anVar9 = f29876j;
        C61372an anVar10 = f29877k;
        C61372an anVar11 = f29878l;
        C61372an anVar12 = f29879m;
        C61372an anVar13 = f29880n;
        C61372an[] anVarArr = {anVar7, anVar8, anVar9, anVar10, anVar11, anVar12, anVar13};
        C61372an anVar14 = anVar13;
        C61372an anVar15 = anVar12;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, anVarArr);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetChildrenInFamily", anVar);
        gzVar.mo55429h("GetDeviceCannelliniInfo", anVar2);
        gzVar.mo55429h("UpdateDeviceCannelliniInfo", anVar3);
        gzVar.mo55429h("CanDirectAddMemberToFamily", anVar4);
        gzVar.mo55429h("DirectAddMemberToFamily", anVar5);
        gzVar.mo55429h("GetFamilyMembersInformation", anVar6);
        gzVar.mo55429h("HasPendingInviteToFamily", anVar7);
        gzVar.mo55429h("AcceptDirectAddInvitationToFamily", anVar8);
        gzVar.mo55429h("DeclineDirectAddInvitationToFamily", anVar9);
        gzVar.mo55429h("GetAccountCustodioInfo", anVar10);
        gzVar.mo55429h("UpdateAccountCustodioInfo", anVar11);
        gzVar.mo55429h("GetCustodioEligibleDevices", anVar15);
        gzVar.mo55429h("ValidateCustodioFlow", anVar14);
        this.f29886t = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f29883s;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f29882r.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f29886t.containsKey(substring)) {
            return (C61372an) this.f29886t.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
