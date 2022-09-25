package com.google.apps.tiktok.inject;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3654a.C47199g;

/* renamed from: com.google.apps.tiktok.inject.e */
/* compiled from: PG */
public final class C47245e {

    /* renamed from: com.google.apps.tiktok.inject.e$a */
    /* compiled from: PG */
    public interface C47246a {
        /* renamed from: ds */
        C47199g mo51146ds();
    }

    /* renamed from: a */
    public static Object m84045a(Context context, Class cls, AccountId accountId) {
        try {
            return cls.cast(((C47246a) C47266f.m84076a(context.getApplicationContext(), C47246a.class)).mo51146ds().mo51105a(accountId));
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
        }
    }
}
