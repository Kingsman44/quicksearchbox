package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142316av;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142355cg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.y */
/* compiled from: PG */
public final class C96439y extends C84036z implements C96430p {

    /* renamed from: a */
    public static final C59071e f269793a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.y");

    /* renamed from: b */
    public final C22871g f269794b;

    /* renamed from: c */
    public final C84026u f269795c;

    /* renamed from: d */
    public final C69464a f269796d;

    /* renamed from: e */
    public final C68214a f269797e;

    /* renamed from: f */
    public boolean f269798f;

    /* renamed from: g */
    private final String f269799g;

    /* renamed from: h */
    private final C83893b f269800h;

    /* renamed from: i */
    private final C96097ba f269801i;

    /* renamed from: j */
    private final C68214a f269802j;

    public C96439y(String str, C84026u uVar, C22871g gVar, C96325jm jmVar, C83893b bVar, C69464a aVar, C68214a aVar2, C68214a aVar3) {
        this.f269794b = gVar;
        this.f269800h = bVar;
        this.f269799g = str;
        this.f269795c = uVar;
        this.f269801i = jmVar.f269538a;
        this.f269796d = aVar;
        this.f269797e = aVar2;
        this.f269802j = aVar3;
    }

    /* renamed from: d */
    public static C83956t m159790d(Account account, String str, String str2, C142316av avVar) {
        if (str == null) {
            C59104x d = f269793a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AccLinkSeq");
            ((C59052c) ((C59052c) d).mo56372aa(16936)).mo56386p("No provider name");
            return C83875ai.f228524a;
        }
        C96431q qVar = new C96431q();
        String str3 = avVar.f386089a;
        C62971cq cqVar = avVar.f386090b;
        Bundle bundle = new Bundle();
        bundle.putStringArray("scope-list", (String[]) cqVar.toArray(new String[cqVar.size()]));
        bundle.putString("provider-id", str3);
        bundle.putString("provider-mid", str2);
        bundle.putString("provider-name", str);
        bundle.putParcelable("account", account);
        return C83875ai.m133540e(qVar, bundle);
    }

    /* renamed from: b */
    public final void mo90118b() {
        this.f269798f = true;
    }

    /* renamed from: e */
    public final String mo90121e() {
        C142324bc bcVar = this.f269801i.f269047b;
        if ((bcVar.f386115a & 8) == 0) {
            return null;
        }
        C142355cg cgVar = bcVar.f386118d;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        return C124525f.m203989e(cgVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.d.av} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo77495h() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f269799g
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ba r1 = r6.f269801i
            com.google.android.d.bc r1 = r1.f269047b
            r2 = 0
            if (r0 == 0) goto L_0x0030
            com.google.e.a.b.b.c r0 = com.google.android.apps.gsa.staticplugins.bisto.util.C96448af.m159802a(r0)
            if (r0 == 0) goto L_0x0030
            com.google.e.a.b.b.e r0 = r0.f165244b
            java.lang.String r3 = "fdci"
            java.util.Map r0 = com.google.android.apps.gsa.staticplugins.bisto.util.C96448af.m159803b(r0, r3)
            if (r0 == 0) goto L_0x0030
            java.lang.String r3 = "ale"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0030
            com.google.protobuf.dn r1 = r1.f386128n
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.lang.Object r0 = r1.get(r0)
            r2 = r0
            com.google.android.d.av r2 = (com.google.android.p10712d.C142316av) r2
        L_0x0030:
            com.google.android.apps.gsa.opaonboarding.b r0 = r6.f269800h
            com.google.common.base.ax r0 = r0.mo77278a()
            java.lang.String r1 = "AccLinkSeq"
            if (r2 != 0) goto L_0x0053
            com.google.common.f.e r0 = f269793a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r1)
            java.lang.String r1 = "No linking config"
            r2 = 16939(0x422b, float:2.3737E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.f228524a
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            return r0
        L_0x0053:
            boolean r3 = r0.mo56113h()
            if (r3 != 0) goto L_0x0072
            com.google.common.f.e r0 = f269793a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r1)
            java.lang.String r1 = "No Account"
            r2 = 16938(0x422a, float:2.3735E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.f228524a
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            return r0
        L_0x0072:
            dagger.a r1 = r6.f269802j
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.assistant.shared.cb r1 = (com.google.android.apps.gsa.assistant.shared.cb) r1
            com.google.android.apps.gsa.opaonboarding.b r3 = r6.f269800h
            com.google.common.base.ax r3 = r3.mo77278a()
            java.lang.Object r3 = r3.mo56107c()
            android.accounts.Account r3 = (android.accounts.Account) r3
            r4 = 2
            int[] r4 = new int[r4]
            r4 = {0, 1} // fill-array
            com.google.common.util.concurrent.cx r1 = r1.c(r3, r4)
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.t r3 = new com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.t
            r3.<init>(r6, r0, r2)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r1, r3, r4)
            com.google.android.apps.gsa.opaonboarding.ui.u r3 = r6.f269795c
            g.a.a r4 = r6.f269796d
            com.google.android.apps.gsa.opaonboarding.ui.t r3 = r3.mo77487a(r1, r4)
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.u r4 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96435u.f269782a
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.v r5 = new com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.v
            r5.<init>(r6, r0, r2)
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133536a(r1, r4, r5)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89847o(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96439y.mo77495h():com.google.common.b.gu");
    }
}
