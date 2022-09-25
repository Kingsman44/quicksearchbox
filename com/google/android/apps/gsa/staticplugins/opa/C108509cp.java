package com.google.android.apps.gsa.staticplugins.opa;

import android.view.MenuItem;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52533vg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cp */
/* compiled from: PG */
final class C108509cp implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C52533vg f301917a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f301918b;

    public C108509cp(C109040fj fjVar, C52533vg vgVar) {
        this.f301918b = fjVar;
        this.f301917a = vgVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C51016dg dgVar;
        C51016dg dgVar2;
        C52533vg vgVar = this.f301917a;
        if (vgVar.f137893b == 2) {
            dgVar = (C51016dg) vgVar.f137894c;
        } else {
            dgVar = C51016dg.f132827g;
        }
        if ((dgVar.f132829a & 1) != 0) {
            C109040fj fjVar = this.f301918b;
            C52533vg vgVar2 = this.f301917a;
            if (vgVar2.f137893b == 2) {
                dgVar2 = (C51016dg) vgVar2.f137894c;
            } else {
                dgVar2 = C51016dg.f132827g;
            }
            fjVar.mo97443aE(dgVar2);
        } else {
            C52533vg vgVar3 = this.f301917a;
            if (vgVar3.f137893b == 3) {
                this.f301918b.mo97454aP((String) vgVar3.f137894c);
            } else {
                C59104x c = C109040fj.f303210a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ChatUiController");
                ((C59052c) ((C59052c) c).mo56372aa(22592)).mo56389s("Unsupported MenuItem %s", this.f301917a.f137895d);
                return false;
            }
        }
        return true;
    }
}
