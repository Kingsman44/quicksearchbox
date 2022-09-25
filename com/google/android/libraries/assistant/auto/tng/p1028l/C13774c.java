package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.c */
/* compiled from: PG */
final class C13774c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f41962a;

    /* renamed from: b */
    final /* synthetic */ C13874e f41963b;

    /* renamed from: c */
    final /* synthetic */ int f41964c;

    public C13774c(C13874e eVar, int i, boolean z) {
        this.f41963b = eVar;
        this.f41964c = i;
        this.f41962a = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C13874e eVar = this.f41963b;
        int i = this.f41964c;
        boolean z = this.f41962a;
        if (eVar.f42279b.mo56113h()) {
            ((C13876g) eVar.f42279b.mo56107c()).mo20345a(obj, i, z ? C51209d.SPOKEN : C51209d.CLICKED_SUGGESTION);
        }
    }
}
