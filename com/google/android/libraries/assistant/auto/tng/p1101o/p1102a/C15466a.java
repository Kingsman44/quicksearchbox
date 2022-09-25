package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.common.p4526f.C59052c;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15466a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15478d f46384a;

    /* renamed from: b */
    public final /* synthetic */ Long f46385b;

    /* renamed from: c */
    public final /* synthetic */ Long f46386c;

    public /* synthetic */ C15466a(C15478d dVar, Long l, Long l2) {
        this.f46384a = dVar;
        this.f46385b = l;
        this.f46386c = l2;
    }

    public final void run() {
        C15478d dVar = this.f46384a;
        Long l = this.f46385b;
        Long l2 = this.f46386c;
        if (!dVar.f46427b.containsKey(l)) {
            ((C59052c) ((C59052c) C15478d.f46426a.mo56226d()).mo56372aa(45164)).mo56386p("#updateRequestId(): No previous request id in the map, failed to update.");
            return;
        }
        Map map = dVar.f46427b;
        Long l3 = (Long) map.remove(l);
        l3.getClass();
        map.put(l2, l3);
    }
}
