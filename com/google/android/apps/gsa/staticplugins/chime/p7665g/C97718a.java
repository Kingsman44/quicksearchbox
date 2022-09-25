package com.google.android.apps.gsa.staticplugins.chime.p7665g;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.g.a */
/* compiled from: PG */
public final class C97718a {

    /* renamed from: a */
    private final C90998g f272843a;

    public C97718a(C90998g gVar) {
        this.f272843a = gVar;
    }

    /* renamed from: a */
    public final void mo90797a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(" - ");
        sb.append(str2);
        if (str3 != null) {
            sb.append(": ");
            sb.append(str3);
        }
        this.f272843a.mo85270f(sb.toString(), C90996e.f254198a);
    }
}
