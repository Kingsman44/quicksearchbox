package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.services.application.C20584bk;
import com.google.android.libraries.componentview.services.application.C20585bl;
import com.google.android.libraries.componentview.services.p1701a.C20536e;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.componentview.components.c.bs */
/* compiled from: PG */
public final class C20226bs implements C20220bm {

    /* renamed from: a */
    private final View f56802a;

    /* renamed from: b */
    private final C56429h f56803b;

    /* renamed from: c */
    private final C20223bp f56804c;

    /* renamed from: d */
    private final int f56805d;

    public C20226bs(C20223bp bpVar, int i) {
        this.f56804c = bpVar;
        this.f56802a = bpVar.mo25098kH();
        this.f56803b = bpVar.mo25419H();
        this.f56805d = i;
    }

    /* renamed from: b */
    public final int mo25296b() {
        View view = this.f56802a;
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        return this.f56802a.getHeight();
    }

    /* renamed from: c */
    public final C20219bl mo25297c(boolean z) {
        C20470a aVar;
        ArrayList arrayList = new ArrayList();
        View view = this.f56802a;
        if (view != null) {
            int i = this.f56805d - 1;
            int i2 = 8;
            if (i == 1) {
                if (true == z) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                if (this.f56803b != null) {
                    arrayList.add(new C20585bl(this.f56803b, z ? C20584bk.SHOW : C20584bk.HIDE));
                }
            } else if (i == 2) {
                if (true != z) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                if (this.f56803b != null) {
                    arrayList.add(new C20585bl(this.f56803b, z ? C20584bk.HIDE : C20584bk.SHOW));
                }
            }
            if (this.f56802a.getVisibility() == 0) {
                C20223bp bpVar = this.f56804c;
                if (!bpVar.f56790g) {
                    bpVar.f56790g = true;
                    C56425d dVar = bpVar.f56788e.f56416c;
                    if (dVar == null) {
                        dVar = C56425d.f150537g;
                    }
                    bpVar.f56789f = dVar;
                    C20536e eVar = bpVar.f56791h;
                    if (eVar != null) {
                        C20537f fVar = bpVar.f56153b;
                        C56425d dVar2 = bpVar.f56788e.f56416c;
                        if (dVar2 == null) {
                            dVar2 = C56425d.f150537g;
                        }
                        aVar = fVar.mo25451b(bpVar, dVar2, eVar);
                    } else {
                        C20537f fVar2 = bpVar.f56153b;
                        C56425d dVar3 = bpVar.f56788e.f56416c;
                        if (dVar3 == null) {
                            dVar3 = C56425d.f150537g;
                        }
                        aVar = fVar2.mo25450a(bpVar, dVar3);
                    }
                    bpVar.f56791h = null;
                    if (aVar != null) {
                        View kH = aVar.mo25098kH();
                        FrameLayout frameLayout = (FrameLayout) bpVar.mo25098kH();
                        if (!(kH == null || frameLayout == null)) {
                            frameLayout.addView(kH);
                        }
                        bpVar.f57600l = C58485gu.m89846n(aVar);
                        bpVar.mo25301o(aVar);
                    }
                }
            }
        }
        return new C20219bl(true, arrayList);
    }

    /* renamed from: d */
    public final C20228bu mo25298d(boolean z) {
        View view;
        int i = this.f56805d;
        boolean z2 = true;
        if (i == 1 || (view = this.f56802a) == null) {
            return null;
        }
        if ((i == 2) != z) {
            z2 = false;
        }
        return new C20272dk(view, z2);
    }
}
