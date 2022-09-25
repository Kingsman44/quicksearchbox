package com.google.android.apps.gsa.staticplugins.p7666ci.p7669c;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.c.g */
/* compiled from: PG */
final class C97820g implements C60845bz {

    /* renamed from: a */
    private final Object f273167a;

    /* renamed from: b */
    private final boolean f273168b;

    /* renamed from: c */
    private final C68214a f273169c;

    /* renamed from: d */
    private final Context f273170d;

    /* renamed from: e */
    private final C68214a f273171e;

    public C97820g(Object obj, boolean z, C68214a aVar, Context context, C68214a aVar2) {
        this.f273167a = obj;
        this.f273168b = z;
        this.f273169c = aVar;
        this.f273170d = context;
        this.f273171e = aVar2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C0320v vVar = (C0320v) obj;
        if (C97821h.m162116j(vVar)) {
            vVar.getClass();
            C58976aa aaVar = C58975e.f156826a;
            vVar.mo1038f();
            Object obj2 = this.f273167a;
            if (obj2 instanceof String) {
                if (((String) obj2).isEmpty()) {
                    vVar.mo1037e().mo1018c();
                } else {
                    vVar.mo1037e().mo1019d((String) this.f273167a, new Bundle());
                }
            } else if (obj2 instanceof Uri) {
                vVar.mo1037e().mo1021f((Uri) this.f273167a, new Bundle());
            } else {
                C59104x c = C97821h.f273172a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
                ((C59052c) ((C59052c) c).mo56372aa(30321)).mo56386p("#onSuccess() Invalid format of media ID.");
            }
            if (this.f273168b) {
                C97821h.m162115i(vVar, this.f273169c, this.f273170d, this.f273171e);
            }
        }
    }
}
