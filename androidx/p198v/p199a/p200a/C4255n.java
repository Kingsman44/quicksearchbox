package androidx.p198v.p199a.p200a;

import android.graphics.Matrix;
import androidx.p060c.C0977g;
import java.util.ArrayList;

/* renamed from: androidx.v.a.a.n */
/* compiled from: PG */
final class C4255n extends C4256o {

    /* renamed from: a */
    final Matrix f13716a;

    /* renamed from: b */
    final ArrayList f13717b;

    /* renamed from: c */
    float f13718c;

    /* renamed from: d */
    public float f13719d;

    /* renamed from: e */
    public float f13720e;

    /* renamed from: f */
    public float f13721f;

    /* renamed from: g */
    public float f13722g;

    /* renamed from: h */
    public float f13723h;

    /* renamed from: i */
    public float f13724i;

    /* renamed from: j */
    final Matrix f13725j;

    /* renamed from: k */
    int f13726k;

    /* renamed from: l */
    public int[] f13727l;

    /* renamed from: m */
    public String f13728m;

    public C4255n() {
        this.f13716a = new Matrix();
        this.f13717b = new ArrayList();
        this.f13718c = 0.0f;
        this.f13719d = 0.0f;
        this.f13720e = 0.0f;
        this.f13721f = 1.0f;
        this.f13722g = 1.0f;
        this.f13723h = 0.0f;
        this.f13724i = 0.0f;
        this.f13725j = new Matrix();
        this.f13728m = null;
    }

    /* renamed from: a */
    public final void mo9024a() {
        this.f13725j.reset();
        this.f13725j.postTranslate(-this.f13719d, -this.f13720e);
        this.f13725j.postScale(this.f13721f, this.f13722g);
        this.f13725j.postRotate(this.f13718c, 0.0f, 0.0f);
        this.f13725j.postTranslate(this.f13723h + this.f13719d, this.f13724i + this.f13720e);
    }

    /* renamed from: b */
    public final boolean mo9006b() {
        for (int i = 0; i < this.f13717b.size(); i++) {
            if (((C4256o) this.f13717b.get(i)).mo9006b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo9007c(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f13717b.size(); i++) {
            z |= ((C4256o) this.f13717b.get(i)).mo9007c(iArr);
        }
        return z;
    }

    public String getGroupName() {
        return this.f13728m;
    }

    public Matrix getLocalMatrix() {
        return this.f13725j;
    }

    public float getPivotX() {
        return this.f13719d;
    }

    public float getPivotY() {
        return this.f13720e;
    }

    public float getRotation() {
        return this.f13718c;
    }

    public float getScaleX() {
        return this.f13721f;
    }

    public float getScaleY() {
        return this.f13722g;
    }

    public float getTranslateX() {
        return this.f13723h;
    }

    public float getTranslateY() {
        return this.f13724i;
    }

    public void setPivotX(float f) {
        if (f != this.f13719d) {
            this.f13719d = f;
            mo9024a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f13720e) {
            this.f13720e = f;
            mo9024a();
        }
    }

    public void setRotation(float f) {
        if (f != this.f13718c) {
            this.f13718c = f;
            mo9024a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f13721f) {
            this.f13721f = f;
            mo9024a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f13722g) {
            this.f13722g = f;
            mo9024a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f13723h) {
            this.f13723h = f;
            mo9024a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f13724i) {
            this.f13724i = f;
            mo9024a();
        }
    }

    public C4255n(C4255n nVar, C0977g gVar) {
        C4257p pVar;
        this.f13716a = new Matrix();
        this.f13717b = new ArrayList();
        this.f13718c = 0.0f;
        this.f13719d = 0.0f;
        this.f13720e = 0.0f;
        this.f13721f = 1.0f;
        this.f13722g = 1.0f;
        this.f13723h = 0.0f;
        this.f13724i = 0.0f;
        Matrix matrix = new Matrix();
        this.f13725j = matrix;
        this.f13728m = null;
        this.f13718c = nVar.f13718c;
        this.f13719d = nVar.f13719d;
        this.f13720e = nVar.f13720e;
        this.f13721f = nVar.f13721f;
        this.f13722g = nVar.f13722g;
        this.f13723h = nVar.f13723h;
        this.f13724i = nVar.f13724i;
        int[] iArr = nVar.f13727l;
        this.f13727l = null;
        String str = nVar.f13728m;
        this.f13728m = str;
        int i = nVar.f13726k;
        this.f13726k = 0;
        if (str != null) {
            gVar.put(str, this);
        }
        matrix.set(nVar.f13725j);
        ArrayList arrayList = nVar.f13717b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof C4255n) {
                this.f13717b.add(new C4255n((C4255n) obj, gVar));
            } else {
                if (obj instanceof C4254m) {
                    pVar = new C4254m((C4254m) obj);
                } else if (obj instanceof C4253l) {
                    pVar = new C4253l((C4253l) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f13717b.add(pVar);
                String str2 = pVar.f13730n;
                if (str2 != null) {
                    gVar.put(str2, pVar);
                }
            }
        }
    }
}
