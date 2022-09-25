package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8159d;

import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91833a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91835c;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105774l;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.TemporaryFeedStateParcelableStore;
import com.google.android.libraries.gsa.monet.service.C23052c;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.d.b */
/* compiled from: PG */
public final class C105715b implements C91833a {

    /* renamed from: a */
    public final C105774l f294988a;

    /* renamed from: b */
    public TemporaryFeedStateParcelableStore f294989b;

    public C105715b(C105774l lVar, C23052c cVar) {
        this.f294988a = lVar;
        cVar.mo28427o(new C105714a(this));
    }

    /* renamed from: a */
    public final C91835c mo86310a(long j, String str) {
        Map map = (Map) this.f294989b.f295125a.get(j);
        if (map != null) {
            return (C91835c) map.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo86311b(long j, String str, C91835c cVar) {
        this.f294989b.mo95045a(j, str, cVar);
    }
}
