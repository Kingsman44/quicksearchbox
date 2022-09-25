package com.google.android.libraries.storage.p3304a.p3307c;

import android.text.TextUtils;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42742c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import p3186j$.net.URLDecoder;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.libraries.storage.a.c.i */
/* compiled from: PG */
public final class C42756i {

    /* renamed from: a */
    public static final C42756i f112018a = new C42756i((List) null);

    /* renamed from: b */
    private final List f112019b;

    static {
        new C42754g((String) null, (List) null);
    }

    public C42756i(List list) {
        ArrayList arrayList = new ArrayList();
        this.f112019b = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    /* renamed from: a */
    public static final String m75529a(String str) {
        try {
            return URLEncoder.encode(str, C42742c.f112003a.displayName());
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.google.android.libraries.storage.a.c.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.libraries.storage.p3304a.p3307c.C42754g m75530b(android.net.Uri r23) {
        /*
            java.lang.String r0 = r23.getEncodedFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x000e
            com.google.android.libraries.storage.a.c.i r0 = f112018a
            goto L_0x01f2
        L_0x000e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r3 = "&"
            java.lang.String[] r3 = r0.split(r3)
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x001c:
            if (r6 >= r4) goto L_0x0165
            r7 = r3[r6]
            java.lang.String r8 = "="
            r9 = 2
            java.lang.String[] r7 = r7.split(r8, r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = r7[r5]
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r5] = r0
            r12 = r12 ^ r13
            java.lang.String r15 = "malformed key: %s"
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75526a(r12, r15, r14)
            int r12 = r7.length
            if (r12 != r9) goto L_0x004a
            r12 = r7[r13]
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x004a
            r12 = 1
            goto L_0x004b
        L_0x004a:
            r12 = 0
        L_0x004b:
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r5] = r0
            java.lang.String r15 = "missing param value: %s"
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75526a(r12, r15, r14)
            r7 = r7[r13]
            java.lang.String r12 = "\\+"
            java.lang.String[] r7 = r7.split(r12)
            r12 = 0
        L_0x005d:
            int r14 = r7.length
            if (r12 >= r14) goto L_0x014b
            r14 = r7[r12]
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L_0x0070
            r19 = r3
            r18 = r4
            r4 = 0
            r5 = 1
            goto L_0x0140
        L_0x0070:
            java.lang.String r15 = "("
            int r15 = r14.indexOf(r15)
            java.lang.String r2 = "malformed fragment subparams: %s"
            r9 = -1
            if (r15 == r9) goto L_0x011f
            java.lang.String r13 = r14.substring(r15)
            char r9 = r13.charAt(r5)
            r5 = 40
            if (r9 != r5) goto L_0x0099
            int r5 = r13.length()
            r9 = -1
            int r5 = r5 + r9
            char r5 = r13.charAt(r5)
            r9 = 41
            if (r5 != r9) goto L_0x0099
            r19 = r3
            r5 = 1
            goto L_0x009c
        L_0x0099:
            r19 = r3
            r5 = 0
        L_0x009c:
            r9 = 1
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r17 = 0
            r3[r17] = r0
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75526a(r5, r2, r3)
            int r2 = r13.length()
            r3 = -1
            int r2 = r2 + r3
            java.lang.String r2 = r13.substring(r9, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r5 = ","
            java.lang.String[] r5 = r2.split(r5)
            r9 = 0
        L_0x00bc:
            int r13 = r5.length
            if (r9 >= r13) goto L_0x0116
            r13 = r5[r9]
            r18 = r4
            r4 = 2
            java.lang.String[] r13 = r13.split(r8, r4)
            r16 = 0
            r20 = r13[r16]
            boolean r21 = android.text.TextUtils.isEmpty(r20)
            r22 = r5
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r16] = r2
            r16 = r2
            r2 = r21 ^ 1
            java.lang.String r4 = "missing fragment subparam key: %s"
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75526a(r2, r4, r5)
            int r2 = r13.length
            r4 = 2
            if (r2 != r4) goto L_0x0100
            r2 = 1
            r5 = r13[r2]
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0100
            com.google.android.libraries.storage.a.c.h r5 = new com.google.android.libraries.storage.a.c.h
            java.lang.String r4 = m75531c(r20)
            r13 = r13[r2]
            java.lang.String r2 = m75531c(r13)
            r5.<init>(r4, r2)
            r3.add(r5)
            goto L_0x010d
        L_0x0100:
            com.google.android.libraries.storage.a.c.h r2 = new com.google.android.libraries.storage.a.c.h
            java.lang.String r4 = m75531c(r20)
            r5 = 0
            r2.<init>(r4, r5)
            r3.add(r2)
        L_0x010d:
            int r9 = r9 + 1
            r2 = r16
            r4 = r18
            r5 = r22
            goto L_0x00bc
        L_0x0116:
            r18 = r4
            r4 = 0
            java.lang.String r14 = r14.substring(r4, r15)
            r5 = 1
            goto L_0x0134
        L_0x011f:
            r19 = r3
            r18 = r4
            r4 = 0
            java.lang.String r3 = ")"
            boolean r3 = r14.contains(r3)
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r4] = r0
            r3 = r3 ^ r5
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75526a(r3, r2, r9)
            r3 = 0
        L_0x0134:
            com.google.android.libraries.storage.a.c.f r2 = new com.google.android.libraries.storage.a.c.f
            java.lang.String r9 = m75531c(r14)
            r2.<init>(r9, r3)
            r10.add(r2)
        L_0x0140:
            int r12 = r12 + 1
            r4 = r18
            r3 = r19
            r5 = 0
            r9 = 2
            r13 = 1
            goto L_0x005d
        L_0x014b:
            r19 = r3
            r18 = r4
            r4 = 0
            com.google.android.libraries.storage.a.c.d r2 = new com.google.android.libraries.storage.a.c.d
            java.lang.String r3 = m75531c(r11)
            r2.<init>(r3, r10)
            r1.add(r2)
            int r6 = r6 + 1
            r4 = r18
            r3 = r19
            r5 = 0
            goto L_0x001c
        L_0x0165:
            r4 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x016f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x019d
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.storage.a.c.d r2 = (com.google.android.libraries.storage.p3304a.p3307c.C42751d) r2
            r3 = 0
        L_0x017c:
            int r5 = r0.size()
            if (r3 >= r5) goto L_0x0199
            java.lang.Object r5 = r0.get(r3)
            com.google.android.libraries.storage.a.c.d r5 = (com.google.android.libraries.storage.p3304a.p3307c.C42751d) r5
            java.lang.String r5 = r5.f112008a
            java.lang.String r6 = r2.f112008a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0196
            r0.set(r3, r2)
            goto L_0x016f
        L_0x0196:
            int r3 = r3 + 1
            goto L_0x017c
        L_0x0199:
            r0.add(r2)
            goto L_0x016f
        L_0x019d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x01a6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01ed
            java.lang.Object r2 = r0.next()
            com.google.android.libraries.storage.a.c.d r2 = (com.google.android.libraries.storage.p3304a.p3307c.C42751d) r2
            java.util.List r3 = r2.f112009b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01bc
            r5 = 0
            goto L_0x01e7
        L_0x01bc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r4 = r2.f112009b
            java.util.Iterator r4 = r4.iterator()
        L_0x01c7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e0
            java.lang.Object r5 = r4.next()
            com.google.android.libraries.storage.a.c.f r5 = (com.google.android.libraries.storage.p3304a.p3307c.C42753f) r5
            com.google.android.libraries.storage.a.c.g r6 = new com.google.android.libraries.storage.a.c.g
            java.lang.String r7 = r5.f112012a
            java.util.List r5 = r5.f112013b
            r6.<init>(r7, r5)
            r3.add(r6)
            goto L_0x01c7
        L_0x01e0:
            com.google.android.libraries.storage.a.c.e r5 = new com.google.android.libraries.storage.a.c.e
            java.lang.String r2 = r2.f112008a
            r5.<init>(r2, r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x01a6
            r1.add(r5)
            goto L_0x01a6
        L_0x01ed:
            com.google.android.libraries.storage.a.c.i r0 = new com.google.android.libraries.storage.a.c.i
            r0.<init>(r1)
        L_0x01f2:
            java.util.List r0 = r0.f112019b
            java.util.Iterator r0 = r0.iterator()
        L_0x01f8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0210
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.google.android.libraries.storage.a.c.e r5 = (com.google.android.libraries.storage.p3304a.p3307c.C42752e) r5
            java.lang.String r1 = r5.f112010a
            java.lang.String r2 = "transform"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01f8
            goto L_0x0211
        L_0x0210:
            r5 = 0
        L_0x0211:
            r0 = 0
            if (r5 != 0) goto L_0x0215
            return r0
        L_0x0215:
            java.util.List r1 = r5.f112011b
            java.util.Iterator r1 = r1.iterator()
        L_0x021b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0232
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.storage.a.c.g r2 = (com.google.android.libraries.storage.p3304a.p3307c.C42754g) r2
            java.lang.String r3 = r2.f112014a
            java.lang.String r4 = "encrypt"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x021b
            goto L_0x0233
        L_0x0232:
            r2 = r0
        L_0x0233:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3304a.p3307c.C42756i.m75530b(android.net.Uri):com.google.android.libraries.storage.a.c.g");
    }

    /* renamed from: c */
    private static final String m75531c(String str) {
        try {
            return URLDecoder.decode(str, C42742c.f112003a.displayName());
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException();
        }
    }

    public final String toString() {
        return TextUtils.join("&", this.f112019b);
    }
}
