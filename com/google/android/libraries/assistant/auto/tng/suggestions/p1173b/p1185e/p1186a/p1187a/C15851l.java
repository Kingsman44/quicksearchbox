package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1186a.p1187a;

import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C15851l implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C2164c f47091a;

    /* renamed from: b */
    public final /* synthetic */ C146006ab f47092b;

    public /* synthetic */ C15851l(C2164c cVar, C146006ab abVar) {
        this.f47091a = cVar;
        this.f47092b = abVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C2164c cVar = this.f47091a;
        C146006ab abVar2 = this.f47092b;
        if (abVar.mo122491j()) {
            C59104x b = C15854o.f47096a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AwarenessListener");
            ((C59052c) ((C59052c) b).mo56372aa(46448)).mo56389s("AwarenessContextListener %sregistered successfully.", BuildConfig.FLAVOR);
            cVar.mo5437b(true);
            return;
        }
        C59104x c = C15854o.f47096a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AwarenessListener");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(abVar2.mo122487f())).mo56372aa(46447)).mo56389s("AwarenessContextListener task failed for %sregister", BuildConfig.FLAVOR);
        cVar.mo5437b(false);
    }
}
