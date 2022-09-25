package com.google.android.libraries.web.weblayer.contrib.crashreport.internal;

import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72631t;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.crashreport.internal.f */
/* compiled from: PG */
public final class C44187f implements C44107h, C43949z {

    /* renamed from: a */
    public static final C59071e f114954a = C59071e.m91332i("com.google.android.libraries.web.weblayer.contrib.crashreport.internal.f");

    /* renamed from: b */
    public final C44184c f114955b;

    /* renamed from: c */
    public final Executor f114956c;

    /* renamed from: d */
    private final C44315a f114957d;

    /* renamed from: e */
    private boolean f114958e = false;

    public C44187f(C44315a aVar, C44184c cVar, C43948y yVar, Executor executor) {
        this.f114957d = aVar;
        this.f114955b = cVar;
        this.f114956c = executor;
        yVar.mo46938e(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46529b(C43904a aVar) {
    }

    /* renamed from: c */
    public final void mo46530c(C43904a aVar) {
        if (!this.f114958e) {
            this.f114958e = true;
            C72631t g = this.f114957d.mo47216g();
            C44186e eVar = new C44186e(this, g);
            C72604bm.m107399a();
            g.f193204a.mo64455c(eVar);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46531d() {
    }
}
