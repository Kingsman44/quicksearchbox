package com.google.apps.tiktok.monitoring.feedback;

import android.util.Pair;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62972cr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.q */
/* compiled from: PG */
final class C47480q extends C144189a {

    /* renamed from: a */
    final /* synthetic */ C47473j f123286a;

    public C47480q(C47473j jVar) {
        this.f123286a = jVar;
    }

    /* renamed from: a */
    public final List mo27016a() {
        ArrayList arrayList = new ArrayList(this.f123286a.mo51303c().size());
        C58800sl lA = this.f123286a.mo51303c().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C46669g gVar = (C46669g) entry.getValue();
            if (gVar.mo50687a() == C46667e.TEXT) {
                arrayList.add(new FileTeleporter(gVar.mo50688b().mo59174N(), (String) entry.getKey()));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo27017b() {
        ArrayList arrayList = new ArrayList(this.f123286a.mo51303c().size());
        C58800sl lA = this.f123286a.mo51303c().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (((C46669g) entry.getValue()).mo50687a() == C46667e.KEY_VALUE) {
                arrayList.add(new Pair((String) entry.getKey(), ((C46669g) entry.getValue()).mo50688b().mo59170I(C62972cr.f170009a)));
            }
        }
        return arrayList;
    }
}
