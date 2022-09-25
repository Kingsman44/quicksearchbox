package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82548jg;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.ady;
import com.google.common.p4552o.aeb;
import com.google.common.p4552o.aef;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.z */
/* compiled from: PG */
public final class C82240z implements C83305i {

    /* renamed from: a */
    private static final C58974d f224744a = C58974d.m91136j();

    /* renamed from: b */
    private final C68214a f224745b;

    /* renamed from: c */
    private final C58881cr f224746c;

    /* renamed from: d */
    private final C58881cr f224747d;

    /* renamed from: e */
    private final C58881cr f224748e;

    /* renamed from: f */
    private final C68214a f224749f;

    /* renamed from: g */
    private final C68214a f224750g;

    /* renamed from: h */
    private C58528ij f224751h;

    public C82240z(C68214a aVar, Context context, C90476a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f224745b = aVar;
        this.f224746c = C58886cw.m90973a(new C82237w(context));
        Objects.requireNonNull(aVar2);
        this.f224747d = C58886cw.m90973a(new C82238x(aVar2));
        this.f224748e = C58886cw.m90973a(new C82239y(context));
        this.f224750g = aVar4;
        this.f224749f = aVar3;
    }

    /* renamed from: a */
    public final int mo75576a() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    public final String mo75577b() {
        return (String) this.f224748e.mo6453a();
    }

    /* renamed from: c */
    public final String mo75578c() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public final void mo75579d(C82548jg jgVar) {
        aeb aeb = aeb.f158441d;
        if (((C91142g) this.f224749f.mo27525b()).mo85405j(C90126fx.f251584la)) {
            ((C58970a) ((C58970a) f224744a.mo56224b()).mo56372aa(5920)).mo56386p("Monitor event not recorded for internal testing traffic.");
            return;
        }
        jgVar.mo75584e((String) this.f224746c.mo6453a(), (String) this.f224747d.mo6453a(), (C83311if) this.f224745b.mo27525b());
        if (((C91142g) this.f224749f.mo27525b()).mo85405j(C90126fx.f251560lC)) {
            boolean j = ((C91142g) this.f224749f.mo27525b()).mo85405j(C90126fx.f251566lI);
            if (this.f224751h == null) {
                this.f224751h = C58528ij.m90006F(C89988b.m146551d(((C91142g) this.f224749f.mo27525b()).mo85403h(C90126fx.f251561lD)));
            }
            C58528ij ijVar = this.f224751h;
            if (j || ijVar.contains(jgVar.mo75583d())) {
                ady ady = (ady) aeb.toBuilder();
                aef a = jgVar.mo75580a();
                ady.copyOnWrite();
                aeb aeb2 = (aeb) ady.instance;
                a.getClass();
                aeb2.f158444b = a;
                aeb2.f158443a |= 1;
                ((C82231q) this.f224750g.mo27525b()).mo75574a((aeb) ady.build());
            }
        }
    }
}
