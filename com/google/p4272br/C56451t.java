package com.google.p4272br;

/* renamed from: com.google.br.t */
/* compiled from: PG */
final class C56451t {

    /* renamed from: a */
    C56436e[] f150779a = new C56436e[10];

    /* renamed from: b */
    int f150780b = 0;

    /* renamed from: c */
    int f150781c;

    /* renamed from: d */
    int f150782d = 2;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo54414a(int i, int i2) {
        C56436e[] eVarArr;
        int i3;
        int i4;
        int i5;
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        int i6 = i;
        while (true) {
            eVarArr = this.f150779a;
            i3 = i6 >> 1;
            C56436e eVar = eVarArr[i3];
            i4 = i6 & 1;
            if (i4 == 0) {
                i5 = eVar.f150734b;
            } else {
                i5 = eVar.f150735c;
            }
            if (i5 == 0) {
                break;
            }
            i6 = i5;
        }
        C56436e eVar2 = eVarArr[i3];
        if (i4 == 0) {
            eVar2.f150734b = i2;
        } else {
            eVar2.f150735c = i2;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C56436e mo54415b(int i) {
        C56436e eVar = this.f150779a[i];
        while (true) {
            int i2 = eVar.f150733a;
            if (i2 != 7 && i2 != 3) {
                return eVar;
            }
            eVar = this.f150779a[i];
            i = eVar.f150734b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo54416c(int i, int i2) {
        while (i != 0) {
            C56436e eVar = this.f150779a[i >> 1];
            if ((i & 1) == 0) {
                i = eVar.f150734b;
                eVar.f150734b = i2;
            } else {
                i = eVar.f150735c;
                eVar.f150735c = i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f150780b; i++) {
            int length = sb.length();
            sb.append(i);
            if (i == this.f150781c) {
                sb.append('*');
            }
            sb.append("        ".substring(sb.length() - length));
            sb.append(this.f150779a[i]);
            sb.append(10);
        }
        return sb.toString();
    }
}
