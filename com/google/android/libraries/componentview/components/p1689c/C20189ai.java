package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20179y;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20180z;
import com.google.android.libraries.componentview.components.p1693e.p1695b.C20356b;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.c.ai */
/* compiled from: PG */
public class C20189ai extends C20061bs {

    /* renamed from: a */
    C20180z f56652a;

    /* renamed from: b */
    private final C20524l f56653b;

    /* renamed from: c */
    private final C56429h f56654c;

    /* renamed from: d */
    private LinearLayout f56655d;

    /* renamed from: e */
    private LinearLayout f56656e;

    /* renamed from: f */
    private C20356b f56657f;

    /* renamed from: g */
    private C20356b f56658g;

    /* renamed from: h */
    private C19983f f56659h;

    /* renamed from: i */
    private int f56660i;

    /* renamed from: j */
    private boolean f56661j;

    /* renamed from: k */
    private final Executor f56662k;

    public C20189ai(C20524l lVar, Context context, C56425d dVar, C20601ca caVar, Executor executor, C20566at atVar) {
        super(context, dVar, caVar);
        this.f56653b = lVar;
        this.f56662k = executor;
        C56429h hVar = dVar.f150542d;
        this.f56654c = hVar == null ? C56429h.f150547k : hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f56655d = linearLayout;
        linearLayout.setOrientation(0);
        this.f56655d.setGravity(17);
        C20356b bVar = new C20356b(context);
        this.f56657f = bVar;
        bVar.setScaleType(ImageView.ScaleType.FIT_XY);
        C20356b bVar2 = this.f56657f;
        bVar2.mo25378a(-12417548, bVar2.f57238b);
        this.f56657f.setImageResource(R.drawable.quantum_ic_close_white_24);
        this.f56657f.setFocusable(true);
        this.f56655d.addView(this.f56657f);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f56656e = linearLayout2;
        linearLayout2.setBackgroundColor(-12417548);
        this.f56655d.addView(this.f56656e);
        C20356b bVar3 = new C20356b(context);
        this.f56658g = bVar3;
        bVar3.setScaleType(ImageView.ScaleType.FIT_XY);
        C20356b bVar4 = this.f56658g;
        bVar4.mo25378a(-12417548, bVar4.f57238b);
        this.f56658g.setImageResource(R.drawable.quantum_ic_navigation_white_24);
        this.f56658g.setFocusable(true);
        this.f56655d.addView(this.f56658g);
        return this.f56655d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20180z.f56619j);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20180z zVar = (C20180z) obj;
        this.f56652a = zVar;
        C19983f fVar = zVar.f56622b;
        if (fVar == null) {
            fVar = C19983f.f56002g;
        }
        this.f56659h = fVar;
        C20180z zVar2 = this.f56652a;
        this.f56660i = zVar2.f56624d;
        this.f56661j = zVar2.f56623c;
        this.f56657f.mo25379b((int) (C20482m.m38433a(this.f56304o) * ((float) zVar2.f56626f)));
        this.f56657f.setContentDescription(this.f56652a.f56627g);
        this.f56656e.setLayoutParams(new LinearLayout.LayoutParams((int) (C20482m.m38433a(this.f56304o) * 50.0f), (int) (C20482m.m38433a(this.f56304o) * ((float) this.f56652a.f56625e)), 1.0f));
        this.f56658g.mo25379b((int) (C20482m.m38433a(this.f56304o) * ((float) this.f56652a.f56626f)));
        this.f56658g.setContentDescription(this.f56652a.f56628h);
        this.f56655d.requestLayout();
        mo25282i(this.f56661j);
        this.f56658g.setOnClickListener(new C20186af(this));
    }

    /* renamed from: i */
    public final void mo25282i(boolean z) {
        this.f56661j = z;
        if (z) {
            this.f56657f.setOnClickListener(new C20187ag(this));
            C20185ae aeVar = new C20185ae(this.f56662k);
            aeVar.setDuration((long) this.f56660i);
            aeVar.f56647a = new C20188ah(this);
            this.f56656e.startAnimation(aeVar);
            return;
        }
        this.f56657f.setVisibility(4);
        this.f56656e.setVisibility(4);
        this.f56656e.clearAnimation();
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C20179y yVar = (C20179y) this.f56652a.toBuilder();
        yVar.copyOnWrite();
        C20180z zVar = (C20180z) yVar.instance;
        zVar.f56621a |= 2;
        zVar.f56623c = false;
        this.f56652a = (C20180z) yVar.build();
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20180z.f56619j, this.f56652a);
        return (C56425d) cVar.build();
    }

    /* renamed from: m */
    public final void mo25283m() {
        mo25282i(false);
        this.f56653b.mo25440b(this.f56659h, this.f56654c);
    }
}
