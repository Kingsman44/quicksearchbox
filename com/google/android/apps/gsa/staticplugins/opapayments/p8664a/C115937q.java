package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.staticplugins.opapayments.p8666ui.C115947a;
import com.google.android.apps.gsa.staticplugins.opapayments.p8666ui.ConfirmAddressDialogElement;
import com.google.android.gms.wallet.firstparty.p10885a.C146350a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1743a.p1744a.C21417a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1743a.p1744a.C21418b;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21428f;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21437o;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21438p;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4129b.p4130a.p4131a.p4132a.C54683b;
import com.google.p4129b.p4130a.p4131a.p4132a.C54685bb;
import com.google.p4129b.p4130a.p4131a.p4132a.C54690bg;
import com.google.p4129b.p4130a.p4131a.p4132a.C54691bh;
import com.google.p4129b.p4130a.p4131a.p4132a.C54720f;
import com.google.p4129b.p4130a.p4131a.p4132a.C54723i;
import com.google.p4129b.p4130a.p4131a.p4132a.C54727m;
import com.google.p4129b.p4130a.p4131a.p4132a.C54728n;
import com.google.p4129b.p4130a.p4131a.p4132a.C54729o;
import com.google.p4129b.p4130a.p4131a.p4132a.C54730p;
import com.google.p4129b.p4130a.p4131a.p4132a.C54731q;
import com.google.p4129b.p4130a.p4131a.p4132a.C54738x;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.q */
/* compiled from: PG */
public final class C115937q extends C115905a {

    /* renamed from: i */
    private static final C59071e f321481i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opapayments.a.q");

    /* renamed from: g */
    public C54683b f321482g;

    /* renamed from: h */
    public C115918af f321483h;

    /* renamed from: j */
    private boolean f321484j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
        C54731q qVar = (C54731q) C54738x.f143643c.createBuilder();
        qVar.copyOnWrite();
        C54738x xVar = (C54738x) qVar.instance;
        xVar.f143645a = 6;
        xVar.f143646b = true;
        bgVar.copyOnWrite();
        C54691bh bhVar = (C54691bh) bgVar.instance;
        C54738x xVar2 = (C54738x) qVar.build();
        xVar2.getClass();
        bhVar.f143558b = xVar2;
        bhVar.f143557a = 4;
        this.f321380c = (C54691bh) bgVar.build();
        mo77318iT().mo77312a();
        return true;
    }

    /* renamed from: i */
    public final void mo102339i(byte[] bArr, int i) {
        if (!this.f321484j) {
            this.f321484j = true;
            C115918af afVar = this.f321483h;
            C21437o oVar = afVar.f321424e;
            C21438p pVar = new C21438p();
            pVar.mo26935a(R.style.PaymentsSettingsIMOobeStyle);
            C21417a aVar = afVar.f321427h;
            C21428f fVar = new C21428f(new C146350a(afVar.f253302i));
            Account account = (Account) afVar.f321421b.mo77278a().mo56107c();
            fVar.mo26931d(afVar.mo85543a());
            fVar.mo26930c(pVar);
            C21418b.m40537a(bArr, fVar);
            if (account != null) {
                fVar.mo26929b(account);
            }
            startActivityForResult(fVar.mo26928a(), i);
        }
    }

    /* renamed from: j */
    public final void mo102340j() {
        C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
        C54731q qVar = (C54731q) C54738x.f143643c.createBuilder();
        qVar.copyOnWrite();
        C54738x xVar = (C54738x) qVar.instance;
        xVar.f143645a = 4;
        xVar.f143646b = true;
        bgVar.copyOnWrite();
        C54691bh bhVar = (C54691bh) bgVar.instance;
        C54738x xVar2 = (C54738x) qVar.build();
        xVar2.getClass();
        bhVar.f143558b = xVar2;
        bhVar.f143557a = 4;
        this.f321380c = (C54691bh) bgVar.build();
        mo77318iT().mo77312a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        C54685bb bbVar = (C54685bb) C90734ar.m148199b(arguments, "select_address_page_extra", C54685bb.f143541e.getParserForType());
        C58838bb.m90867b(bbVar, "Must supply address page under key %s", "select_address_page_extra");
        C58838bb.m90884s(bbVar.f143543a == 5, "Page must have address form to render SelectAddressFragment.");
        this.f321379b = bbVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C54728n nVar;
        C54728n nVar2;
        C54727m mVar;
        C54727m mVar2;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C54685bb bbVar = this.f321379b;
        if (bbVar.f143543a == 5) {
            nVar = (C54728n) bbVar.f143544b;
        } else {
            nVar = C54728n.f143627c;
        }
        if (nVar.f143629a == 1) {
            mo102339i(((C54720f) nVar.f143630b).f143616a.mo59174N(), 202);
        } else {
            mo102315h(R.string.select_address_title, R.string.select_address_message);
            if (nVar.f143629a == 2) {
                C54723i iVar = (C54723i) nVar.f143630b;
                C54683b bVar = iVar.f143620b;
                if (bVar == null) {
                    bVar = C54683b.f143537c;
                }
                this.f321482g = bVar;
                View inflate = layoutInflater.inflate(R.layout.opa_payments_confirm_address_dialog, (ViewGroup) null);
                ConfirmAddressDialogElement confirmAddressDialogElement = (ConfirmAddressDialogElement) inflate.findViewById(R.id.normalized_address);
                ConfirmAddressDialogElement confirmAddressDialogElement2 = (ConfirmAddressDialogElement) inflate.findViewById(R.id.input_address);
                confirmAddressDialogElement.f321503a.setChecked(true);
                C54683b bVar2 = iVar.f143620b;
                if (bVar2 == null) {
                    bVar2 = C54683b.f143537c;
                }
                C84018m.m133908c(confirmAddressDialogElement.f321504b, TextUtils.join("\n", bVar2.f143540b), TextView.BufferType.NORMAL, confirmAddressDialogElement);
                C54683b bVar3 = iVar.f143619a;
                if (bVar3 == null) {
                    bVar3 = C54683b.f143537c;
                }
                C84018m.m133908c(confirmAddressDialogElement2.f321504b, TextUtils.join("\n", bVar3.f143540b), TextView.BufferType.NORMAL, confirmAddressDialogElement2);
                confirmAddressDialogElement.setOnClickListener(new C115931k(this, iVar, confirmAddressDialogElement2, confirmAddressDialogElement));
                inflate.findViewById(R.id.input_address).setOnClickListener(new C115932l(this, iVar, confirmAddressDialogElement, confirmAddressDialogElement2));
                AlertDialog create = new AlertDialog.Builder(getActivity()).setView(inflate).setCancelable(false).setPositiveButton(R.string.action_text_save, new C115933m(this)).create();
                create.show();
                Button button = create.getButton(-1);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
                layoutParams.width = -1;
                button.setLayoutParams(layoutParams);
            } else {
                C54685bb bbVar2 = this.f321379b;
                if (bbVar2.f143543a == 5) {
                    nVar2 = (C54728n) bbVar2.f143544b;
                } else {
                    nVar2 = C54728n.f143627c;
                }
                if (nVar2.f143629a == 3) {
                    mVar = (C54727m) nVar2.f143630b;
                } else {
                    mVar = C54727m.f143623c;
                }
                for (C54683b bVar4 : mVar.f143625a) {
                    LinearLayout linearLayout = this.f321382e;
                    C115947a aVar = new C115947a(getActivity());
                    C84018m.m133908c(aVar.f321506a, TextUtils.join("\n", bVar4.f143540b), TextView.BufferType.NORMAL, aVar);
                    aVar.setOnClickListener(new C89943l(new C115934n(this, bVar4)));
                    linearLayout.addView(aVar);
                }
                LinearLayout linearLayout2 = this.f321382e;
                if (nVar2.f143629a == 3) {
                    mVar2 = (C54727m) nVar2.f143630b;
                } else {
                    mVar2 = C54727m.f143623c;
                }
                byte[] N = mVar2.f143626b.mo59174N();
                C115947a aVar2 = new C115947a(getActivity());
                C84018m.m133908c(aVar2.f321506a, C84018m.m133906a(R.string.add_new_address, aVar2), TextView.BufferType.NORMAL, aVar2);
                aVar2.setOnClickListener(new C89943l(new C115936p(this, N)));
                linearLayout2.addView(aVar2);
            }
            mo102313e();
            if (this.f321383f.mo77361b() != null) {
                this.f321383f.mo77361b().setOnClickListener(new C89943l(new C115935o(this)));
            }
        }
        return onCreateView;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 201 || i == 202) {
            this.f321484j = false;
            if (i2 != -1) {
                if (i2 != 0) {
                    C59104x c = f321481i.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SelectAddressFrag");
                    ((C59052c) ((C59052c) c).mo56372aa(30151)).mo56387q("AddressCollection Failed with resultCode: %d", i2);
                } else if (i == 202) {
                    mo102340j();
                }
            } else if (intent != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra(this.f321483h.f321423d.mo26923a());
                if (byteArrayExtra == null || byteArrayExtra.length <= 0) {
                    C59104x c2 = f321481i.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "SelectAddressFrag");
                    ((C59052c) ((C59052c) c2).mo56372aa(30153)).mo56386p("Missing AddressCollection EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
                    return;
                }
                C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
                C54731q qVar = (C54731q) C54738x.f143643c.createBuilder();
                C54729o oVar = (C54729o) C54730p.f143631b.createBuilder();
                C63088z A = C63088z.m96139A(byteArrayExtra);
                oVar.copyOnWrite();
                ((C54730p) oVar.instance).f143633a = A;
                qVar.copyOnWrite();
                C54738x xVar = (C54738x) qVar.instance;
                C54730p pVar = (C54730p) oVar.build();
                pVar.getClass();
                xVar.f143646b = pVar;
                xVar.f143645a = 1;
                bgVar.copyOnWrite();
                C54691bh bhVar = (C54691bh) bgVar.instance;
                C54738x xVar2 = (C54738x) qVar.build();
                xVar2.getClass();
                bhVar.f143558b = xVar2;
                bhVar.f143557a = 4;
                this.f321380c = (C54691bh) bgVar.build();
                mo77318iT().mo77312a();
            } else {
                C59104x c3 = f321481i.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "SelectAddressFrag");
                ((C59052c) ((C59052c) c3).mo56372aa(30152)).mo56386p("AddressCollection finishes with RESULT_OK, but no data.");
            }
        } else {
            C59104x c4 = f321481i.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "SelectAddressFrag");
            ((C59052c) ((C59052c) c4).mo56372aa(30150)).mo56387q("Unknown request code: %d", i);
        }
    }
}
