package com.google.android.libraries.lens.view.session;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.p114h.p115a.C2275g;
import com.google.android.libraries.lens.view.p2148l.C27226f;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4056g.p4057a.p4058a.C54020ca;

/* renamed from: com.google.android.libraries.lens.view.session.x */
/* compiled from: PG */
public final /* synthetic */ class C28026x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28027y f76275a;

    /* renamed from: b */
    public final /* synthetic */ C27228h f76276b;

    /* renamed from: c */
    public final /* synthetic */ RectF f76277c;

    public /* synthetic */ C28026x(C28027y yVar, C27228h hVar, RectF rectF) {
        this.f76275a = yVar;
        this.f76276b = hVar;
        this.f76277c = rectF;
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar;
        C28027y yVar = this.f76275a;
        C27228h hVar = this.f76276b;
        RectF rectF = this.f76277c;
        C58833ax axVar2 = (C58833ax) obj;
        Matrix e = C28027y.m52211e((C2275g) axVar2.mo56111f());
        if (hVar.mo32671e().mo56113h()) {
            axVar = C58833ax.m90834k((C54020ca) hVar.mo32671e().mo56107c());
        } else {
            axVar = C28027y.m52212f((C2275g) axVar2.mo56111f());
        }
        C27226f a = hVar.mo32667a();
        a.mo32663b(axVar);
        return yVar.mo33484h(4, a.mo32662a(), e, rectF);
    }
}
