package com.google.android.gms.learning.p10823d;

import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.common.base.C58839bc;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.learning.d.n */
/* compiled from: PG */
public final /* synthetic */ class C144601n implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ String f391289a;

    /* renamed from: b */
    public final /* synthetic */ String f391290b;

    public /* synthetic */ C144601n(String str, String str2) {
        this.f391289a = str;
        this.f391290b = str2;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C29697g gVar;
        C29697g gVar2;
        String str = this.f391289a;
        String str2 = this.f391290b;
        C29706p pVar = (C29706p) obj;
        Pattern pattern = C144588ad.f391244a;
        if (pVar.f80450a == 13) {
            gVar = (C29697g) pVar.f80451b;
        } else {
            gVar = C29697g.f80430f;
        }
        if (!gVar.f80432a.equals(str)) {
            return false;
        }
        if (pVar.f80450a == 13) {
            gVar2 = (C29697g) pVar.f80451b;
        } else {
            gVar2 = C29697g.f80430f;
        }
        return gVar2.f80436e.equals(str2);
    }
}
