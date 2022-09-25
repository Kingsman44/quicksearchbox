package com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a;

import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.p4522b.C58479go;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.a.b */
/* compiled from: PG */
public final class C128545b implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C128555l f353474a;

    public C128545b(C128555l lVar) {
        this.f353474a = lVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        C46690ah ahVar = C128555l.f353488a;
        C69664n.m101060f(ahVar, "DATA_SOURCE_KEY");
        return ahVar;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        Object obj = this.f353474a.f353492e.get();
        C69664n.m101060f(obj, "events.get()");
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) obj) {
            if (((C128548e) next).mo108512a() == C128558o.PENDING) {
                arrayList.add(next);
            }
        }
        return C60856cj.m92900i(C58479go.m89810b(arrayList));
    }
}
