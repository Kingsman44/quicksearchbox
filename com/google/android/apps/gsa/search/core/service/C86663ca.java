package com.google.android.apps.gsa.search.core.service;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.p6773am.C85627b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.C87106ha;
import com.google.android.apps.gsa.search.core.state.p6864a.C86802q;
import com.google.android.apps.gsa.search.core.state.p6864a.C86803r;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ShowVoiceActionsEventParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88308ww;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88309wx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88310wy;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.ssb.C45347d;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.service.ca */
/* compiled from: PG */
public final class C86663ca extends C86734a implements C85232a {

    /* renamed from: a */
    public final C86802q f234119a;

    /* renamed from: b */
    public final C68214a f234120b;

    /* renamed from: c */
    public final C22871g f234121c;

    /* renamed from: f */
    private final C86803r f234122f;

    /* renamed from: g */
    private final C68214a f234123g;

    /* renamed from: h */
    private final Context f234124h;

    /* renamed from: i */
    private final C87106ha f234125i;

    /* renamed from: j */
    private final C85627b f234126j;

    /* renamed from: k */
    private final C68214a f234127k;

    /* renamed from: l */
    private final C86124t f234128l;

    /* renamed from: m */
    private final BroadcastReceiver f234129m;

    public C86663ca(C86803r rVar, C86802q qVar, C68214a aVar, C68214a aVar2, C87106ha haVar, Context context, C68214a aVar3, C68214a aVar4, C22871g gVar, C86124t tVar) {
        super(C118575h.WORKER_SERVICE, "service");
        C86659bz bzVar = new C86659bz(this);
        this.f234129m = bzVar;
        this.f234122f = rVar;
        this.f234119a = qVar;
        this.f234123g = aVar2;
        this.f234125i = haVar;
        this.f234124h = context;
        this.f234120b = aVar3;
        this.f234127k = aVar4;
        this.f234121c = gVar;
        C85627b bVar = new C85627b(aVar, gVar);
        this.f234126j = bVar;
        if (context.getPackageManager().checkPermission("com.google.android.googlequicksearchbox.permission.LAUNCH_FROM_GMM", "com.google.android.apps.maps") == 0) {
            context.registerReceiver(bVar, new IntentFilter("com.google.android.apps.gmm.NAVIGATION_STATE"), "com.google.android.googlequicksearchbox.permission.LAUNCH_FROM_GMM", (Handler) null);
        } else {
            context.registerReceiver(bVar, new IntentFilter("com.google.android.apps.gmm.NAVIGATION_STATE"));
        }
        this.f234128l = tVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(bzVar, intentFilter);
    }

    /* renamed from: a */
    public final void mo78808a(long j) {
        this.f234121c.mo28212l("clientFocusLost", new C86652bs(this, j));
    }

    /* renamed from: c */
    public final void mo78809c() {
        if (this.f234122f.mo80511p()) {
            this.f234119a.mo80501e();
        }
    }

    /* renamed from: e */
    public final void mo78810e() {
        C86775r rVar = ((C86610af) this.f234123g.mo27525b()).f233977l;
        if (rVar != null) {
            rVar.f234383e.mo80379b(new C87684al(C88244um.BACK_PRESS).mo81964a());
        }
    }

    /* renamed from: f */
    public final void mo78811f(long j) {
        this.f234121c.mo28212l("setClientFocused", new C86655bv(this, j));
    }

    /* renamed from: g */
    public final void mo78812g(C45347d dVar) {
        ((C86159h) this.f234127k.mo27525b()).f232837f = dVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ServiceWorker");
    }

    /* renamed from: h */
    public final void mo78813h(long j, boolean z) {
        this.f234121c.mo28212l("setKeepServiceStartedForSession", new C86653bt(this, j, z));
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f234124h.unregisterReceiver(this.f234126j);
        this.f234124h.unregisterReceiver(this.f234129m);
    }

    /* renamed from: i */
    public final void mo78814i(boolean z) {
        if (!this.f234128l.mo79746e(C90066dr.f249685h)) {
            this.f234121c.mo28212l("setShouldShowForegroundingNotification", new C86656bw(this, z));
        }
    }

    /* renamed from: j */
    public final void mo78815j(Query query, List list, CardDecision cardDecision, int i) {
        C86610af afVar = (C86610af) this.f234123g.mo27525b();
        if (afVar.mo80227h()) {
            C86771n nVar = afVar.f233977l.f234383e;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ParcelableVoiceAction((VoiceAction) it.next()));
                }
            }
            C87684al alVar = new C87684al(C88244um.SHOW_VOICE_ACTIONS);
            alVar.mo81966c(new ShowVoiceActionsEventParcelable(query, arrayList, cardDecision));
            C62940bt btVar = C88308ww.f238829a;
            C88309wx wxVar = (C88309wx) C88310wy.f238830c.createBuilder();
            wxVar.copyOnWrite();
            C88310wy wyVar = (C88310wy) wxVar.instance;
            wyVar.f238832a |= 1;
            wyVar.f238833b = i;
            alVar.mo81965b(btVar, (C88310wy) wxVar.build());
            nVar.mo80379b(alVar.mo81964a());
        }
    }

    /* renamed from: k */
    public final void mo78816k(int i, Notification notification) {
        this.f234121c.mo28212l("startForegroundNotification", new C86657bx(this, i, notification));
    }

    /* renamed from: l */
    public final void mo78817l(int i, boolean z) {
        this.f234121c.mo28212l("stopForegroundNotification", new C86654bu(this, i, z));
    }

    /* renamed from: m */
    public final void mo78818m() {
        C86610af afVar = (C86610af) this.f234123g.mo27525b();
        if (afVar.mo80227h()) {
            afVar.f233977l.f234383e.mo80379b(new C87684al(C88244um.UPDATE_ACTION_UI).mo81964a());
        }
    }

    /* renamed from: n */
    public final void mo78819n(int i) {
        this.f234125i.mo80260a(i);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: p */
    public final void mo78820p(Notification notification) {
        this.f234121c.mo28212l("updateNotification", new C86651br(this, notification));
    }
}
