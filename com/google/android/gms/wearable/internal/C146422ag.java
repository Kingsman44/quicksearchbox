package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.wearable.C146413h;
import com.google.android.gms.wearable.C146414i;
import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: com.google.android.gms.wearable.internal.ag */
/* compiled from: PG */
public final class C146422ag extends C146414i {
    public C146422ag(Context context, C143846r rVar) {
        super(context, rVar);
    }

    /* renamed from: a */
    public final C146006ab mo123092a(PutDataRequest putDataRequest) {
        C143851w wVar = this.f389929D;
        C146417ab abVar = new C146417ab(wVar, putDataRequest);
        wVar.mo119159d(abVar);
        return C143918bg.m233957c(abVar, C146419ad.f395643a);
    }

    /* renamed from: b */
    public final void mo123093b(C146413h hVar) {
        IntentFilter[] intentFilterArr = {C146487cr.m238473a("com.google.android.gms.wearable.DATA_CHANGED")};
        C143784ce b = C143785cf.m233680b(hVar, this.f389927B, "DataListener");
        C143796cq cqVar = new C143796cq();
        cqVar.f389833c = b;
        cqVar.f389831a = new C146420ae(hVar, b, intentFilterArr);
        cqVar.f389832b = new C146421af(hVar);
        cqVar.f389836f = 24015;
        mo119291v(cqVar.mo119255a());
    }

    /* renamed from: c */
    public final void mo123094c(C146413h hVar) {
        C143782cc ccVar = C143785cf.m233680b(hVar, this.f389927B, "DataListener").f389806b;
        C143919bh.m233971n(ccVar, "Key must not be null");
        mo119292w(ccVar, 24005);
    }
}
