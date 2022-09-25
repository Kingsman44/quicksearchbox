package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.support.p031v4.media.session.C0320v;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.a */
/* compiled from: PG */
final class C14784a extends C14826bn {

    /* renamed from: a */
    public final Optional f44559a;

    /* renamed from: b */
    public final C0320v f44560b;

    public C14784a(Optional optional, C0320v vVar) {
        if (optional != null) {
            this.f44559a = optional;
            if (vVar != null) {
                this.f44560b = vVar;
                return;
            }
            throw new NullPointerException("Null mediaController");
        }
        throw new NullPointerException("Null mediaBrowser");
    }

    /* renamed from: a */
    public final C0320v mo21730a() {
        return this.f44560b;
    }

    /* renamed from: b */
    public final Optional mo21731b() {
        return this.f44559a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14826bn) {
            C14826bn bnVar = (C14826bn) obj;
            return this.f44559a.equals(bnVar.mo21731b()) && this.f44560b.equals(bnVar.mo21730a());
        }
    }

    public final int hashCode() {
        return ((this.f44559a.hashCode() ^ 1000003) * 1000003) ^ this.f44560b.hashCode();
    }

    public final String toString() {
        String obj = this.f44559a.toString();
        String obj2 = this.f44560b.toString();
        return "MediaClientBundle{mediaBrowser=" + obj + ", mediaController=" + obj2 + "}";
    }
}
