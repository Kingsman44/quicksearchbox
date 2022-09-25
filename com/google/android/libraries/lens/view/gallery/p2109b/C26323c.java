package com.google.android.libraries.lens.view.gallery.p2109b;

import android.os.Build;
import android.view.View;
import com.google.android.libraries.lens.view.gallery.p2109b.C26329i;
import com.google.android.libraries.lens.view.onboarding.C27473af;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.gallery.b.c */
/* compiled from: PG */
public final /* synthetic */ class C26323c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26329i f71558a;

    public /* synthetic */ C26323c(C26329i iVar) {
        this.f71558a = iVar;
    }

    public final void onClick(View view) {
        C26329i iVar = this.f71558a;
        iVar.f71567d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (!((C27473af) iVar.f71571h.mo3842a()).mo33010b()) {
            C47393f.m84236g(new C26329i.C26330a(), iVar.f71564a);
            if (Build.VERSION.SDK_INT < 30) {
                C25504aj ajVar = iVar.f71568e;
                if (!ajVar.mo30536f(ajVar.mo30532b())) {
                    C25504aj ajVar2 = iVar.f71568e;
                    if (!ajVar2.mo30537g(ajVar2.mo30532b())) {
                        C25504aj ajVar3 = iVar.f71568e;
                        ajVar3.mo30533c(ajVar3.mo30532b(), C26326f.f71561a, 108462);
                        iVar.f71573j.mo30361q();
                    }
                }
            }
        }
    }
}
