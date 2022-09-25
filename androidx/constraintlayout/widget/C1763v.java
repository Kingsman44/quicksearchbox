package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.v */
/* compiled from: PG */
public final class C1763v {

    /* renamed from: a */
    int f5483a;

    /* renamed from: b */
    public ArrayList f5484b = new ArrayList();

    /* renamed from: c */
    public int f5485c = -1;

    public C1763v(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1761t.f5475q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f5483a = obtainStyledAttributes.getResourceId(0, this.f5483a);
            } else if (index == 1) {
                this.f5485c = obtainStyledAttributes.getResourceId(1, this.f5485c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f5485c);
                context.getResources().getResourceName(this.f5485c);
                "layout".equals(resourceTypeName);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int mo4910a() {
        for (int i = 0; i < this.f5484b.size(); i++) {
            C1764w wVar = (C1764w) this.f5484b.get(i);
            if ((Float.isNaN(wVar.f5486a) || wVar.f5486a <= -1.0f) && ((Float.isNaN(wVar.f5487b) || wVar.f5487b <= -1.0f) && ((Float.isNaN(wVar.f5488c) || wVar.f5488c >= -1.0f) && (Float.isNaN(wVar.f5489d) || wVar.f5489d >= -1.0f)))) {
                return i;
            }
        }
        return -1;
    }
}
