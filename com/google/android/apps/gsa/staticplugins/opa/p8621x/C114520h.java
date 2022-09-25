package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.staticplugins.opa.C109205hl;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.h */
/* compiled from: PG */
final class C114520h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C114524l f317586a;

    public C114520h(C114524l lVar) {
        this.f317586a = lVar;
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_close) {
            C114524l lVar = this.f317586a;
            C109205hl hlVar = lVar.f317603k;
            if (hlVar != null) {
                hlVar.mo97660a(lVar.f317593a);
                if (!this.f317586a.f317595c.mo79746e(C90029ch.f248221aH)) {
                    this.f317586a.f317603k = null;
                }
            }
            this.f317586a.mo101383a();
            return;
        }
        C114524l lVar2 = this.f317586a;
        String str = lVar2.f317593a;
        if (str != null && !str.equals(lVar2.f317598f.getString(R.string.not_now))) {
            return;
        }
        if (id == R.id.btn_rating_1) {
            C114524l lVar3 = this.f317586a;
            lVar3.mo101384b(1, (ImageView) lVar3.f317594b.findViewById(R.id.btn_rating_1));
        } else if (id == R.id.btn_rating_2) {
            C114524l lVar4 = this.f317586a;
            lVar4.mo101384b(2, (ImageView) lVar4.f317594b.findViewById(R.id.btn_rating_2));
        } else if (id == R.id.btn_rating_3) {
            C114524l lVar5 = this.f317586a;
            lVar5.mo101384b(3, (ImageView) lVar5.f317594b.findViewById(R.id.btn_rating_3));
        } else if (id == R.id.btn_rating_4) {
            C114524l lVar6 = this.f317586a;
            lVar6.mo101384b(4, (ImageView) lVar6.f317594b.findViewById(R.id.btn_rating_4));
        } else if (id == R.id.btn_rating_5) {
            C114524l lVar7 = this.f317586a;
            lVar7.mo101384b(5, (ImageView) lVar7.f317594b.findViewById(R.id.btn_rating_5));
        }
    }
}
