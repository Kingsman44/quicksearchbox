package com.google.android.libraries.lens.view.session.ondevice;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.e */
/* compiled from: PG */
public final /* synthetic */ class C27967e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f76127a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f76128b;

    public /* synthetic */ C27967e(C60870cx cxVar, C60870cx cxVar2) {
        this.f76127a = cxVar;
        this.f76128b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f76127a;
        C60870cx cxVar2 = this.f76128b;
        boolean z = false;
        try {
            boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
            boolean allMatch = Collection.EL.stream((List) C60856cj.m92909r(cxVar2)).allMatch(C27926c.f76075a);
            ((C58970a) ((C58970a) C27968f.f76129a.mo56224b()).mo56372aa(49959)).mo56358K("HintContent: codePresent: %b, modelsPresent: %b", booleanValue, allMatch);
            if (booleanValue && allMatch) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) C27968f.f76129a.mo56226d()).mo56382g(e)).mo56372aa(49960)).mo56386p("codeCheckFuture or modelCheckFuture inaccessible");
            return false;
        }
    }
}
