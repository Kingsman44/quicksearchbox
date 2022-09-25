package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C20021ar;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.elements.p1696a.C20376a;
import com.google.android.libraries.componentview.components.elements.p1696a.C20377b;
import com.google.android.libraries.componentview.components.elements.p1696a.C20379d;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.android.p10906l.p10907a.C146610a;
import com.google.android.p10906l.p10907a.C146612c;
import com.google.android.p10906l.p10907a.C146616g;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.elements.p */
/* compiled from: PG */
public class C20453p extends C20021ar {

    /* renamed from: a */
    private C20377b f57523a;

    public C20453p(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* renamed from: E */
    protected static final C146610a m38373E(Context context) {
        C146610a aVar = new C146610a(context);
        aVar.setOrientation(1);
        aVar.setClipToPadding(false);
        aVar.setClipChildren(false);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo25401D(C20379d dVar) {
        if ((dVar.f57301a & 1) != 0) {
            C19916aq aqVar = dVar.f57302b;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        return m38373E(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20377b.f57292f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20377b bVar = (C20377b) obj;
        this.f57523a = bVar;
        if (bVar.f57295b.size() != 0) {
            mo25256A(this.f57523a.f57295b);
        }
        C20377b bVar2 = this.f57523a;
        int i = bVar2.f57294a;
        if ((i & 2) != 0) {
            C20379d dVar2 = bVar2.f57297d;
            if (dVar2 == null) {
                dVar2 = C20379d.f57299c;
            }
            mo25401D(dVar2);
        } else if ((i & 1) != 0) {
            C19916aq aqVar = bVar2.f57296c;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C56425d mo25113i(List list) {
        if (list != null) {
            C20376a aVar = (C20376a) this.f57523a.toBuilder();
            aVar.copyOnWrite();
            ((C20377b) aVar.instance).f57295b = C20377b.emptyProtobufList();
            aVar.copyOnWrite();
            C20377b bVar = (C20377b) aVar.instance;
            C62971cq cqVar = bVar.f57295b;
            if (!cqVar.mo58948c()) {
                bVar.f57295b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) bVar.f57295b);
            this.f57523a = (C20377b) aVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20377b.f57292f, this.f57523a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: kE */
    public final void mo25188kE(int i) {
        C146616g a = C146610a.f395982a.mo123410a((C146610a) this.f56305p);
        a.f395990b.setColor(i);
        a.invalidateSelf();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ LinearLayout mo25196m(Context context) {
        return m38373E(context);
    }

    /* renamed from: p */
    public final void mo25192p(float f, float f2, float f3, float f4) {
        C146610a aVar = (C146610a) this.f56305p;
        C146612c cVar = C146610a.f395982a;
        C146616g a = cVar.mo123410a(aVar);
        if (f >= 0.0f) {
            float f5 = (float) ((int) (0.5f + f));
            if (a.f395994f != f5) {
                a.f395994f = f5;
                a.f395999k = true;
                a.invalidateSelf();
            }
            cVar.mo123411b(aVar);
            mo25257C(f, f2, f3, f4);
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo25251y(int i) {
        C146610a aVar = (C146610a) this.f56305p;
        float f = (float) i;
        C146612c cVar = C146610a.f395982a;
        C146616g a = cVar.mo123410a(aVar);
        a.mo123414c(a.f395998j, f);
        cVar.mo123411b(aVar);
        C146616g a2 = C146610a.f395982a.mo123410a((C146610a) this.f56305p);
        a2.mo123414c(f, a2.f395996h);
    }
}
