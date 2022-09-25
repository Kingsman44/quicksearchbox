package com.google.android.libraries.componentview.components.p1691d;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.p1691d.p1692a.C20327b;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20540i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.d.e */
/* compiled from: PG */
public class C20337e extends C20061bs {

    /* renamed from: a */
    public C20327b f57151a;

    /* renamed from: b */
    public String f57152b;

    /* renamed from: c */
    public int f57153c;

    /* renamed from: d */
    public int f57154d;

    /* renamed from: e */
    public int f57155e;

    /* renamed from: f */
    public final C20540i f57156f;

    /* renamed from: g */
    public final Context f57157g;

    /* renamed from: h */
    protected final SettableFuture f57158h = new SettableFuture();

    /* renamed from: i */
    private ImageView f57159i;

    public C20337e(Context context, C56425d dVar, C20540i iVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f57156f = iVar;
        this.f57157g = context;
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return this.f57158h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        ImageView imageView = new ImageView(context);
        this.f57159i = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return this.f57159i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20327b.f57126d);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f57151a = (C20327b) obj;
    }

    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f56305p;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C20336d(this, view2));
        }
    }
}
