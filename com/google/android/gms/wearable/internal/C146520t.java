package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.common.internal.C143911b;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.wearable.C146408c;
import com.google.android.gms.wearable.C146409d;

/* renamed from: com.google.android.gms.wearable.internal.t */
/* compiled from: PG */
public final class C146520t extends C146409d {
    public C146520t(Context context, C143846r rVar) {
        super(context, rVar);
    }

    /* renamed from: a */
    public final C146006ab mo123084a(String str, int i) {
        C143851w wVar = this.f389929D;
        if (i != 0) {
            i = 1;
        }
        C146510j jVar = new C146510j(wVar, str, i);
        wVar.mo119159d(jVar);
        return C143918bg.m233957c(jVar, C146516p.f395713a);
    }

    /* renamed from: b */
    public final void mo123085b(C146408c cVar) {
        IntentFilter a = C146487cr.m238473a("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        a.addDataPath("/assistant/client_capability", 0);
        IntentFilter[] intentFilterArr = {a};
        C143784ce b = C143785cf.m233680b(cVar, this.f389927B, "CapabilityListener:/assistant/client_capability");
        C146519s sVar = new C146519s(cVar);
        C143796cq cqVar = new C143796cq();
        cqVar.f389833c = b;
        cqVar.f389831a = new C146517q(sVar, b, intentFilterArr);
        cqVar.f389832b = new C146518r(sVar);
        cqVar.f389836f = 24013;
        mo119291v(cqVar.mo119255a());
    }

    /* renamed from: c */
    public final void mo123086c(String str) {
        C143911b.m233948a(str);
        C143851w wVar = this.f389929D;
        C146511k kVar = new C146511k(wVar, str);
        wVar.mo119159d(kVar);
        C143918bg.m233956b(kVar);
    }

    /* renamed from: d */
    public final void mo123087d(C146408c cVar) {
        C143782cc ccVar = C143785cf.m233680b(cVar, this.f389927B, "CapabilityListener").f389806b;
        C143919bh.m233971n(ccVar, "Key must not be null");
        mo119292w(ccVar, 24003);
    }

    /* renamed from: e */
    public final void mo123088e(String str) {
        C143911b.m233948a(str);
        C143851w wVar = this.f389929D;
        C146512l lVar = new C146512l(wVar, str);
        wVar.mo119159d(lVar);
        C143918bg.m233956b(lVar);
    }
}
