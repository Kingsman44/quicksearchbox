package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d.p9952a;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C131164b implements C46675m {

    /* renamed from: a */
    public final /* synthetic */ C28728bf f358683a;

    public /* synthetic */ C131164b(C28728bf bfVar) {
        this.f358683a = bfVar;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C28728bf bfVar = this.f358683a;
        C46663a aVar = new C46663a();
        aVar.mo50684b(false);
        aVar.mo50686d(C46667e.KEY_VALUE);
        if (bfVar.f78046b.size() == 0) {
            aVar.f121916a = C63088z.m96143E("<none>");
            return C60856cj.m92900i(aVar.mo50683a());
        }
        C28708an anVar = ((C28725bc) bfVar.f78046b.get(0)).f78038c;
        if (anVar == null) {
            anVar = C28708an.f77994l;
        }
        aVar.f121916a = C63088z.m96143E(String.valueOf(anVar.f77999d));
        return C60856cj.m92900i(aVar.mo50683a());
    }
}
