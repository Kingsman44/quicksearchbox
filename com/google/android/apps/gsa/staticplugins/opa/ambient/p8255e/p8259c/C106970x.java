package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.media.session.MediaController;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.x */
/* compiled from: PG */
public final /* synthetic */ class C106970x implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106867ab f297960a;

    public /* synthetic */ C106970x(C106867ab abVar) {
        this.f297960a = abVar;
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
        C106867ab abVar = this.f297960a;
        String packageName = ((MediaController) obj).getPackageName();
        if (packageName == null || !abVar.f297761a.mo79745c(C90017bw.f248011ck).contains(packageName)) {
            return true;
        }
        ((C58970a) ((C58970a) abVar.f297762b.mo56224b()).mo56372aa(23369)).mo56389s("%s on deny list for resume recommendations.", packageName);
        return false;
    }
}
