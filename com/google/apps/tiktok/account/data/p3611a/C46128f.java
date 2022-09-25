package com.google.apps.tiktok.account.data.p3611a;

import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;

/* renamed from: com.google.apps.tiktok.account.data.a.f */
/* compiled from: PG */
public final class C46128f {

    /* renamed from: a */
    public static final C59071e f121019a = C59071e.m91332i("com.google.apps.tiktok.account.data.a.f");

    /* renamed from: b */
    public final C58833ax f121020b;

    /* renamed from: c */
    public final boolean f121021c;

    /* renamed from: d */
    private final C58833ax f121022d;

    public C46128f(C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f121020b = axVar;
        this.f121022d = axVar2;
        this.f121021c = !((Boolean) axVar3.mo56109e(false)).booleanValue();
    }

    /* renamed from: d */
    public static String m82356d(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return m82357g(lowerCase) ? String.valueOf(lowerCase.substring(0, lowerCase.lastIndexOf("@")).replace(".", BuildConfig.FLAVOR).replace('i', 'l').replace('1', 'l').replace('0', 'o').replace('2', 'z').replace('5', 's')).concat("@gmail.com") : lowerCase;
    }

    /* renamed from: g */
    public static boolean m82357g(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.endsWith("@googlemail.com") || lowerCase.endsWith("@gmail.com");
    }

    /* renamed from: h */
    public static final boolean m82358h(C46215j jVar) {
        return !jVar.f121163h;
    }

    /* renamed from: a */
    public final C60870cx mo50214a(AccountId accountId) {
        return C60922j.m93044g(mo50215b(accountId), C47810es.m84963c(C46127e.f121018a), C60826bg.f164896a);
    }

    @Deprecated
    /* renamed from: b */
    public final C60870cx mo50215b(AccountId accountId) {
        if (accountId == null || !this.f121020b.mo56113h()) {
            return C60856cj.m92899h(new C46167as());
        }
        return C60846c.m92878g(C60922j.m93044g(((C46325t) this.f121020b.mo56107c()).mo50284d(accountId), C47810es.m84963c(new C46124b(this)), C60826bg.f164896a), IllegalArgumentException.class, C47810es.m84963c(C46125c.f121015a), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo50216c(String str) {
        if (str == null || !this.f121020b.mo56113h() || !this.f121022d.mo56113h()) {
            return C60856cj.m92899h(new C46167as());
        }
        return C60922j.m93044g(((C46325t) this.f121020b.mo56107c()).mo50286f(), C47810es.m84963c(new C46126d(this, str)), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final String mo50217e(C46215j jVar) {
        if (!this.f121022d.mo56113h() || !((String) this.f121022d.mo56107c()).equals(jVar.f121165j)) {
            return null;
        }
        return jVar.f121161f;
    }

    /* renamed from: f */
    public final boolean mo50218f(C46215j jVar) {
        return this.f121022d.mo56113h() && ((String) this.f121022d.mo56107c()).equals(jVar.f121165j);
    }

    /* renamed from: i */
    public final C60870cx mo50219i(AccountId accountId) {
        return C60846c.m92878g(mo50215b(accountId), C46167as.class, C47810es.m84963c(C46109a.f121000a), C60826bg.f164896a);
    }
}
