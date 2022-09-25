package com.google.android.apps.search.assistant.verticals.reminders.home;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.search.p2476a.p2477a.C32151a;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.home.d */
/* compiled from: PG */
public final class C132560d implements C45987ay {

    /* renamed from: a */
    public final HomeActivity f361756a;

    /* renamed from: b */
    public String f361757b;

    /* renamed from: c */
    public String f361758c;

    /* renamed from: d */
    public String f361759d;

    /* renamed from: e */
    public String f361760e;

    /* renamed from: f */
    public Boolean f361761f;

    /* renamed from: g */
    public String f361762g;

    /* renamed from: h */
    public Boolean f361763h;

    /* renamed from: i */
    private final C28310af f361764i;

    public C132560d(HomeActivity homeActivity, C45989b bVar, C28310af afVar) {
        this.f361756a = homeActivity;
        this.f361764i = afVar;
        C32151a.m59929e(homeActivity, this, bVar, C58485gu.m89845m());
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Bundle bundle = new Bundle();
        String str = this.f361757b;
        if (str != null) {
            bundle.putString("LANGUAGE_PARAM", str);
        }
        String str2 = this.f361758c;
        if (str2 != null) {
            bundle.putString("SOURCE_PARAM", str2);
        }
        String str3 = this.f361759d;
        if (str3 != null) {
            bundle.putString("REMINDER_ID", str3);
        }
        String str4 = this.f361760e;
        if (str4 != null) {
            bundle.putString("EXPECTED_CLIENT_ID", str4);
        }
        Boolean bool = this.f361761f;
        if (bool != null) {
            bundle.putBoolean("OPEN_DIALOG_PARAM", bool.booleanValue());
        }
        String str5 = this.f361762g;
        if (str5 != null) {
            bundle.putString("CONSENT_FLOW_PARAM", str5);
        }
        Boolean bool2 = this.f361763h;
        if (bool2 != null) {
            bundle.putBoolean("MOVE_URL", bool2.booleanValue());
        }
        C132564h a = C132567k.m215520a(awVar.f120815a.f120816a, bundle);
        C0154a aVar = new C0154a(this.f361756a.f727a.f739a.f744e);
        aVar.mo689v(16908290, a, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f361756a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28313c a = this.f361764i.f76997b.mo33800a(C28427h.m53115a(98360));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33810c(this.f361756a);
    }
}
