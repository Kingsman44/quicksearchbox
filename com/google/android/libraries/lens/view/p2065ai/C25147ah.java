package com.google.android.libraries.lens.view.p2065ai;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2056af.C25070bo;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2088az.C25672g;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.ai.ah */
/* compiled from: PG */
public final class C25147ah {

    /* renamed from: a */
    public static final C58974d f68466a = C58974d.m91135i("OverflowMenuButtonFragmentPeer");

    /* renamed from: b */
    public final C25143ad f68467b;

    /* renamed from: c */
    public final C28310af f68468c;

    /* renamed from: d */
    public final C28443m f68469d;

    /* renamed from: e */
    public final C27232l f68470e;

    /* renamed from: f */
    public final C25672g f68471f;

    /* renamed from: g */
    public final C46801dp f68472g;

    /* renamed from: h */
    public final Context f68473h;

    /* renamed from: i */
    public final C68214a f68474i;

    /* renamed from: j */
    public final C25070bo f68475j;

    /* renamed from: k */
    public final C25043ao f68476k;

    /* renamed from: l */
    public final boolean f68477l;

    /* renamed from: m */
    public final C28306ab f68478m;

    /* renamed from: n */
    public final C47770dh f68479n;

    /* renamed from: o */
    public final C47722m f68480o;

    /* renamed from: p */
    public final boolean f68481p;

    /* renamed from: q */
    public final boolean f68482q;

    /* renamed from: r */
    public final boolean f68483r;

    /* renamed from: s */
    public boolean f68484s = false;

    /* renamed from: t */
    public boolean f68485t = false;

    /* renamed from: u */
    public ImageView f68486u;

    /* renamed from: v */
    private final C25537t f68487v;

    public C25147ah(C25143ad adVar, C28310af afVar, C28443m mVar, C27232l lVar, C25672g gVar, C46801dp dpVar, Context context, C25537t tVar, C68214a aVar, C25070bo boVar, C25043ao aoVar, boolean z, boolean z2, boolean z3, boolean z4, C28306ab abVar, C47770dh dhVar, C47722m mVar2) {
        this.f68467b = adVar;
        this.f68468c = afVar;
        this.f68469d = mVar;
        this.f68470e = lVar;
        this.f68471f = gVar;
        this.f68472g = dpVar;
        this.f68473h = context;
        this.f68487v = tVar;
        this.f68474i = aVar;
        this.f68475j = boVar;
        this.f68476k = aoVar;
        this.f68477l = z;
        this.f68481p = z2;
        this.f68482q = z3;
        this.f68483r = z4;
        this.f68478m = abVar;
        this.f68479n = dhVar;
        this.f68480o = mVar2;
    }

    /* renamed from: a */
    public static C25143ad m46469a(AccountId accountId) {
        C25143ad adVar = new C25143ad();
        C68324h.m98669f(adVar);
        C47247a.m84047b(adVar, accountId);
        return adVar;
    }

    /* renamed from: b */
    public final void mo30286b(int i) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f68473h.getResources().getString(i)));
        this.f68487v.mo30556f(intent);
    }

    /* renamed from: c */
    public final void mo30287c(int i) {
        ImageView imageView = this.f68486u;
        if (imageView != null) {
            if (i - 1 == 0) {
                imageView.setVisibility(8);
            } else if (imageView.getVisibility() != 0) {
                C25185w.m46542a(this.f68486u);
            }
        }
    }
}
