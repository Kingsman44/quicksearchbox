package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4486ci.p4487a.C58097b;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.n */
/* compiled from: PG */
public final /* synthetic */ class C117700n implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C117687ai f326682a;

    /* renamed from: b */
    public final /* synthetic */ C58097b f326683b;

    /* renamed from: c */
    public final /* synthetic */ File f326684c;

    public /* synthetic */ C117700n(C117687ai aiVar, C58097b bVar, File file) {
        this.f326682a = aiVar;
        this.f326683b = bVar;
        this.f326684c = file;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C117687ai aiVar = this.f326682a;
        C58097b bVar = this.f326683b;
        File file = this.f326684c;
        ((C59052c) ((C59052c) C117687ai.f326644a.mo56226d()).mo56372aa(18593)).mo56386p("Upload timeout, clean up audio file.");
        if (!aiVar.f326654k.get()) {
            aiVar.mo103432c(bVar, file, (C60870cx) null);
        }
        aiVar.f326653j.set(true);
        return null;
    }
}
