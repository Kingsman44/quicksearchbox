package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.C2675s;
import androidx.media3.extractor.p154a.C3325a;
import androidx.media3.extractor.p155b.C3356d;
import androidx.media3.extractor.p156c.C3379d;
import androidx.media3.extractor.p157d.C3382b;
import androidx.media3.extractor.p158e.C3388a;
import androidx.media3.extractor.p159f.C3400e;
import androidx.media3.extractor.p160g.C3407d;
import androidx.media3.extractor.p161h.C3428o;
import androidx.media3.extractor.p161h.C3432s;
import androidx.media3.extractor.p162i.C3445e;
import androidx.media3.extractor.p172k.C3527a;
import androidx.media3.extractor.p172k.C3532ae;
import androidx.media3.extractor.p172k.C3541an;
import androidx.media3.extractor.p172k.C3550c;
import androidx.media3.extractor.p172k.C3552e;
import androidx.media3.extractor.p173l.C3578d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.extractor.v */
/* compiled from: PG */
public final class C3632v implements C3331af {

    /* renamed from: a */
    private static final int[] f11575a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: b */
    private static final C3631u f11576b = new C3631u(C3628r.f11571a);

    /* renamed from: c */
    private static final C3631u f11577c = new C3631u(C3629s.f11572a);

    /* renamed from: d */
    private boolean f11578d;

    /* renamed from: d */
    private final void m10473d(int i, List list) {
        switch (i) {
            case 0:
                list.add(new C3527a());
                return;
            case 1:
                list.add(new C3550c());
                return;
            case 2:
                list.add(new C3552e(this.f11578d ? 1 : 0));
                return;
            case 3:
                list.add(new C3325a(this.f11578d ? 1 : 0));
                return;
            case 4:
                C3326aa a = f11576b.mo7641a(0);
                if (a != null) {
                    list.add(a);
                    return;
                } else {
                    list.add(new C3379d((byte[]) null));
                    return;
                }
            case 5:
                list.add(new C3382b());
                return;
            case 6:
                list.add(new C3400e(0));
                return;
            case 7:
                list.add(new C3407d(this.f11578d ? 1 : 0, -9223372036854775807L));
                return;
            case 8:
                list.add(new C3428o((byte[]) null));
                list.add(new C3432s((byte[]) null));
                return;
            case 9:
                list.add(new C3445e());
                return;
            case 10:
                list.add(new C3532ae());
                return;
            case 11:
                list.add(new C3541an((byte[]) null));
                return;
            case 12:
                list.add(new C3578d());
                return;
            case 14:
                list.add(new C3388a());
                return;
            case 15:
                C3326aa a2 = f11577c.mo7641a(new Object[0]);
                if (a2 != null) {
                    list.add(a2);
                    return;
                }
                return;
            case 16:
                list.add(new C3356d());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final synchronized C3326aa[] mo7322a() {
        throw null;
    }

    /* renamed from: b */
    public final synchronized C3326aa[] mo7323b(Uri uri, Map map) {
        ArrayList arrayList;
        arrayList = new ArrayList(16);
        int b = C2675s.m7238b(map);
        if (b != -1) {
            m10473d(b, arrayList);
        }
        int c = C2675s.m7239c(uri);
        if (!(c == -1 || c == b)) {
            m10473d(c, arrayList);
        }
        int[] iArr = f11575a;
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i];
            if (!(i2 == b || i2 == c)) {
                m10473d(i2, arrayList);
            }
        }
        return (C3326aa[]) arrayList.toArray(new C3326aa[arrayList.size()]);
    }

    /* renamed from: c */
    public final synchronized void mo7642c() {
        this.f11578d = true;
    }
}
