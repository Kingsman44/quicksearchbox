package com.google.android.apps.gsa.staticplugins.opa.p8185ah;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Window;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89129a;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89134f;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89135g;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ah.l */
/* compiled from: PG */
public final class C106171l implements C106161b {

    /* renamed from: a */
    public static final C59071e f296303a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ah.l");

    /* renamed from: b */
    public final C84516aa f296304b;

    /* renamed from: c */
    public final C58833ax f296305c;

    /* renamed from: d */
    public boolean f296306d;

    /* renamed from: e */
    public final C86124t f296307e;

    /* renamed from: f */
    public boolean f296308f;

    /* renamed from: g */
    public boolean f296309g = false;

    /* renamed from: h */
    public final C106174o f296310h;

    /* renamed from: i */
    private final KeyguardManager f296311i;

    /* renamed from: j */
    private final C68214a f296312j;

    /* renamed from: k */
    private final C89143o f296313k;

    public C106171l(Context context, C84516aa aaVar, C58833ax axVar, C106174o oVar, C86124t tVar, C68214a aVar, C89143o oVar2) {
        this.f296304b = aaVar;
        this.f296311i = (KeyguardManager) context.getSystemService("keyguard");
        this.f296310h = oVar;
        this.f296305c = axVar;
        this.f296307e = tVar;
        this.f296312j = aVar;
        this.f296313k = oVar2;
    }

    /* renamed from: d */
    public static void m176834d(boolean z, Window window) {
        if (window == null) {
            ((C59052c) ((C59052c) f296303a.mo56226d()).mo56372aa(24735)).mo56389s("setShowWhenLocked: shouldShow = %b, window = null", Boolean.valueOf(z));
            int i = C90755l.f253831a;
            return;
        }
        int i2 = window.getAttributes().flags;
        if (z) {
            if ((i2 & 524288) == 0) {
                window.addFlags(524288);
            }
        } else if ((i2 & 524288) != 0) {
            window.clearFlags(524288);
        }
    }

    /* renamed from: a */
    public final void mo95334a(Activity activity, C106160a aVar, C91097g gVar) {
        mo95343g(1, activity, aVar, gVar);
    }

    /* renamed from: b */
    public final void mo95335b() {
        this.f296310h.f296314a = false;
    }

    /* renamed from: c */
    public final boolean mo95336c() {
        boolean isDeviceLocked = this.f296304b.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        return isDeviceLocked;
    }

    /* renamed from: e */
    public final void mo95341e(C89134f fVar) {
        C89143o oVar = this.f296313k;
        C89129a aVar = new C89129a();
        C89135g gVar = (C89135g) C89142n.f241658n.createBuilder();
        gVar.copyOnWrite();
        C89142n nVar = (C89142n) gVar.instance;
        nVar.f241661b = fVar.f241638y;
        nVar.f241660a |= 1;
        aVar.mo83116c((C89142n) gVar.build());
        oVar.mo27606c(aVar.mo83114a());
    }

    /* renamed from: f */
    public final boolean mo95342f() {
        return ((SharedPreferences) this.f296312j.mo27525b()).getBoolean("hotword_from_lock_screen", false);
    }

    /* renamed from: g */
    public final void mo95343g(int i, Activity activity, C106160a aVar, C91097g gVar) {
        C60870cx cxVar;
        mo95341e(C89134f.REQUEST_USER_UNLOCK_DEVICE);
        if (!this.f296307e.mo79746e(C90014bt.f247394gN) || !this.f296305c.mo56113h()) {
            cxVar = C60856cj.m92900i(false);
        } else {
            C60870cx a = ((C9799ae) this.f296305c.mo56107c()).mo18041a();
            C60870cx b = ((C9799ae) this.f296305c.mo56107c()).mo18042b();
            cxVar = C47638k.m84751b(a, b).mo51520a(new C106167h(this, a, b, i), C60826bg.f164896a);
        }
        aVar.mo95332a();
        this.f296311i.requestDismissKeyguard(activity, new C106169j(this, activity, cxVar, gVar, aVar));
    }
}
