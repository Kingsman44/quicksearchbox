package com.google.android.apps.gsa.staticplugins.bisto;

import android.content.Context;
import com.google.android.libraries.assistant.accessory.p618b.C11011p;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.z */
/* compiled from: PG */
public final class C96636z implements C68220f {
    /* renamed from: a */
    public static C11011p m160135a(Context context) {
        if (C11011p.f36176b == null) {
            synchronized (C11011p.class) {
                if (C11011p.f36176b == null) {
                    C11011p.f36176b = new C11011p(context);
                }
            }
        }
        C11011p pVar = C11011p.f36176b;
        C68225k.m98532d(pVar);
        return pVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
