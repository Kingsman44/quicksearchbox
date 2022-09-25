package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60105ky;
import com.google.common.p4552o.C60106kz;
import com.google.common.p4552o.C60291nd;
import com.google.common.p4552o.C60292ne;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.b */
/* compiled from: PG */
public final /* synthetic */ class C124826b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124827c f344382a;

    /* renamed from: b */
    public final /* synthetic */ Optional f344383b;

    public /* synthetic */ C124826b(C124827c cVar, Optional optional) {
        this.f344382a = cVar;
        this.f344383b = optional;
    }

    public final void accept(Object obj) {
        C124827c cVar = this.f344382a;
        C124844bo boVar = (C124844bo) obj;
        C60291nd c = cVar.mo106663c(boVar.f344421c, (C124679cr) this.f344383b.orElse(null));
        C60298nk nkVar = cVar.f344387c;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60292ne neVar = (C60292ne) c.build();
        C60300nm nmVar2 = C60300nm.f163138H;
        neVar.getClass();
        nmVar.f163151e = neVar;
        nmVar.f163147a |= 512;
        C60103kw kwVar = cVar.f344386b;
        C60105ky a = C60105ky.m92528a(boVar.f344428j);
        if (a == null) {
            a = C60105ky.UNKNOWN;
        }
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        C60106kz kzVar2 = C60106kz.f162531p;
        kzVar.f162541i = a.f162530s;
        kzVar.f162533a |= 2048;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
