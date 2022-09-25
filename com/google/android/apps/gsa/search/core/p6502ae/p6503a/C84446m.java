package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.global.C145911o;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.m */
/* compiled from: PG */
public final /* synthetic */ class C84446m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229807a;

    /* renamed from: b */
    public final /* synthetic */ String f229808b;

    /* renamed from: c */
    public final /* synthetic */ String f229809c;

    /* renamed from: d */
    public final /* synthetic */ boolean f229810d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f229811e;

    public /* synthetic */ C84446m(C84425ag agVar, String str, String str2, boolean z, Runnable runnable) {
        this.f229807a = agVar;
        this.f229808b = str;
        this.f229809c = str2;
        this.f229810d = z;
        this.f229811e = runnable;
    }

    public final void run() {
        C84425ag agVar = this.f229807a;
        String str = this.f229808b;
        String str2 = this.f229809c;
        boolean z = this.f229810d;
        Runnable runnable = this.f229811e;
        C84421ac acVar = agVar.f229720c;
        if (acVar.f229708b && acVar.f229707a.f229713d.f59932a.mo119133h()) {
            C84424af afVar = acVar.f229707a;
            try {
                C143840l lVar = C145891g.f394428a;
                C143851w wVar = afVar.f229712c;
                SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = new SetIncludeInGlobalSearchCall$Request();
                setIncludeInGlobalSearchCall$Request.f394467a = str;
                setIncludeInGlobalSearchCall$Request.f394468b = str2;
                setIncludeInGlobalSearchCall$Request.f394469c = z;
                SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response = (SetIncludeInGlobalSearchCall$Response) wVar.mo119159d(new C145911o(setIncludeInGlobalSearchCall$Request, wVar)).mo117317b(C84425ag.f229719b, TimeUnit.MILLISECONDS);
                if (!setIncludeInGlobalSearchCall$Response.f394470a.mo119097c()) {
                    C59104x c = C84425ag.f229718a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                    ((C59052c) ((C59052c) c).mo56372aa(9291)).mo56389s("Got error status from setIncludeInGlobalSearch: %s", setIncludeInGlobalSearchCall$Response.f394470a.f389622h);
                }
            } catch (RuntimeException e) {
                C59104x c2 = C84425ag.f229718a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(9292)).mo56386p("Exception when calling setIncludeInGlobalSearch");
            }
        } else if (runnable != null) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
