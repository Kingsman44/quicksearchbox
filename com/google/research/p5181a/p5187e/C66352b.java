package com.google.research.p5181a.p5187e;

import com.google.research.p5181a.p5188f.C66376a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.research.a.e.b */
/* compiled from: PG */
public abstract class C66352b extends C66361k {

    /* renamed from: a */
    private float[] f180420a = null;

    /* renamed from: c */
    public final HashMap f180421c = new HashMap();

    /* renamed from: d */
    public final HashMap f180422d = new HashMap();

    /* renamed from: e */
    public int f180423e;

    /* renamed from: f */
    public final HashMap f180424f = new HashMap();

    /* renamed from: g */
    public final HashMap f180425g = new HashMap();

    /* renamed from: h */
    public int f180426h = 100;

    /* renamed from: a */
    public final int mo59570a(C66376a aVar) {
        String c = aVar.mo59460c();
        long c2 = aVar.mo59467j().mo59503c();
        Integer num = (Integer) this.f180422d.get(c);
        if (num == null) {
            num = Integer.valueOf(this.f180422d.size());
            this.f180422d.put(c, num);
            this.f180424f.put(num, Long.valueOf(c2));
        }
        return num.intValue();
    }

    /* renamed from: c */
    public final C66367q mo59571c(C66376a aVar) {
        String str;
        if (!this.f180422d.containsKey(aVar.mo59460c()) && this.f180422d.size() == this.f180426h) {
            long j = Long.MAX_VALUE;
            Integer num = null;
            for (Map.Entry entry : this.f180425g.entrySet()) {
                if (((Long) entry.getValue()).longValue() < j) {
                    num = (Integer) entry.getKey();
                    j = ((Long) entry.getValue()).longValue();
                }
            }
            Iterator it = this.f180422d.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (((Integer) entry2.getValue()).equals(num)) {
                    str = (String) entry2.getKey();
                    break;
                }
            }
            if (str != null) {
                try {
                    if (!this.f180422d.isEmpty()) {
                        int size = this.f180422d.size() - 1;
                        Integer num2 = (Integer) this.f180422d.remove(str);
                        if (this.f180422d.isEmpty()) {
                            throw new C66351a();
                        } else if (num2 != null) {
                            this.f180423e -= ((Integer) this.f180421c.remove(num2)).intValue();
                            this.f180424f.remove(num2);
                            this.f180425g.remove(num2);
                            if (size > num2.intValue()) {
                                Iterator it2 = this.f180422d.entrySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Map.Entry entry3 = (Map.Entry) it2.next();
                                    if (((Integer) entry3.getValue()).intValue() == size) {
                                        entry3.setValue(num2);
                                        break;
                                    }
                                }
                                HashMap hashMap = this.f180421c;
                                Integer valueOf = Integer.valueOf(size);
                                this.f180421c.put(num2, Integer.valueOf(((Integer) hashMap.remove(valueOf)).intValue()));
                                this.f180424f.put(num2, Long.valueOf(((Long) this.f180424f.remove(valueOf)).longValue()));
                                this.f180425g.put(num2, Long.valueOf(((Long) this.f180425g.remove(valueOf)).longValue()));
                            }
                            mo59594l(num2, Integer.valueOf(size));
                        } else {
                            mo59594l((Integer) null, (Integer) null);
                        }
                    }
                } catch (C66351a unused) {
                }
            }
        }
        int a = mo59570a(aVar);
        C66367q f = mo59573f(aVar);
        HashMap hashMap2 = this.f180421c;
        Integer valueOf2 = Integer.valueOf(a);
        Integer num3 = (Integer) hashMap2.get(valueOf2);
        if (num3 == null) {
            num3 = 0;
        }
        this.f180421c.put(valueOf2, Integer.valueOf(num3.intValue() + 1));
        this.f180423e++;
        this.f180425g.put(valueOf2, Long.valueOf(aVar.mo59467j().mo59503c()));
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C66367q mo59572d(float[] fArr, C66376a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C66367q mo59573f(C66376a aVar);

    /* renamed from: t */
    public final C66367q mo59574t(C66376a aVar) {
        if (this.f180420a == null || this.f180422d.size() > this.f180420a.length) {
            this.f180420a = new float[this.f180422d.size()];
        }
        float[] fArr = this.f180420a;
        if (fArr.length > 0) {
            Arrays.fill(fArr, 0.0f);
        }
        C66367q d = mo59572d(this.f180420a, aVar);
        ArrayList arrayList = new ArrayList(this.f180422d.size());
        float[] fArr2 = d.f180458a;
        if (fArr2 != null) {
            for (Map.Entry entry : this.f180422d.entrySet()) {
                arrayList.add(new C66366p((String) entry.getKey(), fArr2[((Integer) entry.getValue()).intValue()], mo59575e()));
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        d.f180459b = arrayList;
        return d;
    }
}
