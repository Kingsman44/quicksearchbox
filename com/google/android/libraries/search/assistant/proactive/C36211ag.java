package com.google.android.libraries.search.assistant.proactive;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.proactive.ag */
/* compiled from: PG */
public final /* synthetic */ class C36211ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36219ao f94600a;

    public /* synthetic */ C36211ag(C36219ao aoVar) {
        this.f94600a = aoVar;
    }

    public final C60870cx apply(Object obj) {
        C36219ao aoVar = this.f94600a;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : aoVar.f94623g.entrySet()) {
            hashMap.put((Integer) entry.getKey(), Integer.valueOf(Math.max(((Integer) Map.EL.getOrDefault(hashMap, entry.getKey(), 0)).intValue(), ((C36218an) entry.getValue()).f94614a)));
        }
        for (Map.Entry entry2 : aoVar.f94624h.entrySet()) {
            hashMap2.put((Integer) entry2.getKey(), Integer.valueOf(Math.max(((Integer) Map.EL.getOrDefault(hashMap2, entry2.getKey(), 0)).intValue(), ((C36218an) entry2.getValue()).f94614a)));
        }
        return aoVar.f94621e.mo40096b(hashMap, hashMap2, aoVar.f94625i.f94589g);
    }
}
