package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49073fl;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.aa */
/* compiled from: PG */
public final /* synthetic */ class C36272aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f94746a;

    public /* synthetic */ C36272aa(int i) {
        this.f94746a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f94746a;
        C62995dn dnVar = ((C49073fl) obj).f126931a;
        Integer valueOf = Integer.valueOf(i);
        return Boolean.valueOf(dnVar.containsKey(valueOf) ? ((Boolean) dnVar.get(valueOf)).booleanValue() : true);
    }
}
