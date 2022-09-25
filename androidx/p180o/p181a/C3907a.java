package androidx.p180o.p181a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.p180o.C3906a;

@Deprecated
/* renamed from: androidx.o.a.a */
/* compiled from: PG */
public final class C3907a extends FrameLayout.LayoutParams {

    /* renamed from: a */
    private C3909c f12510a;

    public C3907a() {
        super(-1, -1);
    }

    /* renamed from: a */
    public final C3909c mo8140a() {
        if (this.f12510a == null) {
            this.f12510a = new C3909c();
        }
        return this.f12510a;
    }

    /* access modifiers changed from: protected */
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, 0);
        this.height = typedArray.getLayoutDimension(i2, 0);
    }

    public C3907a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3909c cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3906a.f12509a);
        float fraction = obtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            cVar = new C3909c();
            cVar.f12512a = fraction;
        } else {
            cVar = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12513b = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12514c = fraction3;
            cVar.f12515d = fraction3;
            cVar.f12516e = fraction3;
            cVar.f12517f = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12514c = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12515d = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12516e = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12517f = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12518g = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12519h = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            cVar = cVar == null ? new C3909c() : cVar;
            cVar.f12520i = fraction10;
        }
        obtainStyledAttributes.recycle();
        this.f12510a = cVar;
    }
}
