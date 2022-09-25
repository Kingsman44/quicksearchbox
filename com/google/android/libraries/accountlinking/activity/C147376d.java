package com.google.android.libraries.accountlinking.activity;

import android.accounts.Account;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.accountlinking.C147434l;
import com.google.android.libraries.accountlinking.C147435m;
import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10974a.p10975a.C147352b;
import com.google.android.libraries.accountlinking.p10974a.p10977c.C147365c;
import com.google.android.libraries.accountlinking.p10974a.p10978d.C147371e;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p3562ao.p3563a.p3567c.C45528f;
import com.google.p3562ao.p3563a.p3568d.C45532ac;
import com.google.p3562ao.p3563a.p3568d.C45543an;
import com.google.p3562ao.p3563a.p3568d.C45545ap;
import com.google.protobuf.C62971cq;
import java.io.IOException;

/* renamed from: com.google.android.libraries.accountlinking.activity.d */
/* compiled from: PG */
public final /* synthetic */ class C147376d implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ AccountLinkingActivity f397835a;

    public /* synthetic */ C147376d(AccountLinkingActivity accountLinkingActivity) {
        this.f397835a = accountLinkingActivity;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        Fragment fragment;
        AccountLinkingActivity accountLinkingActivity = this.f397835a;
        C147434l lVar = (C147434l) obj;
        try {
            C147395w wVar = accountLinkingActivity.f397828k;
            C147434l lVar2 = C147434l.APP_FLIP;
            int ordinal = lVar.ordinal();
            if (ordinal == 0) {
                C45532ac acVar = wVar.f397901j.f119043e;
                if (acVar == null) {
                    acVar = C45532ac.f119011d;
                }
                C45528f fVar = acVar.f119013a;
                if (fVar == null) {
                    fVar = C45528f.f119003b;
                }
                C62971cq cqVar = fVar.f119005a;
                C58528ij ijVar = wVar.f397892a;
                C45532ac acVar2 = wVar.f397901j.f119043e;
                if (acVar2 == null) {
                    acVar2 = C45532ac.f119011d;
                }
                fragment = C147352b.m240260a(cqVar, ijVar, acVar2.f119014b);
            } else if (ordinal == 1 || ordinal == 2) {
                Account account = wVar.f397893b;
                C45543an anVar = wVar.f397901j.f119042d;
                if (anVar == null) {
                    anVar = C45543an.f119027b;
                }
                String str = anVar.f119029a;
                int i = wVar.f397908q;
                C147365c cVar = new C147365c();
                Bundle bundle = new Bundle();
                bundle.putParcelable("account", account);
                bundle.putString("flow_url", str);
                String a = C147435m.m240361a(i);
                if (i != 0) {
                    bundle.putString("gal_color_scheme", a);
                    cVar.setArguments(bundle);
                    fragment = cVar;
                } else {
                    throw null;
                }
            } else if (ordinal == 3) {
                C45545ap apVar = wVar.f397901j.f119039a;
                if (apVar == null) {
                    apVar = C45545ap.f119030c;
                }
                String str2 = apVar.f119032a;
                C45545ap apVar2 = wVar.f397901j.f119039a;
                if (apVar2 == null) {
                    apVar2 = C45545ap.f119030c;
                }
                fragment = C147371e.m240284a(str2, apVar2.f119033b);
            } else {
                ((C58970a) ((C58970a) AccountLinkingActivity.f397827j.mo56226d()).mo56372aa(42164)).mo56389s("Unrecognized flow: %s", lVar);
                throw new IllegalArgumentException("Unrecognized flow: ".concat(String.valueOf(String.valueOf(lVar))));
            }
            if (!lVar.equals(C147434l.STREAMLINED_LINK_ACCOUNT)) {
                if (!lVar.equals(C147434l.STREAMLINED_CREATE_ACCOUNT)) {
                    accountLinkingActivity.mo124141j(fragment, false);
                    return;
                }
            }
            accountLinkingActivity.mo124141j(fragment, true);
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) AccountLinkingActivity.f397827j.mo56226d()).mo56382g(e)).mo56372aa(42166)).mo56389s("Failed to create a fragment for flow \"%s\"", lVar);
            accountLinkingActivity.f397830m.f397826a.mo5706i(C147366d.m240280b(301));
        }
    }
}
