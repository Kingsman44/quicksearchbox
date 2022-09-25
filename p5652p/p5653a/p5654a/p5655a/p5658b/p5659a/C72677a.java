package p5652p.p5653a.p5654a.p5655a.p5658b.p5659a;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C20081f;
import com.google.android.libraries.componentview.components.elements.C20469z;
import com.google.android.libraries.componentview.components.elements.p1696a.C20380e;
import com.google.android.libraries.componentview.components.elements.p1696a.C20381f;
import com.google.android.libraries.componentview.components.elements.p1696a.C20384i;
import com.google.android.libraries.componentview.components.elements.p1696a.C20385j;
import com.google.android.libraries.componentview.components.elements.views.C20460a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p211b.p212a.p214b.C4651b;

/* renamed from: p.a.a.a.b.a.a */
/* compiled from: PG */
public class C72677a extends C20469z implements C72683g {
    public C72677a(Context context, C56425d dVar, C20537f fVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, caVar, atVar);
    }

    /* renamed from: A */
    public final void mo64505A(View view, int i) {
        C20081f.m37970b(this.f56306q, "scroll", view, Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        super.mo25111g(dVar);
        C62940bt r0 = C62942bv.checkIsLite(C4651b.f14579g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4651b bVar = (C4651b) obj;
        if ((bVar.f14581a & 1) != 0 && bVar.f14583c) {
            View view = this.f56305p;
            if (!(((C20460a) view).mLayout instanceof LinearLayoutManager)) {
                C20520h.m38497b(6, "CACarouselLazy", (Throwable) null, "LayoutManager associated with RecyclerView is not an instance of LinearLayoutManager", new Object[0]);
                return;
            }
            C72682f fVar = new C72682f();
            fVar.mo3197g((RecyclerView) view);
            fVar.f193281c = this;
        }
    }

    /* renamed from: n */
    public final C20385j mo25416n(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4651b.f14579g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4651b bVar = (C4651b) obj;
        C20380e eVar = (C20380e) C20381f.f57303f.createBuilder();
        eVar.mo25383a(bVar.f14582b);
        int i = bVar.f14585e;
        eVar.copyOnWrite();
        C20381f fVar = (C20381f) eVar.instance;
        fVar.f57306a |= 1;
        fVar.f57308c = i;
        C20384i iVar = (C20384i) C20385j.f57318d.createBuilder();
        iVar.copyOnWrite();
        C20385j jVar = (C20385j) iVar.instance;
        C20381f fVar2 = (C20381f) eVar.build();
        fVar2.getClass();
        jVar.f57322b = fVar2;
        jVar.f57321a |= 1;
        int i2 = bVar.f14584d;
        iVar.copyOnWrite();
        C20385j jVar2 = (C20385j) iVar.instance;
        jVar2.f57321a |= 2;
        jVar2.f57323c = i2;
        return (C20385j) iVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C56425d mo25417o(C56425d dVar) {
        throw new UnsupportedOperationException();
    }
}
