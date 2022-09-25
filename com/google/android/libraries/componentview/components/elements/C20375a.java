package com.google.android.libraries.componentview.components.elements;

import com.google.android.libraries.componentview.p1699f.p1700a.C20513b;
import com.google.android.libraries.componentview.services.application.C20601ca;

/* renamed from: com.google.android.libraries.componentview.components.elements.a */
/* compiled from: PG */
final class C20375a extends C20513b {

    /* renamed from: a */
    final /* synthetic */ C20446i f57290a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20375a(C20446i iVar, C20601ca caVar) {
        super(caVar);
        this.f57290a = iVar;
    }

    /* renamed from: a */
    public final boolean mo25382a() {
        this.f57290a.f57494k.getViewTreeObserver().removeOnPreDrawListener(this);
        C20446i iVar = this.f57290a;
        int i = iVar.f57493j;
        if (i > 0 && i < iVar.f57492i.f57307b.size()) {
            C20446i iVar2 = this.f57290a;
            if (iVar2.f57493j < iVar2.f57491h.getChildCount()) {
                C20446i iVar3 = this.f57290a;
                iVar3.f57495l = iVar3.f57491h.getChildAt(iVar3.f57493j).getLeft();
                C20446i iVar4 = this.f57290a;
                iVar4.f57494k.scrollTo(iVar4.f57495l, 0);
            }
        }
        C20446i iVar5 = this.f57290a;
        iVar5.mo25394D(iVar5.f57495l);
        return false;
    }
}
