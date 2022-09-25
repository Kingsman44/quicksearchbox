package androidx.media3.extractor.p163j.p171h;

import com.evernote.android.state.BuildConfig;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.media3.extractor.j.h.d */
/* compiled from: PG */
public final class C3514d {

    /* renamed from: a */
    public String f10973a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f10974b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public Set f10975c = Collections.emptySet();

    /* renamed from: d */
    public String f10976d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f10977e = null;

    /* renamed from: f */
    public int f10978f;

    /* renamed from: g */
    public boolean f10979g = false;

    /* renamed from: h */
    public int f10980h;

    /* renamed from: i */
    public boolean f10981i = false;

    /* renamed from: j */
    public int f10982j = -1;

    /* renamed from: k */
    public int f10983k = -1;

    /* renamed from: l */
    public int f10984l = -1;

    /* renamed from: m */
    public int f10985m = -1;

    /* renamed from: n */
    public float f10986n;

    /* renamed from: o */
    public int f10987o = -1;

    /* renamed from: p */
    public boolean f10988p = false;

    /* renamed from: b */
    public static int m10161b(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo7448a() {
        int i = this.f10983k;
        if (i == -1 && this.f10984l == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f10984l == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }
}
