package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1641i;
import androidx.constraintlayout.p079a.p082b.C1643k;
import androidx.constraintlayout.p079a.p082b.C1646n;
import androidx.constraintlayout.widget.C1745d;
import androidx.constraintlayout.widget.C1751j;
import androidx.constraintlayout.widget.C1761t;
import androidx.constraintlayout.widget.C1766y;

/* compiled from: PG */
public class Flow extends C1766y {

    /* renamed from: a */
    private C1641i f4801a;

    public Flow(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4700a(AttributeSet attributeSet) {
        super.mo4700a(attributeSet);
        this.f4801a = new C1641i();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1761t.f5460b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f4801a.f4726bb = obtainStyledAttributes.getInt(0, 0);
                } else if (index == 1) {
                    C1641i iVar = this.f4801a;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                    iVar.f4745bg = dimensionPixelSize;
                    iVar.f4746bh = dimensionPixelSize;
                    iVar.f4747bi = dimensionPixelSize;
                    iVar.f4748bj = dimensionPixelSize;
                } else if (index == 18) {
                    C1641i iVar2 = this.f4801a;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(18, 0);
                    iVar2.f4747bi = dimensionPixelSize2;
                    iVar2.f4749bk = dimensionPixelSize2;
                    iVar2.f4750bl = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f4801a.f4748bj = obtainStyledAttributes.getDimensionPixelSize(19, 0);
                } else if (index == 2) {
                    this.f4801a.f4749bk = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                } else if (index == 3) {
                    this.f4801a.f4745bg = obtainStyledAttributes.getDimensionPixelSize(3, 0);
                } else if (index == 4) {
                    this.f4801a.f4750bl = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                } else if (index == 5) {
                    this.f4801a.f4746bh = obtainStyledAttributes.getDimensionPixelSize(5, 0);
                } else if (index == 54) {
                    this.f4801a.f4723aZ = obtainStyledAttributes.getInt(54, 0);
                } else if (index == 44) {
                    this.f4801a.f4710a = obtainStyledAttributes.getInt(44, 0);
                } else if (index == 53) {
                    this.f4801a.f4724b = obtainStyledAttributes.getInt(53, 0);
                } else if (index == 38) {
                    this.f4801a.f4733c = obtainStyledAttributes.getInt(38, 0);
                } else if (index == 46) {
                    this.f4801a.f4711aN = obtainStyledAttributes.getInt(46, 0);
                } else if (index == 40) {
                    this.f4801a.f4734d = obtainStyledAttributes.getInt(40, 0);
                } else if (index == 48) {
                    this.f4801a.f4712aO = obtainStyledAttributes.getInt(48, 0);
                } else if (index == 42) {
                    this.f4801a.f4713aP = obtainStyledAttributes.getFloat(42, 0.5f);
                } else if (index == 37) {
                    this.f4801a.f4715aR = obtainStyledAttributes.getFloat(37, 0.5f);
                } else if (index == 45) {
                    this.f4801a.f4717aT = obtainStyledAttributes.getFloat(45, 0.5f);
                } else if (index == 39) {
                    this.f4801a.f4716aS = obtainStyledAttributes.getFloat(39, 0.5f);
                } else if (index == 47) {
                    this.f4801a.f4718aU = obtainStyledAttributes.getFloat(47, 0.5f);
                } else if (index == 51) {
                    this.f4801a.f4714aQ = obtainStyledAttributes.getFloat(51, 0.5f);
                } else if (index == 41) {
                    this.f4801a.f4721aX = obtainStyledAttributes.getInt(41, 2);
                } else if (index == 50) {
                    this.f4801a.f4722aY = obtainStyledAttributes.getInt(50, 2);
                } else if (index == 43) {
                    this.f4801a.f4719aV = obtainStyledAttributes.getDimensionPixelSize(43, 0);
                } else if (index == 52) {
                    this.f4801a.f4720aW = obtainStyledAttributes.getDimensionPixelSize(52, 0);
                } else if (index == 49) {
                    this.f4801a.f4725ba = obtainStyledAttributes.getInt(49, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f5230i = this.f4801a;
        mo4859o();
    }

    /* renamed from: b */
    public final void mo4701b(C1751j jVar, C1643k kVar, C1745d dVar, SparseArray sparseArray) {
        super.mo4701b(jVar, kVar, dVar, sparseArray);
        if (kVar instanceof C1641i) {
            C1641i iVar = (C1641i) kVar;
            int i = dVar.f5253V;
            if (i != -1) {
                iVar.f4726bb = i;
            }
        }
    }

    /* renamed from: c */
    public final void mo4702c(C1646n nVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (nVar != null) {
            nVar.mo4660P(mode, size, mode2, size2);
            setMeasuredDimension(nVar.f4752bn, nVar.f4753bo);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    /* renamed from: d */
    public final void mo4703d(C1638f fVar, boolean z) {
        C1641i iVar = this.f4801a;
        int i = iVar.f4747bi;
        if (i <= 0 && iVar.f4748bj <= 0) {
            return;
        }
        if (z) {
            iVar.f4749bk = iVar.f4748bj;
            iVar.f4750bl = i;
            return;
        }
        iVar.f4749bk = i;
        iVar.f4750bl = iVar.f4748bj;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        mo4702c(this.f4801a, i, i2);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
