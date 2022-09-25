package com.google.android.libraries.lens.view.filters;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.common.base.C58881cr;
import com.google.common.p4552o.adh;

/* renamed from: com.google.android.libraries.lens.view.filters.ac */
/* compiled from: PG */
public final /* synthetic */ class C25896ac implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C25898ae f70364a;

    public /* synthetic */ C25896ac(C25898ae aeVar) {
        this.f70364a = aeVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C25898ae aeVar = this.f70364a;
        C25980d dVar = C25980d.AUTO_FILTER;
        switch (((C25897ad) aeVar.f70368d.mo6453a()).mo31004a().ordinal()) {
            case 1:
                return adh.DINING;
            case 2:
                return adh.SHOPPING;
            case 3:
                return adh.TRANSLATE;
            case 4:
                return adh.TEXT;
            case 5:
                return adh.OUTDOOR;
            case 6:
                return adh.EDUCATION;
            default:
                return adh.NONE;
        }
    }
}
