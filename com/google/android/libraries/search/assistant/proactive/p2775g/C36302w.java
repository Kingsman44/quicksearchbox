package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49070fi;
import com.google.assistant.p3803ag.p3809c.C49073fl;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.w */
/* compiled from: PG */
public final /* synthetic */ class C36302w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f94799a;

    /* renamed from: b */
    public final /* synthetic */ boolean f94800b;

    public /* synthetic */ C36302w(int i, boolean z) {
        this.f94799a = i;
        this.f94800b = z;
    }

    public final Object apply(Object obj) {
        C49070fi fiVar;
        int i = this.f94799a;
        boolean z = this.f94800b;
        C49073fl flVar = (C49073fl) obj;
        if (flVar == null) {
            fiVar = (C49070fi) C49073fl.f126929c.createBuilder();
        } else {
            fiVar = (C49070fi) flVar.toBuilder();
        }
        fiVar.copyOnWrite();
        C49073fl flVar2 = (C49073fl) fiVar.instance;
        C62995dn dnVar = flVar2.f126932b;
        if (!dnVar.f170058b) {
            flVar2.f126932b = dnVar.mo58980a();
        }
        flVar2.f126932b.put(Integer.valueOf(i), Boolean.valueOf(z));
        return (C49073fl) fiVar.build();
    }
}
