package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.common.base.C58838bb;
import java.util.List;

/* compiled from: PG */
public final class GroupAvatarView extends View {

    /* renamed from: a */
    public C42031h f109760a;

    /* renamed from: b */
    public List f109761b;

    /* renamed from: c */
    public Paint f109762c;

    /* renamed from: d */
    public int f109763d;

    /* renamed from: e */
    public C42141b f109764e;

    /* renamed from: f */
    public int f109765f;

    /* renamed from: g */
    public final C42028e f109766g = new C42028e(this);

    /* renamed from: h */
    private int f109767h;

    /* renamed from: i */
    private int f109768i;

    /* renamed from: j */
    private Paint f109769j;

    /* renamed from: k */
    private Path f109770k;

    /* renamed from: l */
    private Path f109771l;

    /* renamed from: m */
    private Path f109772m;

    /* renamed from: n */
    private Path f109773n;

    /* renamed from: o */
    private Path f109774o;

    /* renamed from: p */
    private Path f109775p;

    /* renamed from: q */
    private Path f109776q;

    public GroupAvatarView(Context context) {
        super(context);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
    }

    /* renamed from: b */
    private final Path m73571b(RectF rectF, int i, int i2) {
        Path path = new Path();
        path.addArc(rectF, (float) i, (float) i2);
        if (i2 != 360) {
            path.lineTo((float) ((int) Math.ceil((double) (((float) this.f109767h) / 2.0f))), (float) ((int) Math.ceil((double) (((float) this.f109768i) / 2.0f))));
        }
        path.close();
        return path;
    }

    /* renamed from: c */
    private final void m73572c(Canvas canvas, boolean z) {
        canvas.drawLine((float) (z ? (this.f109767h / 2) - this.f109763d : 0), (float) (((int) Math.ceil((double) (((float) this.f109768i) / 2.0f))) - this.f109763d), (float) this.f109767h, (float) (((int) Math.ceil((double) (((float) this.f109768i) / 2.0f))) - this.f109763d), this.f109762c);
    }

    /* renamed from: d */
    private final void m73573d(Canvas canvas, Path path, int i) {
        Paint paint = this.f109760a.f109817i[i];
        if (paint != null) {
            canvas.drawPath(path, paint);
            return;
        }
        this.f109761b.get(i);
        canvas.drawPath(path, this.f109769j);
    }

    /* renamed from: e */
    private final void m73574e(Canvas canvas) {
        canvas.drawLine((float) (((int) Math.ceil((double) (((float) this.f109767h) / 2.0f))) - this.f109763d), 0.0f, (float) (((int) Math.ceil((double) (((float) this.f109767h) / 2.0f))) - this.f109763d), (float) this.f109768i, this.f109762c);
    }

    /* renamed from: f */
    private final void m73575f(Context context) {
        this.f109760a = new C42031h(context);
        this.f109763d = (int) Math.ceil((double) (((float) context.getResources().getDimensionPixelSize(R.dimen.peoplekit_group_avatar_border_width)) / 2.0f));
        Paint paint = new Paint(1);
        this.f109762c = paint;
        paint.setColor(-1);
        this.f109762c.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.f109762c;
        int i = this.f109763d;
        paint2.setStrokeWidth((float) (i + i));
        Paint paint3 = new Paint(1);
        this.f109769j = paint3;
        paint3.setColor(context.getResources().getColor(R.color.quantum_grey300));
    }

    /* renamed from: a */
    public final void mo44502a() {
        int i;
        if (this.f109765f != 0 && this.f109767h != 0 && (i = this.f109768i) != 0) {
            int ceil = (int) Math.ceil((double) (((float) i) / 2.0f));
            int ceil2 = (int) Math.ceil((double) (((float) this.f109767h) / 2.0f));
            int i2 = this.f109765f;
            int i3 = i2 - 1;
            if (i2 != 0) {
                boolean z = true;
                if (i3 == 0) {
                    C42031h hVar = this.f109760a;
                    C58838bb.m90868c(hVar.f109819k.size() >= 0);
                    for (int i4 = 0; i4 < hVar.f109819k.size(); i4++) {
                        C5572n nVar = (C5572n) hVar.f109819k.get(i4);
                        if (nVar != null) {
                            Context context = hVar.f109809a;
                            C5543d.m14323c(context).mo12423b(context).mo11890x(nVar);
                        }
                    }
                    C58838bb.m90883r(hVar.f109810b > 0);
                    if (hVar.f109811c <= 0) {
                        z = false;
                    }
                    C58838bb.m90883r(z);
                    C42030g gVar = new C42030g(hVar, hVar.f109810b, hVar.f109811c);
                    if (hVar.f109819k.size() - 1 < 0) {
                        hVar.f109819k.add(gVar);
                    } else {
                        hVar.f109819k.set(0, gVar);
                    }
                    Context context2 = hVar.f109809a;
                    C6007z d = C5543d.m14323c(context2).mo12423b(context2).mo11864b().mo11982o(hVar.f109813e).mo12446h(Integer.valueOf(hVar.f109814f)).mo12442d(hVar.f109816h);
                    d.mo12455s(gVar, (C5592i) null, d, C5622i.f16959a);
                } else if (i3 == 1) {
                    this.f109760a.mo44515b((Channel) this.f109761b.get(0), this.f109767h, this.f109768i, 0, this.f109764e);
                } else if (i3 == 2) {
                    int i5 = ceil2;
                    this.f109760a.mo44515b((Channel) this.f109761b.get(0), i5, this.f109768i, 0, this.f109764e);
                    this.f109760a.mo44515b((Channel) this.f109761b.get(1), i5, this.f109768i, 1, this.f109764e);
                } else if (i3 == 3) {
                    this.f109760a.mo44515b((Channel) this.f109761b.get(0), ceil2, this.f109768i, 0, this.f109764e);
                    int i6 = ceil2;
                    int i7 = ceil;
                    this.f109760a.mo44515b((Channel) this.f109761b.get(1), i6, i7, 1, this.f109764e);
                    this.f109760a.mo44515b((Channel) this.f109761b.get(2), i6, i7, 2, this.f109764e);
                } else if (i3 != 4) {
                    throw new IllegalStateException("Un-supported targetState : ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "FOUR_IMAGES" : "THREE_IMAGES" : "TWO_IMAGES" : "ONE_IMAGE" : "EMPTY"));
                } else {
                    for (int i8 = 0; i8 < this.f109761b.size(); i8++) {
                        this.f109760a.mo44515b((Channel) this.f109761b.get(i8), ceil2, ceil, i8, this.f109764e);
                    }
                }
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i = this.f109765f;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                canvas.drawPath(this.f109770k, this.f109762c);
                C42031h hVar = this.f109760a;
                if (hVar.f109815g != null) {
                    canvas.drawPath(this.f109770k, hVar.f109812d);
                }
            } else if (i2 == 1) {
                m73573d(canvas, this.f109770k, 0);
            } else if (i2 == 2) {
                m73573d(canvas, this.f109771l, 0);
                m73573d(canvas, this.f109772m, 1);
                m73574e(canvas);
            } else if (i2 != 3) {
                m73573d(canvas, this.f109773n, 0);
                m73573d(canvas, this.f109774o, 1);
                m73573d(canvas, this.f109775p, 2);
                m73573d(canvas, this.f109776q, 3);
                m73574e(canvas);
                m73572c(canvas, false);
            } else {
                m73573d(canvas, this.f109771l, 0);
                m73573d(canvas, this.f109774o, 1);
                m73573d(canvas, this.f109776q, 2);
                m73574e(canvas);
                m73572c(canvas, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int i5 = i - (paddingLeft + paddingRight);
            this.f109767h = i5;
            int i6 = i2 - (paddingTop + paddingBottom);
            this.f109768i = i6;
            C42031h hVar = this.f109760a;
            hVar.f109810b = i5;
            hVar.f109811c = i6;
            mo44502a();
            RectF rectF = new RectF(0.0f, 0.0f, (float) this.f109767h, (float) this.f109768i);
            this.f109770k = m73571b(rectF, 0, 360);
            this.f109771l = m73571b(rectF, 90, 180);
            this.f109772m = m73571b(rectF, 270, 180);
            this.f109773n = m73571b(rectF, 180, 90);
            this.f109774o = m73571b(rectF, 270, 90);
            this.f109775p = m73571b(rectF, 90, 90);
            this.f109776q = m73571b(rectF, 0, 90);
        }
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        m73575f(context);
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        m73575f(context);
    }
}
