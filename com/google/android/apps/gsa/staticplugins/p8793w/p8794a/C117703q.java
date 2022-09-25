package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4486ci.p4487a.C58097b;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.q */
/* compiled from: PG */
public final /* synthetic */ class C117703q implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C117687ai f326687a;

    /* renamed from: b */
    public final /* synthetic */ C58097b f326688b;

    /* renamed from: c */
    public final /* synthetic */ File f326689c;

    public /* synthetic */ C117703q(C117687ai aiVar, C58097b bVar, File file) {
        this.f326687a = aiVar;
        this.f326688b = bVar;
        this.f326689c = file;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C117687ai aiVar = this.f326687a;
        C58097b bVar = this.f326688b;
        File file = this.f326689c;
        ((C59052c) ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(18601)).mo56386p("Can't set timeout future, assuming it is already timeout");
        if (!aiVar.f326654k.get()) {
            aiVar.mo103432c(bVar, file, (C60870cx) null);
        }
        aiVar.f326653j.set(true);
    }
}
