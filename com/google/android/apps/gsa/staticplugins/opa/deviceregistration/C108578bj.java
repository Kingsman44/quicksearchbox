package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87250s;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C50093kh;
import com.google.assistant.p3861at.C50094ki;
import com.google.assistant.p3861at.C50120lh;
import com.google.assistant.p3861at.C50121li;
import com.google.assistant.p3861at.C50123lk;
import com.google.assistant.p3861at.C50124ll;
import com.google.assistant.p3861at.C50125lm;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.C50181no;
import com.google.assistant.p3861at.C50189nw;
import com.google.assistant.p3861at.C50248qa;
import com.google.assistant.p3861at.C50249qb;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4540k.C59311a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bj */
/* compiled from: PG */
public final class C108578bj extends C83870ad {

    /* renamed from: a */
    public static final C59071e f302033a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bj");

    /* renamed from: b */
    final String f302034b;

    /* renamed from: c */
    public final C108623cw f302035c;

    /* renamed from: d */
    public final C86124t f302036d;

    /* renamed from: e */
    public final C108556ar f302037e;

    /* renamed from: f */
    public final C84026u f302038f;

    /* renamed from: g */
    public final C108617cq f302039g;

    /* renamed from: h */
    public final C87250s f302040h;

    /* renamed from: i */
    public final C89052h f302041i;

    /* renamed from: j */
    public final C22871g f302042j;

    /* renamed from: k */
    public C50123lk f302043k;

    /* renamed from: l */
    public final C108680ez f302044l;

    /* renamed from: m */
    int f302045m = 1;

    /* renamed from: n */
    public final C84466a f302046n;

    /* renamed from: o */
    private final C108606cf f302047o;

    /* renamed from: p */
    private final boolean f302048p;

    public C108578bj(String str, C108623cw cwVar, C86124t tVar, C108556ar arVar, C108606cf cfVar, C84026u uVar, C108617cq cqVar, C84466a aVar, C87250s sVar, C89052h hVar, C22871g gVar, boolean z, C108680ez ezVar) {
        this.f302034b = str;
        this.f302035c = cwVar;
        this.f302036d = tVar;
        this.f302037e = arVar;
        this.f302047o = cfVar;
        this.f302038f = uVar;
        this.f302039g = cqVar;
        this.f302046n = aVar;
        this.f302040h = sVar;
        this.f302041i = hVar;
        this.f302042j = gVar;
        this.f302048p = z;
        this.f302044l = ezVar;
    }

    /* renamed from: a */
    public final C83956t mo96987a(C58833ax axVar) {
        String str;
        C60870cx cxVar;
        C60870cx cxVar2;
        C84026u uVar = this.f302038f;
        if (axVar.mo56113h()) {
            str = ((C50181no) axVar.mo56107c()).f130447b;
        } else {
            C59104x d = f302033a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) d).mo56372aa(24144)).mo56386p("#getHomeAutomationProviderName: provider is null");
            str = null;
        }
        if (C58837ba.m90859h(this.f302034b)) {
            cxVar = C60856cj.m92900i(C50189nw.f130472e);
        } else {
            C108623cw cwVar = this.f302035c;
            cwVar.f302153g = false;
            cxVar = this.f302042j.mo28210j(this.f302042j.mo28206f(cwVar.mo97033c(), "DeviceDiscoverySeq#performHomeAutomationSyncGetProvidersAndGetDevices (failure)", Exception.class, C108570bb.f302021a), "DeviceDiscoverySeq#performHomeAutomationSyncGetProvidersAndGetDevices", new C108571bc(this));
        }
        if (this.f302048p) {
            cxVar2 = this.f302042j.mo28210j(cxVar, "Make Devices Discoverable", new C108569ba(this));
        } else {
            cxVar2 = C60856cj.m92900i(acz.f129010n);
        }
        C60870cx j = this.f302042j.mo28210j(this.f302042j.mo28210j(cxVar2, "Start Discovery", new C108558at(this, cxVar)), "Get DPS Registry", new C108559au(this));
        C108604cd cdVar = new C108604cd();
        Bundle bundle = new Bundle();
        if (!C58837ba.m90859h(str)) {
            bundle.putString("provider-name", str);
        }
        cdVar.setArguments(bundle);
        cdVar.f302104c = j;
        return uVar.mo77487a(j, new C59311a(cdVar));
    }

    /* renamed from: b */
    public final C60870cx mo96988b(C58528ij ijVar) {
        C60870cx cxVar;
        if (!C58557jl.m90138s(ijVar, C108563ay.f302014a)) {
            C50123lk lkVar = C50123lk.f130306b;
            this.f302043k = lkVar;
            return C60856cj.m92900i(lkVar);
        }
        C108617cq cqVar = this.f302035c.f302149c;
        C58976aa aaVar = C58975e.f156826a;
        if (ijVar.isEmpty()) {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            C108616cp cpVar = new C108616cp(C108611ck.f302128a);
            acu acu = (acu) acv.f128920X.createBuilder();
            C50124ll llVar = (C50124ll) C50125lm.f130309b.createBuilder();
            Iterator it = ijVar.iterator();
            while (it.hasNext()) {
                C108741i iVar = (C108741i) it.next();
                if (iVar.mo97113q()) {
                    C50120lh lhVar = (C50120lh) C50121li.f130300e.createBuilder();
                    if (!C58837ba.m90859h(iVar.mo97110n())) {
                        String n = iVar.mo97110n();
                        lhVar.copyOnWrite();
                        C50121li liVar = (C50121li) lhVar.instance;
                        n.getClass();
                        liVar.f130302a |= 1;
                        liVar.f130303b = n;
                    }
                    if (!C58837ba.m90859h(iVar.mo97104g())) {
                        C50093kh khVar = (C50093kh) C50094ki.f130230i.createBuilder();
                        String g = iVar.mo97104g();
                        khVar.copyOnWrite();
                        C50094ki kiVar = (C50094ki) khVar.instance;
                        g.getClass();
                        kiVar.f130232a |= 1;
                        kiVar.f130233b = g;
                        lhVar.copyOnWrite();
                        C50121li liVar2 = (C50121li) lhVar.instance;
                        C50094ki kiVar2 = (C50094ki) khVar.build();
                        kiVar2.getClass();
                        liVar2.f130304c = kiVar2;
                        liVar2.f130302a |= 2;
                    }
                    llVar.copyOnWrite();
                    C50125lm lmVar = (C50125lm) llVar.instance;
                    C50121li liVar3 = (C50121li) lhVar.build();
                    liVar3.getClass();
                    C62971cq cqVar2 = lmVar.f130311a;
                    if (!cqVar2.mo58948c()) {
                        lmVar.f130311a = C62942bv.mutableCopy(cqVar2);
                    }
                    lmVar.f130311a.add(liVar3);
                }
            }
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            C50125lm lmVar2 = (C50125lm) llVar.build();
            lmVar2.getClass();
            acv.f128925D = lmVar2;
            acv.f128946b |= 32;
            cqVar.f302138c.i((Account) ((C83893b) cqVar.f302137b.mo27525b()).mo77278a().mo56107c(), (acv) acu.build(), C50144me.f130361d, cpVar, (k) null, (String) null, cqVar.getClass().getSimpleName());
            cxVar = cpVar.f302134a;
        }
        return this.f302042j.mo28209i(C60922j.m93044g(cxVar, C108619cs.f302141a, C60826bg.f164896a), "Save DPS Result", new C108564az(this));
    }

    /* renamed from: d */
    public final C58833ax mo77210d() {
        C58976aa aaVar = C58975e.f156826a;
        C108606cf cfVar = this.f302047o;
        if (cfVar.f302122a) {
            this.f302045m = 3;
            cfVar.f302122a = false;
        }
        if (this.f302045m == 2 && this.f302037e.mo96982a() == 0) {
            this.f302045m = 1;
        }
        if (this.f302045m == 2 && this.f302037e.mo96982a() == 1 && this.f302037e.f302004l == null) {
            this.f302045m = 1;
        }
        int i = this.f302045m;
        if (i == 4) {
            if (this.f302037e.f302004l == null) {
                this.f302045m = 1;
                i = 1;
            }
        } else if (i == 6) {
            this.f302045m = 3;
            i = 3;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 == 1) {
                int a = this.f302037e.mo96982a();
                if (a > 1) {
                    this.f302045m = 4;
                    C108678ex exVar = new C108678ex();
                    C50123lk lkVar = this.f302043k;
                    lkVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("device-ui-arg", lkVar.toByteArray());
                    return C58833ax.m90834k(C83875ai.m133540e(exVar, bundle));
                } else if (a == 1) {
                    this.f302045m = 5;
                }
            } else if (i2 == 2) {
                this.f302045m = 2;
                return C58833ax.m90834k(C83875ai.m133539d(this.f302038f.mo77487a(mo96988b(C58528ij.m90006F(this.f302037e.f301994b)), C108557as.f302007a)));
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return C58836b.f156633a;
                }
                throw new IllegalArgumentException("Unknown State.");
            }
            C108741i iVar = this.f302037e.f302004l;
            if (iVar == null || !iVar.mo97113q()) {
                return C58836b.f156633a;
            }
            this.f302045m = 5;
            C108617cq cqVar = this.f302039g;
            C108616cp cpVar = new C108616cp(C108610cj.f302127a);
            acu acu = (acu) acv.f128920X.createBuilder();
            C50248qa qaVar = (C50248qa) C50249qb.f130671d.createBuilder();
            String g = iVar.mo97104g();
            g.getClass();
            qaVar.copyOnWrite();
            C50249qb qbVar = (C50249qb) qaVar.instance;
            qbVar.f130673a = 2 | qbVar.f130673a;
            qbVar.f130675c = g;
            String f = iVar.mo97103f();
            qaVar.copyOnWrite();
            C50249qb qbVar2 = (C50249qb) qaVar.instance;
            f.getClass();
            qbVar2.f130673a = 1 | qbVar2.f130673a;
            qbVar2.f130674b = f;
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            C50249qb qbVar3 = (C50249qb) qaVar.build();
            qbVar3.getClass();
            acv.f128922A = qbVar3;
            acv.f128946b |= 4;
            cqVar.f302138c.i((Account) ((C83893b) cqVar.f302137b.mo27525b()).mo77278a().mo56107c(), (acv) acu.build(), C50144me.f130361d, cpVar, (k) null, (String) null, cqVar.getClass().getSimpleName());
            SettableFuture settableFuture = cpVar.f302134a;
            return C58833ax.m90834k(C83875ai.m133538c(C58485gu.m89847o(this.f302038f.mo77487a(settableFuture, C108560av.f302011a), new C108576bh(this, iVar, settableFuture))));
        } else {
            this.f302044l.mo97063g();
            this.f302045m = 2;
            C60870cx i3 = C60856cj.m92900i(C58836b.f156633a);
            if (!C58837ba.m90859h(this.f302034b)) {
                i3 = this.f302035c.mo97031a();
            }
            return C58833ax.m90834k(C83875ai.m133539d(this.f302038f.mo77487a(i3, C108557as.f302007a), C83875ai.m133536a(i3, new C108561aw(this), new C108562ax(this))));
        }
    }
}
