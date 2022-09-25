package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.nga.api.a.be;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.ChatUiHelpController;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107658ar;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.assistant.p3897e.p3912f.C51211f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ea */
/* compiled from: PG */
public final class C108797ea implements C107658ar {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f302536a;

    public C108797ea(C109040fj fjVar) {
        this.f302536a = fjVar;
    }

    /* renamed from: a */
    public final void mo96199a() {
        if (C109040fj.m181378bx(this.f302536a.f303450o)) {
            C113989h hVar = (C113989h) ((C113988g) this.f302536a.f303450o).mo100833bf().mo56107c();
            hVar.mo100866bu();
            hVar.mo100864bq();
        }
    }

    /* renamed from: b */
    public final void mo96200b(boolean z) {
        this.f302536a.f303454s.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
        if (z) {
            this.f302536a.mo97544q();
        }
    }

    /* renamed from: c */
    public final void mo96201c(boolean z) {
        if (!C109040fj.m181378bx(this.f302536a.f303450o) && this.f302536a.f303229O.getVisibility() == 0) {
            int dimensionPixelSize = this.f302536a.f303346c.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_height);
            if (z) {
                dimensionPixelSize += this.f302536a.f303346c.getResources().getDimensionPixelSize(R.dimen.opa_suggestion_container_height);
            }
            this.f302536a.f303229O.setTranslationY((float) (-dimensionPixelSize));
        }
        this.f302536a.f303450o.mo95365G();
    }

    /* renamed from: d */
    public final void mo96202d(boolean z) {
        if (z) {
            if (this.f302536a.mo97521bm()) {
                this.f302536a.f303238X.mo96151ac(true);
            } else {
                this.f302536a.mo97498bH(true, false, false, 5);
            }
        } else if (C87566i.m142283ag(this.f302536a.f303442g) && C87566i.m142260aH(this.f302536a.f303442g) && this.f302536a.mo97519bk()) {
            this.f302536a.mo97483as();
        } else if (!this.f302536a.f303238X.mo96132aE()) {
            C109040fj fjVar = this.f302536a;
            if (fjVar.f303371cc && fjVar.mo97521bm()) {
                C109040fj fjVar2 = this.f302536a;
                if (!fjVar2.f303298bE && fjVar2.f303307bN != be.b) {
                    C109040fj fjVar3 = this.f302536a;
                    fjVar3.f303308bO = true;
                    fjVar3.f303441f.finish();
                    return;
                }
            }
            this.f302536a.f303238X.mo96151ac(false);
        }
    }

    /* renamed from: e */
    public final void mo96203e() {
        this.f302536a.f303314bU.mo101383a();
        C11300h hVar = this.f302536a.f303310bQ;
        if (hVar != null) {
            hVar.mo19711r();
        }
        if (!this.f302536a.f303455t.mo79746e(C90014bt.f247760nI) || !this.f302536a.mo97519bk() || this.f302536a.mo97526bt()) {
            ChatUiHelpController chatUiHelpController = this.f302536a.f303460y;
            if (chatUiHelpController != null) {
                if (!chatUiHelpController.f304448i.f137376e) {
                    chatUiHelpController.mo97750f(3);
                } else {
                    return;
                }
            }
            ((C108100a) this.f302536a.f303248aH.mo56107c()).f300689c = C51211f.MANUAL;
            this.f302536a.mo97462aX(1);
            if (this.f302536a.mo97521bm() || ((C113191cv) this.f302536a.f303380cl.mo27525b()).mo99907c()) {
                this.f302536a.f303238X.mo96151ac(true);
                this.f302536a.mo97431S(true);
                return;
            }
            this.f302536a.mo97498bH(true, false, false, 4);
            return;
        }
        C109040fj fjVar = this.f302536a;
        ((C106171l) this.f302536a.f303247aG.mo56107c()).mo95343g(1, fjVar.f303441f, new C108808el(fjVar, false, new C108791dy(this)), fjVar.f303456u);
    }

    /* renamed from: f */
    public final void mo96204f() {
        C109040fj fjVar = this.f302536a;
        fjVar.mo97497bG(fjVar.f303391cw);
    }
}
