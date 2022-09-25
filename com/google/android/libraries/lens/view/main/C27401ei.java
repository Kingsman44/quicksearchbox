package com.google.android.libraries.lens.view.main;

import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.view.filters.C25935c;
import com.google.android.libraries.lens.view.filters.C26012i;
import com.google.android.libraries.lens.view.gallery.C26314ao;
import com.google.android.libraries.lens.view.gallery.p2112e.C26416i;
import com.google.android.libraries.lens.view.p2082av.C25582f;
import com.google.android.libraries.lens.view.p2148l.C27221a;
import com.google.android.libraries.lens.view.p2148l.C27226f;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58833ax;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.main.ei */
/* compiled from: PG */
final class C27401ei implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27384dt f75038a;

    public C27401ei(C27384dt dtVar) {
        this.f75038a = dtVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C26314ao aoVar = (C26314ao) bVar;
        C27384dt dtVar = this.f75038a;
        dtVar.f75001u.mo19974a(C37194a.f98426P.mo40815i(C62722b.OK));
        C26416i iVar = dtVar.f74905aA;
        if (iVar != null) {
            iVar.mo31620d();
            dtVar.f74905aA = null;
        }
        if (aoVar.f71531b != null) {
            dtVar.f74905aA = new C26416i(aoVar.f71531b, (ImageView) dtVar.f74912aH.findViewById(R.id.lens_picked_image_hero));
        }
        C25582f fVar = dtVar.f74916aL;
        if (fVar != null) {
            fVar.setVisibility(4);
        }
        C25935c cVar = dtVar.mo32952q().f70725n;
        if (cVar != null) {
            cVar.mo17754z().mo31217c(false);
            C26012i a = cVar.mo17754z();
            a.f70692q = false;
            a.mo31219e();
        }
        C27226f i = C27228h.m50544i();
        C27221a aVar = (C27221a) i;
        aVar.f74417a = C58833ax.m90833j(aoVar.f71530a);
        i.mo32665d(aoVar.f71532c);
        aVar.f74420d = C58833ax.m90834k(C24226r.GALLERY);
        dtVar.f74928aX = i.mo32662a();
        dtVar.mo32926M();
        return C47392e.f123115a;
    }
}
