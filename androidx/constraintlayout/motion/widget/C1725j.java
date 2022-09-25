package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;
import androidx.constraintlayout.widget.C1761t;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.j */
/* compiled from: PG */
public final class C1725j extends C1726k {

    /* renamed from: f */
    String f5058f = null;

    /* renamed from: g */
    int f5059g = -1;

    /* renamed from: h */
    int f5060h = 0;

    /* renamed from: i */
    float f5061i = Float.NaN;

    /* renamed from: j */
    float f5062j = Float.NaN;

    /* renamed from: k */
    float f5063k = Float.NaN;

    /* renamed from: l */
    float f5064l = Float.NaN;

    /* renamed from: m */
    float f5065m = Float.NaN;

    /* renamed from: n */
    float f5066n = Float.NaN;

    /* renamed from: o */
    int f5067o = 0;

    /* renamed from: q */
    private float f5068q = Float.NaN;

    /* renamed from: r */
    private float f5069r = Float.NaN;

    public C1725j() {
        this.f5016d = 2;
    }

    /* renamed from: a */
    public final C1718c clone() {
        C1725j jVar = new C1725j();
        super.mo4797f(this);
        jVar.f5058f = this.f5058f;
        jVar.f5059g = this.f5059g;
        jVar.f5060h = this.f5060h;
        jVar.f5061i = this.f5061i;
        jVar.f5062j = Float.NaN;
        jVar.f5063k = this.f5063k;
        jVar.f5064l = this.f5064l;
        jVar.f5065m = this.f5065m;
        jVar.f5066n = this.f5066n;
        jVar.f5068q = this.f5068q;
        jVar.f5069r = this.f5069r;
        return jVar;
    }

    /* renamed from: b */
    public final void mo4792b(HashMap hashMap) {
    }

    /* renamed from: d */
    public final void mo4795d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1761t.f5465g);
        SparseIntArray sparseIntArray = C1724i.f5057a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C1724i.f5057a.get(index)) {
                case 1:
                    if (!MotionLayout.f4817a) {
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f5014b = obtainStyledAttributes.getResourceId(index, this.f5014b);
                            break;
                        } else {
                            this.f5015c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f5014b);
                        this.f5014b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f5015c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    }
                case 2:
                    this.f5013a = obtainStyledAttributes.getInt(index, this.f5013a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f5058f = C1596f.f4399f[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        this.f5058f = obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    this.f5070p = obtainStyledAttributes.getInteger(index, this.f5070p);
                    break;
                case 5:
                    this.f5060h = obtainStyledAttributes.getInt(index, this.f5060h);
                    break;
                case 6:
                    this.f5063k = obtainStyledAttributes.getFloat(index, this.f5063k);
                    break;
                case 7:
                    this.f5064l = obtainStyledAttributes.getFloat(index, this.f5064l);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.f5062j);
                    this.f5061i = f;
                    this.f5062j = f;
                    break;
                case 9:
                    this.f5067o = obtainStyledAttributes.getInt(index, this.f5067o);
                    break;
                case 10:
                    this.f5059g = obtainStyledAttributes.getInt(index, this.f5059g);
                    break;
                case 11:
                    this.f5061i = obtainStyledAttributes.getFloat(index, this.f5061i);
                    break;
                case 12:
                    this.f5062j = obtainStyledAttributes.getFloat(index, this.f5062j);
                    break;
                default:
                    String hexString = Integer.toHexString(index);
                    int i2 = C1724i.f5057a.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb.append("unused attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i2);
                    Log.e("KeyPosition", sb.toString());
                    break;
            }
        }
        if (this.f5013a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
