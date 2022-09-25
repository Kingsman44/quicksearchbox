package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62921ba;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.v */
/* compiled from: PG */
public final /* synthetic */ class C139022v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139025y f378077a;

    public /* synthetic */ C139022v(C139025y yVar) {
        this.f378077a = yVar;
    }

    public final Object apply(Object obj) {
        C139025y yVar = this.f378077a;
        C61366ah ahVar = (C61366ah) obj;
        try {
            C139013m mVar = (C139013m) C139014n.f378062b.createBuilder();
            mVar.mergeFrom(C62897ae.m95111N(ahVar.f165946b), C62921ba.m95368a());
            return (C139014n) mVar.build();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C139025y.f378079a.mo56225c()).mo56382g(e)).mo56372aa(41340)).mo56386p("An error occurred while parsing the search providers configuration.");
            yVar.f378085g.mo19974a(C37182a.f98197iE.mo40805c(C62722b.OK));
            return C139014n.f378062b;
        }
    }
}
