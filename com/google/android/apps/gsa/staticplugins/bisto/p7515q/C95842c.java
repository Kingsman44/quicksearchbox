package com.google.android.apps.gsa.staticplugins.bisto.p7515q;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.p10712d.C142465gi;
import com.google.android.p10712d.C142468gl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.q.c */
/* compiled from: PG */
public final /* synthetic */ class C95842c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C95848i f268389a;

    /* renamed from: b */
    public final /* synthetic */ String f268390b;

    /* renamed from: c */
    public final /* synthetic */ Collection f268391c;

    /* renamed from: d */
    public final /* synthetic */ C142468gl f268392d;

    public /* synthetic */ C95842c(C95848i iVar, String str, Collection collection, C142468gl glVar) {
        this.f268389a = iVar;
        this.f268390b = str;
        this.f268391c = collection;
        this.f268392d = glVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C95848i iVar = this.f268389a;
        String str = this.f268390b;
        Collection collection = this.f268391c;
        C142468gl glVar = this.f268392d;
        C118826c cVar = (C118826c) obj;
        C59104x b = C95848i.f268399a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordActivator");
        ((C59052c) ((C59052c) b).mo56372aa(15472)).mo56389s("Successfully activated hotword model: %s", str);
        C89492cd cdVar = iVar.f268402d;
        String k = iVar.f268400b.mo89270k();
        String str2 = glVar.f386629h;
        String str3 = glVar.f386630i;
        C142465gi a = C142465gi.m231087a(glVar.f386628g);
        if (a == null) {
            a = C142465gi.DEVICE_TYPE_UNKNOWN;
        }
        cdVar.mo83389ae(k, str, str, collection, str2, str3, a.equals(C142465gi.DEVICE_TYPE_HOTWORD_MODEL));
        iVar.mo89820e(str);
        return C118826c.f331422a;
    }
}
