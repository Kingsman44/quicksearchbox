package androidx.core.p097i;

/* renamed from: androidx.core.i.g */
/* compiled from: PG */
public class C1972g implements C1971f {

    /* renamed from: a */
    private final Object[] f5890a;

    /* renamed from: b */
    private int f5891b;

    public C1972g(int i) {
        if (i > 0) {
            this.f5890a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public Object mo5126a() {
        int i = this.f5891b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f5890a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f5891b = i2;
        return obj;
    }

    /* renamed from: b */
    public boolean mo5127b(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.f5891b;
            if (i >= i2) {
                Object[] objArr = this.f5890a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f5891b = i2 + 1;
                return true;
            } else if (this.f5890a[i] != obj) {
                i++;
            } else {
                throw new IllegalStateException("Already in the pool!");
            }
        }
    }
}
