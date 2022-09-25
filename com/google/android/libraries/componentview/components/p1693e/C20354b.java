package com.google.android.libraries.componentview.components.p1693e;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20075cf;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.p1693e.p1694a.C20349b;
import com.google.android.libraries.componentview.components.p1693e.p1695b.C20356b;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20540i;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.componentview.components.e.b */
/* compiled from: PG */
public class C20354b extends C20075cf {

    /* renamed from: b */
    private static final int f57217b = Color.argb(PrivateKeyType.INVALID, 235, 235, 235);

    /* renamed from: c */
    private static final int f57218c = Color.argb(PrivateKeyType.INVALID, 245, 245, 245);

    /* renamed from: d */
    private static final int f57219d = Color.argb(138, 0, 0, 0);

    /* renamed from: a */
    protected final SettableFuture f57220a = new SettableFuture();

    /* renamed from: e */
    private C20356b f57221e;

    /* renamed from: f */
    private TextView f57222f;

    /* renamed from: g */
    private final C20540i f57223g;

    /* renamed from: h */
    private String f57224h;

    /* renamed from: i */
    private String f57225i;

    /* renamed from: j */
    private String f57226j;

    /* renamed from: k */
    private int f57227k;

    /* renamed from: l */
    private int f57228l;

    /* renamed from: m */
    private LinearLayout f57229m;

    public C20354b(Context context, C56425d dVar, C20540i iVar, C20601ca caVar) {
        super(context, dVar, caVar);
        this.f57223g = iVar;
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return this.f57220a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        mo25111g(this.f57588z);
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) (C20482m.m38433a(context) * 36.0f));
        linearLayout2.setBackgroundColor(this.f57228l);
        linearLayout.addView(linearLayout2, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) C20482m.m38433a(context));
        linearLayout3.setBackgroundColor(f57217b);
        linearLayout.addView(linearLayout3, layoutParams2);
        this.f57229m = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, (int) (C20482m.m38433a(context) * 70.0f));
        this.f57229m.setBackground(new ColorDrawable(f57218c));
        linearLayout.addView(this.f57229m, layoutParams3);
        if (!C58837ba.m90859h(this.f57225i) || !C58837ba.m90859h(this.f57226j)) {
            TextView textView = new TextView(context);
            this.f57222f = textView;
            textView.setTextSize(14.0f);
            this.f57222f.setTextColor(f57219d);
            this.f57222f.setPadding(0, (int) (C20482m.m38433a(context) * 20.0f), 0, 0);
            this.f57229m.setGravity(17);
            this.f57229m.addView(this.f57222f);
        }
        frameLayout.addView(linearLayout);
        C20356b bVar = new C20356b(context);
        this.f57221e = bVar;
        bVar.mo25379b((int) (C20482m.m38433a(context) * 40.0f));
        this.f57221e.setElevation((float) ((int) (C20482m.m38433a(context) * 6.0f)));
        this.f57221e.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f57221e.setImportantForAccessibility(2);
        if (!C58837ba.m90859h(this.f57224h)) {
            this.f57220a.mo57358p(this.f57223g.mo25455c(this.f57224h, this.f57221e, false, false));
        } else {
            this.f57221e.setImageResource(R.drawable.quantum_ic_expand_more_grey600_24);
            this.f57220a.mo57356n(new C19744c());
        }
        int a = (int) (C20482m.m38433a(context) * 8.0f);
        this.f57221e.setPadding(a, a, a, a);
        C20356b bVar2 = this.f57221e;
        bVar2.mo25378a(this.f57227k, bVar2.f57238b);
        C20356b bVar3 = this.f57221e;
        bVar3.mo25378a(bVar3.f57237a, 536870912);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.height = (int) (C20482m.m38433a(context) * 40.0f);
        layoutParams4.width = (int) (C20482m.m38433a(context) * 40.0f);
        layoutParams4.gravity = 1;
        layoutParams4.setMargins(0, (int) (C20482m.m38433a(context) * 16.0f), 0, 0);
        frameLayout.addView(this.f57221e, layoutParams4);
        C20347a aVar = new C20347a(this);
        this.f57221e.setOnClickListener(aVar);
        this.f57229m.setOnClickListener(aVar);
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20349b.f57199h);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20349b bVar = (C20349b) obj;
        int i = bVar.f57201a;
        if ((i & 1) != 0) {
            this.f57225i = bVar.f57202b;
        }
        if ((i & 16) != 0) {
            this.f57226j = bVar.f57206f;
        }
        if (!bVar.f57205e.isEmpty()) {
            this.f57224h = bVar.f57205e;
        }
        if ((bVar.f57201a & 2) != 0) {
            C19995r rVar = bVar.f57203c;
            if (rVar == null) {
                rVar = C19995r.f56032g;
            }
            this.f57227k = C20566at.m38590a(rVar);
        }
        if ((bVar.f57201a & 4) != 0) {
            C19995r rVar2 = bVar.f57204d;
            if (rVar2 == null) {
                rVar2 = C19995r.f56032g;
            }
            this.f57228l = C20566at.m38590a(rVar2);
        }
    }

    /* renamed from: p */
    public final void mo25192p(float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f && f4 <= 0.0f) {
            return;
        }
        if (this.f57229m.getBackground() instanceof ColorDrawable) {
            LinearLayout linearLayout = this.f57229m;
            linearLayout.setBackground(C20075cf.m37937t((ColorDrawable) linearLayout.getBackground(), 0.0f, 0.0f, f3, f4));
            return;
        }
        C20598by G = mo25418G();
        G.mo25535e(C19742a.ILLEGAL_UNEXPECTED_OR_OTHERWISE_SUSPICIOUS_CORNER_ROUNDING_INVOCATION_CIRCUMSTANCES);
        String valueOf = String.valueOf(((FrameLayout) this.f56305p).getBackground() == null ? "null" : ((FrameLayout) this.f56305p).getBackground().getClass());
        G.mo25536f("Expected ColorDrawable in FabFooterComponent.roundCorners(), but found " + valueOf + ".");
        C20520h.m38498c("FabFooterComponent", G.mo25531a(), this.f56308s, new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C20476g mo25238r() {
        return new C20361e(this.f57221e, this.f57222f, this.f57225i, this.f57226j);
    }
}
