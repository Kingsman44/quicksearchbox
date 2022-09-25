package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8412b;

import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.b.b */
/* compiled from: PG */
final class C109988b extends C109992f {

    /* renamed from: a */
    private final C28293k f306454a;

    /* renamed from: b */
    private final String f306455b;

    /* renamed from: c */
    private final Integer f306456c;

    public C109988b(C28293k kVar, String str, Integer num) {
        this.f306454a = kVar;
        this.f306455b = str;
        this.f306456c = num;
    }

    /* renamed from: a */
    public final C28293k mo98279a() {
        return this.f306454a;
    }

    /* renamed from: b */
    public final Integer mo98280b() {
        return this.f306456c;
    }

    /* renamed from: c */
    public final String mo98281c() {
        return this.f306455b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109992f) {
            C109992f fVar = (C109992f) obj;
            C28293k kVar = this.f306454a;
            if (kVar != null ? kVar.equals(fVar.mo98279a()) : fVar.mo98279a() == null) {
                String str = this.f306455b;
                if (str != null ? str.equals(fVar.mo98281c()) : fVar.mo98281c() == null) {
                    Integer num = this.f306456c;
                    if (num != null ? num.equals(fVar.mo98280b()) : fVar.mo98280b() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f306454a);
        String str = this.f306455b;
        Integer num = this.f306456c;
        return "XUiKitViewParentVisualElement{snapshotCardVe=" + valueOf + ", serverEventId=" + str + ", interactionTypeId=" + num + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        C28293k kVar = this.f306454a;
        int i3 = 0;
        if (kVar == null) {
            i = 0;
        } else {
            i = kVar.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        String str = this.f306455b;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Integer num = this.f306456c;
        if (num != null) {
            i3 = num.hashCode();
        }
        return i5 ^ i3;
    }
}
