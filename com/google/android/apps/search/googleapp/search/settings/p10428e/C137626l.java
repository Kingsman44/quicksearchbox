package com.google.android.apps.search.googleapp.search.settings.p10428e;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.l */
/* compiled from: PG */
public final class C137626l implements C139875k {

    /* renamed from: a */
    private final Context f374358a;

    public C137626l(Context context) {
        C69664n.m101061g(context, "context");
        this.f374358a = context;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 141527;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return -1;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        C137622h hVar = new C137622h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        return hVar;
    }

    /* renamed from: f */
    public final boolean mo111861f() {
        return true;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f374358a.getString(R.string.googleapp_region_setting_title);
        C69664n.m101060f(string, "context.getString(R.stri…app_region_setting_title)");
        return string;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
