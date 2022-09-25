package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124646bl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.p10712d.C142306al;
import com.google.android.p10712d.C142309ao;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bi */
/* compiled from: PG */
public final class C95099bi implements AutoCloseable, C89495cg {

    /* renamed from: a */
    public static final C59071e f266056a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.bi");

    /* renamed from: b */
    public final C89492cd f266057b;

    /* renamed from: c */
    public final C95355bf f266058c;

    /* renamed from: d */
    public boolean f266059d;

    /* renamed from: e */
    public boolean f266060e;

    /* renamed from: f */
    public boolean f266061f;

    /* renamed from: g */
    private final C95188c f266062g;

    public C95099bi(C89492cd cdVar, C95188c cVar, C95355bf bfVar) {
        this.f266057b = cdVar;
        this.f266062g = cVar;
        this.f266058c = bfVar;
    }

    /* renamed from: a */
    public final synchronized void mo89022a() {
        C60856cj.m92911t(this.f266057b.mo83408n(this.f266058c.mo89270k()), new C95098bh(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final synchronized void mo89023b() {
        if (!this.f266060e) {
            if (!this.f266058c.mo89256C()) {
                C95355bf bfVar = this.f266058c;
                C142306al alVar = (C142306al) C142309ao.f386072c.createBuilder();
                alVar.copyOnWrite();
                C142309ao aoVar = (C142309ao) alVar.instance;
                aoVar.f386075b = 1;
                aoVar.f386074a = 1 | aoVar.f386074a;
                bfVar.mo89257D(9, 13, ((C142309ao) alVar.build()).toByteArray());
                return;
            }
        }
        if (!this.f266058c.mo89279x()) {
            this.f266062g.mo89096a(9);
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo89024c() {
        return this.f266059d;
    }

    public final void close() {
        this.f266057b.mo83379U(this);
    }

    /* renamed from: d */
    public final synchronized boolean mo89026d() {
        return this.f266061f;
    }

    /* renamed from: fW */
    public final synchronized void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f266058c.mo89270k())) {
            this.f266060e = C124707e.INPUT_ONLY_MODE.equals(dVar.mo106508g());
            this.f266061f = C124646bl.SOUND_ENABLED.equals(dVar.mo106522t());
        }
    }
}
