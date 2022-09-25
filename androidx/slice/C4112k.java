package androidx.slice;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: androidx.slice.k */
/* compiled from: PG */
public final class C4112k {

    /* renamed from: a */
    public final Uri f13148a;

    /* renamed from: b */
    private final String f13149b;

    public C4112k(Slice slice) {
        StringBuilder sb = new StringBuilder();
        m11781a(slice, sb);
        this.f13149b = sb.toString();
        this.f13148a = Uri.parse(slice.f13090f);
    }

    /* renamed from: a */
    private static void m11781a(Slice slice, StringBuilder sb) {
        sb.append("s{");
        for (SliceItem b : Arrays.asList(slice.f13088d)) {
            m11782b(b, sb);
        }
        sb.append("}");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11782b(androidx.slice.SliceItem r5, java.lang.StringBuilder r6) {
        /*
            java.lang.String r0 = r5.f13092b
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1422950858: goto L_0x002b;
                case 3556653: goto L_0x0021;
                case 100313435: goto L_0x0017;
                case 109526418: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r1 = "slice"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0017:
            java.lang.String r1 = "image"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 3
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "text"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 2
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "action"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x0067
            if (r0 == r4) goto L_0x004b
            if (r0 == r3) goto L_0x0045
            if (r0 == r2) goto L_0x003f
            return
        L_0x003f:
            r5 = 105(0x69, float:1.47E-43)
            r6.append(r5)
            return
        L_0x0045:
            r5 = 116(0x74, float:1.63E-43)
            r6.append(r5)
            return
        L_0x004b:
            r0 = 97
            r6.append(r0)
            java.lang.String r0 = "range"
            java.lang.String r1 = r5.f13093c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 114(0x72, float:1.6E-43)
            r6.append(r0)
        L_0x005f:
            androidx.slice.Slice r5 = r5.mo8596d()
            m11781a(r5, r6)
            return
        L_0x0067:
            androidx.slice.Slice r5 = r5.mo8596d()
            m11781a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.C4112k.m11782b(androidx.slice.SliceItem, java.lang.StringBuilder):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4112k)) {
            return false;
        }
        return this.f13149b.equals(((C4112k) obj).f13149b);
    }

    public final int hashCode() {
        return this.f13149b.hashCode();
    }

    public C4112k(SliceItem sliceItem) {
        Uri parse;
        StringBuilder sb = new StringBuilder();
        m11782b(sliceItem, sb);
        this.f13149b = sb.toString();
        if ("action".equals(sliceItem.f13092b) || "slice".equals(sliceItem.f13092b)) {
            parse = Uri.parse(sliceItem.mo8596d().f13090f);
        } else {
            parse = null;
        }
        this.f13148a = parse;
    }
}
