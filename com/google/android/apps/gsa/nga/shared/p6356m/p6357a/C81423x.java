package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.shared.p6356m.C81427c;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.nga.shared.p6356m.C81429e;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.x */
/* compiled from: PG */
public final class C81423x implements C81428d, C81429e {

    /* renamed from: a */
    private static final C58974d f222830a = C58974d.m91136j();

    /* renamed from: b */
    private final Object f222831b = new Object();

    /* renamed from: c */
    private final C58881cr f222832c;

    /* renamed from: d */
    private final C22871g f222833d;

    /* renamed from: e */
    private SettableFuture f222834e;

    /* renamed from: f */
    private boolean f222835f = false;

    public C81423x(C81385ab abVar, C22871g gVar) {
        Objects.requireNonNull(abVar);
        this.f222832c = C58886cw.m90973a(new C81418s(abVar));
        this.f222833d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo75074a() {
        synchronized (this.f222831b) {
            if (!((Optional) this.f222832c.mo6453a()).isEmpty()) {
                if (this.f222835f) {
                    if (this.f222834e == null) {
                        this.f222834e = new SettableFuture();
                    }
                    C60870cx e = C90877ak.m148471e(C60856cj.m92901j(this.f222834e), 5, TimeUnit.SECONDS, this.f222833d);
                    return e;
                }
            }
            C60870cx cxVar = C118826c.f331423b;
            return cxVar;
        }
    }

    /* renamed from: b */
    public final void mo75075b(C81427c cVar) {
        ((Optional) this.f222832c.mo6453a()).ifPresent(new C81420u(cVar));
    }

    /* renamed from: c */
    public final void mo75076c(C81427c cVar) {
        ((Optional) this.f222832c.mo6453a()).ifPresent(new C81422w(cVar));
    }

    /* renamed from: d */
    public final boolean mo75077d() {
        return ((Boolean) ((Optional) this.f222832c.mo6453a()).map(C81421v.f222828a).orElse(false)).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75078e(HotwordDetectedEventData hotwordDetectedEventData) {
        if (!mo75077d()) {
            ((C58970a) ((C58970a) f222830a.mo56224b()).mo56372aa(5900)).mo56386p("NGA not active, rejecting hotword event");
        } else if (((Boolean) ((Optional) this.f222832c.mo6453a()).map(new C81419t(hotwordDetectedEventData)).orElse(false)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo75079f() {
        synchronized (this.f222831b) {
            this.f222835f = true;
        }
    }

    /* renamed from: g */
    public final void mo75080g() {
        synchronized (this.f222831b) {
            this.f222835f = false;
            SettableFuture settableFuture = this.f222834e;
            if (settableFuture != null) {
                settableFuture.mo57356n((Object) null);
                this.f222834e = null;
            }
        }
    }
}
