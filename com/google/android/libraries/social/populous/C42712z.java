package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.p3296e.C42500d;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69299g;

/* renamed from: com.google.android.libraries.social.populous.z */
/* compiled from: PG */
public final /* synthetic */ class C42712z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AutocompleteSession f111948a;

    /* renamed from: b */
    public final /* synthetic */ C42549n f111949b;

    /* renamed from: c */
    public final /* synthetic */ Autocompletion[] f111950c;

    /* renamed from: d */
    public final /* synthetic */ C42500d f111951d;

    public /* synthetic */ C42712z(AutocompleteSession autocompleteSession, C42549n nVar, Autocompletion[] autocompletionArr, C42500d dVar) {
        this.f111948a = autocompleteSession;
        this.f111949b = nVar;
        this.f111950c = autocompletionArr;
        this.f111951d = dVar;
    }

    public final void run() {
        String str;
        AutocompleteSession autocompleteSession = this.f111948a;
        C42549n nVar = this.f111949b;
        Autocompletion[] autocompletionArr = this.f111950c;
        C42500d dVar = this.f111951d;
        autocompleteSession.mo44819h(nVar, autocompletionArr.length, dVar);
        synchronized (autocompleteSession.f110349j) {
            dVar.mo45381e().mo45554a();
            int a = dVar.mo45377a();
            boolean k = dVar.mo45389k();
            if (C69299g.f185427a.mo6453a().mo60972g()) {
                str = dVar.mo45381e().f111604a;
            } else {
                str = dVar.mo45381e().f111605b;
            }
            dVar.mo45380d();
            dVar.mo45379c();
            dVar.mo45388j();
            dVar.mo45390l();
            C42152af afVar = new C42152af(a, k, str);
            for (C42182ao a2 : autocompleteSession.f110349j) {
                a2.mo44713a(autocompletionArr, afVar);
            }
        }
    }
}
