package p5652p.p5653a.p5654a.p5655a.p5666f.p5667a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.base.p1687a.C19917ar;
import com.google.android.libraries.componentview.components.base.p1687a.C19920au;
import com.google.android.libraries.componentview.p1680c.p1681a.C19752a;
import com.google.android.libraries.componentview.p1697d.C20482m;
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
import p211b.p212a.p216d.C4667n;
import p211b.p212a.p219g.C4672a;
import p211b.p212a.p219g.C4673b;

/* renamed from: p.a.a.a.f.a.e */
/* compiled from: PG */
public class C72703e extends C20078ci {

    /* renamed from: a */
    public LinearLayout f193316a;

    /* renamed from: b */
    public View f193317b;

    /* renamed from: c */
    public int f193318c;

    /* renamed from: g */
    public int f193319g = 0;

    /* renamed from: h */
    public int f193320h = 0;

    /* renamed from: i */
    public boolean f193321i = false;

    /* renamed from: j */
    public boolean f193322j = false;

    /* renamed from: k */
    private C4673b f193323k;

    public C72703e(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new LinearLayout(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4673b.f14648h);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f193323k = (C4673b) obj;
        ((LinearLayout) this.f56305p).setOrientation(1);
        C4673b bVar = this.f193323k;
        int a = C4667n.m13054a(bVar.f14653d);
        if (a == 0) {
            a = 1;
        }
        int a2 = C4667n.m13054a(bVar.f14654e);
        if (a2 == 0) {
            a2 = 1;
        }
        C19917ar arVar = (C19917ar) C19920au.f55724b.createBuilder();
        int i = 2;
        if (a != 1) {
            arVar.mo25183a(a == 2 ? 1 : a == 3 ? 9 : 3);
        }
        if (a2 != 1) {
            if (a2 != 2) {
                i = a2 == 3 ? 10 : 4;
            }
            arVar.mo25183a(i);
        }
        ((LinearLayout) this.f56305p).setGravity(C20482m.m38436d((C19920au) arVar.build()));
        C4673b bVar2 = this.f193323k;
        this.f193318c = bVar2.f14655f;
        if (bVar2.f14651b.size() != 0) {
            C72701c cVar = new C72701c(this, this.f56304o);
            this.f193316a = cVar;
            cVar.setOrientation(1);
            mo25256A(this.f193323k.f14651b);
            ((LinearLayout) this.f56305p).addView(this.f193316a, 0);
        }
        C4673b bVar3 = this.f193323k;
        if ((bVar3.f14650a & 1) != 0) {
            C4665l lVar = bVar3.f14652c;
            if (lVar == null) {
                lVar = C4665l.f14619k;
            }
            mo25249w(C19752a.m37610c(lVar));
        }
        View inflate = LayoutInflater.from(this.f56304o).inflate(R.layout.cml_expandable_list_button, (ViewGroup) null);
        this.f193317b = inflate;
        inflate.setOnClickListener(new C72699a(this));
        ((LinearLayout) this.f56305p).addView(this.f193317b, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        if (list != null) {
            C4672a aVar = (C4672a) this.f193323k.toBuilder();
            aVar.copyOnWrite();
            ((C4673b) aVar.instance).f14651b = C4673b.emptyProtobufList();
            aVar.copyOnWrite();
            C4673b bVar = (C4673b) aVar.instance;
            C62971cq cqVar = bVar.f14651b;
            if (!cqVar.mo58948c()) {
                bVar.f14651b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) bVar.f14651b);
            this.f193323k = (C4673b) aVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C4673b.f14648h, this.f193323k);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }

    /* renamed from: m */
    public final void mo64519m(ViewGroup viewGroup, int i) {
        while (i < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                mo64519m((ViewGroup) childAt, 0);
            } else if (childAt instanceof ImageView) {
                childAt.invalidate();
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo25259o(int i, View view) {
        this.f193316a.addView(view);
    }
}
