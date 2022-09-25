package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.C1786ac;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.d.q */
/* compiled from: PG */
public final class C97102q {

    /* renamed from: a */
    static final C89094c f271304a = C89094c.BUBBLE;

    /* renamed from: b */
    static final int f271305b = R.drawable.logo_google_g_reverse;

    /* renamed from: c */
    public final C97103r f271306c;

    /* renamed from: d */
    private final Context f271307d;

    /* renamed from: e */
    private final C85232a f271308e;

    /* renamed from: f */
    private final C69464a f271309f;

    /* renamed from: g */
    private C58485gu f271310g;

    public C97102q(Context context, C85232a aVar, C69464a aVar2, C97103r rVar) {
        this.f271307d = context;
        this.f271308e = aVar;
        this.f271309f = aVar2;
        this.f271306c = rVar;
    }

    /* renamed from: c */
    private static Object m160737c(List list, Object obj) {
        C58838bb.m90868c(!list.isEmpty());
        Object obj2 = list.get(0);
        Objects.requireNonNull(obj2);
        return C58557jl.m90137r(list, new C97101p(obj2)) ? obj2 : obj;
    }

    /* renamed from: a */
    public final void mo90468a(C58485gu guVar) {
        Notification notification;
        if (!C58597ky.m90218i(guVar, this.f271310g)) {
            this.f271310g = guVar;
            if (guVar.isEmpty()) {
                this.f271308e.mo78817l(f271304a.f241522aD, true);
                return;
            }
            if (guVar.size() == 1) {
                C97096k kVar = (C97096k) guVar.get(0);
                C97098m mVar = (C97098m) this.f271309f.mo17428b();
                mVar.mo90467c(kVar.mo90453d());
                String b = kVar.mo90451b();
                mVar.f271299b.mo90464a().f5686f = C1839z.m5037c(b);
                mVar.mo90466b(kVar.mo90450a());
                if (kVar.mo90454e()) {
                    mVar.f271300c = true;
                }
                notification = mVar.mo90465a();
            } else {
                C1786ac acVar = new C1786ac();
                int size = guVar.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    C97096k kVar2 = (C97096k) guVar.get(i);
                    acVar.mo4992g(kVar2.mo90453d());
                    z |= kVar2.mo90454e();
                }
                C97098m mVar2 = (C97098m) this.f271309f.mo17428b();
                mVar2.mo90467c((String) m160737c(C58597ky.m90217h(guVar, C97100o.f271302a), this.f271307d.getString(R.string.bubble_pinned_live_updates)));
                mVar2.mo90466b(((Integer) m160737c(C58597ky.m90217h(guVar, C97099n.f271301a), Integer.valueOf(f271305b))).intValue());
                mVar2.f271299b.mo90464a().mo5022k(acVar);
                if (z) {
                    mVar2.f271300c = true;
                }
                notification = mVar2.mo90465a();
            }
            this.f271308e.mo78816k(f271304a.f241522aD, notification);
        }
    }

    /* renamed from: b */
    public final void mo90469b(C97040c cVar, C97096k kVar) {
        C97103r rVar = this.f271306c;
        rVar.f271311a.put(cVar, kVar);
        mo90468a(rVar.mo90470a());
    }
}
