package p5652p.p5653a.p5654a.p5655a.p5680m.p5681a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.p1680c.p1681a.C19752a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4463ce.p4464a.p4465a.p4466a.p4469b.C58053a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4665l;
import p211b.p212a.p226n.C4686a;
import p211b.p212a.p226n.C4687b;

/* renamed from: p.a.a.a.m.a.c */
/* compiled from: PG */
public class C72750c extends C20061bs {

    /* renamed from: a */
    private C4687b f193419a;

    /* renamed from: b */
    private Switch f193420b;

    public C72750c(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Switch switchR = new Switch(context);
        this.f193420b = switchR;
        switchR.setMinHeight((int) (C20482m.m38433a(context) * 48.0f));
        linearLayout.addView(this.f193420b);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4687b.f14717i);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4687b bVar = (C4687b) obj;
        this.f193419a = bVar;
        C4665l lVar = bVar.f14724f;
        if (lVar == null) {
            lVar = C4665l.f14619k;
        }
        mo25249w(C19752a.m37610c(lVar));
        this.f193420b.setText(this.f193419a.f14721c);
        Switch switchR = this.f193420b;
        C4659f fVar = this.f193419a.f14722d;
        if (fVar == null) {
            fVar = C4659f.f14603e;
        }
        switchR.setTextColor(C58053a.m88812a(fVar));
        float f = this.f193419a.f14723e;
        if (f > 0.0f) {
            this.f193420b.setTextSize(f);
        }
        this.f193420b.setChecked(this.f193419a.f14720b);
        this.f193420b.setEnabled(!this.f193419a.f14725g);
        this.f193420b.setClickable(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C56425d dVar = this.f57588z;
        C4686a aVar = (C4686a) this.f193419a.toBuilder();
        boolean isChecked = this.f193420b.isChecked();
        aVar.copyOnWrite();
        C4687b bVar = (C4687b) aVar.instance;
        bVar.f14719a |= 1;
        bVar.f14720b = isChecked;
        this.f193419a = (C4687b) aVar.build();
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C4687b.f14717i, this.f193419a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25252z(C56425d dVar) {
        super.mo25252z(dVar);
        this.f193420b.setOnCheckedChangeListener(new C72749b(this));
    }
}
