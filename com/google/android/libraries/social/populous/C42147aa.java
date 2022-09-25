package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.p3296e.C42500d;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69314v;

/* renamed from: com.google.android.libraries.social.populous.aa */
/* compiled from: PG */
public final /* synthetic */ class C42147aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AutocompleteSession f110388a;

    /* renamed from: b */
    public final /* synthetic */ C42549n f110389b;

    /* renamed from: c */
    public final /* synthetic */ Autocompletion[] f110390c;

    /* renamed from: d */
    public final /* synthetic */ C42500d f110391d;

    public /* synthetic */ C42147aa(AutocompleteSession autocompleteSession, C42549n nVar, Autocompletion[] autocompletionArr, C42500d dVar) {
        this.f110388a = autocompleteSession;
        this.f110389b = nVar;
        this.f110390c = autocompletionArr;
        this.f110391d = dVar;
    }

    public final void run() {
        AutocompleteSession autocompleteSession = this.f110388a;
        C42549n nVar = this.f110389b;
        Autocompletion[] autocompletionArr = this.f110390c;
        C42500d dVar = this.f110391d;
        if (C69314v.m100612c()) {
            autocompleteSession.mo44819h(nVar, autocompletionArr.length, dVar);
        }
    }
}
