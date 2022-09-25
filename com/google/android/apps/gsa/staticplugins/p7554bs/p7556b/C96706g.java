package com.google.android.apps.gsa.staticplugins.p7554bs.p7556b;

import android.content.SharedPreferences;
import com.google.android.libraries.lens.view.p2067ak.C25256ch;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.b.g */
/* compiled from: PG */
public final /* synthetic */ class C96706g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96708i f270533a;

    public /* synthetic */ C96706g(C96708i iVar) {
        this.f270533a = iVar;
    }

    public final void run() {
        C96708i iVar = this.f270533a;
        C58526ih ihVar = new C58526ih();
        if (iVar.f270535a.contains("lens_should_request_places_permissions")) {
            ihVar.mo55373c("lens_should_request_places_permissions");
        }
        C58800sl lA = C25256ch.m46636b(iVar.f270535a.getAll().keySet()).iterator();
        while (lA.hasNext()) {
            ihVar.mo55373c(C25256ch.m46639e((String) lA.next()));
        }
        C58528ij f = ihVar.mo55486f();
        if (!f.isEmpty()) {
            SharedPreferences.Editor edit = iVar.f270535a.edit();
            C58800sl lA2 = f.iterator();
            while (lA2.hasNext()) {
                edit.remove((String) lA2.next());
            }
            if (!edit.commit()) {
                throw new IllegalStateException("Failed to cleanup device keys");
            }
        }
    }
}
