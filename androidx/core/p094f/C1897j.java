package androidx.core.p094f;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.f.j */
/* compiled from: PG */
public final class C1897j {

    /* renamed from: a */
    public static final C1897j f5773a = m5167d(C1896i.m5161a(new Locale[0]));

    /* renamed from: b */
    public final C1898k f5774b;

    private C1897j(C1898k kVar) {
        this.f5774b = kVar;
    }

    /* renamed from: a */
    public static C1897j m5164a(Locale... localeArr) {
        return m5167d(C1896i.m5161a(localeArr));
    }

    /* renamed from: b */
    public static C1897j m5165b(String str) {
        if (str == null || str.isEmpty()) {
            return f5773a;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C1895h.m5158a(split[i]);
        }
        return m5167d(C1896i.m5161a(localeArr));
    }

    /* renamed from: c */
    public static C1897j m5166c() {
        return m5167d(C1896i.m5162b());
    }

    /* renamed from: d */
    public static C1897j m5167d(LocaleList localeList) {
        return new C1897j(new C1898k(localeList));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1897j) && this.f5774b.equals(((C1897j) obj).f5774b);
    }

    public final int hashCode() {
        return this.f5774b.f5775a.hashCode();
    }

    public final String toString() {
        return this.f5774b.f5775a.toString();
    }
}
