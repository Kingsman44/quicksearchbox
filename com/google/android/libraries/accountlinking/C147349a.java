package com.google.android.libraries.accountlinking;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.libraries.accountlinking.activity.AccountLinkingActivity;
import com.google.android.libraries.accountlinking.activity.C147394v;
import com.google.android.libraries.accountlinking.activity.C147395w;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.p3562ao.p3563a.p3568d.C45532ac;
import com.google.p3562ao.p3563a.p3568d.C45535af;
import com.google.p3562ao.p3563a.p3568d.C45549at;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.accountlinking.a */
/* compiled from: PG */
public final /* synthetic */ class C147349a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C147429g f397747a;

    /* renamed from: b */
    public final /* synthetic */ Account f397748b;

    /* renamed from: c */
    public final /* synthetic */ String f397749c;

    /* renamed from: d */
    public final /* synthetic */ int f397750d;

    /* renamed from: e */
    public final /* synthetic */ Set f397751e;

    /* renamed from: f */
    public final /* synthetic */ Set f397752f;

    /* renamed from: g */
    public final /* synthetic */ boolean f397753g;

    public /* synthetic */ C147349a(C147429g gVar, Account account, String str, int i, Set set, Set set2, boolean z) {
        this.f397747a = gVar;
        this.f397748b = account;
        this.f397749c = str;
        this.f397750d = i;
        this.f397751e = set;
        this.f397752f = set2;
        this.f397753g = z;
    }

    public final Object apply(Object obj) {
        C147429g gVar = this.f397747a;
        Account account = this.f397748b;
        String str = this.f397749c;
        int i = this.f397750d;
        Set set = this.f397751e;
        Set set2 = this.f397752f;
        boolean z = this.f397753g;
        C45549at atVar = (C45549at) obj;
        C147394v vVar = new C147394v();
        vVar.f397876c = account;
        vVar.f397882i = str;
        vVar.f397878e = i;
        ArrayList arrayList = new ArrayList();
        if (atVar.f119043e != null) {
            arrayList.add(C147434l.APP_FLIP);
        }
        if (!(atVar.f119040b == null && atVar.f119041c == null)) {
            arrayList.add(C147434l.STREAMLINED_LINK_ACCOUNT);
        }
        if (atVar.f119039a != null) {
            arrayList.add(C147434l.WEB_OAUTH);
        }
        vVar.f397883j = C58485gu.m89842j(arrayList);
        C147431i iVar = gVar.f397957d;
        vVar.f397880g = iVar.f397972f;
        vVar.f397881h = iVar.f397973g;
        String str2 = iVar.f397970d;
        vVar.f397879f = null;
        vVar.f397875b = C58528ij.m90006F(set);
        vVar.f397885l = C58528ij.m90006F(set2);
        vVar.f397884k = atVar;
        vVar.f397891r = gVar.f397957d.f397974h;
        C45532ac acVar = atVar.f119043e;
        if (acVar != null) {
            vVar.f397874a = C58528ij.m90006F(new HashSet(acVar.f119015c));
        }
        if (atVar.f119044f != null) {
            ArrayList arrayList2 = new ArrayList();
            C58528ij ijVar = gVar.f397957d.f397968b;
            if (ijVar != null) {
                C45535af afVar = atVar.f119044f;
                if (afVar == null) {
                    afVar = C45535af.f119016b;
                }
                C58431eu g = C58431eu.m89654f(afVar.f119018a).mo55247g(C147427e.f397952a);
                Objects.requireNonNull(ijVar);
                g.mo55246e(new C147428f(ijVar)).mo55249i(arrayList2);
            }
            vVar.f397888o = C58485gu.m89842j(arrayList2);
        }
        C58485gu guVar = gVar.f397957d.f397969c;
        if (guVar != null) {
            vVar.f397890q = C58485gu.m89842j(guVar);
        }
        if (z) {
            vVar.f397886m = true;
        }
        Intent intent = new Intent(gVar.f397956c, AccountLinkingActivity.class);
        intent.putExtras(new C147395w(vVar).mo124153a());
        return intent;
    }
}
