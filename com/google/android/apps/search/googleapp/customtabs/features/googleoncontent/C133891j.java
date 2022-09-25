package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133705a;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133749j;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133710ab;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133714af;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133715ag;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.j */
/* compiled from: PG */
public final class C133891j implements C47102r {

    /* renamed from: a */
    public static final C59071e f364672a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.j");

    /* renamed from: b */
    public final C38750am f364673b;

    /* renamed from: c */
    private final Executor f364674c;

    /* renamed from: d */
    private final C133749j f364675d;

    public C133891j(Executor executor, C133749j jVar, C38750am amVar) {
        this.f364674c = executor;
        this.f364675d = jVar;
        this.f364673b = amVar;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C133714af afVar = null;
        try {
            if (intent.getParcelableExtra("EXTRA_RESTORATION_DATA") != null) {
                afVar = (C133714af) ProtoParsers.m95519b(intent, "EXTRA_RESTORATION_DATA", C133714af.f364207d, C62921ba.m95368a());
            }
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C133715ag.f364212a.mo56226d()).mo56382g(e)).mo56372aa(40118)).mo56389s("failed to parse bundle for key %s", "EXTRA_RESTORATION_DATA");
        }
        if (afVar != null) {
            return C47633f.m84733g(this.f364675d.mo111384b()).mo51516i(new C133885d(afVar), this.f364674c).mo51516i(C133886e.f364667a, this.f364674c).mo51516i(new C133887f(this), this.f364674c).mo51514f(C133705a.class, C133888g.f364669a, C60826bg.f164896a).mo51514f(C133710ab.class, C133889h.f364670a, C60826bg.f164896a).mo51514f(RemoteException.class, C133890i.f364671a, C60826bg.f164896a);
        }
        ((C59052c) ((C59052c) f364672a.mo56226d()).mo56372aa(40167)).mo56386p("Unable to clear the bottom bar because there is no session data.");
        return C60866ct.f164955a;
    }
}
