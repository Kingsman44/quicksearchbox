package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.os.Bundle;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29825p;
import com.google.android.libraries.notifications.data.C29826q;
import com.google.android.libraries.notifications.p2261a.p2264b.C29770a;
import com.google.android.libraries.notifications.p2261a.p2264b.C29771b;
import com.google.android.libraries.notifications.p2261a.p2264b.C29772c;
import com.google.android.libraries.notifications.p2268e.p2281g.C29860a;
import com.google.android.libraries.notifications.p2268e.p2281g.C29892c;
import com.google.android.libraries.notifications.p2268e.p2281g.C29893d;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.p4160bf.p4164b.p4165a.C55634bq;
import com.google.p4160bf.p4164b.p4165a.C55635br;
import com.google.p4160bf.p4164b.p4165a.C55636bs;
import com.google.p4160bf.p4164b.p4165a.C55683w;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.h.a.ab */
/* compiled from: PG */
public final class C29900ab extends C29899aa {

    /* renamed from: c */
    private final C29893d f81021c;

    /* renamed from: d */
    private final C29826q f81022d;

    public C29900ab(C29893d dVar, C29826q qVar) {
        this.f81021c = dVar;
        this.f81022d = qVar;
    }

    /* renamed from: e */
    public final String mo35170e() {
        return "RPC_SET_USER_PREFERENCE";
    }

    /* renamed from: g */
    public final C29892c mo35217g(Bundle bundle, C55543aw awVar, C29820k kVar) {
        C29892c cVar;
        int i;
        if (kVar == null) {
            return m55364i();
        }
        String h = kVar.mo35009h();
        boolean z = bundle.getInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET") == 1;
        List<C29825p> b = this.f81022d.mo35097b(h, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C29825p c : b) {
            try {
                C55636bs bsVar = (C55636bs) ((C55635br) ((C55635br) C55636bs.f146795d.createBuilder()).mergeFrom(c.mo35038c())).build();
                C55683w wVar = bsVar.f146798b;
                if (wVar == null) {
                    wVar = C55683w.f146907d;
                }
                String str = wVar.f146910b;
                if (str != null) {
                    C29771b bVar = new C29771b(str, !wVar.f146911c.isEmpty() ? wVar.f146911c : null);
                    int a = C55634bq.m87715a(bsVar.f146799c);
                    if (a == 0) {
                        a = 1;
                    }
                    int i2 = a - 1;
                    if (i2 != 1) {
                        i = 2;
                        if (i2 != 2) {
                            i = 1;
                        }
                    } else {
                        i = 3;
                    }
                    C29770a aVar = new C29770a(bVar, i);
                    linkedHashMap.put(aVar.f80673a, aVar);
                } else {
                    throw new NullPointerException("Null key");
                }
            } catch (C62974ct e) {
                C30058b.m55792d("SetUserPreferenceHandler", e, "Failed to parse PreferenceEntry from ChimeTaskData", new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        if (!arrayList.isEmpty()) {
            cVar = this.f81021c.mo35192g(kVar, new C29772c(arrayList), z, awVar);
        } else {
            C29860a g = C29892c.m55336g();
            g.f80954c = new IllegalArgumentException("No preferences to set.");
            g.mo35181b(false);
            cVar = g.mo35180a();
        }
        if (!cVar.mo35205f() || !cVar.mo35201d()) {
            this.f81022d.mo35099d(h, b);
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo35218h() {
        return "SetUserPrereferenceCallback";
    }
}
