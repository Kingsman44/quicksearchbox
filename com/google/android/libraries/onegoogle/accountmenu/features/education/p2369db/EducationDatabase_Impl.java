package com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db;

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

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase_Impl */
/* compiled from: PG */
public final class EducationDatabase_Impl extends EducationDatabase {

    /* renamed from: k */
    private volatile C30578e f82595k;

    /* renamed from: A */
    public final C30578e mo36258A() {
        C30578e eVar;
        if (this.f82595k != null) {
            return this.f82595k;
        }
        synchronized (this) {
            if (this.f82595k == null) {
                this.f82595k = new C30585l(this);
            }
            eVar = this.f82595k;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3972y mo8176b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new C3972y(this, hashMap, "EducationState", "HighlightState");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4054i mo8177c(C3963p pVar) {
        return pVar.f12659c.mo8302a(C4051f.m11601a(pVar.f12657a, pVar.f12658b, new C3928ak(pVar, new C30575b(this), "eeffbce3bfbd69ea1ae982695ce17aa1", "8748339cfd9b753a6ac6868ce101ce6c"), false, false));
    }

    /* renamed from: h */
    public final List mo8178h(Map map) {
        return Arrays.asList(new C3937a[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Map mo8179i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C30578e.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: j */
    public final Set mo8180j() {
        return new HashSet();
    }
}
