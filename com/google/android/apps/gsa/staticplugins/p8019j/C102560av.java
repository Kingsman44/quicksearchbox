package com.google.android.apps.gsa.staticplugins.p8019j;

import android.content.Context;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.p1533o.C18443af;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.av */
/* compiled from: PG */
public final class C102560av {

    /* renamed from: a */
    public static final C59071e f286245a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.j.av");

    /* renamed from: b */
    public final C68214a f286246b;

    /* renamed from: c */
    public final Executor f286247c;

    /* renamed from: d */
    public final Context f286248d;

    /* renamed from: e */
    public final C68214a f286249e;

    /* renamed from: f */
    public final C86034c f286250f;

    /* renamed from: g */
    public final C68214a f286251g;

    /* renamed from: h */
    public final C58833ax f286252h;

    /* renamed from: i */
    private final Executor f286253i;

    /* renamed from: com.google.android.apps.gsa.staticplugins.j.av$a */
    /* compiled from: PG */
    public interface C102561a {
        /* renamed from: eK */
        C18443af mo93338eK();
    }

    public C102560av(C68214a aVar, Executor executor, Executor executor2, Context context, C68214a aVar2, C86034c cVar, C68214a aVar3, C58833ax axVar) {
        this.f286246b = aVar;
        this.f286247c = executor;
        this.f286253i = executor2;
        this.f286248d = context;
        this.f286249e = aVar2;
        this.f286250f = cVar;
        this.f286251g = aVar3;
        this.f286252h = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo93337a(Query query) {
        return C47633f.m84733g(C2169h.m6027a(new C102553ao(this, query))).mo51516i(new C102555aq(this, query), this.f286253i).mo51515h(C102556ar.f286238a, this.f286253i);
    }
}
