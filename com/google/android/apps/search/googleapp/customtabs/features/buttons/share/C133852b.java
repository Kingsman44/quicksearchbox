package com.google.android.apps.search.googleapp.customtabs.features.buttons.share;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.p3604b.C46064e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.share.b */
/* compiled from: PG */
public final class C133852b {

    /* renamed from: a */
    public final Context f364581a;

    /* renamed from: b */
    public final C46064e f364582b;

    /* renamed from: c */
    public final Executor f364583c;

    public C133852b(Context context, C46064e eVar, Executor executor) {
        this.f364581a = context;
        this.f364582b = eVar;
        this.f364583c = executor;
    }

    /* renamed from: a */
    public static Intent m217126a() {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(8388608);
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.googleapp.customtabs.features.buttons.share.ShareActivity");
        return intent;
    }
}
