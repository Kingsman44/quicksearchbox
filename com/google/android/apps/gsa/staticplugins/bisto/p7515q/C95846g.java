package com.google.android.apps.gsa.staticplugins.bisto.p7515q;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.q.g */
/* compiled from: PG */
public final /* synthetic */ class C95846g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C95848i f268396a;

    /* renamed from: b */
    public final /* synthetic */ C124548d f268397b;

    public /* synthetic */ C95846g(C95848i iVar, C124548d dVar) {
        this.f268396a = iVar;
        this.f268397b = dVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C95848i iVar = this.f268396a;
        C124548d dVar = this.f268397b;
        Exception exc = (Exception) obj;
        String c = iVar.f268404f.mo83457c();
        C59104x c2 = C95848i.f268399a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "HotwordActivator");
        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(exc)).mo56372aa(15482)).mo56389s("failed to get ota states. updating db with fallback. locale: %s", c);
        iVar.f268402d.mo83389ae(iVar.f268400b.mo89270k(), (String) iVar.f268401c.mo83585b(C58837ba.m90858g(c), dVar.mo106480U(), dVar.mo106479T()).mo56109e(BuildConfig.FLAVOR), BuildConfig.FLAVOR, dVar.mo106463D(), dVar.mo106480U(), dVar.mo106479T(), dVar.mo106494ah());
        iVar.mo89819d();
        throw exc;
    }
}
