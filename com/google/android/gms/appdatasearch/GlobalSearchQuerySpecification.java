package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public class GlobalSearchQuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142827x();

    /* renamed from: a */
    final CorpusId[] f387471a;

    /* renamed from: b */
    public final int f387472b;

    /* renamed from: c */
    final CorpusScoringInfo[] f387473c;

    /* renamed from: d */
    public final int f387474d;

    /* renamed from: e */
    public final int f387475e;

    /* renamed from: f */
    public final int f387476f;

    /* renamed from: g */
    public final String f387477g;

    /* renamed from: h */
    public final boolean f387478h;

    /* renamed from: i */
    public final byte[] f387479i;

    /* renamed from: j */
    public final boolean f387480j;

    /* renamed from: k */
    public final boolean f387481k;

    /* renamed from: l */
    public final boolean f387482l;

    /* renamed from: m */
    public final int[] f387483m;

    /* renamed from: n */
    public final byte[] f387484n;

    /* renamed from: o */
    public final STSortSpec f387485o;

    /* renamed from: p */
    public final String f387486p;

    /* renamed from: q */
    public final CacheSpec f387487q;

    /* renamed from: r */
    private final transient Map f387488r;

    /* renamed from: s */
    private final transient Map f387489s;

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchQuerySpecification) {
            GlobalSearchQuerySpecification globalSearchQuerySpecification = (GlobalSearchQuerySpecification) obj;
            if (!C143912ba.m233950b(Integer.valueOf(this.f387472b), Integer.valueOf(globalSearchQuerySpecification.f387472b)) || !C143912ba.m233950b(Integer.valueOf(this.f387474d), Integer.valueOf(globalSearchQuerySpecification.f387474d)) || !C143912ba.m233950b(Integer.valueOf(this.f387475e), Integer.valueOf(globalSearchQuerySpecification.f387475e)) || !C143912ba.m233950b(Integer.valueOf(this.f387476f), Integer.valueOf(globalSearchQuerySpecification.f387476f)) || !C143912ba.m233950b(this.f387477g, globalSearchQuerySpecification.f387477g) || !C143912ba.m233950b(Boolean.valueOf(this.f387478h), Boolean.valueOf(globalSearchQuerySpecification.f387478h)) || !C143912ba.m233950b(Boolean.valueOf(this.f387480j), Boolean.valueOf(globalSearchQuerySpecification.f387480j)) || !C143912ba.m233950b(Boolean.valueOf(this.f387481k), Boolean.valueOf(globalSearchQuerySpecification.f387481k)) || !C143912ba.m233950b(Boolean.valueOf(this.f387482l), Boolean.valueOf(globalSearchQuerySpecification.f387482l)) || !C143912ba.m233950b(this.f387489s, globalSearchQuerySpecification.f387489s) || !C143912ba.m233950b(this.f387485o, globalSearchQuerySpecification.f387485o) || !C143912ba.m233950b(this.f387486p, globalSearchQuerySpecification.f387486p) || !Arrays.equals(this.f387471a, globalSearchQuerySpecification.f387471a) || !Arrays.equals(this.f387479i, globalSearchQuerySpecification.f387479i) || !Arrays.equals(this.f387473c, globalSearchQuerySpecification.f387473c) || !Arrays.equals(this.f387483m, globalSearchQuerySpecification.f387483m) || !Arrays.equals(this.f387484n, globalSearchQuerySpecification.f387484n) || !C143912ba.m233950b(this.f387487q, globalSearchQuerySpecification.f387487q)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f387472b), Integer.valueOf(this.f387474d), Integer.valueOf(this.f387475e), Integer.valueOf(this.f387476f), this.f387477g, Boolean.valueOf(this.f387478h), Boolean.valueOf(this.f387480j), Boolean.valueOf(this.f387481k), Boolean.valueOf(this.f387482l), this.f387489s, this.f387485o, this.f387486p, Integer.valueOf(Arrays.hashCode(this.f387471a)), Integer.valueOf(Arrays.hashCode(this.f387479i)), Integer.valueOf(Arrays.hashCode(this.f387473c)), Integer.valueOf(Arrays.hashCode(this.f387484n)), this.f387487q});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("mFilter: [");
        Map map = this.f387488r;
        if (map != null) {
            for (String str : map.keySet()) {
                String str2 = BuildConfig.FLAVOR;
                for (String str3 : (Set) this.f387488r.get(str)) {
                    str2 = str2 + str3 + ",";
                }
                sb.append("key:");
                sb.append(str);
                sb.append(", values:");
                sb.append(str2);
                sb.append("\n");
            }
        }
        sb.append("]\nmCorpusScoringInfoMap: [");
        Map map2 = this.f387489s;
        if (map2 != null) {
            for (CorpusId corpusId : map2.keySet()) {
                sb.append(corpusId.toString().concat("\n"));
            }
        }
        sb.append("]\n");
        if (this.f387485o != null) {
            sb.append("STSortSpec: ");
            sb.append(this.f387485o.toString());
            sb.append("\n");
        }
        if (this.f387486p != null) {
            sb.append("Origin: ");
            sb.append(this.f387486p);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f387471a, i);
        C143947c.m234089h(parcel, 2, this.f387472b);
        C143947c.m234079B(parcel, 3, this.f387473c, i);
        C143947c.m234089h(parcel, 4, this.f387474d);
        C143947c.m234089h(parcel, 5, this.f387475e);
        C143947c.m234089h(parcel, 6, this.f387476f);
        C143947c.m234106y(parcel, 7, this.f387477g);
        C143947c.m234084c(parcel, 8, this.f387478h);
        C143947c.m234094m(parcel, 9, this.f387479i);
        C143947c.m234084c(parcel, 10, this.f387480j);
        C143947c.m234084c(parcel, 11, this.f387481k);
        C143947c.m234084c(parcel, 12, this.f387482l);
        C143947c.m234099r(parcel, 13, this.f387483m);
        C143947c.m234094m(parcel, 14, this.f387484n);
        C143947c.m234105x(parcel, 15, this.f387485o, i);
        C143947c.m234106y(parcel, 16, this.f387486p);
        C143947c.m234105x(parcel, 18, this.f387487q, i);
        C143947c.m234083b(parcel, a);
    }

    public GlobalSearchQuerySpecification(CorpusId[] corpusIdArr, int i, CorpusScoringInfo[] corpusScoringInfoArr, int i2, int i3, int i4, String str, boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int[] iArr, byte[] bArr2, STSortSpec sTSortSpec, String str2, CacheSpec cacheSpec) {
        int length;
        CorpusId[] corpusIdArr2 = corpusIdArr;
        CorpusScoringInfo[] corpusScoringInfoArr2 = corpusScoringInfoArr;
        this.f387471a = corpusIdArr2;
        this.f387472b = i;
        this.f387474d = i2;
        this.f387475e = i3;
        this.f387476f = i4;
        this.f387477g = str;
        this.f387478h = z;
        this.f387479i = bArr;
        this.f387480j = z2;
        this.f387481k = z3;
        this.f387482l = z4;
        this.f387483m = iArr;
        this.f387484n = bArr2;
        this.f387485o = sTSortSpec;
        this.f387486p = str2;
        this.f387487q = cacheSpec;
        this.f387473c = corpusScoringInfoArr2;
        if (corpusIdArr2 == null || corpusIdArr2.length == 0) {
            this.f387488r = null;
        } else {
            this.f387488r = new HashMap();
            for (int i5 = 0; i5 < corpusIdArr2.length; i5++) {
                Set set = (Set) this.f387488r.get(corpusIdArr2[i5].f387417a);
                if (set == null) {
                    set = new HashSet();
                    this.f387488r.put(corpusIdArr2[i5].f387417a, set);
                }
                String str3 = corpusIdArr2[i5].f387418b;
                if (str3 != null) {
                    set.add(str3);
                }
            }
        }
        if (corpusScoringInfoArr2 == null || (length = corpusScoringInfoArr2.length) == 0) {
            this.f387489s = null;
            return;
        }
        this.f387489s = new HashMap(length);
        for (CorpusScoringInfo corpusScoringInfo : corpusScoringInfoArr2) {
            this.f387489s.put(corpusScoringInfo.f387420a, corpusScoringInfo);
        }
    }
}
