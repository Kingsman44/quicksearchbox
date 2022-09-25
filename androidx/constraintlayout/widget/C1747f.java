package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.f */
/* compiled from: PG */
public final class C1747f {

    /* renamed from: a */
    int f5311a;

    /* renamed from: b */
    public ArrayList f5312b = new ArrayList();

    /* renamed from: c */
    public int f5313c = -1;

    /* renamed from: d */
    public C1756o f5314d;

    public C1747f(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1761t.f5475q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f5311a = obtainStyledAttributes.getResourceId(0, this.f5311a);
            } else if (index == 1) {
                this.f5313c = obtainStyledAttributes.getResourceId(1, this.f5313c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f5313c);
                context.getResources().getResourceName(this.f5313c);
                if ("layout".equals(resourceTypeName)) {
                    C1756o oVar = new C1756o();
                    this.f5314d = oVar;
                    oVar.mo4890j(context, this.f5313c);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int mo4866a(float f, float f2) {
        for (int i = 0; i < this.f5312b.size(); i++) {
            if (((C1748g) this.f5312b.get(i)).mo4867a(f, f2)) {
                return i;
            }
        }
        return -1;
    }
}
