package com.google.android.apps.gsa.staticplugins.p7415au;

import com.google.android.apps.gsa.l.a;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6544al.C84701a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C89981at;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.au.g */
/* compiled from: PG */
public final class C94137g extends C86734a implements C84701a {

    /* renamed from: a */
    public final a f263000a;

    /* renamed from: b */
    public final List f263001b = new ArrayList();

    /* renamed from: c */
    public final Object f263002c = new Object();

    /* renamed from: f */
    public boolean f263003f = false;

    /* renamed from: g */
    private final C22871g f263004g;

    /* renamed from: h */
    private final C86124t f263005h;

    protected C94137g(a aVar, C22871g gVar, C86124t tVar) {
        super(C118575h.WORKER_FIREBASE_LOGGER, "firebaselogger");
        this.f263000a = aVar;
        this.f263004g = gVar;
        this.f263005h = tVar;
    }

    /* renamed from: a */
    public final void mo78427a(String str) {
        synchronized (this.f263002c) {
            this.f263001b.add(str);
            if (!this.f263003f) {
                this.f263004g.mo28213m("logFirebaseEvents", this.f263005h.mo79743a(C89981at.f246640j), new C94136f(this));
                this.f263003f = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo78428b(Map map) {
        this.f263000a.b(map);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
