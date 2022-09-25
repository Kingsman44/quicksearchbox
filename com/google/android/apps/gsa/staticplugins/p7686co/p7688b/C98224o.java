package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.o */
/* compiled from: PG */
public final class C98224o {

    /* renamed from: a */
    public static final C59071e f274251a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.b.o");

    /* renamed from: b */
    public final C118827a f274252b;

    /* renamed from: c */
    public final C58881cr f274253c = C58886cw.m90973a(new C98216g(this));

    /* renamed from: d */
    public final C58881cr f274254d = C58886cw.m90973a(new C98217h(this));

    /* renamed from: e */
    public final C58881cr f274255e = C58886cw.m90973a(new C98218i(this));

    /* renamed from: f */
    private final C42876ab f274256f;

    /* renamed from: g */
    private final C22871g f274257g;

    public C98224o(C42876ab abVar, C118827a aVar, C22871g gVar) {
        this.f274256f = abVar;
        this.f274252b = aVar;
        this.f274257g = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo91036a(String str, int i) {
        if (str == null) {
            str = "no_acct";
        }
        AtomicLong atomicLong = new AtomicLong();
        C60870cx g = C60922j.m93044g(this.f274256f.mo46039a(new C98219j(this, str, atomicLong, i), C60826bg.f164896a), new C98220k(atomicLong, i), C60826bg.f164896a);
        C90875ai.m148465b(new C98221l(this), g, this.f274257g, "EuaSequenceIdPersistTracker").mo85223a(new C98222m(this));
        return this.f274257g.mo28205e(g, "getSequenceNumbers", Exception.class, C98223n.f274250a);
    }
}
