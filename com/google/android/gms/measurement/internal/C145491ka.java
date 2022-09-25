package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.measurement.p10848a.C145124ab;
import com.google.android.gms.measurement.p10848a.C145125ac;
import com.google.android.gms.measurement.p10848a.C145126ad;
import com.google.android.gms.measurement.p10848a.C145129ag;
import com.google.android.gms.measurement.p10848a.C145130ah;
import com.google.android.gms.measurement.p10848a.C145133ak;
import com.google.android.gms.measurement.p10848a.C145134al;
import com.google.android.gms.measurement.p10848a.C145138ap;
import com.google.android.gms.measurement.p10848a.C145140ar;
import com.google.android.gms.measurement.p10848a.C145141as;
import com.google.android.gms.measurement.p10848a.C145142at;
import com.google.android.gms.measurement.p10848a.C145157f;
import com.google.android.gms.measurement.p10848a.C145160i;
import com.google.android.gms.measurement.p10848a.C145161j;
import com.google.android.gms.measurement.p10848a.C145166o;
import com.google.android.gms.measurement.p10848a.C145167p;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63000ds;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.ka */
/* compiled from: PG */
public final class C145491ka extends C145478jo {
    public C145491ka(C145488jy jyVar) {
        super(jyVar);
    }

    /* renamed from: A */
    static final C145130ah m236451A(C145126ad adVar, String str) {
        for (C145130ah ahVar : adVar.f392214b) {
            if (ahVar.f392227b.equals(str)) {
                return ahVar;
            }
        }
        return null;
    }

    /* renamed from: B */
    public static final String m236452B(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: C */
    public static final void m236453C(StringBuilder sb, String str, C145138ap apVar) {
        if (apVar != null) {
            m236463y(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (apVar.f392288b.size() != 0) {
                m236463y(sb, 4);
                sb.append("results: ");
                int i = 0;
                for (Long l : apVar.f392288b) {
                    int i2 = i + 1;
                    if (i != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i = i2;
                }
                sb.append(10);
            }
            if (apVar.f392287a.size() != 0) {
                m236463y(sb, 4);
                sb.append("status: ");
                int i3 = 0;
                for (Long l2 : apVar.f392287a) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i3 = i4;
                }
                sb.append(10);
            }
            if (apVar.f392289c.size() != 0) {
                m236463y(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i5 = 0;
                for (C145124ab abVar : apVar.f392289c) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append((abVar.f392208a & 1) != 0 ? Integer.valueOf(abVar.f392209b) : null);
                    sb.append(":");
                    sb.append((abVar.f392208a & 2) != 0 ? Long.valueOf(abVar.f392210c) : null);
                    i5 = i6;
                }
                sb.append("}\n");
            }
            if (apVar.f392290d.size() != 0) {
                m236463y(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i7 = 0;
                for (C145140ar arVar : apVar.f392290d) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append((arVar.f392293a & 1) != 0 ? Integer.valueOf(arVar.f392294b) : null);
                    sb.append(": [");
                    int i9 = 0;
                    for (Long longValue : arVar.f392295c) {
                        long longValue2 = longValue.longValue();
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i9 = i10;
                    }
                    sb.append("]");
                    i7 = i8;
                }
                sb.append("}\n");
            }
            m236463y(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: D */
    public static final void m236454D(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m236463y(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: E */
    static final Object m236455E(C145126ad adVar, String str) {
        C145130ah A = m236451A(adVar, str);
        if (A == null) {
            return null;
        }
        int i = A.f392226a;
        if ((i & 2) != 0) {
            return A.f392228c;
        }
        if ((i & 4) != 0) {
            return Long.valueOf(A.f392229d);
        }
        if ((i & 16) != 0) {
            return Double.valueOf(A.f392231f);
        }
        if (A.f392232g.size() <= 0) {
            return null;
        }
        C62971cq<C145130ah> cqVar = A.f392232g;
        ArrayList arrayList = new ArrayList();
        for (C145130ah ahVar : cqVar) {
            if (ahVar != null) {
                Bundle bundle = new Bundle();
                for (C145130ah ahVar2 : ahVar.f392232g) {
                    int i2 = ahVar2.f392226a;
                    if ((i2 & 2) != 0) {
                        bundle.putString(ahVar2.f392227b, ahVar2.f392228c);
                    } else if ((i2 & 4) != 0) {
                        bundle.putLong(ahVar2.f392227b, ahVar2.f392229d);
                    } else if ((i2 & 16) != 0) {
                        bundle.putDouble(ahVar2.f392227b, ahVar2.f392231f);
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: F */
    public static final void m236456F(StringBuilder sb, int i, String str, C145161j jVar) {
        if (jVar != null) {
            m236463y(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if ((jVar.f392353a & 1) != 0) {
                int a = C145160i.m235831a(jVar.f392354b);
                m236454D(sb, i, "comparison_type", (a == 0 || a == 1) ? "UNKNOWN_COMPARISON_TYPE" : a != 2 ? a != 3 ? a != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
            }
            if ((jVar.f392353a & 2) != 0) {
                m236454D(sb, i, "match_as_float", Boolean.valueOf(jVar.f392355c));
            }
            if ((jVar.f392353a & 4) != 0) {
                m236454D(sb, i, "comparison_value", jVar.f392356d);
            }
            if ((jVar.f392353a & 8) != 0) {
                m236454D(sb, i, "min_comparison_value", jVar.f392357e);
            }
            if ((jVar.f392353a & 16) != 0) {
                m236454D(sb, i, "max_comparison_value", jVar.f392358f);
            }
            m236463y(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    static int m236457a(C145133ak akVar, String str) {
        if (akVar != null) {
            for (int i = 0; i < ((C145134al) akVar.instance).f392260e.size(); i++) {
                if (str.equals(akVar.mo120671b(i).f392300c)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    static C63000ds m236458k(C63000ds dsVar, byte[] bArr) {
        C62921ba a = C62921ba.m95368a();
        if (a != null) {
            return dsVar.mergeFrom(bArr, a);
        }
        return dsVar.mergeFrom(bArr);
    }

    /* renamed from: m */
    static List m236459m(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: t */
    static boolean m236460t(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* renamed from: v */
    static boolean m236461v(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: x */
    static final void m236462x(C145125ac acVar, String str, Object obj) {
        List unmodifiableList = Collections.unmodifiableList(((C145126ad) acVar.instance).f392214b);
        int i = 0;
        while (true) {
            if (i >= unmodifiableList.size()) {
                i = -1;
                break;
            } else if (str.equals(((C145130ah) unmodifiableList.get(i)).f392227b)) {
                break;
            } else {
                i++;
            }
        }
        C145129ag agVar = (C145129ag) C145130ah.f392224h.createBuilder();
        agVar.copyOnWrite();
        C145130ah ahVar = (C145130ah) agVar.instance;
        ahVar.f392226a |= 1;
        ahVar.f392227b = str;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            agVar.copyOnWrite();
            C145130ah ahVar2 = (C145130ah) agVar.instance;
            ahVar2.f392226a |= 4;
            ahVar2.f392229d = longValue;
        }
        if (i >= 0) {
            acVar.copyOnWrite();
            C145126ad adVar = (C145126ad) acVar.instance;
            C145130ah ahVar3 = (C145130ah) agVar.build();
            ahVar3.getClass();
            adVar.mo120667a();
            adVar.f392214b.set(i, ahVar3);
            return;
        }
        acVar.mo120663b(agVar);
    }

    /* renamed from: y */
    public static final void m236463y(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: z */
    static final boolean m236464z(AppMetadata appMetadata) {
        C143919bh.m233958a(appMetadata);
        return !TextUtils.isEmpty(appMetadata.f392501b) || !TextUtils.isEmpty(appMetadata.f392516q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo121232b(byte[] bArr) {
        C143919bh.m233958a(bArr);
        this.f393011w.mo120977o().mo120904g();
        MessageDigest B = C145495ke.m236482B();
        if (B != null) {
            return C145495ke.m236494q(B.digest(bArr));
        }
        this.f393011w.mo120965ar().f392795c.mo120894a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo120805c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Bundle mo121233d(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(mo121233d((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f393011w.mo120965ar().f392795c.mo120894a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo121234e(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.ff r5 = r4.f393011w     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392795c     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo120894a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145491ka.mo121234e(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r0.get("_o");
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.EventParcel mo121235i(com.google.p4583d.p4584a.p4587c.C60971b r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.f165093c
            r1 = 1
            android.os.Bundle r0 = r8.mo121233d(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = "app"
        L_0x001c:
            r5 = r1
            java.lang.String r1 = r9.f165091a
            java.lang.String r1 = com.google.android.gms.measurement.internal.C145385gc.m236291b(r1)
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = r9.f165091a
        L_0x0027:
            r3 = r1
            com.google.android.gms.measurement.internal.EventParcel r1 = new com.google.android.gms.measurement.internal.EventParcel
            com.google.android.gms.measurement.internal.EventParams r4 = new com.google.android.gms.measurement.internal.EventParams
            r4.<init>(r0)
            long r6 = r9.f165092b
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145491ka.mo121235i(com.google.d.a.c.b):com.google.android.gms.measurement.internal.EventParcel");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C145126ad mo121236j(C145233am amVar) {
        C145125ac acVar = (C145125ac) C145126ad.f392211g.createBuilder();
        long j = amVar.f392594e;
        acVar.copyOnWrite();
        C145126ad adVar = (C145126ad) acVar.instance;
        adVar.f392213a |= 4;
        adVar.f392217e = j;
        C145235ao aoVar = new C145235ao(amVar.f392595f);
        while (aoVar.hasNext()) {
            String a = aoVar.next();
            C145129ag agVar = (C145129ag) C145130ah.f392224h.createBuilder();
            agVar.copyOnWrite();
            C145130ah ahVar = (C145130ah) agVar.instance;
            a.getClass();
            ahVar.f392226a |= 1;
            ahVar.f392227b = a;
            Object obj = amVar.f392595f.f392535a.get(a);
            C143919bh.m233958a(obj);
            mo121242r(agVar, obj);
            acVar.mo120663b(agVar);
        }
        return (C145126ad) acVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final List mo121237l(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f393011w.mo120965ar().f392798f.mo120895b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f393011w.mo120965ar().f392798f.mo120896c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Map mo121238n(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo121238n((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo121238n((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo121238n((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: o */
    public final void mo121239o(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C145130ah ahVar = (C145130ah) it.next();
                if (ahVar != null) {
                    m236463y(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m236454D(sb, i2, "name", (ahVar.f392226a & 1) != 0 ? this.f393011w.f392942l.mo120891d(ahVar.f392227b) : null);
                    m236454D(sb, i2, "string_value", (ahVar.f392226a & 2) != 0 ? ahVar.f392228c : null);
                    m236454D(sb, i2, "int_value", (ahVar.f392226a & 4) != 0 ? Long.valueOf(ahVar.f392229d) : null);
                    if ((ahVar.f392226a & 16) != 0) {
                        d = Double.valueOf(ahVar.f392231f);
                    }
                    m236454D(sb, i2, "double_value", d);
                    if (ahVar.f392232g.size() > 0) {
                        mo121239o(sb, i2, ahVar.f392232g);
                    }
                    m236463y(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo121240p(StringBuilder sb, int i, C145157f fVar) {
        String str;
        if (fVar != null) {
            m236463y(sb, i);
            sb.append("filter {\n");
            if ((fVar.f392345a & 4) != 0) {
                m236454D(sb, i, "complement", Boolean.valueOf(fVar.f392348d));
            }
            if ((fVar.f392345a & 8) != 0) {
                m236454D(sb, i, "param_name", this.f393011w.f392942l.mo120891d(fVar.f392349e));
            }
            if ((fVar.f392345a & 1) != 0) {
                int i2 = i + 1;
                C145167p pVar = fVar.f392346b;
                if (pVar == null) {
                    pVar = C145167p.f392369f;
                }
                if (pVar != null) {
                    m236463y(sb, i2);
                    sb.append("string_filter {\n");
                    if ((pVar.f392371a & 1) != 0) {
                        int a = C145166o.m235832a(pVar.f392372b);
                        if (a != 0) {
                            switch (a) {
                                case 1:
                                    break;
                                case 2:
                                    str = "REGEXP";
                                    break;
                                case 3:
                                    str = "BEGINS_WITH";
                                    break;
                                case 4:
                                    str = "ENDS_WITH";
                                    break;
                                case 5:
                                    str = "PARTIAL";
                                    break;
                                case 6:
                                    str = "EXACT";
                                    break;
                                default:
                                    str = "IN_LIST";
                                    break;
                            }
                        }
                        str = "UNKNOWN_MATCH_TYPE";
                        m236454D(sb, i2, "match_type", str);
                    }
                    if ((pVar.f392371a & 2) != 0) {
                        m236454D(sb, i2, "expression", pVar.f392373c);
                    }
                    if ((pVar.f392371a & 4) != 0) {
                        m236454D(sb, i2, "case_sensitive", Boolean.valueOf(pVar.f392374d));
                    }
                    if (pVar.f392375e.size() > 0) {
                        m236463y(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : pVar.f392375e) {
                            m236463y(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m236463y(sb, i2);
                    sb.append("}\n");
                }
            }
            if ((fVar.f392345a & 2) != 0) {
                int i3 = i + 1;
                C145161j jVar = fVar.f392347c;
                if (jVar == null) {
                    jVar = C145161j.f392351g;
                }
                m236456F(sb, i3, "number_filter", jVar);
            }
            m236463y(sb, i);
            sb.append("}\n");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo121241q(C145133ak akVar) {
        this.f393011w.mo120965ar().f392803k.mo120894a("Checking account type status for ad personalization signals");
        C145351ew ewVar = this.f393327l.f393353a;
        C145488jy.m236409I(ewVar);
        if (ewVar.mo120941f(((C145134al) akVar.instance).f392272q)) {
            C145228ah ahVar = this.f393327l.f393355c;
            C145488jy.m236409I(ahVar);
            C145382g f = ahVar.mo120808f(((C145134al) akVar.instance).f392272q);
            if (f != null && f.mo121022Q() && this.f393011w.mo120968c().mo120833a()) {
                this.f393011w.mo120965ar().f392802j.mo120894a("Turning off ad personalization due to account type");
                C145141as asVar = (C145141as) C145142at.f392296g.createBuilder();
                asVar.copyOnWrite();
                C145142at atVar = (C145142at) asVar.instance;
                atVar.f392298a |= 2;
                atVar.f392300c = "_npa";
                C145232al c = this.f393011w.mo120968c();
                c.mo120904g();
                long j = c.f392588d;
                asVar.copyOnWrite();
                C145142at atVar2 = (C145142at) asVar.instance;
                atVar2.f392298a |= 1;
                atVar2.f392299b = j;
                asVar.copyOnWrite();
                C145142at atVar3 = (C145142at) asVar.instance;
                atVar3.f392298a |= 8;
                atVar3.f392302e = 1;
                C145142at atVar4 = (C145142at) asVar.build();
                for (int i = 0; i < ((C145134al) akVar.instance).f392260e.size(); i++) {
                    if ("_npa".equals(akVar.mo120671b(i).f392300c)) {
                        akVar.mo120677h(i, atVar4);
                        return;
                    }
                }
                akVar.mo120674e(atVar4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo121242r(C145129ag agVar, Object obj) {
        C143919bh.m233958a(obj);
        agVar.copyOnWrite();
        C145130ah ahVar = (C145130ah) agVar.instance;
        C145130ah ahVar2 = C145130ah.f392224h;
        ahVar.f392226a &= -3;
        ahVar.f392228c = C145130ah.f392224h.f392228c;
        agVar.copyOnWrite();
        C145130ah ahVar3 = (C145130ah) agVar.instance;
        ahVar3.f392226a &= -5;
        ahVar3.f392229d = 0;
        agVar.copyOnWrite();
        C145130ah ahVar4 = (C145130ah) agVar.instance;
        ahVar4.f392226a &= -17;
        ahVar4.f392231f = C59203do.f157270a;
        agVar.copyOnWrite();
        ((C145130ah) agVar.instance).f392232g = C145130ah.emptyProtobufList();
        if (obj instanceof String) {
            String str = (String) obj;
            agVar.copyOnWrite();
            C145130ah ahVar5 = (C145130ah) agVar.instance;
            str.getClass();
            ahVar5.f392226a |= 2;
            ahVar5.f392228c = str;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            agVar.copyOnWrite();
            C145130ah ahVar6 = (C145130ah) agVar.instance;
            ahVar6.f392226a |= 4;
            ahVar6.f392229d = longValue;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            agVar.copyOnWrite();
            C145130ah ahVar7 = (C145130ah) agVar.instance;
            ahVar7.f392226a |= 16;
            ahVar7.f392231f = doubleValue;
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C145129ag agVar2 = (C145129ag) C145130ah.f392224h.createBuilder();
                    for (String str2 : bundle.keySet()) {
                        C145129ag agVar3 = (C145129ag) C145130ah.f392224h.createBuilder();
                        agVar3.copyOnWrite();
                        C145130ah ahVar8 = (C145130ah) agVar3.instance;
                        str2.getClass();
                        ahVar8.f392226a |= 1;
                        ahVar8.f392227b = str2;
                        Object obj2 = bundle.get(str2);
                        if (obj2 instanceof Long) {
                            long longValue2 = ((Long) obj2).longValue();
                            agVar3.copyOnWrite();
                            C145130ah ahVar9 = (C145130ah) agVar3.instance;
                            ahVar9.f392226a |= 4;
                            ahVar9.f392229d = longValue2;
                        } else if (obj2 instanceof String) {
                            String str3 = (String) obj2;
                            agVar3.copyOnWrite();
                            C145130ah ahVar10 = (C145130ah) agVar3.instance;
                            str3.getClass();
                            ahVar10.f392226a |= 2;
                            ahVar10.f392228c = str3;
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            agVar3.copyOnWrite();
                            C145130ah ahVar11 = (C145130ah) agVar3.instance;
                            ahVar11.f392226a |= 16;
                            ahVar11.f392231f = doubleValue2;
                        }
                        agVar2.copyOnWrite();
                        C145130ah ahVar12 = (C145130ah) agVar2.instance;
                        C145130ah ahVar13 = (C145130ah) agVar3.build();
                        ahVar13.getClass();
                        ahVar12.mo120668a();
                        ahVar12.f392232g.add(ahVar13);
                    }
                    if (((C145130ah) agVar2.instance).f392232g.size() > 0) {
                        arrayList.add((C145130ah) agVar2.build());
                    }
                }
            }
            agVar.copyOnWrite();
            C145130ah ahVar14 = (C145130ah) agVar.instance;
            ahVar14.mo120668a();
            C62947c.addAll((Iterable) arrayList, (List) ahVar14.f392232g);
        } else {
            this.f393011w.mo120965ar().f392795c.mo120895b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo121243s(C145141as asVar, Object obj) {
        asVar.copyOnWrite();
        C145142at atVar = (C145142at) asVar.instance;
        C145142at atVar2 = C145142at.f392296g;
        atVar.f392298a &= -5;
        atVar.f392301d = C145142at.f392296g.f392301d;
        asVar.copyOnWrite();
        C145142at atVar3 = (C145142at) asVar.instance;
        atVar3.f392298a &= -9;
        atVar3.f392302e = 0;
        asVar.copyOnWrite();
        C145142at atVar4 = (C145142at) asVar.instance;
        atVar4.f392298a &= -33;
        atVar4.f392303f = C59203do.f157270a;
        if (obj instanceof String) {
            asVar.copyOnWrite();
            C145142at atVar5 = (C145142at) asVar.instance;
            atVar5.f392298a |= 4;
            atVar5.f392301d = (String) obj;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            asVar.copyOnWrite();
            C145142at atVar6 = (C145142at) asVar.instance;
            atVar6.f392298a |= 8;
            atVar6.f392302e = longValue;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            asVar.copyOnWrite();
            C145142at atVar7 = (C145142at) asVar.instance;
            atVar7.f392298a |= 32;
            atVar7.f392303f = doubleValue;
        } else {
            this.f393011w.mo120965ar().f392795c.mo120895b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo121244u(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        C144006f fVar = this.f393011w.f392924A;
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final byte[] mo121245w(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Failed to gzip content", e);
            throw e;
        }
    }
}
