package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100788s;
import com.google.android.gms.learning.internal.C144772d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
public class GsaExampleStoreService extends C100812q {

    /* renamed from: a */
    public static final C59071e f281713a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.brella.GsaExampleStoreService");

    /* renamed from: b */
    public Map f281714b;

    /* renamed from: c */
    public C100788s f281715c;

    /* renamed from: d */
    public C100719ab f281716d;

    /* renamed from: e */
    public C100796a f281717e;

    /* renamed from: f */
    public Executor f281718f;

    /* renamed from: g */
    private Executor f281719g;

    /* renamed from: a */
    public final void mo92057a(String str, byte[] bArr, byte[] bArr2, C144772d dVar) {
        C59104x b = f281713a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaExamplesService");
        ((C59052c) ((C59052c) b).mo56372aa(19516)).mo56386p("startQuery()");
        C60856cj.m92903l(new C100802g(this, str, bArr, bArr2, dVar), this.f281719g);
    }

    public final void onCreate() {
        C74507e.m120466b(25);
        C89838ab.m146265i();
        super.onCreate();
        this.f281719g = new C60904dr(this.f281718f);
        C59104x b = f281713a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaExamplesService");
        ((C59052c) ((C59052c) b).mo56372aa(19515)).mo56386p("onCreate()");
    }
}
