package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bp */
/* compiled from: PG */
public final /* synthetic */ class C33021bp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33025bt f88423a;

    /* renamed from: b */
    public final /* synthetic */ C33144e f88424b;

    public /* synthetic */ C33021bp(C33025bt btVar, C33144e eVar) {
        this.f88423a = btVar;
        this.f88424b = eVar;
    }

    public final Object apply(Object obj) {
        C33025bt btVar = this.f88423a;
        Optional optional = (Optional) obj;
        this.f88424b.mo38549b(3);
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        if (btVar.f88433c != C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
            return optional;
        }
        return Optional.m71637of(C33118f.m61462c((C52081en) optional.get(), btVar.f88433c, C33025bt.f88432b));
    }
}
