package com.google.apps.tiktok.dataservice.local;

import androidx.p060c.C0977g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.lifecycle.C47414a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.dataservice.local.w */
/* compiled from: PG */
public final /* synthetic */ class C46869w implements C47414a {

    /* renamed from: a */
    public static final /* synthetic */ C46869w f122297a = new C46869w();

    private /* synthetic */ C46869w() {
    }

    /* renamed from: a */
    public final void mo50868a(Object obj) {
        C0977g gVar = (C0977g) obj;
        for (C46847av avVar : gVar.values()) {
            C19559g.m37304c();
            C58838bb.m90883r(!avVar.f122277e);
            C46846au auVar = avVar.f122274b;
            if (auVar != null) {
                avVar.f122273a.mo50791e(auVar.f122267a.mo20330a(), avVar.f122274b);
                avVar.f122274b.close();
                avVar.f122274b = null;
            }
            avVar.f122277e = true;
        }
        gVar.clear();
    }
}
