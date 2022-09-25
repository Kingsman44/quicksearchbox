package com.google.android.libraries.componentview.components.p1693e;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C20018ao;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.p1693e.p1694a.C20350c;
import com.google.android.libraries.componentview.components.p1693e.p1694a.C20351d;
import com.google.android.libraries.componentview.components.p1693e.p1695b.C20355a;
import com.google.android.libraries.componentview.components.p1693e.p1695b.C20357c;
import com.google.android.libraries.componentview.components.p1693e.p1695b.C20358d;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20584bk;
import com.google.android.libraries.componentview.services.application.C20585bl;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.components.e.m */
/* compiled from: PG */
public class C20369m extends C20078ci {

    /* renamed from: a */
    public final ExecutorService f57261a;

    /* renamed from: b */
    protected C20355a f57262b;

    /* renamed from: c */
    protected final List f57263c = new ArrayList();

    /* renamed from: g */
    protected boolean[] f57264g;

    /* renamed from: h */
    protected C20358d f57265h;

    /* renamed from: i */
    protected int f57266i = 0;

    /* renamed from: j */
    public final C20601ca f57267j;

    /* renamed from: k */
    private C20351d f57268k;

    /* renamed from: l */
    private LinearLayout f57269l;

    public C20369m(Context context, C56425d dVar, C20537f fVar, Executor executor, ExecutorService executorService, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f57261a = executorService;
        this.f57267j = caVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo25256A(List list) {
        this.f57264g = new boolean[list.size()];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20470a a = this.f56326f.mo25450a(this, (C56425d) it.next());
            if (a == null) {
                C20598by G = mo25418G();
                G.mo25535e(C19742a.INVALID_CHILD);
                G.mo25536f("child is null!");
                C20520h.m38498c("FlippyCarouselComponent", G.mo25531a(), this.f57267j, new Object[0]);
            } else {
                this.f56324d.add(a);
                View kH = a.mo25098kH();
                if (kH != null) {
                    this.f57263c.add(kH);
                    if (a instanceof C20018ao) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        kH.setLayoutParams(layoutParams);
                        ((C20018ao) a).mo25194o(layoutParams);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f57269l = linearLayout;
        linearLayout.setOrientation(1);
        this.f57269l.setBackground(new ColorDrawable(-1));
        C20358d dVar = new C20358d(context);
        this.f57265h = dVar;
        dVar.mo9150o((int) (C20482m.m38433a(context) * 8.0f));
        this.f57262b = new C20355a(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) (C20482m.m38433a(context) * 30.0f));
        this.f57269l.addView(this.f57265h);
        this.f57269l.addView(this.f57262b, layoutParams);
        return this.f57269l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20351d.f57208d);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20351d dVar2 = (C20351d) obj;
        this.f57268k = dVar2;
        int i = dVar2.f57211b;
        if (i != 0) {
            this.f57266i = i;
        }
        mo25256A(dVar2.f57210a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C56425d mo25113i(List list) {
        C20350c cVar = (C20350c) this.f57268k.toBuilder();
        if (list != null) {
            cVar.copyOnWrite();
            ((C20351d) cVar.instance).f57210a = C20351d.emptyProtobufList();
            cVar.copyOnWrite();
            C20351d dVar = (C20351d) cVar.instance;
            C62971cq cqVar = dVar.f57210a;
            if (!cqVar.mo58948c()) {
                dVar.f57210a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) dVar.f57210a);
        }
        C56424c cVar2 = (C56424c) this.f57588z.toBuilder();
        cVar2.mo58885m(C20351d.f57208d, (C20351d) cVar.build());
        return (C56425d) cVar2.build();
    }

    /* renamed from: kJ */
    public void mo25116kJ() {
        C56429h hVar;
        this.f57265h.mo9146k(new C20357c(this.f57263c));
        C20358d dVar = this.f57265h;
        dVar.f13823g = new C20366j(this);
        C20355a aVar = this.f57262b;
        aVar.f57232a = dVar;
        dVar.mo9137f(aVar);
        int i = this.f57266i;
        if (i > 0) {
            this.f57265h.mo9147l(i);
        }
        int size = this.f56324d.size();
        int i2 = this.f57266i;
        if (size > i2 && this.f56324d.get(i2) != null && ((C20470a) this.f56324d.get(this.f57266i)).mo25419H() != null) {
            C56429h H = ((C20470a) this.f56324d.get(this.f57266i)).mo25419H();
            C56425d dVar2 = this.f57588z;
            if ((dVar2.f150539a & 4) != 0) {
                hVar = dVar2.f150542d;
                if (hVar == null) {
                    hVar = C56429h.f150547k;
                }
            } else {
                hVar = null;
            }
            mo25381m(H, hVar);
        }
    }

    /* renamed from: m */
    public final void mo25381m(C56429h hVar, C56429h hVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20585bl(hVar, C20584bk.SHOW));
        C20601ca caVar = this.f57267j;
        if (hVar2 != null) {
            this.f57261a.execute(new C20368l(this, caVar, C19742a.VISIBILITY_LOGGING_ERROR, hVar2, arrayList));
        }
    }
}
