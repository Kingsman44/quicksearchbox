package com.google.android.apps.gsa.search.shared.media;

import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.shared.media.j */
/* compiled from: PG */
public final /* synthetic */ class C87586j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87594r f236632a;

    /* renamed from: b */
    public final /* synthetic */ C0320v f236633b;

    public /* synthetic */ C87586j(C87594r rVar, C0320v vVar) {
        this.f236632a = rVar;
        this.f236633b = vVar;
    }

    public final void run() {
        C87594r rVar = this.f236632a;
        C0320v vVar = this.f236633b;
        if (!rVar.f236651d.isDone()) {
            ((C59052c) ((C59052c) C87594r.f236647a.mo56225c()).mo56372aa(9645)).mo56389s("The wait for readiness of media session timed out for package: %s", vVar.mo1039g());
            rVar.f236651d.mo57356n(vVar);
        }
    }
}
