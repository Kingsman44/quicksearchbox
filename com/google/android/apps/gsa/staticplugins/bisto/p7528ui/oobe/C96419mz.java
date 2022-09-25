package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.IntentFilter;
import android.net.Uri;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.wearable.C146531n;
import com.google.android.gms.wearable.internal.C146461bs;
import com.google.android.gms.wearable.internal.C146462bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mz */
/* compiled from: PG */
public final /* synthetic */ class C96419mz implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C96428nh f269739a;

    /* renamed from: b */
    public final /* synthetic */ String f269740b = "/assistant/activate";

    /* renamed from: c */
    public final /* synthetic */ C96201ex f269741c;

    public /* synthetic */ C96419mz(C96428nh nhVar, C96201ex exVar) {
        this.f269739a = nhVar;
        this.f269741c = exVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C96428nh nhVar = this.f269739a;
        C96201ex exVar = this.f269741c;
        String str = this.f269740b;
        C146531n nVar = nhVar.f269755b;
        Uri build = new Uri.Builder().scheme("wear").authority("*").path(str).build();
        C1974i.m5319g(build, "uri must not be null");
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.MESSAGE_RECEIVED");
        if (build.getScheme() != null) {
            intentFilter.addDataScheme(build.getScheme());
        }
        if (build.getAuthority() != null) {
            intentFilter.addDataAuthority(build.getAuthority(), Integer.toString(build.getPort()));
        }
        if (build.getPath() != null) {
            intentFilter.addDataPath(build.getPath(), 1);
        }
        IntentFilter[] intentFilterArr = {intentFilter};
        C143784ce b = C143785cf.m233680b(exVar, nVar.f389927B, "MessageListener");
        C143796cq cqVar = new C143796cq();
        cqVar.f389833c = b;
        cqVar.f389831a = new C146461bs(exVar, b, intentFilterArr);
        cqVar.f389832b = new C146462bt(exVar);
        cqVar.f389836f = 24016;
        C146006ab v = nVar.mo119291v(cqVar.mo119255a());
        v.mo122499r(new C96427ng(cVar));
        v.mo122498q(new C96412ms(cVar));
        return v;
    }
}
