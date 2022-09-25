package com.bumptech.glide.load.p293a;

import androidx.p060c.C0977g;
import com.bumptech.glide.C5636l;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.C6003v;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.bumptech.glide.load.p299c.C5893d;
import com.bumptech.glide.p286e.C5551d;
import com.bumptech.glide.p291h.C5629p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.m */
/* compiled from: PG */
public final class C5720m {

    /* renamed from: a */
    public final List f17222a = new ArrayList();

    /* renamed from: b */
    public final List f17223b = new ArrayList();

    /* renamed from: c */
    public C5636l f17224c;

    /* renamed from: d */
    public Object f17225d;

    /* renamed from: e */
    public int f17226e;

    /* renamed from: f */
    public int f17227f;

    /* renamed from: g */
    public Class f17228g;

    /* renamed from: h */
    public C5960s f17229h;

    /* renamed from: i */
    public Map f17230i;

    /* renamed from: j */
    public Class f17231j;

    /* renamed from: k */
    public boolean f17232k;

    /* renamed from: l */
    public boolean f17233l;

    /* renamed from: m */
    public C5955n f17234m;

    /* renamed from: n */
    public C5997p f17235n;

    /* renamed from: o */
    public C5731x f17236o;

    /* renamed from: p */
    public boolean f17237p;

    /* renamed from: q */
    public boolean f17238q;

    /* renamed from: r */
    public C5660ac f17239r;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5964w mo12226a(Class cls) {
        C5964w wVar = (C5964w) this.f17230i.get(cls);
        if (wVar == null) {
            Iterator it = this.f17230i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    wVar = (C5964w) entry.getValue();
                    break;
                }
            }
        }
        if (wVar != null) {
            return wVar;
        }
        if (!this.f17230i.isEmpty() || !this.f17237p) {
            return C5893d.f17507b;
        }
        String valueOf = String.valueOf(cls);
        throw new IllegalArgumentException("Missing transformation for " + valueOf + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5676as mo12227b(Class cls) {
        C5676as asVar;
        C5676as asVar2;
        C5676as asVar3;
        Class cls2 = cls;
        C6003v a = this.f17224c.mo12092a();
        Class cls3 = this.f17228g;
        Class cls4 = this.f17231j;
        C5551d dVar = a.f17688i;
        C5629p pVar = (C5629p) dVar.f16802c.getAndSet((Object) null);
        if (pVar == null) {
            pVar = new C5629p();
        }
        pVar.mo12088a(cls2, cls3, cls4);
        synchronized (dVar.f16801b) {
            asVar = (C5676as) dVar.f16801b.get(pVar);
        }
        dVar.f16802c.set(pVar);
        C5551d dVar2 = a.f17688i;
        if (C5551d.f16800a.equals(asVar)) {
            return null;
        }
        if (asVar != null) {
            return asVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls5 : a.f17682c.mo11942b(cls2, cls3)) {
            for (Class cls6 : a.f17685f.mo12374b(cls5, cls4)) {
                C5726s sVar = r2;
                C5726s sVar2 = new C5726s(cls, cls5, cls6, a.f17682c.mo11941a(cls2, cls5), a.f17685f.mo12373a(cls5, cls6), a.f17689j);
                arrayList.add(sVar);
            }
        }
        if (arrayList.isEmpty()) {
            asVar2 = null;
        } else {
            asVar2 = new C5676as(cls, cls3, cls4, arrayList, a.f17689j);
        }
        C5551d dVar3 = a.f17688i;
        synchronized (dVar3.f16801b) {
            C0977g gVar = dVar3.f16801b;
            C5629p pVar2 = new C5629p(cls2, cls3, cls4);
            if (asVar2 != null) {
                asVar3 = asVar2;
            } else {
                asVar3 = C5551d.f16800a;
            }
            gVar.put(pVar2, asVar3);
        }
        return asVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo12228c() {
        if (!this.f17233l) {
            this.f17233l = true;
            this.f17223b.clear();
            List d = mo12229d();
            int size = d.size();
            for (int i = 0; i < size; i++) {
                C5763ao aoVar = (C5763ao) d.get(i);
                if (!this.f17223b.contains(aoVar.f17346a)) {
                    this.f17223b.add(aoVar.f17346a);
                }
                for (int i2 = 0; i2 < aoVar.f17347b.size(); i2++) {
                    if (!this.f17223b.contains(aoVar.f17347b.get(i2))) {
                        this.f17223b.add((C5955n) aoVar.f17347b.get(i2));
                    }
                }
            }
        }
        return this.f17223b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo12229d() {
        if (!this.f17232k) {
            this.f17232k = true;
            this.f17222a.clear();
            C6003v a = this.f17224c.mo12092a();
            List b = a.f17680a.mo12272b(this.f17225d);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                C5763ao a2 = ((C5764ap) b.get(i)).mo11928a(this.f17225d, this.f17226e, this.f17227f, this.f17229h);
                if (a2 != null) {
                    this.f17222a.add(a2);
                }
            }
        }
        return this.f17222a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final List mo12230e(File file) {
        return this.f17224c.mo12092a().f17680a.mo12272b(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo12231f(Class cls) {
        return mo12227b(cls) != null;
    }
}
