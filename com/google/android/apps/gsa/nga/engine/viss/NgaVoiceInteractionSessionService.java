package com.google.android.apps.gsa.nga.engine.viss;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.engine.b.e;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.C74970a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74975e;
import com.google.android.apps.gsa.nga.p5887c.C74745a;
import com.google.android.apps.gsa.nga.shared.p6324an.C80938a;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80996p;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80999s;
import com.google.android.apps.gsa.nga.shared.p6356m.C81429e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83314ii;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82653nd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82654ne;
import com.google.android.apps.gsa.nga.shared.p6407v.p6414f.C83217a;
import com.google.android.apps.gsa.nga.shared.p6407v.p6414f.p6415a.C83219b;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a.C120034s;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a.C120036u;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2591a.C33503c;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33773am;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33775ao;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;

/* compiled from: PG */
public class NgaVoiceInteractionSessionService extends VoiceInteractionSessionService {

    /* renamed from: a */
    public static final C59071e f217951a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService");

    /* renamed from: A */
    private boolean f217952A;

    /* renamed from: B */
    private boolean f217953B;

    /* renamed from: C */
    private final C74970a f217954C = new C79385o(this);

    /* renamed from: b */
    public C22871g f217955b;

    /* renamed from: c */
    public C22871g f217956c;

    /* renamed from: d */
    public C80999s f217957d;

    /* renamed from: e */
    public C79371ad f217958e;

    /* renamed from: f */
    public e f217959f;

    /* renamed from: g */
    public C58833ax f217960g;

    /* renamed from: h */
    public C83305i f217961h;

    /* renamed from: i */
    public C79375e f217962i;

    /* renamed from: j */
    public C80996p f217963j;

    /* renamed from: k */
    public C83314ii f217964k;

    /* renamed from: l */
    public C33503c f217965l;

    /* renamed from: m */
    public C47770dh f217966m;

    /* renamed from: n */
    public boolean f217967n;

    /* renamed from: o */
    public final Object f217968o = new Object();

    /* renamed from: p */
    public C79374d f217969p;

    /* renamed from: q */
    public C79374d f217970q;

    /* renamed from: r */
    public VoiceInteractionSession f217971r;

    /* renamed from: s */
    ServiceConnection f217972s = new C79383m(this);

    /* renamed from: t */
    ServiceConnection f217973t = new C79384n(this);

    /* renamed from: u */
    public C74975e f217974u;

    /* renamed from: v */
    public C83219b f217975v;

    /* renamed from: w */
    public C120034s f217976w;

    /* renamed from: x */
    private C79390t f217977x;

    /* renamed from: y */
    private C79374d f217978y;

    /* renamed from: z */
    private IBinder f217979z;

    /* renamed from: g */
    private final void m127334g() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f217952A) {
            unbindService(this.f217972s);
            this.f217952A = false;
        }
    }

    /* renamed from: h */
    private final void m127335h() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f217953B) {
            unbindService(this.f217973t);
            this.f217953B = false;
        }
    }

    /* renamed from: a */
    public final C79370ac mo73924a(Bundle bundle) {
        C79371ad adVar = this.f217958e;
        int i = 2;
        if (adVar == null) {
            return new C79366a(2, C120124o.CLASSIC);
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        C120036u a = adVar.f217984b.mo104643a(bundle);
        C120124o oVar = a.f334196a;
        if (a.f334197b) {
            i = true != adVar.f217985c ? 3 : 4;
        } else if (C79371ad.m127352b(adVar.f217983a.a())) {
            i = 1;
        }
        return new C79366a(i, oVar);
    }

    /* renamed from: b */
    public final void mo73925b() {
        C79374d dVar;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f217968o) {
            C79390t tVar = this.f217977x;
            if (!(tVar == null || (dVar = this.f217978y) == null)) {
                tVar.mo74006a(dVar, this.f217967n);
                this.f217977x = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo73926c() {
        C79370ac acVar;
        C58833ax axVar;
        C79374d dVar = this.f217969p;
        if (dVar == null) {
            dVar = this.f217970q;
        }
        C79390t tVar = this.f217977x;
        C58976aa aaVar = C58975e.f156826a;
        if (!(dVar == null || tVar == null)) {
            tVar.mo74006a(dVar, this.f217967n);
            e eVar = this.f217959f;
            if (!(eVar == null || (axVar = this.f217960g) == null || eVar.a() == null)) {
                NgaState a = eVar.a();
                a.getClass();
                if (a.a() && axVar.mo56113h()) {
                    ((C81429e) this.f217960g.mo56107c()).mo75079f();
                }
            }
        }
        C79390t tVar2 = this.f217977x;
        Boolean bool = null;
        if (tVar2 != null) {
            acVar = tVar2.f218015a;
        } else {
            acVar = mo73924a((Bundle) null);
        }
        int i = ((C79366a) acVar).f217981b;
        if (i == 2) {
            if (this.f217952A || this.f217977x == null) {
                i = 2;
            } else {
                m127335h();
                C83219b bVar = this.f217975v;
                if (bVar != null) {
                    bool = Boolean.valueOf(bVar.mo76650a());
                }
                boolean bindService = bindService(new Intent().setComponent(new ComponentName(getPackageName(), "com.google.android.apps.gsa.assist.GsaVoiceInteractionSessionService")), this.f217972s, 4145);
                C83305i iVar = this.f217961h;
                if (!(iVar == null || bool == null)) {
                    C82653nd g = C82654ne.m131945g();
                    g.mo76152b(C83217a.OPA.f226840e);
                    g.mo76153c(bool.booleanValue());
                    g.mo76154d(bindService);
                    iVar.mo75579d(g.mo76151a());
                }
                C58838bb.m90883r(bindService);
                this.f217952A = true;
                return;
            }
        }
        if ((i == 1 || i == 4) && !this.f217953B && this.f217977x != null) {
            m127334g();
            C58838bb.m90883r(bindService(new Intent().setComponent(new ComponentName(getPackageName(), "com.google.android.apps.gsa.staticplugins.nga.vis.NgaRemoteVoiceInteractionSessionService")), this.f217973t, 4145));
            this.f217953B = true;
        } else if (i == 3) {
            m127334g();
            m127335h();
        }
    }

    /* renamed from: d */
    public final void mo73927d(int i) {
        C83314ii iiVar = this.f217964k;
        if (iiVar != null) {
            iiVar.mo75554a(i);
        }
    }

    /* renamed from: e */
    public final void mo73928e(C79370ac acVar, IBinder iBinder, Bundle bundle, int i) {
        C79374d dVar;
        C59071e eVar = f217951a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NgaViss");
        ((C59052c) ((C59052c) b).mo56372aa(5579)).mo56389s("start new session with configuration: %s", acVar);
        C79366a aVar = (C79366a) acVar;
        if (aVar.f217981b == 3) {
            mo73927d(8);
            synchronized (this.f217968o) {
                dVar = this.f217978y;
                this.f217979z = iBinder;
            }
            dVar.getClass();
            dVar.mo73945a(iBinder, bundle, i);
            return;
        }
        mo73927d(9);
        if (aVar.f217981b == 4) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NgaViss");
            ((C59052c) ((C59052c) b2).mo56372aa(5576)).mo56386p("prepareAndStartNewApaRemoteSession");
            C47538ax c = this.f217966m.mo51613c("newSession");
            try {
                C22871g gVar = this.f217956c;
                C33503c cVar = this.f217965l;
                gVar.mo28211k(C71663i.m104692e(((C33775ao) cVar).f90218e, (C71424ay) null, new C33773am((C33775ao) cVar, bundle, i, (C69577g) null), 3), "[NGA] prepareAndStartNewApaRemoteSession", new C79388r(this, acVar, iBinder, i));
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            synchronized (this.f217968o) {
                if (((C79366a) acVar).f217981b == 1 && !this.f217953B && this.f217962i != null) {
                    if (this.f217963j != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        boolean containsKey = bundle.containsKey("nga_assist_ui_client");
                        boolean a = this.f217963j.mo74774a(bundle, i);
                        C59104x b3 = eVar.mo56224b();
                        b3.mo56378ag(C58975e.f156826a, "NgaViss");
                        ((C59052c) ((C59052c) b3).mo56372aa(5559)).mo56389s("prepareNewNgaRemoteSession - delegateToGsaVis=%s", Boolean.valueOf(a));
                        if (!a && !containsKey) {
                            bundle.putBoolean("is_optimized_on_show", true);
                            this.f217962i.mo71125k(bundle, i);
                        }
                        C79375e eVar2 = this.f217962i;
                        eVar2.asBinder();
                        bundle.putBinder("vis_events_callback", eVar2);
                        bundle.putBoolean("vis_events_callback_first_show_handled", !a);
                    }
                }
                mo73929f(acVar, iBinder, bundle, i);
            }
            return;
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo73929f(C79370ac acVar, IBinder iBinder, Bundle bundle, int i) {
        synchronized (this.f217968o) {
            this.f217977x = new C79390t(acVar, iBinder, bundle, i);
            mo73926c();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IBinder onBind(android.content.Intent r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f217968o
            monitor-enter(r0)
            android.os.IBinder r4 = super.onBind(r4)     // Catch:{ all -> 0x0028 }
            if (r4 != 0) goto L_0x000b
            r4 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r1 = "android.service.voice.IVoiceInteractionSessionService"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)     // Catch:{ all -> 0x0028 }
            boolean r2 = r1 instanceof com.google.android.apps.gsa.nga.engine.viss.C79374d     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0019
            r4 = r1
            com.google.android.apps.gsa.nga.engine.viss.d r4 = (com.google.android.apps.gsa.nga.engine.viss.C79374d) r4     // Catch:{ all -> 0x0028 }
            goto L_0x001f
        L_0x0019:
            com.google.android.apps.gsa.nga.engine.viss.b r1 = new com.google.android.apps.gsa.nga.engine.viss.b     // Catch:{ all -> 0x0028 }
            r1.<init>(r4)     // Catch:{ all -> 0x0028 }
            r4 = r1
        L_0x001f:
            r3.f217978y = r4     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            com.google.android.apps.gsa.nga.engine.viss.q r4 = new com.google.android.apps.gsa.nga.engine.viss.q
            r4.<init>(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.viss.NgaVoiceInteractionSessionService.onBind(android.content.Intent):android.os.IBinder");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C80999s sVar = this.f217957d;
        if (sVar != null) {
            sVar.mo74751l(configuration);
        }
    }

    public final void onCreate() {
        C74507e.m120466b(9);
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate();
        C79389s sVar = (C79389s) C74745a.m120861a(this);
        if (sVar == null) {
            this.f217960g = C58836b.f156633a;
            return;
        }
        sVar.mo74005pV(this);
        C79371ad adVar = this.f217958e;
        adVar.getClass();
        adVar.mo73943a(this);
        synchronized (this.f217968o) {
            this.f217977x = null;
        }
        C74975e eVar = this.f217974u;
        eVar.getClass();
        eVar.mo71358a(this.f217954C);
    }

    public final void onDestroy() {
        C58976aa aaVar = C58975e.f156826a;
        C74975e eVar = this.f217974u;
        if (eVar != null) {
            eVar.mo71359b(this.f217954C);
        }
        synchronized (this.f217968o) {
            this.f217977x = null;
        }
        C79371ad adVar = this.f217958e;
        if (adVar != null) {
            adVar.mo73943a((NgaVoiceInteractionSessionService) null);
        }
        synchronized (this.f217968o) {
            if (this.f217952A) {
                unbindService(this.f217972s);
            }
            if (this.f217953B) {
                unbindService(this.f217973t);
            }
        }
        super.onDestroy();
    }

    public final VoiceInteractionSession onNewSession(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f217976w == null) {
            C59104x b = f217951a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NgaViss");
            ((C59052c) ((C59052c) b).mo56372aa(5563)).mo56386p("onNewSession - voiceInteractionSessionFactory is NULL, using InstantlyFinishingVis.");
            return new C80938a(this);
        }
        int i = ((C79366a) mo73924a(bundle)).f217981b;
        if (i - 1 != 2) {
            C59104x b2 = f217951a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NgaViss");
            ((C59052c) ((C59052c) b2).mo56372aa(5562)).mo56389s("onNewSession - session type to use is %s, expected to be handled in remote process. Using InstantlyFinishingVis.", C79369ab.m127348a(i));
            return new C80938a(this);
        }
        synchronized (this.f217968o) {
            IBinder iBinder = this.f217979z;
            if (iBinder == null) {
                C59104x c = f217951a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NgaViss");
                ((C59052c) ((C59052c) c).mo56372aa(5561)).mo56386p("onNewSession - session type to use is APA but token is null");
                C80938a aVar = new C80938a(this);
                return aVar;
            }
            VoiceInteractionSession a = this.f217976w.mo104639a(this, iBinder, bundle);
            this.f217971r = a;
            a.getClass();
            return a;
        }
    }

    public final boolean onUnbind(Intent intent) {
        if (!this.f217960g.mo56113h()) {
            return false;
        }
        ((C81429e) this.f217960g.mo56107c()).mo75080g();
        return false;
    }
}
