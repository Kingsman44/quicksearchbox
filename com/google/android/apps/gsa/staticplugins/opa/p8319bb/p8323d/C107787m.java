package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107740s;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3910e.p3911a.C51194i;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.m */
/* compiled from: PG */
public final class C107787m {

    /* renamed from: a */
    public static final C59071e f299924a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.d.m");

    /* renamed from: b */
    public static final C58528ij f299925b = new C58759qy(C87739bu.STOP_SPEAKING);

    /* renamed from: c */
    public final C107733l f299926c;

    /* renamed from: d */
    public final C107932g f299927d;

    /* renamed from: e */
    public final C22871g f299928e;

    /* renamed from: f */
    public final C85005h f299929f;

    /* renamed from: g */
    public final C84352a f299930g;

    /* renamed from: h */
    public boolean f299931h;

    /* renamed from: i */
    public boolean f299932i;

    /* renamed from: j */
    private final C68214a f299933j;

    public C107787m(C107740s sVar, C107733l lVar, C107932g gVar, C22871g gVar2, C85005h hVar, C68214a aVar, C84352a aVar2) {
        sVar.mo96265b(new C107785k(this));
        this.f299926c = lVar;
        this.f299927d = gVar;
        this.f299928e = gVar2;
        this.f299929f = hVar;
        this.f299933j = aVar;
        this.f299930g = aVar2;
    }

    /* renamed from: a */
    public final boolean mo96283a(C51195j jVar) {
        if (((C108100a) this.f299933j.mo27525b()).mo96436a() != 0 || !((C108100a) this.f299933j.mo27525b()).mo96449n() || (jVar.f133266a & 4) == 0) {
            return false;
        }
        C51194i iVar = jVar.f133270e;
        if (iVar == null) {
            iVar = C51194i.f133258e;
        }
        return iVar.f133261b;
    }
}
