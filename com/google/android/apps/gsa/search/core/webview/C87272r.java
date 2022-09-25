package com.google.android.apps.gsa.search.core.webview;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.webview.r */
/* compiled from: PG */
public final /* synthetic */ class C87272r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C87273s f235721a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f235722b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f235723c;

    /* renamed from: d */
    public final /* synthetic */ String f235724d;

    public /* synthetic */ C87272r(C87273s sVar, C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f235721a = sVar;
        this.f235722b = cxVar;
        this.f235723c = cxVar2;
        this.f235724d = str;
    }

    public final Object call() {
        C87273s sVar = this.f235721a;
        C60870cx cxVar = this.f235722b;
        C60870cx cxVar2 = this.f235723c;
        String str = this.f235724d;
        try {
            C60856cj.m92909r(cxVar);
            C60856cj.m92909r(cxVar2);
            boolean z = false;
            if (((Boolean) C60856cj.m92909r(cxVar)).booleanValue() && ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
                z = true;
            }
            sVar.mo80919a(str, z);
            return null;
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C87273s.f235725a.mo56226d()).mo56382g(e)).mo56372aa(9516)).mo56386p("Couldn't get location state.");
            sVar.mo80919a(str, true);
            return null;
        }
    }
}
