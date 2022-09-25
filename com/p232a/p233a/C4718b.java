package com.p232a.p233a;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.a.a.b */
/* compiled from: PG */
final class C4718b extends C4755cj {
    public C4718b(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", BuildConfig.FLAVOR));
    }

    /* renamed from: a */
    public final String mo9615a() {
        int i;
        int i2;
        int i3;
        if (mo9655n()) {
            i2 = this.f15058b;
            i = i2;
        } else {
            int i4 = this.f15058b;
            int charAt = this.f15057a.charAt(i4);
            if (charAt == 45) {
                charAt = mo9646e();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i3 = i4;
            } else {
                int e = mo9646e();
                while (true) {
                    if ((e < 65 || e > 90) && ((e < 97 || e > 122) && !((e >= 48 && e <= 57) || e == 45 || e == 95))) {
                        break;
                    }
                    e = mo9646e();
                }
                i3 = this.f15058b;
            }
            this.f15058b = i4;
            int i5 = i3;
            i = i4;
            i2 = i5;
        }
        if (i2 == i) {
            return null;
        }
        String substring = this.f15057a.substring(i, i2);
        this.f15058b = i2;
        return substring;
    }
}
