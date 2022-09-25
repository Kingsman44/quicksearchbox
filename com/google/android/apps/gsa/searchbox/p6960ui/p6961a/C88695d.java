package com.google.android.apps.gsa.searchbox.p6960ui.p6961a;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41640a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4552o.ane;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.a.d */
/* compiled from: PG */
public final class C88695d extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    private C89205j f239810a;

    /* renamed from: b */
    private final Set f239811b = new HashSet();

    /* renamed from: a */
    public final void mo82396a(int i, String str) {
        C89205j jVar = this.f239810a;
        if (jVar != null) {
            ArrayList g = jVar.mo83167g("LOCAL_ENTITY_ADDRESS_LINE_COUNT");
            if (g == null) {
                g = new ArrayList();
                this.f239810a.mo83172l("LOCAL_ENTITY_ADDRESS_LINE_COUNT", g);
            }
            if (!this.f239811b.contains(str)) {
                g.add(Integer.valueOf(i));
                this.f239811b.add(str);
            }
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239810a = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        C89205j jVar = this.f239810a;
        if (jVar != null) {
            jVar.mo83172l("LOCAL_ENTITY_ADDRESS_LINE_COUNT", new ArrayList());
        }
        this.f239811b.clear();
    }

    /* renamed from: l */
    public final void mo44232l(C41640a aVar) {
        ArrayList g;
        C89205j jVar = this.f239810a;
        if (jVar != null && (g = jVar.mo83167g("LOCAL_ENTITY_ADDRESS_LINE_COUNT")) != null && !g.isEmpty()) {
            aVar.mo44228c(ane.LOCAL_ENTITY_ADDRESS_LINE_COUNT, TextUtils.join(",", g));
        }
    }
}
