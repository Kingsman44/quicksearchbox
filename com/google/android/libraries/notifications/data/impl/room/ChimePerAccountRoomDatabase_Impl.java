package com.google.android.libraries.notifications.data.impl.room;

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
public final class ChimePerAccountRoomDatabase_Impl extends ChimePerAccountRoomDatabase {

    /* renamed from: k */
    private volatile C29814b f80829k;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3972y mo8176b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new C3972y(this, hashMap, "chime_thread_states");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4054i mo8177c(C3963p pVar) {
        return pVar.f12659c.mo8302a(C4051f.m11601a(pVar.f12657a, pVar.f12658b, new C3928ak(pVar, new C29813a(this), "ea4ce6093b9d29b56181718d906e0024", "7b4a6a59292e18bdb45d33bd6152c7d2"), false, false));
    }

    /* renamed from: h */
    public final List mo8178h(Map map) {
        return Arrays.asList(new C3937a[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Map mo8179i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C29814b.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: j */
    public final Set mo8180j() {
        return new HashSet();
    }

    /* renamed from: z */
    public final C29814b mo35115z() {
        C29814b bVar;
        if (this.f80829k != null) {
            return this.f80829k;
        }
        synchronized (this) {
            if (this.f80829k == null) {
                this.f80829k = new C29818f(this);
            }
            bVar = this.f80829k;
        }
        return bVar;
    }
}
