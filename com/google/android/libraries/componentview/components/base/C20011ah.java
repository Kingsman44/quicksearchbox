package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.libraries.componentview.components.base.p1687a.C19932bf;
import com.google.android.libraries.componentview.components.base.p1687a.C19933bg;
import com.google.android.libraries.componentview.components.base.p1687a.C19941bo;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20587bn;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20540i;
import com.google.common.util.concurrent.C60887da;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.base.ah */
/* compiled from: PG */
public class C20011ah extends C20015al {

    /* renamed from: f */
    private C19933bg f56067f;

    public C20011ah(Context context, C56425d dVar, C20587bn bnVar, C20540i iVar, C20601ca caVar, C20621l lVar, C20566at atVar, Executor executor, C60887da daVar) {
        super(context, dVar, iVar, bnVar, caVar, atVar, lVar, executor, daVar);
    }

    /* renamed from: m */
    protected static final ImageButton m37804m(Context context) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setBackgroundColor(0);
        return imageButton;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        return m37804m(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19933bg.f55782d);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19933bg bgVar = (C19933bg) obj;
        this.f56067f = bgVar;
        if ((bgVar.f55784a & 1) != 0) {
            C19941bo boVar = bgVar.f55785b;
            if (boVar == null) {
                boVar = C19941bo.f55793q;
            }
            mo25191o(boVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ ImageView mo25187i(Context context) {
        return m37804m(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kE */
    public final void mo25188kE(int i) {
        ((ImageButton) this.f56305p).setBackgroundColor(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        Object obj;
        C56425d kz = super.mo25132kz(list);
        C19932bf bfVar = (C19932bf) this.f56067f.toBuilder();
        C62940bt r1 = C62942bv.checkIsLite(C19941bo.f55794r);
        kz.mo58887l(r1);
        Object l = kz.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C19941bo boVar = (C19941bo) obj;
        bfVar.copyOnWrite();
        C19933bg bgVar = (C19933bg) bfVar.instance;
        boVar.getClass();
        bgVar.f55785b = boVar;
        bgVar.f55784a |= 1;
        this.f56067f = (C19933bg) bfVar.build();
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19933bg.f55782d, this.f56067f);
        return (C56425d) cVar.build();
    }
}
