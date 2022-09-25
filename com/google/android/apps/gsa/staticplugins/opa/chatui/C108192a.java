package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.a */
/* compiled from: PG */
public abstract class C108192a extends C108232bc {
    public C108192a() {
        super((byte[]) null);
        this.f301029k.mo85049c(0, 72);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo96575b() {
        return true;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 27222;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar != null) {
            return C28293k.m52908e(jVar, new C28293k[0]);
        }
        return null;
    }

    /* renamed from: jz */
    public final int mo96576jz(BitFlags bitFlags) {
        return ((mo96575b() || !BitFlags.m148144f(bitFlags.f253762b, 8)) && !BitFlags.m148144f(bitFlags.f253762b, 32)) ? 1 : 2;
    }
}
