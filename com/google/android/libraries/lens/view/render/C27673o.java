package com.google.android.libraries.lens.view.render;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.view.livingsurfaces.C27270x;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.p1730f.C21370a;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62491dn;
import com.google.lens.p4708k.C62609q;
import com.google.lens.p4708k.C62610r;

/* renamed from: com.google.android.libraries.lens.view.render.o */
/* compiled from: PG */
final class C27673o {

    /* renamed from: a */
    public static final DecelerateInterpolator f75552a = new DecelerateInterpolator();

    /* renamed from: b */
    public final C27270x f75553b;

    /* renamed from: c */
    public final View f75554c;

    /* renamed from: d */
    public final Path f75555d;

    /* renamed from: e */
    public final Paint f75556e;

    /* renamed from: f */
    public final View f75557f;

    /* renamed from: g */
    public final Canvas f75558g;

    /* renamed from: h */
    public long f75559h = 0;

    /* renamed from: i */
    public boolean f75560i = false;

    /* renamed from: j */
    public float f75561j;

    /* renamed from: k */
    private final C21370a f75562k;

    /* renamed from: l */
    private final ViewGroup f75563l;

    /* renamed from: m */
    private long f75564m = 0;

    public C27673o(Context context, C21370a aVar, ViewGroup viewGroup) {
        this.f75562k = aVar;
        this.f75563l = viewGroup;
        this.f75555d = new Path();
        Paint paint = new Paint(1);
        this.f75556e = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C28134w.m52424a(2.0f, context));
        this.f75553b = new C27270x(context);
        this.f75554c = new C27672n(this, context);
        this.f75557f = new View(context);
        this.f75558g = new Canvas();
    }

    /* renamed from: b */
    public static C62491dn m51498b(C62610r rVar, View view) {
        C62609q qVar = rVar.f169044e;
        if (qVar == null) {
            qVar = C62609q.f169033d;
        }
        C62445bv bvVar = qVar.f169036b;
        if (bvVar == null) {
            bvVar = C62445bv.f168618e;
        }
        C62491dn dnVar = bvVar.f168622c;
        if (dnVar == null) {
            dnVar = C62491dn.f168710e;
        }
        return C24095c.m44765j(dnVar, new Size(view.getWidth(), view.getHeight()));
    }

    /* renamed from: a */
    public final long mo33163a() {
        return this.f75562k.mo26871c() - this.f75564m;
    }

    /* renamed from: c */
    public final void mo33164c(View view) {
        this.f75563l.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: d */
    public final void mo33165d(View view) {
        if (view.getParent() != null) {
            this.f75563l.removeView(view);
        }
    }

    /* renamed from: e */
    public final void mo33166e() {
        this.f75560i = false;
        this.f75564m = this.f75562k.mo26871c();
    }
}
