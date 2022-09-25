package p3186j$.util;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;

/* renamed from: j$.util.o */
final class C41120o implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f107696a = 0;

    /* renamed from: b */
    private int f107697b;

    /* renamed from: c */
    private int f107698c;

    /* renamed from: d */
    final /* synthetic */ Serializable f107699d;

    public C41120o(C41121p pVar) {
        this.f107699d = pVar;
        int i = pVar.f107702b;
        this.f107697b = i;
        if (i > 0) {
            this.f107698c = C40947a.m71100d(C41329u.f108056a, pVar.f107701a.length >> 1) << 1;
        }
    }

    public final boolean hasNext() {
        switch (this.f107696a) {
            case 0:
                if (this.f107697b > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f107697b > 0) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        int i;
        Object obj;
        Object[] objArr;
        int i2;
        Object obj2;
        int i3 = this.f107696a;
        Serializable serializable = this.f107699d;
        switch (i3) {
            case 0:
                if (hasNext()) {
                    do {
                        objArr = ((C41121p) serializable).f107701a;
                        int i4 = this.f107698c;
                        if (C41329u.f108056a >= 0) {
                            i2 = i4 + 2;
                            if (i2 >= objArr.length) {
                                i2 = 0;
                            }
                        } else {
                            i2 = i4 - 2;
                            if (i2 < 0) {
                                i2 = objArr.length - 2;
                            }
                        }
                        this.f107698c = i2;
                        obj2 = objArr[i2];
                    } while (obj2 == null);
                    this.f107697b--;
                    return new C41330v(obj2, objArr[i2 + 1]);
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    do {
                        Object[] objArr2 = ((C41124s) serializable).f107708a;
                        int i5 = this.f107698c;
                        if (C41329u.f108056a >= 0) {
                            i = i5 + 1;
                            if (i >= objArr2.length) {
                                i = 0;
                            }
                        } else {
                            i = i5 - 1;
                            if (i < 0) {
                                i = objArr2.length - 1;
                            }
                        }
                        this.f107698c = i;
                        obj = objArr2[i];
                    } while (obj == null);
                    this.f107697b--;
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    public C41120o(C41124s sVar) {
        this.f107699d = sVar;
        int i = sVar.f107709b;
        this.f107697b = i;
        if (i > 0) {
            this.f107698c = C40947a.m71100d(C41329u.f108056a, sVar.f107708a.length);
        }
    }
}
