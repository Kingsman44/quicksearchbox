package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new C143867g();

    /* renamed from: a */
    final int f389961a;

    /* renamed from: b */
    public final String[] f389962b;

    /* renamed from: c */
    public Bundle f389963c;

    /* renamed from: d */
    public final CursorWindow[] f389964d;

    /* renamed from: e */
    public final int f389965e;

    /* renamed from: f */
    public final Bundle f389966f;

    /* renamed from: g */
    int[] f389967g;

    /* renamed from: h */
    public int f389968h;

    /* renamed from: i */
    public boolean f389969i = false;

    /* renamed from: j */
    private boolean f389970j = true;

    static {
        String[] strArr = new String[0];
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f389961a = i;
        this.f389962b = strArr;
        this.f389964d = cursorWindowArr;
        this.f389965e = i2;
        this.f389966f = bundle;
    }

    /* renamed from: a */
    public final int mo119316a(int i) {
        int length;
        int i2 = 0;
        C143919bh.m233966i(i >= 0 && i < this.f389968h);
        while (true) {
            int[] iArr = this.f389967g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == length ? i2 - 1 : i2;
    }

    /* renamed from: b */
    public final String mo119317b(String str, int i, int i2) {
        mo119318c(str, i);
        return this.f389964d[i2].getString(i, this.f389963c.getInt(str));
    }

    /* renamed from: c */
    public final void mo119318c(String str, int i) {
        boolean z;
        Bundle bundle = this.f389963c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        synchronized (this) {
            z = this.f389969i;
        }
        if (z) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f389968h) {
            throw new CursorIndexOutOfBoundsException(i, this.f389968h);
        }
    }

    public final void close() {
        synchronized (this) {
            if (!this.f389969i) {
                this.f389969i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f389964d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo119320d(String str, int i, int i2) {
        mo119318c(str, i);
        return this.f389964d[i2].isNull(i, this.f389963c.getInt(str));
    }

    /* renamed from: e */
    public final byte[] mo119321e(String str, int i, int i2) {
        mo119318c(str, i);
        return this.f389964d[i2].getBlob(i, this.f389963c.getInt(str));
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        boolean z;
        try {
            if (this.f389970j && this.f389964d.length > 0) {
                synchronized (this) {
                    z = this.f389969i;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + obj + ")");
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234107z(parcel, 1, this.f389962b);
        C143947c.m234079B(parcel, 2, this.f389964d, i);
        C143947c.m234089h(parcel, 3, this.f389965e);
        C143947c.m234093l(parcel, 4, this.f389966f);
        C143947c.m234089h(parcel, 1000, this.f389961a);
        C143947c.m234083b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
