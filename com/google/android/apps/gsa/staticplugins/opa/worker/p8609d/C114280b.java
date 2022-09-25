package com.google.android.apps.gsa.staticplugins.opa.worker.p8609d;

import android.content.Context;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84997c;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.chathead.C108153d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.d.b */
/* compiled from: PG */
public final class C114280b extends C86734a implements C84997c {

    /* renamed from: a */
    public static final C89094c f316905a = C89094c.CHATHEAD;

    /* renamed from: b */
    private final C85232a f316906b;

    /* renamed from: c */
    private final C86124t f316907c;

    /* renamed from: f */
    private final Context f316908f;

    /* renamed from: g */
    private final C108153d f316909g;

    public C114280b(Context context, C86124t tVar, C85232a aVar, C108153d dVar) {
        super(C118575h.WORKER_OPA_CHATHEAD, "opachathead");
        this.f316908f = context;
        this.f316907c = tVar;
        this.f316906b = aVar;
        this.f316909g = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo78596a() {
        C85232a aVar = this.f316906b;
        int i = f316905a.f241522aD;
        C1839z a = C89095d.m144923a(this.f316908f, "service");
        a.f5679J.icon = R.drawable.ic_assistant_light;
        a.f5685e = C1839z.m5037c(this.f316907c.mo79758x(C90037cp.f248625u));
        a.f5686f = C1839z.m5037c(this.f316907c.mo79758x(C90037cp.f248624t));
        a.f5690j = 2;
        a.f5671B = -1;
        a.mo5022k(new C1837x());
        aVar.mo78816k(i, a.mo5013a());
        this.f316909g.mo96490a(new C114279a(this));
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo101296c() {
        this.f316906b.mo78817l(f316905a.f241522aD, true);
        this.f316909g.mo96491b();
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return !this.f316909g.mo96492c();
    }
}
