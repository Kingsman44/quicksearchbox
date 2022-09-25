package com.android.p271h.p272a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.LongSparseArray;
import android.view.View;
import android.view.WindowManager;
import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1973h;
import com.android.p261d.p264c.C5053a;

/* renamed from: com.android.h.a.e */
/* compiled from: PG */
public final class C5157e {

    /* renamed from: a */
    static final C1971f f16371a = new C1973h(64);

    /* renamed from: A */
    public final C5154b f16372A;

    /* renamed from: B */
    public boolean f16373B;

    /* renamed from: C */
    public int f16374C;

    /* renamed from: D */
    public int f16375D;

    /* renamed from: E */
    public final View f16376E;

    /* renamed from: b */
    int f16377b;

    /* renamed from: c */
    C5156d f16378c;

    /* renamed from: d */
    public C5053a f16379d;

    /* renamed from: e */
    protected int f16380e;

    /* renamed from: f */
    int f16381f = 0;

    /* renamed from: g */
    public int f16382g;

    /* renamed from: h */
    public int f16383h;

    /* renamed from: i */
    public int f16384i;

    /* renamed from: j */
    public boolean f16385j;

    /* renamed from: k */
    public final RectF f16386k = new RectF();

    /* renamed from: l */
    public final RectF f16387l = new RectF();

    /* renamed from: m */
    public final LongSparseArray f16388m = new LongSparseArray();

    /* renamed from: n */
    final Object f16389n = new Object();

    /* renamed from: o */
    public final C5155c f16390o = new C5155c();

    /* renamed from: p */
    public final C5155c f16391p = new C5155c();

    /* renamed from: q */
    final C5155c f16392q = new C5155c();

    /* renamed from: r */
    protected int f16393r = -1;

    /* renamed from: s */
    protected int f16394s = -1;

    /* renamed from: t */
    protected int f16395t;

    /* renamed from: u */
    protected int f16396u;

    /* renamed from: v */
    protected float f16397v;

    /* renamed from: w */
    protected int f16398w;

    /* renamed from: x */
    public boolean f16399x;

    /* renamed from: y */
    public final Rect f16400y = new Rect();

    /* renamed from: z */
    public final Rect[] f16401z = {new Rect(), new Rect()};

    public C5157e(View view) {
        this.f16376E = view;
        C5154b bVar = new C5154b(this);
        this.f16372A = bVar;
        bVar.start();
    }

    /* renamed from: a */
    public static int m14089a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (displayMetrics.heightPixels > 2048 || displayMetrics.widthPixels > 2048) ? 512 : 256;
    }

    /* renamed from: b */
    public static long m14090b(int i, int i2, int i3) {
        return (((((long) i) << 16) | ((long) i2)) << 16) | ((long) i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C5153a mo10236c(int i, int i2, int i3) {
        return (C5153a) this.f16388m.get(m14090b(i, i2, i3));
    }

    /* renamed from: d */
    public final void mo10237d(Rect rect, int i, int i2, int i3, float f, int i4) {
        double radians = Math.toRadians((double) (-i4));
        double d = (double) this.f16374C;
        double d2 = (double) this.f16375D;
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        Double.isNaN(d);
        double d3 = cos * d;
        Double.isNaN(d2);
        double d4 = sin * d2;
        double ceil = Math.ceil(Math.max(Math.abs(d3 - d4), Math.abs(d3 + d4)));
        Double.isNaN(d);
        double d5 = sin * d;
        Double.isNaN(d2);
        double d6 = cos * d2;
        double ceil2 = Math.ceil(Math.max(Math.abs(d5 + d6), Math.abs(d5 - d6)));
        float f2 = (float) ((int) ceil);
        float f3 = f + f;
        int floor = (int) Math.floor((double) (((float) i) - (f2 / f3)));
        float f4 = (float) ((int) ceil2);
        int floor2 = (int) Math.floor((double) (((float) i2) - (f4 / f3)));
        double ceil3 = Math.ceil((double) (((float) floor) + (f2 / f)));
        double ceil4 = Math.ceil((double) (((float) floor2) + (f4 / f)));
        int i5 = this.f16377b << i3;
        rect.set(Math.max(0, (floor / i5) * i5), Math.max(0, i5 * (floor2 / i5)), Math.min(this.f16393r, (int) ceil3), Math.min(this.f16394s, (int) ceil4));
    }

    /* renamed from: e */
    public final void mo10238e(C5153a aVar) {
        synchronized (this.f16389n) {
            if (aVar.f16367p == 1) {
                aVar.f16367p = 2;
                if (this.f16392q.mo10229b(aVar)) {
                    this.f16389n.notifyAll();
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo10239f(C5153a aVar) {
        synchronized (this.f16389n) {
            if (aVar.f16367p == 4) {
                aVar.f16367p = 32;
                return;
            }
            aVar.f16367p = 64;
            Bitmap bitmap = aVar.f16366o;
            if (bitmap != null) {
                f16371a.mo5127b(bitmap);
                aVar.f16366o = null;
            }
            this.f16390o.mo10229b(aVar);
        }
    }

    /* renamed from: g */
    public final void mo10240g(C5156d dVar, int i) {
        if (this.f16378c != dVar) {
            this.f16378c = dVar;
            synchronized (this.f16389n) {
                this.f16392q.f16370a = null;
                this.f16391p.f16370a = null;
                int size = this.f16388m.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo10239f((C5153a) this.f16388m.valueAt(i2));
                }
                this.f16388m.clear();
            }
            C5156d dVar2 = this.f16378c;
            if (dVar2 == null) {
                this.f16393r = 0;
                this.f16394s = 0;
                this.f16380e = 0;
                this.f16379d = null;
            } else {
                this.f16393r = dVar2.getImageWidth();
                this.f16394s = this.f16378c.getImageHeight();
                this.f16379d = this.f16378c.getPreview();
                this.f16377b = this.f16378c.getTileSize();
                C5053a aVar = this.f16379d;
                if (aVar != null) {
                    float e = ((float) this.f16393r) / ((float) aVar.mo10017e());
                    int i3 = 0;
                    while (i3 < 31 && ((float) (1 << i3)) < e) {
                        i3++;
                    }
                    this.f16380e = Math.max(0, i3);
                } else {
                    int max = Math.max(this.f16393r, this.f16394s);
                    int i4 = this.f16377b;
                    int i5 = 1;
                    while (i4 < max) {
                        i4 += i4;
                        i5++;
                    }
                    this.f16380e = i5;
                }
            }
            this.f16399x = true;
        }
        if (this.f16398w != i) {
            this.f16398w = i;
            this.f16399x = true;
        }
    }
}
