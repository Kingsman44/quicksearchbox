package com.google.android.apps.gsa.binaries.satin.app;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.assistant.settings.features.people.cb;
import com.google.android.apps.gsa.assistant.settings.features.people.fq;
import com.google.android.apps.gsa.assistant.settings.features.people.i;
import com.google.android.apps.gsa.assistant.settings.features.people.utils.af;
import com.google.android.apps.gsa.assistant.settings.features.people.utils.n;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73872d;
import com.google.android.apps.gsa.contacts.m;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.binaries.satin.app.am */
/* compiled from: PG */
final class C73930am implements C73872d {

    /* renamed from: a */
    private final aqy f197726a;

    /* renamed from: b */
    private final C73964bv f197727b;

    public C73930am(aqy aqy, C73964bv bvVar) {
        this.f197726a = aqy;
        this.f197727b = bvVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo65348a(Fragment fragment) {
        i iVar = (i) fragment;
        iVar.a = (C91189au) this.f197726a.a.f202737ci.mo17428b();
        iVar.b = new cb((Activity) this.f197727b.f205710e.mo17428b(), (h) this.f197726a.a.f202853es.mo17428b(), (l) this.f197726a.a.f202833eY.mo17428b(), (ContentResolver) this.f197726a.h.mo17428b(), (C22871g) this.f197726a.aT.mo17428b());
        iVar.c = new fq((Activity) this.f197727b.f205710e.mo17428b(), (l) this.f197726a.a.f202833eY.mo17428b(), (h) this.f197726a.a.f202853es.mo17428b(), new n((ContentResolver) this.f197726a.h.mo17428b(), (m) this.f197726a.a.f202851eq.mo17428b(), (C86106b) this.f197726a.a.f203285n.mo17428b()), (ContentResolver) this.f197726a.h.mo17428b(), (C22871g) this.f197726a.aT.mo17428b(), new af((Resources) this.f197726a.hw.mo17428b(), (C90021c) this.f197726a.a.f202006C.mo17428b()), (C90021c) this.f197726a.a.f202006C.mo17428b());
        iVar.d = this.f197727b.f205563bL;
        iVar.e = (C90021c) this.f197726a.a.f202006C.mo17428b();
    }
}
