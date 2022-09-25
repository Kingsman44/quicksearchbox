package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125239cc;
import java.util.Locale;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.keyboardstate.EligibilityChecker", mo61344c = "EligibilityChecker.kt", mo61345d = "checkAiAiEligibility", mo61346e = {438})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.a */
/* compiled from: PG */
final class C125910a extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f346999a;

    /* renamed from: b */
    final /* synthetic */ C125926o f347000b;

    /* renamed from: c */
    int f347001c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125910a(C125926o oVar, C69577g gVar) {
        super(gVar);
        this.f347000b = oVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f346999a = obj;
        this.f347001c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f347000b.mo107169d((af) null, (Locale) null, (C125239cc) null, this);
    }
}
