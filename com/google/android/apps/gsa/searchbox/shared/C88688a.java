package com.google.android.apps.gsa.searchbox.shared;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89206k;

/* renamed from: com.google.android.apps.gsa.searchbox.shared.a */
/* compiled from: PG */
public final class C88688a implements C89206k {

    /* renamed from: a */
    public boolean f239801a = false;

    /* renamed from: b */
    public Bundle f239802b = new Bundle();

    /* renamed from: a */
    public final Bundle mo82386a(String str) {
        if (this.f239802b.containsKey(str)) {
            return this.f239802b.getBundle(str);
        }
        Bundle bundle = new Bundle();
        this.f239802b.putBundle(str, bundle);
        return bundle;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo82387b() {
        return null;
    }

    /* renamed from: c */
    public final void mo82388c() {
        this.f239802b = new Bundle();
    }

    /* renamed from: d */
    public final boolean mo82389d() {
        boolean z = this.f239801a;
        this.f239801a = false;
        return z;
    }

    public final String toString() {
        String bundle = this.f239802b.toString();
        return "RestorableState[" + bundle + "]";
    }
}
