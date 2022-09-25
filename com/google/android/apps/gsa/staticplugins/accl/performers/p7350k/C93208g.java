package com.google.android.apps.gsa.staticplugins.accl.performers.p7350k;

import com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k.g */
/* compiled from: PG */
public final /* synthetic */ class C93208g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C64735n f259938a;

    public /* synthetic */ C93208g(C64735n nVar) {
        this.f259938a = nVar;
    }

    public final Object apply(Object obj) {
        C64735n nVar = this.f259938a;
        C58974d dVar = C93213l.f259947a;
        boolean z = nVar.f175476h;
        if (Objects.equals((C119313b) obj, C119313b.SUCCESS)) {
            return z ? C22402a.f61894b : C22402a.f61893a;
        }
        return C22402a.m41822b(C52235kf.INTERNAL, (String) null);
    }
}
