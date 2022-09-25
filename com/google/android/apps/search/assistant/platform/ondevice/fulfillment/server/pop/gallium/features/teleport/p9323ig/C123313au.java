package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.p4522b.C58495hd;
import com.google.p4272br.C56449r;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.au */
/* compiled from: PG */
final class C123313au extends C123382di {

    /* renamed from: a */
    public C56449r f341057a;

    /* renamed from: b */
    public C58495hd f341058b;

    /* renamed from: a */
    public final C123386dm mo105968a() {
        C58495hd hdVar;
        C56449r rVar = this.f341057a;
        if (rVar != null && (hdVar = this.f341058b) != null) {
            return new C123314av(rVar, hdVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f341057a == null) {
            sb.append(" pattern");
        }
        if (this.f341058b == null) {
            sb.append(" groupNameToTokenMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
