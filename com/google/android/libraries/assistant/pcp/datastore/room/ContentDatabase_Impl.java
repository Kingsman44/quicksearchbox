package com.google.android.libraries.assistant.pcp.datastore.room;

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
public final class ContentDatabase_Impl extends ContentDatabase {

    /* renamed from: k */
    private volatile C18621h f52634k;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3972y mo8176b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new C3972y(this, hashMap, "stored_elements", "feature_last_full_refresh");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4054i mo8177c(C3963p pVar) {
        return pVar.f12659c.mo8302a(C4051f.m11601a(pVar.f12657a, pVar.f12658b, new C3928ak(pVar, new C18618e(this), "b0c823621f157b5893516408d346bc98", "313896a42def6b78d0186a6eaf0fb8e7"), false, false));
    }

    /* renamed from: h */
    public final List mo8178h(Map map) {
        return Arrays.asList(new C3937a[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Map mo8179i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C18621h.class, Collections.emptyList());
        hashMap.put(C18620g.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: j */
    public final Set mo8180j() {
        return new HashSet();
    }

    /* renamed from: z */
    public final C18621h mo24078z() {
        C18621h hVar;
        if (this.f52634k != null) {
            return this.f52634k;
        }
        synchronized (this) {
            if (this.f52634k == null) {
                this.f52634k = new C18627n(this);
            }
            hVar = this.f52634k;
        }
        return hVar;
    }
}
