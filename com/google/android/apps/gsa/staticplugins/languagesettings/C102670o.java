package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.integrations.p3015b.p3016a.C38497c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.o */
/* compiled from: PG */
public final class C102670o {

    /* renamed from: a */
    public final Context f286589a;

    /* renamed from: b */
    private final C86034c f286590b;

    /* renamed from: c */
    private final C22871g f286591c;

    /* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.o$a */
    /* compiled from: PG */
    public interface C102671a {
        /* renamed from: fT */
        C38497c mo93377fT();
    }

    public C102670o(Context context, C86034c cVar, C22871g gVar) {
        this.f286589a = context;
        this.f286590b = cVar;
        this.f286591c = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo93376a() {
        return this.f286591c.mo28209i(this.f286590b.mo79697b(), "get discover language store", new C102669n(this));
    }
}
