package com.google.android.libraries.elements;

import android.util.SparseArray;
import com.facebook.litho.C6393hr;
import com.facebook.litho.C6394hs;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.widget.C6558w;
import com.google.android.libraries.elements.interfaces.C21239ai;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21253aw;
import com.google.android.libraries.elements.interfaces.C21254ax;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21261bd;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21290cf;
import com.google.android.libraries.elements.interfaces.C21318y;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.internal.C21339as;
import com.google.android.libraries.elements.internal.C21363x;
import com.google.android.libraries.elements.internal.C21365z;
import com.google.android.libraries.elements.p1727f.C21166o;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.p370af.C7494g;
import com.google.protos.youtube.elements.C66260r;
import com.google.protos.youtube.elements.p5166b.C66105j;
import com.youtube.android.libraries.elements.templates.C68106b;
import com.youtube.p5283a.p5284a.C68039ab;
import com.youtube.p5283a.p5284a.C68045ah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.libraries.elements.l */
/* compiled from: PG */
public final class C21368l implements C21249as {

    /* renamed from: a */
    static final Map f59743a;

    /* renamed from: b */
    static final C68045ah f59744b = new C68045ah();

    /* renamed from: c */
    private final SparseArray f59745c = new SparseArray();

    /* renamed from: d */
    private final SparseArray f59746d = new SparseArray();

    /* renamed from: e */
    private final C58528ij f59747e;

    /* renamed from: f */
    private final C21259bb f59748f;

    /* renamed from: g */
    private final boolean f59749g;

    /* renamed from: h */
    private final boolean f59750h;

    /* renamed from: i */
    private final boolean f59751i;

    /* renamed from: j */
    private final boolean f59752j;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(192475008, "AnimatedVectorType");
        hashMap.put(160982084, "CellType");
        hashMap.put(158796298, "CollectionType");
        hashMap.put(158796327, "ContainerType");
        hashMap.put(191923252, "EditableTextType");
        hashMap.put(158796345, "ImageType");
        hashMap.put(158796380, "TextType");
        hashMap.put(193805739, "ExpandableTextType");
        hashMap.put(197633010, "ScrollableContainerType");
        f59743a = C58495hd.m89898l(hashMap);
    }

    public C21368l(Map map, Map map2, Set set, C21259bb bbVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f59749g = ((Boolean) axVar.mo56109e(false)).booleanValue();
        for (C21254ax axVar5 : map.values()) {
            this.f59745c.put(axVar5.mo25994a(), axVar5);
        }
        C58431eu<C21253aw> c = C58431eu.m89653c(map2.values(), set);
        HashSet hashSet = new HashSet();
        C58526ih ihVar = new C58526ih();
        for (C21253aw b : c) {
            int a = b.mo26000b().mo58810a();
            Integer valueOf = Integer.valueOf(a);
            if (!hashSet.add(valueOf)) {
                ihVar.mo55373c(valueOf);
                C66260r rVar = C66260r.LOG_TYPE_CONFIGURATION_ERROR;
                bbVar.mo25782a(rVar, "Multiple type converters found and removed for extension " + a, C21319z.f59680u, (Throwable) null);
            }
        }
        this.f59747e = ihVar.mo55486f();
        for (C21253aw awVar : c) {
            int a2 = awVar.mo26000b().mo58810a();
            if (!this.f59747e.contains(Integer.valueOf(a2))) {
                this.f59746d.put(a2, awVar);
            }
        }
        this.f59750h = ((Boolean) axVar2.mo56109e(false)).booleanValue();
        this.f59751i = ((Boolean) axVar3.mo56109e(false)).booleanValue();
        this.f59752j = ((Boolean) axVar4.mo56109e(false)).booleanValue();
        this.f59748f = bbVar;
        C7494g.f24708a = new C21339as(bbVar);
        C68106b.f184340a.set(this.f59749g);
    }

    /* renamed from: d */
    private final List m40410d(C6411u uVar, C21319z zVar, C68039ab abVar, C21239ai aiVar, List list, boolean z) {
        Object obj;
        int g = abVar.mo60095g();
        if (g == 0) {
            return C58485gu.m89845m();
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(g, (Object) null));
        ArrayList arrayList2 = new ArrayList(g);
        for (int i = 0; i < g; i++) {
            arrayList2.add(Integer.valueOf(i));
        }
        if (!z) {
            Collections.shuffle(arrayList2);
        }
        for (int i2 = 0; i2 < g; i2++) {
            int intValue = ((Integer) arrayList2.get(i2)).intValue();
            C68039ab i3 = abVar.mo60096i(intValue);
            if (z) {
                C21363x b = C21365z.m40402b(uVar);
                b.mo26866d(new C21367k(this, i3, aiVar, list, intValue));
                b.f59729a.f59735b = zVar;
                obj = b.mo13259a();
            } else {
                C21319z zVar2 = zVar;
                obj = mo26868c(uVar, zVar, i3, aiVar, list, intValue, false);
            }
            arrayList.set(((Integer) arrayList2.get(i2)).intValue(), obj);
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object next : arrayList) {
            if (next != null) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }

    /* renamed from: a */
    public final C6407q mo26711a(C6411u uVar, C21319z zVar, C68039ab abVar, C21239ai aiVar, C69802a aVar) {
        C6407q qVar;
        if (!this.f59749g || zVar.mo26817r() != null) {
            C21290cf cfVar = C21290cf.f59626b;
            if (zVar.mo26809j() != null) {
                cfVar = zVar.mo26809j();
            }
            List synchronizedList = Collections.synchronizedList(new ArrayList());
            C6407q c = mo26868c(uVar, zVar, abVar, aiVar, synchronizedList, 0, true);
            C20774d dVar = new C20774d();
            dVar.mo25841d(uVar, new C21137e());
            C21137e eVar = dVar.f58112a;
            if (c == null) {
                qVar = null;
            } else {
                qVar = c.mo13318j();
            }
            eVar.f59291c = qVar;
            dVar.f58113d.set(1);
            dVar.f58112a.f59292d = this;
            dVar.f58113d.set(2);
            dVar.f58112a.f59293e = cfVar;
            dVar.f58113d.set(3);
            dVar.f58112a.f59289a = aVar;
            dVar.f58113d.set(0);
            if (aiVar != null) {
                dVar.f58112a.f59290b = aiVar;
            }
            if (abVar.mo60100n() != null && !abVar.mo60100n().equals("deprecated_option_force_clip_bounds")) {
                dVar.mo13450x(abVar.mo60100n());
            }
            C21261bd C = zVar.mo26842C();
            if (C != null && !synchronizedList.isEmpty()) {
                C.mo26744a(C58485gu.m89842j(synchronizedList));
            }
            return dVar.mo13259a();
        }
        throw new IllegalStateException("Element tree missing id in debug mode.");
    }

    /* renamed from: b */
    public final C6407q mo26712b(C6411u uVar, C21319z zVar, byte[] bArr, C21239ai aiVar, C69802a aVar) {
        C21319z zVar2;
        C66105j e;
        if (zVar == null) {
            zVar = C21319z.f59680u;
        }
        C21318y f = zVar.mo26804f();
        f.mo26788k(aVar);
        if (!this.f59749g) {
            zVar2 = f.mo26839p();
        } else {
            f.mo26791n(Integer.toString(System.identityHashCode(bArr)));
            zVar2 = f.mo26839p();
        }
        C21319z zVar3 = zVar2;
        C68039ab abVar = new C68039ab();
        int a = C68106b.m98451a(bArr, abVar, this.f59750h, this.f59752j);
        if (a != 0) {
            C21259bb bbVar = this.f59748f;
            C66260r rVar = C66260r.LOG_TYPE_INTERNAL_ERROR;
            bbVar.mo25782a(rVar, "Failed to convert Element to Flatbuffers:" + a, zVar3, (Throwable) null);
            return C6558w.m17858b(uVar).f19531a;
        }
        C6407q a2 = mo26711a(uVar, zVar3, abVar, aiVar, aVar);
        if (!this.f59749g || (e = C21168q.m39751e(abVar, (C21279bv) null, (byte[]) null, (String) null)) == null) {
            return a2;
        }
        C21166o oVar = new C21166o((String) null, (Component) null);
        oVar.mo26195a(e);
        C6393hr b = C6394hs.m17136b(uVar);
        b.mo13404d(a2);
        b.mo13428L(oVar);
        return b.mo13259a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c9 A[Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0338 A[SYNTHETIC, Splitter:B:129:0x0338] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0258 A[Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:146:0x03b0=Splitter:B:146:0x03b0, B:141:0x0388=Splitter:B:141:0x0388} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.litho.C6407q mo26868c(com.facebook.litho.C6411u r26, com.google.android.libraries.elements.interfaces.C21319z r27, com.youtube.p5283a.p5284a.C68039ab r28, com.google.android.libraries.elements.interfaces.C21239ai r29, java.util.List r30, int r31, boolean r32) {
        /*
            r25 = this;
            r8 = r25
            r0 = r27
            r1 = r29
            com.youtube.a.a.ah r2 = r28.mo60099m()
            r3 = 183314536(0xaed2868, float:2.2837469E-32)
            java.nio.ByteBuffer r2 = com.google.android.libraries.elements.internal.C21359t.m40385k(r2, r3)
            r9 = 0
            if (r2 == 0) goto L_0x0027
            com.youtube.a.a.am r2 = com.youtube.p5283a.p5284a.C68050am.m98285g(r2)
            java.lang.String r3 = r2.mo60121h()
            boolean r3 = com.google.common.base.C58837ba.m90859h(r3)
            if (r3 != 0) goto L_0x0027
            java.lang.String r2 = r2.mo60121h()
            goto L_0x0028
        L_0x0027:
            r2 = r9
        L_0x0028:
            com.google.android.libraries.elements.interfaces.y r3 = r27.mo26804f()
            r3.mo26840q(r9)
            r3.mo26780c(r9)
            boolean r4 = r8.f59749g
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r32 == 0) goto L_0x003b
            r4 = 1
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            r3.mo26790m(r4)
            if (r2 == 0) goto L_0x0044
            r3.mo26784g(r2)
        L_0x0044:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = ""
            java.lang.String r7 = r0.mo26845F(r7)
            r4.<init>(r7)
            com.youtube.a.a.ag r7 = r28.mo60097k()
            if (r7 == 0) goto L_0x005e
            com.youtube.a.a.ag r7 = r28.mo60097k()
            int r7 = r7.mo60106i()
            goto L_0x005f
        L_0x005e:
            r7 = 0
        L_0x005f:
            r10 = 168777401(0xa0f56b9, float:6.90151E-33)
            if (r7 == r10) goto L_0x0082
            java.util.Map r10 = f59743a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r12 = r10.containsKey(r11)
            if (r12 == 0) goto L_0x007a
            java.lang.Object r7 = r10.get(r11)
            java.lang.String r7 = (java.lang.String) r7
            r4.append(r7)
            goto L_0x007d
        L_0x007a:
            r4.append(r7)
        L_0x007d:
            r7 = 124(0x7c, float:1.74E-43)
            r4.append(r7)
        L_0x0082:
            r3.mo26787j(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = r27.mo26815p()
            r4.<init>(r7)
            int r7 = r4.length()
            if (r7 <= 0) goto L_0x0099
            r7 = 44
            r4.append(r7)
        L_0x0099:
            r7 = r31
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r3.mo26783f(r4)
            int r4 = r27.mo26799b()
            int r4 = r4 + r5
            r3.mo26782e(r4)
            com.google.android.libraries.elements.interfaces.bd r4 = r27.mo26842C()
            r7 = 6
            r10 = 2
            if (r4 == 0) goto L_0x01f0
            java.lang.ref.WeakReference r4 = r27.mo26821u()
            if (r4 != 0) goto L_0x00bd
            r4 = r9
            goto L_0x00c7
        L_0x00bd:
            java.lang.ref.WeakReference r4 = r27.mo26821u()
            java.lang.Object r4 = r4.get()
            com.google.protos.youtube.elements.df r4 = (com.google.protos.youtube.elements.C66192df) r4
        L_0x00c7:
            com.youtube.a.a.ag r11 = r28.mo60097k()
            if (r11 == 0) goto L_0x01dc
            com.youtube.a.a.ag r11 = r28.mo60097k()
            int r11 = r11.mo60106i()
            com.google.protobuf.bt r12 = com.google.protos.youtube.elements.C66061aw.f179649f
            com.google.protobuf.bs r12 = r12.f169971d
            int r12 = r12.f169964b
            if (r11 != r12) goto L_0x00df
            goto L_0x01dc
        L_0x00df:
            com.youtube.a.a.ah r11 = r28.mo60099m()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r11 != 0) goto L_0x00eb
            goto L_0x0109
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = r11.mo60108g()
            if (r13 >= r14) goto L_0x0109
            com.youtube.a.a.ag r14 = new com.youtube.a.a.ag
            r14.<init>()
            r11.mo60110i(r14, r13)
            int r15 = r14.mo60106i()
            r6 = 255496645(0xf3a91c5, float:9.198582E-30)
            if (r15 != r6) goto L_0x0106
            r12.add(r14)
        L_0x0106:
            int r13 = r13 + 1
            goto L_0x00ec
        L_0x0109:
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L_0x0111
            goto L_0x01dc
        L_0x0111:
            java.util.Iterator r6 = r12.iterator()
        L_0x0115:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0132
            java.lang.Object r11 = r6.next()
            com.youtube.a.a.ag r11 = (com.youtube.p5283a.p5284a.C68044ag) r11
            int r11 = r11.mo60107j()
            if (r11 == r10) goto L_0x0115
            com.google.android.libraries.elements.interfaces.bb r2 = r8.f59748f
            com.google.protos.youtube.elements.r r4 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_WIRE_FORMAT_ERROR
            java.lang.String r6 = "LoggingProperties are not in proto format"
            r2.mo25782a(r4, r6, r0, r9)
            goto L_0x01dc
        L_0x0132:
            com.google.protos.youtube.elements.dl r6 = com.google.protos.youtube.elements.C66198dl.f180008b     // Catch:{ ct -> 0x01d3 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.dk r6 = (com.google.protos.youtube.elements.C66197dk) r6     // Catch:{ ct -> 0x01d3 }
            java.util.Iterator r11 = r12.iterator()     // Catch:{ ct -> 0x01d3 }
        L_0x013e:
            boolean r12 = r11.hasNext()     // Catch:{ ct -> 0x01d3 }
            if (r12 == 0) goto L_0x015e
            java.lang.Object r12 = r11.next()     // Catch:{ ct -> 0x01d3 }
            com.youtube.a.a.ag r12 = (com.youtube.p5283a.p5284a.C68044ag) r12     // Catch:{ ct -> 0x01d3 }
            java.nio.ByteBuffer r12 = r12.mo16918f(r7)     // Catch:{ ct -> 0x01d3 }
            com.google.protobuf.ba r13 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.dl r14 = com.google.protos.youtube.elements.C66198dl.f180008b     // Catch:{ ct -> 0x01d3 }
            com.google.protobuf.bv r12 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r14, (java.nio.ByteBuffer) r12, (com.google.protobuf.C62921ba) r13)     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.dl r12 = (com.google.protos.youtube.elements.C66198dl) r12     // Catch:{ ct -> 0x01d3 }
            r6.mergeFrom(r12)     // Catch:{ ct -> 0x01d3 }
            goto L_0x013e
        L_0x015e:
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.dl r6 = (com.google.protos.youtube.elements.C66198dl) r6     // Catch:{ ct -> 0x01d3 }
            if (r2 == 0) goto L_0x0167
            goto L_0x016f
        L_0x0167:
            java.lang.String r2 = r27.mo26816q()     // Catch:{ ct -> 0x01d3 }
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r2)     // Catch:{ ct -> 0x01d3 }
        L_0x016f:
            int r11 = com.google.common.p4537i.C59294s.f157422b     // Catch:{ ct -> 0x01d3 }
            com.google.common.i.o r11 = com.google.common.p4537i.C59276af.f157402b     // Catch:{ ct -> 0x01d3 }
            com.google.common.i.p r11 = r11.mo56748e()     // Catch:{ ct -> 0x01d3 }
            if (r4 != 0) goto L_0x017b
            r12 = 0
            goto L_0x017d
        L_0x017b:
            int r12 = r4.f180000c     // Catch:{ ct -> 0x01d3 }
        L_0x017d:
            r11.mo56744e(r12)     // Catch:{ ct -> 0x01d3 }
            r11.mo56766j(r2)     // Catch:{ ct -> 0x01d3 }
            byte[] r2 = r6.toByteArray()     // Catch:{ ct -> 0x01d3 }
            r11.mo56746g(r2)     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.df r2 = com.google.protos.youtube.elements.C66192df.f179996e     // Catch:{ ct -> 0x01d3 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.de r2 = (com.google.protos.youtube.elements.C66191de) r2     // Catch:{ ct -> 0x01d3 }
            r2.copyOnWrite()     // Catch:{ ct -> 0x01d3 }
            com.google.protobuf.bv r12 = r2.instance     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.df r12 = (com.google.protos.youtube.elements.C66192df) r12     // Catch:{ ct -> 0x01d3 }
            r6.getClass()     // Catch:{ ct -> 0x01d3 }
            r12.f179999b = r6     // Catch:{ ct -> 0x01d3 }
            int r6 = r12.f179998a     // Catch:{ ct -> 0x01d3 }
            r6 = r6 | r5
            r12.f179998a = r6     // Catch:{ ct -> 0x01d3 }
            com.google.common.i.n r6 = r11.mo56758p()     // Catch:{ ct -> 0x01d3 }
            int r6 = r6.mo56771a()     // Catch:{ ct -> 0x01d3 }
            r2.copyOnWrite()     // Catch:{ ct -> 0x01d3 }
            com.google.protobuf.bv r11 = r2.instance     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.df r11 = (com.google.protos.youtube.elements.C66192df) r11     // Catch:{ ct -> 0x01d3 }
            int r12 = r11.f179998a     // Catch:{ ct -> 0x01d3 }
            r12 = r12 | r10
            r11.f179998a = r12     // Catch:{ ct -> 0x01d3 }
            r11.f180000c = r6     // Catch:{ ct -> 0x01d3 }
            if (r4 == 0) goto L_0x01cc
            int r4 = r4.f180000c     // Catch:{ ct -> 0x01d3 }
            r2.copyOnWrite()     // Catch:{ ct -> 0x01d3 }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.df r6 = (com.google.protos.youtube.elements.C66192df) r6     // Catch:{ ct -> 0x01d3 }
            int r11 = r6.f179998a     // Catch:{ ct -> 0x01d3 }
            r11 = r11 | 4
            r6.f179998a = r11     // Catch:{ ct -> 0x01d3 }
            r6.f180001d = r4     // Catch:{ ct -> 0x01d3 }
        L_0x01cc:
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ ct -> 0x01d3 }
            com.google.protos.youtube.elements.df r2 = (com.google.protos.youtube.elements.C66192df) r2     // Catch:{ ct -> 0x01d3 }
            goto L_0x01dd
        L_0x01d3:
            com.google.android.libraries.elements.interfaces.bb r2 = r8.f59748f
            com.google.protos.youtube.elements.r r4 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_WIRE_FORMAT_ERROR
            java.lang.String r6 = "Failed to parse LoggingProperties"
            r2.mo25782a(r4, r6, r0, r9)
        L_0x01dc:
            r2 = r9
        L_0x01dd:
            if (r2 == 0) goto L_0x01f0
            r0 = r30
            r0.add(r2)
            r3.mo26840q(r2)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r3.mo26786i(r4)
            goto L_0x01f2
        L_0x01f0:
            r0 = r30
        L_0x01f2:
            boolean r2 = r8.f59749g
            if (r2 == 0) goto L_0x020b
            com.youtube.a.a.ah r2 = r28.mo60099m()
            java.lang.String r2 = com.google.android.libraries.elements.p1727f.C21168q.m39753g(r2)
            if (r2 != 0) goto L_0x0208
            java.lang.String r2 = "Elements"
            java.lang.String r4 = "Found an Element with missing debugger id."
            android.util.Log.w(r2, r4)
            goto L_0x020b
        L_0x0208:
            r3.mo26780c(r2)
        L_0x020b:
            com.google.android.libraries.elements.interfaces.z r15 = r3.mo26839p()
            boolean r14 = r8.f59751i
            com.google.android.libraries.elements.internal.v r2 = com.google.android.libraries.elements.internal.C21362w.f59728a
            java.lang.Object r2 = r2.mo5126a()
            com.youtube.a.a.ag r2 = (com.youtube.p5283a.p5284a.C68044ag) r2
            r4 = r28
            com.youtube.a.a.ag r13 = r4.mo60098l(r2)
            if (r13 != 0) goto L_0x0232
            com.google.android.libraries.elements.interfaces.bb r0 = r8.f59748f
            com.google.protos.youtube.elements.r r1 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_MISSING_FIELD
            java.lang.String r2 = "Element missing type extension"
            r0.mo25782a(r1, r2, r15, r9)
            com.facebook.litho.widget.v r0 = com.facebook.litho.widget.C6558w.m17858b(r26)
            com.facebook.litho.widget.w r0 = r0.f19531a
            goto L_0x03d6
        L_0x0232:
            boolean r2 = r8.f59749g
            if (r2 == 0) goto L_0x0250
            java.lang.String r2 = r15.mo26814o()
            if (r2 == 0) goto L_0x0250
            java.lang.String r2 = r15.mo26814o()
            if (r1 != 0) goto L_0x0248
            com.google.android.libraries.elements.f.j r1 = new com.google.android.libraries.elements.f.j
            r1.<init>(r2)
            goto L_0x0250
        L_0x0248:
            com.google.android.libraries.elements.f.k r3 = new com.google.android.libraries.elements.f.k
            r3.<init>(r1, r2)
            r23 = r3
            goto L_0x0252
        L_0x0250:
            r23 = r1
        L_0x0252:
            int r1 = r13.mo60107j()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            if (r1 != r5) goto L_0x02c9
            android.util.SparseArray r1 = r8.f59745c     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            int r2 = r13.mo60106i()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r10 = r1
            com.google.android.libraries.elements.interfaces.ax r10 = (com.google.android.libraries.elements.interfaces.C21254ax) r10     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            if (r10 != 0) goto L_0x026c
        L_0x0267:
            r0 = r9
        L_0x0268:
            r1 = r13
            r3 = r15
            goto L_0x032f
        L_0x026c:
            java.nio.ByteBuffer r1 = r13.mo16918f(r7)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            com.google.af.e r19 = r10.mo25996c(r1)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            com.youtube.a.a.ah r1 = r28.mo60099m()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            if (r1 != 0) goto L_0x027c
            com.youtube.a.a.ah r1 = f59744b     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
        L_0x027c:
            r21 = r1
            com.youtube.a.a.ag r1 = r28.mo60097k()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            if (r1 == 0) goto L_0x02a4
            com.youtube.a.a.ag r1 = r28.mo60097k()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            int r1 = r1.mo60106i()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r2 = 158796298(0x9770a0a, float:2.9736264E-33)
            if (r1 != r2) goto L_0x02a4
            com.google.android.libraries.elements.interfaces.y r1 = r15.mo26804f()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r2.<init>()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r1.mo26789l(r2)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            com.google.android.libraries.elements.interfaces.z r1 = r1.mo26839p()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r18 = r1
            goto L_0x02a6
        L_0x02a4:
            r18 = r15
        L_0x02a6:
            java.lang.String r20 = r28.mo60100n()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            boolean r7 = r10.mo25997d()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r1 = r25
            r2 = r26
            r3 = r18
            r4 = r28
            r5 = r23
            r6 = r30
            java.util.List r22 = r1.m40410d(r2, r3, r4, r5, r6, r7)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r16 = r10
            r17 = r26
            r24 = r14
            com.facebook.litho.q r0 = r16.mo25995b(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            goto L_0x0268
        L_0x02c9:
            int r1 = r13.mo60107j()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            if (r1 != r10) goto L_0x032c
            android.util.SparseArray r1 = r8.f59746d     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            int r2 = r13.mo60106i()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r11 = r1
            com.google.android.libraries.elements.interfaces.aw r11 = (com.google.android.libraries.elements.interfaces.C21253aw) r11     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            if (r11 != 0) goto L_0x02df
            goto L_0x0267
        L_0x02df:
            com.google.protobuf.ay r1 = r11.mo26000b()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            com.google.protobuf.MessageLite r1 = r1.mo58811b()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            com.google.protobuf.eb r1 = r1.getParserForType()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            java.nio.ByteBuffer r2 = r13.mo16918f(r7)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            com.google.protobuf.MessageLite r10 = com.google.android.libraries.elements.internal.C21322ab.m40329a(r2, r1, r3)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            com.youtube.a.a.ah r1 = r28.mo60099m()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            if (r1 != 0) goto L_0x0302
            com.youtube.a.a.ah r1 = new com.youtube.a.a.ah     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r1.<init>()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
        L_0x0302:
            r16 = r1
            java.lang.String r17 = r28.mo60100n()     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r7 = 0
            r1 = r25
            r2 = r26
            r3 = r15
            r4 = r28
            r5 = r23
            r6 = r30
            java.util.List r0 = r1.m40410d(r2, r3, r4, r5, r6, r7)     // Catch:{ ct -> 0x03ad, bc -> 0x0385, all -> 0x0382 }
            r12 = r26
            r1 = r13
            r13 = r15
            r2 = r14
            r14 = r10
            r3 = r15
            r15 = r17
            r17 = r0
            r18 = r23
            r19 = r2
            com.facebook.litho.q r0 = r11.mo25999a(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            goto L_0x032f
        L_0x032c:
            r1 = r13
            r3 = r15
            r0 = r9
        L_0x032f:
            if (r0 == 0) goto L_0x0338
            com.google.android.libraries.elements.internal.v r2 = com.google.android.libraries.elements.internal.C21362w.f59728a
        L_0x0333:
            r2.mo5127b(r1)
            goto L_0x03d6
        L_0x0338:
            int r0 = r1.mo60106i()     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            r2.<init>()     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            java.lang.String r4 = "Component was not found "
            r2.append(r4)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            r2.append(r0)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            java.lang.String r0 = r2.toString()     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            com.google.common.b.ij r2 = r8.f59747e     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            int r4 = r1.mo60106i()     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            boolean r2 = r2.contains(r4)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            if (r2 == 0) goto L_0x036e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            r2.<init>()     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            r2.append(r0)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            java.lang.String r0 = " because it was removed due to duplicate converter bindings."
            r2.append(r0)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            java.lang.String r0 = r2.toString()     // Catch:{ ct -> 0x0380, bc -> 0x037e }
        L_0x036e:
            com.google.android.libraries.elements.interfaces.bb r2 = r8.f59748f     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            com.google.protos.youtube.elements.r r4 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_UNKNOWN_EXTENSION     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            r2.mo25782a(r4, r0, r3, r9)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            com.facebook.litho.widget.v r0 = com.facebook.litho.widget.C6558w.m17858b(r26)     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            com.facebook.litho.widget.w r0 = r0.f19531a     // Catch:{ ct -> 0x0380, bc -> 0x037e }
            com.google.android.libraries.elements.internal.v r2 = com.google.android.libraries.elements.internal.C21362w.f59728a
            goto L_0x0333
        L_0x037e:
            r0 = move-exception
            goto L_0x0388
        L_0x0380:
            r0 = move-exception
            goto L_0x03b0
        L_0x0382:
            r0 = move-exception
            r1 = r13
            goto L_0x03e0
        L_0x0385:
            r0 = move-exception
            r1 = r13
            r3 = r15
        L_0x0388:
            com.google.android.libraries.elements.interfaces.bb r2 = r8.f59748f     // Catch:{ all -> 0x03df }
            com.google.protos.youtube.elements.r r4 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INTERNAL_ERROR     // Catch:{ all -> 0x03df }
            int r5 = r1.mo60106i()     // Catch:{ all -> 0x03df }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x03df }
            r6.<init>()     // Catch:{ all -> 0x03df }
            java.lang.String r7 = "ElementsException was thrown in flat while converting "
            r6.append(r7)     // Catch:{ all -> 0x03df }
            r6.append(r5)     // Catch:{ all -> 0x03df }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x03df }
            r2.mo25782a(r4, r5, r3, r0)     // Catch:{ all -> 0x03df }
            com.facebook.litho.widget.v r0 = com.facebook.litho.widget.C6558w.m17858b(r26)     // Catch:{ all -> 0x03df }
            com.facebook.litho.widget.w r0 = r0.f19531a     // Catch:{ all -> 0x03df }
            com.google.android.libraries.elements.internal.v r2 = com.google.android.libraries.elements.internal.C21362w.f59728a
            goto L_0x0333
        L_0x03ad:
            r0 = move-exception
            r1 = r13
            r3 = r15
        L_0x03b0:
            com.google.android.libraries.elements.interfaces.bb r2 = r8.f59748f     // Catch:{ all -> 0x03df }
            com.google.protos.youtube.elements.r r4 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_WIRE_FORMAT_ERROR     // Catch:{ all -> 0x03df }
            int r5 = r1.mo60106i()     // Catch:{ all -> 0x03df }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x03df }
            r6.<init>()     // Catch:{ all -> 0x03df }
            java.lang.String r7 = "Error while converting "
            r6.append(r7)     // Catch:{ all -> 0x03df }
            r6.append(r5)     // Catch:{ all -> 0x03df }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x03df }
            r2.mo25782a(r4, r5, r3, r0)     // Catch:{ all -> 0x03df }
            com.facebook.litho.widget.v r0 = com.facebook.litho.widget.C6558w.m17858b(r26)     // Catch:{ all -> 0x03df }
            com.facebook.litho.widget.w r0 = r0.f19531a     // Catch:{ all -> 0x03df }
            com.google.android.libraries.elements.internal.v r2 = com.google.android.libraries.elements.internal.C21362w.f59728a
            goto L_0x0333
        L_0x03d6:
            if (r0 != 0) goto L_0x03de
            com.facebook.litho.widget.v r0 = com.facebook.litho.widget.C6558w.m17858b(r26)
            com.facebook.litho.widget.w r0 = r0.f19531a
        L_0x03de:
            return r0
        L_0x03df:
            r0 = move-exception
        L_0x03e0:
            com.google.android.libraries.elements.internal.v r2 = com.google.android.libraries.elements.internal.C21362w.f59728a
            r2.mo5127b(r1)
            goto L_0x03e7
        L_0x03e6:
            throw r0
        L_0x03e7:
            goto L_0x03e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.C21368l.mo26868c(com.facebook.litho.u, com.google.android.libraries.elements.interfaces.z, com.youtube.a.a.ab, com.google.android.libraries.elements.interfaces.ai, java.util.List, int, boolean):com.facebook.litho.q");
    }
}
