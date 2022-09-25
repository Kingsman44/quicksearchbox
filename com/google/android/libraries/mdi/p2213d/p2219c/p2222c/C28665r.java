package com.google.android.libraries.mdi.p2213d.p2219c.p2222c;

import com.google.android.libraries.mdi.p2213d.p2219c.C28680i;
import com.google.android.libraries.mdi.p2213d.p2219c.p2220a.C28623a;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2224b.C28641b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.d.c.c.r */
/* compiled from: PG */
public final /* synthetic */ class C28665r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28671x f77919a;

    /* renamed from: b */
    public final /* synthetic */ C28680i f77920b;

    /* renamed from: c */
    public final /* synthetic */ int f77921c;

    public /* synthetic */ C28665r(C28671x xVar, C28680i iVar, int i) {
        this.f77919a = xVar;
        this.f77920b = iVar;
        this.f77921c = i;
    }

    public final C60870cx apply(Object obj) {
        C28671x xVar = this.f77919a;
        C28680i iVar = this.f77920b;
        int i = this.f77921c;
        C28638aj ajVar = (C28638aj) obj;
        if (!C28671x.m53541n(ajVar, iVar)) {
            return C60856cj.m92899h(new C28623a());
        }
        C28641b bVar = xVar.f77930b;
        C28637ai aiVar = ajVar.f77884b;
        if (aiVar == null) {
            aiVar = C28637ai.f77874e;
        }
        return bVar.mo34309a(aiVar, i);
    }
}
