package com.google.common.p4578u;

import com.google.android.setupcompat.p3549a.C45240c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.common.u.a */
/* compiled from: PG */
public final class C60787a {

    /* renamed from: a */
    public static final Set f164844a = new HashSet();

    /* renamed from: b */
    public char[] f164845b;

    /* renamed from: c */
    public int f164846c;

    /* renamed from: d */
    public int f164847d;

    static {
        String[] strArr = {"ach", "at", "bl", C45240c.f118157a, "dg", "iz", "v"};
        for (int i = 0; i < 7; i++) {
            f164844a.add(strArr[i]);
        }
    }

    public C60787a(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        this.f164845b = charArray;
        this.f164846c = charArray.length - 1;
    }

    /* renamed from: a */
    public final int mo57245a() {
        int i = 0;
        int i2 = 0;
        while (i <= this.f164847d) {
            int i3 = i + 1;
            if (!mo57248d(i)) {
                while (i3 <= this.f164847d) {
                    i = i3 + 1;
                    if (mo57248d(i3)) {
                        i2++;
                    } else {
                        i3 = i;
                    }
                }
                return i2;
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final void mo57246b(String str) {
        int length = str.length();
        int i = this.f164847d;
        int i2 = i + 1;
        int i3 = i2 + length;
        char[] cArr = this.f164845b;
        if (i3 > cArr.length) {
            char[] cArr2 = new char[i3];
            System.arraycopy(cArr, 0, cArr2, 0, i);
            this.f164845b = cArr2;
        }
        for (int i4 = 0; i4 < length; i4++) {
            this.f164845b[i2 + i4] = str.charAt(i4);
        }
        this.f164846c = this.f164847d + length;
    }

    /* renamed from: c */
    public final boolean mo57247c(String str) {
        int length = str.length();
        int i = (this.f164846c - length) + 1;
        if (i < 0) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f164845b[i + i2] != str.charAt(i2)) {
                return false;
            }
        }
        this.f164847d = this.f164846c - length;
        return true;
    }

    /* renamed from: d */
    public final boolean mo57248d(int i) {
        char c = this.f164845b[i];
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return false;
        }
        return c != 'y' || i == 0 || !mo57248d(i + -1);
    }

    /* renamed from: e */
    public final boolean mo57249e(String str) {
        if (mo57245a() <= 0) {
            return false;
        }
        mo57246b(str);
        return true;
    }
}
