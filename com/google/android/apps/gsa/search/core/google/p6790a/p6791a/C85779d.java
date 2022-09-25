package com.google.android.apps.gsa.search.core.google.p6790a.p6791a;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.moduleinstall.C143964e;
import com.google.android.gms.common.moduleinstall.internal.C143985s;
import com.google.android.gms.p10811h.C144351b;
import com.google.android.gms.tasks.C146006ab;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C85779d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C85781f f231930a;

    public /* synthetic */ C85779d(C85781f fVar) {
        this.f231930a = fVar;
    }

    public final Object apply(Object obj) {
        C85781f fVar = this.f231930a;
        C59052c cVar = (C59052c) C85781f.f231933a.mo56225c();
        cVar.mo56374ac(5, TimeUnit.SECONDS);
        ((C59052c) ((C59052c) cVar.mo56382g((Exception) obj)).mo56372aa(8004)).mo56386p("AGSA-C Failed to get home graph id");
        if (!fVar.f231935c.compareAndSet(false, true)) {
            return BuildConfig.FLAVOR;
        }
        ((C59052c) ((C59052c) C85781f.f231933a.mo56224b()).mo56372aa(8005)).mo56386p("Trying to trigger a force module installation.");
        C143985s sVar = new C143985s(fVar.f231934b);
        C85780e eVar = new C85780e(fVar, sVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C144351b.m234629a(fVar.f231934b));
        C146006ab b = sVar.mo119494b(new C143964e(arrayList, eVar, (Executor) null));
        b.mo122499r(C85777b.f231928a);
        b.mo122498q(C85778c.f231929a);
        return BuildConfig.FLAVOR;
    }
}
