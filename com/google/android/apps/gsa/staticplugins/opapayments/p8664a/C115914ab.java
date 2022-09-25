package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.settings.features.payments.bv;
import com.google.android.apps.gsa.assistant.settings.features.payments.passwordauthentication.PasswordAuthenticationDialogFragment;
import com.google.android.apps.gsa.assistant.settings.features.payments.passwordauthentication.b;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opapayments.p8666ui.C115949c;
import com.google.android.apps.gsa.staticplugins.opapayments.p8666ui.C115950d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4129b.p4130a.p4131a.p4132a.C54664ah;
import com.google.p4129b.p4130a.p4131a.p4132a.C54683b;
import com.google.p4129b.p4130a.p4131a.p4132a.C54685bb;
import com.google.p4129b.p4130a.p4131a.p4132a.C54690bg;
import com.google.p4129b.p4130a.p4131a.p4132a.C54691bh;
import com.google.p4129b.p4130a.p4131a.p4132a.C54697bn;
import com.google.p4129b.p4130a.p4131a.p4132a.C54698bo;
import com.google.p4129b.p4130a.p4131a.p4132a.C54699bp;
import com.google.p4129b.p4130a.p4131a.p4132a.C54701br;
import com.google.p4129b.p4130a.p4131a.p4132a.C54702bs;
import com.google.p4129b.p4130a.p4131a.p4132a.C54703bt;
import com.google.p4129b.p4130a.p4131a.p4132a.C54709bz;
import com.google.p4129b.p4130a.p4131a.p4132a.C54740z;
import com.google.p4129b.p4130a.p4131a.p4132a.p4133a.C54651a;
import com.google.protobuf.C62971cq;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.ab */
/* compiled from: PG */
public final class C115914ab extends C115905a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: r */
    private static final C59071e f321399r = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opapayments.a.ab");

    /* renamed from: g */
    public C115916ad f321400g;

    /* renamed from: h */
    public boolean f321401h;

    /* renamed from: i */
    public boolean f321402i = false;

    /* renamed from: j */
    C115950d f321403j;

    /* renamed from: k */
    C115950d f321404k;

    /* renamed from: l */
    C115950d f321405l;

    /* renamed from: m */
    C115949c f321406m;

    /* renamed from: n */
    C115949c f321407n;

    /* renamed from: o */
    public bv f321408o;

    /* renamed from: p */
    public C83893b f321409p;

    /* renamed from: q */
    public C69464a f321410q;

    /* renamed from: s */
    private C54701br f321411s;

    /* renamed from: t */
    private boolean f321412t;

    /* renamed from: u */
    private boolean f321413u;

    /* renamed from: v */
    private PasswordAuthenticationDialogFragment f321414v;

    /* renamed from: k */
    private final C115950d m192151k(String str, boolean z) {
        C115950d dVar = new C115950d(getActivity());
        C84018m.m133908c(dVar.f321512a, str, TextView.BufferType.NORMAL, dVar);
        dVar.f321513b.setChecked(z);
        return dVar;
    }

    /* renamed from: l */
    private final void m192152l(Switch switchR, boolean z) {
        switchR.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        switchR.setChecked(z);
        switchR.setOnCheckedChangeListener(this);
    }

    /* renamed from: m */
    private static void m192153m(C115949c cVar, boolean z) {
        if (cVar != null) {
            cVar.setAlpha(true != z ? 0.5f : 1.0f);
            cVar.f321511c.setEnabled(z);
        }
    }

    /* renamed from: n */
    private static void m192154n(C115950d dVar, boolean z) {
        if (dVar != null) {
            dVar.setAlpha(true != z ? 0.5f : 1.0f);
            dVar.f321513b.setEnabled(z);
        }
    }

    /* renamed from: o */
    private final void m192155o(int i, b bVar) {
        PasswordAuthenticationDialogFragment passwordAuthenticationDialogFragment = (PasswordAuthenticationDialogFragment) this.f321410q.mo17428b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PASSWORD_AUTHENTICATION_PURPOSE_KEY", bVar);
        passwordAuthenticationDialogFragment.setArguments(bundle);
        passwordAuthenticationDialogFragment.setTargetFragment(this, i);
        passwordAuthenticationDialogFragment.show(getActivity().getFragmentManager(), "password_authentication");
        this.f321414v = passwordAuthenticationDialogFragment;
    }

    /* renamed from: p */
    private static int m192156p(boolean z) {
        return z ? 3 : 4;
    }

    /* renamed from: q */
    private final C115949c m192157q(String str, String str2, int i) {
        C115949c cVar = new C115949c(getActivity());
        C84018m.m133908c(cVar.f321509a, str, TextView.BufferType.NORMAL, cVar);
        if (str2.isEmpty()) {
            cVar.setOnClickListener(new C89943l(new C115943w(this, i)));
        } else {
            C84018m.m133908c(cVar.f321510b, str2, TextView.BufferType.NORMAL, cVar);
            TextView textView = cVar.f321511c;
            textView.setVisibility(0);
            textView.setOnClickListener(new C89943l(new C115944x(this, i)));
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        if (this.f321402i) {
            this.f321400g.mo102324a();
            return true;
        }
        C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
        C54702bs i = mo102319i();
        i.copyOnWrite();
        C54703bt btVar = C54703bt.f143586c;
        ((C54703bt) i.instance).f143588a = 5;
        bgVar.copyOnWrite();
        C54691bh bhVar = (C54691bh) bgVar.instance;
        C54703bt btVar2 = (C54703bt) i.build();
        btVar2.getClass();
        bhVar.f143558b = btVar2;
        bhVar.f143557a = 2;
        this.f321380c = (C54691bh) bgVar.build();
        mo77318iT().mo77312a();
        return true;
    }

    /* renamed from: i */
    public final C54702bs mo102319i() {
        C54702bs bsVar = (C54702bs) C54703bt.f143586c.createBuilder();
        C54698bo boVar = (C54698bo) C54699bp.f143576d.createBuilder();
        boVar.copyOnWrite();
        ((C54699bp) boVar.instance).f143580c = 1;
        boolean z = this.f321412t;
        boVar.copyOnWrite();
        C54699bp bpVar = (C54699bp) boVar.instance;
        bpVar.f143579b = Integer.valueOf(m192156p(z) - 2);
        bpVar.f143578a = 4;
        bsVar.mo54151a(boVar);
        C54698bo boVar2 = (C54698bo) C54699bp.f143576d.createBuilder();
        boVar2.copyOnWrite();
        ((C54699bp) boVar2.instance).f143580c = 2;
        boolean z2 = this.f321413u;
        boVar2.copyOnWrite();
        C54699bp bpVar2 = (C54699bp) boVar2.instance;
        bpVar2.f143579b = Integer.valueOf(m192156p(z2) - 2);
        bpVar2.f143578a = 4;
        bsVar.mo54151a(boVar2);
        C54698bo boVar3 = (C54698bo) C54699bp.f143576d.createBuilder();
        boVar3.copyOnWrite();
        ((C54699bp) boVar3.instance).f143580c = 3;
        boolean z3 = this.f321401h;
        boVar3.copyOnWrite();
        C54699bp bpVar3 = (C54699bp) boVar3.instance;
        bpVar3.f143579b = Integer.valueOf(m192156p(z3) - 2);
        bpVar3.f143578a = 4;
        bsVar.mo54151a(boVar3);
        return bsVar;
    }

    /* renamed from: j */
    public final void mo102320j(int i) {
        C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
        C54702bs i2 = mo102319i();
        i2.copyOnWrite();
        C54703bt btVar = C54703bt.f143586c;
        ((C54703bt) i2.instance).f143588a = i - 2;
        bgVar.copyOnWrite();
        C54691bh bhVar = (C54691bh) bgVar.instance;
        C54703bt btVar2 = (C54703bt) i2.build();
        btVar2.getClass();
        bhVar.f143558b = btVar2;
        bhVar.f143557a = 2;
        this.f321380c = (C54691bh) bgVar.build();
        mo77318iT().mo77312a();
    }

    public final void onCreate(Bundle bundle) {
        C54701br brVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        C54685bb bbVar = (C54685bb) C90734ar.m148199b(arguments, "setup_summary_page_extra", C54685bb.f143541e.getParserForType());
        C58838bb.m90867b(bbVar, "Must supply summary page under key %s", "setup_summary_page_extra");
        C58838bb.m90884s(bbVar.f143543a == 3, "Page must have summary form to render SetupSummaryFragment.");
        this.f321379b = bbVar;
        C54685bb bbVar2 = this.f321379b;
        if (bbVar2.f143543a == 3) {
            brVar = (C54701br) bbVar2.f143544b;
        } else {
            brVar = C54701br.f143581d;
        }
        this.f321411s = brVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C54701br brVar;
        C54709bz bzVar;
        int a;
        int a2;
        C54740z zVar;
        C54683b bVar;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        mo102314g(R.string.setup_summary_title, R.string.setup_summary_message);
        C62971cq<C54697bn> cqVar = this.f321411s.f143585c;
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.opa_payments_setup_summary, this.f321382e, true);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.identity_list);
        LinearLayout linearLayout3 = (LinearLayout) linearLayout.findViewById(R.id.summary_card_content);
        TextView textView = (TextView) linearLayout.findViewById(R.id.confirm_tos);
        C54685bb bbVar = this.f321379b;
        if (bbVar.f143543a == 3) {
            brVar = (C54701br) bbVar.f143544b;
        } else {
            brVar = C54701br.f143581d;
        }
        if (brVar.f143583a == 3) {
            bzVar = (C54709bz) brVar.f143584b;
        } else {
            bzVar = C54709bz.f143599d;
        }
        String str = bzVar.f143601a;
        String string = bzVar.f143603c.isEmpty() ? getResources().getString(R.string.tos_key_word) : bzVar.f143603c;
        String string2 = bzVar.f143602b.isEmpty() ? getResources().getString(R.string.confirm_tos_info) : bzVar.f143602b;
        int indexOf = string2.indexOf(string);
        int length = string.length();
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new C115913aa(this), indexOf, length + indexOf, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        C115916ad adVar = new C115916ad();
        Bundle bundle2 = new Bundle();
        bundle2.putString("tosContentHtml", str);
        adVar.setArguments(bundle2);
        this.f321400g = adVar;
        for (C54697bn bnVar : cqVar) {
            int i = bnVar.f143574c;
            boolean z = false;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 3 : 2;
            if (i2 == 0) {
                i2 = 1;
            }
            int i3 = i2 - 2;
            if (i3 == 1) {
                if (bnVar.f143572a == 4 && (a = C54651a.m87520a(((Integer) bnVar.f143573b).intValue())) != 0 && a == 3) {
                    z = true;
                }
                this.f321412t = z;
                C115950d k = m192151k(bnVar.f143575d, z);
                k.f321513b.setOnCheckedChangeListener(this);
                this.f321403j = k;
                linearLayout2.addView(k);
            } else if (i3 == 2) {
                if (bnVar.f143572a == 4 && (a2 = C54651a.m87520a(((Integer) bnVar.f143573b).intValue())) != 0 && a2 == 3) {
                    z = true;
                }
                this.f321413u = z;
                C115950d k2 = m192151k(bnVar.f143575d, z);
                k2.f321513b.setOnCheckedChangeListener(this);
                this.f321404k = k2;
                linearLayout2.addView(k2);
            } else if (i3 == 3) {
                boolean equals = this.f321408o.a(((Account) this.f321409p.mo77278a().mo56107c()).name).equals("FINGERPRINT");
                this.f321401h = equals;
                C115950d k3 = m192151k(bnVar.f143575d, equals);
                k3.f321513b.setOnCheckedChangeListener(this);
                this.f321405l = k3;
                linearLayout2.addView(k3);
            } else if (i3 == 4) {
                String str2 = bnVar.f143575d;
                if (bnVar.f143572a == 5) {
                    zVar = (C54740z) bnVar.f143573b;
                } else {
                    zVar = C54740z.f143647e;
                }
                C54664ah ahVar = zVar.f143651c;
                if (ahVar == null) {
                    ahVar = C54664ah.f143502b;
                }
                C115949c q = m192157q(str2, ahVar.f143504a, 5);
                this.f321406m = q;
                linearLayout3.addView(q);
            } else if (i3 != 5) {
                C59104x c = f321399r.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SummaryFrgm");
                ((C59052c) ((C59052c) c).mo56372aa(30158)).mo56386p("Unknown setting entry category.");
            } else {
                if (bnVar.f143572a == 6) {
                    bVar = (C54683b) bnVar.f143573b;
                } else {
                    bVar = C54683b.f143537c;
                }
                C115949c q2 = m192157q(bnVar.f143575d, TextUtils.join("\n", bVar.f143540b), 6);
                this.f321407n = q2;
                linearLayout3.addView(q2);
            }
        }
        mo102313e();
        if (this.f321383f.mo77360a() != null) {
            this.f321383f.mo77360a().setOnClickListener(new C89943l(new C115945y(this)));
        }
        if (this.f321383f.mo77361b() != null) {
            this.f321383f.mo77361b().setOnClickListener(new C89943l(new C115946z(this)));
        }
        return onCreateView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Switch switchR;
        Switch switchR2;
        C115950d dVar = this.f321403j;
        if (dVar == null || compoundButton != dVar.f321513b) {
            C115950d dVar2 = this.f321404k;
            if (dVar2 == null || compoundButton != (switchR2 = dVar2.f321513b)) {
                C115950d dVar3 = this.f321405l;
                if (dVar3 != null && compoundButton == (switchR = dVar3.f321513b)) {
                    if (!z) {
                        this.f321401h = false;
                        return;
                    }
                    m192152l(switchR, false);
                    m192155o(102, b.b);
                }
            } else if (z) {
                this.f321413u = true;
                m192154n(this.f321405l, true);
            } else {
                m192152l(switchR2, true);
                m192155o(101, b.a);
            }
        } else {
            this.f321412t = z;
            m192154n(this.f321404k, z);
            m192154n(this.f321405l, z);
            m192153m(this.f321406m, z);
            m192153m(this.f321407n, z);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 100:
                this.f321402i = false;
                break;
            case 101:
                PasswordAuthenticationDialogFragment passwordAuthenticationDialogFragment = this.f321414v;
                if (passwordAuthenticationDialogFragment != null) {
                    passwordAuthenticationDialogFragment.dismissAllowingStateLoss();
                }
                C115950d dVar = this.f321404k;
                dVar.getClass();
                Switch switchR = dVar.f321513b;
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 2) {
                            Toast.makeText(getActivity(), R.string.payment_oobe_password_authentication_too_many_attempts_message, 0).show();
                            m192152l(switchR, true);
                            this.f321413u = true;
                            break;
                        } else {
                            C59104x d = f321399r.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "SummaryFrgm");
                            ((C59052c) ((C59052c) d).mo56372aa(30160)).mo56386p("Unexpected result code for password authentication dialog.");
                            int i3 = C90755l.f253831a;
                            break;
                        }
                    } else {
                        m192152l(switchR, true);
                        this.f321413u = true;
                        break;
                    }
                } else {
                    m192152l(switchR, false);
                    m192154n(this.f321405l, false);
                    this.f321413u = false;
                    break;
                }
            case 102:
                PasswordAuthenticationDialogFragment passwordAuthenticationDialogFragment2 = this.f321414v;
                if (passwordAuthenticationDialogFragment2 != null) {
                    passwordAuthenticationDialogFragment2.dismissAllowingStateLoss();
                }
                C115950d dVar2 = this.f321405l;
                dVar2.getClass();
                Switch switchR2 = dVar2.f321513b;
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 2) {
                            Toast.makeText(getActivity(), R.string.payment_oobe_password_authentication_too_many_attempts_message, 0).show();
                            m192152l(switchR2, false);
                            this.f321401h = false;
                            break;
                        } else {
                            C59104x d2 = f321399r.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "SummaryFrgm");
                            ((C59052c) ((C59052c) d2).mo56372aa(30161)).mo56386p("Unexpected result code for password authentication dialog.");
                            int i4 = C90755l.f253831a;
                            break;
                        }
                    } else {
                        m192152l(switchR2, false);
                        this.f321401h = false;
                        break;
                    }
                } else {
                    m192152l(switchR2, true);
                    this.f321401h = true;
                    break;
                }
            default:
                C59104x d3 = f321399r.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "SummaryFrgm");
                ((C59052c) ((C59052c) d3).mo56372aa(30159)).mo56387q("unknown request code: %d", i);
                break;
        }
        this.f321381d.setVisibility(0);
        this.f321382e.setVisibility(0);
        this.f321383f.setVisibility(0);
    }
}
