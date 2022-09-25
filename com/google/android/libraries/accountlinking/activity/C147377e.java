package com.google.android.libraries.accountlinking.activity;

import android.accounts.Account;
import android.os.Bundle;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.accountlinking.C147433k;
import com.google.android.libraries.accountlinking.C147435m;
import com.google.android.libraries.accountlinking.p10974a.p10976b.C147361h;
import com.google.common.p4522b.C58431eu;
import com.google.p3562ao.p3563a.p3568d.C45535af;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.accountlinking.activity.e */
/* compiled from: PG */
public final /* synthetic */ class C147377e implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ AccountLinkingActivity f397836a;

    public /* synthetic */ C147377e(AccountLinkingActivity accountLinkingActivity) {
        this.f397836a = accountLinkingActivity;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        AccountLinkingActivity accountLinkingActivity = this.f397836a;
        List list = (List) obj;
        C147395w wVar = accountLinkingActivity.f397828k;
        ArrayList arrayList = new ArrayList();
        C45535af afVar = wVar.f397901j.f119044f;
        if (afVar == null) {
            afVar = C45535af.f119016b;
        }
        C62971cq cqVar = afVar.f119018a;
        if (list.contains(C147433k.LINKING_INFO)) {
            arrayList.add((String) C58431eu.m89654f(cqVar).mo55246e(C147373a.f397832a).mo55247g(C147374b.f397833a).mo55244a().mo56107c());
        }
        if (list.contains(C147433k.CAPABILITY_CONSENT)) {
            arrayList.add((String) C58431eu.m89654f(cqVar).mo55246e(C147375c.f397834a).mo55247g(C147374b.f397833a).mo55244a().mo56107c());
        }
        Account account = wVar.f397893b;
        int i = wVar.f397908q;
        C147361h hVar = new C147361h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putStringArray("data_usage_notice_urls", (String[]) arrayList.toArray(new String[0]));
        String a = C147435m.m240361a(i);
        if (i != 0) {
            bundle.putString("gal_color_scheme", a);
            hVar.setArguments(bundle);
            accountLinkingActivity.mo124141j(hVar, true);
            return;
        }
        throw null;
    }
}
