package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.p.cd */
/* compiled from: PG */
public final class C86248cd implements C90991b {

    /* renamed from: a */
    public static final C59071e f233137a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.cd");

    /* renamed from: b */
    public final Object f233138b = new Object();

    /* renamed from: c */
    public C86232bo f233139c;

    /* renamed from: d */
    public long f233140d;

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("VoiceAccessSRCache");
        synchronized (this.f233138b) {
            fVar.mo85279c("cached result id").mo85276a(C90752i.m148230d(Long.valueOf(this.f233140d)));
        }
    }

    /* renamed from: a */
    public final C58833ax mo79944a(long j) {
        C86232bo boVar;
        synchronized (this.f233138b) {
            if (this.f233140d != j || (boVar = this.f233139c) == null) {
                C59104x b = f233137a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "VoiceAccessSRCache");
                ((C59052c) ((C59052c) b).mo56372aa(7816)).mo56386p("Optional.empty returned from VoiceAccessSearchResultCache.");
                C58836b bVar = C58836b.f156633a;
                return bVar;
            }
            C58833ax k = C58833ax.m90834k(boVar);
            return k;
        }
    }
}
