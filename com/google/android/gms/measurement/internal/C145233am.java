package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.am */
/* compiled from: PG */
public final class C145233am {

    /* renamed from: a */
    final String f392590a;

    /* renamed from: b */
    final String f392591b;

    /* renamed from: c */
    final String f392592c;

    /* renamed from: d */
    final long f392593d;

    /* renamed from: e */
    final long f392594e;

    /* renamed from: f */
    final EventParams f392595f;

    public C145233am(C145361ff ffVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        EventParams eventParams;
        C143919bh.m233969l(str2);
        C143919bh.m233969l(str3);
        this.f392590a = str2;
        this.f392591b = str3;
        this.f392592c = true == TextUtils.isEmpty(str) ? null : str;
        this.f392593d = j;
        this.f392594e = j2;
        if (j2 != 0 && j2 > j) {
            ffVar.mo120965ar().f392798f.mo120895b("Event created with reverse previous/current timestamps. appId", C145325dx.m236116a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            eventParams = new EventParams(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    ffVar.mo120965ar().f392795c.mo120894a("Param name can't be null");
                    it.remove();
                } else {
                    Object w = ffVar.mo120977o().mo121290w(str4, bundle2.get(str4));
                    if (w == null) {
                        ffVar.mo120965ar().f392798f.mo120895b("Param value can't be null", ffVar.f392942l.mo120891d(str4));
                        it.remove();
                    } else {
                        ffVar.mo120977o().mo121254K(bundle2, str4, w);
                    }
                }
            }
            eventParams = new EventParams(bundle2);
        }
        this.f392595f = eventParams;
    }

    public final String toString() {
        String str = this.f392590a;
        String str2 = this.f392591b;
        String bundle = this.f392595f.f392535a.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + bundle + "}";
    }

    public C145233am(C145361ff ffVar, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        C143919bh.m233969l(str2);
        C143919bh.m233969l(str3);
        this.f392590a = str2;
        this.f392591b = str3;
        this.f392592c = true == TextUtils.isEmpty(str) ? null : str;
        this.f392593d = j;
        this.f392594e = j2;
        if (j2 != 0 && j2 > j) {
            ffVar.mo120965ar().f392798f.mo120896c("Event created with reverse previous/current timestamps. appId, name", C145325dx.m236116a(str2), C145325dx.m236116a(str3));
        }
        this.f392595f = eventParams;
    }
}
