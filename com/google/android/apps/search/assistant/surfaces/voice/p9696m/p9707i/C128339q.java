package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b.C129124l;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.afb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.q */
/* compiled from: PG */
public final /* synthetic */ class C128339q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C128340r f352971a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f352972b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f352973c;

    /* renamed from: d */
    public final /* synthetic */ afb f352974d;

    public /* synthetic */ C128339q(C128340r rVar, C60870cx cxVar, C60870cx cxVar2, afb afb) {
        this.f352971a = rVar;
        this.f352972b = cxVar;
        this.f352973c = cxVar2;
        this.f352974d = afb;
    }

    public final Object call() {
        C128340r rVar = this.f352971a;
        C60870cx cxVar = this.f352972b;
        C60870cx cxVar2 = this.f352973c;
        afb afb = this.f352974d;
        C52070ec ecVar = (C52070ec) C60856cj.m92909r(cxVar);
        BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) C60856cj.m92909r(cxVar2);
        int i = afb.f134987b;
        String str = afb.f134988c;
        if (str != null) {
            C52236kg kgVar = ecVar.f136654b;
            if (kgVar == null) {
                kgVar = C52236kg.f137089d;
            }
            C52235kf a = C52235kf.m86549a(kgVar.f137092b);
            if (a == null) {
                a = C52235kf.OK;
            }
            if (a != null) {
                rVar.f352977c.mo108509a(new C129124l(i, bundledMessageNotification, str, a), C128340r.f352975a, (Object) null);
                return ecVar;
            }
            throw new NullPointerException("Null result");
        }
        throw new NullPointerException("Null replyMessage");
    }
}
