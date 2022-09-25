package com.google.assistant.p3838ao.p3839a.p3848h;

import com.google.assistant.p3838ao.p3839a.p3845e.C49575ce;
import com.google.assistant.p3838ao.p3839a.p3845e.C49611dn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4580v.C60950i;

/* renamed from: com.google.assistant.ao.a.h.o */
/* compiled from: PG */
public final class C49660o implements C49662q {

    /* renamed from: a */
    public static final Object f128170a = new Object();

    /* renamed from: h */
    private static final C49666u f128171h = new C49666u();

    /* renamed from: b */
    public volatile boolean f128172b;

    /* renamed from: c */
    public volatile C49575ce f128173c = C49575ce.f127917d;

    /* renamed from: d */
    public volatile C49611dn f128174d = C49611dn.f128019d;

    /* renamed from: e */
    public final C49649d f128175e;

    /* renamed from: f */
    public final C49668w f128176f;

    /* renamed from: g */
    public C49659n f128177g = new C49650e().mo53297a();

    /* renamed from: i */
    private final C49654i f128178i = new C49654i();

    public C49660o(C60950i iVar) {
        this.f128175e = new C49649d(iVar);
        this.f128176f = new C49668w();
    }

    /* renamed from: a */
    public final C49661p mo53320a() {
        C49659n nVar;
        boolean z = this.f128172b;
        synchronized (f128170a) {
            nVar = this.f128177g;
        }
        if (nVar != null) {
            C49648c cVar = new C49648c(this.f128175e);
            C49667v vVar = new C49667v(this.f128176f.f128183a.mo53317a());
            C49575ce ceVar = this.f128173c;
            if (ceVar != null) {
                C49666u uVar = f128171h;
                if (uVar != null) {
                    C58528ij b = this.f128178i.mo53316b();
                    if (b != null) {
                        C58485gu a = this.f128178i.mo53315a();
                        if (a != null) {
                            C49611dn dnVar = this.f128174d;
                            if (dnVar != null) {
                                return new C49652g(z, nVar, cVar, vVar, ceVar, uVar, b, a, dnVar);
                            }
                            throw new NullPointerException("Null userInteractionStateTransition");
                        }
                        throw new NullPointerException("Null bluetoothHistory");
                    }
                    throw new NullPointerException("Null connectedDevices");
                }
                throw new NullPointerException("Null userProfileHandler");
            }
            throw new NullPointerException("Null photoProfile");
        }
        throw new NullPointerException("Null screenState");
    }
}
