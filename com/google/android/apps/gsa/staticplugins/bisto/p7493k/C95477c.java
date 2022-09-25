package com.google.android.apps.gsa.staticplugins.bisto.p7493k;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.shared.bisto.C89629b;
import com.google.android.apps.gsa.shared.bisto.C89647bd;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C49925eb;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.k.c */
/* compiled from: PG */
public final class C95477c implements C89629b {

    /* renamed from: a */
    public static final C59071e f267168a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.k.c");

    /* renamed from: b */
    static final Duration f267169b = Duration.ofDays(28);

    /* renamed from: c */
    public final C68214a f267170c;

    /* renamed from: d */
    public final Optional f267171d;

    /* renamed from: e */
    public final C60950i f267172e;

    /* renamed from: f */
    private final Context f267173f;

    /* renamed from: g */
    private final C68214a f267174g;

    /* renamed from: h */
    private final C68214a f267175h;

    /* renamed from: i */
    private final C68214a f267176i;

    /* renamed from: j */
    private final Executor f267177j;

    /* renamed from: k */
    private final SharedPreferences f267178k;

    public C95477c(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, Executor executor, SharedPreferences sharedPreferences, Optional optional, C60950i iVar) {
        this.f267170c = aVar;
        this.f267173f = context;
        this.f267174g = aVar2;
        this.f267175h = aVar3;
        this.f267176i = aVar4;
        this.f267177j = executor;
        this.f267178k = sharedPreferences;
        this.f267171d = optional;
        this.f267172e = iVar;
    }

    /* renamed from: a */
    public final C124719q mo83501a(String str) {
        C124548d b = ((C89492cd) this.f267170c.mo27525b()).mo83401b(str);
        if (b == null) {
            return C124719q.UNKNOWN_DEVICE_CATEGORY;
        }
        return b.mo106513k();
    }

    /* renamed from: b */
    public final C58528ij mo83502b(act act) {
        Account a;
        C58526ih ihVar = new C58526ih();
        for (C124548d dVar : (List) C60856cj.m92910s(((C89492cd) this.f267170c.mo27525b()).mo83402i())) {
            if ((dVar.mo106521s().equals(C124636bb.OPA_ENABLED) && dVar.mo106520r().equals(C124633az.OOBE_FINISHED)) || ("wired".equals(dVar.mo106475P()) && !dVar.mo106521s().equals(C124636bb.UNKNOWN_ENABLED_STATE))) {
                String P = dVar.mo106475P();
                if (!(act == null || !dVar.mo106484Y() || (a = ((C86054o) this.f267176i.mo27525b()).mo79668a()) == null)) {
                    C124620am o = dVar.mo106517o(a);
                    String c = ((C86106b) this.f267175h.mo27525b()).mo79728c(a.name);
                    if (c != null && o.f343765c.equals(c)) {
                        HashSet hashSet = new HashSet();
                        C49893cx cxVar = act.f128900g;
                        if (cxVar == null) {
                            cxVar = C49893cx.f129688b;
                        }
                        for (C49879cj cjVar : cxVar.f129690a) {
                            C49891cv cvVar = cjVar.f129639j;
                            if (cvVar == null) {
                                cvVar = C49891cv.f129647N;
                            }
                            C49925eb ebVar = cvVar.f129660K;
                            if (ebVar == null) {
                                ebVar = C49925eb.f129768c;
                            }
                            if (c.equals(ebVar.f129771b)) {
                                hashSet.add(cjVar.f129631b);
                            }
                        }
                        if (!hashSet.contains(o.f343764b)) {
                            C59104x d = f267168a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "BistoDeviceHelperImpl");
                            ((C59052c) ((C59052c) d).mo56372aa(15075)).mo56389s("Orphan device found %s", P);
                            this.f267177j.execute(new C95476b(this, P, dVar));
                        }
                    }
                }
                ihVar.mo55373c(Pair.create(P, dVar.mo106476Q()));
            }
        }
        C58528ij f = ihVar.mo55486f();
        C59104x b = f267168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceHelperImpl");
        ((C59052c) ((C59052c) b).mo56372aa(15074)).mo56387q("getEnabledBistoDevices: %d devices added", f.size());
        return f;
    }

    /* renamed from: c */
    public final boolean mo83503c() {
        return C89681t.m146043i(this.f267173f, this.f267178k, false);
    }

    /* renamed from: d */
    public final boolean mo83504d() {
        try {
            if (!((List) C60856cj.m92910s(((C89492cd) this.f267170c.mo27525b()).mo83402i())).isEmpty()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C59104x c = f267168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceHelperImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15079)).mo56386p("Failed to get device infos");
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo83505e() {
        return ((C89647bd) this.f267174g.mo27525b()).mo83538b();
    }

    /* renamed from: f */
    public final boolean mo83506f(String str) {
        C124548d b = ((C89492cd) this.f267170c.mo27525b()).mo83401b(str);
        if (b == null) {
            return false;
        }
        if (!b.mo106484Y()) {
            return b.mo106488ab();
        }
        Account a = ((C86054o) this.f267176i.mo27525b()).mo79668a();
        if (a != null && !C58837ba.m90859h(a.name)) {
            return b.mo106517o(a).f343766d;
        }
        C59104x d = f267168a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoDeviceHelperImpl");
        ((C59052c) ((C59052c) d).mo56372aa(15080)).mo56386p("No account");
        return b.mo106488ab();
    }
}
