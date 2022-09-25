package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122396ao;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import java.util.Map;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.au */
/* compiled from: PG */
public final /* synthetic */ class C122494au implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122504bd f339577a;

    /* renamed from: b */
    public final /* synthetic */ int f339578b;

    /* renamed from: c */
    public final /* synthetic */ C70862aj f339579c;

    /* renamed from: d */
    public final /* synthetic */ C122108a f339580d;

    /* renamed from: e */
    public final /* synthetic */ C122430bv f339581e;

    public /* synthetic */ C122494au(C122504bd bdVar, int i, C70862aj ajVar, C122108a aVar, C122430bv bvVar) {
        this.f339577a = bdVar;
        this.f339578b = i;
        this.f339579c = ajVar;
        this.f339580d = aVar;
        this.f339581e = bvVar;
    }

    public final void run() {
        C122504bd bdVar = this.f339577a;
        int i = this.f339578b;
        C70862aj ajVar = this.f339579c;
        C122108a aVar = this.f339580d;
        C122430bv bvVar = this.f339581e;
        C122501ba baVar = bdVar.f339604d;
        C122396ao aoVar = C122396ao.PART;
        int i2 = baVar.f339596c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                Map map = baVar.f339595b;
                Integer valueOf = Integer.valueOf(i);
                if (map.containsKey(valueOf)) {
                    ajVar.mo20122b(new IllegalArgumentException(String.format(Locale.US, "Refusing to overwrite response observer for request %d.", new Object[]{valueOf})));
                } else {
                    baVar.f339595b.put(valueOf, new C122503bc(ajVar, aVar));
                    C59104x b = C122504bd.f339601a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "ODNLUFFSvcCnctnImpl");
                    ((C59052c) ((C59052c) b).mo56372aa(34789)).mo56387q("Registering request: %d", i);
                }
            } else if (i3 == 1) {
                ajVar.mo20122b(C122501ba.m201932d());
            } else if (i3 == 2) {
                ajVar.mo20122b((Throwable) baVar.f339594a.get());
            }
            bdVar.f339602b.mo20123c(bvVar);
            return;
        }
        throw null;
    }
}
