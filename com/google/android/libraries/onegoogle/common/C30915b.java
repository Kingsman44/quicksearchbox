package com.google.android.libraries.onegoogle.common;

import android.content.Context;

/* renamed from: com.google.android.libraries.onegoogle.common.b */
/* compiled from: PG */
public final class C30915b extends C30925l {

    /* renamed from: a */
    public final Context f83342a;

    public C30915b(Context context) {
        if (context != null) {
            this.f83342a = context;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: a */
    public final Context mo36595a() {
        return this.f83342a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30925l) {
            return this.f83342a.equals(((C30925l) obj).mo36595a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f83342a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f83342a.toString();
        return "DrawableCompatibleContextWrapper{context=" + obj + "}";
    }
}
