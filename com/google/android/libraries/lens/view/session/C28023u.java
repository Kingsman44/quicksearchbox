package com.google.android.libraries.lens.view.session;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.p114h.p115a.C2275g;
import com.google.android.libraries.lens.view.p2148l.C27226f;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.lens.view.session.u */
/* compiled from: PG */
public final /* synthetic */ class C28023u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28027y f76267a;

    /* renamed from: b */
    public final /* synthetic */ C27228h f76268b;

    /* renamed from: c */
    public final /* synthetic */ RectF f76269c;

    public /* synthetic */ C28023u(C28027y yVar, C27228h hVar, RectF rectF) {
        this.f76267a = yVar;
        this.f76268b = hVar;
        this.f76269c = rectF;
    }

    public final C60870cx apply(Object obj) {
        C28027y yVar = this.f76267a;
        C27228h hVar = this.f76268b;
        RectF rectF = this.f76269c;
        C58833ax axVar = (C58833ax) obj;
        Matrix e = C28027y.m52211e((C2275g) axVar.mo56111f());
        C58833ax f = C28027y.m52212f((C2275g) axVar.mo56111f());
        C27226f a = hVar.mo32667a();
        a.mo32663b(f);
        return yVar.mo33484h(2, a.mo32662a(), e, rectF);
    }
}
