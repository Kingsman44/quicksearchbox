package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.e */
/* compiled from: PG */
final class C93273e extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C93276h f260102a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93273e(C93276h hVar) {
        super("Action execution timeout.", 2, 0);
        this.f260102a = hVar;
    }

    public final void run() {
        ((C59052c) ((C59052c) C93276h.f260105a.mo56225c()).mo56372aa(13489)).mo56386p("Action execution timed out whilst waiting for reply.");
        this.f260102a.f260110f.mo57356n(C87421i.f236080b);
        this.f260102a.mo87606a();
    }
}
