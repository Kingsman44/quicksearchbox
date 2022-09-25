package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p1998a.C24094b;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.common.p1998a.C24099g;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60752i;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.gleam.at */
/* compiled from: PG */
public class C26461at extends C26447af {

    /* renamed from: g */
    private static final DecelerateInterpolator f72066g = new DecelerateInterpolator();

    /* renamed from: A */
    private float f72067A;

    /* renamed from: B */
    private RectF f72068B;

    /* renamed from: C */
    private RectF f72069C;

    /* renamed from: t */
    public final C26577ex f72070t;

    /* renamed from: u */
    protected C58833ax f72071u = C58836b.f156633a;

    /* renamed from: v */
    protected String f72072v = BuildConfig.FLAVOR;

    /* renamed from: w */
    private final Path f72073w;

    /* renamed from: x */
    private final Paint f72074x;

    /* renamed from: y */
    private final Rect f72075y;

    /* renamed from: z */
    private C62491dn f72076z;

    public C26461at(Context context, C26553ed edVar, C21370a aVar, C25308ap apVar, int i, int i2, C26244b bVar) {
        super(context, edVar, aVar, apVar, i, i2, bVar);
        Rect rect = new Rect();
        this.f72075y = rect;
        C26577ex exVar = new C26577ex(context);
        this.f72070t = exVar;
        this.f72073w = new Path();
        TextPaint c = exVar.mo31836c();
        String str = this.f72072v;
        c.getTextBounds(str, 0, str.length(), rect);
        float f = exVar.f72440d;
        this.f72067A = f + f + exVar.f72439c + ((float) rect.width()) + exVar.f72441e;
        this.f72074x = new Paint(exVar.mo31836c());
    }

    /* renamed from: O */
    private final boolean m48831O(PointF pointF) {
        C62491dn dnVar = this.f72076z;
        if (dnVar == null) {
            return false;
        }
        if (C24099g.m44773b(dnVar, pointF) || (mo31714N() && this.f72069C.contains(pointF.x, pointF.y))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo31672B() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public float mo31701C() {
        return this.f72070t.f72443g;
    }

    /* renamed from: D */
    public float mo31702D() {
        return this.f71998i.getResources().getDimension(R.dimen.planar_gleam_default_stroke_width) / this.f71997h.mo31819a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public int mo31703E() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo31704F() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo31705G(Canvas canvas, C62491dn dnVar, Path path) {
        canvas.drawPath(path, this.f72070t.mo31835b());
        canvas.drawPath(path, this.f72070t.mo31834a(mo31702D()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final float mo31708H() {
        RectF rectF = this.f71967e;
        return C60752i.m92727a(Math.min(mo31658h() * (rectF.width() + ((float) mo31703E())), mo31658h() * (rectF.height() + ((float) mo31704F()))) / 6.0f, this.f72070t.f72442f, mo31701C());
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo31709I() {
        TextPaint c = this.f72070t.mo31836c();
        String str = this.f72072v;
        c.getTextBounds(str, 0, str.length(), this.f72075y);
        if (this.f72071u.mo56113h()) {
            C26577ex exVar = this.f72070t;
            float f = exVar.f72440d;
            this.f72067A = f + f + exVar.f72439c + ((float) this.f72075y.width()) + this.f72070t.f72441e;
            return;
        }
        int width = this.f72075y.width();
        float f2 = this.f72070t.f72441e;
        this.f72067A = ((float) width) + f2 + f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo31710J() {
        C62491dn dnVar = this.f72076z;
        if (dnVar != null) {
            C58485gu e = C24095c.m44760e(dnVar.f168713b);
            this.f72073w.reset();
            int size = e.size();
            int i = 0;
            while (i < size) {
                PointF c = C24094b.m44754c((PointF) e.get(i), (PointF) e.get(((i + size) - 1) % size), mo31708H());
                PointF c2 = C24094b.m44754c((PointF) e.get(i), (PointF) e.get((i + 1) % size), mo31708H());
                if (i == 0) {
                    this.f72073w.moveTo(c.x, c.y);
                    i = 0;
                }
                this.f72073w.cubicTo(c.x, c.y, ((PointF) e.get(i)).x, ((PointF) e.get(i)).y, c2.x, c2.y);
                if (i != size) {
                    PointF c3 = C24094b.m44754c((PointF) e.get((i + 1) % size), (PointF) e.get(i), mo31708H());
                    this.f72073w.lineTo(c3.x, c3.y);
                }
                i++;
            }
            this.f72073w.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo31711K(Drawable drawable) {
        this.f72071u = C58833ax.m90834k(drawable);
        mo31709I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo31712L() {
        mo31713M(f72066g.getInterpolation(Math.min(((float) mo31676t()) / 248.0f, 1.0f)) * mo31658h(), mo31703E(), mo31704F());
        mo31710J();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a2, code lost:
        r5 = com.google.lens.p4707j.C62580n.m94802a(r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0187 A[LOOP:1: B:33:0x0181->B:35:0x0187, LOOP_END] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31713M(float r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r16.mo31662l()
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0031
            com.google.android.libraries.lens.view.am.ap r1 = r0.f71963a
            com.google.lens.j.bv r1 = r1.f68847h
            if (r1 != 0) goto L_0x0012
            com.google.lens.j.bv r1 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x0012:
            int r1 = r1.f168620a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0031
            com.google.android.libraries.lens.view.am.ap r1 = r0.f71963a
            com.google.lens.j.bv r1 = r1.f68847h
            if (r1 != 0) goto L_0x001f
            com.google.lens.j.bv r1 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x001f:
            com.google.lens.j.dn r1 = r1.f168622c
            if (r1 != 0) goto L_0x0025
            com.google.lens.j.dn r1 = com.google.lens.p4707j.C62491dn.f168710e
        L_0x0025:
            android.util.Size r4 = r0.f71966d
            com.google.lens.j.dn r1 = com.google.android.libraries.lens.common.p1998a.C24095c.m44765j(r1, r4)
            android.graphics.PointF r4 = com.google.android.libraries.lens.common.p1998a.C24101i.m44774a(r1)
            goto L_0x0168
        L_0x0031:
            r1 = r18
            float r1 = (float) r1
            android.content.Context r4 = r0.f71998i
            float r1 = com.google.android.libraries.lens.view.utils.C28134w.m52424a(r1, r4)
            android.util.Size r4 = r0.f71966d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            r4 = r19
            float r4 = (float) r4
            android.content.Context r5 = r0.f71998i
            float r4 = com.google.android.libraries.lens.view.utils.C28134w.m52424a(r4, r5)
            android.util.Size r5 = r0.f71966d
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            com.google.android.libraries.lens.view.am.ap r5 = r0.f71963a
            com.google.lens.j.bv r5 = r5.f68847h
            if (r5 != 0) goto L_0x005b
            com.google.lens.j.bv r5 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x005b:
            com.google.lens.j.br r5 = r5.f168621b
            if (r5 != 0) goto L_0x0061
            com.google.lens.j.br r5 = com.google.lens.p4707j.C62441br.f168608h
        L_0x0061:
            com.google.protobuf.bn r6 = r5.toBuilder()
            com.google.lens.j.bq r6 = (com.google.lens.p4707j.C62440bq) r6
            float r7 = r5.f168613d
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.lens.j.br r8 = (com.google.lens.p4707j.C62441br) r8
            int r9 = r8.f168610a
            r10 = 4
            r9 = r9 | r10
            r8.f168610a = r9
            float r7 = r7 + r1
            r8.f168613d = r7
            float r1 = r5.f168614e
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.lens.j.br r5 = (com.google.lens.p4707j.C62441br) r5
            int r7 = r5.f168610a
            r7 = r7 | 8
            r5.f168610a = r7
            float r1 = r1 + r4
            r5.f168614e = r1
            com.google.protobuf.bv r1 = r6.build()
            com.google.lens.j.br r1 = (com.google.lens.p4707j.C62441br) r1
            android.util.Size r4 = r0.f71966d
            int r5 = r1.f168616g
            int r6 = com.google.lens.p4707j.C62580n.m94802a(r5)
            r7 = 3
            r8 = 0
            if (r6 != 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            if (r6 != r7) goto L_0x00a2
        L_0x00a0:
            r5 = 1
            goto L_0x00ad
        L_0x00a2:
            int r5 = com.google.lens.p4707j.C62580n.m94802a(r5)
            if (r5 != 0) goto L_0x00aa
        L_0x00a8:
            r5 = 0
            goto L_0x00ad
        L_0x00aa:
            if (r5 != r3) goto L_0x00a8
            goto L_0x00a0
        L_0x00ad:
            com.google.common.base.C58838bb.m90868c(r5)
            com.google.lens.j.dn r5 = com.google.lens.p4707j.C62491dn.f168710e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.lens.j.di r5 = (com.google.lens.p4707j.C62486di) r5
            com.google.lens.j.dm r6 = com.google.lens.p4707j.C62490dm.COUNTER_CLOCKWISE
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.lens.j.dn r9 = (com.google.lens.p4707j.C62491dn) r9
            int r6 = r6.f168709d
            r9.f168714c = r6
            int r6 = r9.f168712a
            r6 = r6 | r2
            r9.f168712a = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.j.dn r6 = (com.google.lens.p4707j.C62491dn) r6
            r6.f168715d = r3
            int r9 = r6.f168712a
            r9 = r9 | r3
            r6.f168712a = r9
            com.google.lens.j.br r4 = com.google.android.libraries.lens.common.p1998a.C24095c.m44762g(r1, r4)
            float r6 = r4.f168611b
            float r9 = r4.f168612c
            float r11 = r4.f168613d
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            float r13 = r6 - r11
            float r11 = r11 + r6
            float r14 = r4.f168614e
            float r14 = r14 / r12
            float r12 = r9 - r14
            float r14 = r14 + r9
            float r4 = r4.f168615f
            android.graphics.PointF[] r15 = new android.graphics.PointF[r10]
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>(r13, r12)
            r15[r8] = r10
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>(r13, r14)
            r15[r2] = r10
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>(r11, r14)
            r15[r3] = r10
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>(r11, r12)
            r15[r7] = r10
            android.graphics.PointF[] r4 = com.google.android.libraries.lens.common.p1998a.C24097e.m44768b(r6, r9, r4, r3, r15)
            r6 = 4
        L_0x0113:
            if (r8 >= r6) goto L_0x0145
            r7 = r4[r8]
            com.google.lens.j.dk r9 = com.google.lens.p4707j.C62488dk.f168699d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.lens.j.dj r9 = (com.google.lens.p4707j.C62487dj) r9
            float r10 = r7.x
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.lens.j.dk r11 = (com.google.lens.p4707j.C62488dk) r11
            int r12 = r11.f168701a
            r12 = r12 | r2
            r11.f168701a = r12
            r11.f168702b = r10
            float r7 = r7.y
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.lens.j.dk r10 = (com.google.lens.p4707j.C62488dk) r10
            int r11 = r10.f168701a
            r11 = r11 | r3
            r10.f168701a = r11
            r10.f168703c = r7
            r5.mo58499b(r9)
            int r8 = r8 + 1
            goto L_0x0113
        L_0x0145:
            com.google.protobuf.bv r4 = r5.build()
            com.google.lens.j.dn r4 = (com.google.lens.p4707j.C62491dn) r4
            android.graphics.PointF r5 = new android.graphics.PointF
            float r6 = r1.f168611b
            android.util.Size r7 = r0.f71966d
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r6 = r6 * r7
            float r1 = r1.f168612c
            android.util.Size r7 = r0.f71966d
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r1 = r1 * r7
            r5.<init>(r6, r1)
            r1 = r4
            r4 = r5
        L_0x0168:
            com.google.protobuf.bn r5 = r1.toBuilder()
            com.google.lens.j.di r5 = (com.google.lens.p4707j.C62486di) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.j.dn r6 = (com.google.lens.p4707j.C62491dn) r6
            com.google.protobuf.cq r7 = com.google.lens.p4707j.C62491dn.emptyProtobufList()
            r6.f168713b = r7
            com.google.protobuf.cq r1 = r1.f168713b
            java.util.Iterator r1 = r1.iterator()
        L_0x0181:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x01c9
            java.lang.Object r6 = r1.next()
            com.google.lens.j.dk r6 = (com.google.lens.p4707j.C62488dk) r6
            android.graphics.PointF r6 = com.google.android.libraries.lens.common.p1998a.C24095c.m44758c(r6)
            r7 = r17
            android.graphics.PointF r6 = com.google.android.libraries.lens.common.p1998a.C24094b.m44755d(r4, r6, r7)
            com.google.lens.j.dk r8 = com.google.lens.p4707j.C62488dk.f168699d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.lens.j.dj r8 = (com.google.lens.p4707j.C62487dj) r8
            float r9 = r6.x
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.lens.j.dk r10 = (com.google.lens.p4707j.C62488dk) r10
            int r11 = r10.f168701a
            r11 = r11 | r2
            r10.f168701a = r11
            r10.f168702b = r9
            float r6 = r6.y
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.lens.j.dk r9 = (com.google.lens.p4707j.C62488dk) r9
            int r10 = r9.f168701a
            r10 = r10 | r3
            r9.f168701a = r10
            r9.f168703c = r6
            com.google.protobuf.bv r6 = r8.build()
            com.google.lens.j.dk r6 = (com.google.lens.p4707j.C62488dk) r6
            r5.mo58500c(r6)
            goto L_0x0181
        L_0x01c9:
            com.google.protobuf.bv r1 = r5.build()
            com.google.lens.j.dn r1 = (com.google.lens.p4707j.C62491dn) r1
            r0.f72076z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gleam.C26461at.mo31713M(float, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo31714N() {
        return !this.f72072v.isEmpty();
    }

    /* renamed from: U */
    public float mo31663U(PointF pointF) {
        return m48831O(pointF) ? 0.0f : Float.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public float mo31658h() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo31662l() {
        return true;
    }

    /* renamed from: m */
    public final void mo31665m(Canvas canvas, C26493by byVar) {
        float f;
        float f2;
        mo31712L();
        if (((C26559ej) this.f71997h).f72416v) {
            mo31680x(canvas, this.f71967e);
        }
        mo31705G(canvas, this.f72076z, this.f72073w);
        if (mo31714N()) {
            C62491dn dnVar = this.f72076z;
            C58838bb.m90868c(dnVar.f168713b.size() > 0);
            float f3 = Float.MIN_VALUE;
            float f4 = Float.MIN_VALUE;
            float f5 = Float.MAX_VALUE;
            float f6 = Float.MAX_VALUE;
            for (C62488dk dkVar : dnVar.f168713b) {
                f5 = Math.min(f5, dkVar.f168702b);
                f3 = Math.max(f3, dkVar.f168702b);
                f6 = Math.min(f6, dkVar.f168703c);
                f4 = Math.max(f4, dkVar.f168703c);
            }
            RectF rectF = new RectF(f5, f6, f3, f4);
            this.f72068B = rectF;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float min = Math.min(Math.max(1.0f, (rectF.width() * 0.9259259f) / this.f72067A), (((float) this.f71966d.getWidth()) * 0.9259259f) / this.f72067A);
            C26577ex exVar = this.f72070t;
            float f7 = exVar.f72437a;
            float f8 = this.f72067A;
            float f9 = exVar.f72441e * min;
            float f10 = (f8 * min) / 2.0f;
            float f11 = (f7 * min) / 2.0f;
            this.f72069C = new RectF(centerX - f10, centerY - f11, centerX + f10, f11 + centerY);
            C26577ex exVar2 = this.f72070t;
            float f12 = exVar2.f72438b * min;
            RectF rectF2 = this.f72069C;
            if (exVar2.f72444h == null) {
                exVar2.f72444h = new Paint();
                exVar2.f72444h.setColor(-1);
                exVar2.f72444h.setStyle(Paint.Style.FILL);
            }
            canvas.drawRoundRect(rectF2, f12, f12, exVar2.f72444h);
            if (this.f72071u.mo56113h()) {
                C26577ex exVar3 = this.f72070t;
                f = exVar3.f72440d * min;
                f2 = exVar3.f72439c * min;
                float f13 = f2 / 2.0f;
                ((Drawable) this.f72071u.mo56107c()).setBounds((int) (this.f72069C.left + f), (int) (centerY - f13), (int) (this.f72069C.left + f + f2), (int) (f13 + centerY));
                ((Drawable) this.f72071u.mo56107c()).draw(canvas);
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (-1.0f + min < 0.01f) {
                String str = this.f72072v;
                float f14 = this.f72069C.left;
                if (this.f72071u.mo56113h()) {
                    f9 = f + f + f2;
                }
                canvas.drawText(str, f14 + f9, centerY - this.f72075y.exactCenterY(), this.f72070t.mo31836c());
                return;
            }
            this.f72074x.setTextSize(this.f72070t.mo31836c().getTextSize() * min);
            String str2 = this.f72072v;
            float f15 = this.f72069C.left;
            if (this.f72071u.mo56113h()) {
                f9 = f + f + f2;
            }
            canvas.drawText(str2, f15 + f9, centerY - (min * this.f72075y.exactCenterY()), this.f72074x);
        }
    }

    /* renamed from: o */
    public final boolean mo31667o(PointF pointF) {
        return m48831O(pointF);
    }

    /* renamed from: p */
    public final boolean mo31668p(PointF pointF) {
        return m48831O(pointF);
    }
}
