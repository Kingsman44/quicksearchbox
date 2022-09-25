package com.google.android.libraries.lens.view.onboarding;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.lens.view.p2078at.C25512ar;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.onboarding.ab */
/* compiled from: PG */
final class C27469ab implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27525w f75130a;

    public C27469ab(C27525w wVar) {
        this.f75130a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C25512ar arVar = (C25512ar) bVar;
        C27525w wVar = this.f75130a;
        if (wVar.f75293q) {
            wVar.f75293q = false;
            wVar.f75283g.mo19974a(C37194a.f98485av.mo40815i(C62722b.OK));
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", wVar.f75280d.getContext().getPackageName(), (String) null));
        wVar.f75282f.mo30556f(intent);
        return C47392e.f123115a;
    }
}
