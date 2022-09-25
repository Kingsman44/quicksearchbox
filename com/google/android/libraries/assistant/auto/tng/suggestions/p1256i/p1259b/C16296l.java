package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b;

import android.database.SQLException;
import com.google.android.libraries.assistant.auto.tng.common.p919i.C13271a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.C15949a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.b.l */
/* compiled from: PG */
public final /* synthetic */ class C16296l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16300p f47959a;

    /* renamed from: b */
    public final /* synthetic */ C15777d f47960b;

    public /* synthetic */ C16296l(C16300p pVar, C15777d dVar) {
        this.f47959a = pVar;
        this.f47960b = dVar;
    }

    public final C60870cx apply(Object obj) {
        C16300p pVar = this.f47959a;
        C15777d dVar = this.f47960b;
        C58485gu guVar = (C58485gu) obj;
        C58976aa aaVar = C58975e.f156826a;
        List arrayList = new ArrayList();
        if (!dVar.mo22544b().mo22733g().equals(C16090ap.SIDE_CARD) || C13271a.m29529a(pVar.f47978l)) {
            arrayList = ((C15949a) pVar.f47972f.mo17428b()).mo22624b(dVar, guVar);
        } else {
            guVar = C58485gu.m89845m();
        }
        return C47633f.m84733g(pVar.f47969c.mo22659p(guVar, arrayList, dVar.mo22544b())).mo51513e(SQLException.class, C16293i.f47956a, pVar.f47968b);
    }
}
