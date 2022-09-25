package androidx.appsearch.p047a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.appsearch.a.v */
/* compiled from: PG */
public final class C0857v {

    /* renamed from: a */
    public Bundle f2842a;

    /* renamed from: b */
    private Bundle f2843b;

    /* renamed from: c */
    private final C0857v f2844c;

    /* renamed from: d */
    private boolean f2845d = false;

    /* renamed from: k */
    public static final void m2720k(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Property name cannot be blank.");
        }
    }

    /* renamed from: c */
    public final C0858w mo3432c() {
        this.f2845d = true;
        if (this.f2843b.getLong("creationTimestampMillis", -1) == -1) {
            this.f2843b.putLong("creationTimestampMillis", System.currentTimeMillis());
        }
        return new C0858w(this.f2843b);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo3433d() {
        if (this.f2845d) {
            Bundle bundle = this.f2843b;
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeBundle(bundle);
                byte[] marshall = obtain.marshall();
                obtain.unmarshall(marshall, 0, marshall.length);
                obtain.setDataPosition(0);
                Bundle readBundle = obtain.readBundle();
                obtain.recycle();
                this.f2843b = readBundle;
                this.f2842a = readBundle.getBundle("properties");
                this.f2845d = false;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void mo3434e(long j) {
        mo3433d();
        this.f2843b.putLong("creationTimestampMillis", j);
    }

    /* renamed from: a */
    public final C0857v mo3430a(int i) {
        if (i >= 0) {
            mo3433d();
            this.f2843b.putInt("score", i);
            return this.f2844c;
        }
        throw new IllegalArgumentException("Document score cannot be negative.");
    }

    /* renamed from: b */
    public final C0857v mo3431b(long j) {
        if (j >= 0) {
            mo3433d();
            this.f2843b.putLong("ttlMillis", j);
            return this.f2844c;
        }
        throw new IllegalArgumentException("Document ttlMillis cannot be negative.");
    }

    /* renamed from: f */
    public final void mo3435f(String str, boolean... zArr) {
        str.getClass();
        zArr.getClass();
        mo3433d();
        m2720k(str);
        this.f2842a.putBooleanArray(str, zArr);
    }

    /* renamed from: i */
    public final void mo3438i(String str, long... jArr) {
        str.getClass();
        jArr.getClass();
        mo3433d();
        m2720k(str);
        this.f2842a.putLongArray(str, jArr);
    }

    /* renamed from: j */
    public final void mo3439j(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        mo3433d();
        m2720k(str);
        int i = 0;
        while (i < strArr.length) {
            if (strArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("The String at " + i + " is null.");
            }
        }
        this.f2842a.putStringArray(str, strArr);
    }

    /* renamed from: h */
    public final void mo3437h(String str, C0858w... wVarArr) {
        str.getClass();
        wVarArr.getClass();
        mo3433d();
        m2720k(str);
        Parcelable[] parcelableArr = new Parcelable[wVarArr.length];
        int i = 0;
        while (i < wVarArr.length) {
            C0858w wVar = wVarArr[i];
            if (wVar != null) {
                parcelableArr[i] = wVar.f2846a;
                i++;
            } else {
                throw new IllegalArgumentException("The document at " + i + " is null.");
            }
        }
        this.f2842a.putParcelableArray(str, parcelableArr);
    }

    public C0857v(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Bundle bundle = new Bundle();
        this.f2843b = bundle;
        this.f2844c = this;
        bundle.putString("namespace", str);
        this.f2843b.putString("id", str2);
        this.f2843b.putString("schemaType", str3);
        this.f2843b.putLong("ttlMillis", 0);
        this.f2843b.putInt("score", 0);
        Bundle bundle2 = new Bundle();
        this.f2842a = bundle2;
        this.f2843b.putBundle("properties", bundle2);
    }

    /* renamed from: g */
    public final void mo3436g(String str, byte[]... bArr) {
        str.getClass();
        bArr.getClass();
        mo3433d();
        m2720k(str);
        ArrayList arrayList = new ArrayList(bArr.length);
        int i = 0;
        while (i < bArr.length) {
            if (bArr[i] != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("byteArray", bArr[i]);
                arrayList.add(bundle);
                i++;
            } else {
                throw new IllegalArgumentException("The byte[] at " + i + " is null.");
            }
        }
        this.f2842a.putParcelableArrayList(str, arrayList);
    }
}
