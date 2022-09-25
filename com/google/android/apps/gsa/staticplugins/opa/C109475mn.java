package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mn */
/* compiled from: PG */
final class C109475mn implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C109711mp f304927a;

    /* renamed from: b */
    private long f304928b;

    public C109475mn(C109711mp mpVar) {
        this.f304927a = mpVar;
    }

    public final void onClick(View view) {
        C109711mp mpVar = this.f304927a;
        mpVar.f305656f = false;
        C88523c cVar = mpVar.f305661k;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f304928b >= 500) {
            this.f304928b = currentTimeMillis;
            if (cVar != null) {
                C109711mp mpVar2 = this.f304927a;
                switch (mpVar2.f305659i) {
                    case 0:
                    case 5:
                    case 6:
                    case 9:
                        mpVar2.f305657g = false;
                        cVar.mo82151g();
                        return;
                    case 1:
                    case 2:
                    case 4:
                        cVar.mo82145a();
                        this.f304927a.f305657g = true;
                        return;
                    case 3:
                        if (mpVar2.f305651a.mo79746e(C90029ch.f248303r)) {
                            cVar.mo82145a();
                        } else {
                            cVar.mo82152h();
                        }
                        this.f304927a.f305657g = true;
                        return;
                    case 10:
                        cVar.mo82152h();
                        this.f304927a.f305657g = true;
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
