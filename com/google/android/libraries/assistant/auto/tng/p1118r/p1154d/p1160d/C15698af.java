package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1158c.C15689a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.af */
/* compiled from: PG */
public final /* synthetic */ class C15698af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15706an f46839a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f46840b;

    public /* synthetic */ C15698af(C15706an anVar, C60870cx cxVar) {
        this.f46839a = anVar;
        this.f46840b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C15706an anVar = this.f46839a;
        C60870cx cxVar = this.f46840b;
        C58833ax axVar = (C58833ax) obj;
        axVar.mo56113h();
        if (axVar.mo56113h()) {
            return cxVar;
        }
        C15689a aVar = new C15689a("Error starting Soda");
        anVar.f46863l.mo20122b(aVar);
        throw aVar;
    }
}
