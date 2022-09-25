package com.google.common.p4538j.p4539a;

import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.common.j.a.h */
/* compiled from: PG */
public final class C59310h {

    /* renamed from: a */
    private static final Set f157478a = m92154b("http", "https", "mailto", "ftp");

    /* renamed from: b */
    private static final Set f157479b = m92154b("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", MediaUtilities.MIME_TYPE, "video/ogg", "video/webm", "video/x-matroska");

    /* renamed from: c */
    private static final Set f157480c = Collections.emptySet();

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a8, code lost:
        if (r2 >= r1.length()) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ae, code lost:
        if (r1.charAt(r2) != '=') goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        r2 = r2 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4538j.p4539a.C59309g m92153a(java.lang.String r8) {
        /*
            com.google.common.j.a.g r0 = com.google.common.p4538j.p4539a.C59309g.f157476a
            java.util.Set r1 = f157480c
            java.lang.String r2 = r8.toLowerCase()
            java.util.Set r3 = f157478a
            java.util.Iterator r3 = r3.iterator()
        L_0x000e:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = ":"
            if (r4 == 0) goto L_0x002c
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r4.concat(r5)
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L_0x000e
            goto L_0x00ff
        L_0x002c:
            java.lang.String r3 = "data:"
            boolean r4 = r2.startsWith(r3)
            r6 = 47
            if (r4 == 0) goto L_0x00b3
            java.lang.String r1 = r8.toLowerCase()
            boolean r2 = r1.startsWith(r3)
            if (r2 != 0) goto L_0x0042
            goto L_0x00fe
        L_0x0042:
            int r2 = r1.length()
            r3 = 5
            if (r2 <= r3) goto L_0x00fe
            r2 = 5
        L_0x004a:
            int r4 = r1.length()
            if (r2 >= r4) goto L_0x0060
            char r4 = r1.charAt(r2)
            r5 = 59
            if (r4 == r5) goto L_0x0060
            r5 = 44
            if (r4 != r5) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x0060:
            java.util.Set r4 = f157479b
            java.lang.String r3 = r1.substring(r3, r2)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x00fe
            java.lang.String r3 = ";base64,"
            boolean r3 = r1.startsWith(r3, r2)
            if (r3 == 0) goto L_0x00fe
            int r2 = r2 + 8
            int r3 = r1.length()
            if (r2 >= r3) goto L_0x00fe
        L_0x007c:
            int r3 = r1.length()
            r4 = 61
            if (r2 >= r3) goto L_0x00a4
            char r3 = r1.charAt(r2)
            if (r3 != r4) goto L_0x008b
            goto L_0x00a4
        L_0x008b:
            r4 = 97
            if (r3 < r4) goto L_0x0093
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 <= r4) goto L_0x00a1
        L_0x0093:
            r4 = 48
            if (r3 < r4) goto L_0x009b
            r4 = 57
            if (r3 <= r4) goto L_0x00a1
        L_0x009b:
            r4 = 43
            if (r3 == r4) goto L_0x00a1
            if (r3 != r6) goto L_0x00fe
        L_0x00a1:
            int r2 = r2 + 1
            goto L_0x007c
        L_0x00a4:
            int r3 = r1.length()
            if (r2 >= r3) goto L_0x00ff
            char r3 = r1.charAt(r2)
            if (r3 != r4) goto L_0x00fe
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00b3:
            java.util.Iterator r1 = r1.iterator()
        L_0x00b7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e2
            java.lang.Object r3 = r1.next()
            com.google.common.j.a.b r3 = (com.google.common.p4538j.p4539a.C59304b) r3
            java.lang.String r3 = r3.name()
            java.lang.String r3 = r3.toLowerCase()
            r4 = 95
            r7 = 45
            java.lang.String r3 = r3.replace(r4, r7)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.concat(r5)
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x00b7
            goto L_0x00ff
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            int r2 = r8.length()
            if (r1 >= r2) goto L_0x00ff
            char r2 = r8.charAt(r1)
            r3 = 35
            if (r2 == r3) goto L_0x00ff
            if (r2 == r6) goto L_0x00ff
            r3 = 58
            if (r2 == r3) goto L_0x00fe
            r3 = 63
            if (r2 == r3) goto L_0x00ff
            int r1 = r1 + 1
            goto L_0x00e3
        L_0x00fe:
            return r0
        L_0x00ff:
            com.google.common.j.a.g r0 = new com.google.common.j.a.g
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4538j.p4539a.C59310h.m92153a(java.lang.String):com.google.common.j.a.g");
    }

    /* renamed from: b */
    private static final Set m92154b(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String add : strArr) {
            hashSet.add(add);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
