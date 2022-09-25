package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.C1761t;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.ae */
/* compiled from: PG */
public final class C1706ae {

    /* renamed from: a */
    public int f4899a;

    /* renamed from: b */
    public boolean f4900b;

    /* renamed from: c */
    public int f4901c;

    /* renamed from: d */
    public int f4902d;

    /* renamed from: e */
    public int f4903e;

    /* renamed from: f */
    public String f4904f;

    /* renamed from: g */
    public int f4905g;

    /* renamed from: h */
    public int f4906h;

    /* renamed from: i */
    public float f4907i;

    /* renamed from: j */
    public final C1707af f4908j;

    /* renamed from: k */
    public ArrayList f4909k;

    /* renamed from: l */
    public C1710ai f4910l;

    /* renamed from: m */
    public ArrayList f4911m;

    /* renamed from: n */
    public int f4912n;

    /* renamed from: o */
    public boolean f4913o;

    /* renamed from: p */
    public int f4914p;

    /* renamed from: q */
    public int f4915q;

    /* renamed from: r */
    private int f4916r;

    public C1706ae(C1707af afVar, int i) {
        this.f4899a = -1;
        this.f4900b = false;
        this.f4901c = -1;
        this.f4902d = -1;
        this.f4903e = 0;
        this.f4904f = null;
        this.f4905g = -1;
        this.f4906h = 400;
        this.f4907i = 0.0f;
        this.f4909k = new ArrayList();
        this.f4910l = null;
        this.f4911m = new ArrayList();
        this.f4912n = 0;
        this.f4913o = false;
        this.f4914p = -1;
        this.f4915q = 0;
        this.f4916r = 0;
        this.f4899a = -1;
        this.f4908j = afVar;
        this.f4902d = R.id.view_transition;
        this.f4901c = i;
        this.f4906h = afVar.f4924h;
        this.f4915q = afVar.f4925i;
    }

    /* renamed from: a */
    public final boolean mo4760a() {
        return !this.f4913o;
    }

    /* renamed from: b */
    public final boolean mo4761b(int i) {
        return (i & this.f4916r) != 0;
    }

    public C1706ae(C1707af afVar, Context context, XmlPullParser xmlPullParser) {
        this.f4899a = -1;
        this.f4900b = false;
        this.f4901c = -1;
        this.f4902d = -1;
        this.f4903e = 0;
        this.f4904f = null;
        this.f4905g = -1;
        this.f4906h = 400;
        this.f4907i = 0.0f;
        this.f4909k = new ArrayList();
        this.f4910l = null;
        this.f4911m = new ArrayList();
        this.f4912n = 0;
        this.f4913o = false;
        this.f4914p = -1;
        this.f4915q = 0;
        this.f4916r = 0;
        this.f4906h = afVar.f4924h;
        this.f4915q = afVar.f4925i;
        this.f4908j = afVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1761t.f5478t);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.f4901c = obtainStyledAttributes.getResourceId(2, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f4901c);
                if ("layout".equals(resourceTypeName)) {
                    C1756o oVar = new C1756o();
                    oVar.mo4896p(context, this.f4901c);
                    afVar.f4922f.append(this.f4901c, oVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f4901c = afVar.mo4768g(context, this.f4901c);
                }
            } else if (index == 3) {
                this.f4902d = obtainStyledAttributes.getResourceId(3, this.f4902d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f4902d);
                if ("layout".equals(resourceTypeName2)) {
                    C1756o oVar2 = new C1756o();
                    oVar2.mo4896p(context, this.f4902d);
                    afVar.f4922f.append(this.f4902d, oVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f4902d = afVar.mo4768g(context, this.f4902d);
                }
            } else if (index == 6) {
                TypedValue peekValue = obtainStyledAttributes.peekValue(6);
                if (peekValue.type == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(6, -1);
                    this.f4905g = resourceId;
                    if (resourceId != -1) {
                        this.f4903e = -2;
                    }
                } else if (peekValue.type == 3) {
                    String string = obtainStyledAttributes.getString(6);
                    this.f4904f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f4905g = obtainStyledAttributes.getResourceId(6, -1);
                            this.f4903e = -2;
                        } else {
                            this.f4903e = -1;
                        }
                    }
                } else {
                    this.f4903e = obtainStyledAttributes.getInteger(6, this.f4903e);
                }
            } else if (index == 4) {
                int i2 = obtainStyledAttributes.getInt(4, this.f4906h);
                this.f4906h = i2;
                if (i2 < 8) {
                    this.f4906h = 8;
                }
            } else if (index == 8) {
                this.f4907i = obtainStyledAttributes.getFloat(8, this.f4907i);
            } else if (index == 1) {
                this.f4912n = obtainStyledAttributes.getInteger(1, this.f4912n);
            } else if (index == 0) {
                this.f4899a = obtainStyledAttributes.getResourceId(0, this.f4899a);
            } else if (index == 9) {
                this.f4913o = obtainStyledAttributes.getBoolean(9, this.f4913o);
            } else if (index == 7) {
                this.f4914p = obtainStyledAttributes.getInteger(7, -1);
            } else if (index == 5) {
                this.f4915q = obtainStyledAttributes.getInteger(5, 0);
            } else if (index == 10) {
                this.f4916r = obtainStyledAttributes.getInteger(10, 0);
            }
        }
        if (this.f4902d == -1) {
            this.f4900b = true;
        }
        obtainStyledAttributes.recycle();
    }

    public C1706ae(C1707af afVar, C1706ae aeVar) {
        this.f4899a = -1;
        this.f4900b = false;
        this.f4901c = -1;
        this.f4902d = -1;
        this.f4903e = 0;
        this.f4904f = null;
        this.f4905g = -1;
        this.f4906h = 400;
        this.f4907i = 0.0f;
        this.f4909k = new ArrayList();
        this.f4910l = null;
        this.f4911m = new ArrayList();
        this.f4912n = 0;
        this.f4913o = false;
        this.f4914p = -1;
        this.f4915q = 0;
        this.f4916r = 0;
        this.f4908j = afVar;
        this.f4906h = afVar.f4924h;
        if (aeVar != null) {
            this.f4914p = aeVar.f4914p;
            this.f4903e = aeVar.f4903e;
            this.f4904f = aeVar.f4904f;
            this.f4905g = aeVar.f4905g;
            this.f4906h = aeVar.f4906h;
            this.f4909k = aeVar.f4909k;
            this.f4907i = aeVar.f4907i;
            this.f4915q = aeVar.f4915q;
        }
    }
}
