package com.google.android.libraries.lens.view.gallery;

import android.support.p031v4.app.C0154a;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gallery.p2111d.C26368n;
import com.google.android.libraries.lens.view.gallery.p2112e.C26418k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.gallery.aj */
/* compiled from: PG */
final class C26309aj implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C26299ac f71526a;

    public C26309aj(C26299ac acVar) {
        this.f71526a = acVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C26368n nVar = (C26368n) bVar;
        C26299ac acVar = this.f71526a;
        AccountId accountId = acVar.f71494b;
        String str = nVar.f71724a.f71837d;
        C26320b bVar2 = new C26320b();
        C68324h.m98669f(bVar2);
        C47247a.m84047b(bVar2, accountId);
        C47243l.m84040b(bVar2, str);
        C0154a aVar = new C0154a(acVar.f71495c.getChildFragmentManager());
        aVar.mo691x(R.anim.gallery_section_slide_in, R.anim.gallery_section_slide_out, 0, 0);
        aVar.mo511h(R.id.lens_gallery, bVar2, "expanded_gallery_tag", 1);
        aVar.mo509f();
        View view = acVar.f71472D;
        view.getClass();
        view.animate().translationX(((float) (-acVar.f71472D.getWidth())) * 0.25f).setDuration(300).start();
        View view2 = acVar.f71475G;
        view2.getClass();
        view2.bringToFront();
        C26418k kVar = acVar.f71476H;
        kVar.getClass();
        kVar.mo31624b(bVar2.mo17754z().mo31625a());
        acVar.mo31508h(false);
        return C47392e.m84229a(new C26315ap(nVar.f71724a.mo31602b(acVar.f71495c.getContext())));
    }
}
