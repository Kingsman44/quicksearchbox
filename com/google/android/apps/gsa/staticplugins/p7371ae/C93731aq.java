package com.google.android.apps.gsa.staticplugins.p7371ae;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.location.ImproveLocationRequest;
import com.google.android.apps.gsa.search.core.p6519al.p6522aa.C84609a;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.aq */
/* compiled from: PG */
public final class C93731aq {

    /* renamed from: a */
    public static final C59071e f261581a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ae.aq");

    /* renamed from: b */
    static final long f261582b = TimeUnit.DAYS.toMillis(30);

    /* renamed from: c */
    static final long f261583c = TimeUnit.DAYS.toMillis(1);

    /* renamed from: d */
    public final C21370a f261584d;

    /* renamed from: e */
    public final C22871g f261585e;

    /* renamed from: f */
    public final C84609a f261586f;

    /* renamed from: g */
    private final Context f261587g;

    /* renamed from: h */
    private final C22871g f261588h;

    /* renamed from: i */
    private SharedPreferences f261589i;

    public C93731aq(Context context, C21370a aVar, C22871g gVar, C84609a aVar2, C22871g gVar2) {
        this.f261587g = context;
        this.f261584d = aVar;
        this.f261585e = gVar;
        this.f261586f = aVar2;
        this.f261588h = gVar2;
    }

    /* renamed from: a */
    public final SharedPreferences mo88164a() {
        C90748e.m148224b();
        SharedPreferences sharedPreferences = this.f261589i;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.f261587g.getSharedPreferences("improve_location", 0);
        this.f261589i = sharedPreferences2;
        return sharedPreferences2;
    }

    /* renamed from: b */
    public final void mo88165b(boolean z, ImproveLocationRequest.ImproveLocationDialogMetrics improveLocationDialogMetrics) {
        this.f261588h.mo28212l("onLocationPromptResponse", new C93729ao(this, z, improveLocationDialogMetrics));
    }
}
