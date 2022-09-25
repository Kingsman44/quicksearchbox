package com.google.android.apps.gsa.staticplugins.customtabs;

import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98570f;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.p1703d.C20670z;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.d */
/* compiled from: PG */
public final /* synthetic */ class C98648d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98664g f275536a;

    /* renamed from: b */
    public final /* synthetic */ C20665u f275537b;

    public /* synthetic */ C98648d(C98664g gVar, C20665u uVar) {
        this.f275536a = gVar;
        this.f275537b = uVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C98664g gVar = this.f275536a;
        C20665u uVar = this.f275537b;
        C98570f fVar = gVar.f275615d;
        if (fVar.mo91186c()) {
            fVar.mo91184a(C37182a.f98119gg);
            C20670z d = uVar.mo25658d();
            if (d == null) {
                ((C59052c) ((C59052c) C98570f.f275303a.mo56226d()).mo56372aa(19111)).mo56386p("Unable to update cached status.");
                fVar.mo91184a(C37182a.f98121gi.mo40805c(C62722b.UNKNOWN));
            } else {
                fVar.mo91185b(d);
            }
        }
        return gVar.f275614c.mo91192b(uVar);
    }
}
