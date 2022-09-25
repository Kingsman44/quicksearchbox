package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.view.View;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.x */
/* compiled from: PG */
final class C114698x implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f318258a;

    /* renamed from: b */
    final /* synthetic */ C114699y f318259b;

    public C114698x(C114699y yVar, ImageView imageView) {
        this.f318259b = yVar;
        this.f318258a = imageView;
    }

    public final void onClick(View view) {
        C114699y yVar = this.f318259b;
        if (yVar.f318264e) {
            this.f318258a.setImageDrawable(yVar.f318260a.getDrawable(R.drawable.quantum_ic_keyboard_arrow_down_grey600_48));
            C114699y yVar2 = this.f318259b;
            yVar2.f318261b.mo101650c(yVar2.f318263d).start();
            this.f318259b.f318264e = false;
            return;
        }
        this.f318258a.setImageDrawable(yVar.f318260a.getDrawable(R.drawable.quantum_ic_keyboard_arrow_up_grey600_48));
        C114699y yVar3 = this.f318259b;
        yVar3.f318261b.mo101649b(yVar3.f318263d).start();
        this.f318259b.f318264e = true;
    }
}
