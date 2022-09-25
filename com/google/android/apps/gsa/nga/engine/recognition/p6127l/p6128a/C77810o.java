package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.recognition.C77548aa;
import com.google.android.apps.gsa.nga.engine.recognition.C77892x;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37561eb;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.o */
/* compiled from: PG */
public final class C77810o implements C77892x {

    /* renamed from: a */
    public final C21370a f214343a;

    /* renamed from: b */
    public final C77732a f214344b;

    /* renamed from: c */
    public final C91142g f214345c;

    /* renamed from: d */
    public final AtomicReference f214346d = new AtomicReference();

    /* renamed from: e */
    public Duration f214347e;

    /* renamed from: f */
    public int f214348f;

    public C77810o(C21370a aVar, C77732a aVar2, C91142g gVar) {
        this.f214343a = aVar;
        this.f214344b = aVar2;
        this.f214345c = gVar;
        this.f214347e = Duration.ofNanos(aVar.mo26872d());
        this.f214348f = 1;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo72712a(C77548aa aaVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo72713g(C80561f fVar, C37514du duVar) {
    }

    /* renamed from: h */
    public final void mo72715h(Optional optional) {
        this.f214346d.set((Duration) optional.orElse(Duration.ofNanos(this.f214343a.mo26872d())));
    }

    /* renamed from: i */
    public final /* synthetic */ void mo72716i(C80561f fVar, C37561eb ebVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo72717j(C80561f fVar, int i) {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo72718k(C77548aa aaVar) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo72719l(C77548aa aaVar) {
    }
}
