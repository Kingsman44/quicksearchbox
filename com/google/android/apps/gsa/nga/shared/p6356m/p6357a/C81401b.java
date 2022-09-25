package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.C74708bi;
import com.google.android.apps.gsa.nga.shared.p6339f.C81042c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.nga.shared.p6356m.C81382a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94979p;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94980q;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95058u;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37381e;
import com.google.android.libraries.search.p2904c.p2908b.C37382f;
import com.google.android.libraries.search.p2904c.p2908b.C37388l;
import com.google.android.libraries.search.p2904c.p2908b.C37390n;
import com.google.android.libraries.search.p2904c.p2908b.C37395s;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.p2950a.C37891b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.b */
/* compiled from: PG */
public final class C81401b implements C37363a, C81382a {

    /* renamed from: a */
    public static final C58974d f222770a = C58974d.m91136j();

    /* renamed from: b */
    static final Duration f222771b = Duration.ofSeconds(20);

    /* renamed from: c */
    public final C37395s f222772c;

    /* renamed from: d */
    public final C81042c f222773d;

    /* renamed from: e */
    public final Object f222774e = new Object();

    /* renamed from: f */
    public final C58247c f222775f;

    /* renamed from: g */
    public final Map f222776g;

    /* renamed from: h */
    public C74708bi f222777h;

    /* renamed from: i */
    public final C37891b f222778i;

    /* renamed from: j */
    private final C22871g f222779j;

    public C81401b(C37395s sVar, C22871g gVar, C81042c cVar, C37891b bVar) {
        C58254i iVar = new C58254i();
        iVar.mo54823g(3);
        this.f222775f = iVar.mo54817a();
        this.f222776g = new ConcurrentHashMap();
        this.f222772c = sVar;
        this.f222779j = gVar;
        this.f222773d = cVar;
        this.f222778i = bVar;
    }

    /* renamed from: a */
    public final boolean mo75053a() {
        boolean z;
        synchronized (this.f222774e) {
            z = this.f222777h != null;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C37500dg mo75058b(C37336c cVar, C37672hs hsVar) {
        C37500dg a = this.f222778i.mo41135a();
        ((C58206am) this.f222775f).f155647a.put(a, hsVar);
        this.f222776g.put(hsVar, cVar);
        this.f222779j.mo28213m("[NGA] deleteInvocationMapping due to timeout", f222771b.toMillis(), new C81383a(this, hsVar));
        return a;
    }

    /* renamed from: c */
    public final C58833ax mo24473c(C37388l lVar) {
        C37672hs hsVar;
        C37336c cVar;
        int i = lVar.f99309a;
        if ((i & 1) != 0) {
            hsVar = lVar.f99310b;
            if (hsVar == null) {
                hsVar = C37672hs.f100056c;
            }
        } else if ((i & 4) != 0) {
            C37500dg dgVar = lVar.f99312d;
            if (dgVar == null) {
                dgVar = C37500dg.f99557c;
            }
            C37672hs hsVar2 = (C37672hs) ((C58206am) this.f222775f).f155647a.mo54792f(dgVar);
            if (hsVar2 != null) {
                hsVar = hsVar2;
            } else {
                ((C58970a) ((C58970a) f222770a.mo56226d()).mo56372aa(5863)).mo56387q("No matching InvocationToken for PrecachedBufferId %d present", dgVar.f99560b);
                return C58836b.f156633a;
            }
        } else {
            ((C58970a) ((C58970a) f222770a.mo56226d()).mo56372aa(5862)).mo56386p("startListening was called without precachedBufferId or invocationToken");
            return C58836b.f156633a;
        }
        C58974d dVar = f222770a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(5864)).mo56389s("#startListening for %s", C81062c.m129010a(Optional.m71637of(hsVar)));
        C37336c cVar2 = (C37336c) this.f222776g.remove(hsVar);
        if (cVar2 != null) {
            return C58833ax.m90834k(cVar2);
        }
        synchronized (this.f222774e) {
            C74708bi biVar = this.f222777h;
            if (biVar == null) {
                ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(5865)).mo56386p("startListening was called, but no MicController was registered");
                C58836b bVar = C58836b.f156633a;
                return bVar;
            }
            Optional c = ((C94980q) biVar).mo88891c(hsVar);
            if (c.isPresent()) {
                cVar = ((C95058u) c.get()).mo71067a(hsVar);
            } else {
                C59104x c2 = C94980q.f265704a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "MicControllerDelegator");
                ((C59052c) ((C59052c) c2).mo56372aa(17765)).mo56386p("startListening was called when defaultMicController is not present");
                C94979p pVar = new C94979p();
                C37360ay ayVar = C37360ay.f99224l;
                C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
                C37519dz dzVar = C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE;
                eaVar.copyOnWrite();
                C37561eb ebVar = (C37561eb) eaVar.instance;
                ebVar.f99803b = Integer.valueOf(dzVar.f99687U);
                ebVar.f99802a = 2;
                cVar = new C37334a(pVar, ayVar, C60856cj.m92900i((C37561eb) eaVar.build()));
            }
            C58833ax k = C58833ax.m90834k(cVar);
            return k;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo24474d() {
        return C60856cj.m92900i(C37381e.AUDIO_ADAPTER_CONNECT_STATUS_SUCCESS);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo24475e(boolean z) {
        return C60856cj.m92900i(C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS);
    }

    /* renamed from: f */
    public final C60870cx mo24476f(C37390n nVar) {
        C37672hs hsVar;
        int i = nVar.f99315a;
        if ((i & 1) != 0) {
            hsVar = nVar.f99316b;
            if (hsVar == null) {
                hsVar = C37672hs.f100056c;
            }
        } else if ((i & 2) != 0) {
            C37500dg dgVar = nVar.f99317c;
            if (dgVar == null) {
                dgVar = C37500dg.f99557c;
            }
            C37672hs hsVar2 = (C37672hs) ((C58206am) this.f222775f).f155647a.mo54792f(dgVar);
            if (hsVar2 != null) {
                hsVar = hsVar2;
            } else {
                ((C58970a) ((C58970a) f222770a.mo56226d()).mo56372aa(5867)).mo56387q("No matching InvocationToken present for PrecachedBufferId %d", dgVar.f99560b);
                C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
                C37512ds dsVar = C37512ds.FAILED_CLOSING_CALLED_UNEXPECTED_PRECACHED_BUFFER_ID;
                dtVar.copyOnWrite();
                C37514du duVar = (C37514du) dtVar.instance;
                duVar.f99632b = Integer.valueOf(dsVar.f99628K);
                duVar.f99631a = 2;
                return C60856cj.m92900i((C37514du) dtVar.build());
            }
        } else {
            ((C58970a) ((C58970a) f222770a.mo56226d()).mo56372aa(5866)).mo56386p("stopListening called without PrecachedBufferId or InvocationToken");
            C37513dt dtVar2 = (C37513dt) C37514du.f99629c.createBuilder();
            C37512ds dsVar2 = C37512ds.FAILED_CLOSING_CALLED_WITHOUT_PRECACHED_BUFFER_ID;
            dtVar2.copyOnWrite();
            C37514du duVar2 = (C37514du) dtVar2.instance;
            duVar2.f99632b = Integer.valueOf(dsVar2.f99628K);
            duVar2.f99631a = 2;
            return C60856cj.m92900i((C37514du) dtVar2.build());
        }
        C58974d dVar = f222770a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(5868)).mo56389s("#stopListening for %s", C81062c.m129010a(Optional.m71637of(hsVar)));
        synchronized (this.f222774e) {
            C74708bi biVar = this.f222777h;
            if (biVar == null) {
                ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(5869)).mo56386p("stopListening called but no MicController is registered");
                C37513dt dtVar3 = (C37513dt) C37514du.f99629c.createBuilder();
                C37512ds dsVar3 = C37512ds.FAILED_CLOSING_BISTO_MIC_NOT_REGISTERED;
                dtVar3.copyOnWrite();
                C37514du duVar3 = (C37514du) dtVar3.instance;
                duVar3.f99632b = Integer.valueOf(dsVar3.f99628K);
                duVar3.f99631a = 2;
                C60870cx i2 = C60856cj.m92900i((C37514du) dtVar3.build());
                return i2;
            }
            C60870cx b = biVar.mo71068b(hsVar);
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo75059g(C37672hs hsVar) {
        if (((C37336c) this.f222776g.remove(hsVar)) == null) {
            return false;
        }
        C58974d dVar = f222770a;
        ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(5875)).mo56389s("WriteableAudioBuffer not consumed for %s", C81062c.m129010a(Optional.m71637of(hsVar)));
        synchronized (this.f222774e) {
            C74708bi biVar = this.f222777h;
            if (biVar == null) {
                ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(5876)).mo56386p("deleteMapping called but no micController was registered");
                return false;
            }
            biVar.mo71068b(hsVar);
            return true;
        }
    }
}
