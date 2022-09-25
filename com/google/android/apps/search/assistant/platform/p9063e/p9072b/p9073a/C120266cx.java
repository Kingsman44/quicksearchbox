package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.libraries.p8956c.p8957a.C119257c;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.cx */
/* compiled from: PG */
public final /* synthetic */ class C120266cx implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f334635a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f334636b;

    /* renamed from: c */
    public final /* synthetic */ C120227bq f334637c;

    public /* synthetic */ C120266cx(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C120227bq bqVar) {
        this.f334635a = atomicBoolean;
        this.f334636b = atomicBoolean2;
        this.f334637c = bqVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        AtomicBoolean atomicBoolean = this.f334635a;
        AtomicBoolean atomicBoolean2 = this.f334636b;
        C120227bq bqVar = this.f334637c;
        Exception exc = (Exception) obj;
        C59104x d = C120274db.f334657a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(34691)).mo56386p("#runningApaS3Connection: onlineprocessing network failure");
        if (atomicBoolean.get()) {
            return false;
        }
        if (C119257c.m197952a(exc)) {
            atomicBoolean2.set(true);
            bqVar.mo104694c(exc);
            return true;
        } else if (!C119257c.m197953b(exc)) {
            return false;
        } else {
            bqVar.mo104694c(exc);
            return true;
        }
    }
}
