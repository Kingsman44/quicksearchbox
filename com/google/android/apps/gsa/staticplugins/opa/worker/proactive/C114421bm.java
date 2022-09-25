package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bm */
/* compiled from: PG */
public final class C114421bm {

    /* renamed from: a */
    public static final C59071e f317268a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bm");

    /* renamed from: b */
    public final Context f317269b;

    /* renamed from: c */
    public final C68214a f317270c;

    /* renamed from: d */
    public final bm f317271d;

    /* renamed from: e */
    public final Executor f317272e;

    /* renamed from: f */
    private final C68214a f317273f;

    public C114421bm(Context context, C68214a aVar, C68214a aVar2, bm bmVar, Executor executor) {
        this.f317273f = aVar;
        this.f317269b = context;
        this.f317270c = aVar2;
        this.f317271d = bmVar;
        this.f317272e = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo101321a(aas aas) {
        if (aas.f134665c.isEmpty()) {
            return true;
        }
        String b = ((C86106b) this.f317273f.mo27525b()).mo79727b();
        if (b == null) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        for (C52428rj rjVar : aas.f134665c) {
            if (b.equals(rjVar.f137563d)) {
                return true;
            }
        }
        return false;
    }
}
