package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44565p;
import com.google.android.material.bottomsheet.C44566q;
import com.google.assistant.p3994s.p3995a.C53070ag;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.ad */
/* compiled from: PG */
public final class C114905ad extends C44566q {

    /* renamed from: a */
    public C53070ag f318790a = C53070ag.f139073g;

    /* renamed from: b */
    public C114907af f318791b;

    /* renamed from: c */
    public C114908ag f318792c;

    /* renamed from: d */
    public C114756j f318793d;

    public final Dialog onCreateDialog(Bundle bundle) {
        C44565p pVar = new C44565p(getContext(), R.style.ZeroStateFabBottomSheetDialog);
        pVar.mo47541h().mo47519v(3);
        C114908ag agVar = this.f318792c;
        if (agVar != null) {
            C114756j jVar = this.f318793d;
            Context context = (Context) agVar.f318804a.mo17428b();
            context.getClass();
            C114914am amVar = (C114914am) agVar.f318805b.mo17428b();
            amVar.getClass();
            C114947y yVar = (C114947y) agVar.f318806c.mo17428b();
            yVar.getClass();
            C114943u uVar = (C114943u) agVar.f318807d.mo17428b();
            uVar.getClass();
            C114907af afVar = new C114907af(context, amVar, yVar, uVar, pVar, jVar);
            this.f318791b = afVar;
            afVar.mo101699a(this.f318790a);
        }
        return pVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C114906ae aeVar;
        C114907af afVar = this.f318791b;
        if (!(afVar == null || (aeVar = afVar.f318794a) == null)) {
            aeVar.mo101697l();
            afVar.f318794a = null;
        }
        super.onDismiss(dialogInterface);
    }
}
