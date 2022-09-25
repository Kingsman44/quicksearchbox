package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86677b;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.monet.p7070b.p7099p.C90268a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7099p.C90270c;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.i */
/* compiled from: PG */
public final /* synthetic */ class C100010i implements C86677b {

    /* renamed from: a */
    public final /* synthetic */ C100023v f279710a;

    public /* synthetic */ C100010i(C100023v vVar) {
        this.f279710a = vVar;
    }

    /* renamed from: a */
    public final void mo80281a(ServiceEventData serviceEventData) {
        C23186f fVar = (C23186f) this.f279710a.f279727b.mo91703d();
        if (!fVar.mo28631l()) {
            fVar.mo28623d(C90270c.f252142a, ProtoParcelable.f63423a);
        }
        C90268a aVar = (C90268a) fVar.mo28620a();
        if (aVar == null) {
            C59052c cVar = (C59052c) ((C59052c) C100023v.f279726a.mo56226d()).mo56372aa(33167);
            C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a == null) {
                a = C88244um.ATTACH_WEBVIEW;
            }
            cVar.mo56389s("Attempt to send service event with id:  %s when nativeviews controller is null", a);
            int i = C90755l.f253831a;
            return;
        }
        aVar.mo83976a(serviceEventData);
    }
}
