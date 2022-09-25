package com.google.android.apps.gsa.searchbox.p6960ui.p6961a;

import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.C88706g;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.searchbox.shared.p6959a.C88689a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6970ab.C89074d;
import com.google.android.apps.gsa.shared.p6990an.C89212c;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41675ao;
import com.google.android.libraries.searchbox.shared.suggestion.C41689o;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ang;
import com.google.common.p4552o.anh;
import com.google.common.p4552o.ani;
import com.google.common.p4552o.anj;
import com.google.common.p4552o.anu;
import com.google.common.p4552o.anv;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.aoi;
import com.google.common.p4552o.aoj;
import com.google.common.p4552o.aor;
import com.google.common.p4552o.aos;
import com.google.common.p4552o.aou;
import com.google.common.p4552o.aov;
import com.google.p395al.p417d.p418a.C8592s;
import com.google.p4017at.p4060h.p4073d.p4074a.C54213ab;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54250n;
import com.google.p4440ca.p4441a.C57922b;
import com.google.p4440ca.p4441a.C57924d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protos.p4932ax.p4933a.C64262b;
import com.google.protos.p4932ax.p4933a.C64264d;
import com.google.protos.p4932ax.p4933a.C64269i;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.a.g */
/* compiled from: PG */
public final class C88698g implements C89200e, C89203h, C89204i, C89199d {

    /* renamed from: a */
    public static final C59071e f239814a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.a.g");

    /* renamed from: b */
    public C89205j f239815b;

    /* renamed from: c */
    private final C21370a f239816c;

    /* renamed from: d */
    private C88706g f239817d;

    /* renamed from: e */
    private List f239818e;

    /* renamed from: f */
    private C88760ae f239819f;

    /* renamed from: g */
    private int f239820g;

    /* renamed from: h */
    private boolean f239821h;

    /* renamed from: i */
    private boolean f239822i;

    /* renamed from: j */
    private boolean f239823j;

    public C88698g(C21370a aVar) {
        this.f239816c = aVar;
    }

    /* renamed from: B */
    static final void m143543B(C64262b bVar, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str2.getClass();
            bVar.copyOnWrite();
            C64264d dVar = (C64264d) bVar.instance;
            C64264d dVar2 = C64264d.f173749f;
            C62995dn dnVar = dVar.f173755e;
            if (!dnVar.f170058b) {
                dVar.f173755e = dnVar.mo58980a();
            }
            dVar.f173755e.put(str, str2);
        }
    }

    /* renamed from: C */
    private static int m143544C(long j, long j2) {
        return (int) Math.max(j - j2, 0);
    }

    /* renamed from: D */
    private static aov m143545D(Suggestion suggestion, int i, boolean z, List list) {
        anj anj = null;
        if (suggestion == null) {
            return null;
        }
        int a = aou.m92448a(suggestion.f108909j);
        aos aos = (aos) aov.f159510u.createBuilder();
        aos.copyOnWrite();
        aov aov = (aov) aos.instance;
        aov.f159512a |= 1;
        aov.f159513b = i;
        aos.copyOnWrite();
        aov aov2 = (aov) aos.instance;
        int i2 = a - 1;
        if (a != 0) {
            aov2.f159517f = i2;
            aov2.f159512a |= 8;
            int i3 = suggestion.f108917r;
            aos.copyOnWrite();
            aov aov3 = (aov) aos.instance;
            aov3.f159512a |= 4;
            aov3.f159516e = i3;
            int i4 = suggestion.f108910k;
            aos.copyOnWrite();
            aov aov4 = (aov) aos.instance;
            aov4.f159512a |= 2;
            aov4.f159514c = i4;
            String str = suggestion.f108918s;
            if (!str.isEmpty()) {
                aos.copyOnWrite();
                aov aov5 = (aov) aos.instance;
                str.getClass();
                aov5.f159512a |= 2048;
                aov5.f159525n = str;
            }
            int i5 = suggestion.f108920u;
            if (i5 > 0) {
                aos.copyOnWrite();
                aov aov6 = (aov) aos.instance;
                aov6.f159512a |= C89885b.S3REQUEST_VALUE;
                aov6.f159530s = i5;
            }
            C58485gu guVar = suggestion.f108921v;
            if (!guVar.isEmpty()) {
                aos.copyOnWrite();
                aov aov7 = (aov) aos.instance;
                C62971cq cqVar = aov7.f159519h;
                if (!cqVar.mo58948c()) {
                    aov7.f159519h = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) guVar, (List) aov7.f159519h);
                int a2 = aor.m92446a(suggestion.f108922w);
                aos.copyOnWrite();
                aov aov8 = (aov) aos.instance;
                int i6 = a2 - 1;
                if (a2 != 0) {
                    aov8.f159520i = i6;
                    aov8.f159512a |= 64;
                } else {
                    throw null;
                }
            }
            if (suggestion.f108925z.contains(Integer.valueOf(C64369b.SUBTYPE_PIXEL_APPS.f174585kE))) {
                C41693s sVar = suggestion.f108907B.f109009c;
                if (sVar == null) {
                    sVar = C41693s.f109053h;
                }
                String str2 = sVar.f109059e;
                anu anu = (anu) anv.f159412c.createBuilder();
                anu.copyOnWrite();
                anv anv = (anv) anu.instance;
                str2.getClass();
                anv.f159414a |= 1;
                anv.f159415b = str2;
                aos.copyOnWrite();
                aov aov9 = (aov) aos.instance;
                anv anv2 = (anv) anu.build();
                anv2.getClass();
                aov9.f159531t = anv2;
                aov9.f159512a |= C89885b.HTTP_VALUE;
            }
            HashSet hashSet = new HashSet(suggestion.f108925z);
            if (z) {
                if (list != null && !list.isEmpty()) {
                    hashSet.addAll(list);
                }
            } else if (C89235z.m145125E(suggestion)) {
                C54228aq aqVar = suggestion.f108906A;
                aqVar.getClass();
                C54216ae aeVar = aqVar.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                for (C64269i iVar : aeVar.f142288B) {
                    for (C64369b bVar : new C62963cj(iVar.f173769e, C64269i.f173762f)) {
                        hashSet.add(Integer.valueOf(bVar.f174585kE));
                    }
                }
            }
            aoi aoi = suggestion.f108924y;
            aos.copyOnWrite();
            aov aov10 = (aov) aos.instance;
            aoj aoj = (aoj) aoi.build();
            aoj.getClass();
            aov10.f159522k = aoj;
            aov10.f159512a |= 256;
            aos.mo57029a((Iterable) Collection.EL.stream(hashSet).sorted().collect(Collectors.toCollection(C88696e.f239812a)));
            if (suggestion.mo44265s()) {
                C54228aq aqVar2 = suggestion.f108906A;
                if (!(aqVar2 == null || (aqVar2.f142330a & 8) == 0)) {
                    C54213ab abVar = aqVar2.f142335g;
                    if (abVar == null) {
                        abVar = C54213ab.f142280c;
                    }
                    if ((abVar.f142282a & 32) != 0) {
                        int i7 = abVar.f142283b;
                        aos.copyOnWrite();
                        aov aov11 = (aov) aos.instance;
                        aov11.f159512a |= 8192;
                        aov11.f159526o = i7;
                    }
                }
                if (!(aqVar2 == null || (aqVar2.f142330a & 4) == 0)) {
                    C54216ae aeVar2 = aqVar2.f142334f;
                    if (aeVar2 == null) {
                        aeVar2 = C54216ae.f142285C;
                    }
                    if ((aeVar2.f142290a & C89885b.S3REQUEST_VALUE) != 0) {
                        int i8 = aeVar2.f142305p;
                        aos.copyOnWrite();
                        aov aov12 = (aov) aos.instance;
                        aov12.f159512a |= 512;
                        aov12.f159523l = i8;
                    }
                    if ((aeVar2.f142290a & C89885b.HTTP_VALUE) != 0) {
                        int i9 = aeVar2.f142306q;
                        aos.copyOnWrite();
                        aov aov13 = (aov) aos.instance;
                        aov13.f159512a |= 1024;
                        aov13.f159524m = i9;
                    }
                }
                if (!(aqVar2 == null || (aqVar2.f142330a & 32) == 0)) {
                    C54250n nVar = aqVar2.f142337i;
                    if (nVar == null) {
                        nVar = C54250n.f142445d;
                    }
                    if ((nVar.f142447a & 2) != 0) {
                        String str3 = nVar.f142449c;
                        aos.copyOnWrite();
                        aov aov14 = (aov) aos.instance;
                        str3.getClass();
                        aov14.f159512a |= 32768;
                        aov14.f159528q = str3;
                    }
                    if ((nVar.f142447a & 1) != 0) {
                        String str4 = nVar.f142448b;
                        aos.copyOnWrite();
                        aov aov15 = (aov) aos.instance;
                        str4.getClass();
                        aov15.f159512a |= 65536;
                        aov15.f159529r = str4;
                    }
                }
            }
            if (a == 4) {
                ang ang = (ang) anh.f159362e.createBuilder();
                String I = C41675ao.m73089I(suggestion);
                if (!TextUtils.isEmpty(I)) {
                    ang.copyOnWrite();
                    anh anh = (anh) ang.instance;
                    I.getClass();
                    anh.f159364a |= 1;
                    anh.f159365b = I;
                }
                String k = C89235z.m145139k(suggestion);
                if (!TextUtils.isEmpty(k)) {
                    ang.copyOnWrite();
                    anh anh2 = (anh) ang.instance;
                    k.getClass();
                    anh2.f159364a |= 2;
                    anh2.f159366c = k;
                }
                String l = C89235z.m145140l(suggestion);
                if (!TextUtils.isEmpty(l)) {
                    ang.copyOnWrite();
                    anh anh3 = (anh) ang.instance;
                    l.getClass();
                    anh3.f159364a |= 4;
                    anh3.f159367d = l;
                }
                aos.copyOnWrite();
                aov aov16 = (aov) aos.instance;
                anh anh4 = (anh) ang.build();
                anh4.getClass();
                aov16.f159527p = anh4;
                aov16.f159512a |= 16384;
            }
            C41689o oVar = suggestion.f108907B.f109010d;
            if (oVar == null) {
                oVar = C41689o.f109041e;
            }
            byte[] N = oVar.f109046d.mo59174N();
            if (N.length != 0) {
                try {
                    C89074d dVar = (C89074d) C62942bv.parseFrom((C62942bv) C89074d.f241391g, N, C62921ba.m95368a());
                    ani ani = (ani) anj.f159368g.createBuilder();
                    if ((dVar.f241393a & 4096) != 0) {
                        int i10 = dVar.f241398f;
                        ani.copyOnWrite();
                        anj anj2 = (anj) ani.instance;
                        anj2.f159370a |= 4;
                        anj2.f159373d = i10;
                    }
                    if ((dVar.f241393a & 2048) != 0) {
                        int i11 = dVar.f241397e;
                        ani.copyOnWrite();
                        anj anj3 = (anj) ani.instance;
                        anj3.f159370a |= 2;
                        anj3.f159372c = i11;
                    }
                    if ((dVar.f241393a & 512) != 0) {
                        int i12 = dVar.f241395c;
                        ani.copyOnWrite();
                        anj anj4 = (anj) ani.instance;
                        anj4.f159370a |= 8;
                        anj4.f159374e = i12;
                    }
                    if ((dVar.f241393a & 1024) != 0) {
                        int i13 = dVar.f241396d;
                        ani.copyOnWrite();
                        anj anj5 = (anj) ani.instance;
                        anj5.f159370a |= 16;
                        anj5.f159375f = i13;
                    }
                    if ((dVar.f241393a & 4) != 0) {
                        double d = dVar.f241394b;
                        ani.copyOnWrite();
                        anj anj6 = (anj) ani.instance;
                        anj6.f159370a |= 1;
                        anj6.f159371b = d;
                    }
                    anj = (anj) ani.build();
                } catch (C62974ct e) {
                    C59104x c = f239814a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "sb.u.Logging");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(9978)).mo56386p("Failed to parse Icing ResultDebugInfo from suggestion parameters");
                }
            }
            if (anj != null) {
                aos.copyOnWrite();
                aov aov17 = (aov) aos.instance;
                aov17.f159521j = anj;
                aov17.f159512a |= 128;
            }
            return (aov) aos.build();
        }
        throw null;
    }

    /* renamed from: E */
    private static Set m143546E(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Suggestion suggestion = (Suggestion) it.next();
            if (suggestion.mo44270w()) {
                StringBuilder sb = new StringBuilder();
                sb.append(suggestion.f108910k);
                HashSet hashSet2 = new HashSet(suggestion.f108925z);
                if (C89235z.m145125E(suggestion)) {
                    C54228aq aqVar = suggestion.f108906A;
                    aqVar.getClass();
                    C54216ae aeVar = aqVar.f142334f;
                    if (aeVar == null) {
                        aeVar = C54216ae.f142285C;
                    }
                    for (C64269i iVar : aeVar.f142288B) {
                        for (C64369b bVar : new C62963cj(iVar.f173769e, C64269i.f173762f)) {
                            hashSet2.add(Integer.valueOf(bVar.f174585kE));
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) Collection.EL.stream(hashSet2).sorted().collect(Collectors.toCollection(C88696e.f239812a));
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    int intValue = ((Integer) arrayList.get(i)).intValue();
                    sb.append(",");
                    sb.append(intValue);
                }
                sb.append(",");
                sb.append(suggestion.f108909j);
                hashSet.add(sb.toString());
            }
        }
        return hashSet;
    }

    /* renamed from: F */
    private static void m143547F(Serializable serializable, Deque deque) {
        if (serializable instanceof ArrayDeque) {
            Iterator it = ((ArrayDeque) serializable).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    deque.addLast(String.valueOf(next));
                }
            }
        }
    }

    /* renamed from: A */
    public final synchronized void mo82397A() {
        this.f239815b.mo83173m("LAST_QUERY_BUILD_TIME", this.f239816c.mo26871c());
    }

    /* renamed from: c */
    public final synchronized long mo82398c() {
        return this.f239815b.mo83162b("SESSION_START_TIME");
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        this.f239817d = pVar.f239940l;
        this.f239818e = pVar.f239929a;
        this.f239819f = pVar.f239943o;
    }

    /* renamed from: e */
    public final void mo78004e() {
        if (!this.f239815b.mo83177q("SESSION_NUMBER")) {
            mo78006hE();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:90|91|200) */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r5 = f239814a.mo56226d();
        r5.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "sb.u.Logging");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(9982)).mo56389s("Failed to add to previous suggestions: %s", r10);
        r5 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x03a1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.p4552o.apd mo82399f() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            com.google.common.o.apd r2 = com.google.common.p4552o.apd.f159555aA     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x06dc }
            com.google.common.o.amt r2 = (com.google.common.p4552o.amt) r2     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.searchbox.ui.g r3 = r1.f239817d     // Catch:{ all -> 0x06dc }
            java.lang.CharSequence r3 = r3.mo82429a()     // Catch:{ all -> 0x06dc }
            if (r3 == 0) goto L_0x002c
            int r3 = r3.length()     // Catch:{ all -> 0x06dc }
            java.lang.String r4 = "#"
            java.lang.String r3 = com.google.common.base.C58880cq.m90966b(r4, r3)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x06dc }
            int r5 = r4.f159583a     // Catch:{ all -> 0x06dc }
            r5 = r5 | 256(0x100, float:3.59E-43)
            r4.f159583a = r5     // Catch:{ all -> 0x06dc }
            r4.f159617i = r3     // Catch:{ all -> 0x06dc }
        L_0x002c:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r4 = "INPUT_METHODS"
            java.util.ArrayList r3 = r3.mo83167g(r4)     // Catch:{ all -> 0x06dc }
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0081
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x06dc }
            if (r6 == 0) goto L_0x003f
            goto L_0x0081
        L_0x003f:
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            com.google.protobuf.ch r7 = com.google.common.p4552o.apd.emptyIntList()     // Catch:{ all -> 0x06dc }
            r6.f159615g = r7     // Catch:{ all -> 0x06dc }
            int r6 = r3.size()     // Catch:{ all -> 0x06dc }
            r7 = 0
        L_0x0051:
            if (r7 >= r6) goto L_0x0081
            java.lang.Object r8 = r3.get(r7)     // Catch:{ all -> 0x06dc }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x06dc }
            int r8 = r8.intValue()     // Catch:{ all -> 0x06dc }
            int r8 = com.google.common.p4552o.anl.m92441a(r8)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r9 = (com.google.common.p4552o.apd) r9     // Catch:{ all -> 0x06dc }
            if (r8 == 0) goto L_0x0080
            com.google.protobuf.ch r10 = r9.f159615g     // Catch:{ all -> 0x06dc }
            boolean r11 = r10.mo58948c()     // Catch:{ all -> 0x06dc }
            if (r11 != 0) goto L_0x0078
            com.google.protobuf.ch r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r10)     // Catch:{ all -> 0x06dc }
            r9.f159615g = r10     // Catch:{ all -> 0x06dc }
        L_0x0078:
            com.google.protobuf.ch r9 = r9.f159615g     // Catch:{ all -> 0x06dc }
            r9.mo58916g(r8)     // Catch:{ all -> 0x06dc }
            int r7 = r7 + 1
            goto L_0x0051
        L_0x0080:
            throw r4     // Catch:{ all -> 0x06dc }
        L_0x0081:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "SELECTED_SUGGESTION"
            android.os.Parcelable r3 = r3.mo83164d(r6)     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r3 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r6 = r1.f239819f     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.response.Response r6 = r6.mo82489k()     // Catch:{ all -> 0x06dc }
            r7 = -1
            r8 = 1
            if (r6 != 0) goto L_0x0097
            r12 = -1
            goto L_0x0106
        L_0x0097:
            java.lang.String r9 = r6.f108861a     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r10 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r10 = (com.google.common.p4552o.apd) r10     // Catch:{ all -> 0x06dc }
            r9.getClass()     // Catch:{ all -> 0x06dc }
            int r11 = r10.f159583a     // Catch:{ all -> 0x06dc }
            r11 = r11 | 2048(0x800, float:2.87E-42)
            r10.f159583a = r11     // Catch:{ all -> 0x06dc }
            r10.f159618j = r9     // Catch:{ all -> 0x06dc }
            com.google.common.b.gu r6 = r6.f108862b     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r9 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "SELECTED_SUGGESTION"
            android.os.Parcelable r9 = r9.mo83164d(r10)     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r9 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r9     // Catch:{ all -> 0x06dc }
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x00ba:
            int r13 = r6.size()     // Catch:{ all -> 0x06dc }
            if (r10 >= r13) goto L_0x00d8
            java.lang.Object r13 = r6.get(r10)     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r13 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r13     // Catch:{ all -> 0x06dc }
            boolean r14 = r13.mo44270w()     // Catch:{ all -> 0x06dc }
            if (r14 == 0) goto L_0x00d5
            boolean r13 = r13.equals(r9)     // Catch:{ all -> 0x06dc }
            if (r8 != r13) goto L_0x00d3
            r12 = r11
        L_0x00d3:
            int r11 = r11 + 1
        L_0x00d5:
            int r10 = r10 + 1
            goto L_0x00ba
        L_0x00d8:
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r9 = (com.google.common.p4552o.apd) r9     // Catch:{ all -> 0x06dc }
            com.google.protobuf.cq r10 = com.google.common.p4552o.apd.emptyProtobufList()     // Catch:{ all -> 0x06dc }
            r9.f159620l = r10     // Catch:{ all -> 0x06dc }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x06dc }
            r9 = 0
        L_0x00ea:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x06dc }
            if (r10 == 0) goto L_0x0106
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r10 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r10     // Catch:{ all -> 0x06dc }
            boolean r11 = r10.mo44270w()     // Catch:{ all -> 0x06dc }
            if (r11 == 0) goto L_0x00ea
            com.google.common.o.aov r10 = m143545D(r10, r9, r5, r4)     // Catch:{ all -> 0x06dc }
            r2.mo57026b(r10)     // Catch:{ all -> 0x06dc }
            int r9 = r9 + 1
            goto L_0x00ea
        L_0x0106:
            com.google.android.apps.gsa.shared.an.a.j r6 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r9 = "SELECTED_ENHANCEMENT_SUBTYPES"
            java.util.ArrayList r6 = r6.mo83167g(r9)     // Catch:{ all -> 0x06dc }
            if (r12 == r7) goto L_0x0154
            com.google.common.o.aov r3 = m143545D(r3, r12, r8, r6)     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bn r3 = r3.toBuilder()     // Catch:{ all -> 0x06dc }
            com.google.common.o.aos r3 = (com.google.common.p4552o.aos) r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r9 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "ACTION_CLICKED_INDEX"
            int r9 = r9.mo83161a(r10)     // Catch:{ all -> 0x06dc }
            if (r9 < 0) goto L_0x013b
            com.google.android.apps.gsa.shared.an.a.j r9 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "ACTION_CLICKED_INDEX"
            int r9 = r9.mo83161a(r10)     // Catch:{ all -> 0x06dc }
            r3.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r10 = r3.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.aov r10 = (com.google.common.p4552o.aov) r10     // Catch:{ all -> 0x06dc }
            int r11 = r10.f159512a     // Catch:{ all -> 0x06dc }
            r11 = r11 | 32
            r10.f159512a = r11     // Catch:{ all -> 0x06dc }
            r10.f159518g = r9     // Catch:{ all -> 0x06dc }
        L_0x013b:
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r9 = (com.google.common.p4552o.apd) r9     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x06dc }
            com.google.common.o.aov r3 = (com.google.common.p4552o.aov) r3     // Catch:{ all -> 0x06dc }
            r3.getClass()     // Catch:{ all -> 0x06dc }
            r9.f159619k = r3     // Catch:{ all -> 0x06dc }
            int r3 = r9.f159583a     // Catch:{ all -> 0x06dc }
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r9.f159583a = r3     // Catch:{ all -> 0x06dc }
            goto L_0x0158
        L_0x0154:
            if (r3 == 0) goto L_0x0158
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x06dc }
        L_0x0158:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r9 = "NUMBER_OF_SUGGEST_EXPERIMENT_TRIGGERED"
            int r3 = r3.mo83161a(r9)     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r9 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "IS_SUGGEST_EXPERIMENT_TRIGGERED_IN_RENDERED_RESPONSE"
            boolean r9 = r9.mo83178r(r10)     // Catch:{ all -> 0x06dc }
            com.google.common.o.anb r10 = com.google.common.p4552o.anb.f159266c     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x06dc }
            com.google.common.o.ana r10 = (com.google.common.p4552o.ana) r10     // Catch:{ all -> 0x06dc }
            r11 = 2
            if (r9 == 0) goto L_0x0179
            if (r3 <= r8) goto L_0x0177
            r3 = 3
            goto L_0x017e
        L_0x0177:
            r3 = 1
            goto L_0x017e
        L_0x0179:
            if (r3 <= 0) goto L_0x017d
            r3 = 2
            goto L_0x017e
        L_0x017d:
            r3 = 0
        L_0x017e:
            r10.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r9 = r10.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.anb r9 = (com.google.common.p4552o.anb) r9     // Catch:{ all -> 0x06dc }
            int r12 = r9.f159268a     // Catch:{ all -> 0x06dc }
            r12 = r12 | 4
            r9.f159268a = r12     // Catch:{ all -> 0x06dc }
            r9.f159269b = r3     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r9 = r10.build()     // Catch:{ all -> 0x06dc }
            com.google.common.o.anb r9 = (com.google.common.p4552o.anb) r9     // Catch:{ all -> 0x06dc }
            r9.getClass()     // Catch:{ all -> 0x06dc }
            r3.f159616h = r9     // Catch:{ all -> 0x06dc }
            int r9 = r3.f159583a     // Catch:{ all -> 0x06dc }
            r9 = r9 | 128(0x80, float:1.794E-43)
            r3.f159583a = r9     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r9 = "SEARCH_METHOD"
            int r3 = r3.mo83161a(r9)     // Catch:{ all -> 0x06dc }
            if (r3 == 0) goto L_0x01d0
            com.google.common.o.aod r3 = com.google.common.p4552o.aod.m92443a(r3)     // Catch:{ all -> 0x06dc }
            if (r6 == 0) goto L_0x01bd
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x06dc }
            if (r6 != 0) goto L_0x01bd
            com.google.common.o.aod r3 = com.google.common.p4552o.aod.ENHANCEMENT     // Catch:{ all -> 0x06dc }
        L_0x01bd:
            if (r3 == 0) goto L_0x01d0
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r3 = r3.f159471J     // Catch:{ all -> 0x06dc }
            r6.f159614f = r3     // Catch:{ all -> 0x06dc }
            int r3 = r6.f159583a     // Catch:{ all -> 0x06dc }
            r3 = r3 | 64
            r6.f159583a = r3     // Catch:{ all -> 0x06dc }
        L_0x01d0:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "SESSION_START_TIME"
            long r9 = r3.mo83162b(r6)     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "FIRST_EDIT_TIME"
            long r12 = r3.mo83162b(r6)     // Catch:{ all -> 0x06dc }
            int r3 = m143544C(r12, r9)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r12 = r6.f159583a     // Catch:{ all -> 0x06dc }
            r13 = 33554432(0x2000000, float:9.403955E-38)
            r12 = r12 | r13
            r6.f159583a = r12     // Catch:{ all -> 0x06dc }
            r6.f159632x = r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "LAST_EDIT_TIME"
            long r12 = r3.mo83162b(r6)     // Catch:{ all -> 0x06dc }
            int r3 = m143544C(r12, r9)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r12 = r6.f159583a     // Catch:{ all -> 0x06dc }
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            r12 = r12 | r13
            r6.f159583a = r12     // Catch:{ all -> 0x06dc }
            r6.f159633y = r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "LAST_QUERY_BUILD_TIME"
            long r12 = r3.mo83162b(r6)     // Catch:{ all -> 0x06dc }
            int r3 = m143544C(r12, r9)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r12 = r6.f159583a     // Catch:{ all -> 0x06dc }
            r13 = 134217728(0x8000000, float:3.85186E-34)
            r12 = r12 | r13
            r6.f159583a = r12     // Catch:{ all -> 0x06dc }
            r6.f159634z = r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "RENDERED_RESPONSE_COUNT"
            int r3 = r3.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r12 = r6.f159610b     // Catch:{ all -> 0x06dc }
            r12 = r12 | 2048(0x800, float:2.87E-42)
            r6.f159610b = r12     // Catch:{ all -> 0x06dc }
            r6.f159570N = r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "NUMBER_OF_ZERO_PREFIX_SUGGESTIONS_SHOWN"
            int r3 = r3.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r12 = r6.f159583a     // Catch:{ all -> 0x06dc }
            r13 = 32768(0x8000, float:4.5918E-41)
            r12 = r12 | r13
            r6.f159583a = r12     // Catch:{ all -> 0x06dc }
            r6.f159625q = r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "TOTAL_RENDERED_RESPONSE_TIME"
            long r12 = r3.mo83162b(r6)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x06dc }
            int r6 = r3.f159610b     // Catch:{ all -> 0x06dc }
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r3.f159610b = r6     // Catch:{ all -> 0x06dc }
            int r6 = (int) r12     // Catch:{ all -> 0x06dc }
            r3.f159573Q = r6     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "OUT_OF_SYNC_RESPONSE_COUNT"
            int r3 = r3.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r12 = r6.f159610b     // Catch:{ all -> 0x06dc }
            r12 = r12 | 32
            r6.f159610b = r12     // Catch:{ all -> 0x06dc }
            r6.f159564H = r3     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.f.a r3 = r1.f239816c     // Catch:{ all -> 0x06dc }
            long r12 = r3.mo26871c()     // Catch:{ all -> 0x06dc }
            int r3 = m143544C(r12, r9)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r9 = r6.f159583a     // Catch:{ all -> 0x06dc }
            r10 = 16777216(0x1000000, float:2.3509887E-38)
            r9 = r9 | r10
            r6.f159583a = r9     // Catch:{ all -> 0x06dc }
            r6.f159631w = r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "SESSION_NUMBER"
            int r3 = r3.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r9 = r6.f159583a     // Catch:{ all -> 0x06dc }
            r10 = 8388608(0x800000, float:1.17549435E-38)
            r9 = r9 | r10
            r6.f159583a = r9     // Catch:{ all -> 0x06dc }
            r6.f159630v = r3     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "SRP_ON_FOCUS_SUGGESTION_COUNT"
            int r3 = r3.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            if (r3 <= 0) goto L_0x02df
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "SRP_ON_FOCUS_SUGGESTION_COUNT"
            int r3 = r3.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            int r9 = r6.f159583a     // Catch:{ all -> 0x06dc }
            r10 = 65536(0x10000, float:9.18355E-41)
            r9 = r9 | r10
            r6.f159583a = r9     // Catch:{ all -> 0x06dc }
            r6.f159626r = r3     // Catch:{ all -> 0x06dc }
        L_0x02df:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.util.ArrayList r3 = r3.mo83181u()     // Catch:{ all -> 0x06dc }
            if (r3 == 0) goto L_0x03bd
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x06dc }
            if (r6 == 0) goto L_0x02ef
            goto L_0x03bd
        L_0x02ef:
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r6 = r1.f239819f     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.response.Response r6 = r6.mo82489k()     // Catch:{ all -> 0x06dc }
            if (r6 == 0) goto L_0x030e
            com.google.common.b.gu r9 = r6.f108862b     // Catch:{ all -> 0x06dc }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x06dc }
            if (r9 != 0) goto L_0x030e
            com.google.common.b.gu r6 = r6.f108862b     // Catch:{ all -> 0x06dc }
            java.util.Set r6 = m143546E(r6)     // Catch:{ all -> 0x06dc }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x06dc }
            r9.<init>(r3)     // Catch:{ all -> 0x06dc }
            r9.removeAll(r6)     // Catch:{ all -> 0x06dc }
            r3 = r9
        L_0x030e:
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x06dc }
            com.google.protobuf.cq r9 = com.google.common.p4552o.apd.emptyProtobufList()     // Catch:{ all -> 0x06dc }
            r6.f159622n = r9     // Catch:{ all -> 0x06dc }
            int r6 = r3.size()     // Catch:{ all -> 0x06dc }
            r9 = 0
        L_0x0320:
            if (r9 >= r6) goto L_0x03bd
            java.lang.Object r10 = r3.get(r9)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x06dc }
            java.lang.String r12 = ","
            java.lang.String[] r12 = r10.split(r12)     // Catch:{ all -> 0x06dc }
            int r13 = r12.length     // Catch:{ all -> 0x06dc }
            if (r13 <= r8) goto L_0x03b7
            r14 = r12[r5]     // Catch:{ NumberFormatException -> 0x03a1 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x03a1 }
            int r13 = r13 + -2
            int[] r13 = new int[r13]     // Catch:{ NumberFormatException -> 0x03a1 }
            r15 = 1
        L_0x033c:
            int r5 = r12.length     // Catch:{ NumberFormatException -> 0x03a1 }
            int r5 = r5 + r7
            if (r15 >= r5) goto L_0x034d
            int r5 = r15 + -1
            r16 = r12[r15]     // Catch:{ NumberFormatException -> 0x03a1 }
            int r16 = java.lang.Integer.parseInt(r16)     // Catch:{ NumberFormatException -> 0x03a1 }
            r13[r5] = r16     // Catch:{ NumberFormatException -> 0x03a1 }
            int r15 = r15 + 1
            goto L_0x033c
        L_0x034d:
            r5 = r12[r5]     // Catch:{ NumberFormatException -> 0x03a1 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.common.o.aov r12 = com.google.common.p4552o.aov.f159510u     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.common.o.aos r12 = (com.google.common.p4552o.aos) r12     // Catch:{ NumberFormatException -> 0x03a1 }
            r12.copyOnWrite()     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.protobuf.bv r15 = r12.instance     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.common.o.aov r15 = (com.google.common.p4552o.aov) r15     // Catch:{ NumberFormatException -> 0x03a1 }
            int r7 = r15.f159512a     // Catch:{ NumberFormatException -> 0x03a1 }
            r7 = r7 | r11
            r15.f159512a = r7     // Catch:{ NumberFormatException -> 0x03a1 }
            r15.f159514c = r14     // Catch:{ NumberFormatException -> 0x03a1 }
            java.util.List r7 = com.google.common.p4575r.C60757n.m92749j(r13)     // Catch:{ NumberFormatException -> 0x03a1 }
            r12.mo57029a(r7)     // Catch:{ NumberFormatException -> 0x03a1 }
            int r5 = com.google.common.p4552o.aou.m92448a(r5)     // Catch:{ NumberFormatException -> 0x03a1 }
            r12.copyOnWrite()     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.protobuf.bv r7 = r12.instance     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.common.o.aov r7 = (com.google.common.p4552o.aov) r7     // Catch:{ NumberFormatException -> 0x03a1 }
            int r13 = r5 + -1
            if (r5 == 0) goto L_0x03a0
            r7.f159517f = r13     // Catch:{ NumberFormatException -> 0x03a1 }
            int r5 = r7.f159512a     // Catch:{ NumberFormatException -> 0x03a1 }
            r5 = r5 | 8
            r7.f159512a = r5     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.protobuf.bv r5 = r12.build()     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.common.o.aov r5 = (com.google.common.p4552o.aov) r5     // Catch:{ NumberFormatException -> 0x03a1 }
            r2.copyOnWrite()     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.common.o.apd r7 = (com.google.common.p4552o.apd) r7     // Catch:{ NumberFormatException -> 0x03a1 }
            r5.getClass()     // Catch:{ NumberFormatException -> 0x03a1 }
            r7.mo57032b()     // Catch:{ NumberFormatException -> 0x03a1 }
            com.google.protobuf.cq r7 = r7.f159622n     // Catch:{ NumberFormatException -> 0x03a1 }
            r7.add(r5)     // Catch:{ NumberFormatException -> 0x03a1 }
            goto L_0x03b7
        L_0x03a0:
            throw r4     // Catch:{ NumberFormatException -> 0x03a1 }
        L_0x03a1:
            com.google.common.f.e r5 = f239814a     // Catch:{ all -> 0x06dc }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x06dc }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x06dc }
            java.lang.String r12 = "sb.u.Logging"
            r5.mo56378ag(r7, r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r7 = "Failed to add to previous suggestions: %s"
            r12 = 9982(0x26fe, float:1.3988E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r12)).mo56389s(r7, r10)     // Catch:{ all -> 0x06dc }
            int r5 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x06dc }
        L_0x03b7:
            int r9 = r9 + 1
            r5 = 0
            r7 = -1
            goto L_0x0320
        L_0x03bd:
            com.google.android.libraries.searchbox.shared.a.a r3 = new com.google.android.libraries.searchbox.shared.a.a     // Catch:{ all -> 0x06dc }
            r3.<init>()     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = "QUERY_BUILDER_ARROW_ICON_TAP_COUNT"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x06dc }
            if (r4 <= 0) goto L_0x03da
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.QUERY_BUILDER_ARROW_ICON_TAP_COUNT     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "QUERY_BUILDER_ARROW_ICON_TAP_COUNT"
            int r5 = r5.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r3.mo44227b(r4, r5)     // Catch:{ all -> 0x06dc }
            goto L_0x03df
        L_0x03da:
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.QUERY_BUILDER_ARROW_ICON_TAP_COUNT     // Catch:{ all -> 0x06dc }
            r3.mo44226a(r4)     // Catch:{ all -> 0x06dc }
        L_0x03df:
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = "QUERY_BUILDER_ARROW_ICON_SAVED_CHARS"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x06dc }
            if (r4 <= 0) goto L_0x03f7
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.QUERY_BUILDER_ARROW_ICON_SAVED_CHARS     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "QUERY_BUILDER_ARROW_ICON_SAVED_CHARS"
            int r5 = r5.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r3.mo44227b(r4, r5)     // Catch:{ all -> 0x06dc }
            goto L_0x03fc
        L_0x03f7:
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.QUERY_BUILDER_ARROW_ICON_SAVED_CHARS     // Catch:{ all -> 0x06dc }
            r3.mo44226a(r4)     // Catch:{ all -> 0x06dc }
        L_0x03fc:
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = "NUMBER_OF_DELETED_CHARACTERS"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x06dc }
            if (r4 <= 0) goto L_0x0414
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.NUMBER_OF_DELETED_CHARACTERS     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "NUMBER_OF_DELETED_CHARACTERS"
            int r5 = r5.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r3.mo44227b(r4, r5)     // Catch:{ all -> 0x06dc }
            goto L_0x0419
        L_0x0414:
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.NUMBER_OF_DELETED_CHARACTERS     // Catch:{ all -> 0x06dc }
            r3.mo44226a(r4)     // Catch:{ all -> 0x06dc }
        L_0x0419:
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = "CLEAR_BUTTON_TAP_COUNT"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x06dc }
            if (r4 <= 0) goto L_0x0431
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.CLEAR_BUTTON_TAP_COUNT     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "CLEAR_BUTTON_TAP_COUNT"
            int r5 = r5.mo83161a(r6)     // Catch:{ all -> 0x06dc }
            r3.mo44227b(r4, r5)     // Catch:{ all -> 0x06dc }
            goto L_0x0436
        L_0x0431:
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.CLEAR_BUTTON_TAP_COUNT     // Catch:{ all -> 0x06dc }
            r3.mo44226a(r4)     // Catch:{ all -> 0x06dc }
        L_0x0436:
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = "WIDGET_CLICKED_WITH_HINT_SHOWN"
            boolean r4 = r4.mo83178r(r5)     // Catch:{ all -> 0x06dc }
            if (r4 == 0) goto L_0x044d
            com.google.common.o.ane r4 = com.google.common.p4552o.ane.WIDGET_CLICKED_WITH_HINT_SHOWN     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r6 = "WIDGET_CLICKED_WITH_HINT_SHOWN"
            boolean r5 = r5.mo83178r(r6)     // Catch:{ all -> 0x06dc }
            r3.mo44229d(r4, r5)     // Catch:{ all -> 0x06dc }
        L_0x044d:
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = "TIMES_ZP_RENDERED"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x06dc }
            if (r4 <= r8) goto L_0x0460
            boolean r5 = r1.f239823j     // Catch:{ all -> 0x06dc }
            if (r5 == 0) goto L_0x0460
            com.google.common.o.ane r5 = com.google.common.p4552o.ane.TIMES_ZP_RENDERED     // Catch:{ all -> 0x06dc }
            r3.mo44227b(r5, r4)     // Catch:{ all -> 0x06dc }
        L_0x0460:
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.searchbox.shared.p6959a.C88689a.m143517a(r4, r2)     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = "CHANGED_ANSWER_QUERIES"
            java.io.Serializable r4 = r4.mo83165e(r5)     // Catch:{ all -> 0x06dc }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x06dc }
            if (r4 == 0) goto L_0x04c0
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x06dc }
            if (r5 != 0) goto L_0x04c0
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x06dc }
            int r6 = r5.f159611c     // Catch:{ all -> 0x06dc }
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x048e
            com.google.common.o.ams r5 = r5.f159598ao     // Catch:{ all -> 0x06dc }
            if (r5 != 0) goto L_0x0487
            com.google.common.o.ams r5 = com.google.common.p4552o.ams.f159243c     // Catch:{ all -> 0x06dc }
        L_0x0487:
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ all -> 0x06dc }
            com.google.common.o.amr r5 = (com.google.common.p4552o.amr) r5     // Catch:{ all -> 0x06dc }
            goto L_0x0496
        L_0x048e:
            com.google.common.o.ams r5 = com.google.common.p4552o.ams.f159243c     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x06dc }
            com.google.common.o.amr r5 = (com.google.common.p4552o.amr) r5     // Catch:{ all -> 0x06dc }
        L_0x0496:
            int r4 = r4.size()     // Catch:{ all -> 0x06dc }
            r5.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.ams r6 = (com.google.common.p4552o.ams) r6     // Catch:{ all -> 0x06dc }
            int r7 = r6.f159245a     // Catch:{ all -> 0x06dc }
            r7 = r7 | r8
            r6.f159245a = r7     // Catch:{ all -> 0x06dc }
            r6.f159246b = r4     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x06dc }
            com.google.common.o.ams r5 = (com.google.common.p4552o.ams) r5     // Catch:{ all -> 0x06dc }
            r5.getClass()     // Catch:{ all -> 0x06dc }
            r4.f159598ao = r5     // Catch:{ all -> 0x06dc }
            int r5 = r4.f159611c     // Catch:{ all -> 0x06dc }
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r4.f159611c = r5     // Catch:{ all -> 0x06dc }
        L_0x04c0:
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.util.ArrayList r4 = r4.mo83180t()     // Catch:{ all -> 0x06dc }
            if (r4 == 0) goto L_0x0564
            int r5 = r4.size()     // Catch:{ all -> 0x06dc }
            com.google.common.o.anx[] r5 = new com.google.common.p4552o.anx[r5]     // Catch:{ all -> 0x06dc }
            int r6 = r4.size()     // Catch:{ all -> 0x06dc }
            r7 = 0
            r9 = 0
        L_0x04d4:
            if (r7 >= r6) goto L_0x0539
            java.lang.Object r10 = r4.get(r7)     // Catch:{ all -> 0x06dc }
            android.os.Parcelable r10 = (android.os.Parcelable) r10     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.ui.logging.ParcelableQueryBuilderTap r10 = (com.google.android.libraries.searchbox.p3203ui.logging.ParcelableQueryBuilderTap) r10     // Catch:{ all -> 0x06dc }
            com.google.common.o.anx r12 = com.google.common.p4552o.anx.f159416e     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x06dc }
            com.google.common.o.anw r12 = (com.google.common.p4552o.anw) r12     // Catch:{ all -> 0x06dc }
            int[] r13 = r10.mo44299c()     // Catch:{ all -> 0x06dc }
            java.util.List r13 = com.google.common.p4575r.C60757n.m92749j(r13)     // Catch:{ all -> 0x06dc }
            r12.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.anx r14 = (com.google.common.p4552o.anx) r14     // Catch:{ all -> 0x06dc }
            com.google.protobuf.ch r15 = r14.f159419b     // Catch:{ all -> 0x06dc }
            boolean r16 = r15.mo58948c()     // Catch:{ all -> 0x06dc }
            if (r16 != 0) goto L_0x0503
            com.google.protobuf.ch r15 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r15)     // Catch:{ all -> 0x06dc }
            r14.f159419b = r15     // Catch:{ all -> 0x06dc }
        L_0x0503:
            com.google.protobuf.ch r14 = r14.f159419b     // Catch:{ all -> 0x06dc }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r13, (java.util.List) r14)     // Catch:{ all -> 0x06dc }
            int r13 = r10.mo44298b()     // Catch:{ all -> 0x06dc }
            r12.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.anx r14 = (com.google.common.p4552o.anx) r14     // Catch:{ all -> 0x06dc }
            int r15 = r14.f159418a     // Catch:{ all -> 0x06dc }
            r15 = r15 | r8
            r14.f159418a = r15     // Catch:{ all -> 0x06dc }
            r14.f159420c = r13     // Catch:{ all -> 0x06dc }
            int r10 = r10.mo44297a()     // Catch:{ all -> 0x06dc }
            r12.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.anx r13 = (com.google.common.p4552o.anx) r13     // Catch:{ all -> 0x06dc }
            int r14 = r13.f159418a     // Catch:{ all -> 0x06dc }
            r14 = r14 | r11
            r13.f159418a = r14     // Catch:{ all -> 0x06dc }
            r13.f159421d = r10     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r10 = r12.build()     // Catch:{ all -> 0x06dc }
            com.google.common.o.anx r10 = (com.google.common.p4552o.anx) r10     // Catch:{ all -> 0x06dc }
            r5[r9] = r10     // Catch:{ all -> 0x06dc }
            int r9 = r9 + 1
            int r7 = r7 + 1
            goto L_0x04d4
        L_0x0539:
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x06dc }
            com.google.protobuf.cq r6 = com.google.common.p4552o.apd.emptyProtobufList()     // Catch:{ all -> 0x06dc }
            r4.f159590ag = r6     // Catch:{ all -> 0x06dc }
            java.util.List r4 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x06dc }
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x06dc }
            com.google.protobuf.cq r6 = r5.f159590ag     // Catch:{ all -> 0x06dc }
            boolean r7 = r6.mo58948c()     // Catch:{ all -> 0x06dc }
            if (r7 != 0) goto L_0x055f
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)     // Catch:{ all -> 0x06dc }
            r5.f159590ag = r6     // Catch:{ all -> 0x06dc }
        L_0x055f:
            com.google.protobuf.cq r5 = r5.f159590ag     // Catch:{ all -> 0x06dc }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r5)     // Catch:{ all -> 0x06dc }
        L_0x0564:
            boolean r4 = r1.f239822i     // Catch:{ all -> 0x06dc }
            if (r4 == 0) goto L_0x0690
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239815b     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = "SEARCH_METHOD"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x06dc }
            com.google.common.o.aod r5 = com.google.common.p4552o.aod.ABANDONMENT     // Catch:{ all -> 0x06dc }
            int r5 = r5.f159471J     // Catch:{ all -> 0x06dc }
            if (r4 == r5) goto L_0x0578
            goto L_0x0690
        L_0x0578:
            com.google.protos.ax.a.e r4 = com.google.protos.p4932ax.p4933a.C64265e.f173756d     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.a r4 = (com.google.protos.p4932ax.p4933a.C64261a) r4     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.searchbox.ui.g r5 = r1.f239817d     // Catch:{ all -> 0x06dc }
            java.lang.CharSequence r5 = r5.mo82429a()     // Catch:{ all -> 0x06dc }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x06dc }
            r4.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.e r6 = (com.google.protos.p4932ax.p4933a.C64265e) r6     // Catch:{ all -> 0x06dc }
            r5.getClass()     // Catch:{ all -> 0x06dc }
            int r7 = r6.f173758a     // Catch:{ all -> 0x06dc }
            r7 = r7 | r8
            r6.f173758a = r7     // Catch:{ all -> 0x06dc }
            r6.f173759b = r5     // Catch:{ all -> 0x06dc }
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r5 = r1.f239819f     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.response.Response r5 = r5.mo82489k()     // Catch:{ all -> 0x06dc }
            if (r5 == 0) goto L_0x0690
            com.google.common.b.gu r6 = r5.f108862b     // Catch:{ all -> 0x06dc }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x06dc }
            if (r6 != 0) goto L_0x0690
            com.google.common.b.gu r5 = r5.f108862b     // Catch:{ all -> 0x06dc }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x06dc }
            r6 = 0
        L_0x05b2:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x06dc }
            if (r7 == 0) goto L_0x0679
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r7 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r7     // Catch:{ all -> 0x06dc }
            int r9 = r7.f108910k     // Catch:{ all -> 0x06dc }
            r10 = 46
            if (r9 != r10) goto L_0x05c6
            r9 = 0
            goto L_0x05c7
        L_0x05c6:
            r9 = 1
        L_0x05c7:
            r9 = r9 ^ r8
            r6 = r6 | r9
            com.google.protos.ax.a.d r9 = com.google.protos.p4932ax.p4933a.C64264d.f173749f     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.b r9 = (com.google.protos.p4932ax.p4933a.C64262b) r9     // Catch:{ all -> 0x06dc }
            int r10 = r7.f108910k     // Catch:{ all -> 0x06dc }
            r9.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r12 = r9.instance     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.d r12 = (com.google.protos.p4932ax.p4933a.C64264d) r12     // Catch:{ all -> 0x06dc }
            int r13 = r12.f173751a     // Catch:{ all -> 0x06dc }
            r13 = r13 | r8
            r12.f173751a = r13     // Catch:{ all -> 0x06dc }
            r12.f173752b = r10     // Catch:{ all -> 0x06dc }
            com.google.common.b.gu r10 = r7.f108925z     // Catch:{ all -> 0x06dc }
            r9.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r12 = r9.instance     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.d r12 = (com.google.protos.p4932ax.p4933a.C64264d) r12     // Catch:{ all -> 0x06dc }
            com.google.protobuf.ch r13 = r12.f173753c     // Catch:{ all -> 0x06dc }
            boolean r14 = r13.mo58948c()     // Catch:{ all -> 0x06dc }
            if (r14 != 0) goto L_0x05f8
            com.google.protobuf.ch r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r13)     // Catch:{ all -> 0x06dc }
            r12.f173753c = r13     // Catch:{ all -> 0x06dc }
        L_0x05f8:
            com.google.protobuf.ch r12 = r12.f173753c     // Catch:{ all -> 0x06dc }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r10, (java.util.List) r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = r7.mo44269v()     // Catch:{ all -> 0x06dc }
            r9.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r12 = r9.instance     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.d r12 = (com.google.protos.p4932ax.p4933a.C64264d) r12     // Catch:{ all -> 0x06dc }
            r10.getClass()     // Catch:{ all -> 0x06dc }
            int r13 = r12.f173751a     // Catch:{ all -> 0x06dc }
            r13 = r13 | r11
            r12.f173751a = r13     // Catch:{ all -> 0x06dc }
            r12.f173754d = r10     // Catch:{ all -> 0x06dc }
            com.google.at.h.d.a.aq r7 = r7.f108906A     // Catch:{ all -> 0x06dc }
            if (r7 == 0) goto L_0x0654
            com.google.at.h.d.a.l r7 = r7.f142338j     // Catch:{ all -> 0x06dc }
            if (r7 != 0) goto L_0x061c
            com.google.at.h.d.a.l r7 = com.google.p4017at.p4060h.p4073d.p4074a.C54248l.f142431m     // Catch:{ all -> 0x06dc }
        L_0x061c:
            java.lang.String r10 = "id"
            java.lang.String r12 = r7.f142434b     // Catch:{ all -> 0x06dc }
            m143543B(r9, r10, r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "l1"
            java.lang.String r12 = r7.f142440h     // Catch:{ all -> 0x06dc }
            m143543B(r9, r10, r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "l2"
            java.lang.String r12 = r7.f142435c     // Catch:{ all -> 0x06dc }
            m143543B(r9, r10, r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "q"
            java.lang.String r12 = r7.f142436d     // Catch:{ all -> 0x06dc }
            m143543B(r9, r10, r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "ds"
            java.lang.String r12 = r7.f142437e     // Catch:{ all -> 0x06dc }
            m143543B(r9, r10, r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "os"
            java.lang.String r12 = r7.f142438f     // Catch:{ all -> 0x06dc }
            m143543B(r9, r10, r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "url"
            java.lang.String r12 = r7.f142439g     // Catch:{ all -> 0x06dc }
            m143543B(r9, r10, r12)     // Catch:{ all -> 0x06dc }
            java.lang.String r10 = "gs_ssp"
            java.lang.String r7 = r7.f142442j     // Catch:{ all -> 0x06dc }
            m143543B(r9, r10, r7)     // Catch:{ all -> 0x06dc }
        L_0x0654:
            com.google.protobuf.bv r7 = r9.build()     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.d r7 = (com.google.protos.p4932ax.p4933a.C64264d) r7     // Catch:{ all -> 0x06dc }
            r4.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r9 = r4.instance     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.e r9 = (com.google.protos.p4932ax.p4933a.C64265e) r9     // Catch:{ all -> 0x06dc }
            r7.getClass()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.cq r10 = r9.f173760c     // Catch:{ all -> 0x06dc }
            boolean r12 = r10.mo58948c()     // Catch:{ all -> 0x06dc }
            if (r12 != 0) goto L_0x0672
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)     // Catch:{ all -> 0x06dc }
            r9.f173760c = r10     // Catch:{ all -> 0x06dc }
        L_0x0672:
            com.google.protobuf.cq r9 = r9.f173760c     // Catch:{ all -> 0x06dc }
            r9.add(r7)     // Catch:{ all -> 0x06dc }
            goto L_0x05b2
        L_0x0679:
            if (r6 == 0) goto L_0x0690
            com.google.common.o.ane r5 = com.google.common.p4552o.ane.ENTITY_ABANDONMENT_SUGGEST_MENU     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x06dc }
            com.google.protos.ax.a.e r4 = (com.google.protos.p4932ax.p4933a.C64265e) r4     // Catch:{ all -> 0x06dc }
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x06dc }
            r6 = 11
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r6)     // Catch:{ all -> 0x06dc }
            r3.mo44228c(r5, r4)     // Catch:{ all -> 0x06dc }
        L_0x0690:
            java.util.List r4 = r1.f239818e     // Catch:{ all -> 0x06dc }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x06dc }
        L_0x0696:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x06dc }
            if (r5 == 0) goto L_0x06a6
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.a.b r5 = (com.google.android.libraries.searchbox.shared.p3200a.C41641b) r5     // Catch:{ all -> 0x06dc }
            r5.mo44232l(r3)     // Catch:{ all -> 0x06dc }
            goto L_0x0696
        L_0x06a6:
            r2.copyOnWrite()     // Catch:{ all -> 0x06dc }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x06dc }
            com.google.protobuf.cq r5 = com.google.common.p4552o.apd.emptyProtobufList()     // Catch:{ all -> 0x06dc }
            r4.f159587ad = r5     // Catch:{ all -> 0x06dc }
            com.google.common.o.anf[] r3 = r3.mo44230e()     // Catch:{ all -> 0x06dc }
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ all -> 0x06dc }
            r2.mo57025a(r3)     // Catch:{ all -> 0x06dc }
            java.util.List r3 = r1.f239818e     // Catch:{ all -> 0x06dc }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x06dc }
        L_0x06c4:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x06dc }
            if (r4 == 0) goto L_0x06d4
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x06dc }
            com.google.android.libraries.searchbox.shared.a.b r4 = (com.google.android.libraries.searchbox.shared.p3200a.C41641b) r4     // Catch:{ all -> 0x06dc }
            r4.mo44231f(r2)     // Catch:{ all -> 0x06dc }
            goto L_0x06c4
        L_0x06d4:
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x06dc }
            com.google.common.o.apd r2 = (com.google.common.p4552o.apd) r2     // Catch:{ all -> 0x06dc }
            monitor-exit(r17)
            return r2
        L_0x06dc:
            r0 = move-exception
            r2 = r0
            monitor-exit(r17)
            goto L_0x06e1
        L_0x06e0:
            throw r2
        L_0x06e1:
            goto L_0x06e0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g.mo82399f():com.google.common.o.apd");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:59|60|71) */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r7 = f239814a.mo56226d();
        r7.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "sb.u.Logging");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(9980)).mo56389s("Failed to add to rendered proactive zps info: %s", r6);
        r6 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x01c6 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.p4184bj.C56036l mo82400g() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.bj.l r0 = com.google.p4184bj.C56036l.f149228f     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x01f8 }
            com.google.bj.h r0 = (com.google.p4184bj.C56032h) r0     // Catch:{ all -> 0x01f8 }
            com.google.android.apps.gsa.shared.an.a.j r1 = r13.f239815b     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = "SELECTED_SUGGESTION"
            android.os.Parcelable r1 = r1.mo83164d(r2)     // Catch:{ all -> 0x01f8 }
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r1 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r1     // Catch:{ all -> 0x01f8 }
            r2 = 2
            r3 = 4
            r4 = 1
            if (r1 == 0) goto L_0x00d0
            com.google.common.b.gu r5 = r1.f108925z     // Catch:{ all -> 0x01f8 }
            com.google.protos.ba.a.b r6 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PROACTIVE_ZPS     // Catch:{ all -> 0x01f8 }
            int r6 = r6.f174585kE     // Catch:{ all -> 0x01f8 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01f8 }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01f8 }
            if (r5 != 0) goto L_0x0038
            com.google.common.b.gu r5 = r1.f108925z     // Catch:{ all -> 0x01f8 }
            com.google.protos.ba.a.b r6 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PIPS     // Catch:{ all -> 0x01f8 }
            int r6 = r6.f174585kE     // Catch:{ all -> 0x01f8 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01f8 }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01f8 }
            if (r5 == 0) goto L_0x00d0
        L_0x0038:
            com.google.bj.j r5 = com.google.p4184bj.C56034j.f149219g     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x01f8 }
            com.google.bj.i r5 = (com.google.p4184bj.C56033i) r5     // Catch:{ all -> 0x01f8 }
            int r6 = r1.f108910k     // Catch:{ all -> 0x01f8 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x01f8 }
            com.google.bj.j r7 = (com.google.p4184bj.C56034j) r7     // Catch:{ all -> 0x01f8 }
            int r8 = r7.f149221a     // Catch:{ all -> 0x01f8 }
            r8 = r8 | r3
            r7.f149221a = r8     // Catch:{ all -> 0x01f8 }
            r7.f149224d = r6     // Catch:{ all -> 0x01f8 }
            com.google.common.b.gu r6 = r1.f108925z     // Catch:{ all -> 0x01f8 }
            r5.mo54316a(r6)     // Catch:{ all -> 0x01f8 }
            boolean r6 = r1.mo44265s()     // Catch:{ all -> 0x01f8 }
            if (r6 == 0) goto L_0x00b9
            com.google.at.h.d.a.aq r1 = r1.f108906A     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x00b9
            int r6 = r1.f142330a     // Catch:{ all -> 0x01f8 }
            r6 = r6 & r3
            if (r6 == 0) goto L_0x00b9
            com.google.at.h.d.a.ae r1 = r1.f142334f     // Catch:{ all -> 0x01f8 }
            if (r1 != 0) goto L_0x006a
            com.google.at.h.d.a.ae r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C     // Catch:{ all -> 0x01f8 }
        L_0x006a:
            int r6 = r1.f142290a     // Catch:{ all -> 0x01f8 }
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            r6 = r6 & r7
            if (r6 == 0) goto L_0x00a1
            com.google.al.d.a.s r6 = r1.f142309t     // Catch:{ all -> 0x01f8 }
            if (r6 != 0) goto L_0x0077
            com.google.al.d.a.s r6 = com.google.p395al.p417d.p418a.C8592s.f29730d     // Catch:{ all -> 0x01f8 }
        L_0x0077:
            int r7 = r6.f29732a     // Catch:{ all -> 0x01f8 }
            r7 = r7 & r4
            if (r7 == 0) goto L_0x008c
            long r7 = r6.f29733b     // Catch:{ all -> 0x01f8 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bv r9 = r5.instance     // Catch:{ all -> 0x01f8 }
            com.google.bj.j r9 = (com.google.p4184bj.C56034j) r9     // Catch:{ all -> 0x01f8 }
            int r10 = r9.f149221a     // Catch:{ all -> 0x01f8 }
            r10 = r10 | r4
            r9.f149221a = r10     // Catch:{ all -> 0x01f8 }
            r9.f149222b = r7     // Catch:{ all -> 0x01f8 }
        L_0x008c:
            int r7 = r6.f29732a     // Catch:{ all -> 0x01f8 }
            r7 = r7 & r2
            if (r7 == 0) goto L_0x00a1
            long r6 = r6.f29734c     // Catch:{ all -> 0x01f8 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x01f8 }
            com.google.bj.j r8 = (com.google.p4184bj.C56034j) r8     // Catch:{ all -> 0x01f8 }
            int r9 = r8.f149221a     // Catch:{ all -> 0x01f8 }
            r9 = r9 | r2
            r8.f149221a = r9     // Catch:{ all -> 0x01f8 }
            r8.f149223c = r6     // Catch:{ all -> 0x01f8 }
        L_0x00a1:
            int r6 = r1.f142290a     // Catch:{ all -> 0x01f8 }
            r7 = 262144(0x40000, float:3.67342E-40)
            r6 = r6 & r7
            if (r6 == 0) goto L_0x00b9
            int r1 = r1.f142306q     // Catch:{ all -> 0x01f8 }
            r5.copyOnWrite()     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x01f8 }
            com.google.bj.j r6 = (com.google.p4184bj.C56034j) r6     // Catch:{ all -> 0x01f8 }
            int r7 = r6.f149221a     // Catch:{ all -> 0x01f8 }
            r7 = r7 | 16
            r6.f149221a = r7     // Catch:{ all -> 0x01f8 }
            r6.f149226f = r1     // Catch:{ all -> 0x01f8 }
        L_0x00b9:
            com.google.protobuf.bv r1 = r5.build()     // Catch:{ all -> 0x01f8 }
            com.google.bj.j r1 = (com.google.p4184bj.C56034j) r1     // Catch:{ all -> 0x01f8 }
            r0.copyOnWrite()     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ all -> 0x01f8 }
            com.google.bj.l r5 = (com.google.p4184bj.C56036l) r5     // Catch:{ all -> 0x01f8 }
            r1.getClass()     // Catch:{ all -> 0x01f8 }
            r5.f149232c = r1     // Catch:{ all -> 0x01f8 }
            int r1 = r5.f149230a     // Catch:{ all -> 0x01f8 }
            r1 = r1 | r4
            r5.f149230a = r1     // Catch:{ all -> 0x01f8 }
        L_0x00d0:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x01f8 }
            r1.<init>()     // Catch:{ all -> 0x01f8 }
            com.google.android.apps.gsa.shared.an.a.j r5 = r13.f239815b     // Catch:{ all -> 0x01f8 }
            java.lang.String r6 = "ALL_SHOWN_PROACTIVE_ZPS_INFO_IN_SESSION"
            java.io.Serializable r5 = r5.mo83165e(r6)     // Catch:{ all -> 0x01f8 }
            java.util.ArrayDeque r6 = new java.util.ArrayDeque     // Catch:{ all -> 0x01f8 }
            r6.<init>()     // Catch:{ all -> 0x01f8 }
            m143547F(r5, r6)     // Catch:{ all -> 0x01f8 }
            boolean r5 = r6.isEmpty()     // Catch:{ all -> 0x01f8 }
            if (r5 == 0) goto L_0x00ed
            goto L_0x01de
        L_0x00ed:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x01f8 }
            r5.<init>(r6)     // Catch:{ all -> 0x01f8 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01f8 }
        L_0x00f6:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x01f8 }
            if (r6 == 0) goto L_0x01de
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x01f8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01f8 }
            java.lang.String r7 = ","
            com.google.common.base.cf r7 = com.google.common.base.C58869cf.m90938d(r7)     // Catch:{ all -> 0x01f8 }
            java.util.List r7 = r7.mo56155i(r6)     // Catch:{ all -> 0x01f8 }
            int r8 = r7.size()     // Catch:{ all -> 0x01f8 }
            r9 = 5
            if (r8 < r9) goto L_0x00f6
            com.google.bj.j r8 = com.google.p4184bj.C56034j.f149219g     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.bj.i r8 = (com.google.p4184bj.C56033i) r8     // Catch:{ NumberFormatException -> 0x01c6 }
            r9 = 0
            java.lang.Object r9 = r7.get(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01c6 }
            boolean r10 = com.google.common.base.C58837ba.m90859h(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            if (r10 != 0) goto L_0x013a
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            r8.copyOnWrite()     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.protobuf.bv r11 = r8.instance     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.bj.j r11 = (com.google.p4184bj.C56034j) r11     // Catch:{ NumberFormatException -> 0x01c6 }
            int r12 = r11.f149221a     // Catch:{ NumberFormatException -> 0x01c6 }
            r12 = r12 | r4
            r11.f149221a = r12     // Catch:{ NumberFormatException -> 0x01c6 }
            r11.f149222b = r9     // Catch:{ NumberFormatException -> 0x01c6 }
        L_0x013a:
            java.lang.Object r9 = r7.get(r4)     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01c6 }
            boolean r10 = com.google.common.base.C58837ba.m90859h(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            if (r10 != 0) goto L_0x0158
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            r8.copyOnWrite()     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.protobuf.bv r11 = r8.instance     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.bj.j r11 = (com.google.p4184bj.C56034j) r11     // Catch:{ NumberFormatException -> 0x01c6 }
            int r12 = r11.f149221a     // Catch:{ NumberFormatException -> 0x01c6 }
            r12 = r12 | r2
            r11.f149221a = r12     // Catch:{ NumberFormatException -> 0x01c6 }
            r11.f149223c = r9     // Catch:{ NumberFormatException -> 0x01c6 }
        L_0x0158:
            java.lang.Object r9 = r7.get(r2)     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.String r10 = "-1"
            boolean r10 = r9.equals(r10)     // Catch:{ NumberFormatException -> 0x01c6 }
            if (r10 != 0) goto L_0x0179
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            r8.copyOnWrite()     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.bj.j r10 = (com.google.p4184bj.C56034j) r10     // Catch:{ NumberFormatException -> 0x01c6 }
            int r11 = r10.f149221a     // Catch:{ NumberFormatException -> 0x01c6 }
            r11 = r11 | 16
            r10.f149221a = r11     // Catch:{ NumberFormatException -> 0x01c6 }
            r10.f149226f = r9     // Catch:{ NumberFormatException -> 0x01c6 }
        L_0x0179:
            r9 = 3
            java.lang.Object r9 = r7.get(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01c6 }
            boolean r10 = com.google.common.base.C58837ba.m90859h(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            if (r10 != 0) goto L_0x0198
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            r8.copyOnWrite()     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.bj.j r10 = (com.google.p4184bj.C56034j) r10     // Catch:{ NumberFormatException -> 0x01c6 }
            int r11 = r10.f149221a     // Catch:{ NumberFormatException -> 0x01c6 }
            r11 = r11 | r3
            r10.f149221a = r11     // Catch:{ NumberFormatException -> 0x01c6 }
            r10.f149224d = r9     // Catch:{ NumberFormatException -> 0x01c6 }
        L_0x0198:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ NumberFormatException -> 0x01c6 }
            r9.<init>()     // Catch:{ NumberFormatException -> 0x01c6 }
            r10 = 4
        L_0x019e:
            int r11 = r7.size()     // Catch:{ NumberFormatException -> 0x01c6 }
            if (r10 >= r11) goto L_0x01b8
            java.lang.Object r11 = r7.get(r10)     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x01c6 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x01c6 }
            r9.add(r11)     // Catch:{ NumberFormatException -> 0x01c6 }
            int r10 = r10 + 1
            goto L_0x019e
        L_0x01b8:
            r8.mo54316a(r9)     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.protobuf.bv r7 = r8.build()     // Catch:{ NumberFormatException -> 0x01c6 }
            com.google.bj.j r7 = (com.google.p4184bj.C56034j) r7     // Catch:{ NumberFormatException -> 0x01c6 }
            r1.add(r7)     // Catch:{ NumberFormatException -> 0x01c6 }
            goto L_0x00f6
        L_0x01c6:
            com.google.common.f.e r7 = f239814a     // Catch:{ all -> 0x01f8 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x01f8 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01f8 }
            java.lang.String r9 = "sb.u.Logging"
            r7.mo56378ag(r8, r9)     // Catch:{ all -> 0x01f8 }
            java.lang.String r8 = "Failed to add to rendered proactive zps info: %s"
            r9 = 9980(0x26fc, float:1.3985E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56389s(r8, r6)     // Catch:{ all -> 0x01f8 }
            int r6 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x01f8 }
            goto L_0x00f6
        L_0x01de:
            r0.mo54315a(r1)     // Catch:{ all -> 0x01f8 }
            r0.copyOnWrite()     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x01f8 }
            com.google.bj.l r1 = (com.google.p4184bj.C56036l) r1     // Catch:{ all -> 0x01f8 }
            r1.f149234e = r4     // Catch:{ all -> 0x01f8 }
            int r2 = r1.f149230a     // Catch:{ all -> 0x01f8 }
            r2 = r2 | 8
            r1.f149230a = r2     // Catch:{ all -> 0x01f8 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x01f8 }
            com.google.bj.l r0 = (com.google.p4184bj.C56036l) r0     // Catch:{ all -> 0x01f8 }
            monitor-exit(r13)
            return r0
        L_0x01f8:
            r0 = move-exception
            monitor-exit(r13)
            goto L_0x01fc
        L_0x01fb:
            throw r0
        L_0x01fc:
            goto L_0x01fb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g.mo82400g():com.google.bj.l");
    }

    /* renamed from: h */
    public final synchronized void mo82401h(String str) {
        C89205j jVar = this.f239815b;
        if (jVar != null) {
            HashSet hashSet = (HashSet) jVar.mo83165e("CHANGED_ANSWER_QUERIES");
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            hashSet.add(str);
        }
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239815b = jVar;
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        C88709j jVar = (C88709j) obj;
        this.f239820g = jVar.f239855L;
        this.f239821h = jVar.f239849F;
        this.f239822i = jVar.f239869Z;
        this.f239823j = jVar.f239874ad;
    }

    /* renamed from: hE */
    public final synchronized void mo78006hE() {
        this.f239815b.mo83171k("SESSION_NUMBER", (this.f239815b.mo83177q("SESSION_NUMBER") ? this.f239815b.mo83161a("SESSION_NUMBER") : -1) + 1);
        this.f239815b.mo83172l("INPUT_METHODS", new ArrayList());
        this.f239815b.mo83171k("SEARCH_METHOD", 0);
        this.f239815b.mo83174n("SELECTED_SUGGESTION", (Parcelable) null);
        this.f239815b.mo83172l("SELECTED_ENHANCEMENT_SUBTYPES", new ArrayList());
        this.f239815b.mo83173m("SUGGESTION_CLICK_TIME_MS", 0);
        this.f239815b.mo83173m("SESSION_START_TIME", this.f239816c.mo26871c());
        this.f239815b.mo83173m("FIRST_EDIT_TIME", 0);
        this.f239815b.mo83173m("LAST_EDIT_TIME", 0);
        this.f239815b.mo83173m("LAST_QUERY_BUILD_TIME", 0);
        this.f239815b.mo83173m("TOTAL_RENDERED_RESPONSE_TIME", 0);
        this.f239815b.mo83171k("RENDERED_RESPONSE_COUNT", 0);
        this.f239815b.mo83171k("NUMBER_OF_ZERO_PREFIX_SUGGESTIONS_SHOWN", 0);
        this.f239815b.mo83171k("OUT_OF_SYNC_RESPONSE_COUNT", 0);
        this.f239815b.mo83171k("NUMBER_OF_SUGGEST_EXPERIMENT_TRIGGERED", 0);
        this.f239815b.mo83170j("IS_SUGGEST_EXPERIMENT_TRIGGERED_IN_RENDERED_RESPONSE", false);
        this.f239815b.mo83171k("NUMBER_OF_DELETED_CHARACTERS", 0);
        this.f239815b.mo83171k("CHIPS_DELETED_CHARACTERS", 0);
        this.f239815b.mo83171k("CLEAR_BUTTON_TAP_COUNT", 0);
        this.f239815b.mo83171k("QUERY_BUILDER_ARROW_ICON_TAP_COUNT", 0);
        this.f239815b.mo83171k("QUERY_BUILDER_ARROW_ICON_SAVED_CHARS", 0);
        this.f239815b.mo83171k("SRP_ON_FOCUS_SUGGESTION_COUNT", 0);
        this.f239815b.mo83171k("TIMES_ZP_RENDERED", 0);
        this.f239815b.mo83171k("ACTION_CLICKED_INDEX", -1);
        this.f239815b.mo83175o("CHANGED_ANSWER_QUERIES", new HashSet());
        this.f239815b.mo83183w(new ArrayList());
        this.f239815b.mo83175o("ALL_SHOWN_PROACTIVE_ZPS_INFO_IN_SESSION", new ArrayDeque());
        this.f239815b.mo83170j("WIDGET_CLICKED_WITH_HINT_SHOWN", false);
        C89205j jVar = this.f239815b;
        Object obj = jVar.f241828a;
        if (obj != null) {
            synchronized (obj) {
                jVar.mo83163c().putByteArray("QUERY_BUILDER_CHIP_TAP", (byte[]) null);
            }
        } else {
            jVar.mo83163c().putByteArray("QUERY_BUILDER_CHIP_TAP", (byte[]) null);
        }
        C88689a.m143519c(this.f239815b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82402i(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.shared.an.a.j r0 = r2.f239815b     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "INPUT_METHODS"
            java.util.ArrayList r0 = r0.mo83167g(r1)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x001c }
            boolean r1 = r0.contains(r3)     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            r0.add(r3)     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g.mo82402i(int):void");
    }

    /* renamed from: j */
    public final synchronized void mo82403j(int i) {
        C89205j jVar = this.f239815b;
        jVar.mo83171k("NUMBER_OF_DELETED_CHARACTERS", jVar.mo83161a("NUMBER_OF_DELETED_CHARACTERS") + i);
    }

    /* renamed from: k */
    public final synchronized void mo82404k(int i) {
        C89205j jVar = this.f239815b;
        jVar.mo83171k("CHIPS_DELETED_CHARACTERS", jVar.mo83161a("CHIPS_DELETED_CHARACTERS") + i);
    }

    /* renamed from: l */
    public final synchronized void mo82405l() {
        this.f239815b.mo83169i("OUT_OF_SYNC_RESPONSE_COUNT");
    }

    /* renamed from: m */
    public final synchronized void mo82406m(int i) {
        C89205j jVar = this.f239815b;
        jVar.mo83171k("QUERY_BUILDER_ARROW_ICON_SAVED_CHARS", jVar.mo83161a("QUERY_BUILDER_ARROW_ICON_SAVED_CHARS") + i);
    }

    /* renamed from: n */
    public final synchronized void mo82407n() {
        this.f239815b.mo83169i("QUERY_BUILDER_ARROW_ICON_TAP_COUNT");
    }

    /* renamed from: o */
    public final synchronized void mo82408o(Response response) {
        int i = 0;
        for (Suggestion w : response.f108862b) {
            if (w.mo44270w()) {
                i++;
            }
        }
        this.f239815b.mo83171k("NUMBER_OF_ZERO_PREFIX_SUGGESTIONS_SHOWN", i);
    }

    /* renamed from: p */
    public final synchronized void mo82409p(Response response) {
        if (!response.f108862b.isEmpty()) {
            long c = this.f239816c.mo26871c();
            long j = response.f108866f;
            this.f239815b.mo83173m("TOTAL_RENDERED_RESPONSE_TIME", this.f239815b.mo83162b("TOTAL_RENDERED_RESPONSE_TIME") + (c - j));
            this.f239815b.mo83169i("RENDERED_RESPONSE_COUNT");
            mo82411r(response);
            if (this.f239821h && response.f108861a.isEmpty()) {
                mo82410q(response);
            }
        }
        if (response.f108861a.isEmpty()) {
            mo82408o(response);
            if (this.f239823j) {
                C89205j jVar = this.f239815b;
                jVar.mo83171k("TIMES_ZP_RENDERED", jVar.mo83161a("TIMES_ZP_RENDERED") + 1);
            }
        }
        boolean z = response.f108868h.f142363c;
        this.f239815b.mo83170j("IS_SUGGEST_EXPERIMENT_TRIGGERED_IN_RENDERED_RESPONSE", z);
        if (z) {
            this.f239815b.mo83169i("NUMBER_OF_SUGGEST_EXPERIMENT_TRIGGERED");
        }
    }

    /* renamed from: q */
    public final synchronized void mo82410q(Response response) {
        String str;
        Serializable e = this.f239815b.mo83165e("ALL_SHOWN_PROACTIVE_ZPS_INFO_IN_SESSION");
        ArrayDeque arrayDeque = new ArrayDeque();
        m143547F(e, arrayDeque);
        C57924d dVar = response.f108868h.f142377q;
        if (dVar == null) {
            dVar = C57924d.f154931b;
        }
        for (C57922b bVar : dVar.f154933a) {
            int i = (bVar.f154925a & 4) != 0 ? bVar.f154930f : -1;
            if (!C89212c.m145117a(bVar.f154929e, this.f239816c.mo26870b())) {
                str = BuildConfig.FLAVOR;
            } else {
                String str2 = BuildConfig.FLAVOR;
                String str3 = BuildConfig.FLAVOR;
                if ((bVar.f154925a & 1) != 0) {
                    C8592s sVar = bVar.f154926b;
                    if (sVar == null) {
                        sVar = C8592s.f29730d;
                    }
                    if ((sVar.f29732a & 1) != 0) {
                        str3 = String.valueOf(sVar.f29733b);
                    }
                    if ((sVar.f29732a & 2) != 0) {
                        str2 = String.valueOf(sVar.f29734c);
                    }
                }
                if ((bVar.f154925a & 4) != 0) {
                    i = bVar.f154930f;
                }
                int i2 = bVar.f154927c;
                C62961ch<Integer> chVar = bVar.f154928d;
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(",");
                sb.append(str2);
                sb.append(",");
                sb.append(i);
                sb.append(",");
                sb.append(i2);
                Collections.sort(new ArrayList(chVar));
                for (Integer intValue : chVar) {
                    int intValue2 = intValue.intValue();
                    sb.append(",");
                    sb.append(intValue2);
                }
                str = sb.toString();
            }
            if (!str.isEmpty()) {
                if (arrayDeque.size() > this.f239820g) {
                    arrayDeque.remove();
                }
                arrayDeque.add(str);
            }
        }
        if (!arrayDeque.isEmpty()) {
            this.f239815b.mo83175o("ALL_SHOWN_PROACTIVE_ZPS_INFO_IN_SESSION", arrayDeque);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82411r(com.google.android.libraries.searchbox.shared.response.Response r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.apps.gsa.shared.an.a.j r0 = r4.f239815b     // Catch:{ all -> 0x006f }
            java.util.ArrayList r0 = r0.mo83181u()     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0013
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x006f }
            r0.<init>()     // Catch:{ all -> 0x006f }
            com.google.android.apps.gsa.shared.an.a.j r1 = r4.f239815b     // Catch:{ all -> 0x006f }
            r1.mo83183w(r0)     // Catch:{ all -> 0x006f }
        L_0x0013:
            com.google.common.b.gu r5 = r5.f108862b     // Catch:{ all -> 0x006f }
            java.util.Set r1 = m143546E(r5)     // Catch:{ all -> 0x006f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x006f }
        L_0x001d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x006f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x006f }
            boolean r3 = r0.contains(r2)     // Catch:{ all -> 0x006f }
            if (r3 != 0) goto L_0x001d
            r0.add(r2)     // Catch:{ all -> 0x006f }
            goto L_0x001d
        L_0x0033:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x006d
            r0 = 0
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x006f }
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r0 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r0     // Catch:{ all -> 0x006f }
            com.google.common.b.gu r1 = r0.f108925z     // Catch:{ all -> 0x006f }
            com.google.protos.ba.a.b r2 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_SRP_ON_FOCUS     // Catch:{ all -> 0x006f }
            int r2 = r2.f174585kE     // Catch:{ all -> 0x006f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006f }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x0060
            com.google.common.b.gu r0 = r0.f108925z     // Catch:{ all -> 0x006f }
            com.google.protos.ba.a.b r1 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_REFINEMENTS     // Catch:{ all -> 0x006f }
            int r1 = r1.f174585kE     // Catch:{ all -> 0x006f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x006f }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x006d
        L_0x0060:
            com.google.android.apps.gsa.shared.an.a.j r0 = r4.f239815b     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "SRP_ON_FOCUS_SUGGESTION_COUNT"
            int r5 = r5.size()     // Catch:{ all -> 0x006f }
            r0.mo83171k(r1, r5)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return
        L_0x006d:
            monitor-exit(r4)
            return
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0073
        L_0x0072:
            throw r5
        L_0x0073:
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g.mo82411r(com.google.android.libraries.searchbox.shared.response.Response):void");
    }

    /* renamed from: s */
    public final synchronized void mo82412s() {
        this.f239815b.mo83169i("CLEAR_BUTTON_TAP_COUNT");
        mo82419z();
    }

    /* renamed from: t */
    public final synchronized void mo82413t() {
        this.f239815b.mo83171k("SEARCH_METHOD", 0);
        this.f239815b.mo83174n("SELECTED_SUGGESTION", (Parcelable) null);
    }

    /* renamed from: u */
    public final synchronized void mo82414u(int i) {
        this.f239815b.mo83171k("ACTION_CLICKED_INDEX", i);
    }

    /* renamed from: v */
    public final synchronized void mo82415v(aod aod) {
        this.f239815b.mo83171k("SEARCH_METHOD", aod.f159471J);
    }

    /* renamed from: w */
    public final synchronized void mo82416w(C64269i iVar) {
        this.f239815b.mo83172l("SELECTED_ENHANCEMENT_SUBTYPES", (ArrayList) Collection.EL.stream(new C62963cj(iVar.f173769e, C64269i.f173762f)).map(C88697f.f239813a).collect(Collectors.toCollection(C88696e.f239812a)));
    }

    /* renamed from: x */
    public final synchronized void mo82417x(Suggestion suggestion) {
        this.f239815b.mo83173m("SUGGESTION_CLICK_TIME_MS", this.f239816c.mo26871c());
        this.f239815b.mo83174n("SELECTED_SUGGESTION", suggestion);
    }

    /* renamed from: y */
    public final synchronized void mo82418y(boolean z) {
        this.f239815b.mo83170j("WIDGET_CLICKED_WITH_HINT_SHOWN", z);
    }

    /* renamed from: z */
    public final synchronized void mo82419z() {
        long c = this.f239816c.mo26871c();
        this.f239815b.mo83173m("LAST_EDIT_TIME", c);
        if (this.f239815b.mo83162b("FIRST_EDIT_TIME") == 0) {
            this.f239815b.mo83173m("FIRST_EDIT_TIME", c);
        }
    }
}
