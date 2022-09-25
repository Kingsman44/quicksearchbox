package com.google.android.libraries.silk.event.web;

import com.google.android.libraries.silk.event.C41894b;
import com.google.android.libraries.silk.event.C41895c;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.silk.event.web.a */
/* compiled from: PG */
final class C41897a implements C41895c {

    /* renamed from: a */
    final /* synthetic */ C41899c f109296a;

    public C41897a(C41899c cVar) {
        this.f109296a = cVar;
    }

    /* renamed from: a */
    public final void mo44351a(MessageLite messageLite) {
        C41900d c = this.f109296a.mo44355c();
        if (c.f109303b.containsKey(messageLite.getClass())) {
            try {
                ((C41894b) c.f109303b.get(messageLite.getClass())).mo42922a(messageLite);
            } catch (ClassCastException e) {
                ((C59052c) ((C59052c) ((C59052c) C41900d.f109302a.mo56225c()).mo56382g(e)).mo56372aa(53916)).mo56386p("Observer is stored with wrong type key. This should not happen at all.");
            }
        }
    }
}
