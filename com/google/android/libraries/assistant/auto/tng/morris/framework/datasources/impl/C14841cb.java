package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cb */
/* compiled from: PG */
final class C14841cb {

    /* renamed from: a */
    final String f44679a;

    /* renamed from: b */
    final MediaSessionCompat.Token f44680b;

    public C14841cb(C0320v vVar) {
        this.f44679a = vVar.mo1039g();
        this.f44680b = vVar.f1045b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14841cb)) {
            return false;
        }
        C14841cb cbVar = (C14841cb) obj;
        if (!this.f44679a.equals(cbVar.f44679a)) {
            return false;
        }
        MediaSessionCompat.Token token = this.f44680b;
        if (token != null) {
            return token.equals(cbVar.f44680b);
        }
        if (cbVar.f44680b != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44679a, this.f44680b});
    }
}
