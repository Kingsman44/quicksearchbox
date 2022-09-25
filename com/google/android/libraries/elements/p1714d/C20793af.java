package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentObserver;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.p1727f.C21166o;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.p5166b.C66086at;
import com.google.protos.youtube.elements.p5166b.C66094ba;
import com.google.protos.youtube.elements.p5166b.C66095bb;
import com.google.protos.youtube.elements.p5166b.C66096bc;
import com.google.protos.youtube.elements.p5166b.C66097bd;
import com.google.protos.youtube.elements.p5166b.C66105j;
import com.youtube.android.libraries.elements.StatusOr;
import com.youtube.p5283a.p5284a.C68039ab;
import java.nio.ByteBuffer;
import p5488io.grpc.Status;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69977g;

/* renamed from: com.google.android.libraries.elements.d.af */
/* compiled from: PG */
final class C20793af extends ComponentObserver {

    /* renamed from: a */
    final /* synthetic */ C21319z f58170a;

    /* renamed from: b */
    final /* synthetic */ C21292ch f58171b;

    /* renamed from: c */
    final /* synthetic */ ByteBuffer f58172c;

    /* renamed from: d */
    final /* synthetic */ Component f58173d;

    /* renamed from: e */
    final /* synthetic */ C21166o f58174e;

    /* renamed from: f */
    final /* synthetic */ C20794ag f58175f;

    /* renamed from: g */
    final /* synthetic */ C69977g f58176g;

    public C20793af(C20794ag agVar, C21319z zVar, C21292ch chVar, ByteBuffer byteBuffer, Component component, C69977g gVar, C21166o oVar) {
        this.f58175f = agVar;
        this.f58170a = zVar;
        this.f58171b = chVar;
        this.f58172c = byteBuffer;
        this.f58173d = component;
        this.f58176g = gVar;
        this.f58174e = oVar;
    }

    public final synchronized Status componentDidUpdate(Component component) {
        C68039ab abVar;
        C66086at f = this.f58175f.f58191m.mo26165b() ? C21168q.m39752f(this.f58170a) : null;
        try {
            C20794ag agVar = this.f58175f;
            C21292ch chVar = this.f58171b;
            ByteBuffer byteBuffer = this.f58172c;
            chVar.mo26282j();
            if (f != null) {
                C66094ba baVar = (C66094ba) C66095bb.f179730d.createBuilder();
                baVar.copyOnWrite();
                C66095bb bbVar = (C66095bb) baVar.instance;
                bbVar.f179733b = f;
                bbVar.f179732a |= 1;
                String c = C20794ag.m39030c(byteBuffer);
                baVar.copyOnWrite();
                C66095bb bbVar2 = (C66095bb) baVar.instance;
                c.getClass();
                bbVar2.f179732a |= 2;
                bbVar2.f179734c = c;
                C66095bb bbVar3 = (C66095bb) baVar.build();
                C66096bc bcVar = (C66096bc) C66097bd.f179735e.createBuilder();
                C63042fg d = C21168q.m39750d();
                bcVar.copyOnWrite();
                C66097bd bdVar = (C66097bd) bcVar.instance;
                d.getClass();
                bdVar.f179740d = d;
                bdVar.f179737a |= 1;
                bcVar.copyOnWrite();
                C66097bd bdVar2 = (C66097bd) bcVar.instance;
                bbVar3.getClass();
                bdVar2.f179739c = bbVar3;
                bdVar2.f179738b = 2;
                ((DebuggerClient) agVar.f58190l.mo17428b()).sendTimelineEvent(((C66097bd) bcVar.build()).toByteArray());
            }
            StatusOr materialize = this.f58173d.materialize(true);
            byte[] bArr = (byte[]) materialize.value;
            if (bArr == null) {
                C21260bc bcVar2 = new C21260bc("Error materializing SharedComponentType: " + String.valueOf(materialize.status), materialize.status.asException());
                this.f58176g.mo61551a(bcVar2);
                Status d2 = Status.m102100d(bcVar2);
                this.f58175f.mo25878d(this.f58171b, f, this.f58173d, (C68039ab) null, this.f58170a);
                return d2;
            }
            abVar = C68039ab.m98253j(ByteBuffer.wrap(bArr));
            try {
                C20794ag agVar2 = this.f58175f;
                Component component2 = this.f58173d;
                C21166o oVar = this.f58174e;
                if (agVar2.f58191m.mo26164a()) {
                    if (oVar != null) {
                        C66105j e = C21168q.m39751e(abVar, C21279bv.m40118b(component2.debugLatestModel()), component2.latestEntitiesConfig(), oVar.f59368c);
                        if (e != null) {
                            oVar.mo26195a(e);
                        }
                    }
                }
                C20814b bVar = new C20814b(abVar, this.f58174e);
                this.f58175f.mo25878d(this.f58171b, f, this.f58173d, abVar, this.f58170a);
                this.f58176g.mo61552b(bVar);
                return Status.f186902OK;
            } catch (Throwable th) {
                th = th;
                this.f58175f.mo25878d(this.f58171b, f, this.f58173d, abVar, this.f58170a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            abVar = null;
            this.f58175f.mo25878d(this.f58171b, f, this.f58173d, abVar, this.f58170a);
            throw th;
        }
    }
}
