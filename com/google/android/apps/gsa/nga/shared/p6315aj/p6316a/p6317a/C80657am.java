package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.am */
/* compiled from: PG */
final class C80657am extends C80696by {

    /* renamed from: b */
    private final String f221417b;

    /* renamed from: c */
    private final C80831aj f221418c;

    /* renamed from: d */
    private final int f221419d;

    public C80657am(String str, C80831aj ajVar, int i) {
        this.f221417b = str;
        this.f221418c = ajVar;
        this.f221419d = i;
    }

    /* renamed from: a */
    public final C80831aj mo74427a() {
        return this.f221418c;
    }

    /* renamed from: b */
    public final String mo74428b() {
        return this.f221417b;
    }

    /* renamed from: c */
    public final int mo74429c() {
        return this.f221419d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80696by) {
            C80696by byVar = (C80696by) obj;
            if (this.f221417b.equals(byVar.mo74428b()) && this.f221418c.equals(byVar.mo74427a())) {
                int i = this.f221419d;
                int c = byVar.mo74429c();
                if (i == 0) {
                    throw null;
                } else if (i == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f221417b.hashCode() ^ 1000003) * 1000003) ^ this.f221418c.hashCode()) * 1000003;
        int i = this.f221419d;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.f221417b;
        String valueOf = String.valueOf(this.f221418c);
        int i = this.f221419d;
        return "BlueBar{text=" + str + ", clickAction=" + valueOf + ", type=" + C80695bx.m128472a(i) + "}";
    }
}
