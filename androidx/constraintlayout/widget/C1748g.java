package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.g */
/* compiled from: PG */
public final class C1748g {

    /* renamed from: a */
    float f5315a = Float.NaN;

    /* renamed from: b */
    float f5316b = Float.NaN;

    /* renamed from: c */
    float f5317c = Float.NaN;

    /* renamed from: d */
    float f5318d = Float.NaN;

    /* renamed from: e */
    public int f5319e = -1;

    /* renamed from: f */
    public C1756o f5320f;

    public C1748g(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1761t.f5479u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f5319e = obtainStyledAttributes.getResourceId(0, this.f5319e);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f5319e);
                context.getResources().getResourceName(this.f5319e);
                if ("layout".equals(resourceTypeName)) {
                    C1756o oVar = new C1756o();
                    this.f5320f = oVar;
                    oVar.mo4890j(context, this.f5319e);
                }
            } else if (index == 1) {
                this.f5318d = obtainStyledAttributes.getDimension(1, this.f5318d);
            } else if (index == 2) {
                this.f5316b = obtainStyledAttributes.getDimension(2, this.f5316b);
            } else if (index == 3) {
                this.f5317c = obtainStyledAttributes.getDimension(3, this.f5317c);
            } else if (index == 4) {
                this.f5315a = obtainStyledAttributes.getDimension(4, this.f5315a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean mo4867a(float f, float f2) {
        if (!Float.isNaN(this.f5315a) && f < this.f5315a) {
            return false;
        }
        if (!Float.isNaN(this.f5316b) && f2 < this.f5316b) {
            return false;
        }
        if (!Float.isNaN(this.f5317c) && f > this.f5317c) {
            return false;
        }
        if (Float.isNaN(this.f5318d) || f2 <= this.f5318d) {
            return true;
        }
        return false;
    }
}
