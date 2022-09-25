package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58838bb;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: io.grpc.binder.a.am */
/* compiled from: PG */
final class C70189am extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: f */
    public static final /* synthetic */ int f187062f = 0;

    /* renamed from: a */
    public final Parcelable.Creator f187063a;

    /* renamed from: b */
    public final boolean f187064b;

    /* renamed from: c */
    public final Parcelable f187065c;

    /* renamed from: d */
    InputStream f187066d;

    /* renamed from: e */
    Parcelable f187067e;

    public C70189am(Parcelable.Creator creator, Parcelable parcelable, boolean z) {
        this.f187063a = creator;
        this.f187065c = parcelable;
        this.f187064b = z;
        boolean z2 = true;
        if (creator == null && !z) {
            z2 = false;
        }
        C58838bb.m90868c(z2);
    }

    /* renamed from: b */
    private final InputStream m102244b() {
        if (this.f187066d == null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(this.f187065c, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            this.f187066d = new ByteArrayInputStream(marshall);
        }
        return this.f187066d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo61793a(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        Parcelable parcelable = this.f187065c;
        parcel.writeParcelable(parcelable, parcelable.describeContents());
        return parcel.dataPosition() - dataPosition;
    }

    public final int available() {
        return m102244b().available();
    }

    public final void close() {
        InputStream inputStream = this.f187066d;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void mark(int i) {
        InputStream inputStream = this.f187066d;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        return m102244b().read();
    }

    public final void reset() {
        InputStream inputStream = this.f187066d;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    public final long skip(long j) {
        if (j <= 0) {
            return 0;
        }
        return m102244b().skip(j);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f187065c);
        return "ParcelableInputStream[V: " + valueOf + "]";
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        return m102244b().read(bArr, i, i2);
    }
}
