package org.chromium.p5643b.p5644a;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: org.chromium.b.a.bd */
/* compiled from: PG */
public abstract class C72335bd extends C8849b implements C72336be {
    public C72335bd() {
        super("org.chromium.weblayer_private.interfaces.IWebLayerClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Intent i3 = mo63802i();
                parcel2.writeNoException();
                C8850c.m23498g(parcel2, i3);
                return true;
            case 2:
                Intent j = mo63803j();
                parcel2.writeNoException();
                C8850c.m23498g(parcel2, j);
                return true;
            case 3:
                int b = mo63795b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            case 4:
                Intent h = mo63801h();
                parcel2.writeNoException();
                C8850c.m23498g(parcel2, h);
                return true;
            case 5:
                long e = mo63798e();
                parcel2.writeNoException();
                parcel2.writeLong(e);
                return true;
            case 6:
                long f = mo63799f();
                parcel2.writeNoException();
                parcel2.writeLong(f);
                return true;
            case 7:
                long g = mo63800g();
                parcel2.writeNoException();
                parcel2.writeLong(g);
                return true;
            case 8:
                Intent k = mo63804k();
                parcel2.writeNoException();
                C8850c.m23498g(parcel2, k);
                return true;
            case 9:
                int c = mo63796c();
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 10:
                int d = mo63797d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(mo63794a());
                return true;
            default:
                return false;
        }
    }
}
