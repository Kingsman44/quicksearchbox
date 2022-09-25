package com.google.android.libraries.lens.view.p2092c;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25266e;
import com.google.android.libraries.lens.view.p2067ak.C25267f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.lens.p4707j.C62505ea;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.c.l */
/* compiled from: PG */
public final /* synthetic */ class C25716l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25720p f69919a;

    public /* synthetic */ C25716l(C25720p pVar) {
        this.f69919a = pVar;
    }

    public final void run() {
        C25720p pVar = this.f69919a;
        if (pVar.f69933i && pVar.f69935k.f70642a.f70649b != C25980d.TRANSLATE) {
            AccountId accountId = pVar.f69926b;
            C25707c cVar = new C25707c();
            C68324h.m98669f(cVar);
            C47247a.m84047b(cVar, accountId);
            pVar.mo30854h(R.id.lens_overlay, cVar, "AppShortcutBannerFragment");
            pVar.f69932h = false;
            C25266e eVar = (C25266e) pVar.f69929e.mo30348d().toBuilder();
            long b = pVar.f69930f.mo26870b();
            eVar.copyOnWrite();
            ((C25267f) eVar.instance).f68741d = b;
            C62505ea eaVar = C62505ea.SURFACE_UNSPECIFIED;
            if (pVar.mo30850g() - 1 != 0) {
                C25225bd bdVar = pVar.f69929e;
                int i = ((C25267f) eVar.instance).f68738a;
                eVar.copyOnWrite();
                ((C25267f) eVar.instance).f68738a = i + 1;
                bdVar.mo30354j((C25267f) eVar.build());
                return;
            }
            C25225bd bdVar2 = pVar.f69929e;
            int i2 = ((C25267f) eVar.instance).f68739b;
            eVar.copyOnWrite();
            ((C25267f) eVar.instance).f68739b = i2 + 1;
            bdVar2.mo30354j((C25267f) eVar.build());
        }
    }
}
