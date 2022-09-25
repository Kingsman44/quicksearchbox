package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83914a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124526g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fw */
/* compiled from: PG */
public final class C96227fw extends C83869ac {

    /* renamed from: a */
    private static final C59071e f269354a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fw");

    /* renamed from: b */
    private final String f269355b;

    /* renamed from: c */
    private final C68214a f269356c;

    public C96227fw(String str, C68214a aVar) {
        str.getClass();
        this.f269355b = str;
        this.f269356c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        C59104x c = f269354a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GestureCustomizationVoiceMatchSequence");
        ((C59052c) ((C59052c) c).mo56372aa(16999)).mo56386p("GestureCustomization and Voice Match is disabled/off");
        C96226fv fvVar = new C96226fv();
        C83914a aVar = (C83914a) C83915b.f228541j.createBuilder();
        aVar.copyOnWrite();
        C83915b bVar = (C83915b) aVar.instance;
        bVar.f228543a |= 8;
        bVar.f228547e = R.string.bisto_assistant_not_available;
        aVar.copyOnWrite();
        C83915b bVar2 = (C83915b) aVar.instance;
        bVar2.f228543a |= 2;
        bVar2.f228545c = R.string.bisto_assistant_not_available_title;
        aVar.copyOnWrite();
        C83915b bVar3 = (C83915b) aVar.instance;
        bVar3.f228543a |= 32;
        bVar3.f228549g = R.string.bisto_ok_and_exit_button;
        return C83875ai.m133540e(fvVar, C96226fv.m159528g("GestureCustomizationVMDisabled", (C83915b) aVar.build(), true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C124548d b = ((C89492cd) this.f269356c.mo27525b()).mo83401b(this.f269355b);
        return b != null && !b.mo106495ai() && !C124526g.m203993a(b);
    }
}
