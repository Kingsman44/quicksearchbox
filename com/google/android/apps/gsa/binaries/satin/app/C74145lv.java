package com.google.android.apps.gsa.binaries.satin.app;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.assistant.settings.features.people.bs;
import com.google.android.apps.gsa.assistant.settings.features.people.cb;
import com.google.android.apps.gsa.assistant.settings.features.people.fq;
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

/* renamed from: com.google.android.apps.gsa.binaries.satin.app.lv */
/* compiled from: PG */
final class C74145lv implements C73872d {

    /* renamed from: a */
    private final aqy f206574a;

    /* renamed from: b */
    private final C73964bv f206575b;

    public C74145lv(aqy aqy, C73964bv bvVar) {
        this.f206574a = aqy;
        this.f206575b = bvVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo65348a(Fragment fragment) {
        bs bsVar = (bs) fragment;
        bsVar.a = (C91189au) this.f206574a.a.f202737ci.mo17428b();
        C73964bv bvVar = this.f206575b;
        bsVar.b = bvVar.f205563bL;
        bsVar.c = new cb((Activity) bvVar.f205710e.mo17428b(), (h) this.f206574a.a.f202853es.mo17428b(), (l) this.f206574a.a.f202833eY.mo17428b(), (ContentResolver) this.f206574a.h.mo17428b(), (C22871g) this.f206574a.aT.mo17428b());
        bsVar.d = new fq((Activity) this.f206575b.f205710e.mo17428b(), (l) this.f206574a.a.f202833eY.mo17428b(), (h) this.f206574a.a.f202853es.mo17428b(), mo69421b(), (ContentResolver) this.f206574a.h.mo17428b(), (C22871g) this.f206574a.aT.mo17428b(), new af((Resources) this.f206574a.hw.mo17428b(), (C90021c) this.f206574a.a.f202006C.mo17428b()), (C90021c) this.f206574a.a.f202006C.mo17428b());
        bsVar.e = (C90021c) this.f206574a.a.f202006C.mo17428b();
        bsVar.f = mo69421b();
        bsVar.g = (h) this.f206574a.a.f202853es.mo17428b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final n mo69421b() {
        return new n((ContentResolver) this.f206574a.h.mo17428b(), (m) this.f206574a.a.f202851eq.mo17428b(), (C86106b) this.f206574a.a.f203285n.mo17428b());
    }
}
