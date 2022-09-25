package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.C36690a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.o */
/* compiled from: PG */
public final /* synthetic */ class C36739o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C36745u f95733a;

    public /* synthetic */ C36739o(C36745u uVar) {
        this.f95733a = uVar;
    }

    public final void onClick(View view) {
        C36745u uVar = this.f95733a;
        uVar.f95750j.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(uVar.f95745e.requireView().findViewById(R.id.assistant_oobe_empty_action_button)));
        C46439e eVar = uVar.f95746f;
        C36690a aVar = uVar.f95747g;
        C36724ar arVar = uVar.f95744d.f95654f;
        if (arVar == null) {
            arVar = C36724ar.f95682d;
        }
        C46438d b = C46438d.m82810b(aVar.mo40334c(arVar));
        eVar.mo50428h(b.f121541a, (Object) null, uVar.f95751k);
        uVar.mo40364b();
    }
}
