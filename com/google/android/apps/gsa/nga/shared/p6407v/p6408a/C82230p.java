package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.nga.shared.p6407v.C82267b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83278h;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.assistant.p3745ab.p3771w.C48414a;
import com.google.assistant.p3745ab.p3771w.C48416c;
import com.google.assistant.p3745ab.p3771w.C48418e;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.ahi;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.p */
/* compiled from: PG */
public final class C82230p implements C83278h, C82199aa, C82267b, C82210al {

    /* renamed from: a */
    public static final /* synthetic */ int f224715a = 0;

    /* renamed from: b */
    private static final Supplier f224716b = C82227m.f224713a;

    /* renamed from: c */
    private static final C82229o f224717c = new C82229o();

    /* renamed from: d */
    private static final C82209ak f224718d = C82228n.f224714a;

    /* renamed from: e */
    private final AtomicReference f224719e = new AtomicReference(f224716b);

    /* renamed from: f */
    private final AtomicReference f224720f = new AtomicReference(C82226l.f224712a);

    /* renamed from: g */
    private final AtomicReference f224721g = new AtomicReference(f224718d);

    /* renamed from: h */
    private final C91142g f224722h;

    public C82230p(C91142g gVar) {
        this.f224722h = gVar;
    }

    /* renamed from: a */
    public final void mo75572a(Supplier supplier) {
        this.f224720f.set(supplier);
    }

    /* renamed from: b */
    public final C48420g mo75573b() {
        C48418e eVar;
        C48416c cVar;
        C58485gu guVar = (C58485gu) ((Supplier) this.f224720f.get()).get();
        boolean z = false;
        if (guVar.size() == 1) {
            if (C81451b.m129570a(guVar.isEmpty() ? Locale.getDefault() : (Locale) guVar.get(0), this.f224722h.mo85403h(C90126fx.f251641me))) {
                z = true;
            }
        }
        NgaState a = ((C82209ak) this.f224721g.get()).mo71571a();
        C48414a aVar = (C48414a) C48420g.f125128f.createBuilder();
        aVar.copyOnWrite();
        C48420g gVar = (C48420g) aVar.instance;
        gVar.f125131b = ((ahi) ((Supplier) this.f224719e.get()).get()).f158764y;
        gVar.f125130a = 1 | gVar.f125130a;
        if (z) {
            eVar = C48418e.ON_DEVICE_STACK_ENABLED;
        } else {
            eVar = C48418e.ON_DEVICE_STACK_DISABLED;
        }
        aVar.copyOnWrite();
        C48420g gVar2 = (C48420g) aVar.instance;
        gVar2.f125132c = eVar.f125126d;
        gVar2.f125130a |= 2;
        if (a == null) {
            cVar = C48416c.UNKNOWN;
        } else {
            cVar = f224717c.apply(a);
        }
        aVar.copyOnWrite();
        C48420g gVar3 = (C48420g) aVar.instance;
        gVar3.f125133d = cVar.f125120e;
        gVar3.f125130a |= 4;
        return (C48420g) aVar.build();
    }

    /* renamed from: c */
    public final void mo75540c(Supplier supplier) {
        this.f224719e.set(supplier);
    }

    /* renamed from: d */
    public final void mo75553d(C82209ak akVar) {
        this.f224721g.set(akVar);
    }
}
