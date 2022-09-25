package com.google.android.libraries.notifications.p2268e.p2279f.p2280a;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.notifications.C29992g;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.C29825p;
import com.google.android.libraries.notifications.data.C29826q;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2298k.C30042b;
import com.google.android.libraries.notifications.p2298k.C30043c;
import com.google.android.libraries.notifications.p2298k.C30044d;
import com.google.android.libraries.notifications.p2298k.C30045e;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p4160bf.p4161a.p4163b.C55450an;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55526af;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.f.a.f */
/* compiled from: PG */
final class C29857f implements C30044d {

    /* renamed from: a */
    public final C29826q f80943a;

    /* renamed from: b */
    public final C30045e f80944b;

    /* renamed from: c */
    private final C29823n f80945c;

    /* renamed from: d */
    private final C29852a f80946d;

    /* renamed from: e */
    private final C21370a f80947e;

    public C29857f(C29826q qVar, C29823n nVar, C29852a aVar, C30045e eVar, C21370a aVar2) {
        this.f80943a = qVar;
        this.f80945c = nVar;
        this.f80946d = aVar;
        this.f80944b = eVar;
        this.f80947e = aVar2;
    }

    /* renamed from: a */
    public final /* synthetic */ long mo35166a() {
        return 0;
    }

    /* renamed from: b */
    public final C29992g mo35167b(Bundle bundle) {
        C29820k kVar;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.DELIVERED_TIMESTAMP");
        boolean z = bundle.getInt("com.google.android.libraries.notifications.MUTE_NOTIFICATION") == 1;
        boolean z2 = bundle.getInt("com.google.android.libraries.notifications.IS_LOCAL_NOTIFICATION") == 1;
        if (!TextUtils.isEmpty(string)) {
            try {
                kVar = this.f80945c.mo35088b(string);
            } catch (C29822m e) {
                return C29992g.m55627c(e);
            }
        } else {
            kVar = null;
        }
        C29820k kVar2 = kVar;
        List<C29825p> b = this.f80943a.mo35097b(string, 5);
        ArrayList arrayList = new ArrayList();
        for (C29825p c : b) {
            try {
                arrayList.add((C55526af) C62942bv.parseFrom((C62942bv) C55526af.f146517o, c.mo35038c()));
            } catch (C62974ct e2) {
                C30058b.m55792d("OnNotificationReceivedHandler", e2, "Unable to parse FrontendNotificationThread message", new Object[0]);
            }
        }
        this.f80943a.mo35099d(string, b);
        this.f80946d.mo35178a(kVar2, arrayList, C30007h.m55637d(), new C29839c(Long.valueOf(j), Long.valueOf(this.f80947e.mo26871c()), C55450an.SCHEDULED_RECEIVER), z, z2);
        return C29992g.f81202a;
    }

    /* renamed from: c */
    public final /* synthetic */ C30042b mo35168c() {
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ C30043c mo35169d() {
        return C30043c.ANY;
    }

    /* renamed from: e */
    public final String mo35170e() {
        return "ON_NOTIFICATION_RECEIVED";
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo35171f() {
        return false;
    }
}
