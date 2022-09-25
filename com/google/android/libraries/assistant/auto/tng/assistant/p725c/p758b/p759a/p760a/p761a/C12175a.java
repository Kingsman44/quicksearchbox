package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.a.a */
/* compiled from: PG */
public final class C12175a extends C12179e {

    /* renamed from: a */
    public C57981b f38878a;

    /* renamed from: b */
    public C58833ax f38879b = C58836b.f156633a;

    /* renamed from: a */
    public final C12180f mo20466a() {
        C57981b bVar = this.f38878a;
        if (bVar != null) {
            return new C12176b(bVar, this.f38879b);
        }
        throw new IllegalStateException("Missing required properties: conversationDeltaStream");
    }

    /* renamed from: b */
    public final void mo20467b(C57981b bVar) {
        if (bVar != null) {
            this.f38878a = bVar;
            return;
        }
        throw new NullPointerException("Null conversationDeltaStream");
    }
}
