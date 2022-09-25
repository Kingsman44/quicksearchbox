package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jc */
/* compiled from: PG */
public final class C7031jc implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new C7027iz();

    /* renamed from: a */
    public final String f22535a;

    /* renamed from: b */
    private final C7030jb[] f22536b;

    /* renamed from: c */
    private int f22537c;

    public C7031jc(Parcel parcel) {
        this.f22535a = parcel.readString();
        C7030jb[] jbVarArr = (C7030jb[]) aeu.m18536f((C7030jb[]) parcel.createTypedArray(C7030jb.CREATOR));
        this.f22536b = jbVarArr;
        int length = jbVarArr.length;
    }

    /* renamed from: a */
    public static C7031jc m20845a(C7031jc jcVar, C7031jc jcVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (jcVar != null) {
            str = jcVar.f22535a;
            for (C7030jb jbVar : jcVar.f22536b) {
                if (jbVar.mo16056b()) {
                    arrayList.add(jbVar);
                }
            }
        } else {
            str = null;
        }
        if (jcVar2 != null) {
            if (str == null) {
                str = jcVar2.f22535a;
            }
            int size = arrayList.size();
            for (C7030jb jbVar2 : jcVar2.f22536b) {
                if (jbVar2.mo16056b()) {
                    UUID uuid = jbVar2.f22530a;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            arrayList.add(jbVar2);
                            break;
                        } else if (((C7030jb) arrayList.get(i)).f22530a.equals(uuid)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7031jc(str, (List) arrayList);
    }

    /* renamed from: b */
    public final C7031jc mo16061b(String str) {
        if (aeu.m18533c(this.f22535a, str)) {
            return this;
        }
        return new C7031jc(str, false, this.f22536b);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C7030jb jbVar = (C7030jb) obj;
        C7030jb jbVar2 = (C7030jb) obj2;
        return C6821bi.f21605a.equals(jbVar.f22530a) ? !C6821bi.f21605a.equals(jbVar2.f22530a) ? 1 : 0 : jbVar.f22530a.compareTo(jbVar2.f22530a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7031jc jcVar = (C7031jc) obj;
            return aeu.m18533c(this.f22535a, jcVar.f22535a) && Arrays.equals(this.f22536b, jcVar.f22536b);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22535a);
        parcel.writeTypedArray(this.f22536b, 0);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f22537c;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f22535a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.f22536b);
        this.f22537c = hashCode;
        return hashCode;
    }

    public C7031jc(String str, List list) {
        this(str, false, (C7030jb[]) list.toArray(new C7030jb[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.ads.interactivemedia.v3.internal.jb[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C7031jc(java.lang.String r1, boolean r2, com.google.ads.interactivemedia.p367v3.internal.C7030jb... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f22535a = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.ads.interactivemedia.v3.internal.jb[] r3 = (com.google.ads.interactivemedia.p367v3.internal.C7030jb[]) r3
        L_0x000e:
            r0.f22536b = r3
            int r1 = r3.length
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7031jc.<init>(java.lang.String, boolean, com.google.ads.interactivemedia.v3.internal.jb[]):void");
    }

    public C7031jc(String str, C7030jb... jbVarArr) {
        this(str, true, jbVarArr);
    }

    public C7031jc(List list) {
        this((String) null, false, (C7030jb[]) list.toArray(new C7030jb[0]));
    }
}
