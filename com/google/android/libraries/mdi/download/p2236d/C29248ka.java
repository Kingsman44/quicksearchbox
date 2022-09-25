package com.google.android.libraries.mdi.download.p2236d;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ka */
/* compiled from: PG */
public final /* synthetic */ class C29248ka implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29259kl f79256a;

    /* renamed from: b */
    public final /* synthetic */ int f79257b;

    /* renamed from: c */
    public final /* synthetic */ C29172hf f79258c;

    public /* synthetic */ C29248ka(C29259kl klVar, int i, C29172hf hfVar) {
        this.f79256a = klVar;
        this.f79257b = i;
        this.f79258c = hfVar;
    }

    public final C60870cx apply(Object obj) {
        C29259kl klVar = this.f79256a;
        int i = this.f79257b;
        C29172hf hfVar = this.f79258c;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(false);
        }
        C29173hg.m54130d(klVar.f79270a, C29172hf.m54126a(i));
        return klVar.mo34635b(hfVar, i + 1);
    }
}
