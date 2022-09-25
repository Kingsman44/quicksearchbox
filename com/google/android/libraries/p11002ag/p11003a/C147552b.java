package com.google.android.libraries.p11002ag.p11003a;

import com.google.android.libraries.p11002ag.C147581k;
import java.util.regex.Matcher;

/* renamed from: com.google.android.libraries.ag.a.b */
/* compiled from: PG */
public final class C147552b {

    /* renamed from: a */
    private final C147555e f398247a = new C147555e(100);

    /* renamed from: a */
    public final boolean mo124305a(CharSequence charSequence, C147581k kVar, boolean z) {
        String str = kVar.f398363a;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = this.f398247a.mo124309a(str).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (!matcher.matches()) {
            return z;
        }
        return true;
    }
}
