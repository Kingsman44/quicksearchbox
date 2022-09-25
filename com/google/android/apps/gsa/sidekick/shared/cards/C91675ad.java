package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7148ui.C90633ai;
import com.google.android.apps.gsa.shared.p7148ui.C90707s;
import com.google.android.apps.gsa.sidekick.shared.overlay.NowStreamConfig;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91645c;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91714b;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91727k;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.sidekick.shared.p7240i.C91743a;
import com.google.android.apps.gsa.sidekick.shared.p7240i.C91744b;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91901c;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.p4522b.C58729pv;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.ad */
/* compiled from: PG */
public abstract class C91675ad {

    /* renamed from: a */
    private static final C91744b f255665a = new C91744b();

    /* renamed from: b */
    private static final C91645c f255666b = new C91645c();

    /* renamed from: L */
    public static C91674ac m150024L(C58833ax axVar, Context context) {
        C91688c cVar = new C91688c();
        cVar.f255717a = axVar;
        cVar.f255718b = new C58885cv(CardRenderingContext.f118455a);
        cVar.f255719c = new C58885cv(C58729pv.f156485a);
        cVar.f255709A = new C91901c();
        cVar.f255742z = (short) (cVar.f255742z | 3);
        cVar.mo86111e(false);
        cVar.mo86110d(false);
        short s = cVar.f255742z | 16;
        cVar.f255742z = (short) s;
        C58836b bVar = C58836b.f156633a;
        cVar.f255722f = bVar;
        cVar.f255726j = bVar;
        cVar.f255724h = bVar;
        cVar.f255721e = f255665a;
        cVar.f255727k = bVar;
        cVar.f255720d = f255666b;
        cVar.f255728l = bVar;
        cVar.f255729m = bVar;
        cVar.f255730n = bVar;
        cVar.f255731o = bVar;
        cVar.f255732p = bVar;
        cVar.f255733q = new C91714b();
        cVar.f255735s = new C90707s();
        cVar.f255737u = bVar;
        cVar.f255738v = bVar;
        cVar.f255739w = bVar;
        cVar.f255740x = bVar;
        cVar.f255734r = bVar;
        cVar.f255736t = bVar;
        cVar.f255742z = (short) (s | 32);
        cVar.mo86116j(false);
        cVar.mo86115i(false);
        cVar.mo86109c(false);
        if (context != null) {
            cVar.f255741y = context;
            return cVar;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: A */
    public abstract C58881cr mo86117A();

    /* renamed from: B */
    public abstract boolean mo86118B();

    /* renamed from: C */
    public abstract boolean mo86119C();

    /* renamed from: D */
    public abstract boolean mo86120D();

    /* renamed from: E */
    public abstract boolean mo86121E();

    /* renamed from: F */
    public abstract boolean mo86122F();

    /* renamed from: G */
    public abstract boolean mo86123G();

    /* renamed from: H */
    public abstract boolean mo86124H();

    /* renamed from: I */
    public abstract boolean mo86125I();

    /* renamed from: J */
    public abstract boolean mo86126J();

    /* renamed from: K */
    public abstract C91901c mo86127K();

    /* renamed from: a */
    public abstract Context mo86128a();

    /* renamed from: b */
    public abstract C90633ai mo86129b();

    /* renamed from: c */
    public abstract C91643a mo86130c();

    /* renamed from: d */
    public abstract C91647a mo86131d();

    /* renamed from: e */
    public abstract C91713a mo86132e();

    /* renamed from: f */
    public abstract C91727k mo86133f();

    /* renamed from: g */
    public abstract C91728l mo86134g();

    /* renamed from: h */
    public abstract C91743a mo86135h();

    /* renamed from: i */
    public abstract NowStreamConfig mo86136i();

    /* renamed from: j */
    public abstract C58833ax mo86137j();

    /* renamed from: k */
    public abstract C58833ax mo86138k();

    /* renamed from: l */
    public abstract C58833ax mo86139l();

    /* renamed from: m */
    public abstract C58833ax mo86140m();

    /* renamed from: n */
    public abstract C58833ax mo86141n();

    /* renamed from: o */
    public abstract C58833ax mo86142o();

    /* renamed from: p */
    public abstract C58833ax mo86143p();

    /* renamed from: q */
    public abstract C58833ax mo86144q();

    /* renamed from: r */
    public abstract C58833ax mo86145r();

    /* renamed from: s */
    public abstract C58833ax mo86146s();

    /* renamed from: t */
    public abstract C58833ax mo86147t();

    /* renamed from: u */
    public abstract C58833ax mo86148u();

    /* renamed from: v */
    public abstract C58833ax mo86149v();

    /* renamed from: w */
    public abstract C58833ax mo86150w();

    /* renamed from: x */
    public abstract C58833ax mo86151x();

    /* renamed from: y */
    public abstract C58833ax mo86152y();

    /* renamed from: z */
    public abstract C58881cr mo86153z();
}
