package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.h */
/* compiled from: PG */
final class C118654h extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ PreferenceActivity.Header f331011a;

    /* renamed from: b */
    final /* synthetic */ SettingsActivity f331012b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118654h(SettingsActivity settingsActivity, PreferenceActivity.Header header) {
        super("Get launcher pref result");
        this.f331012b = settingsActivity;
        this.f331011a = header;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) SettingsActivity.f330929a.mo56225c()).mo56382g(th)).mo56372aa(34076)).mo56386p("Failed to get launcher settings");
        C118678q qVar = this.f331012b.f330935d;
        if (qVar != null) {
            qVar.remove(this.f331011a);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f331011a.extras = (Bundle) obj;
        C118678q qVar = this.f331012b.f330935d;
        if (qVar != null) {
            qVar.notifyDataSetChanged();
        }
    }
}
