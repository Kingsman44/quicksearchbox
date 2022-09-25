package com.google.android.remotesearch;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import com.google.android.apps.gsa.p8889z.p8917f.C119071a;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.p6513aj.C84566z;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amo;
import com.google.p4152bb.p4153a.C54946ad;
import dagger.C68214a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Objects;

@Deprecated
/* compiled from: PG */
public class RemoteSearchService extends C45215a {

    /* renamed from: a */
    public static final C59071e f117989a = C59071e.m91332i("com.google.android.remotesearch.RemoteSearchService");

    /* renamed from: b */
    static final ClientEventData f117990b = new C88489j(C87739bu.CLEAR_VOICE_ACTIONS).mo82013a();

    /* renamed from: c */
    public C21370a f117991c;

    /* renamed from: d */
    public C85651bb f117992d;

    /* renamed from: e */
    public C22871g f117993e;

    /* renamed from: f */
    public C68214a f117994f;

    /* renamed from: g */
    public C68214a f117995g;

    /* renamed from: h */
    public C91097g f117996h;

    /* renamed from: i */
    public C87677ae f117997i;

    /* renamed from: j */
    public long f117998j;

    /* renamed from: k */
    public C45225k f117999k = null;

    /* renamed from: l */
    public C84566z f118000l;

    /* renamed from: m */
    public Query f118001m;

    /* renamed from: n */
    C89784a f118002n;

    /* renamed from: o */
    ClientConfig f118003o;

    /* renamed from: p */
    C87673aa f118004p;

    /* renamed from: q */
    VoiceAction f118005q;

    /* renamed from: r */
    C45216b f118006r;

    /* renamed from: i */
    public static final ClientConfig m80511i() {
        C88486g gVar = new C88486g();
        gVar.f239199a = 4398113843240L;
        gVar.f239201c = amo.CLOCKWORK;
        gVar.f239204f = "search";
        return new ClientConfig(gVar);
    }

    /* renamed from: j */
    public static final Map m80512j(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.android.remotesearch.RemoteSearchService.TEXT_SEARCH_PARAMS");
        if (bundle2 == null) {
            return null;
        }
        Set<String> keySet = bundle2.keySet();
        HashMap hashMap = new HashMap(keySet.size());
        for (String str : keySet) {
            hashMap.put(str, bundle2.getString(str));
        }
        return hashMap;
    }

    /* renamed from: b */
    public final Query mo49059b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("user-agent-suffix", str);
        bundle.putBoolean("android.speech.extra.BEEP_SUPPRESSED", true);
        return this.f118001m.mo84307as(bundle);
    }

    /* renamed from: d */
    public final void mo49060d() {
        this.f118004p.mo81950v();
        this.f118004p.mo81930a(false);
    }

    /* renamed from: e */
    public final void mo49061e(Query query) {
        Query u = query.mo84493u();
        this.f118004p.mo81931b(u);
        this.f117998j = u.f252749G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo49062f(Query query, C54946ad adVar) {
        C45228n nVar = new C45228n(this, adVar, query);
        this.f118002n = nVar;
        List b = ((C119071a) this.f117994f.mo27525b()).mo87635b(adVar, query, (PlaybackStatus) null);
        C45228n nVar2 = nVar;
        nVar.mo49086a(b);
    }

    /* renamed from: g */
    public final void mo49063g(ClientConfig clientConfig) {
        this.f118003o = clientConfig;
        this.f118006r = null;
        this.f118002n = null;
        C45230p pVar = new C45230p(this);
        this.f118004p = this.f117997i.mo81958a(pVar, pVar, clientConfig);
        if (this.f118003o.f236953f.equals("transcription")) {
            this.f118004p.mo81947s((Bundle) null);
        } else {
            this.f118004p.mo81944p();
        }
        C22871g gVar = this.f117993e;
        C87673aa aaVar = this.f118004p;
        Objects.requireNonNull(aaVar);
        gVar.mo28212l("Connect ClockworkClient", new C45226l(aaVar));
    }

    /* renamed from: h */
    public final void mo49064h(int i) {
        C84566z zVar = this.f118000l;
        if (i == Process.myUid() || !zVar.mo78319c(i, "com.google.android.wearable.app")) {
            throw new SecurityException("Operation not supported for this client.");
        }
    }

    public final IBinder onBind(Intent intent) {
        return new C45229o(this);
    }

    public final boolean onUnbind(Intent intent) {
        this.f118002n = null;
        if (this.f118004p == null) {
            return false;
        }
        mo49060d();
        C87673aa aaVar = this.f118004p;
        C22871g gVar = this.f117993e;
        Objects.requireNonNull(aaVar);
        gVar.mo28212l("searchServiceDisconnect", new C45227m(aaVar));
        return false;
    }
}
