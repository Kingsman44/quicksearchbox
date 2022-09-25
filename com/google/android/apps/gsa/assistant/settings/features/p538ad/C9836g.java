package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.support.p031v4.app.C0167am;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9805ak;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.p3674l.p3676b.C47386p;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47770dh;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.g */
/* compiled from: PG */
public final class C9836g {

    /* renamed from: a */
    public final C9833d f33828a;

    /* renamed from: b */
    public final C9805ak f33829b;

    /* renamed from: c */
    public final C46439e f33830c;

    /* renamed from: d */
    public final C47386p f33831d;

    /* renamed from: e */
    public final C86124t f33832e;

    /* renamed from: f */
    public final C28310af f33833f;

    /* renamed from: g */
    public final C28443m f33834g;

    /* renamed from: h */
    public final C47770dh f33835h;

    /* renamed from: i */
    public final Boolean f33836i;

    /* renamed from: j */
    public final Boolean f33837j;

    /* renamed from: k */
    public final Boolean f33838k;

    /* renamed from: l */
    public final Boolean f33839l;

    /* renamed from: m */
    public final C46440f f33840m = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C47386p) Objects.requireNonNull(C9836g.this.f33831d)).mo51246a(th, ((C9833d) Objects.requireNonNull(C9836g.this.f33828a)).requireView());
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            ((C0167am) Objects.requireNonNull(((C9833d) Objects.requireNonNull(C9836g.this.f33828a)).getActivity())).setResult(-1);
            ((C0167am) Objects.requireNonNull(((C9833d) Objects.requireNonNull(C9836g.this.f33828a)).getActivity())).onBackPressed();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: n */
    public final C104149a f33841n;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.g$a */
    /* compiled from: PG */
    public final class C9838a implements C47388b {

        /* renamed from: a */
        public final C9855w f33843a;

        public C9838a(C9855w wVar) {
            this.f33843a = wVar;
        }
    }

    public C9836g(String str, C9833d dVar, C9805ak akVar, C46439e eVar, C47386p pVar, C86124t tVar, C104149a aVar, C28310af afVar, C28443m mVar, C47770dh dhVar) {
        this.f33828a = dVar;
        this.f33829b = akVar;
        this.f33830c = eVar;
        this.f33831d = pVar;
        this.f33832e = tVar;
        this.f33841n = aVar;
        this.f33833f = afVar;
        this.f33834g = mVar;
        this.f33835h = dhVar;
        this.f33836i = Boolean.valueOf("assistant_oobe".equals(str));
        this.f33837j = Boolean.valueOf("assistant_lockscreen_notification".equals(str));
        this.f33838k = Boolean.valueOf("assistant_blocking_oobe".equals(str));
        this.f33839l = Boolean.valueOf("assistant_lockscreen_jit_pop_up".equals(str));
    }
}
