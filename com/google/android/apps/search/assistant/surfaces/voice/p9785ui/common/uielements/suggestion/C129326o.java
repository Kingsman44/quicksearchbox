package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129304h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129308l;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.o */
/* compiled from: PG */
public final /* synthetic */ class C129326o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f355194a;

    public /* synthetic */ C129326o(String str) {
        this.f355194a = str;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        String str = this.f355194a;
        C129308l lVar = ((C129304h) obj).f355142a;
        if (lVar == null) {
            lVar = C129308l.f355150g;
        }
        return str.equals(lVar.f355153b);
    }
}
