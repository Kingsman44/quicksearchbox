package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110333as;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110338ax;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110340az;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;
import com.google.common.base.C58833ax;
import com.google.p4715m.p4716a.p4720b.p4721a.C62682j;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.s */
/* compiled from: PG */
public final /* synthetic */ class C110221s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110224v f307127a;

    public /* synthetic */ C110221s(C110224v vVar) {
        this.f307127a = vVar;
    }

    public final void onClick(View view) {
        C110224v vVar = this.f307127a;
        C62682j jVar = (C62682j) vVar.f307138h.f307610b.mo3842a();
        if (jVar != null) {
            C58833ax a = vVar.f307133c.mo77278a();
            C73845bq bqVar = (C73845bq) vVar.f307134d.mo6453a();
            if (!(!a.mo56113h() || bqVar == null || bqVar.mo65330d() == null)) {
                Set set = (Set) vVar.f307138h.f307611c.mo3842a();
                set.getClass();
                if (!set.isEmpty()) {
                    String str = ((Account) a.mo56107c()).name;
                    String d = bqVar.mo65330d();
                    d.getClass();
                    ((C110361bt) vVar.f307132b.mo27525b()).mo98590g(str, d, true);
                    String str2 = ((Account) a.mo56107c()).name;
                    String d2 = bqVar.mo65330d();
                    d2.getClass();
                    ((C110361bt) vVar.f307132b.mo27525b()).mo98589f(str2, d2, true);
                }
            }
            C110340az azVar = vVar.f307135e;
            Set set2 = (Set) vVar.f307138h.f307611c.mo3842a();
            set2.getClass();
            azVar.f307550i.mo28211k(azVar.f307549h.mo28202b("build update", new C110333as(azVar, jVar, set2)), "save albums", new C110338ax());
            vVar.mo77318iT().mo77312a();
        }
    }
}
