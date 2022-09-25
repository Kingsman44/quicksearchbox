package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.content.Context;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147445i;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40247a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40251e;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40252f;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.i */
/* compiled from: PG */
public final class C40137i {

    /* renamed from: a */
    public static final C59071e f105420a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.i");

    /* renamed from: b */
    public static final C147454r f105421b = new C147454r(300.0f, 0.7f);

    /* renamed from: c */
    public static final C147454r f105422c = new C147454r(300.0f, 0.6f);

    /* renamed from: d */
    public static final C147454r f105423d = new C147454r(3000.0f, 0.4f);

    /* renamed from: e */
    public final C40149u f105424e;

    /* renamed from: f */
    public final C40129aa f105425f;

    /* renamed from: g */
    public final C40111d f105426g;

    /* renamed from: h */
    public final View f105427h;

    /* renamed from: i */
    public final WindowManager f105428i;

    /* renamed from: j */
    public final DisplayManager f105429j;

    /* renamed from: k */
    public final C147445i f105430k;

    /* renamed from: l */
    public final C40130b f105431l;

    /* renamed from: m */
    public int f105432m = 0;

    /* renamed from: n */
    public final boolean f105433n;

    /* renamed from: o */
    public int f105434o = 1;

    /* renamed from: p */
    private final Context f105435p;

    /* renamed from: q */
    private final int f105436q;

    public C40137i(Context context, C40149u uVar, C40111d dVar, View view, C147445i iVar, int i, boolean z, C40129aa aaVar) {
        C40130b bVar = new C40130b();
        C147454r rVar = f105423d;
        bVar.f105403b.f397996b = rVar;
        bVar.f105404c.f397996b = rVar;
        this.f105431l = bVar;
        this.f105435p = context;
        this.f105424e = uVar;
        this.f105425f = aaVar;
        this.f105426g = dVar;
        this.f105427h = view;
        this.f105430k = iVar;
        this.f105428i = (WindowManager) context.getSystemService("window");
        this.f105429j = (DisplayManager) context.getSystemService("display");
        this.f105436q = i;
        this.f105433n = z;
    }

    /* renamed from: a */
    public final int mo42240a() {
        int height = this.f105427h.getHeight();
        int i = this.f105436q;
        return height - (i + i);
    }

    /* renamed from: b */
    public final int mo42241b() {
        int width = this.f105427h.getWidth();
        int i = this.f105436q;
        return width - (i + i);
    }

    /* renamed from: c */
    public final RectF mo42242c(C40248b bVar) {
        return C40251e.m69865b(bVar, mo42241b(), mo42240a());
    }

    /* renamed from: d */
    public final C40248b mo42243d(C40248b bVar) {
        return mo42244e(bVar.mo42347a(), bVar.mo42348b());
    }

    /* renamed from: e */
    public final C40248b mo42244e(float f, float f2) {
        C40130b bVar = this.f105431l;
        C147446j jVar = bVar.f105403b;
        float f3 = jVar.f397998d;
        float f4 = jVar.f397999e;
        if (f > (f3 + f4) / 2.0f) {
            f3 = f4;
        }
        C147446j jVar2 = bVar.f105404c;
        float f5 = jVar2.f397998d;
        float f6 = jVar2.f397999e;
        if (f2 < f5) {
            f2 = f5;
        } else if (f2 > f6) {
            f2 = f6;
        }
        return new C40247a(f3, f2);
    }

    /* renamed from: f */
    public final void mo42245f(C147454r rVar, C40248b bVar) {
        if (!bVar.equals(this.f105431l.mo42221b())) {
            this.f105431l.mo42223d(rVar, bVar);
        }
    }

    /* renamed from: g */
    public final void mo42246g(C40248b bVar) {
        mo42245f(f105422c, bVar);
        C40149u uVar = this.f105424e;
        uVar.mo42255b(this, mo42242c(bVar), uVar.mo42254a());
    }

    /* renamed from: h */
    public final void mo42247h() {
        DisplayManager displayManager = this.f105429j;
        displayManager.getClass();
        C40248b b = C40252f.m69868b(displayManager);
        View view = this.f105427h;
        view.getClass();
        C40247a aVar = (C40247a) b;
        int width = ((int) aVar.f105717a) - (this.f105427h.getWidth() / 2);
        Context context = this.f105435p;
        context.getClass();
        float dimension = context.getResources().getDimension(R.dimen.snap_rang_padding_bottom);
        int i = this.f105432m;
        int height = this.f105427h.getHeight();
        float f = aVar.f105718b;
        int height2 = this.f105427h.getHeight();
        C40130b bVar = this.f105431l;
        RectF rectF = new RectF((float) (view.getWidth() / 2), (float) (i + (height / 2)), (float) width, (f - (((float) height2) / 2.0f)) - dimension);
        bVar.f105403b.mo124187m(rectF.left, rectF.right);
        bVar.f105404c.mo124187m(rectF.top, rectF.bottom);
    }
}
