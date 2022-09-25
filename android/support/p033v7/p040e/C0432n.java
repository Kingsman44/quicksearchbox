package android.support.p033v7.p040e;

import android.support.p033v7.widget.p042b.C0530a;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: android.support.v7.e.n */
/* compiled from: PG */
public final class C0432n {

    /* renamed from: a */
    public Object[] f1438a;

    /* renamed from: b */
    public final C0431m f1439b;

    /* renamed from: c */
    public int f1440c = 0;

    /* renamed from: d */
    public final Class f1441d;

    public C0432n(Class cls, C0431m mVar) {
        this.f1441d = cls;
        this.f1438a = (Object[]) Array.newInstance(cls, 10);
        this.f1439b = mVar;
    }

    /* renamed from: a */
    public final Object mo1404a(int i) {
        if (i < this.f1440c && i >= 0) {
            return this.f1438a[i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.f1440c);
    }

    /* renamed from: b */
    public final void mo1405b() {
        int i = this.f1440c;
        if (i != 0) {
            Arrays.fill(this.f1438a, 0, i, (Object) null);
            this.f1440c = 0;
            ((C0530a) this.f1439b).f2097a.mObservable.mo2883e(0, i);
        }
    }

    /* renamed from: c */
    public final int mo1406c(Object obj, Object[] objArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (i4 < i) {
            int i5 = (i4 + i) / 2;
            Integer num = objArr[i5];
            int compare = this.f1439b.compare(num, obj);
            if (compare < 0) {
                i4 = i5 + 1;
            } else if (compare != 0) {
                i = i5;
            } else if (num.equals(obj)) {
                return i5;
            } else {
                int i6 = i5 - 1;
                while (true) {
                    if (i3 < i4) {
                        break;
                    }
                    Object obj2 = this.f1438a[i3];
                    if (this.f1439b.compare(obj2, obj) != 0) {
                        break;
                    } else if (((Integer) obj2).equals(obj)) {
                        break;
                    } else {
                        i6 = i3 - 1;
                    }
                }
                i3 = i5 + 1;
                while (true) {
                    if (i3 >= i) {
                        break;
                    }
                    Object obj3 = this.f1438a[i3];
                    if (this.f1439b.compare(obj3, obj) != 0) {
                        break;
                    } else if (((Integer) obj3).equals(obj)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                i3 = -1;
                return (i2 == 1 && i3 == -1) ? i5 : i3;
            }
        }
        if (i2 == 1) {
            return i4;
        }
        return -1;
    }
}
