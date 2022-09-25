package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p4008y.p4009a.C53577bj;
import com.google.assistant.p4008y.p4009a.C53579bl;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ap */
/* compiled from: PG */
public final /* synthetic */ class C75691ap implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C53579bl f210120a;

    public /* synthetic */ C75691ap(C53579bl blVar) {
        this.f210120a = blVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional = (Optional) obj;
        C53577bj a = C53577bj.m86874a(this.f210120a.f140628b);
        if (a == null) {
            a = C53577bj.PRIORITY_UNKNOWN;
        }
        return (C53577bj) optional.orElse(a);
    }
}
