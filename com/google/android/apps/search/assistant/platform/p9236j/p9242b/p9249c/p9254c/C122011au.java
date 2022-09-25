package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.common.base.C58810aa;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.au */
/* compiled from: PG */
class C122011au extends C58810aa {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17535b(Object obj) {
        C122013aw awVar = (C122013aw) obj;
        C122024g gVar = C122024g.UNKNOWN_EVENT;
        int ordinal = awVar.ordinal();
        if (ordinal == 0) {
            return C122024g.UNKNOWN_EVENT;
        }
        if (ordinal == 1) {
            return C122024g.CONFIGURATION_CHANGED;
        }
        if (ordinal == 2) {
            return C122024g.CLOSE_SYSTEM_DIALOGS_REQUESTED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awVar.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo17536c(Object obj) {
        C122024g gVar = (C122024g) obj;
        C122013aw awVar = C122013aw.UNKNOWN_EVENT;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return C122013aw.UNKNOWN_EVENT;
        }
        if (ordinal == 1) {
            return C122013aw.CONFIGURATION_CHANGED;
        }
        if (ordinal == 2) {
            return C122013aw.CLOSE_SYSTEM_DIALOGS_REQUESTED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(gVar.getNumber())));
    }
}
