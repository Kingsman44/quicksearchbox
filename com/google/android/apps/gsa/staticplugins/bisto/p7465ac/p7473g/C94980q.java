package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g;

import com.google.android.apps.gsa.nga.api.C74708bi;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95058u;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.g.q */
/* compiled from: PG */
public final class C94980q implements C74708bi {

    /* renamed from: a */
    public static final C59071e f265704a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.g.q");

    /* renamed from: b */
    final Set f265705b = new HashSet();

    /* renamed from: c */
    Optional f265706c = Optional.empty();

    /* renamed from: d */
    public final Optional f265707d;

    /* renamed from: e */
    private final Executor f265708e;

    public C94980q(Optional optional, Executor executor) {
        this.f265707d = optional;
        this.f265708e = executor;
    }

    /* renamed from: a */
    public final C37336c mo71067a(C37672hs hsVar) {
        throw null;
    }

    /* renamed from: b */
    public final C60870cx mo71068b(C37672hs hsVar) {
        Optional c = mo88891c(hsVar);
        if (c.isPresent()) {
            this.f265706c = c;
            return ((C95058u) c.get()).mo71068b(hsVar);
        }
        C59104x c2 = f265704a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "MicControllerDelegator");
        ((C59052c) ((C59052c) c2).mo56372aa(17766)).mo56386p("stopListening was called when defaultMicController is not present");
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37512ds dsVar = C37512ds.FAILED_CLOSING_NO_AUDIO_SOURCE;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dsVar.f99628K);
        duVar.f99631a = 2;
        return C60856cj.m92900i((C37514du) dtVar.build());
    }

    /* renamed from: c */
    public final Optional mo88891c(C37672hs hsVar) {
        for (C95058u uVar : this.f265705b) {
            if (uVar.mo88875j(hsVar)) {
                return Optional.m71637of(uVar);
            }
        }
        return this.f265706c;
    }

    /* renamed from: d */
    public final void mo88892d(C95058u uVar, boolean z) {
        if (this.f265707d.isEmpty()) {
            C59104x c = f265704a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MicControllerDelegator");
            ((C59052c) ((C59052c) c).mo56372aa(17767)).mo56386p("invocation manager is not present.");
        } else if (this.f265705b.isEmpty()) {
            this.f265708e.execute(new C94977n(this));
        }
        if (this.f265705b.isEmpty() || z) {
            this.f265706c = Optional.m71637of(uVar);
        }
        this.f265705b.add(uVar);
    }

    /* renamed from: e */
    public final void mo88893e(C95058u uVar) {
        this.f265705b.remove(uVar);
        if (this.f265706c.isPresent() && ((C95058u) this.f265706c.get()).equals(uVar)) {
            this.f265706c = Optional.empty();
            Iterator it = this.f265705b.iterator();
            if (it.hasNext()) {
                this.f265706c = Optional.m71637of((C95058u) it.next());
            }
        }
        if (this.f265707d.isEmpty()) {
            C59104x c = f265704a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MicControllerDelegator");
            ((C59052c) ((C59052c) c).mo56372aa(17768)).mo56386p("invocation manager is not present.");
        } else if (this.f265705b.isEmpty()) {
            this.f265708e.execute(new C94978o(this));
        }
    }
}
