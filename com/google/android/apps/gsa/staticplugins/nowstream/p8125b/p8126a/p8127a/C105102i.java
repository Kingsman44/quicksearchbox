package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8127a;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C105102i implements C105098e {

    /* renamed from: a */
    public final /* synthetic */ C105105l f293018a;

    public /* synthetic */ C105102i(C105105l lVar) {
        this.f293018a = lVar;
    }

    /* renamed from: a */
    public final void mo94563a(int i) {
        C105105l lVar = this.f293018a;
        if (i != 1) {
            if (i != 2) {
                ((C59052c) ((C59052c) C105105l.f293021a.mo56226d()).mo56372aa(22223)).mo56387q("Received unhandled menu item id: %d", i);
                return;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity");
            lVar.f293024c.mo65089a(intent);
        } else if (((C85651bb) lVar.f293025d.mo27525b()).mo79134G() || ((C85651bb) lVar.f293025d.mo27525b()).mo79132E()) {
            lVar.f293024c.mo65089a(InterestLauncherHelper.m150800a(new InterestLauncherHelper.Options()));
        }
    }
}
