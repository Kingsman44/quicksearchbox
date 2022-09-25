package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107950a;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107951b;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107952c;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107955f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60463qz;
import com.google.common.p4552o.C60470rb;
import com.google.common.p4552o.C60471rc;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.t */
/* compiled from: PG */
final class C110937t extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ C109006es f309060a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110937t(C109006es esVar) {
        super("Add recover auth chip");
        this.f309060a = esVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 122;
        C60463qz qzVar = (C60463qz) C60471rc.f163658c.createBuilder();
        C60470rb rbVar = C60470rb.TIMEOUT;
        qzVar.copyOnWrite();
        C60471rc rcVar = (C60471rc) qzVar.instance;
        rcVar.f163661b = rbVar.f163657h;
        rcVar.f163660a |= 1;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60471rc rcVar2 = (C60471rc) qzVar.build();
        rcVar2.getClass();
        ufVar2.f164068B = rcVar2;
        ufVar2.f164093a |= LinearLayoutManager.INVALID_OFFSET;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Intent intent;
        C86053n nVar = (C86053n) obj;
        if (nVar.f232633b == C60470rb.USER_RECOVERABLE_ERROR && (intent = nVar.f232634c) != null) {
            C109006es esVar = this.f309060a;
            C109040fj fjVar = esVar.f303116a;
            C107955f fVar = fjVar.f303218D;
            C107952c cVar = fjVar.f303219E;
            ViewGroup h = fjVar.f303450o.mo95419h();
            C109065gb gbVar = esVar.f303116a.f303456u;
            Snackbar p = Snackbar.m79660p(h, R.string.opa_account_action_error_message, -2);
            C28295m.m52919e(p.f117089j, new C28292j(30376));
            p.mo48353t(R.string.opa_fix_user_recoverable_error, new C107950a(gbVar, intent));
            Context context = h.getContext();
            if (cVar.f300384b.mo93971b()) {
                p.mo48351r().f117107a.setTextColor(C19391a.m36980a(context, R.attr.colorOnBackground));
                p.f117089j.setBackgroundTintList(ColorStateList.valueOf(C19391a.m36980a(context, 16842801)));
            }
            fVar.mo96345b(cVar.f300383a.mo96346c(p, new C107951b(h), 1));
        }
    }
}
