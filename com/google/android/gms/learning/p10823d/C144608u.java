package com.google.android.gms.learning.p10823d;

import com.google.android.gms.learning.dynamite.training.C144706bv;
import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.common.base.C58839bc;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.learning.d.u */
/* compiled from: PG */
public final /* synthetic */ class C144608u implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ String f391301a;

    /* renamed from: b */
    public final /* synthetic */ C144706bv f391302b;

    /* renamed from: c */
    public final /* synthetic */ int f391303c;

    public /* synthetic */ C144608u(String str, C144706bv bvVar, int i) {
        this.f391301a = str;
        this.f391302b = bvVar;
        this.f391303c = i;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C29697g gVar;
        String str = this.f391301a;
        C144706bv bvVar = this.f391302b;
        int i = this.f391303c;
        C29706p pVar = (C29706p) obj;
        Pattern pattern = C144588ad.f391244a;
        if (!pVar.f80453d.equals(str)) {
            return false;
        }
        if (pVar.f80450a == 13) {
            gVar = (C29697g) pVar.f80451b;
        } else {
            gVar = C29697g.f80430f;
        }
        return gVar.equals(bvVar.mo120151c()) && pVar.f80454e == i;
    }
}
