package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cm */
/* compiled from: PG */
public final /* synthetic */ class C114843cm implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C114860dc f318627a;

    /* renamed from: b */
    public final /* synthetic */ Uri f318628b;

    public /* synthetic */ C114843cm(C114860dc dcVar, Uri uri) {
        this.f318627a = dcVar;
        this.f318628b = uri;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C114860dc dcVar = this.f318627a;
        try {
            return C58833ax.m90834k(C23335a.m43764a(dcVar.f318671d.getContentResolver(), this.f318628b));
        } catch (Exception e) {
            C59104x c = C114860dc.f318661a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ZSIntentHandler");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(29584)).mo56386p("Exception: Failed to get the shared image.");
            return C58836b.f156633a;
        }
    }
}
