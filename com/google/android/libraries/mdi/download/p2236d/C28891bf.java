package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.bf */
/* compiled from: PG */
public final /* synthetic */ class C28891bf implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78468a;

    public /* synthetic */ C28891bf(C29117fe feVar) {
        this.f78468a = feVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78468a;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        feVar.f78973b.mo34543h(1036);
        C28736bn bnVar = new C28736bn();
        bnVar.f78063b = "File Import(s) succeeded, but failed to save MDD state.";
        bnVar.f78062a = C28737bo.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
