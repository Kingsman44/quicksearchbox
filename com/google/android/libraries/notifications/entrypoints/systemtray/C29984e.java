package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.p2266c.C29783b;
import com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29939b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2337h.p2338a.C30144a;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.notifications.entrypoints.systemtray.e */
/* compiled from: PG */
public final class C29984e {

    /* renamed from: a */
    public final C68214a f81179a;

    /* renamed from: b */
    public final C68214a f81180b;

    /* renamed from: c */
    public final C68214a f81181c;

    /* renamed from: d */
    public final C68214a f81182d;

    /* renamed from: e */
    private final C68214a f81183e;

    public C29984e(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f81183e = aVar;
        this.f81179a = aVar2;
        this.f81180b = aVar3;
        this.f81181c = aVar4;
        this.f81182d = aVar5;
    }

    /* renamed from: b */
    static boolean m55597b(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID") != null;
    }

    /* renamed from: a */
    public final void mo35282a(Context context, Intent intent) {
        if (!m55597b(intent)) {
            C30058b.m55794f("ThreadUpdateActivityIntentHandler", "Intent is null or have null action.", new Object[0]);
        } else if (!intent.getBooleanExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", false)) {
            intent.putExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", true);
            C30144a.m56002a(context.getApplicationContext());
            String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACCOUNT_NAME");
            String stringExtra2 = intent.getStringExtra("com.google.android.libraries.notifications.THREAD_ID");
            String stringExtra3 = intent.getStringExtra("com.google.android.libraries.notifications.GROUP_ID");
            C55564bq a = C29939b.m55464a(intent);
            int h = C29939b.m55471h(intent);
            if (!(stringExtra2 == null && stringExtra3 == null)) {
                int g = C29939b.m55470g(intent);
                String stringExtra4 = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
                if (stringExtra4 != null && stringExtra4.startsWith("com.google.android.libraries.notifications.ACTION_ID:")) {
                    stringExtra4 = stringExtra4.replaceFirst("com.google.android.libraries.notifications.ACTION_ID:", BuildConfig.FLAVOR);
                }
                ((C29783b) this.f81183e.mo27525b()).mo34980b(new C29983d(this, stringExtra, stringExtra2, stringExtra3, g, stringExtra4, a, h));
                C30058b.m55794f("ThreadUpdateActivityIntentHandler", "Scheduled job to handle thread update.", new Object[0]);
            }
            C30058b.m55794f("ThreadUpdateActivityIntentHandler", "Marking thread update as handled.", new Object[0]);
        }
    }
}
