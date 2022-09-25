package com.google.android.libraries.mdi.p2213d.p2219c.p2222c;

import com.google.android.libraries.mdi.p2213d.p2219c.C28680i;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2224b.C28641b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.d.c.c.s */
/* compiled from: PG */
public final /* synthetic */ class C28666s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28671x f77922a;

    /* renamed from: b */
    public final /* synthetic */ C28680i f77923b;

    /* renamed from: c */
    public final /* synthetic */ int f77924c;

    public /* synthetic */ C28666s(C28671x xVar, C28680i iVar, int i) {
        this.f77922a = xVar;
        this.f77923b = iVar;
        this.f77924c = i;
    }

    public final C60870cx apply(Object obj) {
        C28671x xVar = this.f77922a;
        C28680i iVar = this.f77923b;
        int i = this.f77924c;
        C28638aj ajVar = (C28638aj) obj;
        if (!C28671x.m53540m(ajVar) || !C28671x.m53539l(ajVar)) {
            return xVar.mo34323h(iVar, i);
        }
        C28641b bVar = xVar.f77930b;
        C28637ai aiVar = ajVar.f77884b;
        if (aiVar == null) {
            aiVar = C28637ai.f77874e;
        }
        return C47633f.m84733g(bVar.mo34309a(aiVar, i)).mo51515h(C28653f.f77902a, C60826bg.f164896a).mo51513e(Exception.class, C28654g.f77903a, C60826bg.f164896a).mo51516i(new C28655h(xVar, ajVar, iVar, i), C60826bg.f164896a);
    }
}
