package com.google.android.apps.gsa.staticplugins.p7554bs.p7556b;

import com.google.android.libraries.lens.view.p2067ak.C25198ad;
import com.google.android.libraries.lens.view.p2067ak.C25199ae;
import com.google.android.libraries.lens.view.p2067ak.C25229bh;
import com.google.android.libraries.lens.view.p2067ak.C25232bk;
import com.google.android.libraries.lens.view.p2067ak.C25233bl;
import com.google.android.libraries.lens.view.p2067ak.C25256ch;
import com.google.android.libraries.lens.view.p2067ak.C25275n;
import com.google.android.libraries.lens.view.p2067ak.C25277p;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.b.e */
/* compiled from: PG */
public final /* synthetic */ class C96704e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96708i f270530a;

    /* renamed from: b */
    public final /* synthetic */ C25199ae f270531b;

    public /* synthetic */ C96704e(C96708i iVar, C25199ae aeVar) {
        this.f270530a = iVar;
        this.f270531b = aeVar;
    }

    public final Object apply(Object obj) {
        C96708i iVar = this.f270530a;
        C25198ad adVar = (C25198ad) new C96707h(this.f270531b).apply((C25229bh) obj).toBuilder();
        adVar.copyOnWrite();
        ((C25199ae) adVar.instance).f68628a = true;
        C58528ij b = C25256ch.m46636b(iVar.f270535a.getAll().keySet());
        if (!b.isEmpty()) {
            C25277p pVar = ((C25199ae) adVar.instance).f68638k;
            if (pVar == null) {
                pVar = C25277p.f68762g;
            }
            C25275n nVar = (C25275n) pVar.toBuilder();
            C58800sl lA = b.iterator();
            while (lA.hasNext()) {
                String str = (String) lA.next();
                boolean z = iVar.f270535a.getBoolean(C25256ch.m46639e(str), false);
                str.getClass();
                nVar.copyOnWrite();
                C25277p pVar2 = (C25277p) nVar.instance;
                C62995dn dnVar = pVar2.f68769f;
                if (!dnVar.f170058b) {
                    pVar2.f68769f = dnVar.mo58980a();
                }
                pVar2.f68769f.put(str, Boolean.valueOf(z));
            }
            adVar.copyOnWrite();
            C25277p pVar3 = (C25277p) nVar.build();
            pVar3.getClass();
            ((C25199ae) adVar.instance).f68638k = pVar3;
        }
        if (iVar.f270535a.contains("lens_should_request_places_permissions")) {
            C25233bl blVar = ((C25199ae) adVar.instance).f68639l;
            if (blVar == null) {
                blVar = C25233bl.f68683b;
            }
            C25232bk bkVar = (C25232bk) blVar.toBuilder();
            boolean z2 = iVar.f270535a.getBoolean("lens_should_request_places_permissions", true);
            bkVar.copyOnWrite();
            ((C25233bl) bkVar.instance).f68685a = !z2;
            adVar.copyOnWrite();
            C25233bl blVar2 = (C25233bl) bkVar.build();
            blVar2.getClass();
            ((C25199ae) adVar.instance).f68639l = blVar2;
        }
        return (C25199ae) adVar.build();
    }
}
