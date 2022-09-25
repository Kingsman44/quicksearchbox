package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.google.android.apps.gsa.nga.engine.p6032h.p6033a.C76145b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.o */
/* compiled from: PG */
public final /* synthetic */ class C76864o implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C76864o f212287a = new C76864o();

    private /* synthetic */ C76864o() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar = (C58485gu) Collection.EL.stream((C58485gu) obj).filter(C76867r.f212291a).collect(C58370cn.f155946a);
        if (guVar.size() != 1) {
            ((C58970a) ((C58970a) C76869t.f212293a.mo56224b()).mo56372aa(3772)).mo56387q("Found %d contacts with email address. Falling back to cloud.", guVar.size());
            return Optional.empty();
        }
        C58485gu a = ((C76145b) guVar.get(0)).mo72085a();
        if (a.size() == 1) {
            return Optional.m71637of((String) a.get(0));
        }
        ((C58970a) ((C58970a) C76869t.f212293a.mo56224b()).mo56372aa(3771)).mo56387q("Found a contact with %d email addresses. Falling back to cloud.", a.size());
        return Optional.empty();
    }
}
