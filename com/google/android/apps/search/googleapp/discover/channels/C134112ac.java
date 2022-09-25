package com.google.android.apps.search.googleapp.discover.channels;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.inject.C47231d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ac */
/* compiled from: PG */
public final class C134112ac {

    /* renamed from: j */
    private static final C59071e f365322j = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.channels.ac");

    /* renamed from: a */
    public final C134188t f365323a;

    /* renamed from: b */
    public final C134139ba f365324b;

    /* renamed from: c */
    public final C134714d f365325c;

    /* renamed from: d */
    public final AccountId f365326d;

    /* renamed from: e */
    public final C134186r f365327e;

    /* renamed from: f */
    public final C46778cv f365328f;

    /* renamed from: g */
    public final C28306ab f365329g;

    /* renamed from: h */
    public final C134724d f365330h;

    /* renamed from: i */
    public final boolean f365331i;

    public C134112ac(C134188t tVar, C134139ba baVar, C134714d dVar, AccountId accountId, C134186r rVar, C46778cv cvVar, C28306ab abVar, C134724d dVar2, boolean z) {
        this.f365323a = tVar;
        this.f365324b = baVar;
        this.f365325c = dVar;
        this.f365326d = accountId;
        this.f365327e = rVar;
        this.f365328f = cvVar;
        this.f365329g = abVar;
        this.f365330h = dVar2;
        this.f365331i = z;
    }

    /* renamed from: a */
    public final Optional mo111567a() {
        Fragment c = this.f365327e.getChildFragmentManager().f634a.mo671c("DiscoverFragmentTag");
        if (c != null) {
            return Optional.ofNullable((C134744f) ((C47231d) c).mo17754z());
        }
        ((C59052c) ((C59052c) f365322j.mo56225c()).mo56372aa(40310)).mo56386p("No Discover fragment attached.");
        return Optional.empty();
    }
}
