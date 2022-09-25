package com.google.android.libraries.search.integrations.p3013a.p3014a;

import com.google.android.libraries.p1704e.C20675a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.integrations.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C38485c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f101831a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f101832b;

    public /* synthetic */ C38485c(C60870cx cxVar, C60870cx cxVar2) {
        this.f101831a = cxVar;
        this.f101832b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f101831a;
        C60870cx cxVar2 = this.f101832b;
        String str = (String) C60856cj.m92909r(cxVar);
        Optional optional = (Optional) C60856cj.m92909r(cxVar2);
        if (str == null) {
            ((C59052c) ((C59052c) C38487e.f101834a.mo56226d()).mo56372aa(53112)).mo56386p("Couldn't calculate ClientInstanceId, no account name");
        }
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C38487e.f101834a.mo56226d()).mo56372aa(53111)).mo56386p("Couldn't calculate ClientInstanceId, no AndroidId");
            return Optional.empty();
        }
        try {
            String a = C20675a.m38858a(str, (String) optional.get());
            if (a != null) {
                return Optional.m71637of(a);
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C38487e.f101834a.mo56225c()).mo56382g(e)).mo56372aa(53110)).mo56386p("Couldn't calculate ClientInstanceId");
        }
        return Optional.empty();
    }
}
