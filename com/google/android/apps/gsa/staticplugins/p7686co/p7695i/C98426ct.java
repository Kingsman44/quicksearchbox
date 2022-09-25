package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.util.C91070p;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.ct */
/* compiled from: PG */
final class C98426ct implements C90991b {

    /* renamed from: a */
    public static final SimpleDateFormat f274782a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    /* renamed from: i */
    private static final C59071e f274783i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.i.ct");

    /* renamed from: b */
    public final C21370a f274784b;

    /* renamed from: c */
    public final C89037bh f274785c;

    /* renamed from: d */
    public boolean f274786d;

    /* renamed from: e */
    public boolean f274787e;

    /* renamed from: f */
    public boolean f274788f;

    /* renamed from: g */
    final Queue f274789g = new C58781rt(new C58425eo(3));

    /* renamed from: h */
    final Queue f274790h = new C58781rt(new C58425eo(8));

    /* renamed from: j */
    private final C118561t f274791j;

    /* renamed from: k */
    private final Context f274792k;

    public C98426ct(C118561t tVar, C21370a aVar, C89037bh bhVar, Context context) {
        this.f274791j = tVar;
        this.f274784b = aVar;
        this.f274785c = bhVar;
        this.f274792k = context;
    }

    /* renamed from: c */
    private final void m162987c() {
        this.f274791j.mo103752c(C98430cx.f274799b);
    }

    /* renamed from: e */
    private final void m162988e() {
        this.f274791j.mo103752c(C98430cx.f274800c);
    }

    /* renamed from: f */
    private final void m162989f(C118522by byVar, C118472ag agVar) {
        this.f274791j.mo103752c(byVar);
        if (!this.f274791j.mo103754e(byVar, agVar)) {
            ((C59052c) ((C59052c) f274783i.mo56226d()).mo56372aa(30680)).mo56354G("There was a problem scheduling {%s %s}", byVar, agVar.toString().replace("\n", BuildConfig.FLAVOR));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo91089a() {
        C90748e.m148224b();
        return C60922j.m93044g(this.f274785c.mo27378c(), new C98420cn(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo91090b(int i, int i2) {
        int i3 = i - 1;
        if (i3 == 0) {
            this.f274788f = false;
            m162988e();
            m162987c();
        } else if (i3 == 2) {
            this.f274788f = true;
            m162988e();
            m162989f(C98430cx.f274799b, C98430cx.m162998c());
        } else if (i3 == 3 || i3 == 4) {
            this.f274788f = false;
            m162988e();
            m162987c();
            if (!this.f274787e) {
                this.f274791j.mo103754e(C98430cx.f274798a, C118472ag.f328819i);
            } else {
                C91070p.m148777b(this.f274792k, new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.sidekick.main.entry.EntriesRefreshIntentService").setAction("com.google.android.apps.sidekick.REFRESH"));
            }
        } else {
            this.f274788f = false;
            m162989f(C98430cx.f274800c, C98430cx.m162997b(TimeUnit.SECONDS.toMillis((long) i2)));
            m162987c();
        }
        this.f274790h.add(new C98424cr(this, i));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("RequestScheduler");
        fVar.mo85279c("init").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f274786d)));
        fVar.mo85279c("isForeground").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f274787e)));
        fVar.mo85279c("waiting").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f274788f)));
        if (!this.f274789g.isEmpty()) {
            C91006f e = fVar.mo85281e((Object) null);
            e.mo85291r("foregroundTransitions");
            for (C90991b gS : this.f274789g) {
                gS.mo17602gS(e.mo85281e((Object) null));
            }
        }
        if (!this.f274790h.isEmpty()) {
            C91006f e2 = fVar.mo85281e((Object) null);
            e2.mo85291r("scheduleDecisions");
            for (C90991b gS2 : this.f274790h) {
                gS2.mo17602gS(e2.mo85281e((Object) null));
            }
        }
    }
}
