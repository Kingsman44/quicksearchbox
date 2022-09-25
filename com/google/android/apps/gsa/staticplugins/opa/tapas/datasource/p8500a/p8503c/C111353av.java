package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111029bz;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.av */
/* compiled from: PG */
public final /* synthetic */ class C111353av implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111366bh f309853a;

    public /* synthetic */ C111353av(C111366bh bhVar) {
        this.f309853a = bhVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111366bh bhVar = this.f309853a;
        return C60856cj.m92906o((List) Collection.EL.stream(((C111029bz) bhVar.f309878c.mo27525b()).mo99019b(bhVar.f309877b.mo79746e(C90063do.f249340bg))).flatMap(C111351at.f309851a).map(new C111356ay(bhVar, (Map) obj)).collect(C58370cn.f155946a));
    }
}
