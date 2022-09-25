package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import android.support.p033v7.widget.LinearLayoutManager;
import java.util.Locale;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.keyboardstate.EligibilityChecker", mo61344c = "EligibilityChecker.kt", mo61345d = "hasDownloadedFileGroupForLocale", mo61346e = {624})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.n */
/* compiled from: PG */
final class C125925n extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f347070a;

    /* renamed from: b */
    final /* synthetic */ C125926o f347071b;

    /* renamed from: c */
    int f347072c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125925n(C125926o oVar, C69577g gVar) {
        super(gVar);
        this.f347071b = oVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f347070a = obj;
        this.f347072c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f347071b.mo107179n((Locale) null, this);
    }
}
