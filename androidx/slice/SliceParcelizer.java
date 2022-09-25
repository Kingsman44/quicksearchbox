package androidx.slice;

import androidx.versionedparcelable.C4265d;
import java.util.Arrays;

/* compiled from: PG */
public final class SliceParcelizer {
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.slice.Slice read(androidx.versionedparcelable.C4265d r8) {
        /*
            androidx.slice.Slice r0 = new androidx.slice.Slice
            r0.<init>()
            androidx.slice.SliceSpec r1 = r0.f13087c
            r2 = 1
            androidx.versionedparcelable.f r1 = r8.mo9105j(r1, r2)
            androidx.slice.SliceSpec r1 = (androidx.slice.SliceSpec) r1
            r0.f13087c = r1
            androidx.slice.SliceItem[] r1 = r0.f13088d
            r3 = 2
            java.lang.Object[] r1 = r8.mo9095F(r1, r3)
            androidx.slice.SliceItem[] r1 = (androidx.slice.SliceItem[]) r1
            r0.f13088d = r1
            java.lang.String[] r1 = r0.f13089e
            r3 = 3
            java.lang.Object[] r1 = r8.mo9095F(r1, r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.f13089e = r1
            java.lang.String r1 = r0.f13090f
            r3 = 4
            java.lang.String r8 = r8.mo9109n(r1, r3)
            r0.f13090f = r8
            androidx.slice.SliceItem[] r8 = r0.f13088d
            int r8 = r8.length
        L_0x0032:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x007f
            androidx.slice.SliceItem[] r1 = r0.f13088d
            r3 = r1[r8]
            java.lang.Object r4 = r3.f13094d
            if (r4 != 0) goto L_0x0032
            r4 = 0
            if (r1 == 0) goto L_0x0072
            boolean r5 = androidx.slice.C4093a.m11737a(r1, r3)
            if (r5 != 0) goto L_0x0048
            goto L_0x0072
        L_0x0048:
            int r5 = r1.length
            r6 = 0
        L_0x004a:
            if (r6 >= r5) goto L_0x0072
            r7 = r1[r6]
            boolean r7 = androidx.core.p097i.C1968c.m5305b(r7, r3)
            if (r7 == 0) goto L_0x006f
            if (r5 != r2) goto L_0x0058
            r1 = 0
            goto L_0x0072
        L_0x0058:
            java.lang.Class<androidx.slice.SliceItem> r3 = androidx.slice.SliceItem.class
            int r7 = r5 + -1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r7)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.System.arraycopy(r1, r4, r3, r4, r6)
            int r7 = r6 + 1
            int r5 = r5 - r6
            int r5 = r5 + -1
            java.lang.System.arraycopy(r1, r7, r3, r6, r5)
            r1 = r3
            goto L_0x0072
        L_0x006f:
            int r6 = r6 + 1
            goto L_0x004a
        L_0x0072:
            androidx.slice.SliceItem[] r1 = (androidx.slice.SliceItem[]) r1
            r0.f13088d = r1
            androidx.slice.SliceItem[] r1 = r0.f13088d
            if (r1 != 0) goto L_0x0032
            androidx.slice.SliceItem[] r1 = new androidx.slice.SliceItem[r4]
            r0.f13088d = r1
            goto L_0x0032
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceParcelizer.read(androidx.versionedparcelable.d):androidx.slice.Slice");
    }

    public static void write(Slice slice, C4265d dVar) {
        SliceSpec sliceSpec = slice.f13087c;
        if (sliceSpec != null) {
            dVar.mo9111p(1);
            dVar.mo9090A(sliceSpec);
        }
        if (!Arrays.equals(Slice.f13086b, slice.f13088d)) {
            SliceItem[] sliceItemArr = slice.f13088d;
            dVar.mo9111p(2);
            dVar.mo9112q(sliceItemArr);
        }
        if (!Arrays.equals(Slice.f13085a, slice.f13089e)) {
            String[] strArr = slice.f13089e;
            dVar.mo9111p(3);
            dVar.mo9112q(strArr);
        }
        String str = slice.f13090f;
        if (str != null) {
            dVar.mo9111p(4);
            dVar.mo9120y(str);
        }
    }
}
