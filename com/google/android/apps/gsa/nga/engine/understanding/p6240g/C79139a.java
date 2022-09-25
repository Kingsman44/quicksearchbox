package com.google.android.apps.gsa.nga.engine.understanding.p6240g;

import com.google.android.apps.gsa.nga.engine.ab.a.b;
import com.google.android.apps.gsa.nga.engine.ab.a.g;
import com.google.android.apps.gsa.nga.engine.ab.a.i;
import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.understanding.C78979af;
import com.google.android.apps.gsa.nga.engine.understanding.C79008c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.g.a */
/* compiled from: PG */
public final class C79139a implements C78979af {

    /* renamed from: a */
    private static final Pattern f217543a = Pattern.compile("^(?:(?:hey|ok|okay)\\s+google\\s+)?(.+?)(?:\\s*\\?)?$", 2);

    /* renamed from: b */
    private final C76092h f217544b;

    /* renamed from: c */
    private final C91142g f217545c;

    public C79139a(C76092h hVar, C91142g gVar) {
        this.f217544b = hVar;
        this.f217545c = gVar;
    }

    /* renamed from: a */
    public final C80517f mo73736a() {
        return C80517f.NORMALIZER;
    }

    /* renamed from: b */
    public final C60870cx mo73737b(C74757n nVar, C74965n nVar2) {
        if (nVar.mo71152e().mo71143b() != 1) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        String c = nVar.mo71152e().mo71141c().mo71146c();
        Matcher matcher = f217543a.matcher(c);
        if (!matcher.matches()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        String group = matcher.group(1);
        if (group == null) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        if (c.equals(group)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C79008c cVar = new C79008c();
        i d = nVar.mo71151d();
        g gVar = new g();
        gVar.b = Optional.m71637of(c);
        gVar.a = group;
        d.h(new b(gVar.a()));
        d.l(C80517f.NORMALIZER);
        cVar.mo73740b(d.a());
        return C60856cj.m92900i(C58485gu.m89846n(cVar.mo73739a()));
    }

    /* renamed from: c */
    public final boolean mo73738c() {
        C76090f b = this.f217544b.mo72021b();
        return b.mo72041f() && C81451b.m129570a(b.mo72039e(), this.f217545c.mo85403h(C90126fx.f251710nu));
    }
}
