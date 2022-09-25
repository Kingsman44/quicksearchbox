package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.content.Context;
import com.google.android.libraries.social.populous.core.C42262ao;
import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.C42355p;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42550o;
import com.google.android.libraries.social.populous.p3296e.C42554s;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42403a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.Comparator;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69308p;

/* renamed from: com.google.android.libraries.social.populous.e.c.an */
/* compiled from: PG */
public final class C42463an implements C42554s {

    /* renamed from: a */
    public static final Comparator f111383a = C42458ai.f111373a;

    /* renamed from: b */
    public final Context f111384b;

    /* renamed from: c */
    public final ClientConfigInternal f111385c;

    /* renamed from: d */
    public final C42352m f111386d;

    /* renamed from: e */
    public final C42403a f111387e;

    /* renamed from: f */
    public final C42591z f111388f;

    /* renamed from: g */
    public final C60887da f111389g;

    /* renamed from: h */
    public final C58833ax f111390h;

    /* renamed from: i */
    private final C42355p f111391i;

    public C42463an(Context context, ClientConfigInternal clientConfigInternal, C42352m mVar, C42403a aVar, C42591z zVar, C60887da daVar, C42355p pVar, C58833ax axVar) {
        this.f111384b = context;
        this.f111385c = clientConfigInternal;
        this.f111386d = mVar;
        this.f111387e = aVar;
        this.f111388f = zVar;
        this.f111389g = daVar;
        this.f111391i = pVar;
        this.f111390h = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo45370a(C42549n nVar) {
        C60870cx cxVar;
        if (C42454ae.m74855h(this.f111384b)) {
            ClientConfigInternal clientConfigInternal = nVar.f111609f;
            if (!clientConfigInternal.f110737w && (clientConfigInternal.f110725k.contains(C42262ao.EMAIL) || nVar.f111609f.f110725k.contains(C42262ao.PHONE_NUMBER))) {
                C58872ci b = this.f111388f.mo45632b();
                C60870cx b2 = this.f111389g.mo19399b(new C42461al(this, nVar));
                if (C69308p.m100586e()) {
                    cxVar = this.f111391i.mo45323b();
                } else {
                    cxVar = C60856cj.m92900i(C58836b.f156633a);
                }
                C60870cx b3 = C60856cj.m92895d(b2, cxVar).mo57335b(new C42459aj(this, b2, cxVar), C60826bg.f164896a);
                C60856cj.m92911t(b3, new C42462am(this, nVar, b, b3), C60826bg.f164896a);
                return b3;
            }
        }
        C42550o oVar = new C42550o();
        oVar.f111623b = C58485gu.m89842j(C58485gu.m89845m());
        oVar.f111626e = 18;
        oVar.f111627f = 4;
        return C60856cj.m92900i(oVar.mo45556a());
    }

    /* renamed from: b */
    public final C60870cx mo45371b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo45372c(C42266as asVar) {
    }

    /* renamed from: d */
    public final int mo45373d() {
        return 4;
    }
}
