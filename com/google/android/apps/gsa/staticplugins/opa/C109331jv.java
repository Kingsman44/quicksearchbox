package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80189aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80191al;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7176n.C91067j;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108344ff;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108345fg;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jv */
/* compiled from: PG */
public final /* synthetic */ class C109331jv implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C109332jw f304552a;

    public /* synthetic */ C109331jv(C109332jw jwVar) {
        this.f304552a = jwVar;
    }

    public final Object apply(Object obj) {
        int a;
        Intent intent;
        C109332jw jwVar = this.f304552a;
        C80189aj ajVar = (C80189aj) obj;
        if (!jwVar.f304555c.mo79746e(C90037cp.f248510bl) || (a = C80191al.m128092a(ajVar.f220016b)) == 0 || a == 1 || ajVar.f220017c) {
            return Optional.empty();
        }
        if (jwVar.f304555c.mo79746e(C90037cp.f248467av)) {
            intent = C91067j.m148771c(jwVar.f304555c);
        } else {
            Intent addFlags = new Intent().setClassName(jwVar.f304553a, "com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.PieActivity").addFlags(805896192);
            C80244ck ckVar = ajVar.f220018d;
            if (ckVar == null) {
                ckVar = C80244ck.f220137i;
            }
            intent = addFlags.putExtra("pie-ui-state", ckVar.toByteArray());
        }
        intent.getClass();
        Context context = (Context) ((C108345fg) jwVar.f304554b.mo27525b()).f301381a.mo17428b();
        context.getClass();
        return Optional.m71637of(new C108344ff(intent, context));
    }
}
