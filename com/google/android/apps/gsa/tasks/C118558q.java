package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.tasks.q */
/* compiled from: PG */
public final class C118558q implements C118551j {

    /* renamed from: a */
    public static final C59071e f329161a = C59071e.m91332i("com.google.android.apps.gsa.tasks.q");

    /* renamed from: b */
    static final long f329162b = TimeUnit.SECONDS.toMillis(70);

    /* renamed from: c */
    public final C118517bt f329163c;

    /* renamed from: d */
    public final C118478am f329164d;

    /* renamed from: e */
    public final C22871g f329165e;

    /* renamed from: f */
    public final C22871g f329166f;

    /* renamed from: g */
    public final C118533ch f329167g;

    /* renamed from: h */
    public final C21370a f329168h;

    /* renamed from: i */
    public final C118513bp f329169i;

    /* renamed from: j */
    private final Map f329170j = new EnumMap(C118522by.class);

    public C118558q(C118517bt btVar, C22871g gVar, C22871g gVar2, C118478am amVar, C118533ch chVar, C21370a aVar, C118513bp bpVar) {
        this.f329163c = btVar;
        this.f329165e = gVar;
        this.f329166f = gVar2;
        this.f329164d = amVar;
        this.f329167g = chVar;
        this.f329168h = aVar;
        this.f329169i = bpVar;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo103747a(C118522by byVar) {
        mo103750b(byVar, C118476ak.f328838a, C118466aa.NONEXCLUSIVE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo103750b(C118522by byVar, C118476ak akVar, C118466aa aaVar) {
        C118556o oVar;
        synchronized (this.f329170j) {
            oVar = (C118556o) this.f329170j.get(byVar);
            if (oVar == null) {
                oVar = new C118556o(this, byVar);
                this.f329170j.put(byVar, oVar);
            }
        }
        C118557p pVar = new C118557p(akVar, aaVar);
        synchronized (oVar.f329155b) {
            boolean isEmpty = oVar.f329155b.isEmpty();
            if (isEmpty) {
                oVar.f329157d = 1;
            } else {
                int i = oVar.f329157d + 1;
                oVar.f329157d = i;
                if (i > 4) {
                    oVar.mo103748a(pVar);
                    return null;
                }
            }
            oVar.f329156c.mo57356n(C118826c.f331422a);
            oVar.f329156c = new SettableFuture();
            oVar.f329155b.add(pVar);
            if (isEmpty) {
                oVar.mo103749b(pVar);
            }
            SettableFuture settableFuture = oVar.f329156c;
            return settableFuture;
        }
    }
}
