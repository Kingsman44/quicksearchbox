package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import androidx.p060c.C0979i;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.cs */
/* compiled from: PG */
final class C98118cs extends C98045a {

    /* renamed from: a */
    public final Set f273979a = new C0979i(0);

    /* renamed from: b */
    private final C98127i f273980b;

    public C98118cs(C98127i iVar) {
        this.f273980b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77745a(C7718hj hjVar) {
        if (!hjVar.f26946R && hjVar.f26949U) {
            Set set = this.f273979a;
            C7669fo foVar = hjVar.f26968i;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
            set.remove(foVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo86659k() {
        this.f273979a.clear();
        this.f273979a.addAll(this.f273980b.mo90982a().keySet());
    }
}
