package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.C145179a;
import com.google.android.gms.measurement.api.internal.C145181ab;
import com.google.android.gms.measurement.api.internal.C145192am;
import com.google.android.gms.measurement.api.internal.C145204m;
import com.google.android.gms.measurement.api.internal.C145205n;
import com.google.android.gms.measurement.api.internal.C145206o;
import com.google.android.gms.measurement.api.internal.C145209r;
import com.google.android.gms.measurement.api.internal.C145210s;
import com.google.android.gms.measurement.api.internal.C145211t;
import com.google.android.gms.measurement.api.internal.C145212u;
import com.google.android.gms.measurement.api.internal.C145213v;
import com.google.android.gms.measurement.api.internal.C145214w;
import com.google.android.gms.measurement.api.internal.C145215x;
import com.google.android.gms.measurement.api.internal.C145216y;
import com.google.android.gms.measurement.internal.C145417hh;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: com.google.firebase.analytics.a */
/* compiled from: PG */
final class C61116a implements C145417hh {

    /* renamed from: a */
    final /* synthetic */ C145192am f165438a;

    public C61116a(C145192am amVar) {
        this.f165438a = amVar;
    }

    /* renamed from: a */
    public final int mo57672a(String str) {
        C145192am amVar = this.f165438a;
        C145179a aVar = new C145179a();
        amVar.mo120702b(new C145181ab(amVar, str, aVar));
        Integer num = (Integer) C145179a.m235833d(aVar.mo120687a(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final long mo57673b() {
        C145192am amVar = this.f165438a;
        C145179a aVar = new C145179a();
        amVar.mo120702b(new C145213v(amVar, aVar));
        Long l = (Long) C145179a.m235833d(aVar.mo120687a(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = amVar.f392455d + 1;
        amVar.f392455d = i;
        return nextLong + ((long) i);
    }

    /* renamed from: c */
    public final String mo57674c() {
        C145192am amVar = this.f165438a;
        C145179a aVar = new C145179a();
        amVar.mo120702b(new C145212u(amVar, aVar));
        return aVar.mo120688b(50);
    }

    /* renamed from: d */
    public final String mo57675d() {
        C145192am amVar = this.f165438a;
        C145179a aVar = new C145179a();
        amVar.mo120702b(new C145215x(amVar, aVar));
        return aVar.mo120688b(500);
    }

    /* renamed from: e */
    public final String mo57676e() {
        C145192am amVar = this.f165438a;
        C145179a aVar = new C145179a();
        amVar.mo120702b(new C145214w(amVar, aVar));
        return aVar.mo120688b(500);
    }

    /* renamed from: f */
    public final String mo57677f() {
        C145192am amVar = this.f165438a;
        C145179a aVar = new C145179a();
        amVar.mo120702b(new C145211t(amVar, aVar));
        return aVar.mo120688b(500);
    }

    /* renamed from: g */
    public final List mo57678g(String str, String str2) {
        C145192am amVar = this.f165438a;
        C145179a aVar = new C145179a();
        amVar.mo120702b(new C145206o(amVar, str, str2, aVar));
        List list = (List) C145179a.m235833d(aVar.mo120687a(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: h */
    public final Map mo57679h(String str, String str2, boolean z) {
        C145192am amVar = this.f165438a;
        C145179a aVar = new C145179a();
        amVar.mo120702b(new C145216y(amVar, str, str2, z, aVar));
        Bundle a = aVar.mo120687a(5000);
        if (a == null || a.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(a.size());
        for (String str3 : a.keySet()) {
            Object obj = a.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    public final void mo57680i(String str) {
        C145192am amVar = this.f165438a;
        amVar.mo120702b(new C145209r(amVar, str));
    }

    /* renamed from: j */
    public final void mo57681j(String str, String str2, Bundle bundle) {
        C145192am amVar = this.f165438a;
        amVar.mo120702b(new C145205n(amVar, str, str2, bundle));
    }

    /* renamed from: k */
    public final void mo57682k(String str) {
        C145192am amVar = this.f165438a;
        amVar.mo120702b(new C145210s(amVar, str));
    }

    /* renamed from: l */
    public final void mo57683l(String str, String str2, Bundle bundle) {
        this.f165438a.mo120703d(str, str2, bundle, true);
    }

    /* renamed from: m */
    public final void mo57684m(Bundle bundle) {
        C145192am amVar = this.f165438a;
        amVar.mo120702b(new C145204m(amVar, bundle));
    }
}
