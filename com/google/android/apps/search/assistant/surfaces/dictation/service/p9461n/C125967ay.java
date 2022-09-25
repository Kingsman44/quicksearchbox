package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126032h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ay */
/* compiled from: PG */
public final /* synthetic */ class C125967ay implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126038bc f347188a;

    /* renamed from: b */
    public final /* synthetic */ C125931t f347189b;

    public /* synthetic */ C125967ay(C126038bc bcVar, C125931t tVar) {
        this.f347188a = bcVar;
        this.f347189b = tVar;
    }

    public final Object apply(Object obj) {
        C126038bc bcVar = this.f347188a;
        C125931t tVar = this.f347189b;
        if (!((Boolean) obj).booleanValue()) {
            return Optional.empty();
        }
        bcVar.f347377w.set(C58485gu.m89845m());
        C126032h a = bcVar.f347359e.mo107342a(tVar.mo107188g());
        return Optional.m71637of(bcVar.f347358d.mo107272d(bcVar.f347358d.mo107271c(C58485gu.m89846n(a)), C58485gu.m89846n(a), R.string.assistant_keyboard_clear_all_button_prefix_text));
    }
}
