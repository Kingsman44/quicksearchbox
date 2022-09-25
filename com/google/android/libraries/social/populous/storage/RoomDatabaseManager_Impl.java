package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3928ak;
import androidx.p182p.C3963p;
import androidx.p182p.C3972y;
import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4051f;
import androidx.p186q.p187a.C4054i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public final class RoomDatabaseManager_Impl extends RoomDatabaseManager {

    /* renamed from: k */
    private volatile C42622aw f111781k;

    /* renamed from: l */
    private volatile C42669cp f111782l;

    /* renamed from: m */
    private volatile C42616aq f111783m;

    /* renamed from: n */
    private volatile C42662ci f111784n;

    /* renamed from: o */
    private volatile C42658ce f111785o;

    /* renamed from: p */
    private volatile C42642bp f111786p;

    /* renamed from: q */
    private volatile C42635bi f111787q;

    /* renamed from: r */
    private volatile C42648bv f111788r;

    /* renamed from: s */
    private volatile C42654ca f111789s;

    /* renamed from: A */
    public final C42622aw mo45695d() {
        C42622aw awVar;
        if (this.f111781k != null) {
            return this.f111781k;
        }
        synchronized (this) {
            if (this.f111781k == null) {
                this.f111781k = new C42634bh(this);
            }
            awVar = this.f111781k;
        }
        return awVar;
    }

    /* renamed from: B */
    public final C42635bi mo45696e() {
        C42635bi biVar;
        if (this.f111787q != null) {
            return this.f111787q;
        }
        synchronized (this) {
            if (this.f111787q == null) {
                this.f111787q = new C42638bl(this);
            }
            biVar = this.f111787q;
        }
        return biVar;
    }

    /* renamed from: C */
    public final C42642bp mo45697f() {
        C42642bp bpVar;
        if (this.f111786p != null) {
            return this.f111786p;
        }
        synchronized (this) {
            if (this.f111786p == null) {
                this.f111786p = new C42647bu(this);
            }
            bpVar = this.f111786p;
        }
        return bpVar;
    }

    /* renamed from: D */
    public final C42648bv mo45698g() {
        C42648bv bvVar;
        if (this.f111788r != null) {
            return this.f111788r;
        }
        synchronized (this) {
            if (this.f111788r == null) {
                this.f111788r = new C42652bz(this);
            }
            bvVar = this.f111788r;
        }
        return bvVar;
    }

    /* renamed from: E */
    public final C42654ca mo45699k() {
        C42654ca caVar;
        if (this.f111789s != null) {
            return this.f111789s;
        }
        synchronized (this) {
            if (this.f111789s == null) {
                this.f111789s = new C42657cd(this);
            }
            caVar = this.f111789s;
        }
        return caVar;
    }

    /* renamed from: F */
    public final C42658ce mo45700l() {
        C42658ce ceVar;
        if (this.f111785o != null) {
            return this.f111785o;
        }
        synchronized (this) {
            if (this.f111785o == null) {
                this.f111785o = new C42659cf(this);
            }
            ceVar = this.f111785o;
        }
        return ceVar;
    }

    /* renamed from: G */
    public final C42662ci mo45701m() {
        C42662ci ciVar;
        if (this.f111784n != null) {
            return this.f111784n;
        }
        synchronized (this) {
            if (this.f111784n == null) {
                this.f111784n = new C42668co(this);
            }
            ciVar = this.f111784n;
        }
        return ciVar;
    }

    /* renamed from: H */
    public final C42669cp mo45702n() {
        C42669cp cpVar;
        if (this.f111782l != null) {
            return this.f111782l;
        }
        synchronized (this) {
            if (this.f111782l == null) {
                this.f111782l = new C42672cs(this);
            }
            cpVar = this.f111782l;
        }
        return cpVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3972y mo8176b() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("ContextualCandidateTokens", "ContextualCandidateTokens_content");
        hashMap.put("Tokens", "Tokens_content");
        new HashMap(0);
        return new C3972y(this, hashMap, "CacheInfo", "Contacts", "ContextualCandidateContexts", "ContextualCandidates", "ContextualCandidateInfo", "ContextualCandidateTokens", "RpcCache", "Tokens");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4054i mo8177c(C3963p pVar) {
        return pVar.f12659c.mo8302a(C4051f.m11601a(pVar.f12657a, pVar.f12658b, new C3928ak(pVar, new C42661ch(this), "3a08cb3f7b193f6efa0fc5d1e99b9d44", "5e40e64b1da13763ad6300d72d4dbb67"), false, false));
    }

    /* renamed from: h */
    public final List mo8178h(Map map) {
        return Arrays.asList(new C3937a[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Map mo8179i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C42622aw.class, Collections.emptyList());
        hashMap.put(C42669cp.class, Collections.emptyList());
        hashMap.put(C42616aq.class, Collections.emptyList());
        hashMap.put(C42662ci.class, Collections.emptyList());
        hashMap.put(C42658ce.class, Collections.emptyList());
        hashMap.put(C42642bp.class, Collections.emptyList());
        hashMap.put(C42635bi.class, Collections.emptyList());
        hashMap.put(C42648bv.class, Collections.emptyList());
        hashMap.put(C42654ca.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: j */
    public final Set mo8180j() {
        return new HashSet();
    }

    /* renamed from: z */
    public final C42616aq mo45694a() {
        C42616aq aqVar;
        if (this.f111783m != null) {
            return this.f111783m;
        }
        synchronized (this) {
            if (this.f111783m == null) {
                this.f111783m = new C42619at(this);
            }
            aqVar = this.f111783m;
        }
        return aqVar;
    }
}
