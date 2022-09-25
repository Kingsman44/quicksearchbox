package com.google.android.apps.gsa.projection;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.gms.phenotype.C145738p;
import com.google.android.libraries.phenotype.client.C31649ae;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.projection.h */
/* compiled from: PG */
public final class C84196h {

    /* renamed from: a */
    public C31654aj f229185a;

    /* renamed from: b */
    public C31654aj f229186b;

    /* renamed from: c */
    public final C86124t f229187c;

    public C84196h(C86124t tVar) {
        this.f229187c = tVar;
    }

    /* renamed from: a */
    public static C31654aj m134233a(String str) {
        return new C31649ae(new C31652ah(C145738p.m237002a(str)), "__phenotype_server_token", BuildConfig.FLAVOR, false);
    }

    /* renamed from: b */
    public static boolean m134234b(String str) {
        return amo.ANDROID_AUTO_PROJECTED.name().equals(str) || amo.ANDROID_AUTO.name().equals(str);
    }
}
