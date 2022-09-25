package androidx.media3.extractor.p163j.p171h;

import androidx.media3.common.p136b.C2604ac;
import com.evernote.android.state.BuildConfig;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.extractor.j.h.c */
/* compiled from: PG */
final class C3513c {

    /* renamed from: a */
    public static final Pattern f10969a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b */
    public static final Pattern f10970b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: c */
    public final C2604ac f10971c = new C2604ac();

    /* renamed from: d */
    public final StringBuilder f10972d = new StringBuilder();

    /* renamed from: a */
    public static String m10158a(C2604ac acVar, StringBuilder sb) {
        sb.setLength(0);
        int i = acVar.f7235b;
        int i2 = acVar.f7236c;
        loop0:
        while (true) {
            boolean z = false;
            while (i < i2 && !z) {
                char c = (char) acVar.f7234a[i];
                if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    z = true;
                } else {
                    i++;
                    sb.append(c);
                }
            }
        }
        int i3 = acVar.f7235b;
        acVar.mo6131A(i3 + (i - i3));
        return sb.toString();
    }

    /* renamed from: b */
    static String m10159b(C2604ac acVar, StringBuilder sb) {
        m10160c(acVar);
        if (acVar.f7236c - acVar.f7235b == 0) {
            return null;
        }
        String a = m10158a(acVar, sb);
        if (!BuildConfig.FLAVOR.equals(a)) {
            return a;
        }
        int g = acVar.mo6139g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) g);
        return sb2.toString();
    }

    /* renamed from: c */
    static void m10160c(C2604ac acVar) {
        int i;
        while (true) {
            boolean z = true;
            while (true) {
                int i2 = acVar.f7236c;
                i = acVar.f7235b;
                if (i2 - i > 0 && z) {
                    byte[] bArr = acVar.f7234a;
                    byte b = bArr[i];
                    char c = (char) b;
                    if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                        acVar.mo6131A(i + 1);
                    } else {
                        if (i + 2 <= i2) {
                            int i3 = i + 1;
                            if (b == 47) {
                                int i4 = i3 + 1;
                                if (bArr[i3] == 42) {
                                    while (true) {
                                        int i5 = i4 + 1;
                                        if (i5 >= i2) {
                                            break;
                                        } else if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                            i2 = i5 + 1;
                                            i4 = i2;
                                        } else {
                                            i4 = i5;
                                        }
                                    }
                                    int i6 = acVar.f7235b;
                                    acVar.mo6131A(i6 + (i2 - i6));
                                }
                            } else {
                                continue;
                            }
                        }
                        z = false;
                    }
                } else {
                    return;
                }
            }
            acVar.mo6131A(i + 1);
        }
    }
}
