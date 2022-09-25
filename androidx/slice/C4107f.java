package androidx.slice;

import android.app.slice.SliceSpec;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import java.util.Set;

/* renamed from: androidx.slice.f */
/* compiled from: PG */
public final class C4107f {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.slice.Slice m11767a(android.app.slice.Slice r16, android.content.Context r17) {
        /*
            r1 = r17
            java.lang.String r2 = "The icon resource isn't available."
            java.lang.String r3 = "SliceConvert"
            r0 = 0
            if (r16 == 0) goto L_0x01ea
            android.net.Uri r4 = r16.getUri()
            if (r4 != 0) goto L_0x0011
            goto L_0x01ea
        L_0x0011:
            android.net.Uri r4 = r16.getUri()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = r16.getHints()
            int r8 = r7.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
            r6.addAll(r7)
            android.app.slice.SliceSpec r7 = r16.getSpec()
            if (r7 != 0) goto L_0x003d
            goto L_0x004a
        L_0x003d:
            androidx.slice.SliceSpec r0 = new androidx.slice.SliceSpec
            java.lang.String r8 = r7.getType()
            int r7 = r7.getRevision()
            r0.<init>(r8, r7)
        L_0x004a:
            r7 = r0
            java.util.List r0 = r16.getItems()
            java.util.Iterator r8 = r0.iterator()
        L_0x0053:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r0 = r8.next()
            android.app.slice.SliceItem r0 = (android.app.slice.SliceItem) r0
            java.lang.String r9 = r0.getFormat()
            int r10 = r9.hashCode()
            java.lang.String r11 = "slice"
            java.lang.String r12 = "input"
            java.lang.String r13 = "image"
            java.lang.String r14 = "text"
            java.lang.String r15 = "long"
            r16 = r8
            java.lang.String r8 = "int"
            switch(r10) {
                case -1422950858: goto L_0x00b3;
                case -1377881982: goto L_0x00a9;
                case 104431: goto L_0x00a1;
                case 3327612: goto L_0x0099;
                case 3556653: goto L_0x0091;
                case 100313435: goto L_0x0089;
                case 100358090: goto L_0x0081;
                case 109526418: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x00bd
        L_0x0079:
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x00bd
            r9 = 0
            goto L_0x00be
        L_0x0081:
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x00bd
            r9 = 2
            goto L_0x00be
        L_0x0089:
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x00bd
            r9 = 1
            goto L_0x00be
        L_0x0091:
            boolean r9 = r9.equals(r14)
            if (r9 == 0) goto L_0x00bd
            r9 = 4
            goto L_0x00be
        L_0x0099:
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x00bd
            r9 = 6
            goto L_0x00be
        L_0x00a1:
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x00bd
            r9 = 5
            goto L_0x00be
        L_0x00a9:
            java.lang.String r10 = "bundle"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00bd
            r9 = 7
            goto L_0x00be
        L_0x00b3:
            java.lang.String r10 = "action"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00bd
            r9 = 3
            goto L_0x00be
        L_0x00bd:
            r9 = -1
        L_0x00be:
            switch(r9) {
                case 0: goto L_0x01cb;
                case 1: goto L_0x0190;
                case 2: goto L_0x016b;
                case 3: goto L_0x0149;
                case 4: goto L_0x0127;
                case 5: goto L_0x0102;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00c4;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            r8 = r16
            goto L_0x0053
        L_0x00c4:
            androidx.slice.SliceItem r8 = new androidx.slice.SliceItem
            android.os.Bundle r9 = r0.getBundle()
            java.lang.String r10 = r0.getFormat()
            java.lang.String r11 = r0.getSubType()
            java.util.List r0 = r0.getHints()
            r8.<init>((java.lang.Object) r9, (java.lang.String) r10, (java.lang.String) r11, (java.util.List) r0)
            r5.add(r8)
            goto L_0x00c1
        L_0x00dd:
            long r8 = r0.getLong()
            java.lang.String r10 = r0.getSubType()
            java.util.List r0 = r0.getHints()
            int r11 = r0.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r0 = r0.toArray(r11)
            java.lang.String[] r0 = (java.lang.String[]) r0
            androidx.slice.SliceItem r11 = new androidx.slice.SliceItem
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r11.<init>((java.lang.Object) r8, (java.lang.String) r15, (java.lang.String) r10, (java.lang.String[]) r0)
            r5.add(r11)
            goto L_0x00c1
        L_0x0102:
            int r9 = r0.getInt()
            java.lang.String r10 = r0.getSubType()
            java.util.List r0 = r0.getHints()
            int r11 = r0.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r0 = r0.toArray(r11)
            java.lang.String[] r0 = (java.lang.String[]) r0
            androidx.slice.SliceItem r11 = new androidx.slice.SliceItem
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.<init>((java.lang.Object) r9, (java.lang.String) r8, (java.lang.String) r10, (java.lang.String[]) r0)
            r5.add(r11)
            goto L_0x00c1
        L_0x0127:
            java.lang.CharSequence r8 = r0.getText()
            java.lang.String r9 = r0.getSubType()
            java.util.List r0 = r0.getHints()
            int r10 = r0.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r0 = r0.toArray(r10)
            java.lang.String[] r0 = (java.lang.String[]) r0
            androidx.slice.SliceItem r10 = new androidx.slice.SliceItem
            r10.<init>((java.lang.Object) r8, (java.lang.String) r14, (java.lang.String) r9, (java.lang.String[]) r0)
            r5.add(r10)
            goto L_0x00c1
        L_0x0149:
            android.app.PendingIntent r8 = r0.getAction()
            android.app.slice.Slice r9 = r0.getSlice()
            androidx.slice.Slice r9 = m11767a(r9, r1)
            java.lang.String r0 = r0.getSubType()
            r8.getClass()
            r9.getClass()
            java.lang.String[] r10 = r9.f13089e
            androidx.slice.SliceItem r11 = new androidx.slice.SliceItem
            r11.<init>((android.app.PendingIntent) r8, (androidx.slice.Slice) r9, (java.lang.String) r0, (java.lang.String[]) r10)
            r5.add(r11)
            goto L_0x00c1
        L_0x016b:
            android.app.RemoteInput r8 = r0.getRemoteInput()
            java.lang.String r9 = r0.getSubType()
            java.util.List r0 = r0.getHints()
            r8.getClass()
            int r10 = r0.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r0 = r0.toArray(r10)
            java.lang.String[] r0 = (java.lang.String[]) r0
            androidx.slice.SliceItem r10 = new androidx.slice.SliceItem
            r10.<init>((java.lang.Object) r8, (java.lang.String) r12, (java.lang.String) r9, (java.lang.String[]) r0)
            r5.add(r10)
            goto L_0x00c1
        L_0x0190:
            android.graphics.drawable.Icon r8 = r0.getIcon()     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            r8.getClass()
            androidx.core.graphics.drawable.IconCompat r8 = androidx.core.graphics.drawable.C1932e.m5235d(r1, r8)     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            java.lang.String r9 = r0.getSubType()     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            java.util.List r0 = r0.getHints()     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            androidx.slice.Slice.m11725c(r8)     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            int r10 = r0.size()     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            java.lang.Object[] r0 = r0.toArray(r10)     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            androidx.slice.Slice.m11725c(r8)     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            androidx.slice.SliceItem r10 = new androidx.slice.SliceItem     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            r10.<init>((java.lang.Object) r8, (java.lang.String) r13, (java.lang.String) r9, (java.lang.String[]) r0)     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            r5.add(r10)     // Catch:{ IllegalArgumentException -> 0x01c5, NotFoundException -> 0x01bf }
            goto L_0x00c1
        L_0x01bf:
            r0 = move-exception
            android.util.Log.w(r3, r2, r0)
            goto L_0x00c1
        L_0x01c5:
            r0 = move-exception
            android.util.Log.w(r3, r2, r0)
            goto L_0x00c1
        L_0x01cb:
            android.app.slice.Slice r8 = r0.getSlice()
            androidx.slice.Slice r8 = m11767a(r8, r1)
            java.lang.String r0 = r0.getSubType()
            r8.getClass()
            androidx.slice.SliceItem r9 = new androidx.slice.SliceItem
            java.lang.String[] r10 = r8.f13089e
            r9.<init>((java.lang.Object) r8, (java.lang.String) r11, (java.lang.String) r0, (java.lang.String[]) r10)
            r5.add(r9)
            goto L_0x00c1
        L_0x01e6:
            androidx.slice.Slice r0 = androidx.slice.C4106e.m11766a(r4, r5, r6, r7)
        L_0x01ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.C4107f.m11767a(android.app.slice.Slice, android.content.Context):androidx.slice.Slice");
    }

    /* renamed from: b */
    static Set m11768b(Set set) {
        SliceSpec sliceSpec;
        C0979i iVar = new C0979i(0);
        if (set != null) {
            C0978h hVar = new C0978h((C0979i) set);
            while (hVar.hasNext()) {
                SliceSpec sliceSpec2 = (SliceSpec) hVar.next();
                if (sliceSpec2 == null) {
                    sliceSpec = null;
                } else {
                    sliceSpec = new SliceSpec(sliceSpec2.f13104a, sliceSpec2.f13105b);
                }
                iVar.add(sliceSpec);
            }
        }
        return iVar;
    }
}
