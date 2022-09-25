package androidx.slice;

import androidx.versionedparcelable.C4265d;
import java.util.Arrays;

/* compiled from: PG */
public final class SliceItemParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (r6.equals("image") != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.slice.SliceItem read(androidx.versionedparcelable.C4265d r9) {
        /*
            androidx.slice.SliceItem r0 = new androidx.slice.SliceItem
            r0.<init>()
            java.lang.String[] r1 = r0.f13091a
            r2 = 1
            java.lang.Object[] r1 = r9.mo9095F(r1, r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.f13091a = r1
            java.lang.String r1 = r0.f13092b
            r3 = 2
            java.lang.String r1 = r9.mo9109n(r1, r3)
            r0.f13092b = r1
            java.lang.String r1 = r0.f13093c
            r4 = 3
            java.lang.String r1 = r9.mo9109n(r1, r4)
            r0.f13093c = r1
            androidx.slice.SliceItemHolder r1 = r0.f13096f
            r5 = 4
            androidx.versionedparcelable.f r9 = r9.mo9105j(r1, r5)
            androidx.slice.SliceItemHolder r9 = (androidx.slice.SliceItemHolder) r9
            r0.f13096f = r9
            androidx.slice.SliceItemHolder r9 = r0.f13096f
            r1 = 0
            if (r9 == 0) goto L_0x00fb
            java.lang.String r6 = r0.f13092b
            int r7 = r6.hashCode()
            r8 = 0
            switch(r7) {
                case -1422950858: goto L_0x0082;
                case -1377881982: goto L_0x0078;
                case 104431: goto L_0x006e;
                case 3327612: goto L_0x0064;
                case 3556653: goto L_0x005a;
                case 100313435: goto L_0x0051;
                case 100358090: goto L_0x0047;
                case 109526418: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x008c
        L_0x003d:
            java.lang.String r2 = "slice"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 2
            goto L_0x008d
        L_0x0047:
            java.lang.String r2 = "input"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 3
            goto L_0x008d
        L_0x0051:
            java.lang.String r3 = "image"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x008c
            goto L_0x008d
        L_0x005a:
            java.lang.String r2 = "text"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 4
            goto L_0x008d
        L_0x0064:
            java.lang.String r2 = "long"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 6
            goto L_0x008d
        L_0x006e:
            java.lang.String r2 = "int"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 5
            goto L_0x008d
        L_0x0078:
            java.lang.String r2 = "bundle"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 7
            goto L_0x008d
        L_0x0082:
            java.lang.String r2 = "action"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 0
            goto L_0x008d
        L_0x008c:
            r2 = -1
        L_0x008d:
            switch(r2) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00c7;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00a3;
                case 7: goto L_0x00a0;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unrecognized format "
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r0.concat(r1)
            r9.<init>(r0)
            throw r9
        L_0x00a0:
            android.os.Bundle r9 = r9.f13102f
            goto L_0x00e1
        L_0x00a3:
            long r2 = r9.f13101e
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            goto L_0x00e1
        L_0x00aa:
            int r9 = r9.f13100d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00e1
        L_0x00b1:
            java.lang.String r9 = r9.f13099c
            if (r9 == 0) goto L_0x00c1
            int r2 = r9.length()
            if (r2 != 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            android.text.Spanned r9 = androidx.core.p096h.C1951d.m5280a(r9, r8)
            goto L_0x00e1
        L_0x00c1:
            java.lang.String r9 = ""
            goto L_0x00e1
        L_0x00c4:
            android.os.Parcelable r9 = r9.f13098b
            goto L_0x00e1
        L_0x00c7:
            androidx.versionedparcelable.f r9 = r9.f13097a
            goto L_0x00e1
        L_0x00ca:
            android.os.Parcelable r2 = r9.f13098b
            if (r2 != 0) goto L_0x00d4
            androidx.versionedparcelable.f r3 = r9.f13097a
            if (r3 != 0) goto L_0x00d4
            r9 = r1
            goto L_0x00e1
        L_0x00d4:
            if (r2 != 0) goto L_0x00d7
            r2 = r1
        L_0x00d7:
            androidx.core.i.e r3 = new androidx.core.i.e
            androidx.versionedparcelable.f r9 = r9.f13097a
            androidx.slice.Slice r9 = (androidx.slice.Slice) r9
            r3.<init>(r2, r9)
            r9 = r3
        L_0x00e1:
            r0.f13094d = r9
            androidx.slice.SliceItemHolder r9 = r0.f13096f
            androidx.slice.h r2 = r9.f13103g
            if (r2 == 0) goto L_0x00fd
            r9.f13098b = r1
            r9.f13097a = r1
            r9.f13100d = r8
            r3 = 0
            r9.f13101e = r3
            r9.f13099c = r1
            java.util.ArrayList r2 = r2.f13134a
            r2.add(r9)
            goto L_0x00fd
        L_0x00fb:
            r0.f13094d = r1
        L_0x00fd:
            r0.f13096f = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItemParcelizer.read(androidx.versionedparcelable.d):androidx.slice.SliceItem");
    }

    public static void write(SliceItem sliceItem, C4265d dVar) {
        sliceItem.f13096f = new SliceItemHolder(sliceItem.f13092b, sliceItem.f13094d);
        if (!Arrays.equals(Slice.f13085a, sliceItem.f13091a)) {
            String[] strArr = sliceItem.f13091a;
            dVar.mo9111p(1);
            dVar.mo9112q(strArr);
        }
        if (!"text".equals(sliceItem.f13092b)) {
            String str = sliceItem.f13092b;
            dVar.mo9111p(2);
            dVar.mo9120y(str);
        }
        String str2 = sliceItem.f13093c;
        if (str2 != null) {
            dVar.mo9111p(3);
            dVar.mo9120y(str2);
        }
        SliceItemHolder sliceItemHolder = sliceItem.f13096f;
        dVar.mo9111p(4);
        dVar.mo9090A(sliceItemHolder);
    }
}
