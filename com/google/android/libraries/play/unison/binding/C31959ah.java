package com.google.android.libraries.play.unison.binding;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2362bj;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4086b;
import androidx.savedstate.C4091g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.ah */
/* compiled from: PG */
final class C31959ah implements C4086b, C2363bk {

    /* renamed from: a */
    private BindableStateStore f85944a;

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        C69664n.m101061g(cls, "modelClass");
        if (C69664n.m101066l(cls, BindableStateStore.class)) {
            BindableStateStore bindableStateStore = this.f85944a;
            if (bindableStateStore != null) {
                return bindableStateStore;
            }
            C69664n.m101065k("restoredInstance");
            return null;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: b */
    public final /* synthetic */ C2358bf mo635b(Class cls, C2322c cVar) {
        return C2362bj.m6360a(this, cls);
    }

    /* renamed from: f */
    public final void mo5786f(C4091g gVar) {
        C69664n.m101061g(gVar, "newOwner");
        Bundle a = gVar.getSavedStateRegistry().mo8584a("com.google.android.libraries.play.u:bss");
        Parcelable parcelable = a != null ? a.getParcelable(C59002s.f156871a) : null;
        if (parcelable instanceof BindableStateStore) {
            C2368bp bpVar = new C2368bp((C2371bs) gVar, (C2363bk) this);
            BindableStateStore bindableStateStore = (BindableStateStore) parcelable;
            this.f85944a = bindableStateStore;
            BindableStateStore bindableStateStore2 = (BindableStateStore) bpVar.mo5770a(BindableStateStore.class);
            if (C69664n.m101066l(bindableStateStore2, parcelable)) {
                C31986l.m59588a(bindableStateStore2, gVar);
            } else {
                bindableStateStore2.f85925b.putAll(bindableStateStore.f85925b);
            }
        }
    }
}
