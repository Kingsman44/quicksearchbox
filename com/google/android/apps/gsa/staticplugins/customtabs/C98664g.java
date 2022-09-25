package com.google.android.apps.gsa.staticplugins.customtabs;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98570f;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98571g;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98573i;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1703d.C20664t;
import com.google.android.libraries.p1703d.C20665u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.g */
/* compiled from: PG */
public final class C98664g implements C86091a, C118549h {

    /* renamed from: a */
    public static final C59071e f275612a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.g");

    /* renamed from: b */
    public final C22871g f275613b;

    /* renamed from: c */
    public final C98573i f275614c;

    /* renamed from: d */
    public final C98570f f275615d;

    /* renamed from: e */
    private final Context f275616e;

    /* renamed from: f */
    private final C22871g f275617f;

    /* renamed from: g */
    private final C69464a f275618g;

    public C98664g(Context context, C22871g gVar, C22871g gVar2, C69464a aVar, C98573i iVar, C98570f fVar) {
        this.f275616e = context;
        this.f275617f = gVar;
        this.f275613b = gVar2;
        this.f275618g = aVar;
        this.f275614c = iVar;
        this.f275615d = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        return C60846c.m92878g(C60846c.m92878g(C60838bs.m92859i(C118826c.m197213c(mo91248b())), TimeoutException.class, C98594b.f275368a, C60826bg.f164896a), C20664t.class, C98644c.f275534a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo91248b() {
        String b = ((C98574j) this.f275618g.mo17428b()).mo91180b();
        if (b != null) {
            return C90877ak.m148471e(C20665u.m38827g(this.f275616e, b, new C98564a(this)), 50, TimeUnit.SECONDS, this.f275617f);
        }
        ((C59052c) ((C59052c) f275612a.mo56224b()).mo56372aa(19078)).mo56386p("No Custom Tabs browser found.");
        this.f275614c.mo91193c();
        return C60856cj.m92900i(new C98571g());
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (z || z2) {
            new C90873ag(mo91248b(), this.f275617f, "CustomTabsSyncTask", C98661e.f275609a).mo85223a(C98663f.f275611a);
        }
    }
}
