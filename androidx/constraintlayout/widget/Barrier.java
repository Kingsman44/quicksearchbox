package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.p079a.p082b.C1615a;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import androidx.constraintlayout.p079a.p082b.C1643k;

/* compiled from: PG */
public class Barrier extends C1743b {

    /* renamed from: a */
    public int f5198a;

    /* renamed from: b */
    public C1615a f5199b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r7 == 6) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r7 == 6) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4736c(androidx.constraintlayout.p079a.p082b.C1638f r5, int r6, boolean r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            if (r7 == 0) goto L_0x000f
            int r7 = r4.f5198a
            if (r7 != r3) goto L_0x000c
        L_0x000a:
            r6 = 1
            goto L_0x0018
        L_0x000c:
            if (r7 != r2) goto L_0x0018
            goto L_0x0013
        L_0x000f:
            int r7 = r4.f5198a
            if (r7 != r3) goto L_0x0015
        L_0x0013:
            r6 = 0
            goto L_0x0018
        L_0x0015:
            if (r7 != r2) goto L_0x0018
            goto L_0x000a
        L_0x0018:
            boolean r7 = r5 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r7 == 0) goto L_0x0020
            androidx.constraintlayout.a.b.a r5 = (androidx.constraintlayout.p079a.p082b.C1615a) r5
            r5.f4482a = r6
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.m4736c(androidx.constraintlayout.a.b.f, int, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4700a(AttributeSet attributeSet) {
        super.mo4700a(attributeSet);
        this.f5199b = new C1615a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1761t.f5460b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.f5198a = obtainStyledAttributes.getInt(26, 0);
                } else if (index == 25) {
                    this.f5199b.f4483b = obtainStyledAttributes.getBoolean(25, true);
                } else if (index == 27) {
                    this.f5199b.f4484c = obtainStyledAttributes.getDimensionPixelSize(27, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f5230i = this.f5199b;
        mo4859o();
    }

    /* renamed from: b */
    public final void mo4701b(C1751j jVar, C1643k kVar, C1745d dVar, SparseArray sparseArray) {
        super.mo4701b(jVar, kVar, dVar, sparseArray);
        if (kVar instanceof C1615a) {
            C1615a aVar = (C1615a) kVar;
            m4736c(aVar, jVar.f5342e.f5380ah, ((C1639g) kVar.f4606Z).f4691d);
            C1752k kVar2 = jVar.f5342e;
            aVar.f4483b = kVar2.f5388ap;
            aVar.f4484c = kVar2.f5381ai;
        }
    }

    /* renamed from: d */
    public final void mo4703d(C1638f fVar, boolean z) {
        m4736c(fVar, this.f5198a, z);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
