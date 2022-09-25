package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.assistant.surfaces.onboarding.oobe.p9496b.C126661b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36657a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36675c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63145c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.s */
/* compiled from: PG */
public final class C126681s {

    /* renamed from: a */
    public static final C59071e f348849a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.oobe.s");

    /* renamed from: b */
    public final AccountId f348850b;

    /* renamed from: c */
    public final C126679q f348851c;

    /* renamed from: d */
    public final C37215b f348852d;

    /* renamed from: e */
    public final C46855i f348853e;

    /* renamed from: f */
    public final C126667h f348854f;

    /* renamed from: g */
    public final C36657a f348855g;

    /* renamed from: h */
    public final C63145c f348856h;

    /* renamed from: i */
    public final C36624a f348857i;

    /* renamed from: j */
    public final C36675c f348858j;

    /* renamed from: k */
    public final C46852f f348859k = new C126680r(this);

    /* renamed from: l */
    public boolean f348860l = false;

    public C126681s(AccountId accountId, C63145c cVar, C126679q qVar, C37215b bVar, C36624a aVar, C46855i iVar, C36675c cVar2, C36657a aVar2) {
        this.f348850b = accountId;
        this.f348856h = cVar;
        this.f348851c = qVar;
        this.f348852d = bVar;
        this.f348853e = iVar;
        this.f348857i = aVar;
        this.f348858j = cVar2;
        this.f348855g = aVar2;
        FragmentManager childFragmentManager = qVar.getChildFragmentManager();
        childFragmentManager.getClass();
        this.f348854f = new C126661b(childFragmentManager, R.id.assistant_oobe_fragment_container);
    }
}
