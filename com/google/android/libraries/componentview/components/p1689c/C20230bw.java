package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20129az;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.c.bw */
/* compiled from: PG */
public class C20230bw extends C20078ci {

    /* renamed from: a */
    public boolean f56808a;

    /* renamed from: b */
    public boolean f56809b;

    /* renamed from: c */
    private final C20601ca f56810c;

    /* renamed from: g */
    private C20129az f56811g;

    /* renamed from: h */
    private final C20610cj f56812h;

    public C20230bw(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20610cj cjVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f56810c = caVar;
        this.f56812h = cjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        C20229bv bvVar = new C20229bv(context, this);
        bvVar.setOrientation(1);
        return bvVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20129az.f56420d);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20129az azVar = (C20129az) obj;
        this.f56811g = azVar;
        this.f56809b = azVar.f56423b;
        if (azVar.f56422a.size() != 0) {
            mo25256A(this.f56811g.f56422a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        return this.f57588z;
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C20476g mo25238r() {
        C56429h hVar;
        ArrayList arrayList = new ArrayList();
        C58485gu K = mo25422K(C20223bp.class);
        int size = K.size();
        for (int i = 0; i < size; i++) {
            C20220bm bmVar = (C20220bm) ((C20470a) K.get(i)).mo25200ky();
            if (bmVar != null) {
                arrayList.add(bmVar);
            }
        }
        C20601ca caVar = this.f56810c;
        C56425d dVar = this.f57588z;
        if ((dVar.f150539a & 4) != 0) {
            hVar = dVar.f150542d;
            if (hVar == null) {
                hVar = C56429h.f150547k;
            }
        } else {
            hVar = null;
        }
        return new C20233bz(caVar, hVar, arrayList, this.f56811g.f56423b, this.f56812h, mo25097c());
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.f56809b = !this.f56809b;
            C20233bz bzVar = (C20233bz) this.f56307r;
            if (bzVar != null) {
                bzVar.mo25300f(this.f56305p, 0);
            }
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            this.f56808a = true;
            return true;
        }
    }
}
