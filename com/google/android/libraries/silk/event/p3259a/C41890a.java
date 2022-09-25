package com.google.android.libraries.silk.event.p3259a;

import com.google.android.libraries.silk.event.C41894b;
import com.google.android.libraries.silk.event.C41895c;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.silk.event.a.a */
/* compiled from: PG */
final class C41890a implements C41895c {

    /* renamed from: a */
    final /* synthetic */ C41892c f109287a;

    public C41890a(C41892c cVar) {
        this.f109287a = cVar;
    }

    /* renamed from: a */
    public final void mo44351a(MessageLite messageLite) {
        C41893d dVar = this.f109287a.f109290a;
        if (dVar.f109293b.containsKey(messageLite.getClass())) {
            try {
                ((C41894b) dVar.f109293b.get(messageLite.getClass())).mo42922a(messageLite);
            } catch (ClassCastException e) {
                ((C59052c) ((C59052c) ((C59052c) C41893d.f109292a.mo56225c()).mo56382g(e)).mo56372aa(53917)).mo56386p("Observer is stored with wrong type key. This should not happen at all.");
            }
        }
    }
}
