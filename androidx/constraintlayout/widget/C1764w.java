package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.w */
/* compiled from: PG */
public final class C1764w {

    /* renamed from: a */
    float f5486a = Float.NaN;

    /* renamed from: b */
    float f5487b = Float.NaN;

    /* renamed from: c */
    float f5488c = Float.NaN;

    /* renamed from: d */
    float f5489d = Float.NaN;

    /* renamed from: e */
    public int f5490e = -1;

    public C1764w(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1761t.f5479u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f5490e = obtainStyledAttributes.getResourceId(0, this.f5490e);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f5490e);
                context.getResources().getResourceName(this.f5490e);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f5489d = obtainStyledAttributes.getDimension(1, this.f5489d);
            } else if (index == 2) {
                this.f5487b = obtainStyledAttributes.getDimension(2, this.f5487b);
            } else if (index == 3) {
                this.f5488c = obtainStyledAttributes.getDimension(3, this.f5488c);
            } else if (index == 4) {
                this.f5486a = obtainStyledAttributes.getDimension(4, this.f5486a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
