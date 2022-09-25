package com.google.android.libraries.lens.view.p2085ax.p2086a;

import com.google.android.libraries.lens.view.p2067ak.C25207am;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25272k;
import com.google.android.libraries.lens.view.p2067ak.C25274m;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.ax.a.d */
/* compiled from: PG */
public final /* synthetic */ class C25596d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C25598f f69634a;

    /* renamed from: b */
    public final /* synthetic */ int f69635b;

    public /* synthetic */ C25596d(C25598f fVar, int i) {
        this.f69634a = fVar;
        this.f69635b = i;
    }

    public final Object apply(Object obj) {
        C25598f fVar = this.f69634a;
        int i = this.f69635b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            fVar.f69644g = null;
        } else {
            if (fVar.f69638a.compareAndSet(false, true)) {
                C25225bd bdVar = fVar.f69640c;
                C25272k kVar = (C25272k) bdVar.mo30349e().toBuilder();
                kVar.copyOnWrite();
                ((C25274m) kVar.instance).f68754b = i + 1;
                bdVar.f68662a.mo30363c(new C25207am((C25274m) kVar.build()));
            }
            new C25597e(fVar, axVar).run();
        }
        return null;
    }
}
