package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bm */
/* compiled from: PG */
public final class C114816bm {

    /* renamed from: a */
    public final C21370a f318579a;

    /* renamed from: b */
    public final Executor f318580b;

    /* renamed from: c */
    private final Uri f318581c;

    /* renamed from: d */
    private final C42880af f318582d;

    /* renamed from: e */
    private final C22871g f318583e;

    public C114816bm(Context context, C42880af afVar, C21370a aVar, C22871g gVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("opa");
        a.f111968c = "opa";
        a.mo45821b("ClientChipUsage.pb");
        this.f318581c = a.mo45820a();
        this.f318582d = afVar;
        this.f318579a = aVar;
        this.f318583e = gVar;
        this.f318580b = new C114814bk(gVar);
    }

    /* renamed from: a */
    public final C42876ab mo101623a() {
        C42880af afVar = this.f318582d;
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(this.f318581c);
        i.mo45967d(C114889u.f318756b);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: b */
    public final C60870cx mo101624b(int i) {
        return this.f318583e.mo28209i(mo101623a().mo46042d(), "opa-chip-use-store-get", new C114813bj(i));
    }
}
