package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30903ac;
import com.google.android.libraries.onegoogle.common.C30904ad;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.ba */
/* compiled from: PG */
abstract class C30373ba extends C0673gh {

    /* renamed from: a */
    public final Context f82107a;

    /* renamed from: b */
    public final C30897z f82108b;

    /* renamed from: c */
    public final DynamicCardRootView f82109c;

    /* renamed from: d */
    public final View f82110d;

    /* renamed from: e */
    public final ViewGroup f82111e;

    /* renamed from: f */
    public C30365at f82112f;

    public C30373ba(ViewGroup viewGroup, Context context, C30897z zVar) {
        super(LayoutInflater.from(context).inflate(R.layout.og_dynamic_card, viewGroup, false));
        this.f82107a = context;
        this.f82108b = zVar;
        DynamicCardRootView dynamicCardRootView = (DynamicCardRootView) this.itemView.findViewById(R.id.og_card);
        this.f82109c = dynamicCardRootView;
        dynamicCardRootView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup viewGroup2 = (ViewGroup) dynamicCardRootView.findViewById(R.id.og_card_content_root);
        this.f82111e = viewGroup2;
        View findViewById = dynamicCardRootView.findViewById(R.id.og_loading_card_view);
        this.f82110d = findViewById;
        m56559e(dynamicCardRootView, this.f82112f);
        mo35948d(viewGroup2, dynamicCardRootView);
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_icon_placeholder)).setImageDrawable(m56558b(new OvalShape()));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_title_placeholder)).setImageDrawable(m56558b(new RoundRectShape((float[]) null, (RectF) null, (float[]) null)));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_progress_placeholder)).setImageDrawable(m56558b(new RoundRectShape((float[]) null, (RectF) null, (float[]) null)));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_progress_desc_placeholder)).setImageDrawable(m56558b(new RoundRectShape((float[]) null, (RectF) null, (float[]) null)));
    }

    /* renamed from: b */
    private final PaintDrawable m56558b(Shape shape) {
        PaintDrawable paintDrawable = new PaintDrawable(C30904ad.m57690e(this.f82107a).mo36590d(C30903ac.COLOR_HAIRLINE));
        paintDrawable.setShape(shape);
        paintDrawable.setIntrinsicWidth(-1);
        paintDrawable.setIntrinsicHeight(-1);
        return paintDrawable;
    }

    /* renamed from: e */
    private static final void m56559e(DynamicCardRootView dynamicCardRootView, C30365at atVar) {
        if (dynamicCardRootView != null) {
            dynamicCardRootView.f82043a = atVar != null ? C58833ax.m90834k(Integer.valueOf(atVar.f82092g)) : C58836b.f156633a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35937a(C2391v vVar, C30365at atVar) {
        this.f82112f = atVar;
        m56559e(this.f82109c, atVar);
        this.f82109c.mo35630b(this.f82108b);
        atVar.mo35927a(vVar);
        atVar.f82088c.mo5704e(vVar, new C30367av(this));
        atVar.f82089d.mo5704e(vVar, new C30368aw(this));
        atVar.f82090e.mo5704e(vVar, new C30369ax(this));
        this.f82109c.post(new C30370ay(this, atVar, vVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo35947c(C2391v vVar) {
        this.f82109c.mo35632lk(this.f82108b);
        C58838bb.m90866a(this.f82112f, "setCardModel has to be called before attaching view.");
        this.f82112f.mo35928d();
        this.f82112f.f82088c.mo5707k(vVar);
        this.f82112f.f82089d.mo5707k(vVar);
        this.f82112f.f82090e.mo5707k(vVar);
        this.f82112f.f82091f.mo5707k(vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo35948d(ViewGroup viewGroup, ViewGroup viewGroup2);
}
