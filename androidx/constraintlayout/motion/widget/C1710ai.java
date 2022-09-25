package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1761t;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.ai */
/* compiled from: PG */
final class C1710ai {

    /* renamed from: D */
    private static final float[][] f4936D = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: E */
    private static final float[][] f4937E = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: A */
    public float f4938A = Float.NaN;

    /* renamed from: B */
    public int f4939B = 0;

    /* renamed from: C */
    public int f4940C = 0;

    /* renamed from: F */
    private int f4941F = 0;

    /* renamed from: G */
    private int f4942G = 0;

    /* renamed from: H */
    private int f4943H = -1;

    /* renamed from: a */
    public int f4944a = 0;

    /* renamed from: b */
    public int f4945b = -1;

    /* renamed from: c */
    public int f4946c = -1;

    /* renamed from: d */
    public float f4947d = 0.5f;

    /* renamed from: e */
    public float f4948e = 0.5f;

    /* renamed from: f */
    float f4949f = 0.5f;

    /* renamed from: g */
    float f4950g = 0.5f;

    /* renamed from: h */
    public int f4951h = -1;

    /* renamed from: i */
    boolean f4952i = false;

    /* renamed from: j */
    public float f4953j = 0.0f;

    /* renamed from: k */
    public float f4954k = 1.0f;

    /* renamed from: l */
    public boolean f4955l = false;

    /* renamed from: m */
    public float[] f4956m = new float[2];

    /* renamed from: n */
    public int[] f4957n = new int[2];

    /* renamed from: o */
    public float f4958o;

    /* renamed from: p */
    public float f4959p;

    /* renamed from: q */
    public final MotionLayout f4960q;

    /* renamed from: r */
    public float f4961r = 4.0f;

    /* renamed from: s */
    public float f4962s = 1.2f;

    /* renamed from: t */
    public boolean f4963t = true;

    /* renamed from: u */
    public float f4964u = 1.0f;

    /* renamed from: v */
    public int f4965v = 0;

    /* renamed from: w */
    public float f4966w = 10.0f;

    /* renamed from: x */
    public float f4967x = 10.0f;

    /* renamed from: y */
    public float f4968y = 1.0f;

    /* renamed from: z */
    public float f4969z = Float.NaN;

    public C1710ai(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f4960q = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1761t.f5473o);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 16) {
                this.f4945b = obtainStyledAttributes.getResourceId(16, this.f4945b);
            } else if (index == 17) {
                int i2 = obtainStyledAttributes.getInt(17, this.f4941F);
                this.f4941F = i2;
                float[] fArr = f4936D[i2];
                this.f4948e = fArr[0];
                this.f4947d = fArr[1];
            } else if (index == 1) {
                int i3 = obtainStyledAttributes.getInt(1, this.f4942G);
                this.f4942G = i3;
                if (i3 < 6) {
                    float[] fArr2 = f4937E[i3];
                    this.f4953j = fArr2[0];
                    this.f4954k = fArr2[1];
                } else {
                    this.f4954k = Float.NaN;
                    this.f4953j = Float.NaN;
                    this.f4952i = true;
                }
            } else if (index == 6) {
                this.f4961r = obtainStyledAttributes.getFloat(6, this.f4961r);
            } else if (index == 5) {
                this.f4962s = obtainStyledAttributes.getFloat(5, this.f4962s);
            } else if (index == 7) {
                this.f4963t = obtainStyledAttributes.getBoolean(7, this.f4963t);
            } else if (index == 2) {
                this.f4964u = obtainStyledAttributes.getFloat(2, this.f4964u);
            } else if (index == 3) {
                this.f4966w = obtainStyledAttributes.getFloat(3, this.f4966w);
            } else if (index == 18) {
                this.f4946c = obtainStyledAttributes.getResourceId(18, this.f4946c);
            } else if (index == 9) {
                this.f4944a = obtainStyledAttributes.getInt(9, this.f4944a);
            } else if (index == 8) {
                this.f4965v = obtainStyledAttributes.getInteger(8, 0);
            } else if (index == 4) {
                this.f4943H = obtainStyledAttributes.getResourceId(4, 0);
            } else if (index == 10) {
                this.f4951h = obtainStyledAttributes.getResourceId(10, this.f4951h);
            } else if (index == 12) {
                this.f4967x = obtainStyledAttributes.getFloat(12, this.f4967x);
            } else if (index == 13) {
                this.f4968y = obtainStyledAttributes.getFloat(13, this.f4968y);
            } else if (index == 14) {
                this.f4969z = obtainStyledAttributes.getFloat(14, this.f4969z);
            } else if (index == 15) {
                this.f4938A = obtainStyledAttributes.getFloat(15, this.f4938A);
            } else if (index == 11) {
                this.f4939B = obtainStyledAttributes.getInt(11, this.f4939B);
            } else if (index == 0) {
                this.f4940C = obtainStyledAttributes.getInt(0, this.f4940C);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final RectF mo4778a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f4943H;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final RectF mo4779b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f4946c;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    public final String toString() {
        if (Float.isNaN(this.f4953j)) {
            return "rotation";
        }
        float f = this.f4953j;
        float f2 = this.f4954k;
        StringBuilder sb = new StringBuilder(33);
        sb.append(f);
        sb.append(" , ");
        sb.append(f2);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo4780c(boolean z) {
        if (z) {
            float[][] fArr = f4937E;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f4936D;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f4937E;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f4936D;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f4936D[this.f4941F];
        this.f4948e = fArr5[0];
        this.f4947d = fArr5[1];
        int i = this.f4942G;
        if (i < 6) {
            float[] fArr6 = f4937E[i];
            this.f4953j = fArr6[0];
            this.f4954k = fArr6[1];
        }
    }
}
