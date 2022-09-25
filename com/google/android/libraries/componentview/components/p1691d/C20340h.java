package com.google.android.libraries.componentview.components.p1691d;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.p1691d.p1692a.C20333h;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.d.h */
/* compiled from: PG */
public class C20340h extends C20061bs {

    /* renamed from: a */
    public View f57168a;

    /* renamed from: b */
    public View f57169b;

    /* renamed from: c */
    private final C20537f f57170c;

    /* renamed from: d */
    private LinearLayout f57171d;

    /* renamed from: e */
    private boolean f57172e;

    /* renamed from: f */
    private C56425d f57173f;

    /* renamed from: g */
    private C56425d f57174g;

    public C20340h(Context context, C56425d dVar, C20601ca caVar, C20537f fVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f57170c = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f57171d = linearLayout;
        linearLayout.setOrientation(1);
        return this.f57171d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C56425d dVar2;
        View kH;
        C62940bt r0 = C62942bv.checkIsLite(C20333h.f57142f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20333h hVar = (C20333h) obj;
        this.f57172e = hVar.f57145b;
        int i = hVar.f57144a;
        C56425d dVar3 = null;
        if ((i & 4) != 0) {
            dVar2 = hVar.f57147d;
            if (dVar2 == null) {
                dVar2 = C56425d.f150537g;
            }
        } else {
            dVar2 = null;
        }
        this.f57174g = dVar2;
        if ((i & 2) != 0 && (dVar3 = hVar.f57146c) == null) {
            dVar3 = C56425d.f150537g;
        }
        this.f57173f = dVar3;
        C56425d dVar4 = this.f57174g;
        if (dVar4 != null) {
            C20470a a = this.f57170c.mo25450a(this, dVar4);
            if (!(a == null || (kH = a.mo25098kH()) == null)) {
                this.f57169b = kH;
                this.f57171d.addView(kH);
                if (this.f57172e) {
                    this.f57169b.setVisibility(8);
                }
            }
        } else {
            C20520h.m38497b(6, "TripComponent", new IllegalStateException(), "Could not find deselected view", new Object[0]);
        }
        C56425d dVar5 = this.f57173f;
        if (dVar5 != null) {
            C20470a a2 = this.f57170c.mo25450a(this, dVar5);
            if (a2 != null) {
                View kH2 = a2.mo25098kH();
                if (kH2 != null) {
                    this.f57168a = kH2;
                    this.f57171d.addView(kH2);
                    if (!this.f57172e) {
                        this.f57168a.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            C20520h.m38497b(6, "TripComponent", new IllegalStateException(), "Could not find selected view", new Object[0]);
        }
    }
}
