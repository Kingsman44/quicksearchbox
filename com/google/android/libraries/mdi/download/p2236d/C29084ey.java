package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ey */
/* compiled from: PG */
public final /* synthetic */ class C29084ey implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29334dr f78936a;

    public /* synthetic */ C29084ey(C29334dr drVar) {
        this.f78936a = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29334dr drVar = this.f78936a;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(drVar);
        }
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = C28737bo.UNABLE_TO_RESERVE_FILE_ENTRY;
        bnVar.f78063b = "Failed to reserve new file entries for group: ".concat(String.valueOf(drVar.f79501c));
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
