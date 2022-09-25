package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.al */
/* compiled from: PG */
public final /* synthetic */ class C122485al implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f339566a;

    /* renamed from: b */
    public final /* synthetic */ Integer f339567b;

    public /* synthetic */ C122485al(Map map, Integer num) {
        this.f339566a = map;
        this.f339567b = num;
    }

    public final Object call() {
        Map map = this.f339566a;
        Integer num = this.f339567b;
        C122503bc bcVar = (C122503bc) map.get(num);
        C58976aa aaVar = C58975e.f156826a;
        if (bcVar != null) {
            return bcVar.f339600b;
        }
        C59104x d = C122504bd.f339601a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ODNLUFFSvcCnctnImpl");
        ((C59052c) ((C59052c) d).mo56372aa(34791)).mo56389s("Received context request for unknown client_request_id: %d", num);
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Invalid client_request_id %d", new Object[]{num}));
    }
}
