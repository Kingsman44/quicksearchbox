package androidx.camera.core.p069a;

import android.util.ArrayMap;
import androidx.camera.camera2.p063b.C1131c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.a.an */
/* compiled from: PG */
public final class C1300an {

    /* renamed from: a */
    public final Set f3740a;

    /* renamed from: b */
    public C1338by f3741b;

    /* renamed from: c */
    public int f3742c;

    /* renamed from: d */
    public boolean f3743d;

    /* renamed from: e */
    public C1341ca f3744e;

    /* renamed from: f */
    public C1131c f3745f;

    /* renamed from: g */
    private List f3746g;

    public C1300an() {
        this.f3740a = new HashSet();
        this.f3741b = C1339bz.m3625g();
        this.f3742c = -1;
        this.f3746g = new ArrayList();
        this.f3743d = false;
        this.f3744e = C1341ca.m3631a();
    }

    /* renamed from: a */
    public final C1302ap mo4157a() {
        return new C1302ap(new ArrayList(this.f3740a), C1343cc.m3633m(this.f3741b), this.f3742c, this.f3746g, this.f3743d, C1364cx.m3727c(this.f3744e), this.f3745f);
    }

    /* renamed from: b */
    public final void mo4158b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mo4159c((C1384k) it.next());
        }
    }

    /* renamed from: c */
    public final void mo4159c(C1384k kVar) {
        if (!this.f3746g.contains(kVar)) {
            this.f3746g.add(kVar);
        }
    }

    /* renamed from: d */
    public final void mo4160d(C1306at atVar, Object obj) {
        ((C1339bz) this.f3741b).mo4216c(atVar, C1339bz.f3819a, obj);
    }

    /* renamed from: e */
    public final void mo4161e(C1308av avVar) {
        Object obj;
        for (C1306at atVar : avVar.mo3959i()) {
            try {
                obj = ((C1343cc) this.f3741b).mo3953E(atVar);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Object E = avVar.mo3953E(atVar);
            if (obj instanceof C1337bx) {
                ((C1337bx) obj).mo4214e(((C1337bx) E).mo4213d());
            } else {
                if (E instanceof C1337bx) {
                    E = ((C1337bx) E).clone();
                }
                this.f3741b.mo4216c(atVar, avVar.mo3951C(atVar), E);
            }
        }
    }

    /* renamed from: f */
    public final void mo4162f(C1314ba baVar) {
        this.f3740a.add(baVar);
    }

    public C1300an(C1302ap apVar) {
        HashSet hashSet = new HashSet();
        this.f3740a = hashSet;
        this.f3741b = C1339bz.m3625g();
        this.f3742c = -1;
        this.f3746g = new ArrayList();
        this.f3743d = false;
        this.f3744e = C1341ca.m3631a();
        hashSet.addAll(apVar.f3749c);
        this.f3741b = C1339bz.m3626l(apVar.f3750d);
        this.f3742c = apVar.f3751e;
        this.f3746g.addAll(apVar.f3752f);
        this.f3743d = apVar.f3753g;
        C1364cx cxVar = apVar.f3754h;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : cxVar.mo4258e()) {
            arrayMap.put(str, cxVar.mo4257d(str));
        }
        this.f3744e = new C1341ca(arrayMap);
    }
}
