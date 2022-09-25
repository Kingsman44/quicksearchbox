package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40137i;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40142n;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40149u;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40247a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40252f;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.ag */
/* compiled from: PG */
public final /* synthetic */ class C40161ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40137i f105484a;

    /* renamed from: b */
    public final /* synthetic */ C40142n f105485b;

    public /* synthetic */ C40161ag(C40137i iVar, C40142n nVar) {
        this.f105484a = iVar;
        this.f105485b = nVar;
    }

    public final void run() {
        C40248b bVar;
        C40137i iVar = this.f105484a;
        C40142n nVar = this.f105485b;
        iVar.mo42247h();
        float f = ((C40247a) C40252f.m69867a(iVar.f105429j)).f105718b;
        if (iVar.f105433n) {
            float f2 = ((C40247a) C40252f.m69868b(iVar.f105429j)).f105717a;
            iVar.f105431l.mo42222c(new C40247a(((float) iVar.mo42241b()) + f2, f));
            bVar = iVar.mo42244e(f2, f);
        } else {
            iVar.f105431l.mo42222c(new C40247a((float) (-iVar.mo42241b()), f));
            bVar = iVar.mo42244e(0.0f, f);
        }
        iVar.mo42245f(C40137i.f105421b, bVar);
        C40149u uVar = iVar.f105424e;
        uVar.mo42255b(iVar, iVar.mo42242c(bVar), uVar.mo42254a());
        nVar.mo42250a(0.0f, 1.0f);
    }
}
