package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.C61150d;
import com.google.firebase.components.C61151e;
import com.google.firebase.components.C61156j;
import com.google.firebase.components.C61166t;
import com.google.firebase.p4610c.C61131e;
import com.google.firebase.p4610c.C61133g;
import com.google.firebase.p4610c.C61134h;
import com.google.firebase.p4610c.C61136j;
import com.google.firebase.p4610c.C61137k;
import com.google.firebase.p4613f.C61196b;
import com.google.firebase.p4613f.C61199e;
import com.google.firebase.p4613f.C61202h;
import com.google.firebase.p4613f.C61203i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class FirebaseCommonRegistrar implements C61156j {
    /* renamed from: a */
    public static String m93454a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        C61150d a = C61151e.m93514a(C61203i.class);
        a.mo57716b(C61166t.m93535c(C61199e.class));
        a.mo57717c(C61196b.f165546a);
        arrayList.add(a.mo57715a());
        C61150d dVar = new C61150d(C61133g.class, C61136j.class, C61137k.class);
        dVar.mo57716b(C61166t.m93534b(Context.class));
        dVar.mo57716b(C61166t.m93534b(C61204g.class));
        dVar.mo57716b(C61166t.m93535c(C61134h.class));
        dVar.mo57716b(new C61166t(C61203i.class, 1, 1));
        dVar.mo57717c(C61131e.f165451a);
        arrayList.add(dVar.mo57715a());
        arrayList.add(C61202h.m93574a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C61202h.m93574a("fire-core", "20.0.1_1p"));
        arrayList.add(C61202h.m93574a("device-name", m93454a(Build.PRODUCT)));
        arrayList.add(C61202h.m93574a("device-model", m93454a(Build.DEVICE)));
        arrayList.add(C61202h.m93574a("device-brand", m93454a(Build.BRAND)));
        arrayList.add(C61202h.m93575b("android-target-sdk", C61205h.f165564a));
        arrayList.add(C61202h.m93575b("android-min-sdk", C61206i.f165565a));
        arrayList.add(C61202h.m93575b("android-platform", C61265j.f165707a));
        arrayList.add(C61202h.m93575b("android-installer", C61266k.f165708a));
        return arrayList;
    }
}
