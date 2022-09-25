package com.google.android.apps.search.assistant.verticals.reminders.home;

import android.os.Bundle;
import com.google.android.apps.search.assistant.verticals.reminders.p10079e.C132556a;
import com.google.android.libraries.web.coordinator.C43727a;
import com.google.android.libraries.web.coordinator.C43730b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.home.k */
/* compiled from: PG */
public final class C132567k {

    /* renamed from: a */
    public static final String f361773a = C132556a.REMINDERS_MOVE_URL.mo110803a();

    /* renamed from: b */
    public static final String f361774b = C132556a.TASKS_PACKAGE.mo110803a();

    /* renamed from: c */
    public static final String f361775c = C132556a.TASKS_ENTRYPOINT.mo110803a();

    /* renamed from: d */
    public static final String f361776d = C132556a.TASKS_WEBPAGE_URL.mo110803a();

    /* renamed from: e */
    public static final C46690ah f361777e = new C46885y("ACCOUNT_KEY");

    /* renamed from: f */
    public static final C59071e f361778f = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.reminders.home.k");

    /* renamed from: g */
    public final AccountId f361779g;

    /* renamed from: h */
    public final C132564h f361780h;

    /* renamed from: i */
    public final C46855i f361781i;

    /* renamed from: j */
    public final C46128f f361782j;

    /* renamed from: k */
    public final String f361783k;

    /* renamed from: l */
    public final Boolean f361784l;

    public C132567k(AccountId accountId, C132564h hVar, C46855i iVar, C46128f fVar, String str, Boolean bool, C43730b bVar) {
        this.f361779g = accountId;
        this.f361780h = hVar;
        this.f361781i = iVar;
        this.f361782j = fVar;
        this.f361783k = str;
        this.f361784l = bool;
        bVar.mo46766a();
    }

    /* renamed from: a */
    static C132564h m215520a(AccountId accountId, Bundle bundle) {
        C132564h hVar = new C132564h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        C43727a.m77222b(hVar, C132568l.class);
        Bundle arguments = hVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putAll(bundle);
        hVar.setArguments(arguments);
        return hVar;
    }
}
