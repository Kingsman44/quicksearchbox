package com.google.android.libraries.lens.view.gallery;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.lens.view.p2078at.C25512ar;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.libraries.lens.view.gallery.ai */
/* compiled from: PG */
final class C26308ai implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C26299ac f71525a;

    public C26308ai(C26299ac acVar) {
        this.f71525a = acVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C25512ar arVar = (C25512ar) bVar;
        C26299ac acVar = this.f71525a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", acVar.f71495c.getContext().getPackageName(), (String) null));
        acVar.f71497e.mo30556f(intent);
        return C47392e.f123115a;
    }
}
