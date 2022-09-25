package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.accounts.Account;
import com.google.android.apps.gsa.p6482q.p6483a.C84231d;
import com.google.android.apps.gsa.p6482q.p6483a.C84232e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49891cv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.HashSet;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.am */
/* compiled from: PG */
public final /* synthetic */ class C101089am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101092ap f282271a;

    /* renamed from: b */
    public final /* synthetic */ Account f282272b;

    /* renamed from: c */
    public final /* synthetic */ C132800h f282273c;

    public /* synthetic */ C101089am(C101092ap apVar, Account account, C132800h hVar) {
        this.f282271a = apVar;
        this.f282272b = account;
        this.f282273c = hVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        boolean z;
        C101092ap apVar = this.f282271a;
        Account account = this.f282272b;
        C132800h hVar = this.f282273c;
        C84231d dVar = (C84231d) obj;
        boolean z2 = false;
        if (apVar.f282282f.isEmpty()) {
            ((C59052c) ((C59052c) C101092ap.f282277a.mo56225c()).mo56372aa(19805)).mo56386p("Logger not available for Unified Opt In periodic sync");
        } else {
            ((C59052c) ((C59052c) C101092ap.f282277a.mo56224b()).mo56372aa(19804)).mo56386p("Logging to UMA");
            if (dVar.mo77687b().f130410d) {
                ((C19435g) apVar.f282282f.get()).mo24619a("Fedass.UnifiedV2.Periodic.EnrolledAccounts");
            } else if (dVar.mo77687b().f130409c) {
                ((C19435g) apVar.f282282f.get()).mo24619a("Fedass.Unified.Periodic.EnrolledAccounts");
            } else if (dVar.mo77687b().f130408b) {
                ((C19435g) apVar.f282282f.get()).mo24619a("Fedass.Unified.Periodic.Legacy.EnrolledAccounts");
            }
            C58485gu c = dVar.mo77688c();
            int size = c.size();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C49879cj cjVar = (C49879cj) c.get(i4);
                C49875cf a = C49875cf.m85755a(cjVar.f129638i);
                if (a == null) {
                    a = C49875cf.UNKNOWN;
                }
                if (a.equals(C49875cf.NEXUS)) {
                    i3++;
                } else {
                    C49875cf a2 = C49875cf.m85755a(cjVar.f129638i);
                    if (a2 == null) {
                        a2 = C49875cf.UNKNOWN;
                    }
                    if (a2.equals(C49875cf.MANHATTAN)) {
                        i2++;
                    } else {
                        i++;
                    }
                }
            }
            if (i > 0) {
                ((C19435g) apVar.f282282f.get()).mo24625g(0, (long) i);
            }
            if (i2 > 0) {
                ((C19435g) apVar.f282282f.get()).mo24625g(1, (long) i2);
            }
            if (i3 > 0) {
                ((C19435g) apVar.f282282f.get()).mo24625g(2, (long) i3);
            }
        }
        if (dVar.mo77687b().f130408b) {
            return C60866ct.f164955a;
        }
        HashSet hashSet = (HashSet) Collection.EL.stream(dVar.mo77688c()).filter(C101085ai.f282267a).collect(Collectors.toCollection(C101086aj.f282268a));
        if (hashSet.size() != 1) {
            ((C59052c) ((C59052c) C101092ap.f282277a.mo56224b()).mo56372aa(19802)).mo56387q("self ID failed; selfDevices size = %d", hashSet.size());
            optional = Optional.empty();
        } else {
            C49879cj cjVar2 = (C49879cj) hashSet.iterator().next();
            C49891cv cvVar = cjVar2.f129639j;
            if (cvVar == null) {
                cvVar = C49891cv.f129647N;
            }
            if ((cvVar.f129664b & 67108864) != 0) {
                C49891cv cvVar2 = cjVar2.f129639j;
                if (cvVar2 == null) {
                    cvVar2 = C49891cv.f129647N;
                }
                optional = Optional.m71637of(Boolean.valueOf(cvVar2.f129661L));
            } else {
                ((C59052c) ((C59052c) C101092ap.f282277a.mo56224b()).mo56372aa(19801)).mo56386p("self ID'd per-device Unified bit not set");
                optional = Optional.empty();
            }
        }
        if (optional.isPresent()) {
            z = ((Boolean) optional.get()).booleanValue();
            ((C59052c) ((C59052c) C101092ap.f282277a.mo56224b()).mo56372aa(19795)).mo56389s("server isSelf-device bit found and is %b", Boolean.valueOf(z));
        } else {
            boolean z3 = dVar.mo77687b().f130409c;
            boolean z4 = dVar.mo77687b().f130410d;
            if (z3 || z4) {
                z2 = true;
            }
            ((C59052c) ((C59052c) C101092ap.f282277a.mo56224b()).mo56372aa(19793)).mo56358K("server account-wide bits: v1=%b, v2=%b", z3, z4);
            z = z2;
        }
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        boolean z5 = fVar.f362318b;
        if (z || !z5) {
            return apVar.mo92136a(account.name, z, dVar.mo77687b().f130409c);
        }
        C60870cx f = ((C84232e) apVar.f282280d.get()).mo77697f();
        C101083ag agVar = new C101083ag(apVar, account);
        return C60922j.m93045h(f, C47810es.m84966f(agVar), C60826bg.f164896a);
    }
}
