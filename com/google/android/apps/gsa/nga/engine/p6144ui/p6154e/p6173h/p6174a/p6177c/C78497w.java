package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a.C78293ao;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.w */
/* compiled from: PG */
public final class C78497w extends C78465eg {

    /* renamed from: a */
    private final C58485gu f216182a;

    /* renamed from: b */
    private final C78293ao f216183b;

    /* renamed from: c */
    private final Optional f216184c;

    /* renamed from: d */
    private final C58485gu f216185d;

    /* renamed from: e */
    private final Optional f216186e;

    public C78497w(C58485gu guVar, C78293ao aoVar, Optional optional, C58485gu guVar2, Optional optional2) {
        if (guVar != null) {
            this.f216182a = guVar;
            if (aoVar != null) {
                this.f216183b = aoVar;
                if (optional != null) {
                    this.f216184c = optional;
                    if (guVar2 != null) {
                        this.f216185d = guVar2;
                        if (optional2 != null) {
                            this.f216186e = optional2;
                            return;
                        }
                        throw new NullPointerException("Null privacyChip");
                    }
                    throw new NullPointerException("Null tactileChips");
                }
                throw new NullPointerException("Null freSuggestion");
            }
            throw new NullPointerException("Null onboardingConfig");
        }
        throw new NullPointerException("Null chips");
    }

    /* renamed from: a */
    public final C78293ao mo73387a() {
        return this.f216183b;
    }

    /* renamed from: b */
    public final C58485gu mo73388b() {
        return this.f216182a;
    }

    /* renamed from: c */
    public final C58485gu mo73389c() {
        return this.f216185d;
    }

    /* renamed from: d */
    public final Optional mo73390d() {
        return this.f216184c;
    }

    /* renamed from: e */
    public final Optional mo73391e() {
        return this.f216186e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78465eg) {
            C78465eg egVar = (C78465eg) obj;
            return C58597ky.m90218i(this.f216182a, egVar.mo73388b()) && this.f216183b.equals(egVar.mo73387a()) && this.f216184c.equals(egVar.mo73390d()) && C58597ky.m90218i(this.f216185d, egVar.mo73389c()) && this.f216186e.equals(egVar.mo73391e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f216182a.hashCode() ^ 1000003) * 1000003) ^ this.f216183b.hashCode()) * 1000003) ^ this.f216184c.hashCode()) * 1000003) ^ this.f216185d.hashCode()) * 1000003) ^ this.f216186e.hashCode();
    }

    public final String toString() {
        String obj = this.f216182a.toString();
        String obj2 = this.f216183b.toString();
        String obj3 = this.f216184c.toString();
        String obj4 = this.f216185d.toString();
        String obj5 = this.f216186e.toString();
        return "TactileContentResponse{chips=" + obj + ", onboardingConfig=" + obj2 + ", freSuggestion=" + obj3 + ", tactileChips=" + obj4 + ", privacyChip=" + obj5 + "}";
    }
}
