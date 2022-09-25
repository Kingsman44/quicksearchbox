package com.google.android.libraries.play.unison.binding;

import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2362bj;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4091g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.aa */
/* compiled from: PG */
final class C31952aa implements C2363bk {

    /* renamed from: a */
    private final C4091g f85935a;

    public C31952aa(C4091g gVar) {
        C69664n.m101061g(gVar, "savedStateRegistryOwner");
        this.f85935a = gVar;
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        C69664n.m101061g(cls, "modelClass");
        if (C69664n.m101066l(cls, BindableStateStore.class)) {
            BindableStateStore bindableStateStore = new BindableStateStore(50);
            C31986l.m59588a(bindableStateStore, this.f85935a);
            return bindableStateStore;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: b */
    public final /* synthetic */ C2358bf mo635b(Class cls, C2322c cVar) {
        return C2362bj.m6360a(this, cls);
    }
}
