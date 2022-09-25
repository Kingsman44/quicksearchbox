package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6387k.p6388a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80822aa;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.libraries.lens.sdk.intent.C24943e;
import com.google.android.libraries.lens.sdk.intent.C24945g;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.common.p4522b.C58485gu;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62471cu;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.k.a.n */
/* compiled from: PG */
public final class C81841n extends FrameLayout {

    /* renamed from: a */
    public static final ColorDrawable f223829a = new ColorDrawable(0);

    /* renamed from: h */
    private static final ColorDrawable f223830h = new ColorDrawable(Color.argb(25, 0, 0, 0));

    /* renamed from: b */
    public final LayoutInflater f223831b;

    /* renamed from: c */
    public final C68214a f223832c;

    /* renamed from: d */
    public FrameLayout f223833d;

    /* renamed from: e */
    public Optional f223834e = Optional.empty();

    /* renamed from: f */
    public Optional f223835f = Optional.empty();

    /* renamed from: g */
    public String f223836g = BuildConfig.FLAVOR;

    public C81841n(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        this.f223831b = LayoutInflater.from(context).cloneInContext(context);
        this.f223832c = new C81838k(this, context);
        this.f223833d = new FrameLayout(context);
    }

    /* renamed from: a */
    public final int mo75366a(float f) {
        return (int) TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public final void mo75367b(C58485gu guVar, Bitmap bitmap, Optional optional) {
        C58485gu guVar2 = guVar;
        removeAllViews();
        if (!guVar.isEmpty()) {
            setBackground(f223830h);
        } else {
            setBackground(f223829a);
        }
        RectF[] rectFArr = (RectF[]) guVar2.toArray(new RectF[0]);
        for (int i = 0; i < guVar.size(); i++) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            ((C81993bc) this.f223835f.get()).mo75435f(frameLayout, 158430, false);
            frameLayout.setContentDescription(this.f223836g);
            RectF rectF = (RectF) guVar2.get(i);
            C81839l lVar = r0;
            C81839l lVar2 = new C81839l(this, optional, frameLayout, rectF, bitmap, optional.isPresent() ? Optional.m71637of((Bitmap) ((C58485gu) optional.get()).get(i)) : Optional.empty(), rectFArr);
            frameLayout.setOnClickListener(lVar);
            int a = mo75366a(48.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
            float f = ((float) a) / 2.0f;
            layoutParams.leftMargin = (int) ((rectF.centerX() * ((float) getWidth())) - f);
            layoutParams.topMargin = (int) ((rectF.centerY() * ((float) getHeight())) - f);
            frameLayout.setLayoutParams(layoutParams);
            int a2 = mo75366a(16.0f);
            frameLayout.setPadding(a2, a2, a2, a2);
            CardView cardView = new CardView(getContext());
            cardView.setLayoutParams(new FrameLayout.LayoutParams(mo75366a(16.0f), mo75366a(16.0f)));
            cardView.mo4473c(-1);
            cardView.setElevation(3.0f);
            cardView.mo4475e(((float) mo75366a(16.0f)) / 2.0f);
            frameLayout.setBackgroundColor(0);
            frameLayout.addView(cardView);
            addView(frameLayout, layoutParams);
            ((C81993bc) this.f223835f.get()).mo75435f(frameLayout, 158430, false);
        }
        ((C81993bc) this.f223835f.get()).mo75435f(getRootView(), 158623, false);
        ((C81993bc) this.f223835f.get()).mo75431b(getRootView());
        invalidate();
    }

    /* renamed from: c */
    public final void mo75368c(RectF rectF, Bitmap bitmap, RectF[] rectFArr) {
        C24943e eVar = new C24943e();
        eVar.f68071a.putByteArray("lens_init_params", C62471cu.f168676c.toByteArray());
        eVar.mo30178n(SystemClock.elapsedRealtimeNanos());
        eVar.f68071a.putLong("start_streaming_time_nanos", 0);
        eVar.mo30179o();
        eVar.mo30173i(C62433bj.UNKNOWN.f168594ao);
        eVar.f68071a.putInt("theme", 0);
        eVar.f68071a.putLong("handover_session_id", 0);
        eVar.mo30174j(false);
        eVar.mo30171g(getContext().getPackageName());
        eVar.mo30176l(new LensImage(bitmap));
        eVar.mo30177m(rectF);
        eVar.mo30173i(C62433bj.ASSISTANT_AVS_GLEAM.f168594ao);
        eVar.mo30172h(rectFArr);
        C24945g.m46175b(getContext(), eVar);
        C80859e eVar2 = (C80859e) C80831aj.f221751c.createBuilder();
        C80822aa aaVar = C80822aa.f221741a;
        eVar2.copyOnWrite();
        C80831aj ajVar = (C80831aj) eVar2.instance;
        aaVar.getClass();
        ajVar.f221754b = aaVar;
        ajVar.f221753a = 24;
        ((C81564g) this.f223834e.get()).mo73552a((C80831aj) eVar2.build());
    }
}
