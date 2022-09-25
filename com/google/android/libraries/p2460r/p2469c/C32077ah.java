package com.google.android.libraries.p2460r.p2469c;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32051a;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32053c;

/* renamed from: com.google.android.libraries.r.c.ah */
/* compiled from: PG */
public final class C32077ah implements C32051a {

    /* renamed from: a */
    public final ImageView f86123a;

    /* renamed from: b */
    public boolean f86124b;

    /* renamed from: c */
    public Drawable f86125c;

    /* renamed from: d */
    private final ImageView.ScaleType f86126d;

    /* renamed from: e */
    private final long f86127e = SystemClock.elapsedRealtime();

    /* renamed from: f */
    private final Integer f86128f;

    /* renamed from: g */
    private final boolean f86129g;

    /* renamed from: h */
    private final C32127e f86130h;

    public C32077ah(ImageView imageView, ImageView.ScaleType scaleType, Integer num, boolean z, C32127e eVar) {
        this.f86123a = imageView;
        this.f86126d = scaleType;
        this.f86128f = num;
        this.f86129g = z;
        this.f86130h = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37836a(Object obj) {
        Drawable drawable;
        if (!this.f86124b && obj != null) {
            this.f86123a.setScaleType(this.f86126d);
            Drawable a = C32124bl.m59842a((Drawable) obj, this.f86128f);
            this.f86125c = a;
            if (!this.f86129g || SystemClock.elapsedRealtime() - this.f86127e <= ((Long) ((C32053c) this.f86130h.f86274c.f86117a.f86113d).f86109a).longValue()) {
                this.f86123a.setImageDrawable(a);
                this.f86123a.invalidate();
                return;
            }
            if (this.f86123a.getDrawable() != null) {
                drawable = this.f86123a.getDrawable();
            } else {
                drawable = new ColorDrawable(0);
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, a});
            this.f86123a.setImageDrawable(transitionDrawable);
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(300);
            this.f86123a.postDelayed(new C32076ag(this), 300);
        }
    }
}
