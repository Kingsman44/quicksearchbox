package com.google.android.libraries.lens.view.main;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2085ax.C25616r;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.lens.view.main.cm */
/* compiled from: PG */
public final /* synthetic */ class C27350cm implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74842a;

    public /* synthetic */ C27350cm(C27384dt dtVar) {
        this.f74842a = dtVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C27384dt dtVar = this.f74842a;
        C25616r rVar = (C25616r) obj;
        int c = rVar.mo30705c();
        if (c != 0) {
            if (c == 2) {
                dtVar.mo30544X(dtVar.f75000t.getString(R.string.lens_speakr_language_not_supported), -1);
            }
            if (!C58837ba.m90859h(rVar.mo30704b())) {
                String b = rVar.mo30704b();
                b.getClass();
                int d = rVar.mo30706d();
                if (d == 0) {
                    throw null;
                } else if (d == 2) {
                    dtVar.mo32947ai(b, 1, 2);
                } else {
                    int d2 = rVar.mo30706d();
                    if (d2 == 0) {
                        throw null;
                    } else if (d2 == 3) {
                        dtVar.mo32947ai(b, 1, 3);
                    } else {
                        int d3 = rVar.mo30706d();
                        if (d3 == 0) {
                            throw null;
                        } else if (d3 == 1) {
                            dtVar.mo32947ai(b, 1, 1);
                        }
                    }
                }
            }
        } else {
            throw null;
        }
    }
}
