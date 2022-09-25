package androidx.media3.extractor.p163j.p169f;

import android.text.TextUtils;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58746ql;
import com.google.common.p4522b.C58747qm;
import com.google.common.p4522b.C58756qv;
import com.google.common.p4522b.C58758qx;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.extractor.j.f.b */
/* compiled from: PG */
final class C3498b {

    /* renamed from: a */
    private static final Pattern f10888a = Pattern.compile("\\s+");

    /* renamed from: b */
    private static final C58528ij f10889b = C58528ij.m90011K("auto", "none");

    /* renamed from: c */
    private static final C58528ij f10890c = C58528ij.m90012L("dot", "sesame", "circle");

    /* renamed from: d */
    private static final C58528ij f10891d = C58528ij.m90011K("filled", "open");

    /* renamed from: e */
    private static final C58528ij f10892e = C58528ij.m90012L("after", "before", "outside");

    private C3498b() {
    }

    /* renamed from: a */
    public static C3498b m10114a(String str) {
        if (str == null) {
            return null;
        }
        String c = C58890d.m90988c(str.trim());
        if (c.isEmpty()) {
            return null;
        }
        C58528ij H = C58528ij.m90008H(TextUtils.split(c, f10888a));
        ((String) C58557jl.m90130k(C58758qx.m90646d(f10892e, H), "outside")).hashCode();
        C58756qv d = C58758qx.m90646d(f10889b, H);
        if (!d.isEmpty()) {
            ((String) new C58746ql((C58747qm) d).next()).hashCode();
            return new C3498b();
        }
        C58756qv d2 = C58758qx.m90646d(f10891d, H);
        C58756qv d3 = C58758qx.m90646d(f10890c, H);
        if (d2.isEmpty() && d3.isEmpty()) {
            return new C3498b();
        }
        ((String) C58557jl.m90130k(d2, "filled")).hashCode();
        ((String) C58557jl.m90130k(d3, "circle")).hashCode();
        return new C3498b();
    }
}
