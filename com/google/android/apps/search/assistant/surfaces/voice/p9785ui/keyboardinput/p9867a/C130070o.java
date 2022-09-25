package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protos.p4948ba.p4949a.C64371d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.o */
/* compiled from: PG */
public final /* synthetic */ class C130070o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130070o f356672a = new C130070o();

    private /* synthetic */ C130070o() {
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
        C54228aq aqVar = (C54228aq) obj;
        int a = C64371d.m96393a(aqVar.f142332c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (C130077v.m212376a(a - 1) != 0) {
            return true;
        }
        C59052c cVar = (C59052c) C130073r.f356675a.mo56225c();
        cVar.mo56378ag(C38505d.f101864b, 229892884);
        C59052c cVar2 = (C59052c) cVar.mo56372aa(38696);
        int a2 = C64371d.m96393a(aqVar.f142332c);
        if (a2 != 0) {
            i = a2;
        }
        cVar2.mo56387q("Unsupported suggestion type (%d)", i - 1);
        return false;
    }
}
