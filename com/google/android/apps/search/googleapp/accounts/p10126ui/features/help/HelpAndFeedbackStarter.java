package com.google.android.apps.search.googleapp.accounts.p10126ui.features.help;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.p10338l.C136418l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.help.HelpAndFeedbackStarter */
/* compiled from: PG */
public final class HelpAndFeedbackStarter {

    /* renamed from: a */
    public static final C59071e f363247a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.features.help.HelpAndFeedbackStarter");

    /* renamed from: b */
    public final AccountId f363248b;

    /* renamed from: c */
    public final C136418l f363249c;

    /* renamed from: d */
    public final Fragment f363250d;

    /* renamed from: e */
    public final C46439e f363251e;

    /* renamed from: f */
    public final C46440f f363252f;

    /* renamed from: g */
    private final C2376g f363253g;

    public HelpAndFeedbackStarter(final AccountId accountId, C136418l lVar, final Fragment fragment, C46439e eVar) {
        C1333021 r0 = new C2376g() {
            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }

            /* renamed from: gV */
            public final void mo3520gV(C2391v vVar) {
                HelpAndFeedbackStarter helpAndFeedbackStarter = HelpAndFeedbackStarter.this;
                C46439e eVar = helpAndFeedbackStarter.f363251e;
                eVar.getClass();
                C46440f fVar = helpAndFeedbackStarter.f363252f;
                fVar.getClass();
                eVar.mo50429i(fVar);
            }
        };
        this.f363253g = r0;
        this.f363248b = accountId;
        this.f363249c = lVar;
        this.f363250d = fragment;
        this.f363251e = eVar;
        this.f363252f = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) HelpAndFeedbackStarter.f363247a.mo56225c()).mo56382g(th)).mo56372aa(40031)).mo56386p("Error saving screenshot");
                Fragment fragment = Fragment.this;
                fragment.startActivity(HelpAndFeedbackStarter.m216354a(fragment, accountId, Optional.empty()));
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                Fragment fragment = Fragment.this;
                fragment.startActivity(HelpAndFeedbackStarter.m216354a(fragment, accountId, Optional.m71637of("agaMavatarFeedbackScreenshot")));
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
            }
        };
        fragment.getLifecycle().mo5790b(r0);
    }

    /* renamed from: a */
    public static final Intent m216354a(Fragment fragment, AccountId accountId, Optional optional) {
        Intent intent = new Intent();
        intent.setClassName(fragment.getContext(), "com.google.android.apps.search.googleapp.accounts.ui.features.help.HelpAndFeedbackActivity");
        C45963aa.m82131a(intent, accountId);
        if (optional.isPresent()) {
            intent.putExtra("EXTRA_SCREENSHOT_FILENAME", (String) optional.get());
        }
        return intent;
    }
}
