package com.google.android.libraries.assistant.soda;

import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2907ab.C37337d;
import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37381e;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2908b.C37388l;
import com.google.android.libraries.search.p2904c.p2908b.C37390n;
import com.google.android.libraries.search.p2904c.p2908b.C37395s;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.p2950a.C37891b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.speech.p5218j.C67171p;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.soda.k */
/* compiled from: PG */
public final class C19343k implements C37363a {

    /* renamed from: a */
    public static final C59071e f54123a = C59071e.m91332i("com.google.android.libraries.assistant.soda.k");

    /* renamed from: b */
    private static final long f54124b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private final C37395s f54125c;

    /* renamed from: d */
    private final C37337d f54126d;

    /* renamed from: e */
    private final C60887da f54127e;

    /* renamed from: f */
    private C19342j f54128f = C19342j.NEEDS_INIT;

    /* renamed from: g */
    private C58833ax f54129g;

    /* renamed from: h */
    private C58833ax f54130h;

    /* renamed from: i */
    private C58833ax f54131i;

    /* renamed from: j */
    private int f54132j;

    /* renamed from: k */
    private C58833ax f54133k;

    /* renamed from: l */
    private final C37891b f54134l;

    public C19343k(C37395s sVar, C37337d dVar, C37891b bVar, C60887da daVar) {
        C58836b bVar2 = C58836b.f156633a;
        this.f54129g = bVar2;
        this.f54130h = bVar2;
        this.f54131i = bVar2;
        this.f54132j = 0;
        this.f54133k = bVar2;
        this.f54125c = sVar;
        this.f54126d = dVar;
        this.f54134l = bVar;
        this.f54127e = daVar;
    }

    /* renamed from: j */
    private static int m36833j(int i) {
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return 12;
        }
        throw new IllegalStateException("Invalid channel count");
    }

    /* renamed from: k */
    private final void m36834k(C37360ay ayVar) {
        if (!this.f54131i.mo56113h()) {
            C37335b a = this.f54126d.mo40892a(ayVar);
            if (a == null) {
                ((C59052c) ((C59052c) f54123a.mo56225c()).mo56372aa(47613)).mo56386p("Could not provide a WriteableAudioBuffer.");
                this.f54131i = C58836b.f156633a;
                return;
            }
            ((C59052c) ((C59052c) f54123a.mo56224b()).mo56372aa(47612)).mo56387q("Created a new WriteableAudioBuffer with channel config: %d", ayVar.f99229d);
            this.f54131i = C58833ax.m90834k(a);
            return;
        }
        throw new IllegalStateException("WriteableAudioBuffer already present. Cannot create a new one.");
    }

    /* renamed from: l */
    private final void m36835l() {
        if (this.f54131i.mo56113h()) {
            ((C59052c) ((C59052c) f54123a.mo56224b()).mo56372aa(47614)).mo56387q("WriteableAudioBuffer closing. Total written: %d", this.f54132j);
            ((C37335b) this.f54131i.mo56107c()).mo40891i();
            this.f54131i = C58836b.f156633a;
            this.f54132j = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C37500dg mo24471a() {
        if (this.f54128f != C19342j.NEEDS_INIT) {
            C59071e eVar = f54123a;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47599)).mo56386p("onTrigger");
            if (this.f54131i.mo56113h()) {
                ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47600)).mo56386p("Dropping current WriteableAudioBuffer!");
                m36835l();
            }
            C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
            int j = m36833j(((Integer) this.f54129g.mo56107c()).intValue());
            avVar.copyOnWrite();
            C37360ay ayVar = (C37360ay) avVar.instance;
            ayVar.f99226a |= 4;
            ayVar.f99229d = j;
            avVar.copyOnWrite();
            C37360ay ayVar2 = (C37360ay) avVar.instance;
            ayVar2.f99226a |= 512;
            ayVar2.f99236k = true;
            m36834k((C37360ay) avVar.build());
            this.f54133k = C58833ax.m90834k(this.f54134l.mo41135a());
            this.f54128f = C19342j.PRE_ACTIVE;
            this.f54125c.mo40903a(C37384h.SODA, f54124b);
        } else {
            throw new IllegalStateException("onTrigger called, but still in state NEEDS_INIT.");
        }
        return (C37500dg) this.f54133k.mo56107c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo24472b() {
        if (this.f54128f == C19342j.NEEDS_INIT) {
            ((C59052c) ((C59052c) f54123a.mo56226d()).mo56372aa(47618)).mo56386p("onStopCapture called, but still in state NEEDS_INIT.");
            return;
        }
        C59071e eVar = f54123a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47617)).mo56386p("onStopCapture");
        C58836b bVar = C58836b.f156633a;
        this.f54129g = bVar;
        this.f54130h = bVar;
        m36835l();
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47620)).mo56386p("Unregister SodaAudioAdapter.");
        this.f54125c.mo40905c(C37384h.SODA);
        this.f54128f = C19342j.NEEDS_INIT;
    }

    /* renamed from: c */
    public final synchronized C58833ax mo24473c(C37388l lVar) {
        C59071e eVar = f54123a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47603)).mo56386p("#startListening");
        if ((lVar.f99309a & 4) != 0) {
            C37360ay ayVar = lVar.f99311c;
            if (ayVar == null) {
                ayVar = C37360ay.f99224l;
            }
            if (ayVar.f99228c != 16000) {
                C59052c cVar = (C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47627);
                C37360ay ayVar2 = lVar.f99311c;
                if (ayVar2 == null) {
                    ayVar2 = C37360ay.f99224l;
                }
                cVar.mo56393w("startListening called with the wrong sample rate. Got %d, expected %d.", ayVar2.f99228c, 16000);
            } else {
                C37360ay ayVar3 = lVar.f99311c;
                if (ayVar3 == null) {
                    ayVar3 = C37360ay.f99224l;
                }
                if (ayVar3.f99230e != 2) {
                    C59052c cVar2 = (C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47626);
                    C37360ay ayVar4 = lVar.f99311c;
                    if (ayVar4 == null) {
                        ayVar4 = C37360ay.f99224l;
                    }
                    cVar2.mo56393w("startListening called with the wrong encoding format. Got %d, expected %d.", ayVar4.f99230e, 2);
                } else if (this.f54128f == C19342j.PRE_ACTIVE || this.f54128f == C19342j.PRE_IDLE) {
                    int j = m36833j(((Integer) this.f54129g.mo56107c()).intValue());
                    C37360ay ayVar5 = lVar.f99311c;
                    if (ayVar5 == null) {
                        ayVar5 = C37360ay.f99224l;
                    }
                    if (ayVar5.f99229d != j) {
                        C59052c cVar3 = (C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47624);
                        C37360ay ayVar6 = lVar.f99311c;
                        if (ayVar6 == null) {
                            ayVar6 = C37360ay.f99224l;
                        }
                        cVar3.mo56393w("startListening called with the wrong channel config. Got %d, expected %d.", ayVar6.f99229d, j);
                    } else if (!this.f54133k.mo56113h()) {
                        ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(47623)).mo56386p("startListening called, but there's no precached buffer id available.");
                    } else {
                        C37500dg dgVar = (C37500dg) this.f54133k.mo56107c();
                        C37500dg dgVar2 = lVar.f99312d;
                        if (dgVar2 == null) {
                            dgVar2 = C37500dg.f99557c;
                        }
                        if (!dgVar.equals(dgVar2)) {
                            C59052c cVar4 = (C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47622);
                            C37500dg dgVar3 = lVar.f99312d;
                            if (dgVar3 == null) {
                                dgVar3 = C37500dg.f99557c;
                            }
                            cVar4.mo56393w("startListening called but the IDs mismatch. Got %s, Expected %s", dgVar3.f99560b, ((C37500dg) this.f54133k.mo56107c()).f99560b);
                        } else {
                            boolean z = this.f54128f == C19342j.PRE_IDLE;
                            if (z) {
                                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47604)).mo56386p("startListening for follow-on, creating WriteableAudioBuffer.");
                                C37360ay ayVar7 = lVar.f99311c;
                                if (ayVar7 == null) {
                                    ayVar7 = C37360ay.f99224l;
                                }
                                m36834k(ayVar7);
                            }
                            C19340h hVar = (C19340h) this.f54130h.mo56107c();
                            if (z) {
                                hVar.f54115a.mo24357x(6);
                            }
                            this.f54128f = C19342j.ACTIVE;
                            C37335b bVar = (C37335b) this.f54131i.mo56107c();
                            C37360ay ayVar8 = lVar.f99311c;
                            if (ayVar8 == null) {
                                ayVar8 = C37360ay.f99224l;
                            }
                            C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
                            C37563ed edVar = C37563ed.OPENED;
                            eaVar.copyOnWrite();
                            C37561eb ebVar = (C37561eb) eaVar.instance;
                            ebVar.f99803b = Integer.valueOf(edVar.f99809d);
                            ebVar.f99802a = 1;
                            return C58833ax.m90834k(new C37334a(bVar, ayVar8, C60856cj.m92900i((C37561eb) eaVar.build())));
                        }
                    }
                } else {
                    ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47625)).mo56389s("startListening called in the wrong state: %s", this.f54128f);
                }
            }
        } else {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47628)).mo56386p("startListening called without a precached buffer id.");
        }
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final C60870cx mo24474d() {
        return C60856cj.m92900i(C37381e.AUDIO_ADAPTER_CONNECT_STATUS_SUCCESS);
    }

    /* renamed from: e */
    public final synchronized C60870cx mo24475e(boolean z) {
        this.f54130h = C58836b.f156633a;
        return this.f54127e.mo19399b(C47810es.m84978r(new C19341i((C19340h) this.f54130h.mo56111f())));
    }

    /* renamed from: f */
    public final synchronized C60870cx mo24476f(C37390n nVar) {
        C58833ax axVar;
        C59071e eVar = f54123a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47611)).mo56386p("#stopListening");
        if ((nVar.f99315a & 2) == 0) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47609)).mo56386p("stopListening called without a precached buffer id.");
            C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
            C37512ds dsVar = C37512ds.FAILED_CLOSING_CALLED_WITHOUT_PRECACHED_BUFFER_ID;
            dtVar.copyOnWrite();
            C37514du duVar = (C37514du) dtVar.instance;
            duVar.f99632b = Integer.valueOf(dsVar.f99628K);
            duVar.f99631a = 2;
            axVar = C58833ax.m90834k((C37514du) dtVar.build());
        } else if (this.f54128f != C19342j.ACTIVE) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47608)).mo56386p("stopListening called outside of ACTIVE state. Returning success blindly.");
            C37513dt dtVar2 = (C37513dt) C37514du.f99629c.createBuilder();
            C37516dw dwVar = C37516dw.CLOSED;
            dtVar2.copyOnWrite();
            C37514du duVar2 = (C37514du) dtVar2.instance;
            duVar2.f99632b = Integer.valueOf(dwVar.f99638d);
            duVar2.f99631a = 1;
            axVar = C58833ax.m90834k((C37514du) dtVar2.build());
        } else if (!this.f54131i.mo56113h()) {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(47607)).mo56386p("stopListening called, but there wasn't a buffer to emit audio.");
            C37513dt dtVar3 = (C37513dt) C37514du.f99629c.createBuilder();
            C37512ds dsVar2 = C37512ds.FAILED_CLOSING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA;
            dtVar3.copyOnWrite();
            C37514du duVar3 = (C37514du) dtVar3.instance;
            duVar3.f99632b = Integer.valueOf(dsVar2.f99628K);
            duVar3.f99631a = 2;
            axVar = C58833ax.m90834k((C37514du) dtVar3.build());
        } else if (!this.f54133k.mo56113h()) {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(47606)).mo56386p("stopListening called, but there's no precached buffer id available.");
            C37513dt dtVar4 = (C37513dt) C37514du.f99629c.createBuilder();
            C37512ds dsVar3 = C37512ds.FAILED_CLOSING_WAS_NOT_OPENED;
            dtVar4.copyOnWrite();
            C37514du duVar4 = (C37514du) dtVar4.instance;
            duVar4.f99632b = Integer.valueOf(dsVar3.f99628K);
            duVar4.f99631a = 2;
            axVar = C58833ax.m90834k((C37514du) dtVar4.build());
        } else {
            C37500dg dgVar = (C37500dg) this.f54133k.mo56107c();
            C37500dg dgVar2 = nVar.f99317c;
            if (dgVar2 == null) {
                dgVar2 = C37500dg.f99557c;
            }
            if (!dgVar.equals(dgVar2)) {
                C59052c cVar = (C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47605);
                C37500dg dgVar3 = nVar.f99317c;
                if (dgVar3 == null) {
                    dgVar3 = C37500dg.f99557c;
                }
                cVar.mo56393w("stopListening called but the IDs mismatch. Got %s, Expected %s", dgVar3.f99560b, ((C37500dg) this.f54133k.mo56107c()).f99560b);
                C37513dt dtVar5 = (C37513dt) C37514du.f99629c.createBuilder();
                C37512ds dsVar4 = C37512ds.FAILED_CLOSING_CALLED_UNEXPECTED_PRECACHED_BUFFER_ID;
                dtVar5.copyOnWrite();
                C37514du duVar5 = (C37514du) dtVar5.instance;
                duVar5.f99632b = Integer.valueOf(dsVar4.f99628K);
                duVar5.f99631a = 2;
                axVar = C58833ax.m90834k((C37514du) dtVar5.build());
            } else {
                axVar = C58836b.f156633a;
            }
        }
        if (axVar.mo56113h()) {
            return C60856cj.m92900i((C37514du) axVar.mo56107c());
        }
        m36835l();
        ((C19340h) this.f54130h.mo56107c()).f54115a.mo24338j();
        this.f54128f = C19342j.PRE_IDLE;
        C37513dt dtVar6 = (C37513dt) C37514du.f99629c.createBuilder();
        C37516dw dwVar2 = C37516dw.CLOSED;
        dtVar6.copyOnWrite();
        C37514du duVar6 = (C37514du) dtVar6.instance;
        duVar6.f99632b = Integer.valueOf(dwVar2.f99638d);
        duVar6.f99631a = 1;
        return C60856cj.m92900i((C37514du) dtVar6.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo24477g(C67171p pVar) {
        if (this.f54128f != C19342j.PRE_ACTIVE && this.f54128f != C19342j.ACTIVE) {
            return;
        }
        if (!this.f54131i.mo56113h()) {
            ((C59052c) ((C59052c) f54123a.mo56226d()).mo56372aa(47621)).mo56386p("No WriteableAudioBuffer available. Dropping audio.");
            return;
        }
        int d = pVar.f182578b.mo59031d();
        this.f54132j += d;
        ((C37335b) this.f54131i.mo56107c()).mo40890b(d, pVar.f182578b.mo59174N());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized void mo24478h(int i, C19340h hVar) {
        if (this.f54128f != C19342j.NEEDS_INIT) {
            ((C59052c) ((C59052c) f54123a.mo56226d()).mo56372aa(47616)).mo56389s("onStartCapture called, but already initialized. State: %s", this.f54128f);
            return;
        }
        C59071e eVar = f54123a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47615)).mo56386p("onStartCapture");
        this.f54128f = C19342j.IDLE;
        this.f54129g = C58833ax.m90834k(Integer.valueOf(i));
        this.f54130h = C58833ax.m90834k(hVar);
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47619)).mo56386p("Register SodaAudioAdapter.");
        this.f54125c.mo40904b(C37384h.SODA, this);
    }

    /* renamed from: i */
    public final synchronized String mo24479i() {
        return "\t \t SodaAudioAdapter\n\t \t   State: " + this.f54128f.name() + "\n";
    }
}
