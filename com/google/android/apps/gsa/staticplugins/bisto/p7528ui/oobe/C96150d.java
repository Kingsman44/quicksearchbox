package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import android.os.UserManager;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83914a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.d */
/* compiled from: PG */
public final class C96150d extends C83869ac {

    /* renamed from: a */
    private static final C59071e f269166a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.d");

    /* renamed from: b */
    private final Context f269167b;

    public C96150d(Context context) {
        this.f269167b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        C59104x c = f269166a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AccountErrorSequence");
        ((C59052c) ((C59052c) c).mo56372aa(16923)).mo56386p("Non-system account abort OOBE.");
        C96226fv fvVar = new C96226fv();
        C83914a aVar = (C83914a) C83915b.f228541j.createBuilder();
        aVar.copyOnWrite();
        C83915b bVar = (C83915b) aVar.instance;
        bVar.f228543a |= 8;
        bVar.f228547e = R.string.assistant_bisto_non_system_user_message;
        aVar.copyOnWrite();
        C83915b bVar2 = (C83915b) aVar.instance;
        bVar2.f228543a |= 32;
        bVar2.f228549g = R.string.bisto_got_it_and_exit_button;
        return C83875ai.m133540e(fvVar, C96226fv.m159528g("InvalidSystemAccount", (C83915b) aVar.build(), true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        UserManager userManager = (UserManager) this.f269167b.getSystemService("user");
        return userManager == null || !userManager.isSystemUser();
    }
}
