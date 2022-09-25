package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.f */
/* compiled from: PG */
public final /* synthetic */ class C125741f implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C125741f f346542a = new C125741f();

    private /* synthetic */ C125741f() {
    }

    public final C60870cx apply(Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            return C60856cj.m92900i(Optional.m71637of(new C125751p(C125034a.TRIGGER_VOICE, list, C125753r.f346567a)));
        }
        return C60856cj.m92900i(Optional.empty());
    }
}
