package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105456z;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.el */
/* compiled from: PG */
public final class C105592el implements C105456z, C23252b {

    /* renamed from: a */
    private final C23251a f294627a;

    /* renamed from: b */
    private final C23251a f294628b;

    /* renamed from: c */
    private final C23251a f294629c;

    /* renamed from: d */
    private final C23251a f294630d;

    /* renamed from: e */
    private final C23251a f294631e;

    /* renamed from: f */
    private final List f294632f;

    public C105592el(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "action", new C23268m(new C23272q()), false, true, false);
        this.f294627a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "displaySnackbar", new C23256a(), false, true, false);
        this.f294628b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "isBackgroundTranslucent", new C23256a(), false, true, false);
        this.f294629c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "message", new C23272q(), false, true, false);
        this.f294630d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar, "surfaceType", new C23268m(new C23259d(C90229e.values())), false, true, false);
        this.f294631e = aVar6;
        aVar.mo28530a(aVar6);
        this.f294632f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294632f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94652b() {
        return this.f294627a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94653c() {
        return this.f294628b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94654d() {
        return this.f294629c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94655e() {
        return this.f294630d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo94656f() {
        return this.f294631e;
    }
}
