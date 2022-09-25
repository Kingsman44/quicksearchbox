package com.google.android.libraries.mdi.download;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.bm */
/* compiled from: PG */
public final /* synthetic */ class C28735bm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28737bo f78060a;

    /* renamed from: b */
    public final /* synthetic */ String f78061b;

    public /* synthetic */ C28735bm(C28737bo boVar, String str) {
        this.f78060a = boVar;
        this.f78061b = str;
    }

    public final C60870cx apply(Object obj) {
        C28737bo boVar = this.f78060a;
        String str = this.f78061b;
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = boVar;
        bnVar.f78063b = str;
        bnVar.f78064c = (Throwable) obj;
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
