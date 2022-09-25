package com.google.android.libraries.search.location.p3029a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142910j;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.p10737a.p10738a.C142846ae;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.libraries.phenotype.client.C31654aj;
import java.io.IOException;
import java.util.concurrent.Callable;
import p5304e.p5305a.p5306a.p5390n.p5391a.p5392a.C68823a;

/* renamed from: com.google.android.libraries.search.location.a.az */
/* compiled from: PG */
public final /* synthetic */ class C38606az implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C38622bn f102039a;

    /* renamed from: b */
    public final /* synthetic */ HasCapabilitiesRequest f102040b;

    public /* synthetic */ C38606az(C38622bn bnVar, HasCapabilitiesRequest hasCapabilitiesRequest) {
        this.f102039a = bnVar;
        this.f102040b = hasCapabilitiesRequest;
    }

    public final Object call() {
        C146006ab abVar;
        int i;
        C38622bn bnVar = this.f102039a;
        HasCapabilitiesRequest hasCapabilitiesRequest = this.f102040b;
        try {
            Context context = bnVar.f102064l.f387822a;
            C143919bh.m233958a(context);
            C143919bh.m233958a(hasCapabilitiesRequest.f387642a);
            C143919bh.m233969l(hasCapabilitiesRequest.f387642a.name);
            C143919bh.m233965h("This call can involve network request. It is unsafe to call from main thread.");
            C31654aj.m58985d(context);
            if (C68823a.f184907a.mo6453a().mo60513b()) {
                i = C142914n.m231855c(context, hasCapabilitiesRequest);
            } else {
                if (C68823a.m99395d()) {
                    Bundle bundle = new Bundle();
                    C142914n.m231864l(context, bundle);
                    hasCapabilitiesRequest.f387644c = bundle;
                }
                if (C68823a.m99396e() && C142914n.m231865m(context, C68823a.m99394b().f178307a)) {
                    try {
                        Integer num = (Integer) C142914n.m231857e(new C142846ae(context).mo117781d(hasCapabilitiesRequest), "hasCapabilities ");
                        C142914n.m231870r(num);
                        i = num.intValue();
                    } catch (C143842n e) {
                        C142914n.m231863k(e, "hasCapabilities ");
                    }
                }
                i = ((Integer) C142914n.m231868p(context, C142914n.f387820d, new C142910j(hasCapabilitiesRequest))).intValue();
            }
            abVar = C146021aq.m237850d(Integer.valueOf(i));
        } catch (C142903e | IOException e2) {
            abVar = C146021aq.m237849c(e2);
        }
        return (Integer) abVar.mo122488g();
    }
}
