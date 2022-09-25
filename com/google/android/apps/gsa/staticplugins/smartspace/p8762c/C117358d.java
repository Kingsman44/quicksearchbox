package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.d */
/* compiled from: PG */
public final class C117358d implements C117356b {

    /* renamed from: a */
    public final Context f325790a;

    /* renamed from: b */
    private final C91189au f325791b;

    /* renamed from: c */
    private final C60888db f325792c;

    /* renamed from: d */
    private final C86124t f325793d;

    /* renamed from: e */
    private final C58974d f325794e;

    public C117358d(Context context, C91189au auVar, C86124t tVar, C90851k kVar, C83564a aVar) {
        this.f325790a = context;
        this.f325791b = auVar;
        this.f325793d = tVar;
        this.f325792c = kVar.mo85208a("backgroundExecutor");
        this.f325794e = aVar.mo76900a("CalCardConverter");
    }

    /* renamed from: a */
    public final C60870cx mo103276a(C83802r rVar) {
        ((C58970a) ((C58970a) this.f325794e.mo56225c()).mo56372aa(33088)).mo56386p("Calendars do not have chips conversion");
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: b */
    public final C60870cx mo103277b(C92113i iVar) {
        return C60922j.m93044g(C92025g.m151036e(iVar, this.f325792c, this.f325791b, this.f325793d), new C117357c(this), this.f325792c);
    }
}
