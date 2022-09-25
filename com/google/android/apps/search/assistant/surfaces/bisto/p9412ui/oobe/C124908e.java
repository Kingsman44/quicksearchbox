package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124659by;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124663cb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124677cp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124686cy;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124687cz;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124729a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124736h;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124743o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.e */
/* compiled from: PG */
public final /* synthetic */ class C124908e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124914k f344634a;

    /* renamed from: b */
    public final /* synthetic */ String f344635b;

    /* renamed from: c */
    public final /* synthetic */ String f344636c;

    public /* synthetic */ C124908e(C124914k kVar, String str, String str2) {
        this.f344634a = kVar;
        this.f344635b = str;
        this.f344636c = str2;
    }

    public final C60870cx apply(Object obj) {
        C124914k kVar = this.f344634a;
        String str = this.f344635b;
        String str2 = this.f344636c;
        Void voidR = (Void) obj;
        C124729a aVar = kVar.f344647a;
        C58976aa aaVar = C58975e.f156826a;
        C124677cp j = C124743o.m204403j(str);
        C124686cy cyVar = (C124686cy) C124687cz.f343986d.createBuilder();
        cyVar.copyOnWrite();
        C124687cz czVar = (C124687cz) cyVar.instance;
        str.getClass();
        czVar.f343988a |= 1;
        czVar.f343989b = str;
        if (str2 != null) {
            cyVar.copyOnWrite();
            C124687cz czVar2 = (C124687cz) cyVar.instance;
            czVar2.f343988a |= 2;
            czVar2.f343990c = str2;
        }
        C124743o oVar = (C124743o) aVar;
        C124659by byVar = oVar.f344144a;
        return C60922j.m93044g(C70876o.m103760a(byVar.f189039a.mo39510a(C124663cb.m204332b(), byVar.f189040b), (C124687cz) cyVar.build()), C47810es.m84963c(new C124736h(oVar, j)), oVar.f344147d);
    }
}
