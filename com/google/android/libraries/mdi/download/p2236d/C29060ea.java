package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.d.ea */
/* compiled from: PG */
public final /* synthetic */ class C29060ea implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29392ep f78871a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f78872b;

    public /* synthetic */ C29060ea(C29392ep epVar, AtomicReference atomicReference) {
        this.f78871a = epVar;
        this.f78872b = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        C29392ep epVar = this.f78871a;
        AtomicReference atomicReference = this.f78872b;
        C29334dr drVar = (C29334dr) obj;
        if (drVar == null) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.GROUP_NOT_FOUND_ERROR;
            bnVar.f78063b = "Nothing to download for file group: ".concat(String.valueOf(epVar.f79682b));
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        atomicReference.set(drVar);
        return C60856cj.m92900i(drVar);
    }
}
