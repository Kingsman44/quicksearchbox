package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.p9303a.p9304a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4850an.p4851a.p4852a.C63327k;
import com.google.protos.p4850an.p4851a.p4852a.C63329m;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.c.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C123142a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123144c f340810a;

    /* renamed from: b */
    public final /* synthetic */ C63327k f340811b;

    public /* synthetic */ C123142a(C123144c cVar, C63327k kVar) {
        this.f340810a = cVar;
        this.f340811b = kVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C123144c cVar = this.f340810a;
        C63327k kVar = this.f340811b;
        long longValue = ((Long) obj).longValue();
        C63329m mVar = kVar.f171158b;
        if (mVar == null) {
            mVar = C63329m.f171160c;
        }
        if ((mVar.f171162a & 4) != 0) {
            C63329m mVar2 = kVar.f171158b;
            if (mVar2 == null) {
                mVar2 = C63329m.f171160c;
            }
            optional = Optional.m71637of(Long.valueOf(mVar2.f171163b));
        } else {
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            if (!cVar.f340815c) {
                ((C59052c) cVar.f340813a.mo105766e().mo56372aa(35099)).mo56386p("No changelist found in resource loader spec, which means a potentially untested code/data combination.");
            } else {
                throw new C122872ec("MaVersionSkewResourcePostProcessor", "No changelist found in resource loader spec, which means a potentially untested code/data combination.");
            }
        }
        if (((Long) optional.get()).longValue() >= longValue) {
            ((C59052c) cVar.f340813a.mo105764c().mo56372aa(35098)).mo56353F("POP resources version %d is equal or above minimum tested CL %d.", optional.get(), longValue);
        } else if (!cVar.f340815c) {
            ((C59052c) cVar.f340813a.mo105766e().mo56372aa(35097)).mo56353F("Resource loader spec CL %d is older than minimum tested CL %d, but server fallback is disabled.", optional.get(), longValue);
        } else {
            throw new C122872ec("MaVersionSkewResourcePostProcessor", String.format(Locale.US, "Resource loader spec CL %d is older than minimum tested CL %d.", new Object[]{optional.get(), Long.valueOf(longValue)}));
        }
        return C60856cj.m92900i(kVar);
    }
}
