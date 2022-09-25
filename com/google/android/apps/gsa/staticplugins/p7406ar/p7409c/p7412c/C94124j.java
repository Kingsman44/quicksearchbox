package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7412c;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7411b.C94111a;
import com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7411b.C94114d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.c.j */
/* compiled from: PG */
public final class C94124j extends C22939d {

    /* renamed from: a */
    public final C94114d f262956a;

    /* renamed from: b */
    public final C94111a f262957b;

    /* renamed from: c */
    public final DisplayMetrics f262958c;

    /* renamed from: d */
    public final C68214a f262959d;

    /* renamed from: e */
    public final float f262960e;

    /* renamed from: f */
    public View f262961f;

    /* renamed from: g */
    public GestureDetector f262962g;

    /* renamed from: h */
    public boolean f262963h;

    /* renamed from: i */
    private final Context f262964i;

    /* renamed from: j */
    private View f262965j;

    public C94124j(C22945j jVar, C94114d dVar, Context context, C94111a aVar, C68214a aVar2) {
        super(jVar);
        this.f262956a = dVar;
        this.f262964i = context;
        this.f262957b = aVar;
        this.f262959d = aVar2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f262958c = displayMetrics;
        this.f262960e = Math.min(((float) displayMetrics.heightPixels) * 0.8f, ((float) displayMetrics.heightPixels) - TypedValue.applyDimension(1, 135.0f, displayMetrics));
    }

    /* renamed from: e */
    public final void mo88336e() {
        this.f262963h = true;
        this.f262961f.startAnimation(new C94123i(this.f262961f, (float) this.f262958c.heightPixels));
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f262964i).inflate(R.layout.explore_on_content_container, (ViewGroup) null);
        mo28295iC(inflate);
        View findViewById = inflate.findViewById(R.id.explore_layout);
        this.f262961f = findViewById;
        findViewById.getLayoutParams().height = (int) this.f262960e;
        this.f262961f.requestLayout();
        this.f262962g = new C94118d(this, this.f262964i, new C94122h(this));
        this.f262965j = mo28297il().findViewById(R.id.explore_header);
        ((C94126l) this.f262956a).f262968a.mo28685c(new C94119e(this, inflate));
        ((ImageView) mo28297il().findViewById(R.id.explore_header_close_button)).setOnClickListener(new C94115a(this));
        this.f262965j.setOnTouchListener(new C94116b(this));
        ((C94126l) this.f262956a).f262970c.mo28726b(new C94117c(this));
        inflate.setOnTouchListener(new C94120f(this));
    }
}
