package com.google.android.apps.gsa.staticplugins.searchwidget.p8757d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139006f;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139008h;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139014n;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.d.a */
/* compiled from: PG */
public final /* synthetic */ class C117264a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117271h f325509a;

    /* renamed from: b */
    public final /* synthetic */ String f325510b;

    public /* synthetic */ C117264a(C117271h hVar, String str) {
        this.f325509a = hVar;
        this.f325510b = str;
    }

    public final C60870cx apply(Object obj) {
        C117271h hVar = this.f325509a;
        String str = this.f325510b;
        byte[] f = ((C89057m) obj).mo83036f();
        try {
            for (C139006f fVar : ((C139014n) C62942bv.parseFrom((C62942bv) C139014n.f378062b, f, C62921ba.m95368a())).f378064a) {
                if (C58890d.m90990e(fVar.f378040b, str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(hVar.f325529c.mo46039a(new C117268e(fVar), C60826bg.f164896a));
                    if ((fVar.f378039a & 2) != 0) {
                        C139008h hVar2 = fVar.f378041c;
                        if (hVar2 == null) {
                            hVar2 = C139008h.f378043h;
                        }
                        arrayList.add(hVar.mo103223b(hVar2, 1));
                    }
                    if ((fVar.f378039a & 4) != 0) {
                        C139008h hVar3 = fVar.f378042d;
                        if (hVar3 == null) {
                            hVar3 = C139008h.f378043h;
                        }
                        arrayList.add(hVar.mo103223b(hVar3, 2));
                    }
                    return C60856cj.m92894c(arrayList).mo57334a(new C117265b(hVar), C60826bg.f164896a);
                }
            }
            hVar.f325532f.mo83702b(C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_READ_DATA_INVALID);
            return C60866ct.f164955a;
        } catch (IOException e) {
            C59104x c = C117271h.f325527a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SelectableWdgtMgr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32797)).mo56389s("An error occurred while parsing the search provider proto for package %s", str);
            hVar.f325532f.mo83702b(C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_READ_FAILED);
            return C60856cj.m92899h(e);
        }
    }
}
