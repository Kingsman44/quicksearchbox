package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.common.p4535g.C59203do;
import com.google.p4583d.p4584a.C60969c;
import com.google.p4583d.p4584a.C60973d;
import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.p4586b.C60957c;
import com.google.p4583d.p4584a.p4587c.C60970a;
import com.google.p4583d.p4584a.p4587c.C60971b;
import com.google.p4583d.p4584a.p4587c.C60972c;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60986m;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.fq */
/* compiled from: PG */
final class C145372fq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventParcel f392987a;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f392988b;

    /* renamed from: c */
    final /* synthetic */ C145379fx f392989c;

    public C145372fq(C145379fx fxVar, EventParcel eventParcel, AppMetadata appMetadata) {
        this.f392989c = fxVar;
        this.f392987a = eventParcel;
        this.f392988b = appMetadata;
    }

    public final void run() {
        C60969c cVar;
        EventParams eventParams;
        C145379fx fxVar = this.f392989c;
        EventParcel eventParcel = this.f392987a;
        if (!(!"_cmp".equals(eventParcel.f392536a) || (eventParams = eventParcel.f392537b) == null || eventParams.f392535a.size() == 0)) {
            String string = eventParcel.f392537b.f392535a.getString("_cis");
            if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                fxVar.f393008a.mo120965ar().f392801i.mo120895b("Event has been filtered ", eventParcel.toString());
                eventParcel = new EventParcel("_cmpx", eventParcel.f392537b, eventParcel.f392538c, eventParcel.f392539d);
            }
        }
        C145379fx fxVar2 = this.f392989c;
        AppMetadata appMetadata = this.f392988b;
        C145351ew ewVar = fxVar2.f393008a.f393353a;
        C145488jy.m236409I(ewVar);
        if (!ewVar.mo120942h(appMetadata.f392500a)) {
            fxVar2.mo120999a(eventParcel, appMetadata);
            return;
        }
        fxVar2.f393008a.mo120965ar().f392803k.mo120895b("EES config found for", appMetadata.f392500a);
        C145351ew ewVar2 = fxVar2.f393008a.f393353a;
        C145488jy.m236409I(ewVar2);
        String str = appMetadata.f392500a;
        if (TextUtils.isEmpty(str)) {
            cVar = null;
        } else {
            cVar = (C60969c) ewVar2.f392894g.mo3690d(str);
        }
        if (cVar != null) {
            try {
                C145491ka kaVar = fxVar2.f393008a.f393359g;
                C145488jy.m236409I(kaVar);
                Map n = kaVar.mo121238n(eventParcel.f392537b.mo120754a(), true);
                String a = C145385gc.m236290a(eventParcel.f392536a);
                if (a == null) {
                    a = eventParcel.f392536a;
                }
                C60971b bVar = new C60971b(a, eventParcel.f392539d, n);
                C60972c cVar2 = cVar.f165087c;
                cVar2.f165094a = bVar;
                cVar2.f165095b = cVar2.f165094a.clone();
                cVar2.f165096c.clear();
                cVar.f165085a.f165143c.mo57530f("runtime.counter", new C60979f(Double.valueOf(C59203do.f157270a)));
                C60970a aVar = cVar.f165088d;
                C61012g a2 = cVar.f165086b.mo57525a();
                C60972c cVar3 = cVar.f165087c;
                C60957c cVar4 = new C60957c(cVar3);
                for (Integer num : aVar.f165089a.keySet()) {
                    C60971b a3 = cVar3.f165095b.clone();
                    int a4 = C60970a.m93130a(a2, (C60986m) aVar.f165089a.get(num), cVar4);
                    if (a4 == 2 || a4 == -1) {
                        cVar3.f165095b = a3;
                    }
                }
                for (Integer num2 : aVar.f165090b.keySet()) {
                    C60970a.m93130a(a2, (C60986m) aVar.f165090b.get(num2), cVar4);
                }
                if (cVar.mo57454b() || cVar.mo57453a()) {
                    if (cVar.mo57454b()) {
                        fxVar2.f393008a.mo120965ar().f392803k.mo120895b("EES edited event", eventParcel.f392536a);
                        C145491ka kaVar2 = fxVar2.f393008a.f393359g;
                        C145488jy.m236409I(kaVar2);
                        fxVar2.mo120999a(kaVar2.mo121235i(cVar.f165087c.f165095b), appMetadata);
                    } else {
                        fxVar2.mo120999a(eventParcel, appMetadata);
                    }
                    if (cVar.mo57453a()) {
                        for (C60971b bVar2 : cVar.f165087c.f165096c) {
                            fxVar2.f393008a.mo120965ar().f392803k.mo120895b("EES logging created event", bVar2.f165091a);
                            C145491ka kaVar3 = fxVar2.f393008a.f393359g;
                            C145488jy.m236409I(kaVar3);
                            fxVar2.mo120999a(kaVar3.mo121235i(bVar2), appMetadata);
                        }
                        return;
                    }
                    return;
                }
            } catch (C60973d unused) {
                fxVar2.f393008a.mo120965ar().f392795c.mo120896c("EES error. appId, eventName", appMetadata.f392501b, eventParcel.f392536a);
            } catch (Throwable th) {
                throw new C60973d(th);
            }
            fxVar2.f393008a.mo120965ar().f392803k.mo120895b("EES was not applied to event", eventParcel.f392536a);
            fxVar2.mo120999a(eventParcel, appMetadata);
            return;
        }
        fxVar2.f393008a.mo120965ar().f392803k.mo120895b("EES not loaded for", appMetadata.f392500a);
        fxVar2.mo120999a(eventParcel, appMetadata);
    }
}
