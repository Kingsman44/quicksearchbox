package com.google.apps.tiktok.account.data.manager;

import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47574by;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47841fv;
import java.util.WeakHashMap;

/* renamed from: com.google.apps.tiktok.account.data.manager.cf */
/* compiled from: PG */
public final /* synthetic */ class C46287cf implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C46293cl f121268a;

    /* renamed from: b */
    public final /* synthetic */ C46291cj f121269b;

    public /* synthetic */ C46287cf(C46293cl clVar, C46291cj cjVar) {
        this.f121268a = clVar;
        this.f121269b = cjVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C46293cl clVar = this.f121268a;
        C46291cj cjVar = this.f121269b;
        WeakHashMap weakHashMap = C47831fm.f123851a;
        cjVar.f121271a = cVar;
        C47770dh dhVar = clVar.f121273b;
        Context context = clVar.f121272a;
        Intent intent = clVar.f121274c;
        C47841fv fvVar = new C47841fv(C47831fm.m85011f());
        synchronized (cjVar.f123873c) {
            cjVar.f123875e = dhVar;
            cjVar.f123874d = fvVar;
        }
        try {
            boolean w = C47810es.m84983w(context, intent, cjVar.f123872b);
            C19559g.m37302a().postDelayed(fvVar, 5000);
            if (w) {
                return "Binding to service";
            }
            cVar.mo5439d(new SecurityException());
            return "Binding failed";
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
