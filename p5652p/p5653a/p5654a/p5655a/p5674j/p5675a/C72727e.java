package p5652p.p5653a.p5654a.p5655a.p5674j.p5675a;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.p1680c.p1681a.C19752a;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;
import p211b.p212a.p216d.C4665l;
import p211b.p212a.p223k.C4680a;
import p211b.p212a.p223k.C4681b;

/* renamed from: p.a.a.a.j.a.e */
/* compiled from: PG */
public class C72727e extends C20078ci {

    /* renamed from: a */
    public C4681b f193378a;

    public C72727e(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new NestedScrollView(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4681b.f14683f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4681b bVar = (C4681b) obj;
        this.f193378a = bVar;
        if ((bVar.f14685a & 1) != 0) {
            C4665l lVar = bVar.f14686b;
            if (lVar == null) {
                lVar = C4665l.f14619k;
            }
            mo25249w(C19752a.m37610c(lVar));
        }
        if (this.f193378a.f14687c.size() != 0) {
            mo25256A(this.f193378a.f14687c);
        }
        ((NestedScrollView) this.f56305p).setClipToOutline(true);
        mo25252z(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        if (list != null) {
            C4680a aVar = (C4680a) this.f193378a.toBuilder();
            aVar.copyOnWrite();
            ((C4681b) aVar.instance).f14687c = C4681b.emptyProtobufList();
            aVar.copyOnWrite();
            C4681b bVar = (C4681b) aVar.instance;
            C62971cq cqVar = bVar.f14687c;
            if (!cqVar.mo58948c()) {
                bVar.f14687c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) bVar.f14687c);
            this.f193378a = (C4681b) aVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C4681b.f14683f, this.f193378a);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
        ViewTreeObserver viewTreeObserver = ((NestedScrollView) this.f56305p).getViewTreeObserver();
        C72725c cVar = new C72725c(this);
        viewTreeObserver.addOnGlobalLayoutListener(cVar);
        ((NestedScrollView) this.f56305p).addOnAttachStateChangeListener(new C72726d(this, cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25252z(C56425d dVar) {
        super.mo25252z(dVar);
        ((NestedScrollView) this.f56305p).f6034d = new C72724b(this);
    }
}
