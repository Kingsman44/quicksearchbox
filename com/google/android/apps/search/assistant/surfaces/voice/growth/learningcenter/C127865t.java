package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import android.content.Context;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40060y;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.common.base.C58819aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.t */
/* compiled from: PG */
public final class C127865t {

    /* renamed from: a */
    private C127866u f351918a = null;

    /* renamed from: b */
    private final Context f351919b;

    /* renamed from: c */
    private final C40305b f351920c;

    /* renamed from: d */
    private final C40060y f351921d;

    public C127865t(Context context, C40305b bVar, C40060y yVar) {
        this.f351919b = context;
        this.f351920c = bVar;
        this.f351921d = yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo108254b(C28439i iVar, C28423g gVar) {
        this.f351918a = new C127866u(this.f351919b, this.f351920c, iVar, gVar, this.f351921d);
    }

    /* renamed from: a */
    public final C46755l mo108253a() {
        C127866u uVar = this.f351918a;
        if (uVar != null) {
            C46753j jVar = new C46753j();
            jVar.f122102a = new C58819aj(uVar);
            return jVar.mo50770a();
        }
        throw new IllegalStateException("setRootClientVisualElement is not called.");
    }
}
