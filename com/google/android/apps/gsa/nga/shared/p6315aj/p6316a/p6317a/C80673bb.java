package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bb */
/* compiled from: PG */
final class C80673bb extends C80731df {

    /* renamed from: a */
    private final String f221490a;

    /* renamed from: b */
    private final String f221491b;

    /* renamed from: c */
    private final C80831aj f221492c;

    /* renamed from: d */
    private final C80758ef f221493d;

    public C80673bb(String str, String str2, C80831aj ajVar, C80758ef efVar) {
        this.f221490a = str;
        this.f221491b = str2;
        this.f221492c = ajVar;
        this.f221493d = efVar;
    }

    /* renamed from: a */
    public final C80758ef mo74528a() {
        return this.f221493d;
    }

    /* renamed from: b */
    public final C80831aj mo74529b() {
        return this.f221492c;
    }

    /* renamed from: c */
    public final String mo74530c() {
        return this.f221491b;
    }

    /* renamed from: d */
    public final String mo74531d() {
        return this.f221490a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80731df) {
            C80731df dfVar = (C80731df) obj;
            return this.f221490a.equals(dfVar.mo74531d()) && this.f221491b.equals(dfVar.mo74530c()) && this.f221492c.equals(dfVar.mo74529b()) && this.f221493d.equals(dfVar.mo74528a());
        }
    }

    public final int hashCode() {
        return ((((((this.f221490a.hashCode() ^ 1000003) * 1000003) ^ this.f221491b.hashCode()) * 1000003) ^ this.f221492c.hashCode()) * 1000003) ^ this.f221493d.hashCode();
    }

    public final String toString() {
        String str = this.f221490a;
        String str2 = this.f221491b;
        String obj = this.f221492c.toString();
        String obj2 = this.f221493d.toString();
        return "Greeting{text=" + str + ", bottomText=" + str2 + ", clickAssistantUiOutputAction=" + obj + ", privacyInputUi=" + obj2 + "}";
    }
}
