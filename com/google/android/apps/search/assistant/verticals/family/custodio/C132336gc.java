package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.C0816c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.gc */
/* compiled from: PG */
public final class C132336gc {

    /* renamed from: a */
    public static final C59071e f361238a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.gc");

    /* renamed from: b */
    public final ULPDeeplinkingFragment f361239b;

    /* renamed from: c */
    public final String f361240c;

    /* renamed from: d */
    public final AccountId f361241d;

    /* renamed from: e */
    public final C46485f f361242e;

    /* renamed from: f */
    public final Bundle f361243f;

    /* renamed from: g */
    public final C37215b f361244g;

    /* renamed from: h */
    public final Context f361245h;

    /* renamed from: i */
    public C0816c f361246i;

    public C132336gc(ULPDeeplinkingFragment uLPDeeplinkingFragment, String str, AccountId accountId, C46485f fVar, C37215b bVar, Context context) {
        this.f361239b = uLPDeeplinkingFragment;
        this.f361240c = str;
        this.f361241d = accountId;
        this.f361242e = fVar;
        Bundle arguments = uLPDeeplinkingFragment.getArguments();
        this.f361243f = arguments == null ? new Bundle() : arguments;
        this.f361244g = bVar;
        this.f361245h = context;
    }
}
