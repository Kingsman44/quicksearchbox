package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

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

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.CardsDatabase_Impl */
/* compiled from: PG */
public final class CardsDatabase_Impl extends CardsDatabase {

    /* renamed from: k */
    private volatile C30433l f82214k;

    /* renamed from: l */
    private volatile C30427f f82215l;

    /* renamed from: B */
    public final C30433l mo35988B() {
        C30433l lVar;
        if (this.f82214k != null) {
            return this.f82214k;
        }
        synchronized (this) {
            if (this.f82214k == null) {
                this.f82214k = new C30436o(this);
            }
            lVar = this.f82214k;
        }
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3972y mo8176b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new C3972y(this, hashMap, "StorageCardDecorationState", "BackupSyncCardDecorationState");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4054i mo8177c(C3963p pVar) {
        return pVar.f12659c.mo8302a(C4051f.m11601a(pVar.f12657a, pVar.f12658b, new C3928ak(pVar, new C30431j(this), "cf66d89d29f160a56452e1ec819be807", "c5e7d25a0e7030289897dda2ecd46001"), false, false));
    }

    /* renamed from: h */
    public final List mo8178h(Map map) {
        return Arrays.asList(new C3937a[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Map mo8179i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C30433l.class, Collections.emptyList());
        hashMap.put(C30427f.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: j */
    public final Set mo8180j() {
        return new HashSet();
    }

    /* renamed from: z */
    public final C30427f mo35989z() {
        C30427f fVar;
        if (this.f82215l != null) {
            return this.f82215l;
        }
        synchronized (this) {
            if (this.f82215l == null) {
                this.f82215l = new C30430i(this);
            }
            fVar = this.f82215l;
        }
        return fVar;
    }
}
