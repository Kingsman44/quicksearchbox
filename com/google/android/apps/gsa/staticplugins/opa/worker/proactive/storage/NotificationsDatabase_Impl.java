package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

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
public final class NotificationsDatabase_Impl extends NotificationsDatabase {

    /* renamed from: k */
    private volatile C114484d f317439k;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3972y mo8176b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new C3972y(this, hashMap, "opa_delayed_notification");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4054i mo8177c(C3963p pVar) {
        return pVar.f12659c.mo8302a(C4051f.m11601a(pVar.f12657a, pVar.f12658b, new C3928ak(pVar, new C114494n(this), "ed1b6e318977d6d859fe4767649f5a2b", "2b19bb20fd135da19b39247dbcd7a04d"), false, false));
    }

    /* renamed from: h */
    public final List mo8178h(Map map) {
        return Arrays.asList(new C3937a[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Map mo8179i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C114484d.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: j */
    public final Set mo8180j() {
        return new HashSet();
    }

    /* renamed from: z */
    public final C114484d mo101335z() {
        C114484d dVar;
        if (this.f317439k != null) {
            return this.f317439k;
        }
        synchronized (this) {
            if (this.f317439k == null) {
                this.f317439k = new C114491k(this);
            }
            dVar = this.f317439k;
        }
        return dVar;
    }
}
