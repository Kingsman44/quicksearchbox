package com.google.android.apps.gsa.shared.util;

/* renamed from: com.google.android.apps.gsa.shared.util.bu */
/* compiled from: PG */
public final class C90777bu {

    /* renamed from: a */
    public Object f253868a;

    /* renamed from: b */
    boolean f253869b;

    /* renamed from: a */
    public final boolean mo85112a(Object obj) {
        if (this.f253869b) {
            return false;
        }
        Object obj2 = this.f253868a;
        if (obj2 == null || obj2 == obj) {
            this.f253868a = obj;
            return true;
        }
        this.f253868a = null;
        this.f253869b = true;
        return false;
    }
}
