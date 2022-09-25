package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20075cf;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20138bh;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20540i;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.c.dl */
/* compiled from: PG */
public class C20273dl extends C20075cf {

    /* renamed from: a */
    protected final SettableFuture f56899a = new SettableFuture();

    /* renamed from: b */
    private final C20540i f56900b;

    /* renamed from: c */
    private C20138bh f56901c;

    /* renamed from: d */
    private String f56902d;

    /* renamed from: e */
    private String f56903e;

    public C20273dl(Context context, C56425d dVar, C20540i iVar, C20601ca caVar) {
        super(context, dVar, caVar);
        this.f56900b = iVar;
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return this.f56899a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setFocusable(true);
        imageView.setImportantForAccessibility(1);
        return imageView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20138bh.f56466g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20138bh bhVar = (C20138bh) obj;
        this.f56901c = bhVar;
        String str = bhVar.f56469b;
        if (!C58837ba.m90859h(str)) {
            this.f56899a.mo57358p(this.f56900b.mo25455c(str, (ImageView) this.f56305p, false, false));
        } else {
            ((ImageView) this.f56305p).setImageResource(R.drawable.quantum_ic_expand_more_black_24);
            this.f56899a.mo57356n(new C19744c());
        }
        C20138bh bhVar2 = this.f56901c;
        this.f56902d = bhVar2.f56471d;
        this.f56903e = bhVar2.f56472e;
        if ((bhVar2.f56468a & 2) != 0) {
            C19916aq aqVar = bhVar2.f56470c;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C20476g mo25238r() {
        return new C20277dp((ImageView) this.f56305p, this.f56902d, this.f56903e);
    }
}
