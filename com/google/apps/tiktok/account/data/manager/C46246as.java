package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46214i;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46226g;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.account.data.manager.as */
/* compiled from: PG */
public final /* synthetic */ class C46246as implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46247at f121226a;

    /* renamed from: b */
    public final /* synthetic */ C46243ap f121227b;

    /* renamed from: c */
    public final /* synthetic */ C46222c f121228c;

    public /* synthetic */ C46246as(C46247at atVar, C46243ap apVar, C46222c cVar) {
        this.f121226a = atVar;
        this.f121227b = apVar;
        this.f121228c = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        String str;
        C46247at atVar = this.f121226a;
        C46243ap apVar = this.f121227b;
        C46222c cVar = this.f121228c;
        ArrayList arrayList = new ArrayList();
        int a = apVar.mo50296a();
        C58480gp e = C58485gu.m89837e();
        char c = 0;
        for (int i = 0; i < a; i++) {
            if (apVar.f121218a.contains(C46243ap.m82506c(i, "created"))) {
                e.mo55395g(AccountId.m82057b(i));
            }
        }
        C58485gu f = e.mo55394f();
        int i2 = ((C58724pq) f).f156474d;
        int i3 = 0;
        while (i3 < i2) {
            AccountId accountId = (AccountId) f.get(i3);
            String[] strArr = new String[12];
            strArr[c] = "display_name";
            strArr[1] = "account_name";
            strArr[2] = "effective_gaia_id";
            strArr[3] = "gaia_id";
            strArr[4] = "profile_photo_url";
            strArr[5] = "is_managed_account";
            strArr[6] = "display_name";
            strArr[7] = "avatar_url";
            strArr[8] = "gaia_id";
            strArr[9] = "email_gaia_id";
            C58485gu guVar = f;
            strArr[10] = "logged_in";
            int i4 = i2;
            strArr[11] = "logged_out";
            C46247at atVar2 = atVar;
            C46222c cVar2 = cVar;
            int i5 = 0;
            while (i5 < 12) {
                apVar.f121219b.add(C46243ap.m82506c(accountId.mo50068a(), strArr[i5]));
                i5++;
                strArr = strArr;
                i3 = i3;
            }
            int i6 = i3;
            C46214i iVar = (C46214i) C46215j.f121154k.createBuilder();
            iVar.copyOnWrite();
            C46215j jVar = (C46215j) iVar.instance;
            jVar.f121156a |= 256;
            jVar.f121165j = "google";
            if (apVar.mo50298d(accountId, "is_managed_account")) {
                iVar.copyOnWrite();
                C46215j jVar2 = (C46215j) iVar.instance;
                jVar2.f121156a |= 64;
                jVar2.f121163h = true;
                String b = apVar.mo50297b(accountId, "account_name");
                iVar.copyOnWrite();
                C46215j jVar3 = (C46215j) iVar.instance;
                b.getClass();
                jVar3.f121156a |= 16;
                jVar3.f121161f = b;
                String b2 = apVar.mo50297b(accountId, "display_name");
                iVar.copyOnWrite();
                C46215j jVar4 = (C46215j) iVar.instance;
                b2.getClass();
                jVar4.f121156a |= 2;
                jVar4.f121158c = b2;
                String b3 = apVar.mo50297b(accountId, "effective_gaia_id");
                iVar.copyOnWrite();
                C46215j jVar5 = (C46215j) iVar.instance;
                b3.getClass();
                jVar5.f121156a |= 1;
                jVar5.f121157b = b3;
                String b4 = apVar.mo50297b(accountId, "gaia_id");
                iVar.copyOnWrite();
                C46215j jVar6 = (C46215j) iVar.instance;
                b4.getClass();
                jVar6.f121156a |= 128;
                jVar6.f121164i = b4;
                String b5 = apVar.mo50297b(accountId, "avatar_url");
                if (b5 != null) {
                    iVar.copyOnWrite();
                    C46215j jVar7 = (C46215j) iVar.instance;
                    jVar7.f121156a |= 32;
                    jVar7.f121162g = b5;
                }
                c = 0;
            } else {
                String b6 = apVar.mo50297b(accountId, "account_name");
                iVar.copyOnWrite();
                C46215j jVar8 = (C46215j) iVar.instance;
                b6.getClass();
                jVar8.f121156a |= 16;
                jVar8.f121161f = b6;
                int i7 = 2;
                c = 0;
                String[] strArr2 = {"display_name", "account_name"};
                int i8 = 0;
                while (true) {
                    if (i8 >= i7) {
                        str = null;
                        break;
                    }
                    str = apVar.mo50297b(accountId, strArr2[i8]);
                    if (str != null) {
                        break;
                    }
                    i8++;
                    i7 = 2;
                }
                iVar.copyOnWrite();
                C46215j jVar9 = (C46215j) iVar.instance;
                str.getClass();
                jVar9.f121156a |= 2;
                jVar9.f121158c = str;
                String b7 = apVar.mo50297b(accountId, "gaia_id");
                iVar.copyOnWrite();
                C46215j jVar10 = (C46215j) iVar.instance;
                b7.getClass();
                jVar10.f121156a |= 1;
                jVar10.f121157b = b7;
                String b8 = apVar.mo50297b(accountId, "profile_photo_url");
                if (b8 != null) {
                    iVar.copyOnWrite();
                    C46215j jVar11 = (C46215j) iVar.instance;
                    jVar11.f121156a |= 32;
                    jVar11.f121162g = b8;
                }
            }
            boolean d = apVar.mo50298d(accountId, "logged_in");
            boolean d2 = apVar.mo50298d(accountId, "logged_out");
            C46226g gVar = (C46226g) C46227h.f121183e.createBuilder();
            int a2 = accountId.mo50068a();
            gVar.copyOnWrite();
            C46227h hVar = (C46227h) gVar.instance;
            hVar.f121185a |= 1;
            hVar.f121186b = a2;
            gVar.copyOnWrite();
            C46227h hVar2 = (C46227h) gVar.instance;
            C46215j jVar12 = (C46215j) iVar.build();
            jVar12.getClass();
            hVar2.f121187c = jVar12;
            hVar2.f121185a |= 2;
            int i9 = d ? 2 : d2 ? 3 : 1;
            gVar.copyOnWrite();
            C46227h hVar3 = (C46227h) gVar.instance;
            hVar3.f121188d = i9 - 1;
            hVar3.f121185a |= 4;
            arrayList.add(C60856cj.m92900i((C46227h) gVar.build()));
            i3 = i6 + 1;
            atVar = atVar2;
            cVar = cVar2;
            f = guVar;
            i2 = i4;
        }
        C46222c cVar3 = cVar;
        return C60856cj.m92892a(arrayList).mo57334a(C47810es.m84978r(new C46245ar(cVar, apVar, arrayList)), atVar.f121229a);
    }
}
