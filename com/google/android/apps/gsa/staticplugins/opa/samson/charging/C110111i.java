package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.lifecycleobservers.C110114a;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110104o;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110121g;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110397a;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110399c;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110403c;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.i */
/* compiled from: PG */
public final class C110111i {

    /* renamed from: f */
    private static final C59071e f306810f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.charging.i");

    /* renamed from: a */
    public final C86124t f306811a;

    /* renamed from: b */
    public final OpaAmbientUiStatus f306812b;

    /* renamed from: c */
    public final C110397a f306813c;

    /* renamed from: d */
    public final C110399c f306814d;

    /* renamed from: e */
    public final AudioManager f306815e;

    /* renamed from: g */
    private final C118561t f306816g;

    /* renamed from: h */
    private final C68214a f306817h;

    /* renamed from: i */
    private final Context f306818i;

    /* renamed from: j */
    private final C110110h f306819j;

    /* renamed from: k */
    private final C110104o f306820k;

    /* renamed from: l */
    private final C110403c f306821l;

    /* renamed from: m */
    private final C86054o f306822m;

    /* renamed from: n */
    private final C1800aq f306823n;

    /* renamed from: o */
    private final C110114a f306824o;

    /* renamed from: p */
    private final az f306825p;

    /* renamed from: q */
    private final d f306826q;

    /* renamed from: r */
    private boolean f306827r = false;

    /* renamed from: s */
    private final UiModeManager f306828s;

    /* renamed from: t */
    private final C60888db f306829t;

    /* renamed from: u */
    private final C110402b f306830u;

    public C110111i(C118561t tVar, C86124t tVar2, C68214a aVar, C110104o oVar, Context context, OpaAmbientUiStatus opaAmbientUiStatus, C110403c cVar, C86054o oVar2, C110397a aVar2, C110114a aVar3, C110402b bVar, C110399c cVar2, az azVar, d dVar, C60888db dbVar) {
        this.f306816g = tVar;
        this.f306811a = tVar2;
        this.f306817h = aVar;
        this.f306820k = oVar;
        this.f306818i = context;
        this.f306830u = bVar;
        this.f306814d = cVar2;
        this.f306825p = azVar;
        this.f306819j = new C110110h(this);
        this.f306812b = opaAmbientUiStatus;
        this.f306821l = cVar;
        this.f306822m = oVar2;
        this.f306813c = aVar2;
        this.f306823n = new C1800aq(context);
        this.f306824o = aVar3;
        this.f306815e = (AudioManager) context.getSystemService("audio");
        this.f306828s = (UiModeManager) context.getSystemService("uimode");
        this.f306826q = dVar;
        this.f306829t = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo98384a(Intent intent) {
        C110109g gVar = new C110109g(this, intent);
        return C60856cj.m92905n(C47810es.m84965e(gVar), this.f306829t);
    }

    /* renamed from: b */
    public final C60870cx mo98385b(boolean z, boolean z2) {
        String F;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f306830u.mo98629a()) {
            return C118826c.f331423b;
        }
        if (!this.f306813c.mo98624b(true) && z) {
            return C118826c.f331423b;
        }
        if (!((C87573b) this.f306817h.mo27525b()).f236596a.mo17534a()) {
            return C118826c.f331423b;
        }
        if (!this.f306811a.mo79746e(C90014bt.f247376fw)) {
            C110104o oVar = this.f306820k;
            if (!oVar.f306785d.mo79746e(C90014bt.f247107as)) {
                if (oVar.f306784c.mo79666M() && (F = oVar.f306784c.mo79659F()) != null && oVar.f306786e.u() && !oVar.f306783b.mo98632c(F) && !((SharedPreferences) oVar.f306783b.f307694a.mo27525b()).getBoolean(C110403c.m183819o(F), false)) {
                    if (((long) oVar.f306783b.mo98641l(F)) >= oVar.f306785d.mo79743a(C90014bt.f247095ag)) {
                        oVar.f306785d.mo79743a(C90014bt.f247095ag);
                    } else {
                        oVar.f306783b.mo98642r(F);
                        PowerManager.WakeLock newWakeLock = ((PowerManager) oVar.f306782a.getSystemService("power")).newWakeLock(268435482, "agsa:opa-amb-oobe-notification-ctrl");
                        newWakeLock.acquire(200);
                        try {
                            newWakeLock.release();
                        } catch (RuntimeException unused) {
                        }
                    }
                }
            }
            oVar.mo98382a();
            return C118826c.f331423b;
        }
        mo98387d();
        if (!z2) {
            KeyguardManager keyguardManager = (KeyguardManager) this.f306818i.getSystemService("keyguard");
            return keyguardManager.isKeyguardSecure() ? C118826c.f331423b : C118826c.f331423b;
        }
        mo98386c(-1);
    }

    /* renamed from: c */
    public final void mo98386c(int i) {
        Account a = this.f306822m.mo79668a();
        String str = null;
        if (a == null) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            String str2 = a.name;
            if (str2 == null) {
                C58976aa aaVar2 = C58975e.f156826a;
            } else {
                str = str2;
            }
        }
        if (str == null) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else if (!this.f306821l.mo98632c(str)) {
            C58976aa aaVar4 = C58975e.f156826a;
        } else if (this.f306828s.getCurrentModeType() != 3 || this.f306825p.k()) {
            if (this.f306811a.mo79746e(C90014bt.f247105aq)) {
                C17823i iVar = (C17823i) this.f306826q.b().mo3842a();
                if (iVar == null || iVar == C17823i.UNKNOWN) {
                    C59104x b = f306810f.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "AmNavigator");
                    ((C59052c) ((C59052c) b).mo56372aa(25622)).mo56386p("Navigation state unknown.");
                } else if (iVar != C17823i.STOPPED) {
                    C59104x b2 = f306810f.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "AmNavigator");
                    ((C59052c) ((C59052c) b2).mo56372aa(25623)).mo56387q("Currently navigating %d, not launching", iVar.f51144f);
                    return;
                }
            }
            C58976aa aaVar5 = C58975e.f156826a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("launch_ambient_mode_from_assist", true);
            Bundle bundle2 = new Bundle();
            if (i != -1) {
                bundle2.putInt("launched_from_screen_trigger", 0);
            }
            bundle.putBundle("ambient_screen_extras", bundle2);
            ((C87573b) this.f306817h.mo27525b()).mo81706d(bundle);
        } else {
            C59104x b3 = f306810f.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "AmNavigator");
            ((C59052c) ((C59052c) b3).mo56372aa(25624)).mo56386p("Currently in car mode, not launching");
        }
    }

    /* renamed from: d */
    public final void mo98387d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f306818i.registerReceiver(this.f306819j, intentFilter);
        this.f306827r = true;
    }

    /* renamed from: e */
    public final void mo98388e(boolean z) {
        if (this.f306813c.mo98624b(z)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        Iterator it = this.f306812b.f306850h.iterator();
        while (it.hasNext()) {
            C110121g gVar = (C110121g) ((WeakReference) it.next()).get();
            if (gVar == null) {
                it.remove();
            } else {
                gVar.mo98327c();
            }
        }
        Context context = this.f306818i;
        this.f306823n.f5622a.cancel("com.google.android.apps.gsa.staticplugins.opa.samson.activity.OpaAmbActivity.RestartActivity", 2200);
        this.f306816g.mo103752c(C118522by.AMBIENT_MODE_RELAUNCH);
        this.f306812b.f306845c = false;
        this.f306824o.mo98390g();
        if (this.f306827r) {
            try {
                context.unregisterReceiver(this.f306819j);
                this.f306827r = false;
            } catch (Exception e) {
                C59104x c = f306810f.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AmNavigator");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25620)).mo56386p("failed to unregister");
            }
        }
    }
}
