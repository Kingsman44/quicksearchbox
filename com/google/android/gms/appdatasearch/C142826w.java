package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144002b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.appdatasearch.w */
/* compiled from: PG */
public final class C142826w {

    /* renamed from: a */
    public final Map f387608a = new HashMap();

    /* renamed from: b */
    public int f387609b = 1;

    /* renamed from: c */
    public int f387610c = 0;

    /* renamed from: d */
    public boolean f387611d;

    /* renamed from: e */
    public boolean f387612e = true;

    /* renamed from: f */
    public STSortSpec f387613f;

    /* renamed from: g */
    public String f387614g;

    /* renamed from: h */
    public CacheSpec f387615h;

    /* renamed from: i */
    private final Map f387616i = new HashMap();

    /* renamed from: j */
    private final List f387617j = new ArrayList();

    /* renamed from: a */
    public final GlobalSearchQuerySpecification mo117755a() {
        ArrayList arrayList = new ArrayList(this.f387608a.size());
        for (Map.Entry entry : this.f387608a.entrySet()) {
            if (((Set) entry.getValue()).isEmpty()) {
                arrayList.add(new CorpusId((String) entry.getKey(), (String) null, (Bundle) null));
            } else {
                for (String corpusId : (Set) entry.getValue()) {
                    arrayList.add(new CorpusId((String) entry.getKey(), corpusId, (Bundle) null));
                }
            }
        }
        CorpusScoringInfo[] corpusScoringInfoArr = new CorpusScoringInfo[this.f387616i.size()];
        int i = 0;
        for (CorpusScoringInfo corpusScoringInfo : this.f387616i.values()) {
            corpusScoringInfoArr[i] = corpusScoringInfo;
            i++;
        }
        return new GlobalSearchQuerySpecification((CorpusId[]) arrayList.toArray(new CorpusId[0]), 0, corpusScoringInfoArr, 0, this.f387609b, this.f387610c, (String) null, this.f387611d, (byte[]) null, true, this.f387612e, false, C144002b.m234181b(this.f387617j), (byte[]) null, this.f387613f, this.f387614g, this.f387615h);
    }

    /* renamed from: b */
    public final void mo117756b(CorpusId corpusId) {
        String str = corpusId.f387417a;
        String str2 = corpusId.f387418b;
        C143919bh.m233971n(str, "Package name can't be null.");
        C143919bh.m233971n(str2, "CorpusNames can't be null");
        boolean z = true;
        if (this.f387608a.containsKey(str) && ((Set) this.f387608a.get(str)).isEmpty()) {
            z = false;
        }
        C143919bh.m233967j(z, "Package specific filter already exists.");
        Set set = (Set) this.f387608a.get(str);
        if (set == null) {
            set = new HashSet();
            this.f387608a.put(str, set);
        }
        set.add(str2);
    }

    /* renamed from: c */
    public final void mo117757c(CorpusId corpusId, int i, int i2) {
        this.f387616i.put(corpusId, new CorpusScoringInfo(corpusId, i, i2));
    }
}
