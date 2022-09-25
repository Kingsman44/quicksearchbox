package com.google.android.libraries.lens.view.p2092c;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.onboarding.C27473af;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25267f;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.p3516m.C44808d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4707j.C62433bj;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.c.p */
/* compiled from: PG */
final class C25720p implements C25699a, C25711g {

    /* renamed from: a */
    public static final C58974d f69924a = C58974d.m91135i("AppShortcutController");

    /* renamed from: m */
    private static final long f69925m = Duration.ofDays(4).toMillis();

    /* renamed from: b */
    public final AccountId f69926b;

    /* renamed from: c */
    public final C25727w f69927c;

    /* renamed from: d */
    public final C27232l f69928d;

    /* renamed from: e */
    public final C25225bd f69929e;

    /* renamed from: f */
    public final C21370a f69930f;

    /* renamed from: g */
    public final C60888db f69931g;

    /* renamed from: h */
    public boolean f69932h;

    /* renamed from: i */
    public boolean f69933i;

    /* renamed from: j */
    public C25723s f69934j = C25723s.UNSET;

    /* renamed from: k */
    public final C25989d f69935k;

    /* renamed from: l */
    public int f69936l;

    /* renamed from: n */
    private final C68214a f69937n;

    /* renamed from: o */
    private final C25752a f69938o;

    /* renamed from: p */
    private final C60870cx f69939p;

    /* renamed from: q */
    private boolean f69940q;

    public C25720p(AccountId accountId, C25727w wVar, C68214a aVar, C27232l lVar, C25225bd bdVar, C25752a aVar2, C21370a aVar3, C60888db dbVar, C25989d dVar) {
        this.f69926b = accountId;
        this.f69927c = wVar;
        this.f69937n = aVar;
        this.f69928d = lVar;
        this.f69929e = bdVar;
        this.f69938o = aVar2;
        this.f69930f = aVar3;
        this.f69931g = dbVar;
        C25714j jVar = new C25714j(this);
        this.f69939p = C60856cj.m92902k(C47810es.m84965e(jVar), 2000, TimeUnit.MILLISECONDS, dbVar);
        this.f69935k = dVar;
    }

    /* renamed from: a */
    public final void mo30828a() {
        mo30857k("AppShortcutBannerFragment");
        C25727w wVar = this.f69927c;
        int g = mo30850g() - 1;
        wVar.mo30862b();
        if (g != 0) {
            Intent component = new Intent().setComponent(new ComponentName(wVar.f69954d.f69961a, "com.google.android.apps.search.lens.LensActivity"));
            component.setAction("android.intent.action.VIEW");
            component.putExtra("LensHomescreenShortcut", true);
            component.putExtra("caller_package", "com.google.android.googlequicksearchbox");
            component.putExtra("lens_intent_type", C62433bj.LENS_APP_SHORTCUT.f168594ao);
            PendingIntent e = wVar.mo30865e(2);
            String string = wVar.f69953c.getResources().getString(R.string.lens_homescreen_shortcut_label);
            ((ShortcutManager) wVar.f69953c.getSystemService(ShortcutManager.class)).requestPinShortcut(new ShortcutInfo.Builder(wVar.f69953c, "LensHomescreenShortcut").setShortLabel(string).setLongLabel(string).setIcon(Icon.createWithResource(wVar.f69953c, R.mipmap.lens_launcher)).setIntent(component).build(), e.getIntentSender());
            wVar.f69955e.mo30251a(C118575h.PLUGIN_LENS, C118569b.LENS_APP_SHORTCUT_REQUESTED, 1);
            if (wVar.f69957g) {
                ((C19567d) wVar.f69956f.f68256h.mo6453a()).mo24822a(1, new Object[0]);
            }
        } else {
            PendingIntent e2 = wVar.mo30865e(1);
            AppWidgetManager instance = AppWidgetManager.getInstance(wVar.f69953c);
            RemoteViews remoteViews = new RemoteViews(wVar.f69953c.getPackageName(), R.layout.lens_qsb_widget_preview);
            Bundle bundle = new Bundle();
            bundle.putParcelable("appWidgetPreview", remoteViews);
            instance.requestPinAppWidget(C25727w.f69951a, bundle, e2);
            wVar.f69955e.mo30251a(C118575h.PLUGIN_LENS, C118569b.QSB_WIDGET_APP_SHORTCUT_REQUESTED, 1);
            if (wVar.f69957g) {
                ((C19567d) wVar.f69956f.f68254f.mo6453a()).mo24822a(1, new Object[0]);
            }
        }
        this.f69932h = false;
    }

    /* renamed from: b */
    public final void mo30829b(C25980d dVar) {
        if (dVar == C25980d.TRANSLATE && mo30859m()) {
            mo30857k("AppShortcutBannerFragment");
        }
    }

    /* renamed from: c */
    public final void mo30830c() {
        this.f69933i = false;
    }

    /* renamed from: d */
    public final void mo30831d() {
        mo30857k("AppShortcutTooltipFragment");
    }

    /* renamed from: e */
    public final boolean mo30832e() {
        return this.f69934j == C25723s.ELIGIBLE && !((Boolean) this.f69927c.f69959i.mo3842a()).booleanValue();
    }

    /* renamed from: f */
    public final void mo30849f() {
        mo30857k("AppShortcutBannerFragment");
        AccountId accountId = this.f69926b;
        C25700aa aaVar = new C25700aa();
        C68324h.m98669f(aaVar);
        C47247a.m84047b(aaVar, accountId);
        mo30854h(R.id.lens_coordinator_container, aaVar, "AppShortcutTooltipFragment");
        aaVar.mo17754z().f69885c = this.f69931g.mo29164d(new C25713i(this), 3050, TimeUnit.MILLISECONDS);
    }

    /* renamed from: g */
    public final int mo30850g() {
        if (this.f69934j != C25723s.ELIGIBLE) {
            ((C58970a) ((C58970a) f69924a.mo56226d()).mo56372aa(48998)).mo56389s("Attempted to access shortcut type but the user's eligibility is: %s", this.f69934j);
            return 2;
        }
        int i = this.f69936l;
        if (i != 0) {
            return i;
        }
        throw null;
    }

    /* renamed from: h */
    public final void mo30854h(int i, Fragment fragment, String str) {
        FragmentManager fragmentManager = (FragmentManager) this.f69937n.mo27525b();
        if (!fragmentManager.f659z && !fragmentManager.mo461ab()) {
            fragment.setEnterTransition(new C44808d());
            fragment.setExitTransition(new C44808d());
            C0154a aVar = new C0154a(fragmentManager);
            aVar.mo511h(i, fragment, str, 1);
            aVar.mo509f();
        }
    }

    /* renamed from: i */
    public final void mo30855i() {
        if (!this.f69939p.isDone()) {
            if (!this.f69940q) {
                this.f69939p.mo4106b(C47810es.m84977q(new C25715k(this)), this.f69931g);
                this.f69940q = true;
            }
        } else if (this.f69932h) {
            C46459k.m82829b(this.f69931g.mo29164d(C47810es.m84977q(new C25716l(this)), 500, TimeUnit.MILLISECONDS), "Error triggering AppShortcut banner", new Object[0]);
        }
    }

    /* renamed from: j */
    public final void mo30856j(C26968d dVar) {
        if (dVar == C26968d.OPEN && !((C27473af) this.f69938o.mo3842a()).mo33010b()) {
            this.f69933i = true;
            mo30855i();
        }
    }

    /* renamed from: k */
    public final void mo30857k(String str) {
        Fragment c;
        FragmentManager fragmentManager = (FragmentManager) this.f69937n.mo27525b();
        if (!fragmentManager.f659z && !fragmentManager.mo461ab() && (c = fragmentManager.f634a.mo671c(str)) != null) {
            C0154a aVar = new C0154a(fragmentManager);
            aVar.mo516m(c);
            aVar.mo509f();
        }
    }

    /* renamed from: l */
    public final boolean mo30858l(C25267f fVar) {
        if (fVar.f68740c.size() - 1 > 0) {
            long j = fVar.f68741d;
            return j == 0 || this.f69930f.mo26870b() - j > f69925m;
        }
    }

    /* renamed from: m */
    public final boolean mo30859m() {
        return ((FragmentManager) this.f69937n.mo27525b()).f634a.mo671c("AppShortcutBannerFragment") != null;
    }
}
