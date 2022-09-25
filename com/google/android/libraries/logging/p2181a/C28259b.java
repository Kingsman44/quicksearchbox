package com.google.android.libraries.logging.p2181a;

import com.google.common.base.C58832aw;

/* renamed from: com.google.android.libraries.logging.a.b */
/* compiled from: PG */
public final class C28259b {

    /* renamed from: a */
    public final String f76910a;

    /* renamed from: b */
    public final int f76911b;

    private C28259b(int i, String str) {
        this.f76911b = i;
        this.f76910a = str;
    }

    /* renamed from: a */
    public static C28259b m52821a() {
        return new C28259b(3, (String) null);
    }

    /* renamed from: b */
    public static C28259b m52822b() {
        return new C28259b(4, (String) null);
    }

    /* renamed from: c */
    public static C28259b m52823c(String str) {
        str.getClass();
        return new C28259b(1, str);
    }

    /* renamed from: d */
    public static C28259b m52824d() {
        return new C28259b(2, (String) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C28259b) {
            C28259b bVar = (C28259b) obj;
            if (bVar.f76911b - 1 != this.f76911b - 1 || !C58832aw.m90831a(bVar.f76910a, this.f76910a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f76911b - 1;
        String str = this.f76910a;
        return i + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
