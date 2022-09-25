package androidx.work.impl;

import androidx.p182p.C3928ak;
import androidx.p182p.C3963p;
import androidx.p182p.C3972y;
import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4051f;
import androidx.p186q.p187a.C4054i;
import androidx.work.impl.p207b.C4467ab;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.p207b.C4485at;
import androidx.work.impl.p207b.C4488aw;
import androidx.work.impl.p207b.C4491az;
import androidx.work.impl.p207b.C4492b;
import androidx.work.impl.p207b.C4495d;
import androidx.work.impl.p207b.C4497f;
import androidx.work.impl.p207b.C4499h;
import androidx.work.impl.p207b.C4500i;
import androidx.work.impl.p207b.C4501j;
import androidx.work.impl.p207b.C4503l;
import androidx.work.impl.p207b.C4507p;
import androidx.work.impl.p207b.C4511t;
import androidx.work.impl.p207b.C4513v;
import androidx.work.impl.p207b.C4515x;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k */
    private volatile C4471af f14090k;

    /* renamed from: l */
    private volatile C4492b f14091l;

    /* renamed from: m */
    private volatile C4488aw f14092m;

    /* renamed from: n */
    private volatile C4503l f14093n;

    /* renamed from: o */
    private volatile C4511t f14094o;

    /* renamed from: p */
    private volatile C4515x f14095p;

    /* renamed from: q */
    private volatile C4497f f14096q;

    /* renamed from: r */
    private volatile C4500i f14097r;

    /* renamed from: A */
    public final C4497f mo9359A() {
        C4497f fVar;
        if (this.f14096q != null) {
            return this.f14096q;
        }
        synchronized (this) {
            if (this.f14096q == null) {
                this.f14096q = new C4499h(this);
            }
            fVar = this.f14096q;
        }
        return fVar;
    }

    /* renamed from: B */
    public final C4500i mo9360B() {
        C4500i iVar;
        if (this.f14097r != null) {
            return this.f14097r;
        }
        synchronized (this) {
            if (this.f14097r == null) {
                this.f14097r = new C4501j(this);
            }
            iVar = this.f14097r;
        }
        return iVar;
    }

    /* renamed from: C */
    public final C4503l mo9361C() {
        C4503l lVar;
        if (this.f14093n != null) {
            return this.f14093n;
        }
        synchronized (this) {
            if (this.f14093n == null) {
                this.f14093n = new C4507p(this);
            }
            lVar = this.f14093n;
        }
        return lVar;
    }

    /* renamed from: D */
    public final C4511t mo9362D() {
        C4511t tVar;
        if (this.f14094o != null) {
            return this.f14094o;
        }
        synchronized (this) {
            if (this.f14094o == null) {
                this.f14094o = new C4513v(this);
            }
            tVar = this.f14094o;
        }
        return tVar;
    }

    /* renamed from: E */
    public final C4515x mo9363E() {
        C4515x xVar;
        if (this.f14095p != null) {
            return this.f14095p;
        }
        synchronized (this) {
            if (this.f14095p == null) {
                this.f14095p = new C4467ab(this);
            }
            xVar = this.f14095p;
        }
        return xVar;
    }

    /* renamed from: F */
    public final C4471af mo9364F() {
        C4471af afVar;
        if (this.f14090k != null) {
            return this.f14090k;
        }
        synchronized (this) {
            if (this.f14090k == null) {
                this.f14090k = new C4485at(this);
            }
            afVar = this.f14090k;
        }
        return afVar;
    }

    /* renamed from: G */
    public final C4488aw mo9365G() {
        C4488aw awVar;
        if (this.f14092m != null) {
            return this.f14092m;
        }
        synchronized (this) {
            if (this.f14092m == null) {
                this.f14092m = new C4491az(this);
            }
            awVar = this.f14092m;
        }
        return awVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3972y mo8176b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new C3972y(this, hashMap, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4054i mo8177c(C3963p pVar) {
        return pVar.f12659c.mo8302a(C4051f.m11601a(pVar.f12657a, pVar.f12658b, new C3928ak(pVar, new C4450ae(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e"), false, false));
    }

    /* renamed from: h */
    public final List mo8178h(Map map) {
        return Arrays.asList(new C3937a[]{new C4448ac(), new C4449ad()});
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Map mo8179i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C4471af.class, Collections.emptyList());
        hashMap.put(C4492b.class, Collections.emptyList());
        hashMap.put(C4488aw.class, Collections.emptyList());
        hashMap.put(C4503l.class, Collections.emptyList());
        hashMap.put(C4511t.class, Collections.emptyList());
        hashMap.put(C4515x.class, Collections.emptyList());
        hashMap.put(C4497f.class, Collections.emptyList());
        hashMap.put(C4500i.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: j */
    public final Set mo8180j() {
        return new HashSet();
    }

    /* renamed from: z */
    public final C4492b mo9366z() {
        C4492b bVar;
        if (this.f14091l != null) {
            return this.f14091l;
        }
        synchronized (this) {
            if (this.f14091l == null) {
                this.f14091l = new C4495d(this);
            }
            bVar = this.f14091l;
        }
        return bVar;
    }
}
