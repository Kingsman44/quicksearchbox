package com.google.android.gms.learning.p10823d;

import com.google.android.gms.learning.dynamite.training.C144706bv;
import com.google.android.libraries.micore.learning.p2258a.C29695e;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.common.base.C58839bc;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.learning.d.t */
/* compiled from: PG */
public final /* synthetic */ class C144607t implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ String f391298a;

    /* renamed from: b */
    public final /* synthetic */ C144706bv f391299b;

    /* renamed from: c */
    public final /* synthetic */ int f391300c;

    public /* synthetic */ C144607t(String str, C144706bv bvVar, int i) {
        this.f391298a = str;
        this.f391299b = bvVar;
        this.f391300c = i;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C29695e eVar;
        String str = this.f391298a;
        C144706bv bvVar = this.f391299b;
        int i = this.f391300c;
        C29706p pVar = (C29706p) obj;
        Pattern pattern = C144588ad.f391244a;
        if (!pVar.f80453d.equals(str)) {
            return false;
        }
        if (pVar.f80450a == 4) {
            eVar = (C29695e) pVar.f80451b;
        } else {
            eVar = C29695e.f80425d;
        }
        return eVar.f80427a.equals(bvVar.mo120139a().f80427a) && pVar.f80454e == i;
    }
}
