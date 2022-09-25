package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p4008y.p4009a.C53577bj;
import com.google.assistant.p4008y.p4009a.C53581bn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.av */
/* compiled from: PG */
public final /* synthetic */ class C75697av implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C53581bn f210127a;

    public /* synthetic */ C75697av(C53581bn bnVar) {
        this.f210127a = bnVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C53581bn bnVar = this.f210127a;
        if (!Collection.EL.stream((C58485gu) obj).allMatch(C75695at.f210124a)) {
            return Optional.empty();
        }
        C53577bj a = C53577bj.m86874a(bnVar.f140633b);
        if (a == null) {
            a = C53577bj.PRIORITY_UNKNOWN;
        }
        return Optional.m71637of(a);
    }
}
