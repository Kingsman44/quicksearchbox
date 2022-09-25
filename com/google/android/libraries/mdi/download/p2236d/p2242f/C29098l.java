package com.google.android.libraries.mdi.download.p2236d.p2242f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.mdi.download.d.f.l */
/* compiled from: PG */
public final class C29098l {

    /* renamed from: a */
    public final boolean f78953a;

    /* renamed from: b */
    private final Object f78954b;

    /* renamed from: c */
    private final Object f78955c;

    private C29098l(boolean z, Object obj, Object obj2) {
        this.f78953a = z;
        this.f78954b = obj;
        this.f78955c = obj2;
    }

    /* renamed from: a */
    public static C29098l m53998a(Object obj) {
        return new C29098l(true, obj, (Object) null);
    }

    /* renamed from: b */
    public static C29098l m53999b(Object obj) {
        return new C29098l(false, (Object) null, obj);
    }

    /* renamed from: e */
    public static boolean m54000e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: c */
    public final Object mo34569c() {
        if (this.f78953a) {
            return this.f78954b;
        }
        throw new IllegalStateException("Either was not left");
    }

    /* renamed from: d */
    public final Object mo34570d() {
        if (mo34572f()) {
            return this.f78955c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29098l)) {
            return false;
        }
        C29098l lVar = (C29098l) obj;
        if (this.f78953a) {
            if (!lVar.f78953a || !m54000e(mo34569c(), lVar.mo34569c())) {
                return false;
            }
            return true;
        } else if (!lVar.mo34572f() || !m54000e(mo34570d(), lVar.mo34570d())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo34572f() {
        return !this.f78953a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f78953a), this.f78954b, this.f78955c});
    }

    /* renamed from: g */
    public static boolean m54001g(C29098l lVar, C29098l lVar2, Comparator comparator) {
        Object obj;
        if (lVar == null || !lVar.f78953a || (obj = lVar.f78954b) == null || lVar2 == null || !lVar2.f78953a || lVar2.f78954b == null) {
            return m54000e(lVar, lVar2);
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        ArrayList arrayList2 = new ArrayList((Collection) lVar2.f78954b);
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        return arrayList.equals(arrayList2);
    }
}
