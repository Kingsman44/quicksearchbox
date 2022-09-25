package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90255a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90337f;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97353e;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97354f;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97356h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.ai */
/* compiled from: PG */
public final class C97366ai extends C22939d implements C90255a {

    /* renamed from: a */
    public final Context f271920a;

    /* renamed from: b */
    public final C97353e f271921b;

    /* renamed from: c */
    public TextView f271922c;

    /* renamed from: d */
    private final C97356h f271923d;

    /* renamed from: e */
    private final C90337f f271924e;

    /* renamed from: f */
    private View f271925f;

    /* renamed from: g */
    private View f271926g;

    /* renamed from: h */
    private View f271927h;

    public C97366ai(C22945j jVar, Context context, C97356h hVar, C97353e eVar, C90323a aVar) {
        super(jVar);
        this.f271920a = context;
        this.f271923d = hVar;
        this.f271921b = eVar;
        this.f271924e = new C90337f(jVar, aVar, new C97365ah(this));
    }

    /* renamed from: a */
    public final void mo83969a() {
        View view = this.f271925f;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.f63126Q.mo28316z()) {
            C97353e eVar = this.f271921b;
            ((C97354f) eVar).f271882a.mo28345s("onDismissRequested", "ParticleDiscTooltipEventsDispatcher", new Bundle());
        }
    }

    /* renamed from: b */
    public final void mo83970b(View view) {
        this.f271927h = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo90666e(Rect rect) {
        if (this.f63126Q.mo28316z()) {
            if (this.f271925f == null || this.f271926g == null || this.f271922c == null) {
                this.f271921b.mo90658e();
                return;
            }
            View view = this.f271927h;
            if (view == null) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                boolean intersects = Rect.intersects(rect, new Rect(i, iArr[1], this.f271927h.getWidth() + i, iArr[1] + this.f271927h.getHeight()));
                C58976aa aaVar2 = C58975e.f156826a;
                if (intersects) {
                    this.f271921b.mo90658e();
                    return;
                }
            }
            int[] iArr2 = new int[2];
            mo28297il().getLocationOnScreen(iArr2);
            Rect rect2 = new Rect(rect);
            rect2.offset(-iArr2[0], -iArr2[1]);
            if (rect2.top < 0) {
                this.f271921b.mo90658e();
                return;
            }
            int max = Math.max(0, rect2.bottom - this.f271920a.getResources().getDimensionPixelSize(R.dimen.particle_disc_tooltip_top_margin_offset));
            int max2 = Math.max(0, ((rect2.right - rect2.left) / 2) - (this.f271920a.getResources().getDimensionPixelSize(R.dimen.particle_disc_tooltip_arrow_size) / 2));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f271926g.getLayoutParams();
            marginLayoutParams.setMarginEnd(max2);
            this.f271926g.setLayoutParams(marginLayoutParams);
            int max3 = Math.max(0, max2 - this.f271920a.getResources().getDimensionPixelOffset(R.dimen.particle_disc_tooltip_arrow_offset));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f271925f.getLayoutParams();
            marginLayoutParams2.topMargin = max;
            marginLayoutParams2.setMarginEnd(max3);
            this.f271925f.setLayoutParams(marginLayoutParams2);
            this.f271925f.setVisibility(0);
            C97353e eVar = this.f271921b;
            ((C97354f) eVar).f271882a.mo28345s("onShow", "ParticleDiscTooltipEventsDispatcher", new Bundle());
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        this.f271924e.mo84024a();
        View inflate = LayoutInflater.from(this.f271920a).inflate(R.layout.particle_disc_tooltip, (ViewGroup) null, false);
        mo28295iC(inflate);
        this.f271925f = inflate.findViewById(R.id.particle_disc_tooltip_container);
        this.f271926g = inflate.findViewById(R.id.particle_disc_tooltip_arrow);
        TextView textView = (TextView) inflate.findViewById(R.id.particle_disc_tooltip_body);
        this.f271922c = textView;
        textView.setOnClickListener(new C97361ad(this));
        ((C97370am) this.f271923d).f271942b.mo28726b(new C97362ae(this));
        ((C97370am) this.f271923d).f271941a.mo28726b(new C97363af(this));
    }
}
