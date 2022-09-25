package com.google.android.libraries.elements.interfaces;

import java.util.Set;

/* renamed from: com.google.android.libraries.elements.interfaces.br */
/* compiled from: PG */
public final /* synthetic */ class C21275br implements C21277bt {

    /* renamed from: a */
    public final /* synthetic */ C21276bs f59588a;

    /* renamed from: b */
    public final /* synthetic */ C21277bt f59589b;

    public /* synthetic */ C21275br(C21276bs bsVar, C21277bt btVar) {
        this.f59588a = bsVar;
        this.f59589b = btVar;
    }

    /* renamed from: a */
    public final void mo26035a() {
        C21276bs bsVar = this.f59588a;
        C21277bt btVar = this.f59589b;
        btVar.mo26035a();
        Set set = bsVar.f59590a;
        if (set != null) {
            set.remove(btVar);
        }
    }
}
