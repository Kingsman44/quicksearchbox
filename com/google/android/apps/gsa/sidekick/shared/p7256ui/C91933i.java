package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.view.View;
import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91663b;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91853a;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91903a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91904b;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91909g;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91914l;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.StreamRenderData;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.i */
/* compiled from: PG */
public abstract class C91933i implements View.OnClickListener {

    /* renamed from: a */
    protected final C7718hj f256394a;

    /* renamed from: b */
    protected final C7681g f256395b;

    /* renamed from: c */
    protected final C91647a f256396c;

    /* renamed from: d */
    private final C9141ad f256397d;

    /* renamed from: e */
    private final C7526an f256398e;

    /* renamed from: f */
    private final C9277u f256399f;

    /* renamed from: g */
    private final C91667f f256400g;

    /* renamed from: h */
    private final C91857e f256401h;

    /* renamed from: i */
    private final boolean f256402i;

    public C91933i(C91935k kVar) {
        this.f256396c = kVar.mo86618a();
        this.f256394a = kVar.mo86626h();
        this.f256395b = kVar.mo86624f();
        this.f256397d = kVar.mo86622e();
        this.f256402i = kVar.mo86628i();
        this.f256398e = kVar.mo86625g();
        this.f256399f = kVar.mo86621d();
        this.f256400g = kVar.mo86619b();
        this.f256401h = kVar.mo86620c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo86635a();

    public final void onClick(View view) {
        C7718hj hjVar;
        C7718hj hjVar2;
        C91914l lVar;
        C7709ha haVar;
        Object obj;
        if (this.f256394a != null && this.f256402i) {
            if (this.f256401h != null) {
                C91853a aVar = new C91853a();
                aVar.f256167b = this.f256398e;
                aVar.f256166a = this.f256397d;
                aVar.mo86355b(this.f256396c.mo85966a());
                C9277u uVar = this.f256399f;
                if (uVar != null) {
                    aVar.f256168c = uVar;
                }
                C91857e eVar = this.f256401h;
                eVar.getClass();
                eVar.mo86359a("EVENT_ENTRY_CLICK", "EntryClickListener", aVar.mo86354a());
            } else {
                C91909g x = LoggingRequest.m150673x();
                C91903a aVar2 = (C91903a) x;
                aVar2.f256281a = C91978bb.m150937c(this.f256394a, this.f256395b, new C7681g[0]);
                aVar2.f256285e = this.f256394a;
                aVar2.f256286f = this.f256398e;
                aVar2.f256288h = this.f256396c.mo85966a();
                C91667f fVar = this.f256400g;
                if (fVar != null) {
                    C91663b d = fVar.mo86082d(this.f256394a);
                    C91904b bVar = new C91904b();
                    bVar.f256304a = d.mo86073b();
                    bVar.f256305b = (Integer) d.mo86072a().mo56111f();
                    C1970e c = fVar.mo86081c();
                    C7709ha haVar2 = null;
                    if (c == null || (obj = c.f5888a) == null) {
                        hjVar = null;
                    } else {
                        hjVar = (C7718hj) obj;
                    }
                    if (hjVar != null) {
                        bVar.f256306c = fVar.mo86082d(hjVar).mo86073b();
                        if ((hjVar.f26955a & 64) != 0) {
                            haVar = hjVar.f26972m;
                            if (haVar == null) {
                                haVar = C7709ha.f26910f;
                            }
                        } else {
                            haVar = null;
                        }
                        bVar.f256308e = haVar;
                    }
                    C91667f e = fVar.mo86083e();
                    if (e == null) {
                        hjVar2 = null;
                    } else {
                        hjVar2 = e.mo86085g();
                    }
                    C91667f e2 = fVar.mo86083e();
                    if (!(hjVar2 == null || e2 == null)) {
                        bVar.f256307d = e2.mo86082d(hjVar2).mo86073b();
                        if ((hjVar2.f26955a & 64) != 0 && (haVar2 = hjVar2.f26972m) == null) {
                            haVar2 = C7709ha.f26910f;
                        }
                        bVar.f256309f = haVar2;
                    }
                    StreamRenderData a = bVar.mo86554a();
                    C9277u uVar2 = this.f256399f;
                    if (uVar2 != null) {
                        if (a == null) {
                            lVar = new C91904b();
                        } else {
                            lVar = a.mo86516a();
                        }
                        lVar.mo86560g(uVar2);
                        a = lVar.mo86554a();
                    }
                    aVar2.f256287g = a;
                }
                this.f256396c.mo85967b(x.mo86537a());
            }
        }
        mo86635a();
    }
}
