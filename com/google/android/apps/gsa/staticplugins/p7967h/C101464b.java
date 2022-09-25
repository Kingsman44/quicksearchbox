package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.search.shared.media.C87576a;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.b */
/* compiled from: PG */
public final /* synthetic */ class C101464b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C101468d f283083a;

    /* renamed from: b */
    public final /* synthetic */ Set f283084b;

    public /* synthetic */ C101464b(C101468d dVar, Set set) {
        this.f283083a = dVar;
        this.f283084b = set;
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
        C51058ev evVar;
        C51058ev evVar2;
        C101468d dVar = this.f283083a;
        Set set = this.f283084b;
        C51098gh ghVar = (C51098gh) obj;
        C87576a aVar = (C87576a) dVar.f283092a.mo27525b();
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if (!aVar.mo81719a(evVar.f132944b)) {
            return false;
        }
        if (ghVar.f133012b == 1) {
            evVar2 = (C51058ev) ghVar.f133013c;
        } else {
            evVar2 = C51058ev.f132941o;
        }
        if (!set.contains(evVar2.f132944b)) {
            return true;
        }
        return false;
    }
}
