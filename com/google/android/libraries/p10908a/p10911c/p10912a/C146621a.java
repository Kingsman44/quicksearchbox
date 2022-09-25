package com.google.android.libraries.p10908a.p10911c.p10912a;

import android.content.SharedPreferences;
import com.google.android.libraries.storage.protostore.C42937ce;
import com.google.android.libraries.storage.protostore.C42938cf;
import com.google.protobuf.MessageLite;
import com.google.protos.p4816ai.p4820d.p4821a.C63217i;
import com.google.protos.p4816ai.p4820d.p4821a.C63218j;
import com.google.protos.p4816ai.p4820d.p4821a.C63219k;
import com.google.protos.p4816ai.p4820d.p4821a.C63220l;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.a.c.a.a */
/* compiled from: PG */
final class C146621a implements C42937ce {

    /* renamed from: a */
    public static final C146621a f396006a = new C146621a();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo34548a(C42938cf cfVar, MessageLite messageLite) {
        C63219k kVar;
        C63220l lVar = (C63220l) messageLite;
        SharedPreferences sharedPreferences = cfVar.f112327a;
        cfVar.mo46011b("ids");
        Set<String> stringSet = sharedPreferences.getStringSet("ids", (Set) null);
        if (stringSet != null && !stringSet.isEmpty()) {
            if (lVar == null || (kVar = (C63219k) lVar.toBuilder()) == null) {
                kVar = (C63219k) C63220l.f170798b.createBuilder();
            }
            C69664n.m101060f(kVar, "proto?.toBuilder() ?: Wi…nstallations.newBuilder()");
            for (String next : stringSet) {
                C63217i iVar = (C63217i) C63218j.f170793d.createBuilder();
                C69664n.m101060f(next, "id");
                int parseInt = Integer.parseInt(next);
                iVar.copyOnWrite();
                C63218j jVar = (C63218j) iVar.instance;
                jVar.f170795a |= 1;
                jVar.f170796b = parseInt;
                kVar.mo59196a((C63218j) iVar.build());
            }
            return (C63220l) kVar.build();
        } else if (lVar != null) {
            return lVar;
        } else {
            C63220l lVar2 = C63220l.f170798b;
            C69664n.m101060f(lVar2, "getDefaultInstance()");
            return lVar2;
        }
    }
}
