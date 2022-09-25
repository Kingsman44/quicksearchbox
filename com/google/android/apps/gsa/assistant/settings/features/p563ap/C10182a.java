package com.google.android.apps.gsa.assistant.settings.features.p563ap;

import android.util.Base64;
import com.google.android.apps.gsa.assistant.settings.p526e.C9751c;
import com.google.assistant.p3957l.p3967d.p3968a.p3971c.C52981a;
import com.google.assistant.p3957l.p3967d.p3968a.p3971c.C52982b;
import com.google.assistant.p3957l.p3967d.p3968a.p3971c.C52983c;
import com.google.assistant.p3957l.p3967d.p3968a.p3971c.C52984d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ap.a */
/* compiled from: PG */
final class C10182a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C10184b f34597a;

    public C10182a(C10184b bVar) {
        this.f34597a = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C10184b.f34598a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ProductivityJavascriptI");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(1245)).mo56386p("error requesting additional auth tokens");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Collection collection = (Collection) obj;
        C10184b bVar = this.f34597a;
        C52981a aVar = (C52981a) C52984d.f138893c.createBuilder();
        C52982b bVar2 = (C52982b) C52983c.f138890b.createBuilder();
        bVar2.copyOnWrite();
        C52983c cVar = (C52983c) bVar2.instance;
        C62971cq cqVar = cVar.f138892a;
        if (!cqVar.mo58948c()) {
            cVar.f138892a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) collection, (List) cVar.f138892a);
        C52983c cVar2 = (C52983c) bVar2.build();
        aVar.copyOnWrite();
        C52984d dVar = (C52984d) aVar.instance;
        cVar2.getClass();
        dVar.f138896b = cVar2;
        dVar.f138895a = 2;
        String encodeToString = Base64.encodeToString(((C52984d) aVar.build()).toByteArray(), 11);
        C9751c cVar3 = bVar.f34599b;
        cVar3.mo18014a("productivitySystemInterface.onAuthTokensRetrieved(\"" + encodeToString + "\")");
    }
}
