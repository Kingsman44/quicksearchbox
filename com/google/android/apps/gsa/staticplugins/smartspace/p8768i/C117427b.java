package com.google.android.apps.gsa.staticplugins.smartspace.p8768i;

import android.content.Context;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.i.b */
/* compiled from: PG */
public final class C117427b {

    /* renamed from: a */
    public final Context f325931a;

    /* renamed from: b */
    public final C21370a f325932b;

    /* renamed from: c */
    public final C86124t f325933c;

    /* renamed from: d */
    private final C83794j f325934d;

    public C117427b(Context context, C21370a aVar, C86124t tVar, C83794j jVar) {
        this.f325931a = context;
        this.f325932b = aVar;
        this.f325933c = tVar;
        this.f325934d = jVar;
    }

    /* renamed from: a */
    public final long mo103296a() {
        if (this.f325934d.mo77157A()) {
            return TimeUnit.MINUTES.toMillis(this.f325934d.mo77167c());
        }
        return TimeUnit.MINUTES.toMillis(this.f325933c.mo79743a(C90014bt.f247655lJ));
    }

    /* renamed from: b */
    public final long mo103297b() {
        if (this.f325934d.mo77157A()) {
            return TimeUnit.MINUTES.toMillis(this.f325934d.mo77168d());
        }
        return TimeUnit.SECONDS.toMillis(C131179d.f358774j);
    }
}
