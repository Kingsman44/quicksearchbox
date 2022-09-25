package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.C1761t;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.ad */
/* compiled from: PG */
public final class C1705ad implements View.OnClickListener {

    /* renamed from: a */
    int f4896a = -1;

    /* renamed from: b */
    int f4897b = 17;

    /* renamed from: c */
    private final C1706ae f4898c;

    public C1705ad(Context context, C1706ae aeVar, XmlPullParser xmlPullParser) {
        this.f4898c = aeVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1761t.f5472n);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4896a = obtainStyledAttributes.getResourceId(1, this.f4896a);
            } else if (index == 0) {
                this.f4897b = obtainStyledAttributes.getInt(0, this.f4897b);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo4757a(MotionLayout motionLayout, int i, C1706ae aeVar) {
        int i2 = this.f4896a;
        View view = motionLayout;
        if (i2 != -1) {
            view = motionLayout.findViewById(i2);
        }
        if (view == null) {
            int i3 = this.f4896a;
            StringBuilder sb = new StringBuilder(37);
            sb.append("OnClick could not find id ");
            sb.append(i3);
            Log.e("MotionScene", sb.toString());
            return;
        }
        int i4 = aeVar.f4902d;
        int i5 = aeVar.f4901c;
        if (i4 == -1) {
            view.setOnClickListener(this);
            return;
        }
        int i6 = this.f4897b;
        int i7 = i6 & 1;
        boolean z = true;
        boolean z2 = (i7 != 0 && i == i4) | (i7 != 0 && i == i4) | ((i6 & 256) != 0 && i == i4) | ((i6 & 16) != 0 && i == i5);
        if ((i6 & 4096) == 0 || i != i5) {
            z = false;
        }
        if (z2 || z) {
            view.setOnClickListener(this);
        }
    }

    /* renamed from: b */
    public final void mo4758b(MotionLayout motionLayout) {
        int i = this.f4896a;
        if (i != -1) {
            View findViewById = motionLayout.findViewById(i);
            if (findViewById == null) {
                int i2 = this.f4896a;
                StringBuilder sb = new StringBuilder(35);
                sb.append(" (*)  could not find id ");
                sb.append(i2);
                Log.e("MotionScene", sb.toString());
                return;
            }
            findViewById.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void onClick(View view) {
        C1706ae aeVar = this.f4898c;
        C1707af afVar = aeVar.f4908j;
        MotionLayout motionLayout = afVar.f4917a;
        if (motionLayout.f4861k) {
            if (aeVar.f4902d == -1) {
                int i = motionLayout.f4857g;
                if (i == -1) {
                    motionLayout.mo4744y(aeVar.f4901c);
                    return;
                }
                C1706ae aeVar2 = new C1706ae(afVar, aeVar);
                aeVar2.f4902d = i;
                aeVar2.f4901c = this.f4898c.f4901c;
                motionLayout.mo4740u(aeVar2);
                motionLayout.mo4743x();
                return;
            }
            C1706ae aeVar3 = afVar.f4919c;
            int i2 = this.f4897b;
            boolean z = false;
            boolean z2 = ((i2 & 1) == 0 && (i2 & 256) == 0) ? false : true;
            boolean z3 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
            if (!z2 || !z3) {
                z = z2;
            } else {
                if (aeVar3 != aeVar) {
                    motionLayout.mo4740u(aeVar);
                }
                if (motionLayout.f4857g != motionLayout.f4858h && motionLayout.f4864n <= 0.5f) {
                    z = z2;
                    z3 = false;
                }
            }
            C1706ae aeVar4 = this.f4898c;
            if (aeVar4 != aeVar3) {
                int i3 = aeVar4.f4901c;
                int i4 = aeVar4.f4902d;
                if (i4 != -1) {
                    int i5 = motionLayout.f4857g;
                    if (!(i5 == i4 || i5 == i3)) {
                        return;
                    }
                } else if (motionLayout.f4857g == i3) {
                    return;
                }
            }
            if (z && (this.f4897b & 1) != 0) {
                motionLayout.mo4740u(aeVar4);
                motionLayout.mo4743x();
            } else if (z3 && (this.f4897b & 16) != 0) {
                motionLayout.mo4740u(aeVar4);
                motionLayout.mo4718i(0.0f);
            } else if (z && (this.f4897b & 256) != 0) {
                motionLayout.mo4740u(aeVar4);
                motionLayout.mo4735q(1.0f);
            } else if (z3 && (this.f4897b & 4096) != 0) {
                motionLayout.mo4740u(aeVar4);
                motionLayout.mo4735q(0.0f);
            }
        }
    }
}
