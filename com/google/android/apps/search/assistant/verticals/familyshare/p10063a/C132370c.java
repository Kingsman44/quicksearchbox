package com.google.android.apps.search.assistant.verticals.familyshare.p10063a;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.a.c */
/* compiled from: PG */
public final class C132370c {

    /* renamed from: g */
    private static final C59071e f361341g = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.familyshare.a.c");

    /* renamed from: a */
    public final Context f361342a;

    /* renamed from: b */
    public final C46175b f361343b;

    /* renamed from: c */
    public final AccountId f361344c;

    /* renamed from: d */
    public final C121011a f361345d;

    /* renamed from: e */
    public final Executor f361346e;

    /* renamed from: f */
    public final boolean f361347f;

    public C132370c(Context context, C46175b bVar, AccountId accountId, C121011a aVar, Executor executor, boolean z) {
        this.f361342a = context;
        this.f361343b = bVar;
        this.f361344c = accountId;
        this.f361345d = aVar;
        this.f361346e = executor;
        this.f361347f = z;
    }

    /* renamed from: a */
    public static void m215155a(Context context, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.search.assistant.verticals.familyshare.FamilyShareActivity"), true != z ? 2 : 1, 1);
            C58976aa aaVar = C58975e.f156826a;
        } catch (IllegalArgumentException e) {
            C59104x c = f361341g.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SharesheetComponentController");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(39602)).mo56386p("Failed to update component");
        }
    }
}
