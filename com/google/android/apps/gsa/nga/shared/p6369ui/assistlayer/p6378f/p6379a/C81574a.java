package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6378f.p6379a;

import android.view.View;
import com.google.android.libraries.animation.C147785k;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.a */
/* compiled from: PG */
final class C81574a extends C81594u {

    /* renamed from: a */
    public final View f223146a;

    /* renamed from: b */
    public final C147785k f223147b;

    /* renamed from: c */
    public final String f223148c;

    public C81574a(View view, C147785k kVar, String str) {
        if (view != null) {
            this.f223146a = view;
            if (kVar != null) {
                this.f223147b = kVar;
                this.f223148c = str;
                return;
            }
            throw new NullPointerException("Null animationController");
        }
        throw new NullPointerException("Null chipView");
    }

    /* renamed from: a */
    public final View mo75184a() {
        return this.f223146a;
    }

    /* renamed from: b */
    public final C147785k mo75185b() {
        return this.f223147b;
    }

    /* renamed from: c */
    public final String mo75186c() {
        return this.f223148c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81594u) {
            C81594u uVar = (C81594u) obj;
            return this.f223146a.equals(uVar.mo75184a()) && this.f223147b.equals(uVar.mo75185b()) && this.f223148c.equals(uVar.mo75186c());
        }
    }

    public final int hashCode() {
        return ((((this.f223146a.hashCode() ^ 1000003) * 1000003) ^ this.f223147b.hashCode()) * 1000003) ^ this.f223148c.hashCode();
    }

    public final String toString() {
        String obj = this.f223146a.toString();
        String obj2 = this.f223147b.toString();
        String str = this.f223148c;
        return "ChipObjects{chipView=" + obj + ", animationController=" + obj2 + ", name=" + str + "}";
    }
}
