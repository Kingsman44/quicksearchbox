package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14242bz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14273dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.protobuf.C62963cj;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.y */
/* compiled from: PG */
public final /* synthetic */ class C14779y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C14273dc f44553a;

    public /* synthetic */ C14779y(C14273dc dcVar) {
        this.f44553a = dcVar;
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
        C14273dc dcVar = this.f44553a;
        C14496lj ljVar = (C14496lj) obj;
        if (dcVar.f43176g && (ljVar.equals(C14496lj.INCOMING_MESSAGE_TASK) || ljVar.equals(C14496lj.MESSAGE_AUTO_READ_TASK))) {
            return false;
        }
        if (!new C62963cj(dcVar.f43173c, C14273dc.f43169d).contains(C14242bz.DISABLED_MIC_ICON) || !ljVar.equals(C14496lj.EXPANDED_VOICE_PLATE_TASK)) {
            return true;
        }
        return false;
    }
}
