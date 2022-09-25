package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.p3296e.C42500d;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42435n;

/* renamed from: com.google.android.libraries.social.populous.ab */
/* compiled from: PG */
public final /* synthetic */ class C42148ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AutocompleteSession f110392a;

    /* renamed from: b */
    public final /* synthetic */ C42500d f110393b;

    /* renamed from: c */
    public final /* synthetic */ Autocompletion[] f110394c;

    public /* synthetic */ C42148ab(AutocompleteSession autocompleteSession, C42500d dVar, Autocompletion[] autocompletionArr) {
        this.f110392a = autocompleteSession;
        this.f110393b = dVar;
        this.f110394c = autocompletionArr;
    }

    public final void run() {
        AutocompleteSession autocompleteSession = this.f110392a;
        C42500d dVar = this.f110393b;
        Autocompletion[] autocompletionArr = this.f110394c;
        C42549n e = dVar.mo45381e();
        C42435n nVar = e.f111617n;
        nVar.mo45496e(new C42712z(autocompleteSession, e, autocompletionArr, dVar));
        nVar.mo45495d(new C42147aa(autocompleteSession, e, autocompletionArr, dVar));
    }
}
