package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2897cz;
import androidx.media3.exoplayer.dash.p141a.C2910a;
import androidx.media3.exoplayer.dash.p141a.C2912c;
import androidx.media3.exoplayer.dash.p141a.C2915f;
import androidx.media3.exoplayer.dash.p141a.C2916g;
import androidx.media3.exoplayer.dash.p141a.C2917h;
import androidx.media3.exoplayer.dash.p141a.C2922m;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p145h.C3033ap;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3094ce;
import androidx.media3.exoplayer.p145h.C3096cg;
import androidx.media3.exoplayer.p145h.C3097ch;
import androidx.media3.exoplayer.p145h.C3107cr;
import androidx.media3.exoplayer.p145h.C3116k;
import androidx.media3.exoplayer.p145h.p147b.C3045a;
import androidx.media3.exoplayer.p145h.p147b.C3053i;
import androidx.media3.exoplayer.p145h.p147b.C3054j;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.exoplayer.p151k.C3257w;
import androidx.media3.p132b.C2495an;
import com.google.common.p4575r.C60757n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.exoplayer.dash.e */
/* compiled from: PG */
public final class C2936e implements C3034aq, C3096cg, C3053i {

    /* renamed from: i */
    private static final Pattern f8411i = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: j */
    private static final Pattern f8412j = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a */
    final int f8413a;

    /* renamed from: b */
    public final C2957z f8414b;

    /* renamed from: c */
    public C3033ap f8415c;

    /* renamed from: d */
    public C3054j[] f8416d = new C3054j[0];

    /* renamed from: e */
    public C2954w[] f8417e = new C2954w[0];

    /* renamed from: f */
    public C2912c f8418f;

    /* renamed from: g */
    public int f8419g;

    /* renamed from: h */
    public List f8420h;

    /* renamed from: k */
    private final C2495an f8421k;

    /* renamed from: l */
    private final C2868k f8422l;

    /* renamed from: m */
    private final C2933b f8423m;

    /* renamed from: n */
    private final long f8424n;

    /* renamed from: o */
    private final C3257w f8425o;

    /* renamed from: p */
    private final C3107cr f8426p;

    /* renamed from: q */
    private final C2935d[] f8427q;

    /* renamed from: r */
    private final IdentityHashMap f8428r = new IdentityHashMap();

    /* renamed from: s */
    private final C3065bc f8429s;

    /* renamed from: t */
    private final C2862e f8430t;

    /* renamed from: u */
    private C3097ch f8431u = new C3116k(this.f8416d);

    /* renamed from: v */
    private final C2950s f8432v;

    /* renamed from: w */
    private final C3245k f8433w;

    /* renamed from: x */
    private final C3241g f8434x;

    public C2936e(int i, C2912c cVar, C2933b bVar, int i2, C2950s sVar, C2495an anVar, C2868k kVar, C2862e eVar, C3245k kVar2, C3065bc bcVar, long j, C3257w wVar, C3241g gVar, C2941j jVar) {
        String str;
        List list;
        int i3;
        int i4;
        boolean[] zArr;
        C2680x[] xVarArr;
        C2915f r;
        C2912c cVar2 = cVar;
        int i5 = i2;
        C2868k kVar3 = kVar;
        C3241g gVar2 = gVar;
        this.f8413a = i;
        this.f8418f = cVar2;
        this.f8423m = bVar;
        this.f8419g = i5;
        this.f8432v = sVar;
        this.f8421k = anVar;
        this.f8422l = kVar3;
        this.f8430t = eVar;
        this.f8433w = kVar2;
        this.f8429s = bcVar;
        this.f8424n = j;
        this.f8425o = wVar;
        this.f8434x = gVar2;
        this.f8414b = new C2957z(cVar2, jVar, gVar2);
        int i6 = 0;
        C2917h c = cVar2.mo6766c(i5);
        this.f8420h = c.f8353d;
        List list2 = c.f8352c;
        List list3 = this.f8420h;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            sparseIntArray.put(((C2910a) list2.get(i7)).f8306a, i7);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        for (int i8 = 0; i8 < size; i8++) {
            C2910a aVar = (C2910a) list2.get(i8);
            C2915f r2 = m8291r(aVar.f8310e, "http://dashif.org/guidelines/trickmode");
            r2 = r2 == null ? m8291r(aVar.f8311f, "http://dashif.org/guidelines/trickmode") : r2;
            int i9 = (r2 == null || (i9 = sparseIntArray.get(Integer.parseInt(r2.f8344b), -1)) == -1) ? i8 : i9;
            if (i9 == i8 && (r = m8291r(aVar.f8311f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                for (String parseInt : C2612ak.m6967aq(r.f8344b, ",")) {
                    int i10 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i10 != -1) {
                        i9 = Math.min(i9, i10);
                    }
                }
            }
            if (i9 != i8) {
                List list4 = (List) sparseArray.get(i8);
                List list5 = (List) sparseArray.get(i9);
                list5.addAll(list4);
                sparseArray.put(i8, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            int[] m = C60757n.m92752m((Collection) arrayList.get(i11));
            iArr[i11] = m;
            Arrays.sort(m);
        }
        boolean[] zArr2 = new boolean[size2];
        C2680x[][] xVarArr2 = new C2680x[size2][];
        int i12 = 0;
        int i13 = 0;
        while (i12 < size2) {
            int[] iArr2 = iArr[i12];
            int length = iArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                List list6 = ((C2910a) list2.get(iArr2[i14])).f8308c;
                while (i6 < list6.size()) {
                    if (!((C2922m) list6.get(i6)).f8369e.isEmpty()) {
                        zArr2[i12] = true;
                        i13++;
                        break;
                    }
                    i6++;
                }
                i14++;
                i6 = 0;
            }
            int[] iArr3 = iArr[i12];
            int length2 = iArr3.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    xVarArr = new C2680x[0];
                    break;
                }
                int i16 = iArr3[i15];
                C2910a aVar2 = (C2910a) list2.get(i16);
                List list7 = ((C2910a) list2.get(i16)).f8309d;
                int[] iArr4 = iArr3;
                int i17 = 0;
                while (i17 < list7.size()) {
                    C2915f fVar = (C2915f) list7.get(i17);
                    int i18 = length2;
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f8343a)) {
                        C2679w wVar2 = new C2679w();
                        wVar2.f7459k = "application/cea-608";
                        wVar2.f7449a = aVar2.f8306a + ":cea608";
                        xVarArr = m8292s(fVar, f8411i, new C2680x(wVar2));
                        break;
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f8343a)) {
                        C2679w wVar3 = new C2679w();
                        wVar3.f7459k = "application/cea-708";
                        wVar3.f7449a = aVar2.f8306a + ":cea708";
                        xVarArr = m8292s(fVar, f8412j, new C2680x(wVar3));
                        break;
                    } else {
                        i17++;
                        length2 = i18;
                        list7 = list8;
                    }
                }
                int i19 = length2;
                i15++;
                iArr3 = iArr4;
            }
            xVarArr2[i12] = xVarArr;
            if (xVarArr.length != 0) {
                i13++;
            }
            i12++;
            i6 = 0;
        }
        int size3 = i13 + size2 + list3.size();
        C2652bn[] bnVarArr = new C2652bn[size3];
        C2935d[] dVarArr = new C2935d[size3];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr5 = iArr[i20];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i22 = size2;
            int i23 = 0;
            while (i23 < length3) {
                arrayList3.addAll(((C2910a) list2.get(iArr5[i23])).f8308c);
                i23++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            C2680x[] xVarArr3 = new C2680x[size4];
            int i24 = 0;
            while (i24 < size4) {
                int i25 = size4;
                C2680x xVar = ((C2922m) arrayList3.get(i24)).f8366b;
                xVarArr3[i24] = xVar.mo6357b(kVar3.mo6610a(xVar));
                i24++;
                size4 = i25;
                arrayList3 = arrayList3;
            }
            C2910a aVar3 = (C2910a) list2.get(iArr5[0]);
            int i26 = aVar3.f8306a;
            if (i26 != -1) {
                str = Integer.toString(i26);
            } else {
                str = "unset:" + i20;
            }
            int i27 = i21 + 1;
            if (zArr2[i20]) {
                i3 = i27 + 1;
                list = list2;
            } else {
                list = list2;
                i3 = i27;
                i27 = -1;
            }
            if (xVarArr2[i20].length != 0) {
                int i28 = i3;
                i3++;
                i4 = i28;
            } else {
                i4 = -1;
            }
            bnVarArr[i21] = new C2652bn(str, xVarArr3);
            dVarArr[i21] = new C2935d(aVar3.f8307b, 0, iArr5, i21, i27, i4, -1);
            int i29 = -1;
            if (i27 != -1) {
                String concat = String.valueOf(str).concat(":emsg");
                C2679w wVar4 = new C2679w();
                wVar4.f7449a = concat;
                wVar4.f7459k = "application/x-emsg";
                zArr = zArr2;
                bnVarArr[i27] = new C2652bn(concat, new C2680x(wVar4));
                dVarArr[i27] = new C2935d(5, 1, iArr5, i21, -1, -1, -1);
                i29 = -1;
            } else {
                zArr = zArr2;
            }
            if (i4 != i29) {
                bnVarArr[i4] = new C2652bn(String.valueOf(str).concat(":cc"), xVarArr2[i20]);
                dVarArr[i4] = new C2935d(3, 1, iArr5, i21, -1, -1, -1);
            }
            i20++;
            size2 = i22;
            iArr = iArr6;
            list2 = list;
            kVar3 = kVar;
            i21 = i3;
            zArr2 = zArr;
        }
        int i30 = 0;
        while (i30 < list3.size()) {
            C2916g gVar3 = (C2916g) list3.get(i30);
            C2679w wVar5 = new C2679w();
            wVar5.f7449a = gVar3.mo6772a();
            wVar5.f7459k = "application/x-emsg";
            bnVarArr[i21] = new C2652bn(gVar3.mo6772a() + ":" + i30, new C2680x(wVar5));
            dVarArr[i21] = new C2935d(5, 2, new int[0], -1, -1, -1, i30);
            i30++;
            i21++;
        }
        Pair create = Pair.create(new C3107cr(bnVarArr), dVarArr);
        this.f8426p = (C3107cr) create.first;
        this.f8427q = (C2935d[]) create.second;
    }

    /* renamed from: q */
    private final int m8290q(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f8427q[i2].f8408e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f8427q[i5].f8406c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: r */
    private static C2915f m8291r(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            C2915f fVar = (C2915f) list.get(i);
            if (str.equals(fVar.f8343a)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: s */
    private static C2680x[] m8292s(C2915f fVar, Pattern pattern, C2680x xVar) {
        String str = fVar.f8344b;
        if (str == null) {
            return new C2680x[]{xVar};
        }
        String[] aq = C2612ak.m6967aq(str, ";");
        C2680x[] xVarArr = new C2680x[aq.length];
        for (int i = 0; i < aq.length; i++) {
            Matcher matcher = pattern.matcher(aq[i]);
            if (!matcher.matches()) {
                return new C2680x[]{xVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C2679w wVar = new C2679w(xVar);
            String str2 = xVar.f7485c;
            wVar.f7449a = str2 + ":" + parseInt;
            wVar.f7447C = parseInt;
            wVar.f7451c = matcher.group(2);
            xVarArr[i] = new C2680x(wVar);
        }
        return xVarArr;
    }

    /* renamed from: a */
    public final long mo6807a(long j, C2897cz czVar) {
        long j2 = j;
        for (C3054j jVar : this.f8416d) {
            if (jVar.f8861a == 2) {
                for (C2951t tVar : ((C2953v) jVar.f8865e).f8469g) {
                    if (tVar.f8458c != null) {
                        long f = tVar.mo6834f(j2);
                        long g = tVar.mo6835g(f);
                        long d = tVar.mo6832d();
                        return czVar.mo6705a(j, g, (g >= j2 || (d != -1 && f >= (tVar.mo6830b() + d) + -1)) ? g : tVar.mo6835g(f + 1));
                    }
                }
                return j2;
            }
        }
        return j2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6617b(C3097ch chVar) {
        throw null;
    }

    /* renamed from: c */
    public final long mo6808c() {
        return this.f8431u.mo6808c();
    }

    /* renamed from: d */
    public final long mo6809d() {
        return this.f8431u.mo6809d();
    }

    /* renamed from: e */
    public final long mo6810e() {
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public final long mo6811f(long j) {
        C3045a aVar;
        boolean z;
        long j2 = j;
        for (C3054j jVar : this.f8416d) {
            jVar.f8872l = j2;
            if (jVar.mo6994i()) {
                jVar.f8871k = j2;
            } else {
                int i = 0;
                while (true) {
                    if (i >= jVar.f8868h.size()) {
                        break;
                    }
                    aVar = (C3045a) jVar.f8868h.get(i);
                    long j3 = aVar.f8851q;
                    if (j3 == j2 && aVar.f8820a == -9223372036854775807L) {
                        break;
                    } else if (j3 > j2) {
                        break;
                    } else {
                        i++;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    z = jVar.f8869i.mo7069B(aVar.mo6979a(0));
                } else {
                    z = jVar.f8869i.mo7070C(j2, j2 < jVar.mo6809d());
                }
                if (z) {
                    C3094ce ceVar = jVar.f8869i;
                    jVar.f8873m = jVar.mo6991e(ceVar.f9043e + ceVar.f9044f, 0);
                    for (C3094ce C : jVar.f8870j) {
                        C.mo7070C(j2, true);
                    }
                } else {
                    jVar.f8871k = j2;
                    jVar.f8875o = false;
                    jVar.f8868h.clear();
                    jVar.f8873m = 0;
                    C3256v vVar = jVar.f8867g;
                    if (vVar.mo7253f()) {
                        jVar.f8869i.mo7081q();
                        for (C3094ce q : jVar.f8870j) {
                            q.mo7081q();
                        }
                        jVar.f8867g.mo7249b();
                    } else {
                        vVar.f9790f = null;
                        jVar.mo6993h();
                    }
                }
            }
        }
        for (C2954w d : this.f8417e) {
            d.mo6845d(j2);
        }
        return j2;
    }

    /* renamed from: fc */
    public final void mo6812fc(C3033ap apVar, long j) {
        this.f8415c = apVar;
        apVar.mo6620eY(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo6813g(androidx.media3.exoplayer.p150j.C3197ad[] r37, boolean[] r38, androidx.media3.exoplayer.p145h.C3095cf[] r39, boolean[] r40, long r41) {
        /*
            r36 = this;
            r13 = r36
            r0 = r37
            r14 = r39
            r11 = r41
            int r1 = r0.length
            int[] r15 = new int[r1]
            r16 = 0
            r1 = 0
        L_0x000e:
            int r2 = r0.length
            r10 = -1
            if (r1 >= r2) goto L_0x0028
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0023
            androidx.media3.exoplayer.h.cr r3 = r13.f8426p
            androidx.media3.common.bn r2 = r2.mo7035m()
            int r2 = r3.mo7096a(r2)
            r15[r1] = r2
            goto L_0x0025
        L_0x0023:
            r15[r1] = r10
        L_0x0025:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0028:
            r1 = 0
        L_0x0029:
            int r2 = r0.length
            r17 = 0
            if (r1 >= r2) goto L_0x0050
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0036
            boolean r2 = r38[r1]
            if (r2 != 0) goto L_0x004d
        L_0x0036:
            r2 = r14[r1]
            boolean r3 = r2 instanceof androidx.media3.exoplayer.p145h.p147b.C3054j
            if (r3 == 0) goto L_0x0042
            androidx.media3.exoplayer.h.b.j r2 = (androidx.media3.exoplayer.p145h.p147b.C3054j) r2
            r2.mo6992g(r13)
            goto L_0x004b
        L_0x0042:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.p145h.p147b.C3052h
            if (r3 == 0) goto L_0x004b
            androidx.media3.exoplayer.h.b.h r2 = (androidx.media3.exoplayer.p145h.p147b.C3052h) r2
            r2.mo6990d()
        L_0x004b:
            r14[r1] = r17
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0050:
            r1 = 0
        L_0x0051:
            int r2 = r0.length
            r8 = 1
            if (r1 >= r2) goto L_0x008c
            r2 = r14[r1]
            boolean r3 = r2 instanceof androidx.media3.exoplayer.p145h.C3023af
            if (r3 != 0) goto L_0x005f
            boolean r2 = r2 instanceof androidx.media3.exoplayer.p145h.p147b.C3052h
            if (r2 == 0) goto L_0x0089
        L_0x005f:
            int r2 = r13.m8290q(r1, r15)
            if (r2 != r10) goto L_0x006a
            r2 = r14[r1]
            boolean r8 = r2 instanceof androidx.media3.exoplayer.p145h.C3023af
            goto L_0x007a
        L_0x006a:
            r3 = r14[r1]
            boolean r4 = r3 instanceof androidx.media3.exoplayer.p145h.p147b.C3052h
            if (r4 == 0) goto L_0x0079
            androidx.media3.exoplayer.h.b.h r3 = (androidx.media3.exoplayer.p145h.p147b.C3052h) r3
            androidx.media3.exoplayer.h.b.j r3 = r3.f8856a
            r2 = r14[r2]
            if (r3 != r2) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r8 = 0
        L_0x007a:
            if (r8 != 0) goto L_0x0089
            r2 = r14[r1]
            boolean r3 = r2 instanceof androidx.media3.exoplayer.p145h.p147b.C3052h
            if (r3 == 0) goto L_0x0087
            androidx.media3.exoplayer.h.b.h r2 = (androidx.media3.exoplayer.p145h.p147b.C3052h) r2
            r2.mo6990d()
        L_0x0087:
            r14[r1] = r17
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x0051
        L_0x008c:
            r9 = 0
        L_0x008d:
            int r1 = r0.length
            if (r9 >= r1) goto L_0x01c7
            r1 = r0[r9]
            if (r1 != 0) goto L_0x009a
            r18 = r9
            r33 = r15
            goto L_0x01bb
        L_0x009a:
            r2 = r14[r9]
            if (r2 != 0) goto L_0x01ab
            r40[r9] = r8
            r2 = r15[r9]
            androidx.media3.exoplayer.dash.d[] r3 = r13.f8427q
            r2 = r3[r2]
            int r3 = r2.f8406c
            if (r3 != 0) goto L_0x0186
            int r3 = r2.f8409f
            if (r3 == r10) goto L_0x00b1
            r29 = 1
            goto L_0x00b3
        L_0x00b1:
            r29 = 0
        L_0x00b3:
            if (r29 == 0) goto L_0x00bd
            androidx.media3.exoplayer.h.cr r4 = r13.f8426p
            androidx.media3.common.bn r3 = r4.mo7097b(r3)
            r4 = 1
            goto L_0x00c0
        L_0x00bd:
            r3 = r17
            r4 = 0
        L_0x00c0:
            int r5 = r2.f8410g
            if (r5 == r10) goto L_0x00c6
            r6 = 1
            goto L_0x00c7
        L_0x00c6:
            r6 = 0
        L_0x00c7:
            if (r6 == 0) goto L_0x00d3
            androidx.media3.exoplayer.h.cr r7 = r13.f8426p
            androidx.media3.common.bn r5 = r7.mo7097b(r5)
            int r7 = r5.f7354a
            int r4 = r4 + r7
            goto L_0x00d5
        L_0x00d3:
            r5 = r17
        L_0x00d5:
            androidx.media3.common.x[] r7 = new androidx.media3.common.C2680x[r4]
            int[] r4 = new int[r4]
            if (r29 == 0) goto L_0x00e6
            androidx.media3.common.x[] r3 = r3.f7357d
            r3 = r3[r16]
            r7[r16] = r3
            r3 = 5
            r4[r16] = r3
            r3 = 1
            goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r6 == 0) goto L_0x0106
            r6 = 0
        L_0x00ef:
            int r8 = r5.f7354a
            if (r6 >= r8) goto L_0x0105
            androidx.media3.common.x[] r8 = r5.f7357d
            r8 = r8[r6]
            r7[r3] = r8
            r18 = 3
            r4[r3] = r18
            r10.add(r8)
            r8 = 1
            int r3 = r3 + r8
            int r6 = r6 + 1
            goto L_0x00ef
        L_0x0105:
            r8 = 1
        L_0x0106:
            androidx.media3.exoplayer.dash.a.c r3 = r13.f8418f
            boolean r3 = r3.f8319d
            if (r3 == 0) goto L_0x0119
            if (r29 == 0) goto L_0x0119
            androidx.media3.exoplayer.dash.z r3 = r13.f8414b
            androidx.media3.exoplayer.dash.y r5 = new androidx.media3.exoplayer.dash.y
            androidx.media3.exoplayer.k.g r6 = r3.f8498h
            r5.<init>(r3, r6)
            r6 = r5
            goto L_0x011b
        L_0x0119:
            r6 = r17
        L_0x011b:
            androidx.media3.exoplayer.dash.s r3 = r13.f8432v
            androidx.media3.exoplayer.k.w r5 = r13.f8425o
            androidx.media3.exoplayer.dash.a.c r8 = r13.f8418f
            r32 = r9
            androidx.media3.exoplayer.dash.b r9 = r13.f8423m
            int r11 = r13.f8419g
            int[] r12 = r2.f8404a
            r33 = r15
            int r15 = r2.f8405b
            r35 = r6
            r34 = r7
            long r6 = r13.f8424n
            androidx.media3.b.an r0 = r13.f8421k
            androidx.media3.b.h r3 = r3.f8455a
            androidx.media3.b.i r3 = r3.mo5878a()
            if (r0 == 0) goto L_0x0140
            r3.mo5884f(r0)
        L_0x0140:
            androidx.media3.exoplayer.dash.v r0 = new androidx.media3.exoplayer.dash.v
            r18 = r0
            r19 = r5
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r1
            r25 = r15
            r26 = r3
            r27 = r6
            r30 = r10
            r31 = r35
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
            androidx.media3.exoplayer.h.b.j r15 = new androidx.media3.exoplayer.h.b.j
            int r2 = r2.f8405b
            androidx.media3.exoplayer.k.g r7 = r13.f8434x
            androidx.media3.exoplayer.c.k r10 = r13.f8422l
            androidx.media3.exoplayer.c.e r11 = r13.f8430t
            androidx.media3.exoplayer.h.bc r12 = r13.f8429s
            r1 = r15
            r3 = r4
            r4 = r34
            r5 = r0
            r0 = r35
            r6 = r36
            r18 = r32
            r8 = r41
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            monitor-enter(r36)
            java.util.IdentityHashMap r1 = r13.f8428r     // Catch:{ all -> 0x0183 }
            r1.put(r15, r0)     // Catch:{ all -> 0x0183 }
            monitor-exit(r36)     // Catch:{ all -> 0x0183 }
            r14[r18] = r15
            goto L_0x01bb
        L_0x0183:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x0183 }
            throw r0
        L_0x0186:
            r18 = r9
            r33 = r15
            r0 = 2
            if (r3 != r0) goto L_0x01bb
            java.util.List r0 = r13.f8420h
            int r2 = r2.f8407d
            java.lang.Object r0 = r0.get(r2)
            androidx.media3.exoplayer.dash.a.g r0 = (androidx.media3.exoplayer.dash.p141a.C2916g) r0
            androidx.media3.common.bn r1 = r1.mo7035m()
            androidx.media3.common.x[] r1 = r1.f7357d
            r1 = r1[r16]
            androidx.media3.exoplayer.dash.w r2 = new androidx.media3.exoplayer.dash.w
            androidx.media3.exoplayer.dash.a.c r3 = r13.f8418f
            boolean r3 = r3.f8319d
            r2.<init>(r0, r1, r3)
            r14[r18] = r2
            goto L_0x01bb
        L_0x01ab:
            r18 = r9
            r33 = r15
            boolean r0 = r2 instanceof androidx.media3.exoplayer.p145h.p147b.C3054j
            if (r0 == 0) goto L_0x01bb
            androidx.media3.exoplayer.h.b.j r2 = (androidx.media3.exoplayer.p145h.p147b.C3054j) r2
            androidx.media3.exoplayer.h.b.k r0 = r2.f8865e
            androidx.media3.exoplayer.dash.v r0 = (androidx.media3.exoplayer.dash.C2953v) r0
            r0.f8470h = r1
        L_0x01bb:
            int r9 = r18 + 1
            r0 = r37
            r11 = r41
            r15 = r33
            r8 = 1
            r10 = -1
            goto L_0x008d
        L_0x01c7:
            r33 = r15
            r0 = r37
            r1 = 0
        L_0x01cc:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0243
            r2 = r14[r1]
            if (r2 != 0) goto L_0x0238
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0238
            r2 = r33[r1]
            androidx.media3.exoplayer.dash.d[] r3 = r13.f8427q
            r2 = r3[r2]
            int r3 = r2.f8406c
            r4 = 1
            if (r3 != r4) goto L_0x0233
            r3 = r33
            int r5 = r13.m8290q(r1, r3)
            r6 = -1
            if (r5 != r6) goto L_0x01f5
            androidx.media3.exoplayer.h.af r2 = new androidx.media3.exoplayer.h.af
            r2.<init>()
            r14[r1] = r2
            r8 = r41
            goto L_0x023e
        L_0x01f5:
            r5 = r14[r5]
            androidx.media3.exoplayer.h.b.j r5 = (androidx.media3.exoplayer.p145h.p147b.C3054j) r5
            int r2 = r2.f8405b
            r7 = 0
        L_0x01fc:
            androidx.media3.exoplayer.h.ce[] r8 = r5.f8870j
            int r8 = r8.length
            if (r7 >= r8) goto L_0x022d
            int[] r8 = r5.f8862b
            r8 = r8[r7]
            if (r8 != r2) goto L_0x0228
            boolean[] r2 = r5.f8864d
            boolean r2 = r2[r7]
            r2 = r2 ^ r4
            androidx.media3.common.p136b.C2601a.m6832d(r2)
            boolean[] r2 = r5.f8864d
            r2[r7] = r4
            androidx.media3.exoplayer.h.ce[] r2 = r5.f8870j
            r2 = r2[r7]
            r8 = r41
            r2.mo7070C(r8, r4)
            androidx.media3.exoplayer.h.b.h r2 = new androidx.media3.exoplayer.h.b.h
            androidx.media3.exoplayer.h.ce[] r10 = r5.f8870j
            r10 = r10[r7]
            r2.<init>(r5, r5, r10, r7)
            r14[r1] = r2
            goto L_0x023e
        L_0x0228:
            r8 = r41
            int r7 = r7 + 1
            goto L_0x01fc
        L_0x022d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0233:
            r8 = r41
            r3 = r33
            goto L_0x023d
        L_0x0238:
            r8 = r41
            r3 = r33
            r4 = 1
        L_0x023d:
            r6 = -1
        L_0x023e:
            int r1 = r1 + 1
            r33 = r3
            goto L_0x01cc
        L_0x0243:
            r8 = r41
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r14.length
            r3 = 0
        L_0x0251:
            if (r3 >= r2) goto L_0x026b
            r4 = r14[r3]
            boolean r5 = r4 instanceof androidx.media3.exoplayer.p145h.p147b.C3054j
            if (r5 == 0) goto L_0x025f
            androidx.media3.exoplayer.h.b.j r4 = (androidx.media3.exoplayer.p145h.p147b.C3054j) r4
            r0.add(r4)
            goto L_0x0268
        L_0x025f:
            boolean r5 = r4 instanceof androidx.media3.exoplayer.dash.C2954w
            if (r5 == 0) goto L_0x0268
            androidx.media3.exoplayer.dash.w r4 = (androidx.media3.exoplayer.dash.C2954w) r4
            r1.add(r4)
        L_0x0268:
            int r3 = r3 + 1
            goto L_0x0251
        L_0x026b:
            int r2 = r0.size()
            androidx.media3.exoplayer.h.b.j[] r2 = new androidx.media3.exoplayer.p145h.p147b.C3054j[r2]
            r13.f8416d = r2
            r0.toArray(r2)
            int r0 = r1.size()
            androidx.media3.exoplayer.dash.w[] r0 = new androidx.media3.exoplayer.dash.C2954w[r0]
            r13.f8417e = r0
            r1.toArray(r0)
            androidx.media3.exoplayer.h.b.j[] r0 = r13.f8416d
            androidx.media3.exoplayer.h.k r1 = new androidx.media3.exoplayer.h.k
            r1.<init>(r0)
            r13.f8431u = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.C2936e.mo6813g(androidx.media3.exoplayer.j.ad[], boolean[], androidx.media3.exoplayer.h.cf[], boolean[], long):long");
    }

    /* renamed from: h */
    public final C3107cr mo6814h() {
        return this.f8426p;
    }

    /* renamed from: i */
    public final void mo6815i(long j, boolean z) {
        for (C3054j jVar : this.f8416d) {
            if (!jVar.mo6994i()) {
                C3094ce ceVar = jVar.f8869i;
                int i = ceVar.f9043e;
                ceVar.mo7080p(j, z, true);
                C3094ce ceVar2 = jVar.f8869i;
                int i2 = ceVar2.f9043e;
                if (i2 > i) {
                    long l = ceVar2.mo7076l();
                    int i3 = 0;
                    while (true) {
                        C3094ce[] ceVarArr = jVar.f8870j;
                        if (i3 >= ceVarArr.length) {
                            break;
                        }
                        ceVarArr[i3].mo7080p(l, z, jVar.f8864d[i3]);
                        i3++;
                    }
                }
                int min = Math.min(jVar.mo6991e(i2, 0), jVar.f8873m);
                if (min > 0) {
                    C2612ak.m6942Y(jVar.f8868h, 0, min);
                    jVar.f8873m -= min;
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo6816j() {
        this.f8425o.mo6828a();
    }

    /* renamed from: k */
    public final synchronized void mo6817k(C3054j jVar) {
        C2956y yVar = (C2956y) this.f8428r.remove(jVar);
        if (yVar != null) {
            yVar.f8486a.mo7084u();
        }
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        this.f8431u.mo6818m(j);
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        return this.f8431u.mo6819n(j);
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f8431u.mo6820o();
    }

    /* renamed from: p */
    public final void mo6821p() {
        this.f8415c.mo6617b(this);
    }
}
