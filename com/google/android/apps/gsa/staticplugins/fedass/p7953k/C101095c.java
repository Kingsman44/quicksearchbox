package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.c */
/* compiled from: PG */
public final /* synthetic */ class C101095c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101098f f282285a;

    /* renamed from: b */
    public final /* synthetic */ String f282286b;

    /* renamed from: c */
    public final /* synthetic */ boolean f282287c;

    public /* synthetic */ C101095c(C101098f fVar, String str, boolean z) {
        this.f282285a = fVar;
        this.f282286b = str;
        this.f282287c = z;
    }

    public final C60870cx apply(Object obj) {
        C101098f fVar = this.f282285a;
        String str = this.f282286b;
        boolean z = this.f282287c;
        C132800h hVar = (C132800h) obj;
        if (hVar == null || hVar.f362334b.isEmpty()) {
            ((C59052c) ((C59052c) C101098f.f282291a.mo56224b()).mo56372aa(19775)).mo56386p("No training allowed: empty account params.");
        } else {
            C132798f fVar2 = hVar.f362335c;
            if (fVar2 == null) {
                fVar2 = C132798f.f362315o;
            }
            if (!fVar2.f362320d) {
                ((C59052c) ((C59052c) C101098f.f282291a.mo56224b()).mo56372aa(19776)).mo56386p("No training allowed: account doesn't allow.");
            } else if (!z) {
                return fVar.f282293c.mo77706c(str);
            } else {
                ((C59052c) ((C59052c) C101098f.f282291a.mo56224b()).mo56372aa(19771)).mo56386p("Scheduling a train now registrations.");
                return fVar.f282293c.mo77707d(str);
            }
        }
        return C60866ct.f164955a;
    }
}
