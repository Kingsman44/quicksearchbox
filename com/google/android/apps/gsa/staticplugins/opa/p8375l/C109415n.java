package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.shared.d.l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a.C109369d;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a.C109370e;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8377b.C109400a;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8377b.C109403d;
import com.google.assistant.p4008y.p4009a.C53615x;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.n */
/* compiled from: PG */
public final /* synthetic */ class C109415n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C109422u f304718a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f304719b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f304720c;

    /* renamed from: d */
    public final /* synthetic */ int f304721d;

    /* renamed from: e */
    public final /* synthetic */ Resources f304722e;

    public /* synthetic */ C109415n(C109422u uVar, C60870cx cxVar, C60870cx cxVar2, int i, Resources resources) {
        this.f304718a = uVar;
        this.f304719b = cxVar;
        this.f304720c = cxVar2;
        this.f304721d = i;
        this.f304722e = resources;
    }

    public final Object call() {
        C109422u uVar = this.f304718a;
        C60870cx cxVar = this.f304719b;
        C60870cx cxVar2 = this.f304720c;
        int i = this.f304721d;
        Resources resources = this.f304722e;
        ArrayList arrayList = new ArrayList(((l) C60856cj.m92909r(cxVar)).b);
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        List list = null;
        if (axVar.mo56113h() && uVar.mo97820e((C53615x) axVar.mo56107c())) {
            list = new C109370e(new C109369d()).mo97811a(((C53615x) axVar.mo56107c()).f140724a);
        }
        if (list == null || list.isEmpty()) {
            ((C89859i) uVar.f304742h.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_EMPTY);
            list = C109422u.m182104f(resources);
        } else {
            ((C89859i) uVar.f304742h.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_SUCCESS);
        }
        if (!uVar.f304736b.mo79746e(C90037cp.f248497bY)) {
            int min = Math.min(list.size(), i);
            Collections.shuffle(list, new Random());
            return C58485gu.m89842j(list.subList(0, min));
        }
        List list2 = (List) Collection.EL.stream(list).filter(new C109417p(arrayList)).collect(Collectors.toList());
        if (list2.size() < i) {
            Collection.EL.stream(arrayList).forEach(new C109418q(list, list2));
            arrayList.clear();
        }
        List list3 = (List) Collection.EL.stream(list2).limit((long) i).collect(Collectors.toList());
        Collection.EL.stream(list3).forEach(new C109419r(arrayList));
        C90875ai.m148465b(C109409h.f304706a, ((C109403d) uVar.f304738d.mo27525b()).f304696a.mo46039a(new C109400a(arrayList), C60826bg.f164896a), uVar.f304737c, "updateSuggestionQueryIndex").mo85223a(C109410i.f304707a);
        return C58485gu.m89842j(list3);
    }
}
