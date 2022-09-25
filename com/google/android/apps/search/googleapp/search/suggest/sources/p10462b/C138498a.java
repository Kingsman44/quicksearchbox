package com.google.android.apps.search.googleapp.search.suggest.sources.p10462b;

import android.content.Context;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.apps.search.googleapp.search.suggest.sources.C138366a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.b.a */
/* compiled from: PG */
public final class C138498a implements C138366a {

    /* renamed from: a */
    private final Context f376724a;

    /* renamed from: b */
    private final boolean f376725b;

    public C138498a(Context context, boolean z) {
        this.f376724a = context;
        this.f376725b = z;
    }

    /* renamed from: a */
    public final C138034az mo114248a() {
        return C138034az.NOW_PROMO;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo114249b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo114250c(C138133o oVar) {
        C138543u uVar = (C138543u) C138678v.f377195e.createBuilder();
        String str = oVar.f375825b;
        uVar.copyOnWrite();
        C138678v vVar = (C138678v) uVar.instance;
        str.getClass();
        vVar.f377197a |= 1;
        vVar.f377198b = str;
        int i = true != Locale.getDefault().equals(Locale.US) ? R.string.googleapp_access_now_promo : R.string.googleapp_access_discover_promo;
        C138027as asVar = (C138027as) C138030av.f375536m.createBuilder();
        C138034az azVar = C138034az.NOW_PROMO;
        asVar.copyOnWrite();
        C138030av avVar = (C138030av) asVar.instance;
        avVar.f375545i = azVar.f375590i;
        avVar.f375538a |= 32;
        String string = this.f376724a.getResources().getString(i);
        asVar.copyOnWrite();
        C138030av avVar2 = (C138030av) asVar.instance;
        string.getClass();
        avVar2.f375538a = 1 | avVar2.f375538a;
        avVar2.f375539b = string;
        C138029au auVar = C138029au.ACCESS_NOW_PROMO;
        asVar.copyOnWrite();
        C138030av avVar3 = (C138030av) asVar.instance;
        avVar3.f375541d = auVar.f375534n;
        avVar3.f375538a |= 4;
        C138032ax axVar = C138032ax.NOW_PROMO_GROUP;
        asVar.copyOnWrite();
        C138030av avVar4 = (C138030av) asVar.instance;
        avVar4.f375547k = axVar.f375579B;
        avVar4.f375538a |= 128;
        asVar.copyOnWrite();
        C138030av avVar5 = (C138030av) asVar.instance;
        avVar5.f375538a |= 64;
        avVar5.f375546j = 0;
        uVar.mo114311c((C138030av) asVar.build());
        return C60856cj.m92900i((C138678v) uVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo114251d(C138030av avVar) {
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo114252e() {
        return C60866ct.f164955a;
    }

    /* renamed from: f */
    public final boolean mo114253f(C138133o oVar) {
        if (!this.f376725b || !oVar.f375825b.isEmpty()) {
            return false;
        }
        C139704d a = C139704d.m227141a(oVar.f375830g);
        if (a == null) {
            a = C139704d.UNKNOWN;
        }
        return a == C139704d.WIDGET;
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo114254g() {
        return true;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo114255h() {
    }
}
