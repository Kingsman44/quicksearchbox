package com.google.android.apps.gsa.staticplugins.bisto.p7535z;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9685m;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.z.a */
/* compiled from: PG */
public final class C96637a implements C9685m {

    /* renamed from: a */
    private static final C59071e f270330a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.z.a");

    /* renamed from: b */
    private final C68214a f270331b;

    /* renamed from: c */
    private final C68214a f270332c;

    public C96637a(C68214a aVar, C68214a aVar2) {
        this.f270331b = aVar;
        this.f270332c = aVar2;
    }

    /* renamed from: a */
    public final void mo17961a(String str, boolean z) {
        Account a = ((C86054o) this.f270331b.mo27525b()).mo79668a();
        if (a == null) {
            C59104x c = f270330a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PersonalResponseUpdater");
            ((C59052c) ((C59052c) c).mo56372aa(16740)).mo56386p("Could not retrieve logged-in Google account.");
        } else if (a.name.equals(str)) {
            C89651f.m145940a((C88483e) this.f270332c.mo27525b(), new C88489j(C87739bu.BISTO_PR_OR_HPR_PREF_CHANGED).mo82013a());
        }
    }
}
