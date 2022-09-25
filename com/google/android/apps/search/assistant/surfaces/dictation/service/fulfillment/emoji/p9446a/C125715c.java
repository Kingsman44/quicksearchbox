package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125141do;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.a.c */
/* compiled from: PG */
public final /* synthetic */ class C125715c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f346490a;

    public /* synthetic */ C125715c(String str) {
        this.f346490a = str;
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
        String str = this.f346490a;
        C125040f fVar = (C125040f) obj;
        C59071e eVar = C125721i.f346501a;
        if (!fVar.f344981c) {
            return false;
        }
        C125143dq dqVar = fVar.f344982d;
        if (dqVar == null) {
            dqVar = C125143dq.f345221c;
        }
        C125141do doVar = dqVar.f345224b;
        if (doVar == null) {
            doVar = C125141do.f345217c;
        }
        return doVar.f345219a.equals(str);
    }
}
