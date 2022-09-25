package com.google.android.apps.search.googleapp.stampviewer.webview.p10511h;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.apps.search.googleapp.stampviewer.p10497i.C139424c;
import com.google.android.apps.search.googleapp.stampviewer.p10497i.p10498a.C139420b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.contrib.p3358b.C43402c;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.h.d */
/* compiled from: PG */
public final class C139622d {

    /* renamed from: a */
    public static final C59071e f379537a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.h.d");

    /* renamed from: b */
    public final C43402c f379538b;

    /* renamed from: c */
    public final C139420b f379539c;

    /* renamed from: d */
    public final C46439e f379540d;

    /* renamed from: e */
    public final ScheduledExecutorService f379541e;

    /* renamed from: f */
    public final boolean f379542f;

    /* renamed from: g */
    public final Duration f379543g;

    /* renamed from: h */
    public final C139392b f379544h;

    /* renamed from: i */
    public final C37215b f379545i;

    /* renamed from: j */
    public final boolean f379546j;

    /* renamed from: k */
    public boolean f379547k = false;

    /* renamed from: l */
    private final Fragment f379548l;

    /* renamed from: m */
    private final C43377v f379549m;

    /* renamed from: n */
    private C46440f f379550n = null;

    public C139622d(C139392b bVar, C43402c cVar, Fragment fragment, C139420b bVar2, C46439e eVar, ScheduledExecutorService scheduledExecutorService, boolean z, long j, C43377v vVar, C37215b bVar3, boolean z2) {
        this.f379538b = cVar;
        this.f379548l = fragment;
        this.f379539c = bVar2;
        this.f379540d = eVar;
        this.f379541e = scheduledExecutorService;
        this.f379542f = z;
        this.f379543g = Duration.ofMillis(j);
        this.f379549m = vVar;
        this.f379544h = bVar;
        this.f379545i = bVar3;
        this.f379546j = z2;
    }

    /* renamed from: a */
    public final C46440f mo115104a() {
        if (this.f379550n == null) {
            this.f379550n = new C46440f() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                    C62722b bVar;
                    String str = (String) obj;
                    C139622d dVar = C139622d.this;
                    if (th instanceof TimeoutException) {
                        bVar = C62722b.DEADLINE_EXCEEDED;
                    } else if (th instanceof IllegalArgumentException) {
                        bVar = C62722b.UNAUTHENTICATED;
                    } else {
                        bVar = C62722b.UNKNOWN;
                    }
                    dVar.mo115105b(bVar);
                    ((C59052c) ((C59052c) ((C59052c) C139622d.f379537a.mo56225c()).mo56382g(th)).mo56372aa(41406)).mo56389s("Cannot create short dynamic link for STAMP: %s", bVar.name());
                    C139622d.this.mo115106c(str);
                }

                /* renamed from: c */
                public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                    String str = (String) obj;
                    C139622d.this.mo115105b(C62722b.OK);
                    C139622d.this.mo115106c((String) obj2);
                }

                /* renamed from: i */
                public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
                    String str = (String) obj;
                }
            };
        }
        return this.f379550n;
    }

    /* renamed from: b */
    public final void mo115105b(C62722b bVar) {
        if (this.f379547k) {
            this.f379547k = false;
            this.f379545i.mo19974a(C37182a.f98043fJ.mo40806d().mo40781e(bVar));
        }
    }

    /* renamed from: c */
    public final void mo115106c(String str) {
        String str2 = this.f379549m.mo46468a().f113334g;
        Fragment fragment = this.f379548l;
        fragment.getClass();
        fragment.startActivity(C139424c.m226558a(str, str2));
    }
}
