package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82185s;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9725a.C128467a;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9727c.C128535a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2479c.p2480a.C32169d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Map;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.r */
/* compiled from: PG */
public final class C130146r extends C130148t implements C45987ay {

    /* renamed from: a */
    public C45989b f356813a;

    /* renamed from: b */
    public C128467a f356814b;

    /* renamed from: c */
    public C128535a f356815c;

    /* renamed from: d */
    public C28310af f356816d;

    /* renamed from: e */
    public C28306ab f356817e;

    /* renamed from: f */
    public Map f356818f;

    /* renamed from: g */
    public C130136h f356819g;

    /* renamed from: h */
    public View f356820h;

    /* renamed from: i */
    public Supplier f356821i;

    /* renamed from: j */
    public boolean f356822j;

    /* renamed from: k */
    public C82185s f356823k;

    /* renamed from: j */
    private static View m212462j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getId() == 16908290) {
                return m212462j(childAt);
            }
        }
        return view;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        View i = mo22017i();
        if (this.f356822j) {
            C28306ab.m52929e(i);
        }
        C28306ab abVar = this.f356817e;
        C28313c a = this.f356816d.mo33805a(C28427h.m53115a(151758));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(151759));
        a.mo33859g(C45954d.m82060a(accountId));
        abVar.mo33801b(i, a);
        this.f356822j = true;
        FragmentManager q = mo51122q();
        View view = this.f356820h;
        view.getClass();
        Fragment b = q.f634a.mo670b(view.getId());
        C0154a aVar = new C0154a(mo51122q());
        if (b != null) {
            aVar.mo516m(b);
        }
        AccountId accountId2 = awVar.f120815a.f120816a;
        C130130b bVar = new C130130b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId2);
        View view2 = this.f356820h;
        view2.getClass();
        aVar.mo511h(view2.getId(), bVar, (String) null, 1);
        aVar.mo509f();
        C130136h a2 = bVar.mo17754z();
        this.f356819g = a2;
        a2.f356803d = new C130145q(this);
        Supplier supplier = this.f356821i;
        if (supplier != null) {
            for (Map.Entry entry : ((C130140l) supplier).f356806a.f356788d.entrySet()) {
                bVar.mo17754z().mo109524a((C130127c) entry.getKey(), (Function) entry.getValue());
            }
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) AssistLayerFragmentHostImpl.f356785a.mo56226d()).mo56382g(th)).mo56372aa(38713)).mo56386p("onAccountError. Removing AssistLayerAccountFragment.");
        FragmentManager q = mo51122q();
        View view = this.f356820h;
        view.getClass();
        Fragment b = q.f634a.mo670b(view.getId());
        C0154a aVar = new C0154a(mo51122q());
        if (b != null) {
            aVar.mo516m(b);
        }
        aVar.mo509f();
        C82185s sVar = this.f356823k;
        if (sVar != null) {
            sVar.f224617a.mo75177e();
        }
    }

    /* renamed from: c */
    public final void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }

    /* renamed from: i */
    public final View mo22017i() {
        View findViewById = this.f122878z.findViewById(16908290);
        View j = m212462j(findViewById);
        return j != null ? j : findViewById;
    }

    /* renamed from: jP */
    public final void mo19987jP(Bundle bundle) {
        C45989b bVar = this.f356813a;
        C46012bw g = C46013bx.m82203g();
        g.mo50147b().mo55395g(C32169d.class);
        bVar.mo50083f(g.mo50146a());
        bVar.mo50082e(this);
        super.mo19987jP((Bundle) null);
    }
}
