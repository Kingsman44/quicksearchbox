package androidx.media3.extractor.p163j.p167d;

import android.graphics.Color;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2633u;
import com.google.common.p4575r.C60757n;

/* renamed from: androidx.media3.extractor.j.d.e */
/* compiled from: PG */
final class C3491e {

    /* renamed from: a */
    public final String f10869a;

    /* renamed from: b */
    public final int f10870b;

    /* renamed from: c */
    public final Integer f10871c;

    /* renamed from: d */
    public final Integer f10872d;

    /* renamed from: e */
    public final float f10873e;

    /* renamed from: f */
    public final boolean f10874f;

    /* renamed from: g */
    public final boolean f10875g;

    /* renamed from: h */
    public final boolean f10876h;

    /* renamed from: i */
    public final boolean f10877i;

    /* renamed from: j */
    public final int f10878j;

    public C3491e(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f10869a = str;
        this.f10870b = i;
        this.f10871c = num;
        this.f10872d = num2;
        this.f10873e = f;
        this.f10874f = z;
        this.f10875g = z2;
        this.f10876h = z3;
        this.f10877i = z4;
        this.f10878j = i2;
    }

    /* renamed from: a */
    public static int m10100a(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C2633u.m7050e("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
        return -1;
    }

    /* renamed from: b */
    public static Integer m10101b(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            C2601a.m6830b(j <= 4294967295L);
            return Integer.valueOf(Color.argb(C60757n.m92740a(((j >> 24) & 255) ^ 255), C60757n.m92740a(j & 255), C60757n.m92740a((j >> 8) & 255), C60757n.m92740a((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C2633u.m7050e("SsaStyle", C2633u.m7046a("Failed to parse color expression: '" + str + "'", e));
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m10102c(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            C2633u.m7050e("SsaStyle", C2633u.m7046a("Failed to parse boolean value: '" + str + "'", e));
            return false;
        }
    }
}
