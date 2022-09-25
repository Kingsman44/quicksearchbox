package p5652p.p5653a.p5654a.p5655a.p5672i.p5673a;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.p1680c.p1681a.C19752a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p211b.p212a.p222j.C4678a;
import p211b.p212a.p222j.C4679b;
import p211b.p212a.p227o.C4689b;

/* renamed from: p.a.a.a.i.a.b */
/* compiled from: PG */
public class C72720b extends C19898a {

    /* renamed from: a */
    private C4679b f193362a;

    /* renamed from: b */
    private C19926b f193363b;

    public C72720b(C56425d dVar, Context context, C20537f fVar, C20601ca caVar, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        return this.f193363b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C4679b bVar = this.f193362a;
        if ((bVar.f14678a & 1) == 0) {
            return null;
        }
        C56425d dVar = bVar.f14679b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C4678a aVar = (C4678a) this.f193362a.toBuilder();
            aVar.copyOnWrite();
            C4679b bVar = (C4679b) aVar.instance;
            bVar.f14679b = dVar;
            bVar.f14678a |= 1;
            this.f193362a = (C4679b) aVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C4679b.f14676e, this.f193362a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4679b.f14676e);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4679b bVar = (C4679b) obj;
        this.f193362a = bVar;
        C4689b bVar2 = bVar.f14680c;
        if (bVar2 == null) {
            bVar2 = C4689b.f14726d;
        }
        this.f193363b = C19752a.m37608a(bVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo25182l() {
        if (mo25098kH() instanceof Button) {
            return false;
        }
        return super.mo25182l();
    }
}
