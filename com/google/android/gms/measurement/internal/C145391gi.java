package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.measurement.internal.gi */
/* compiled from: PG */
public final /* synthetic */ class C145391gi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145416hg f393068a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f393069b;

    public /* synthetic */ C145391gi(C145416hg hgVar, Bundle bundle) {
        this.f393068a = hgVar;
        this.f393069b = bundle;
    }

    public final void run() {
        C145416hg hgVar = this.f393068a;
        Bundle bundle = this.f393069b;
        if (bundle == null) {
            hgVar.f393011w.mo120971g().f392869v.mo120914b(new Bundle());
            return;
        }
        C145335eg egVar = hgVar.f393011w.mo120971g().f392869v;
        egVar.mo120913a();
        Bundle bundle2 = egVar.f392830a;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (hgVar.f393011w.mo120977o().mo121272ab(obj)) {
                    hgVar.f393011w.mo120977o().mo121253J(hgVar.f393146g, (String) null, 27, (String) null, (String) null, 0);
                }
                hgVar.f393011w.mo120965ar().f392800h.mo120896c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C145495ke.m236485ad(str)) {
                hgVar.f393011w.mo120965ar().f392800h.mo120895b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundle2.remove(str);
            } else {
                C145495ke o = hgVar.f393011w.mo120977o();
                C145222ab abVar = hgVar.f393011w.f392937g;
                if (o.mo121266W("param", str, 100, obj)) {
                    hgVar.f393011w.mo120977o().mo121254K(bundle2, str, obj);
                }
            }
        }
        hgVar.f393011w.mo120977o();
        int b = hgVar.f393011w.f392937g.mo120766b();
        if (bundle2.size() > b) {
            int i = 0;
            for (String str2 : new TreeSet(bundle2.keySet())) {
                i++;
                if (i > b) {
                    bundle2.remove(str2);
                }
            }
            hgVar.f393011w.mo120977o().mo121253J(hgVar.f393146g, (String) null, 26, (String) null, (String) null, 0);
            hgVar.f393011w.mo120965ar().f392800h.mo120894a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        hgVar.f393011w.mo120971g().f392869v.mo120914b(bundle2);
        hgVar.f393011w.mo120975m().mo121163s(bundle2);
    }
}
