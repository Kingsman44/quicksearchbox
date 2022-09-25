package com.google.android.libraries.onegoogle.accountmenu.features.accountmessages;

import android.view.View;
import com.google.android.gms.p10815k.C144408h;
import com.google.android.libraries.onegoogle.account.p2348d.C30171a;
import com.google.android.libraries.onegoogle.common.C30923j;
import com.google.p4017at.p4049f.p4050a.p4051a.p4052a.C53933b;
import com.google.p4017at.p4049f.p4050a.p4051a.p4052a.C53935d;
import com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a.C53937b;
import com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a.C53941f;
import com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a.C53943h;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.accountmessages.a */
/* compiled from: PG */
public final /* synthetic */ class C30509a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C144408h f82404a;

    public /* synthetic */ C30509a(C144408h hVar) {
        this.f82404a = hVar;
    }

    public final void onClick(View view) {
        C144408h hVar = this.f82404a;
        if (hVar != null) {
            C53943h hVar2 = hVar.f390994b;
            if (hVar2 == null) {
                hVar2 = C53943h.f141535c;
            }
            C53941f fVar = hVar2.f141538b;
            if (fVar == null) {
                fVar = C53941f.f141530c;
            }
            C53937b bVar = fVar.f141533b;
            if (bVar == null) {
                bVar = C53937b.f141525b;
            }
            C53935d dVar = bVar.f141527a;
            if (dVar == null) {
                dVar = C53935d.f141520d;
            }
            if ((dVar.f141522a & 1) == 0) {
                C53933b bVar2 = (C53933b) dVar.toBuilder();
                bVar2.copyOnWrite();
                C53935d dVar2 = (C53935d) bVar2.instance;
                dVar2.f141522a |= 1;
                dVar2.f141523b = 400;
                dVar = (C53935d) bVar2.build();
            }
            C30171a.m56063b(C30923j.m57715a(view.getContext()), hVar.f390993a, dVar);
        }
    }
}
