package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.assistant.shared.p.m;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87710as;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87711at;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87712au;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.android.apps.gsa.staticplugins.opa.C108797ea;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113714b;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.OpaEditText;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110428c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112078c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41703c;
import com.google.assistant.p3745ab.C48245bb;
import com.google.assistant.p3745ab.C48247bd;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.an */
/* compiled from: PG */
public final class C107654an implements TextView.OnEditorActionListener, View.OnClickListener, View.OnTouchListener, View.OnFocusChangeListener, TextWatcher, C113714b {

    /* renamed from: a */
    public final /* synthetic */ C107656ap f299487a;

    /* renamed from: b */
    private final OpaEditText f299488b;

    public C107654an(C107656ap apVar, OpaEditText opaEditText) {
        this.f299487a = apVar;
        this.f299488b = opaEditText;
    }

    public final void afterTextChanged(Editable editable) {
        C107656ap apVar = this.f299487a;
        if (!apVar.mo96137aJ() || !TextUtils.equals(editable, apVar.f299508Q)) {
            C107656ap apVar2 = this.f299487a;
            Editable text = apVar2.mo96184m().getText();
            int i = 8;
            if (apVar2.mo96132aE()) {
                ImageButton imageButton = apVar2.f299600w;
                if (imageButton != null) {
                    if (true != TextUtils.isEmpty(text)) {
                        i = 0;
                    }
                    imageButton.setVisibility(i);
                }
            } else {
                boolean e = apVar2.f299582e.mo79746e(C90029ch.f248279bm);
                if (TextUtils.isEmpty(text)) {
                    apVar2.mo96108G();
                    FrameLayout frameLayout = apVar2.f299492A;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(true != C113987f.m188690a(apVar2.f299582e) ? 0 : 8);
                    }
                    ImageButton imageButton2 = apVar2.f299599v;
                    if (imageButton2 != null) {
                        imageButton2.setVisibility(8);
                    }
                    ImageButton imageButton3 = apVar2.f299600w;
                    if (imageButton3 != null) {
                        imageButton3.setVisibility(8);
                    }
                } else {
                    LogoView logoView = apVar2.f299598u;
                    if (logoView != null) {
                        logoView.setVisibility(8);
                    }
                    FrameLayout frameLayout2 = apVar2.f299492A;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                    ImageButton imageButton4 = apVar2.f299599v;
                    if (imageButton4 != null) {
                        imageButton4.setVisibility(true != e ? 0 : 8);
                    }
                    ImageButton imageButton5 = apVar2.f299600w;
                    if (imageButton5 != null) {
                        if (true == e) {
                            i = 0;
                        }
                        imageButton5.setVisibility(i);
                    }
                    apVar2.mo96141aN(3);
                }
                m l = apVar2.mo96183l();
                if (l != null) {
                    l.i();
                }
                C107658ar arVar = apVar2.f299595r;
                if (arVar != null) {
                    C108797ea eaVar = (C108797ea) arVar;
                    if (eaVar.f302536a.mo97523bp() && text.length() > 0) {
                        C11300h hVar = eaVar.f302536a.f303310bQ;
                        hVar.getClass();
                        hVar.mo19706J(text.toString(), BuildConfig.FLAVOR, (String) null);
                    }
                }
            }
            C107656ap apVar3 = this.f299487a;
            C48247bd bdVar = apVar3.f299509R;
            if (bdVar != null) {
                C48245bb bbVar = (C48245bb) bdVar.toBuilder();
                bbVar.copyOnWrite();
                C48247bd bdVar2 = (C48247bd) bbVar.instance;
                bdVar2.f124807a |= 2;
                bdVar2.f124809c = true;
                apVar3.f299509R = (C48247bd) bbVar.build();
            }
            C107656ap apVar4 = this.f299487a;
            apVar4.f299507P = false;
            if (apVar4.f299502K || !apVar4.f299503L) {
                if (apVar4.mo96172ax()) {
                    C107656ap apVar5 = this.f299487a;
                    if (apVar5.f299499H) {
                        if (!TextUtils.isEmpty(editable) || this.f299487a.mo96138aK()) {
                            C107656ap apVar6 = this.f299487a;
                            String obj = this.f299488b.getText().toString();
                            if (obj.length() == 0) {
                                ((C107662av) apVar6.f299593p.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_ZERO_PREFIX_SUGGESTIONS_START);
                            } else {
                                ((C107662av) apVar6.f299593p.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_N_PREFIX_SUGGESTIONS_START);
                            }
                            apVar6.f299494C = Query.f252741b.mo84484m().mo84245H(0, false, (QueryTriggerType) null).mo84268aE(obj, false);
                            C107698i iVar = apVar6.f299583f;
                            C88489j jVar = new C88489j(C87739bu.QUERY_SET);
                            jVar.mo82015c(apVar6.f299494C);
                            iVar.mo96219b(jVar.mo82013a());
                            C41703c cVar = this.f299487a.f299498G;
                            if (cVar != null) {
                                cVar.mo44286h(editable.length());
                                return;
                            }
                            return;
                        }
                        this.f299487a.mo96195w();
                        this.f299487a.mo96122U();
                    } else if (apVar5.f299503L && apVar5.mo96176c()) {
                        this.f299487a.mo96162an();
                    }
                }
            } else if (TextUtils.isEmpty(editable)) {
                this.f299487a.mo96195w();
                this.f299487a.mo96122U();
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C107656ap apVar = this.f299487a;
        if (!apVar.f299497F) {
            apVar.mo96103B((C110428c) apVar.f299590m.mo27525b());
        }
        if (charSequence.length() == 0 && i3 > 0) {
            C107658ar arVar = this.f299487a.f299595r;
            if (arVar != null) {
                C108797ea eaVar = (C108797ea) arVar;
                C107659as asVar = eaVar.f302536a.f303238X;
                if (asVar != null && asVar.mo96177e() == 2) {
                    C107698i iVar = eaVar.f302536a.f303454s;
                    C88489j jVar = new C88489j(C87739bu.CANCEL);
                    C62940bt btVar = C87710as.f237179a;
                    C87711at atVar = (C87711at) C87712au.f237180c.createBuilder();
                    atVar.copyOnWrite();
                    C87712au auVar = (C87712au) atVar.instance;
                    auVar.f237182a |= 1;
                    auVar.f237183b = false;
                    jVar.mo82014b(btVar, (C87712au) atVar.build());
                    iVar.mo96219b(jVar.mo82013a());
                    eaVar.f302536a.f303450o.mo95363E();
                    eaVar.f302536a.f303238X.mo96144aQ(2);
                }
            }
            if (this.f299487a.f299582e.mo79746e(C90014bt.f247760nI) && !this.f299487a.mo96176c()) {
                this.f299487a.mo96127Z(false);
            }
            boolean c = this.f299487a.mo96176c();
            m l = this.f299487a.mo96183l();
            C107656ap apVar2 = this.f299487a;
            if (!apVar2.mo96137aJ() && !apVar2.f299499H) {
                if (l != null || c) {
                    apVar2.mo96162an();
                }
            }
        }
    }

    public final void onClick(View view) {
        int i;
        C90735as asVar;
        boolean z = true;
        C58838bb.m90868c(view == this.f299488b);
        this.f299487a.f299505N.mo101383a();
        C58976aa aaVar = C58975e.f156826a;
        int selectionStart = this.f299488b.getSelectionStart();
        C107656ap apVar = this.f299487a;
        C51656n nVar = apVar.f299517Z;
        if (nVar != null) {
            Iterator it = nVar.f134601c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C51655m mVar = (C51655m) it.next();
                int i2 = mVar.f134592b;
                if (selectionStart >= i2 && selectionStart < (i = mVar.f134593c)) {
                    C107656ap apVar2 = this.f299487a;
                    C90735as asVar2 = apVar2.f299544aa;
                    if (asVar2 == null) {
                        asVar = new C90735as(i2, i);
                    } else if (i2 != asVar2.f253812a || i != asVar2.f253813b) {
                        asVar = new C90735as(i2, i);
                    }
                    apVar2.f299544aa = asVar;
                }
            }
        }
        z = false;
        apVar.f299500I = z;
        if (this.f299487a.f299582e.mo79746e(C90029ch.f248254ao) && this.f299487a.f299500I) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1625;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        C107656ap apVar3 = this.f299487a;
        if (!apVar3.mo96137aJ() && !apVar3.mo96176c() && (!TextUtils.isEmpty(this.f299488b.getText()) || this.f299487a.mo96138aK())) {
            this.f299487a.mo96162an();
            this.f299487a.mo96127Z(TextUtils.isEmpty(this.f299488b.getText()));
        }
        ((C107662av) this.f299487a.f299593p.mo27525b()).mo96210f(4);
        m l = this.f299487a.mo96183l();
        if (l != null && ((C58833ax) this.f299487a.f299594q.mo27525b()).mo56113h()) {
            ((C113389c) ((C58833ax) this.f299487a.f299594q.mo27525b()).mo56107c()).mo99634i();
            l.v(this.f299488b.getText().toString());
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C58838bb.m90868c(textView == this.f299488b);
        this.f299487a.f299505N.mo101383a();
        if (i == 4 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
            this.f299487a.mo96109H();
            return true;
        } else if (!this.f299487a.f299582e.mo79746e(C90063do.f249295ao) || !this.f299487a.mo96132aE() || !this.f299487a.mo96133aF() || i != 2) {
            return false;
        } else {
            m l = this.f299487a.mo96183l();
            if (l != null) {
                l.g();
            }
            return true;
        }
    }

    public final void onFocusChange(View view, boolean z) {
        C58838bb.m90868c(view == this.f299488b);
        this.f299487a.f299505N.mo101383a();
        if (!this.f299487a.f299582e.mo79746e(C90063do.f249531fL) || !this.f299487a.mo96131aD()) {
            C107656ap apVar = this.f299487a;
            if (apVar.f299595r != null) {
                if (apVar.f299582e.mo79746e(C90029ch.f248265az)) {
                    this.f299487a.f299584g.mo28212l("searchPlateCallback.onEditTextFocusChanged", new C107652al(this, z));
                } else {
                    C107658ar arVar = this.f299487a.f299595r;
                    arVar.getClass();
                    arVar.mo96202d(z);
                }
            }
            if (!z && !this.f299487a.mo96173ay()) {
                if (this.f299487a.f299582e.mo79746e(C90029ch.f248265az)) {
                    this.f299487a.f299584g.mo28212l("maybeExitTypingMode", new C107653am(this));
                } else {
                    this.f299487a.mo96104C(true);
                }
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f299487a.f299505N.mo101383a();
        if (!this.f299487a.f299582e.mo79746e(C90063do.f249513eu) || !this.f299487a.f299514W) {
            C112078c k = this.f299487a.mo96182k();
            if (!this.f299487a.f299582e.mo79746e(C90063do.f249479eM) && k != null) {
                C112078c cVar = k;
                cVar.f311254e = true;
                cVar.mo99353d();
            }
            m l = this.f299487a.mo96183l();
            if (this.f299487a.mo96177e() == 1 && l != null && this.f299487a.f299499H) {
                l.z(this.f299488b.getText().toString(), i2, i3);
                if (this.f299487a.f299582e.mo79746e(C90029ch.f248215aB)) {
                    C107662av avVar = (C107662av) this.f299487a.f299593p.mo27525b();
                    if (avVar.f299653a.mo79746e(C90029ch.f248215aB)) {
                        avVar.f299655c = false;
                    }
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h k;
        C58838bb.m90868c(view == this.f299488b);
        if (motionEvent.getAction() == 1 && (k = this.f299487a.mo96182k()) != null && (this.f299487a.f299582e.mo79746e(C90063do.f249479eM) || this.f299488b.getText().toString().isEmpty())) {
            k.c(true);
            this.f299487a.mo96135aH();
        }
        return false;
    }
}
