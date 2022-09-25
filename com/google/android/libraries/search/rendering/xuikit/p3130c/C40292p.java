package com.google.android.libraries.search.rendering.xuikit.p3130c;

import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.prefetch.DiskCache$cleanup$2", mo61344c = "DiskCache.kt", mo61345d = "invokeSuspend", mo61346e = {340, 358, 365})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.p */
/* compiled from: PG */
final class C40292p extends C69572j implements C69630p {

    /* renamed from: a */
    Object f105842a;

    /* renamed from: b */
    long f105843b;

    /* renamed from: c */
    int f105844c;

    /* renamed from: d */
    final /* synthetic */ C40301y f105845d;

    /* renamed from: e */
    final /* synthetic */ long f105846e;

    /* renamed from: f */
    final /* synthetic */ long f105847f;

    /* renamed from: g */
    final /* synthetic */ Duration f105848g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40292p(C40301y yVar, long j, long j2, Duration duration, C69577g gVar) {
        super(2, gVar);
        this.f105845d = yVar;
        this.f105846e = j;
        this.f105847f = j2;
        this.f105848g = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C40292p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r24) {
        /*
            r23 = this;
            r8 = r23
            h.c.a.a r9 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r0 = r8.f105844c
            r10 = 2
            r1 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r1) goto L_0x0011
            p5462h.C69714l.m101134b(r24)
            goto L_0x02fd
        L_0x0011:
            long r0 = r8.f105843b
            java.lang.Object r2 = r8.f105842a
            p5462h.C69714l.m101134b(r24)
            r12 = r0
            r10 = 0
            r0 = r24
            goto L_0x0286
        L_0x001f:
            p5462h.C69714l.m101134b(r24)
            com.google.android.libraries.search.rendering.xuikit.c.y r0 = r8.f105845d
            com.google.android.libraries.f.a r2 = r0.f105878d
            j$.time.Instant r2 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40265ae.m69883b(r2)
            java.io.File r3 = r0.mo42384a()
            java.io.File[] r3 = r3.listFiles()
            if (r3 == 0) goto L_0x004b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r3.length
            r7 = 0
        L_0x003b:
            if (r7 >= r6) goto L_0x004c
            r14 = r3[r7]
            boolean r15 = r14.isFile()
            if (r15 == 0) goto L_0x0048
            r5.add(r14)
        L_0x0048:
            int r7 = r7 + 1
            goto L_0x003b
        L_0x004b:
            r5 = 0
        L_0x004c:
            if (r5 != 0) goto L_0x0050
            h.a.am r5 = p5462h.p5463a.C69496am.f185918a
        L_0x0050:
            r3 = 10
            int r3 = p5462h.p5463a.C69540x.m100804k(r5, r3)
            int r3 = p5462h.p5463a.C69505av.m100860b(r3)
            r6 = 16
            if (r3 >= r6) goto L_0x0060
            r3 = 16
        L_0x0060:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>(r3)
            java.util.Iterator r3 = r5.iterator()
        L_0x0069:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0205
            java.lang.Object r5 = r3.next()
            java.io.File r5 = (java.io.File) r5
            java.lang.String r6 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            java.io.File r6 = r0.mo42384a()
            java.lang.String r7 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r7)
            h.e.c r7 = p5462h.p5472e.C69608l.m101022a(r5)
            h.e.c r7 = p5462h.p5472e.C69612p.m101023b(r7)
            h.e.c r15 = p5462h.p5472e.C69608l.m101022a(r6)
            h.e.c r15 = p5462h.p5472e.C69612p.m101023b(r15)
            java.io.File r4 = r7.f185998a
            java.io.File r10 = r15.f185998a
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r10)
            if (r4 != 0) goto L_0x00a2
            r19 = r3
        L_0x009f:
            r1 = 0
            goto L_0x0178
        L_0x00a2:
            int r4 = r15.mo61359a()
            int r10 = r7.mo61359a()
            int r13 = java.lang.Math.min(r10, r4)
            r11 = 0
        L_0x00af:
            if (r11 >= r13) goto L_0x00c7
            java.util.List r12 = r7.f185999b
            java.lang.Object r12 = r12.get(r11)
            java.util.List r1 = r15.f185999b
            java.lang.Object r1 = r1.get(r11)
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r12, r1)
            if (r1 == 0) goto L_0x00c7
            int r11 = r11 + 1
            r1 = 1
            goto L_0x00af
        L_0x00c7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r12 = r4 + -1
            if (r11 > r12) goto L_0x00f8
        L_0x00d0:
            java.util.List r13 = r15.f185999b
            java.lang.Object r13 = r13.get(r12)
            java.io.File r13 = (java.io.File) r13
            java.lang.String r13 = r13.getName()
            r19 = r3
            java.lang.String r3 = ".."
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r3)
            if (r13 == 0) goto L_0x00e7
            goto L_0x009f
        L_0x00e7:
            r1.append(r3)
            if (r12 == r11) goto L_0x00f1
            char r3 = java.io.File.separatorChar
            r1.append(r3)
        L_0x00f1:
            if (r12 == r11) goto L_0x00fa
            int r12 = r12 + -1
            r3 = r19
            goto L_0x00d0
        L_0x00f8:
            r19 = r3
        L_0x00fa:
            if (r11 >= r10) goto L_0x0174
            if (r11 >= r4) goto L_0x0103
            char r3 = java.io.File.separatorChar
            r1.append(r3)
        L_0x0103:
            java.util.List r3 = r7.f185999b
            if (r11 < 0) goto L_0x015b
            if (r11 != 0) goto L_0x010e
            java.util.List r3 = p5462h.p5463a.C69540x.m100840V(r3)
            goto L_0x0150
        L_0x010e:
            int r4 = r3.size()
            int r4 = r4 - r11
            if (r4 > 0) goto L_0x0118
            h.a.am r3 = p5462h.p5463a.C69496am.f185918a
            goto L_0x0150
        L_0x0118:
            r7 = 1
            if (r4 != r7) goto L_0x0124
            java.lang.Object r3 = p5462h.p5463a.C69540x.m100823E(r3)
            java.util.List r3 = p5462h.p5463a.C69540x.m100944b(r3)
            goto L_0x0150
        L_0x0124:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r4)
            boolean r4 = r3 instanceof java.util.RandomAccess
            if (r4 == 0) goto L_0x013d
            int r4 = r3.size()
        L_0x0131:
            if (r11 >= r4) goto L_0x014f
            java.lang.Object r10 = r3.get(r11)
            r7.add(r10)
            int r11 = r11 + 1
            goto L_0x0131
        L_0x013d:
            java.util.ListIterator r3 = r3.listIterator(r11)
        L_0x0141:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x014f
            java.lang.Object r4 = r3.next()
            r7.add(r4)
            goto L_0x0141
        L_0x014f:
            r3 = r7
        L_0x0150:
            java.lang.String r4 = java.io.File.separator
            java.lang.String r7 = "separator"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)
            p5462h.p5463a.C69540x.m100853ai(r3, r1, r4)
            goto L_0x0174
        L_0x015b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Requested element count "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = " is less than zero."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0174:
            java.lang.String r1 = r1.toString()
        L_0x0178:
            if (r1 == 0) goto L_0x01e4
            long r3 = r5.lastModified()
            r10 = 0
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0189
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r3)
            goto L_0x018a
        L_0x0189:
            r3 = 0
        L_0x018a:
            h.m.k r4 = r0.f105882h
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "file.name"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            h.m.h r4 = r4.mo61435c(r6)
            if (r4 == 0) goto L_0x01b3
            java.util.List r4 = r4.mo61432a()
            if (r4 == 0) goto L_0x01b3
            r6 = 1
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x01b3
            long r6 = java.lang.Long.parseLong(r4)
            j$.time.Instant r4 = p3186j$.time.Instant.ofEpochMilli(r6)
            goto L_0x01b4
        L_0x01b3:
            r4 = 0
        L_0x01b4:
            h.b.g r6 = p5462h.p5465b.C69550g.f185954a
            h.b.b r7 = new h.b.b
            r7.<init>(r6)
            java.lang.Object r3 = p5462h.p5465b.C69544a.m100955b(r3, r4, r7)
            j$.time.Instant r3 = (p3186j$.time.Instant) r3
            if (r3 == 0) goto L_0x01c8
            j$.time.Duration r3 = p3186j$.time.Duration.between(r3, r2)
            goto L_0x01c9
        L_0x01c8:
            r3 = 0
        L_0x01c9:
            com.google.android.libraries.search.rendering.xuikit.c.n r4 = new com.google.android.libraries.search.rendering.xuikit.c.n
            long r5 = r5.length()
            r4.<init>(r5, r3)
            h.i r3 = new h.i
            r3.<init>(r1, r4)
            java.lang.Object r1 = r3.f186052a
            java.lang.Object r3 = r3.f186053b
            r14.put(r1, r3)
            r3 = r19
            r1 = 1
            r10 = 2
            goto L_0x0069
        L_0x01e4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "this and base files have different roots: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " and "
            r1.append(r2)
            r1.append(r6)
            r2 = 46
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0205:
            r10 = 0
            java.util.Collection r0 = r14.values()
            java.util.Iterator r0 = r0.iterator()
            r12 = r10
        L_0x0210:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0220
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.search.rendering.xuikit.c.n r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40290n) r1
            long r1 = r1.f105838a
            long r12 = r12 + r1
            goto L_0x0210
        L_0x0220:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r12)
            long r0 = r8.f105846e
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            int r0 = r14.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            long r0 = r8.f105847f
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            long r0 = r8.f105846e
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0262
            int r0 = r14.size()
            long r0 = (long) r0
            long r2 = r8.f105847f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x024e
            goto L_0x0262
        L_0x024e:
            com.google.android.libraries.search.rendering.xuikit.c.y r1 = r8.f105845d
            int r2 = r14.size()
            r0 = 3
            r8.f105844c = r0
            r5 = 0
            r6 = 0
            r3 = r12
            java.lang.Object r0 = r1.mo42390g(r2, r3, r5, r6)
            if (r0 != r9) goto L_0x02fd
            return r9
        L_0x0262:
            com.google.android.libraries.search.rendering.xuikit.c.y r0 = r8.f105845d
            long r1 = r8.f105846e
            int r3 = r14.size()
            long r4 = r8.f105847f
            j$.time.Duration r6 = r8.f105848g
            r8.f105842a = r14
            r8.f105843b = r12
            r7 = 1
            r8.f105844c = r7
            long r16 = r12 - r1
            long r1 = (long) r3
            long r4 = r1 - r4
            r1 = r14
            r2 = r16
            r7 = r23
            java.lang.Object r0 = r0.mo42388e(r1, r2, r4, r6, r7)
            if (r0 == r9) goto L_0x0300
            r2 = r14
        L_0x0286:
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            r0.size()
            com.google.android.libraries.search.rendering.xuikit.c.y r1 = r8.f105845d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0296:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02bc
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.io.File r6 = new java.io.File
            java.io.File r7 = r1.mo42384a()
            r6.<init>(r7, r5)
            boolean r5 = r6.delete()
            if (r5 != 0) goto L_0x02b8
            boolean r5 = r6.exists()
            if (r5 != 0) goto L_0x0296
        L_0x02b8:
            r3.add(r4)
            goto L_0x0296
        L_0x02bc:
            java.util.Iterator r0 = r3.iterator()
            r21 = r10
        L_0x02c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02dc
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.get(r1)
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            com.google.android.libraries.search.rendering.xuikit.c.n r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40290n) r1
            long r4 = r1.f105838a
            long r21 = r21 + r4
            goto L_0x02c2
        L_0x02dc:
            com.google.android.libraries.search.rendering.xuikit.c.y r0 = r8.f105845d
            int r1 = r2.size()
            int r2 = r3.size()
            int r20 = r3.size()
            r3 = 0
            r8.f105842a = r3
            r3 = 2
            r8.f105844c = r3
            int r17 = r1 - r2
            long r18 = r12 - r21
            r16 = r0
            java.lang.Object r0 = r16.mo42390g(r17, r18, r20, r21)
            if (r0 != r9) goto L_0x02fd
            return r9
        L_0x02fd:
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0300:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40292p.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C40292p(this.f105845d, this.f105846e, this.f105847f, this.f105848g, gVar);
    }
}
