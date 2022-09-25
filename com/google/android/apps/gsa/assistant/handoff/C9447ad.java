package com.google.android.apps.gsa.assistant.handoff;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.ad */
/* compiled from: PG */
final class C9447ad {

    /* renamed from: b */
    private static final C59071e f32863b = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.ad");

    /* renamed from: a */
    public final Uri f32864a;

    /* renamed from: c */
    private final C86054o f32865c;

    /* renamed from: d */
    private final Intent f32866d;

    /* renamed from: e */
    private final C58833ax f32867e;

    public C9447ad(C86054o oVar, Intent intent, Uri uri) {
        this.f32865c = oVar;
        this.f32866d = intent;
        this.f32864a = uri;
        this.f32867e = C58833ax.m90833j(intent.getData());
    }

    /* renamed from: f */
    private static boolean m23964f(String str) {
        return str.equalsIgnoreCase("true") || str.equals("1");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58833ax mo17687a() {
        C58833ax b = mo17688b("account_name", "account_name");
        Account a = this.f32865c.mo79668a();
        if (a == null) {
            ((C59052c) ((C59052c) f32863b.mo56225c()).mo56372aa(272)).mo56386p("Couldn't retrieve account from login helper.");
            return C58836b.f156633a;
        } else if (!b.mo56113h() || a.name.equalsIgnoreCase((String) b.mo56107c())) {
            return C58833ax.m90834k(a);
        } else {
            String str = a.name;
            C90476a aVar = C90754k.f253829b;
            C90476a aVar2 = C90754k.f253829b;
            Object c = C90753j.m148241c(str);
            C90476a aVar3 = C90754k.f253829b;
            C90476a aVar4 = C90754k.f253829b;
            ((C59052c) ((C59052c) f32863b.mo56225c()).mo56372aa(271)).mo56354G("Account mismatch, account in use: %s, handoff account to use: %s, ", c, C90753j.m148241c((CharSequence) b.mo56107c()));
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public final C58833ax mo17688b(String str, String str2) {
        String str3;
        if (this.f32864a.getQueryParameter(str) != null) {
            str3 = this.f32864a.getQueryParameter(str);
        } else if (this.f32866d.hasExtra(str2)) {
            str3 = this.f32866d.getStringExtra(str2);
        } else {
            C58833ax axVar = this.f32867e;
            str3 = (!axVar.mo56113h() || ((Uri) axVar.mo56107c()).getQueryParameter(str) == null) ? BuildConfig.FLAVOR : ((Uri) this.f32867e.mo56107c()).getQueryParameter(str);
        }
        return TextUtils.isEmpty(str3) ? C58836b.f156633a : C58833ax.m90834k(str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Integer mo17689c(String str) {
        int i;
        if (this.f32864a.getQueryParameter(str) != null) {
            i = Integer.parseInt(this.f32864a.getQueryParameter(str));
        } else if (this.f32866d.hasExtra(str)) {
            return Integer.valueOf(this.f32866d.getIntExtra(str, 0));
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo17690d(String str) {
        if (this.f32864a.getQueryParameter(str) != null) {
            return m23964f(this.f32864a.getQueryParameter(str));
        }
        if (this.f32866d.hasExtra(str)) {
            return this.f32866d.getBooleanExtra(str, false);
        }
        C58833ax axVar = this.f32867e;
        if (!axVar.mo56113h() || ((Uri) axVar.mo56107c()).getQueryParameter(str) == null) {
            return false;
        }
        return m23964f(((Uri) this.f32867e.mo56107c()).getQueryParameter(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo17691e(String str, String str2) {
        return this.f32864a.getScheme().equals(str) && this.f32864a.getHost().equals(str2);
    }
}
