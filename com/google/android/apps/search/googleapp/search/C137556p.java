package com.google.android.apps.search.googleapp.search;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.srp.C137699ab;
import com.google.android.apps.search.googleapp.search.srp.error.C137822u;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.googleapp.search.p */
/* compiled from: PG */
final class C137556p implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137553n f374165a;

    public C137556p(C137553n nVar) {
        this.f374165a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C137822u uVar = (C137822u) bVar;
        C137553n nVar = this.f374165a;
        C137699ab l = nVar.mo113811l();
        l.getClass();
        C58838bb.m90884s(l.mo17754z().mo113922l(), "Only retries for empty voice queries should be handled by SearchFragmentPeer.");
        nVar.f374135d.mo83702b(C89849ae.ERROR_CARD_VOICE_SEARCH_RETRY);
        nVar.f374148q.mo115174a();
        nVar.mo113821v(C137418g.f373767r);
        return C47392e.f123115a;
    }
}
