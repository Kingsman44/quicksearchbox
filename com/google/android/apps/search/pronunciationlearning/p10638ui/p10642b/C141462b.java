package com.google.android.apps.search.pronunciationlearning.p10638ui.p10642b;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.surveys.C43170k;
import com.google.android.libraries.surveys.C43171l;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4552o.aqe;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.b.b */
/* compiled from: PG */
public final class C141462b {

    /* renamed from: a */
    public final Context f383975a;

    /* renamed from: b */
    public final Activity f383976b;

    /* renamed from: c */
    public final C46440f f383977c = new C141463a();

    /* renamed from: d */
    public final aqe f383978d;

    /* renamed from: com.google.android.apps.search.pronunciationlearning.ui.b.b$a */
    /* compiled from: PG */
    final class C141463a implements C46440f {
        public C141463a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Account account = (Account) obj2;
            C141462b bVar = C141462b.this;
            Context context = bVar.f383975a;
            if (context == null) {
                throw new IllegalArgumentException("Client context is not set.");
            } else if (!TextUtils.isEmpty("RtJNqGr1o0qMhXZpyv70SqGUk677")) {
                C43171l.m75930b(new C43170k(context, "RtJNqGr1o0qMhXZpyv70SqGUk677", new C141461a(bVar, account), "AIzaSyCI9POUp8lQ8ec0nI3Ox1PVo_lqZlnMM1A", account, false));
            } else {
                throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C141462b(Context context, Activity activity, aqe aqe) {
        this.f383975a = context;
        this.f383976b = activity;
        this.f383978d = aqe;
    }
}
