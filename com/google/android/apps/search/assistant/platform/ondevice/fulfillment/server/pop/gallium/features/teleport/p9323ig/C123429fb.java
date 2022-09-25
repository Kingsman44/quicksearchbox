package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p5028p.p5029a.C64979f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.fb */
/* compiled from: PG */
public final /* synthetic */ class C123429fb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341200a;

    /* renamed from: b */
    public final /* synthetic */ C123503i f341201b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f341202c;

    /* renamed from: d */
    public final /* synthetic */ C123427f f341203d;

    /* renamed from: e */
    public final /* synthetic */ C64979f f341204e;

    public /* synthetic */ C123429fb(C123459ge geVar, C123503i iVar, C60870cx cxVar, C123427f fVar, C64979f fVar2) {
        this.f341200a = geVar;
        this.f341201b = iVar;
        this.f341202c = cxVar;
        this.f341203d = fVar;
        this.f341204e = fVar2;
    }

    public final C60870cx apply(Object obj) {
        C123459ge geVar = this.f341200a;
        C123503i iVar = this.f341201b;
        C60870cx cxVar = this.f341202c;
        Optional optional = (Optional) obj;
        return optional.isPresent() ? geVar.mo106014f(iVar, (String) optional.get(), cxVar) : geVar.mo106016h(this.f341203d, cxVar, this.f341204e);
    }
}
