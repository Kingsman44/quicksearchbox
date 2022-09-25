package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59711cz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;

@Deprecated
/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.ag */
/* compiled from: PG */
public final class C14106ag {

    /* renamed from: b */
    private static final C59071e f42783b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.c.ag");

    /* renamed from: a */
    public final AtomicReference f42784a = new AtomicReference(OptionalLong.empty());

    /* renamed from: c */
    private final C37215b f42785c;

    /* renamed from: d */
    private final AtomicReference f42786d = new AtomicReference(OptionalLong.empty());

    /* renamed from: e */
    private final AtomicReference f42787e = new AtomicReference(Optional.empty());

    /* renamed from: f */
    private final AtomicReference f42788f = new AtomicReference(Optional.empty());

    /* renamed from: g */
    private final C86124t f42789g;

    /* renamed from: h */
    private final C21370a f42790h;

    public C14106ag(C37215b bVar, C86124t tVar, C21370a aVar) {
        this.f42785c = bVar;
        this.f42789g = tVar;
        this.f42790h = aVar;
    }

    /* renamed from: f */
    private final String m30376f() {
        long j;
        if (((OptionalLong) this.f42784a.get()).isPresent()) {
            j = ((OptionalLong) this.f42784a.get()).getAsLong();
        } else {
            j = ((OptionalLong) this.f42786d.get()).isPresent() ? ((OptionalLong) this.f42786d.get()).getAsLong() : 0;
        }
        String b = C39191a.m68623b(j);
        if (((Optional) this.f42788f.get()).isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            int i = ((C37252a) ((Optional) this.f42788f.get()).get()).mo40778b().f98906a;
            C37215b bVar = this.f42785c;
            C37252a aVar = (C37252a) ((Optional) this.f42788f.get()).get();
            aVar.mo40794r(b);
            aVar.mo40795s("requestId", b);
            bVar.mo19974a(aVar);
            this.f42788f.set(Optional.empty());
        }
        return b;
    }

    /* renamed from: a */
    public final void mo21410a(C37252a aVar) {
        if (!this.f42789g.mo79746e(C90051dc.f248842ax)) {
            if (!mo21414e()) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            String b = C39191a.m68623b(((OptionalLong) this.f42786d.get()).getAsLong());
            if (this.f42789g.mo79746e(C90051dc.f248818aZ)) {
                b = m30376f();
            }
            C58976aa aaVar2 = C58975e.f156826a;
            int i = ((C37252a) ((Optional) this.f42787e.get()).orElse(aVar)).mo40778b().f98906a;
            C37215b bVar = this.f42785c;
            C37252a aVar2 = (C37252a) ((Optional) this.f42787e.get()).orElse(aVar);
            aVar2.mo40794r(b);
            aVar2.mo40795s("requestId", b);
            bVar.mo19974a(aVar2);
            this.f42786d.set(OptionalLong.empty());
            this.f42784a.set(OptionalLong.empty());
            this.f42787e.set(Optional.empty());
            if (this.f42789g.mo79746e(C90051dc.f248843ay)) {
                C14136f.m30431a(this.f42785c);
            }
        }
    }

    /* renamed from: b */
    public final void mo21411b(C37252a aVar, Optional optional) {
        if (!this.f42789g.mo79746e(C90051dc.f248842ax)) {
            if (!mo21414e()) {
                C58976aa aaVar = C58975e.f156826a;
                int i = aVar.mo40778b().f98906a;
                return;
            }
            String b = C39191a.m68623b(((OptionalLong) this.f42786d.get()).getAsLong());
            C58976aa aaVar2 = C58975e.f156826a;
            int i2 = aVar.mo40778b().f98906a;
            if (!this.f42789g.mo79746e(C90051dc.f248818aZ)) {
                aVar.mo40794r(b);
                aVar.mo40795s("requestId", b);
            }
            if (optional.isPresent()) {
                aVar.mo40792p(C59711cz.f160208s, (C59711cz) optional.get());
            }
            this.f42785c.mo19974a(aVar);
        }
    }

    /* renamed from: c */
    public final void mo21412c(C37252a aVar, long j, Optional optional, Optional optional2) {
        C37215b bVar;
        String str;
        long j2;
        if (!this.f42789g.mo79746e(C90051dc.f248842ax)) {
            C58976aa aaVar = C58975e.f156826a;
            int i = aVar.mo40778b().f98906a;
            if (mo21414e()) {
                C59104x d = f42783b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.AssstntAppFlwLgr");
                ((C59052c) ((C59052c) d).mo56372aa(45802)).mo56386p("Assistant AppFlow ready started. End the existing one and start logging the new one.");
                String b = C39191a.m68623b(((OptionalLong) this.f42786d.get()).getAsLong());
                if (this.f42789g.mo79746e(C90051dc.f248818aZ)) {
                    b = m30376f();
                }
                C37215b bVar2 = this.f42785c;
                C37252a aVar2 = (C37252a) ((Optional) this.f42787e.get()).orElse(C37182a.f97879cE.mo40805c(C62722b.ABORTED));
                aVar2.mo40794r(b);
                aVar2.mo40795s("requestId", b);
                bVar2.mo19974a(aVar2);
                this.f42787e.set(Optional.empty());
            }
            this.f42786d.set(OptionalLong.m71641of(j));
            this.f42787e.set(Optional.empty());
            this.f42784a.set(OptionalLong.empty());
            if (optional2.isPresent()) {
                aVar.mo40792p(C59711cz.f160208s, (C59711cz) optional2.get());
            }
            if (this.f42789g.mo79746e(C90051dc.f248818aZ)) {
                AtomicReference atomicReference = this.f42788f;
                if (optional.isPresent()) {
                    j2 = ((Duration) optional.get()).toNanos();
                } else {
                    j2 = this.f42790h.mo26872d();
                }
                aVar.mo40791o(j2);
                atomicReference.set(Optional.m71637of(aVar));
            } else {
                String b2 = C39191a.m68623b(j);
                aVar.mo40794r(b2);
                aVar.mo40795s("requestId", b2);
                this.f42785c.mo19974a(aVar);
            }
            if (this.f42789g.mo79746e(C90051dc.f248843ay)) {
                String str2 = aVar.mo40782f().mo40798c().f98877b;
                C14137g gVar = new C14137g();
                C37215b bVar3 = this.f42785c;
                if (bVar3 != null) {
                    gVar.f42848a = bVar3;
                    gVar.f42849b = str2;
                    gVar.f42850c = j;
                    gVar.f42853f = 1;
                    Objects.requireNonNull(gVar);
                    optional.ifPresent(new C14104ae(gVar));
                    Objects.requireNonNull(gVar);
                    optional2.ifPresent(new C14105af(gVar));
                    if (gVar.f42853f != 1 || (bVar = gVar.f42848a) == null || (str = gVar.f42849b) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (gVar.f42848a == null) {
                            sb.append(" appFlowLogger");
                        }
                        if (gVar.f42849b == null) {
                            sb.append(" eventName");
                        }
                        if (gVar.f42853f == 0) {
                            sb.append(" requestId");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    C14136f.m30432b(new C14138h(bVar, str, gVar.f42850c, gVar.f42851d, gVar.f42852e));
                    return;
                }
                throw new NullPointerException("Null appFlowLogger");
            }
        }
    }

    /* renamed from: d */
    public final void mo21413d(C37252a aVar) {
        if (mo21414e()) {
            C58976aa aaVar = C58975e.f156826a;
            int i = aVar.mo40778b().f98906a;
            this.f42787e.set(Optional.m71637of(aVar));
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        int i2 = aVar.mo40778b().f98906a;
    }

    /* renamed from: e */
    public final boolean mo21414e() {
        return ((OptionalLong) this.f42786d.get()).isPresent();
    }
}
