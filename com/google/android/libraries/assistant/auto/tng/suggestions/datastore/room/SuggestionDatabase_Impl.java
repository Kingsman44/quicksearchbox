package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

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
public final class SuggestionDatabase_Impl extends SuggestionDatabase {

    /* renamed from: k */
    private volatile C16171o f47520k;

    /* renamed from: l */
    private volatile C16092ar f47521l;

    /* renamed from: m */
    private volatile C16103bb f47522m;

    /* renamed from: n */
    private volatile C16107bf f47523n;

    /* renamed from: o */
    private volatile C16144cp f47524o;

    /* renamed from: p */
    private volatile C16078ad f47525p;

    /* renamed from: q */
    private volatile C16158dc f47526q;

    /* renamed from: r */
    private volatile C16116bo f47527r;

    /* renamed from: A */
    public final C16078ad mo22667A() {
        C16078ad adVar;
        if (this.f47525p != null) {
            return this.f47525p;
        }
        synchronized (this) {
            if (this.f47525p == null) {
                this.f47525p = new C16087am(this);
            }
            adVar = this.f47525p;
        }
        return adVar;
    }

    /* renamed from: B */
    public final C16092ar mo22668B() {
        C16092ar arVar;
        if (this.f47521l != null) {
            return this.f47521l;
        }
        synchronized (this) {
            if (this.f47521l == null) {
                this.f47521l = new C16100az(this);
            }
            arVar = this.f47521l;
        }
        return arVar;
    }

    /* renamed from: C */
    public final C16103bb mo22669C() {
        C16103bb bbVar;
        if (this.f47522m != null) {
            return this.f47522m;
        }
        synchronized (this) {
            if (this.f47522m == null) {
                this.f47522m = new C16105bd(this);
            }
            bbVar = this.f47522m;
        }
        return bbVar;
    }

    /* renamed from: D */
    public final C16107bf mo22670D() {
        C16107bf bfVar;
        if (this.f47523n != null) {
            return this.f47523n;
        }
        synchronized (this) {
            if (this.f47523n == null) {
                this.f47523n = new C16112bk(this);
            }
            bfVar = this.f47523n;
        }
        return bfVar;
    }

    /* renamed from: E */
    public final C16116bo mo22671E() {
        C16116bo boVar;
        if (this.f47527r != null) {
            return this.f47527r;
        }
        synchronized (this) {
            if (this.f47527r == null) {
                this.f47527r = new C16123bv(this);
            }
            boVar = this.f47527r;
        }
        return boVar;
    }

    /* renamed from: F */
    public final C16144cp mo22672F() {
        C16144cp cpVar;
        if (this.f47524o != null) {
            return this.f47524o;
        }
        synchronized (this) {
            if (this.f47524o == null) {
                this.f47524o = new C16156da(this);
            }
            cpVar = this.f47524o;
        }
        return cpVar;
    }

    /* renamed from: G */
    public final C16158dc mo22673G() {
        C16158dc dcVar;
        if (this.f47526q != null) {
            return this.f47526q;
        }
        synchronized (this) {
            if (this.f47526q == null) {
                this.f47526q = new C16160de(this);
            }
            dcVar = this.f47526q;
        }
        return dcVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3972y mo8176b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new C3972y(this, hashMap, "candidate_suggestion", "display_info", "drive_status_update", "partner_app_signal", "suggestion_to_display", "candidate_suggestion_metrics", "vehicle_signal_event", "shortcut_to_display");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4054i mo8177c(C3963p pVar) {
        return pVar.f12659c.mo8302a(C4051f.m11601a(pVar.f12657a, pVar.f12658b, new C3928ak(pVar, new C16141cm(this), "7e1adad3e65b26b32237b405daef7b5c", "cae82b4af18ebc990658bda200966aad"), false, false));
    }

    /* renamed from: h */
    public final List mo8178h(Map map) {
        return Arrays.asList(new C3937a[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Map mo8179i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C16171o.class, Collections.emptyList());
        hashMap.put(C16092ar.class, Collections.emptyList());
        hashMap.put(C16103bb.class, Collections.emptyList());
        hashMap.put(C16107bf.class, Collections.emptyList());
        hashMap.put(C16144cp.class, Collections.emptyList());
        hashMap.put(C16078ad.class, Collections.emptyList());
        hashMap.put(C16158dc.class, Collections.emptyList());
        hashMap.put(C16116bo.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: j */
    public final Set mo8180j() {
        return new HashSet();
    }

    /* renamed from: z */
    public final C16171o mo22674z() {
        C16171o oVar;
        if (this.f47520k != null) {
            return this.f47520k;
        }
        synchronized (this) {
            if (this.f47520k == null) {
                this.f47520k = new C16075aa(this);
            }
            oVar = this.f47520k;
        }
        return oVar;
    }
}
