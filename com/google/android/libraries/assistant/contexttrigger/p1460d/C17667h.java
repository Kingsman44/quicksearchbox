package com.google.android.libraries.assistant.contexttrigger.p1460d;

import com.google.android.libraries.assistant.contexttrigger.C17742i;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.android.libraries.assistant.contexttrigger.p1462f.C17703ai;
import com.google.android.libraries.assistant.contexttrigger.p1462f.C17718j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.h */
/* compiled from: PG */
public final /* synthetic */ class C17667h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17672m f50811a;

    /* renamed from: b */
    public final /* synthetic */ C17692f f50812b;

    public /* synthetic */ C17667h(C17672m mVar, C17692f fVar) {
        this.f50811a = mVar;
        this.f50812b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C17672m mVar = this.f50811a;
        C17692f fVar = this.f50812b;
        ArrayList arrayList = new ArrayList();
        for (AccountId accountId : (Set) obj) {
            C17703ai b = C17718j.m35001b(mVar.f50821c, accountId);
            C17742i a = C17718j.m35000a(mVar.f50821c, accountId);
            C58480gp e = C58485gu.m89837e();
            arrayList.add(C47633f.m84733g(b.mo23444a(new C17669j(fVar, e))).mo51516i(new C17670k(a, e), mVar.f50820b));
        }
        return C60856cj.m92896e(arrayList);
    }
}
