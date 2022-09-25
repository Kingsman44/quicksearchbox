package com.google.android.libraries.p1975k;

import android.content.Context;
import android.util.LruCache;
import com.google.common.p4522b.C58485gu;
import com.google.p4230bn.p4231a.p4232a.p4233a.C56114a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72756d;
import p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72757e;
import p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i;
import p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72765m;

/* renamed from: com.google.android.libraries.k.f */
/* compiled from: PG */
public final class C24012f {

    /* renamed from: c */
    private static final int f65625c = C56114a.m87896a("DEFAULT");

    /* renamed from: a */
    public final LruCache f65626a;

    /* renamed from: b */
    public C72765m f65627b;

    /* renamed from: d */
    private final LruCache f65628d;

    /* renamed from: e */
    private final Context f65629e;

    /* renamed from: f */
    private final Integer f65630f;

    public C24012f(Context context, int i, LruCache lruCache, LruCache lruCache2) {
        this.f65629e = context;
        this.f65630f = Integer.valueOf(i);
        this.f65628d = lruCache;
        this.f65626a = lruCache2;
    }

    /* renamed from: e */
    private static Map m44605e(List list, C58485gu guVar) {
        int i;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < guVar.size()) {
                C72757e eVar = (C72757e) guVar.get(num.intValue());
                if ((eVar.f193436a & 2) != 0) {
                    i = eVar.f193438c;
                } else {
                    i = f65625c;
                }
                Integer valueOf = Integer.valueOf(i);
                C72756d dVar = (C72756d) eVar.toBuilder();
                dVar.copyOnWrite();
                C72757e eVar2 = (C72757e) dVar.instance;
                eVar2.f193436a &= -3;
                eVar2.f193438c = 0;
                hashMap.put(valueOf, (C72757e) dVar.build());
            } else {
                throw new C24002e(String.format("CollectionBasisHolder index(%d) exceeds list size(%d)", new Object[]{num, Integer.valueOf(guVar.size())}));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final C72761i mo29415a(int i) {
        LruCache lruCache = this.f65628d;
        Integer valueOf = Integer.valueOf(i);
        C72761i iVar = (C72761i) lruCache.get(valueOf);
        if (iVar == null) {
            if (this.f65627b == null) {
                this.f65627b = mo29417c();
            }
            iVar = (C72761i) Collections.unmodifiableMap(this.f65627b.f193454a).get(valueOf);
            if (iVar != null) {
                this.f65628d.put(valueOf, iVar);
            }
        }
        return iVar;
    }

    /* renamed from: b */
    public final C72761i mo29416b(int i) {
        C72761i a = mo29415a(i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:67|68) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0289 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72765m mo29417c() {
        /*
            r17 = this;
            r1 = r17
            android.content.Context r0 = r1.f65629e
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x028a }
            java.lang.Integer r2 = r1.f65630f     // Catch:{ NotFoundException -> 0x028a }
            int r2 = r2.intValue()     // Catch:{ NotFoundException -> 0x028a }
            java.io.InputStream r2 = r0.openRawResource(r2)     // Catch:{ NotFoundException -> 0x028a }
            com.google.protobuf.ae r0 = com.google.protobuf.C62897ae.m95110M(r2)     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.m r5 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72765m.f193452f     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.j r5 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72762j) r5     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.f169869a     // Catch:{ all -> 0x0267 }
            r5.mergeFrom((com.google.protobuf.C62897ae) r0, (com.google.protobuf.C62921ba) r6)     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r0 = r5.build()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.m r0 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72765m) r0     // Catch:{ all -> 0x0267 }
            com.google.protobuf.cq r5 = r0.f193456c     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ch r6 = r0.f193457d     // Catch:{ all -> 0x0267 }
            int r7 = r5.size()     // Catch:{ all -> 0x0267 }
            int r8 = r6.size()     // Catch:{ all -> 0x0267 }
            if (r7 != r8) goto L_0x0242
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0267 }
            r7.<init>()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.cq r8 = r0.f193458e     // Catch:{ all -> 0x0267 }
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89842j(r8)     // Catch:{ all -> 0x0267 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0267 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0267 }
        L_0x004a:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x0267 }
            if (r10 == 0) goto L_0x01f8
            boolean r10 = r5.hasNext()     // Catch:{ all -> 0x0267 }
            if (r10 == 0) goto L_0x01f8
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x0267 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0267 }
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r11 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r11     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ch r12 = r11.f193447e     // Catch:{ all -> 0x0267 }
            java.util.Map r12 = m44605e(r12, r8)     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ch r13 = r11.f193448f     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ck r14 = r11.f193449g     // Catch:{ all -> 0x0267 }
            int r15 = r13.size()     // Catch:{ all -> 0x0267 }
            int r4 = r14.size()     // Catch:{ all -> 0x0267 }
            java.lang.String r3 = "TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size"
            if (r15 != r4) goto L_0x01d5
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0267 }
            r4.<init>()     // Catch:{ all -> 0x0267 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0267 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0267 }
        L_0x0085:
            boolean r15 = r14.hasNext()     // Catch:{ all -> 0x0267 }
            if (r15 == 0) goto L_0x00be
            boolean r15 = r13.hasNext()     // Catch:{ all -> 0x0267 }
            if (r15 == 0) goto L_0x00be
            java.lang.Object r15 = r14.next()     // Catch:{ all -> 0x0267 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0267 }
            java.lang.Object r16 = r13.next()     // Catch:{ all -> 0x0267 }
            java.lang.Integer r16 = (java.lang.Integer) r16     // Catch:{ all -> 0x0267 }
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89846n(r16)     // Catch:{ all -> 0x0267 }
            java.util.Map r9 = m44605e(r9, r8)     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.c r16 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c.f193428e     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bn r16 = r16.createBuilder()     // Catch:{ all -> 0x0267 }
            r1 = r16
            q.a.a.a.a.a.a r1 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72753a) r1     // Catch:{ all -> 0x0267 }
            r1.mo64542a(r9)     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.c r1 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c) r1     // Catch:{ all -> 0x0267 }
            r4.put(r15, r1)     // Catch:{ all -> 0x0267 }
            r1 = r17
            goto L_0x0085
        L_0x00be:
            com.google.protobuf.cq r1 = r11.f193445c     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ck r9 = r11.f193446d     // Catch:{ all -> 0x0267 }
            int r13 = r1.size()     // Catch:{ all -> 0x0267 }
            int r14 = r9.size()     // Catch:{ all -> 0x0267 }
            if (r13 != r14) goto L_0x01b2
            java.util.Iterator r3 = r9.iterator()     // Catch:{ all -> 0x0267 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0267 }
        L_0x00d4:
            boolean r9 = r3.hasNext()     // Catch:{ all -> 0x0267 }
            if (r9 == 0) goto L_0x012e
            boolean r9 = r1.hasNext()     // Catch:{ all -> 0x0267 }
            if (r9 == 0) goto L_0x012e
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x0267 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0267 }
            java.lang.Object r13 = r1.next()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.c r13 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c) r13     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ch r14 = r13.f193433d     // Catch:{ all -> 0x0267 }
            java.util.Map r14 = m44605e(r14, r8)     // Catch:{ all -> 0x0267 }
            boolean r15 = r4.containsKey(r9)     // Catch:{ all -> 0x0267 }
            if (r15 == 0) goto L_0x010e
            com.google.protobuf.bn r13 = r13.toBuilder()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.a r13 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72753a) r13     // Catch:{ all -> 0x0267 }
            java.lang.Object r14 = r4.get(r9)     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.c r14 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c) r14     // Catch:{ all -> 0x0267 }
            r13.mergeFrom(r14)     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r13 = r13.build()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.c r13 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c) r13     // Catch:{ all -> 0x0267 }
            goto L_0x012a
        L_0x010e:
            com.google.protobuf.bn r13 = r13.toBuilder()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.a r13 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72753a) r13     // Catch:{ all -> 0x0267 }
            r13.mo64542a(r14)     // Catch:{ all -> 0x0267 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.c r14 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c) r14     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ch r15 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c.emptyIntList()     // Catch:{ all -> 0x0267 }
            r14.f193433d = r15     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r13 = r13.build()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.c r13 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c) r13     // Catch:{ all -> 0x0267 }
        L_0x012a:
            r4.put(r9, r13)     // Catch:{ all -> 0x0267 }
            goto L_0x00d4
        L_0x012e:
            com.google.protobuf.bn r1 = r11.toBuilder()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.f r1 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72758f) r1     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.dn r9 = r3.f193443a     // Catch:{ all -> 0x0267 }
            boolean r11 = r9.f170058b     // Catch:{ all -> 0x0267 }
            if (r11 != 0) goto L_0x0147
            com.google.protobuf.dn r9 = r9.mo58980a()     // Catch:{ all -> 0x0267 }
            r3.f193443a = r9     // Catch:{ all -> 0x0267 }
        L_0x0147:
            com.google.protobuf.dn r3 = r3.f193443a     // Catch:{ all -> 0x0267 }
            r3.putAll(r12)     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ch r9 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i.emptyIntList()     // Catch:{ all -> 0x0267 }
            r3.f193447e = r9     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.dn r9 = r3.f193444b     // Catch:{ all -> 0x0267 }
            boolean r11 = r9.f170058b     // Catch:{ all -> 0x0267 }
            if (r11 != 0) goto L_0x016c
            com.google.protobuf.dn r9 = r9.mo58980a()     // Catch:{ all -> 0x0267 }
            r3.f193444b = r9     // Catch:{ all -> 0x0267 }
        L_0x016c:
            com.google.protobuf.dn r3 = r3.f193444b     // Catch:{ all -> 0x0267 }
            r3.putAll(r4)     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ck r4 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i.emptyLongList()     // Catch:{ all -> 0x0267 }
            r3.f193446d = r4     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.cq r4 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i.emptyProtobufList()     // Catch:{ all -> 0x0267 }
            r3.f193445c = r4     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ch r4 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i.emptyIntList()     // Catch:{ all -> 0x0267 }
            r3.f193448f = r4     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.ck r4 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i.emptyLongList()     // Catch:{ all -> 0x0267 }
            r3.f193449g = r4     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.i r1 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i) r1     // Catch:{ all -> 0x0267 }
            r7.put(r10, r1)     // Catch:{ all -> 0x0267 }
            r1 = r17
            goto L_0x004a
        L_0x01b2:
            com.google.android.libraries.k.e r0 = new com.google.android.libraries.k.e     // Catch:{ all -> 0x0267 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0267 }
            int r5 = r9.size()     // Catch:{ all -> 0x0267 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0267 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0267 }
            int r1 = r1.size()     // Catch:{ all -> 0x0267 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0267 }
            r5 = 1
            r4[r5] = r1     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0267 }
            r0.<init>(r1)     // Catch:{ all -> 0x0267 }
            throw r0     // Catch:{ all -> 0x0267 }
        L_0x01d5:
            com.google.android.libraries.k.e r0 = new com.google.android.libraries.k.e     // Catch:{ all -> 0x0267 }
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0267 }
            int r4 = r14.size()     // Catch:{ all -> 0x0267 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0267 }
            r5 = 0
            r1[r5] = r4     // Catch:{ all -> 0x0267 }
            int r4 = r13.size()     // Catch:{ all -> 0x0267 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0267 }
            r5 = 1
            r1[r5] = r4     // Catch:{ all -> 0x0267 }
            java.lang.String r1 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0267 }
            r0.<init>(r1)     // Catch:{ all -> 0x0267 }
            throw r0     // Catch:{ all -> 0x0267 }
        L_0x01f8:
            q.a.a.a.a.a.m r1 = p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72765m.f193452f     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.j r1 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72762j) r1     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.m r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72765m) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.dn r4 = r3.f193454a     // Catch:{ all -> 0x0267 }
            boolean r5 = r4.f170058b     // Catch:{ all -> 0x0267 }
            if (r5 != 0) goto L_0x0213
            com.google.protobuf.dn r4 = r4.mo58980a()     // Catch:{ all -> 0x0267 }
            r3.f193454a = r4     // Catch:{ all -> 0x0267 }
        L_0x0213:
            com.google.protobuf.dn r3 = r3.f193454a     // Catch:{ all -> 0x0267 }
            r3.putAll(r7)     // Catch:{ all -> 0x0267 }
            com.google.protobuf.dn r0 = r0.f193455b     // Catch:{ all -> 0x0267 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0267 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.m r3 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72765m) r3     // Catch:{ all -> 0x0267 }
            com.google.protobuf.dn r4 = r3.f193455b     // Catch:{ all -> 0x0267 }
            boolean r5 = r4.f170058b     // Catch:{ all -> 0x0267 }
            if (r5 != 0) goto L_0x0231
            com.google.protobuf.dn r4 = r4.mo58980a()     // Catch:{ all -> 0x0267 }
            r3.f193455b = r4     // Catch:{ all -> 0x0267 }
        L_0x0231:
            com.google.protobuf.dn r3 = r3.f193455b     // Catch:{ all -> 0x0267 }
            r3.putAll(r0)     // Catch:{ all -> 0x0267 }
            com.google.protobuf.bv r0 = r1.build()     // Catch:{ all -> 0x0267 }
            q.a.a.a.a.a.m r0 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72765m) r0     // Catch:{ all -> 0x0267 }
            if (r2 == 0) goto L_0x0241
            r2.close()     // Catch:{ NotFoundException -> 0x028a }
        L_0x0241:
            return r0
        L_0x0242:
            com.google.android.libraries.k.e r0 = new com.google.android.libraries.k.e     // Catch:{ all -> 0x0267 }
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0267 }
            int r3 = r6.size()     // Catch:{ all -> 0x0267 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0267 }
            r4 = 0
            r1[r4] = r3     // Catch:{ all -> 0x0267 }
            int r3 = r5.size()     // Catch:{ all -> 0x0267 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0267 }
            r4 = 1
            r1[r4] = r3     // Catch:{ all -> 0x0267 }
            java.lang.String r3 = "ProtoHashNamesList[%d] and MessagesList[%d] must have same size"
            java.lang.String r1 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0267 }
            r0.<init>(r1)     // Catch:{ all -> 0x0267 }
            throw r0     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x0289
            r2.close()     // Catch:{ all -> 0x026f }
            goto L_0x0289
        L_0x026f:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0289 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r0[r4] = r3     // Catch:{ Exception -> 0x0289 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r5, r0)     // Catch:{ Exception -> 0x0289 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0289 }
            r3[r4] = r2     // Catch:{ Exception -> 0x0289 }
            r0.invoke(r1, r3)     // Catch:{ Exception -> 0x0289 }
        L_0x0289:
            throw r1     // Catch:{ NotFoundException -> 0x028a }
        L_0x028a:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            goto L_0x0292
        L_0x0291:
            throw r1
        L_0x0292:
            goto L_0x0291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1975k.C24012f.mo29417c():q.a.a.a.a.a.m");
    }

    /* renamed from: d */
    public final boolean mo29418d(int i) {
        return mo29415a(i) != null;
    }
}
