package com.google.frameworks.client.p4624a.p4625a.p4626a.p4628b;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4528b.C59033h;
import com.google.common.p4526f.p4528b.p4529a.C58984c;
import com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61296k;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.frameworks.client.a.a.a.b.a */
/* compiled from: PG */
public final class C61299a implements C58984c {

    /* renamed from: a */
    private static final C59033h f165791a = new C61296k(BuildConfig.FLAVOR, C58485gu.m89845m());

    /* renamed from: b */
    private final C69464a f165792b;

    public C61299a(C69464a aVar) {
        this.f165792b = aVar;
    }

    /* renamed from: a */
    public final C59033h mo36920a(String str) {
        Set<C58984c> set = (Set) this.f165792b.mo17428b();
        int size = set.size();
        if (size == 0) {
            return f165791a;
        }
        if (size == 1) {
            return ((C58984c) set.iterator().next()).mo36920a(str);
        }
        C58480gp f = C58485gu.m89838f(size);
        for (C58984c a : set) {
            f.mo55395g(a.mo36920a(str));
        }
        return new C61296k(str, f.mo55394f());
    }
}
