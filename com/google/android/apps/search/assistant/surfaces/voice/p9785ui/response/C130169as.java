package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0213ce;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.as */
/* compiled from: PG */
public final class C130169as {

    /* renamed from: a */
    public final C130299r f356898a;

    /* renamed from: b */
    public final AccountId f356899b;

    public C130169as(C130299r rVar, AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        this.f356898a = rVar;
        this.f356899b = accountId;
    }

    /* renamed from: a */
    public static final void m212506a(C0213ce ceVar, Fragment fragment) {
        ceVar.mo689v(R.id.assistant_response_layer_transcription_container, fragment, (String) null);
        C69664n.m101060f(ceVar, "replace(R.id.assistant_r…n_container, newFragment)");
    }

    /* renamed from: b */
    public static final Fragment m212507b(Fragment fragment) {
        return fragment.getChildFragmentManager().f634a.mo670b(R.id.assistant_response_layer_transcription_container);
    }

    /* renamed from: c */
    public static final void m212508c(Fragment fragment, Fragment fragment2) {
        m212510e(fragment, new C130168ar(fragment2));
    }

    /* renamed from: d */
    public static final void m212509d(Fragment fragment, Fragment fragment2, Fragment fragment3) {
        m212510e(fragment, new C130167aq(fragment2, fragment3));
    }

    /* renamed from: e */
    private static final void m212510e(Fragment fragment, C69626l lVar) {
        C0154a aVar = new C0154a(fragment.getChildFragmentManager());
        lVar.mo5761a(aVar);
        aVar.mo509f();
    }
}
