package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123085a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123164d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123166f;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.C123181b;
import com.google.android.apps.search.assistant.platform.ondevice.p9263b.C122135p;
import com.google.android.apps.search.assistant.platform.ondevice.p9263b.C122136q;
import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.android.libraries.assistant.gallium.framework.C18217au;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18282b;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18283c;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18284d;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18285e;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18286f;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18297q;
import com.google.android.libraries.assistant.portable.C19042a;
import com.google.android.libraries.assistant.portable.C19052aa;
import com.google.android.libraries.assistant.portable.C19053ab;
import com.google.android.libraries.assistant.portable.C19055b;
import com.google.android.libraries.assistant.portable.C19115w;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3989p.p3990a.C53048j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.nlp.p4730a.C62799s;
import com.google.protobuf.C62940bt;
import com.google.protos.p4985f.p5003f.p5004a.C64853i;
import com.google.protos.p4985f.p5030q.C65179em;
import com.google.protos.p4985f.p5030q.C65180en;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65191ey;
import com.google.protos.p4985f.p5030q.C65196fc;
import com.google.protos.p4985f.p5030q.C65237gq;
import com.google.protos.p4985f.p5030q.C65238gr;
import com.google.protos.p4985f.p5030q.C65248ha;
import com.google.protos.p4985f.p5030q.C65275ia;
import com.google.protos.p5127o.C65670ay;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65682h;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ak */
/* compiled from: PG */
public final class C123097ak implements C123164d {

    /* renamed from: a */
    public final PortableAssistant f340708a;

    /* renamed from: b */
    public final C123099am f340709b;

    /* renamed from: c */
    private final C122136q f340710c;

    /* renamed from: d */
    private final C122135p f340711d;

    /* renamed from: e */
    private final AtomicLong f340712e = new AtomicLong(1);

    /* renamed from: f */
    private final C123181b f340713f;

    /* renamed from: g */
    private final C123181b f340714g;

    /* renamed from: h */
    private final boolean f340715h;

    public C123097ak(C122136q qVar, C122135p pVar, PortableAssistant portableAssistant, C123099am amVar, boolean z, C123181b bVar, C123181b bVar2) {
        this.f340710c = qVar;
        this.f340711d = pVar;
        this.f340708a = portableAssistant;
        this.f340709b = amVar;
        this.f340715h = z;
        this.f340713f = bVar2;
        this.f340714g = bVar;
    }

    /* renamed from: h */
    private final C60870cx m202436h(C65191ey eyVar, C123166f fVar, String str, C123096aj ajVar) {
        C123181b bVar;
        if (eyVar.f176433h > 0) {
            this.f340711d.mo105544b(this.f340710c, str, ((C123085a) fVar).f340675a);
        }
        C53048j a = this.f340711d.mo105543a(((C123085a) fVar).f340675a, eyVar.f176433h);
        try {
            if (this.f340715h) {
                bVar = this.f340713f;
            } else {
                bVar = this.f340714g;
            }
            C18207ak b = bVar.mo105905b(fVar);
            this.f340709b.mo105882a();
            return ajVar.mo105874a(eyVar, b, a);
        } catch (C18218av e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: a */
    public final long mo105875a() {
        return this.f340712e.getAndIncrement();
    }

    /* renamed from: b */
    public final C60870cx mo105876b(C65191ey eyVar, C61752n nVar, C123166f fVar) {
        return m202436h(eyVar, fVar, "callIgdp", new C123091ae(this, nVar));
    }

    /* renamed from: c */
    public final C60870cx mo105877c(C65191ey eyVar, C123166f fVar) {
        C18286f fVar2;
        try {
            C18207ak b = (this.f340715h ? this.f340713f : this.f340714g).mo105905b(fVar);
            if (eyVar.f176433h > 0) {
                this.f340711d.mo105544b(this.f340710c, "getConversationStream", ((C123085a) fVar).f340675a);
            }
            C53048j a = this.f340711d.mo105543a(((C123085a) fVar).f340675a, eyVar.f176433h);
            PortableAssistant portableAssistant = this.f340708a;
            C65185es esVar = (C65185es) eyVar.toBuilder();
            C65179em emVar = (C65179em) C65180en.f176389b.createBuilder();
            long andIncrement = this.f340712e.getAndIncrement();
            emVar.copyOnWrite();
            ((C65180en) emVar.instance).f176391a = andIncrement;
            esVar.copyOnWrite();
            C65180en enVar = (C65180en) emVar.build();
            enVar.getClass();
            ((C65191ey) esVar.instance).f176437l = enVar;
            C65191ey eyVar2 = (C65191ey) esVar.build();
            try {
                C19053ab e = portableAssistant.mo24259e();
                try {
                    GalliumIpc c = portableAssistant.mo24257c();
                    C18217au d = portableAssistant.mo24258d(eyVar2, b, c);
                    C18238f fVar3 = new C18238f();
                    fVar3.mo23736b(d);
                    C62940bt btVar = C64853i.f175747f;
                    C58976aa aaVar = C58975e.f156826a;
                    fVar3.f51797a.mo58885m(btVar, PortableAssistant.m36465i(a, c));
                    int i = C65238gr.f176531a;
                    C65682h hVar = ((C65248ha) c.f51690c.mo23693b(C65237gq.f176530a)).f176551b;
                    if (hVar == null) {
                        hVar = C65682h.f178459f;
                    }
                    C65682h hVar2 = hVar;
                    fVar2 = new C18286f(c, fVar3, C65196fc.f176453l.getParserForType());
                    C18297q qVar = new C18297q();
                    Objects.requireNonNull(fVar2);
                    qVar.f51916a = C58833ax.m90834k(new C18282b(fVar2));
                    qVar.f51917b = C58833ax.m90834k(new C18283c(fVar2));
                    C65682h b2 = c.mo23658b(hVar2, qVar);
                    fVar2.f51890b = new C18284d(c, hVar2);
                    C18238f fVar4 = fVar2.f51910j;
                    C62940bt btVar2 = C65674bb.f178443d;
                    C65670ay ayVar = (C65670ay) C65674bb.f178442c.createBuilder();
                    ayVar.copyOnWrite();
                    C65674bb bbVar = (C65674bb) ayVar.instance;
                    bbVar.f178446b = 1;
                    bbVar.f178445a = 1 | bbVar.f178445a;
                    fVar4.f51797a.mo58885m(btVar2, (C65674bb) ayVar.build());
                    C60870cx a2 = fVar2.f51908h.mo23657a(C18231d.f51786a, hVar2, fVar2.f51909i, b2, "type.googleapis.com/gallium.Handle", C65682h.f178459f.getParserForType(), fVar2.f51910j);
                    fVar2.f51889a = a2;
                    C60870cx h = C60922j.m93045h(a2, C47810es.m84966f(new C18285e(fVar2)), fVar2.f51908h.mo23659c());
                    fVar2.f51903c.writeLock().lock();
                    fVar2.f51905e = h;
                    fVar2.f51903c.writeLock().unlock();
                    C19042a aVar = new C19042a(fVar2, d, new C19115w(portableAssistant, d));
                    portableAssistant.f53438h.put(Long.valueOf(d.mo23676a()), aVar);
                    C60870cx i2 = C60856cj.m92900i(aVar);
                    e.close();
                    return i2;
                } catch (Throwable th) {
                    e.close();
                    throw th;
                }
            } catch (C18218av | C19052aa e2) {
                return C60856cj.m92899h(e2);
            } catch (Throwable th2) {
                C19055b.m36519a(th, th2);
            }
        } catch (C18218av e3) {
            return C60856cj.m92899h(e3);
        }
    }

    /* renamed from: d */
    public final C60870cx mo105878d(C65191ey eyVar, C123166f fVar) {
        PortableAssistant portableAssistant = this.f340708a;
        Objects.requireNonNull(portableAssistant);
        return m202436h(eyVar, fVar, "getIntent", new C123090ad(portableAssistant));
    }

    /* renamed from: e */
    public final C60870cx mo105879e(C65191ey eyVar, C123166f fVar) {
        PortableAssistant portableAssistant = this.f340708a;
        Objects.requireNonNull(portableAssistant);
        return m202436h(eyVar, fVar, "getResponse", new C123090ad(portableAssistant));
    }

    /* renamed from: f */
    public final C60870cx mo105880f(C65275ia iaVar) {
        return (C60870cx) this.f340708a.mo24262h().map(new C123094ah(this, iaVar)).orElseGet(C123095ai.f340707a);
    }

    /* renamed from: g */
    public final C60870cx mo105881g(C62799s sVar) {
        return (C60870cx) this.f340708a.mo24262h().map(new C123092af(this, sVar)).orElseGet(C123093ag.f340704a);
    }
}
