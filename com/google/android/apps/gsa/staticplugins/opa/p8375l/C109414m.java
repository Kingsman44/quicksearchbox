package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import android.content.res.Resources;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.m */
/* compiled from: PG */
public final /* synthetic */ class C109414m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C109422u f304714a;

    /* renamed from: b */
    public final /* synthetic */ String f304715b;

    /* renamed from: c */
    public final /* synthetic */ int f304716c;

    /* renamed from: d */
    public final /* synthetic */ Resources f304717d;

    public /* synthetic */ C109414m(C109422u uVar, String str, int i, Resources resources) {
        this.f304714a = uVar;
        this.f304715b = str;
        this.f304716c = i;
        this.f304717d = resources;
    }

    public final C60870cx apply(Object obj) {
        C109422u uVar = this.f304714a;
        String str = this.f304715b;
        int i = this.f304716c;
        Resources resources = this.f304717d;
        List list = (List) obj;
        if (list.isEmpty()) {
            ((C89859i) uVar.f304742h.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_EMPTY);
            return uVar.mo97818c(str, i, resources);
        }
        Collections.shuffle(list);
        return C60856cj.m92900i((C58485gu) Collection.EL.stream(list).limit((long) Math.min(i, list.size())).collect(C58370cn.f155946a));
    }
}
