package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.dv */
/* compiled from: PG */
public final /* synthetic */ class C77104dv implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212794a;

    /* renamed from: b */
    public final /* synthetic */ Uri f212795b;

    /* renamed from: c */
    public final /* synthetic */ C80399l f212796c;

    /* renamed from: d */
    public final /* synthetic */ C80303ay f212797d;

    /* renamed from: e */
    public final /* synthetic */ C77131l f212798e;

    public /* synthetic */ C77104dv(C77123en enVar, Uri uri, C80399l lVar, C80303ay ayVar, C77131l lVar2) {
        this.f212794a = enVar;
        this.f212795b = uri;
        this.f212796c = lVar;
        this.f212797d = ayVar;
        this.f212798e = lVar2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212794a;
        Uri uri = this.f212795b;
        C80399l lVar = this.f212796c;
        C80303ay ayVar = this.f212797d;
        C77131l lVar2 = this.f212798e;
        C51809dy dyVar = (C51809dy) obj;
        if (enVar.mo72432i()) {
            return enVar.mo72428d(uri.toString(), lVar, ayVar, lVar2, dyVar);
        }
        C81442m.m129557s(lVar, dyVar);
        return C60856cj.m92900i(Optional.m71637of(C81442m.m129540b(lVar, ayVar)));
    }
}
