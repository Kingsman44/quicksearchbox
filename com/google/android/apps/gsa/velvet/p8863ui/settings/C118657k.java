package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118638a;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118645h;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118646i;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118647j;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137589b;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.k */
/* compiled from: PG */
final class C118657k implements C22868d {

    /* renamed from: a */
    final /* synthetic */ PreferenceActivity.Header f331015a;

    /* renamed from: b */
    final /* synthetic */ C137589b f331016b;

    /* renamed from: c */
    final /* synthetic */ SettingsActivity f331017c;

    public C118657k(SettingsActivity settingsActivity, PreferenceActivity.Header header, C137589b bVar) {
        this.f331017c = settingsActivity;
        this.f331015a = header;
        this.f331016b = bVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) SettingsActivity.f330929a.mo56225c()).mo56382g(th)).mo56372aa(34079)).mo56386p("Failed to update preference header intent");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Intent intent = (Intent) obj;
        if (this.f331017c.f330935d != null) {
            this.f331015a.intent = intent;
            if (intent.getBooleanExtra("IS_VISIBLE", true)) {
                this.f331015a.extras = new Bundle();
                this.f331015a.extras.putBoolean("IS_VISIBLE", true);
                SettingsActivity settingsActivity = this.f331017c;
                PreferenceActivity.Header header = this.f331015a;
                C137589b bVar = this.f331016b;
                C118645h hVar = (C118645h) C118646i.f330994d.createBuilder();
                String string = settingsActivity.f330936e.getString(header.titleRes);
                hVar.copyOnWrite();
                C118646i iVar = (C118646i) hVar.instance;
                string.getClass();
                iVar.f330996a = 1 | iVar.f330996a;
                iVar.f330997b = string;
                if (bVar == C137589b.SAFE_SEARCH) {
                    hVar.copyOnWrite();
                    C118646i iVar2 = (C118646i) hVar.instance;
                    iVar2.f330996a |= 2;
                    iVar2.f330998c = "SafeSearch";
                }
                C118638a aVar = (C118638a) settingsActivity.f330934c.toBuilder();
                C118646i iVar3 = (C118646i) hVar.build();
                aVar.copyOnWrite();
                C118647j jVar = (C118647j) aVar.instance;
                iVar3.getClass();
                C62971cq cqVar = jVar.f331004d;
                if (!cqVar.mo58948c()) {
                    jVar.f331004d = C62942bv.mutableCopy(cqVar);
                }
                jVar.f331004d.add(iVar3);
                settingsActivity.f330934c = (C118647j) aVar.build();
            }
            this.f331017c.f330935d.notifyDataSetChanged();
        }
    }
}
