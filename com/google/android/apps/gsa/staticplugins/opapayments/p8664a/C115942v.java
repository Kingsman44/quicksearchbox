package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.staticplugins.opapayments.p8666ui.C115947a;
import com.google.android.gms.wallet.firstparty.p10886b.C146352a;
import com.google.android.gms.wallet.firstparty.p10886b.C146354c;
import com.google.android.gms.wallet.firstparty.p10887pm.C146362a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1745b.p1746a.C21419a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1745b.p1746a.C21420b;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1745b.p1746a.C21421c;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1745b.p1746a.C21422d;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21428f;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21437o;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21438p;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1748d.p1749a.C21439a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1748d.p1749a.C21440b;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1748d.p1749a.C21441c;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4129b.p4130a.p4131a.p4132a.C54664ah;
import com.google.p4129b.p4130a.p4131a.p4132a.C54666aj;
import com.google.p4129b.p4130a.p4131a.p4132a.C54668al;
import com.google.p4129b.p4130a.p4131a.p4132a.C54671ao;
import com.google.p4129b.p4130a.p4131a.p4132a.C54673aq;
import com.google.p4129b.p4130a.p4131a.p4132a.C54674ar;
import com.google.p4129b.p4130a.p4131a.p4132a.C54675as;
import com.google.p4129b.p4130a.p4131a.p4132a.C54676at;
import com.google.p4129b.p4130a.p4131a.p4132a.C54678av;
import com.google.p4129b.p4130a.p4131a.p4132a.C54680ax;
import com.google.p4129b.p4130a.p4131a.p4132a.C54685bb;
import com.google.p4129b.p4130a.p4131a.p4132a.C54690bg;
import com.google.p4129b.p4130a.p4131a.p4132a.C54691bh;
import com.google.p4129b.p4130a.p4131a.p4132a.C54740z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.v */
/* compiled from: PG */
public final class C115942v extends C115905a {

    /* renamed from: i */
    private static final C59071e f321492i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opapayments.a.v");

    /* renamed from: g */
    public C115918af f321493g;

    /* renamed from: h */
    public C86124t f321494h;

    /* renamed from: j */
    private long f321495j = 0;

    /* renamed from: k */
    private boolean f321496k;

    /* renamed from: m */
    private final void m192183m(int i, Intent intent, int i2) {
        this.f321496k = false;
        if (i == -1) {
            long b = this.f321493g.mo102329b(intent);
            if (b != 0) {
                mo102346i(b);
                return;
            }
            C59104x c = f321492i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SlInsFm");
            ((C59052c) ((C59052c) c).mo56372aa(30157)).mo56386p("Missing instrument ID from IM");
        } else if (i == 0 && i2 == 103) {
            mo102349l();
        }
    }

    /* renamed from: n */
    private final boolean m192184n() {
        return this.f321494h.mo79746e(C90014bt.f247501iO);
    }

    /* renamed from: o */
    private static final boolean m192185o(C54740z zVar) {
        return !zVar.f143652d.mo59173M();
    }

    /* renamed from: p */
    private static final boolean m192186p(C54740z zVar) {
        C54678av avVar = zVar.f143650b;
        if (avVar == null) {
            avVar = C54678av.f143526c;
        }
        return !avVar.f143529b.mo59173M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
        C54675as asVar = (C54675as) C54676at.f143522c.createBuilder();
        asVar.copyOnWrite();
        C54676at atVar = (C54676at) asVar.instance;
        atVar.f143524a = 3;
        atVar.f143525b = true;
        bgVar.copyOnWrite();
        C54691bh bhVar = (C54691bh) bgVar.instance;
        C54676at atVar2 = (C54676at) asVar.build();
        atVar2.getClass();
        bhVar.f143558b = atVar2;
        bhVar.f143557a = 3;
        this.f321380c = (C54691bh) bgVar.build();
        mo77318iT().mo77312a();
        return true;
    }

    /* renamed from: i */
    public final void mo102346i(long j) {
        C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
        C54675as asVar = (C54675as) C54676at.f143522c.createBuilder();
        asVar.copyOnWrite();
        C54676at atVar = (C54676at) asVar.instance;
        atVar.f143524a = 1;
        atVar.f143525b = Long.valueOf(j);
        bgVar.copyOnWrite();
        C54691bh bhVar = (C54691bh) bgVar.instance;
        C54676at atVar2 = (C54676at) asVar.build();
        atVar2.getClass();
        bhVar.f143558b = atVar2;
        bhVar.f143557a = 3;
        this.f321380c = (C54691bh) bgVar.build();
        mo77318iT().mo77312a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo102347j(C54740z zVar) {
        Intent intent;
        if (m192186p(zVar)) {
            C115918af afVar = this.f321493g;
            Activity activity = getActivity();
            C54678av avVar = zVar.f143650b;
            if (avVar == null) {
                avVar = C54678av.f143526c;
            }
            byte[] N = avVar.f143529b.mo59174N();
            C21437o oVar = afVar.f321424e;
            C21438p pVar = new C21438p();
            pVar.mo26935a(R.style.PaymentsSettingsIMOobeStyle);
            C21421c cVar = afVar.f321426g;
            C21428f fVar = new C21428f(new C146354c(activity));
            fVar.mo26931d(afVar.mo85543a());
            fVar.mo26930c(pVar);
            C21422d.m40539a(N, fVar);
            Account account = (Account) afVar.f321421b.mo77278a().mo56107c();
            if (account != null) {
                fVar.mo26929b(account);
            }
            intent = fVar.mo26928a();
        } else if (!m192185o(zVar) || !m192184n()) {
            C59104x c = f321492i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SlInsFm");
            ((C59052c) ((C59052c) c).mo56372aa(30154)).mo56386p("Instrument doesn't have token to edit/fix.");
            return;
        } else {
            C115918af afVar2 = this.f321493g;
            Activity activity2 = getActivity();
            byte[] N2 = zVar.f143652d.mo59174N();
            C21437o oVar2 = afVar2.f321424e;
            C21438p pVar2 = new C21438p();
            pVar2.mo26935a(R.style.PaymentsSettingsIMOobeStyle);
            C21439a aVar = afVar2.f321428p;
            C21428f fVar2 = new C21428f(new C146362a(activity2));
            fVar2.mo26931d(afVar2.mo85543a());
            fVar2.mo26930c(pVar2);
            C21441c cVar2 = afVar2.f321429q;
            C21440b.m40558a(C21441c.m40559a(N2), fVar2);
            Account account2 = (Account) afVar2.f321421b.mo77278a().mo56107c();
            if (account2 != null) {
                fVar2.mo26929b(account2);
            }
            Intent a = fVar2.mo26928a();
            this.f321495j = zVar.f143649a;
            intent = a;
        }
        startActivityForResult(intent, 102);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo102348k(C54680ax axVar, int i) {
        if (!this.f321496k) {
            this.f321496k = true;
            C115918af afVar = this.f321493g;
            Context applicationContext = getActivity().getApplicationContext();
            byte[] N = axVar.f143533b.mo59174N();
            C21437o oVar = afVar.f321424e;
            C21438p pVar = new C21438p();
            pVar.mo26935a(R.style.PaymentsSettingsIMOobeStyle);
            C21419a aVar = afVar.f321422c;
            C21428f fVar = new C21428f(new C146352a(applicationContext));
            fVar.mo26931d(afVar.mo85543a());
            fVar.mo26930c(pVar);
            C21420b.m40538a(N, fVar);
            Account account = (Account) afVar.f321421b.mo77278a().mo56107c();
            if (account != null) {
                fVar.mo26929b(account);
            }
            startActivityForResult(fVar.mo26928a(), i);
        }
    }

    /* renamed from: l */
    public final void mo102349l() {
        C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
        C54675as asVar = (C54675as) C54676at.f143522c.createBuilder();
        asVar.copyOnWrite();
        C54676at atVar = (C54676at) asVar.instance;
        atVar.f143524a = 2;
        atVar.f143525b = true;
        bgVar.copyOnWrite();
        C54691bh bhVar = (C54691bh) bgVar.instance;
        C54676at atVar2 = (C54676at) asVar.build();
        atVar2.getClass();
        bhVar.f143558b = atVar2;
        bhVar.f143557a = 3;
        this.f321380c = (C54691bh) bgVar.build();
        mo77318iT().mo77312a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        C54685bb bbVar = (C54685bb) C90734ar.m148199b(arguments, "select_instrument_page_extra", C54685bb.f143541e.getParserForType());
        C58838bb.m90867b(bbVar, "Must supply instrument page under key %s", "select_instrument_page_extra");
        C58838bb.m90884s(bbVar.f143543a == 4, "Page must have instrument form to render SelectInstrumentFragment.");
        this.f321379b = bbVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C54674ar arVar;
        C54674ar arVar2;
        C54673aq aqVar;
        C54668al alVar;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C54685bb bbVar = this.f321379b;
        if (bbVar.f143543a == 4) {
            arVar = (C54674ar) bbVar.f143544b;
        } else {
            arVar = C54674ar.f143518c;
        }
        int i = arVar.f143520a;
        if (i == 2) {
            C54680ax axVar = ((C54666aj) arVar.f143521b).f143507a;
            if (axVar == null) {
                axVar = C54680ax.f143530c;
            }
            mo102348k(axVar, 103);
        } else if (i == 4 && m192184n()) {
            if (arVar.f143520a == 4) {
                alVar = (C54668al) arVar.f143521b;
            } else {
                alVar = C54668al.f143508b;
            }
            C54740z zVar = alVar.f143510a;
            if (zVar == null) {
                zVar = C54740z.f143647e;
            }
            mo102347j(zVar);
        } else if (arVar.f143520a == 3) {
            C54740z zVar2 = ((C54671ao) arVar.f143521b).f143513a;
            if (zVar2 == null) {
                zVar2 = C54740z.f143647e;
            }
            mo102347j(zVar2);
        } else {
            mo102315h(R.string.select_instrument_title, R.string.select_instrument_message);
            C54685bb bbVar2 = this.f321379b;
            if (bbVar2.f143543a == 4) {
                arVar2 = (C54674ar) bbVar2.f143544b;
            } else {
                arVar2 = C54674ar.f143518c;
            }
            if (arVar2.f143520a == 1) {
                aqVar = (C54673aq) arVar2.f143521b;
            } else {
                aqVar = C54673aq.f143514c;
            }
            for (C54740z zVar3 : aqVar.f143517b) {
                LinearLayout linearLayout = this.f321382e;
                C115947a aVar = new C115947a(getActivity());
                C54664ah ahVar = zVar3.f143651c;
                if (ahVar == null) {
                    ahVar = C54664ah.f143502b;
                }
                C84018m.m133908c(aVar.f321506a, ahVar.f143504a, TextView.BufferType.NORMAL, aVar);
                C54678av avVar = zVar3.f143650b;
                if (avVar == null) {
                    avVar = C54678av.f143526c;
                }
                if (!avVar.f143528a.isEmpty()) {
                    C54678av avVar2 = zVar3.f143650b;
                    if (avVar2 == null) {
                        avVar2 = C54678av.f143526c;
                    }
                    C84018m.m133908c(aVar.f321507b, avVar2.f143528a, TextView.BufferType.NORMAL, aVar);
                }
                if ((!m192185o(zVar3) || !m192184n()) && !m192186p(zVar3)) {
                    aVar.setOnClickListener(new C89943l(new C115939s(this, zVar3)));
                } else {
                    aVar.setOnClickListener(new C89943l(new C115938r(this, zVar3)));
                }
                linearLayout.addView(aVar);
            }
            for (C54680ax axVar2 : aqVar.f143516a) {
                LinearLayout linearLayout2 = this.f321382e;
                C115947a aVar2 = new C115947a(getActivity());
                C84018m.m133908c(aVar2.f321506a, axVar2.f143532a, TextView.BufferType.NORMAL, aVar2);
                aVar2.setOnClickListener(new C115941u(this, axVar2));
                linearLayout2.addView(aVar2);
            }
            mo102313e();
            if (this.f321383f.mo77361b() != null) {
                this.f321383f.mo77361b().setOnClickListener(new C89943l(new C115940t(this)));
            }
        }
        return onCreateView;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 101:
                m192183m(i2, intent, 101);
                return;
            case 102:
                if (i2 == -1) {
                    long b = this.f321493g.mo102329b(intent);
                    if (b == 0) {
                        b = this.f321495j;
                        this.f321495j = 0;
                    }
                    if (b != 0) {
                        mo102346i(b);
                        return;
                    }
                    C59104x c = f321492i.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SlInsFm");
                    ((C59052c) ((C59052c) c).mo56372aa(30156)).mo56386p("Missing instrument ID from IM");
                    return;
                }
                return;
            case 103:
                m192183m(i2, intent, 103);
                return;
            default:
                C59104x c2 = f321492i.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "SlInsFm");
                ((C59052c) ((C59052c) c2).mo56372aa(30155)).mo56387q("unKnown request code: %d", i);
                return;
        }
    }
}
