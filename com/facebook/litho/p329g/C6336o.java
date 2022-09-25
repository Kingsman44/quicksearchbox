package com.facebook.litho.p329g;

import android.util.Log;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6278fu;
import com.facebook.litho.C6411u;
import com.facebook.litho.widget.C6494cz;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.litho.g.o */
/* compiled from: PG */
public final class C6336o extends C6411u {

    /* renamed from: l */
    public C6346y f18742l;

    /* renamed from: m */
    public WeakReference f18743m;

    /* renamed from: n */
    public C6154cb f18744n;

    /* renamed from: o */
    public final C6331j f18745o = new C6331j();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6336o(com.facebook.litho.C6411u r5) {
        /*
            r4 = this;
            android.content.Context r0 = r5.f19009b
            java.lang.String r1 = r5.mo13470f()
            com.google.android.libraries.elements.h.m r2 = r5.mo13475m()
            com.facebook.litho.hf r5 = r5.f19016i
            com.facebook.litho.hf r5 = com.facebook.litho.C6381hf.m17120b(r5)
            r3 = 0
            r4.<init>((android.content.Context) r0, (java.lang.String) r1, (com.google.android.libraries.elements.p1729h.C21215m) r2, (com.facebook.litho.C6381hf) r3)
            r4.f19016i = r5
            com.facebook.litho.g.j r5 = new com.facebook.litho.g.j
            r5.<init>()
            r4.f18745o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.p329g.C6336o.<init>(com.facebook.litho.u):void");
    }

    /* renamed from: o */
    public static C6336o m16997o(C6336o oVar, C6335n nVar) {
        C6336o oVar2 = new C6336o(oVar);
        oVar2.f18742l = oVar.f18742l;
        oVar2.f18744n = oVar.f18744n;
        oVar2.f18743m = new WeakReference(nVar);
        return oVar2;
    }

    /* renamed from: e */
    public final String mo13348e() {
        C6335n nVar = (C6335n) this.f18743m.get();
        if (nVar != null) {
            return nVar.f18740k;
        }
        throw new IllegalStateException("getGlobalKey cannot be accessed from a SectionContext without a scope");
    }

    /* renamed from: g */
    public final void mo13349g(C6278fu fuVar, String str) {
        C6335n nVar = (C6335n) this.f18743m.get();
        C6346y yVar = this.f18742l;
        if (yVar != null && nVar != null) {
            if (C6494cz.f19262a) {
                int hashCode = this.f18742l.hashCode();
                String name = fuVar.getClass().getName();
                Log.d("SectionsDebug", "(" + hashCode + ") updateStateAsync from " + name);
            }
            yVar.mo13367h(nVar.f18740k, fuVar, str);
        }
    }

    /* renamed from: h */
    public final void mo13350h(C6278fu fuVar, String str) {
        C6335n nVar = (C6335n) this.f18743m.get();
        C6346y yVar = this.f18742l;
        if (yVar != null && nVar != null) {
            if (C6494cz.f19262a) {
                int hashCode = this.f18742l.hashCode();
                String name = fuVar.getClass().getName();
                Log.d("SectionsDebug", "(" + hashCode + ") updateState from " + name);
            }
            yVar.mo13366g(nVar.f18740k, fuVar, str);
        }
    }

    /* renamed from: n */
    public final C6335n mo13351n() {
        return (C6335n) this.f18743m.get();
    }
}
