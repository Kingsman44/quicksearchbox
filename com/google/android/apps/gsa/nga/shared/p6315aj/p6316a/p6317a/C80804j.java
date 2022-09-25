package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.j */
/* compiled from: PG */
final class C80804j extends C80809o {

    /* renamed from: b */
    private final C80779f f221728b;

    public C80804j(C80779f fVar) {
        this.f221728b = fVar;
    }

    /* renamed from: a */
    public final C80779f mo74637a() {
        return this.f221728b;
    }

    /* renamed from: b */
    public final C80739dn mo74638b() {
        return C80739dn.APP_SHORTCUT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80738dm) {
            C80738dm dmVar = (C80738dm) obj;
            if (C80739dn.APP_SHORTCUT != dmVar.mo74638b() || !this.f221728b.equals(dmVar.mo74637a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221728b.hashCode();
    }

    public final String toString() {
        String obj = this.f221728b.toString();
        return "DoubleContent{appShortcut=" + obj + "}";
    }
}
