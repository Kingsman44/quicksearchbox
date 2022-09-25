package com.google.android.apps.gsa.nga.shared.p6363s;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.s.m */
/* compiled from: PG */
public class C81464m {

    /* renamed from: b */
    public static final C58974d f222879b = C58974d.m91134h("ListenerCollectionFactory");

    /* renamed from: a */
    private final C22871g f222880a;

    /* renamed from: c */
    public final C68214a f222881c;

    protected C81464m(C22871g gVar, C68214a aVar) {
        this.f222880a = gVar;
        C58881cr a = C58886cw.m90973a(new C81460i(aVar));
        Objects.requireNonNull(a);
        this.f222881c = new C81461j(a);
    }

    /* renamed from: b */
    public final C60870cx mo75091b(C90919bp bpVar) {
        C60870cx a = this.f222880a.mo28201a("[NGA] ListenerCollection", new C81462k(this, bpVar));
        this.f222880a.mo28211k(a, "[NGA] ListenerCollection callback", new C81463l());
        return C60856cj.m92901j(a);
    }

    /* renamed from: c */
    public final void mo75092c(Object obj) {
        ((Set) this.f222881c.mo27525b()).add(obj);
    }

    /* renamed from: d */
    public final void mo75093d(Object obj) {
        ((Set) this.f222881c.mo27525b()).remove(obj);
    }
}
