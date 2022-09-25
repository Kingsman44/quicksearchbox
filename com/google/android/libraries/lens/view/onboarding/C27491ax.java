package com.google.android.libraries.lens.view.onboarding;

import android.app.Dialog;
import android.support.p031v4.app.C0260w;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.synthetic.C28467k;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28456a;

/* renamed from: com.google.android.libraries.lens.view.onboarding.ax */
/* compiled from: PG */
final class C27491ax implements C28456a {

    /* renamed from: a */
    C28439i f75177a;

    /* renamed from: b */
    final /* synthetic */ C27493az f75178b;

    public C27491ax(C27493az azVar) {
        this.f75178b = azVar;
    }

    /* renamed from: a */
    public final void mo18181a(Dialog dialog, View view) {
        C28306ab abVar = this.f75178b.f75190k;
        this.f75177a = abVar.mo33801b(view, abVar.f76990a.mo33805a(C28427h.m53115a(132322)));
    }

    /* renamed from: b */
    public final void mo18182b(C0260w wVar) {
        C28439i iVar = this.f75177a;
        iVar.getClass();
        C28439i a = C28485y.m53234a(this.f75178b.f75182c.requireActivity().findViewById(16908290));
        a.getClass();
        C28467k.m53225a(iVar, a);
    }
}
