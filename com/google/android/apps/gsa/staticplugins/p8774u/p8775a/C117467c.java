package com.google.android.apps.gsa.staticplugins.p8774u.p8775a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90232h;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23181a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.a.c */
/* compiled from: PG */
public final /* synthetic */ class C117467c implements C23181a {

    /* renamed from: a */
    public final /* synthetic */ C117469e f326036a;

    /* renamed from: b */
    public final /* synthetic */ C23181a f326037b;

    /* renamed from: c */
    public final /* synthetic */ C117473i f326038c;

    public /* synthetic */ C117467c(C117469e eVar, C23181a aVar, C117473i iVar) {
        this.f326036a = eVar;
        this.f326037b = aVar;
        this.f326038c = iVar;
    }

    /* renamed from: a */
    public final void mo28618a(C23056g gVar) {
        C117469e eVar = this.f326036a;
        C23181a aVar = this.f326037b;
        C117473i iVar = this.f326038c;
        if (gVar instanceof C90232h) {
            ((C117477m) aVar).f326075a.mo103322g(gVar);
            ((C90232h) gVar).mo83943iv(iVar.f326062c.mo80959e());
            C117494j j = C117469e.m195233j(iVar.f326062c.mo80962l());
            if (j == null) {
                j = C117494j.ANIMATE_FADE_IN;
            }
            ((C23251a) eVar.f326041b.mo103330c()).mo28730f(C58833ax.m90834k(j), false);
            C117494j j2 = C117469e.m195233j(iVar.f326062c.mo80963m());
            if (j2 == null) {
                j2 = C117494j.ANIMATE_FADE_OUT;
            }
            ((C23251a) eVar.f326041b.mo103331d()).mo28730f(C58833ax.m90834k(j2), false);
            return;
        }
        ((C59052c) ((C59052c) C117469e.f326040a.mo56225c()).mo56372aa(18245)).mo56389s("child feature controller did not implement the expected interface: %s", gVar.mo28495P());
    }
}
