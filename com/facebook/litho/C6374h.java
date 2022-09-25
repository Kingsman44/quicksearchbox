package com.facebook.litho;

import com.facebook.yoga.C6565a;
import java.util.ArrayList;

/* renamed from: com.facebook.litho.h */
/* compiled from: PG */
public final class C6374h extends C6406p {

    /* renamed from: a */
    public C6395i f18849a;

    /* renamed from: a */
    public final /* synthetic */ C6407q mo13259a() {
        return this.f18849a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13260b(C6407q qVar) {
        this.f18849a = (C6395i) qVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo13261c(C6565a aVar) {
        C6395i iVar = this.f18849a;
        int i = C6395i.f18920g;
        iVar.f18922b = aVar;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo13262d(C6565a aVar) {
        C6395i iVar = this.f18849a;
        int i = C6395i.f18920g;
        iVar.f18923c = aVar;
    }

    /* renamed from: e */
    public final void mo13264f(C6407q qVar) {
        if (qVar != null) {
            C6395i iVar = this.f18849a;
            if (iVar.f18921a == null) {
                iVar.f18921a = new ArrayList();
            }
            this.f18849a.f18921a.add(qVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo13389g(C6411u uVar, C6395i iVar) {
        super.mo13449w(uVar, iVar);
        this.f18849a = iVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo13266h(int i) {
        C6395i iVar = this.f18849a;
        int i2 = C6395i.f18920g;
        iVar.f18925e = i;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo13267i(int i) {
        C6395i iVar = this.f18849a;
        int i2 = C6395i.f18920g;
        iVar.f18926f = i;
    }

    /* renamed from: j */
    public final void mo13390j(C6405o oVar) {
        mo13264f(oVar.mo13259a());
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo13268k() {
    }
}
