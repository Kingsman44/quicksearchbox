package com.google.android.libraries.surveys.internal.p3325d.p3326a;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.surveys.internal.p3325d.p3327b.C43047b;
import com.google.android.libraries.surveys.internal.p3325d.p3327b.C43048c;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4281bu.p4282a.C56497ah;
import com.google.p4281bu.p4282a.C56499aj;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56580f;
import com.google.p4281bu.p4282a.C56582h;
import com.google.protobuf.C62910ar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.surveys.internal.d.a.e */
/* compiled from: PG */
final class C43042e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C56580f f112583a;

    /* renamed from: b */
    final /* synthetic */ C43060i f112584b;

    /* renamed from: c */
    final /* synthetic */ C43043f f112585c;

    public C43042e(C43043f fVar, C56580f fVar2, C43060i iVar) {
        this.f112585c = fVar;
        this.f112583a = fVar2;
        this.f112584b = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
        this.f112585c.mo46075g(2);
        this.f112585c.mo46065c();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Runnable runnable;
        String str;
        C56582h hVar = (C56582h) obj;
        this.f112585c.mo46065c();
        C43043f fVar = this.f112585c;
        C56580f fVar2 = this.f112583a;
        C43060i iVar = this.f112584b;
        if (hVar == null) {
            Log.e("SurveyNetworkConnection", "Survey trigger response was null for trigger id: ".concat(String.valueOf(fVar.f112600b)));
            return;
        }
        C56532bp bpVar = hVar.f151072b;
        if (bpVar == null) {
            bpVar = C56532bp.f150963g;
        }
        if (bpVar.f150969e.size() == 0) {
            fVar.mo46075g(3);
            return;
        }
        int i = C43066o.f112626a;
        if (fVar.f112603e != null) {
            C56532bp bpVar2 = hVar.f151072b;
            if (bpVar2 == null) {
                bpVar2 = C56532bp.f150963g;
            }
            C56499aj ajVar = bpVar2.f150967c;
            if (ajVar == null) {
                ajVar = C56499aj.f150905e;
            }
            C56497ah ahVar = ajVar.f150907a;
            if (ahVar == null) {
                ahVar = C56497ah.f150894c;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C62910ar arVar = ahVar.f150896a;
            if (arVar == null) {
                arVar = C62910ar.f169858c;
            }
            long millis = timeUnit.toMillis(arVar.f169860a);
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            C62910ar arVar2 = ahVar.f150896a;
            if (arVar2 == null) {
                arVar2 = C62910ar.f169858c;
            }
            long millis2 = millis + timeUnit2.toMillis((long) arVar2.f169861b);
            Handler handler = fVar.f112604f;
            if (millis2 < 100) {
                runnable = new C43047b(fVar, hVar);
            } else {
                runnable = new C43048c(fVar, millis2, hVar);
            }
            handler.post(runnable);
            Context context = fVar.f112599a;
            if (TextUtils.isEmpty(fVar.f112601c)) {
                str = null;
            } else {
                str = fVar.f112601c;
            }
            C43059h.m75971b(fVar2, hVar, iVar, context, str);
            return;
        }
        Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
    }
}
