package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.text.Spanned;
import android.widget.Toast;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23933k;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23937o;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23938p;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23939q;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1973b.C23941b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.p3562ao.p3570b.p3575b.p3576a.C45598b;
import com.google.p3562ao.p3570b.p3575b.p3576a.C45600d;
import com.google.p3562ao.p3570b.p3575b.p3576a.C45602f;
import com.google.p4184bj.p4193c.p4197c.C55951ay;

/* renamed from: com.google.android.libraries.j.a.b.j */
/* compiled from: PG */
public final /* synthetic */ class C23960j implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C23965o f65519a;

    public /* synthetic */ C23960j(C23965o oVar) {
        this.f65519a = oVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C45602f fVar;
        C23965o oVar = this.f65519a;
        C23968r rVar = C23968r.CONSENT_DATA_LOADING;
        int i = 1;
        switch (((C23968r) obj).ordinal()) {
            case 0:
                oVar.f65528e.mo29352h(C23938p.CONSENT_DATA_LOADING);
                return;
            case 1:
                C55951ay ayVar = oVar.f65527d.f65549d;
                if (ayVar.f148935b == 1) {
                    fVar = (C45602f) ayVar.f148936c;
                } else {
                    fVar = C45602f.f119938j;
                }
                C23939q qVar = oVar.f65528e;
                C59308f fVar2 = fVar.f119941b;
                if (fVar2 == null) {
                    fVar2 = C59308f.f157472b;
                }
                qVar.f65456d.setText(C23941b.m44523a(fVar2));
                C23939q qVar2 = oVar.f65528e;
                C58485gu b = C23941b.m44524b(fVar.f119942c);
                qVar2.mo29346b(b, b.size() - 1);
                oVar.f65528e.f65465m = C23941b.m44524b(fVar.f119943d);
                C23939q qVar3 = oVar.f65528e;
                C58485gu<Spanned> b2 = C23941b.m44524b(fVar.f119944e);
                qVar3.f65457e.removeAllViews();
                for (Spanned a : b2) {
                    qVar3.f65457e.addView(qVar3.mo29345a(a));
                }
                if ((fVar.f119940a & 16) != 0) {
                    C23939q qVar4 = oVar.f65528e;
                    int a2 = C45598b.m81286a(fVar.f119947h);
                    if (a2 != 0) {
                        i = a2;
                    }
                    qVar4.mo29355k(i);
                } else {
                    oVar.f65528e.mo29355k(1);
                }
                if ((fVar.f119940a & 32) != 0) {
                    C45600d dVar = fVar.f119948i;
                    if (dVar == null) {
                        dVar = C45600d.f119932d;
                    }
                    C23939q qVar5 = oVar.f65528e;
                    String str = dVar.f119934a;
                    C59308f fVar3 = dVar.f119935b;
                    if (fVar3 == null) {
                        fVar3 = C59308f.f157472b;
                    }
                    Spanned a3 = C23941b.m44523a(fVar3);
                    String str2 = dVar.f119936c;
                    C23964n nVar = new C23964n(oVar);
                    if (!(str == null || a3 == null || str2 == null)) {
                        new C23937o(str, qVar5.f65462j).execute(new Void[0]);
                        qVar5.f65463k.setText(a3);
                        qVar5.f65461i.setOnClickListener(new C23933k(qVar5, nVar, str2));
                        qVar5.f65461i.setVisibility(0);
                    }
                }
                oVar.f65528e.mo29351g(fVar.f119945f);
                oVar.f65528e.mo29349e(fVar.f119946g);
                oVar.f65528e.mo29352h(C23938p.WAITING_FOR_USER_DECISION);
                return;
            case 2:
                oVar.f65528e.mo29352h(C23938p.CONSENT_WRITE_IN_PROGRESS);
                return;
            case 3:
                oVar.mo29375a(1);
                oVar.dismiss();
                return;
            case 4:
                Toast.makeText(oVar.getContext(), R.string.non_retriable_error_message, 0).show();
                oVar.mo29375a(4);
                oVar.dismiss();
                return;
            case 5:
                Toast.makeText(oVar.getContext(), R.string.already_consented_message, 0).show();
                oVar.mo29375a(5);
                oVar.dismiss();
                return;
            case 6:
                oVar.f65528e.mo29352h(C23938p.CONSENT_DATA_LOADING_FAILED);
                return;
            default:
                return;
        }
    }
}
