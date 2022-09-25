package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.app.FragmentTransaction;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.aa */
/* compiled from: PG */
final class C115913aa extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C115914ab f321398a;

    public C115913aa(C115914ab abVar) {
        this.f321398a = abVar;
    }

    public final void onClick(View view) {
        C115914ab abVar = this.f321398a;
        abVar.f321381d.setVisibility(8);
        abVar.f321382e.setVisibility(8);
        abVar.f321383f.setVisibility(8);
        C115914ab abVar2 = this.f321398a;
        abVar2.f321400g.setTargetFragment(abVar2, 100);
        FragmentTransaction beginTransaction = this.f321398a.getActivity().getFragmentManager().beginTransaction();
        beginTransaction.addToBackStack(this.f321398a.f321400g.getClass().getName());
        beginTransaction.replace(R.id.opa_payments_oobe_template, this.f321398a.f321400g);
        this.f321398a.f321402i = true;
        beginTransaction.commit();
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f321398a.getResources().getColor(R.color.google_blue));
        textPaint.setUnderlineText(false);
    }
}
