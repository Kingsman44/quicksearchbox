package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.p060c.C0984n;
import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.versionedparcelable.e */
/* compiled from: PG */
final class C4266e extends C4265d {

    /* renamed from: d */
    private final SparseIntArray f13776d;

    /* renamed from: e */
    private final Parcel f13777e;

    /* renamed from: f */
    private final int f13778f;

    /* renamed from: g */
    private final int f13779g;

    /* renamed from: h */
    private final String f13780h;

    /* renamed from: i */
    private int f13781i;

    /* renamed from: j */
    private int f13782j;

    /* renamed from: k */
    private int f13783k;

    public C4266e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C0984n(0), new C0984n(0), new C0984n(0));
    }

    /* renamed from: B */
    public final boolean mo9091B() {
        return this.f13777e.readInt() != 0;
    }

    /* renamed from: D */
    public final boolean mo9093D(int i) {
        while (this.f13782j < this.f13779g) {
            int i2 = this.f13783k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f13777e.setDataPosition(this.f13782j);
            int readInt = this.f13777e.readInt();
            this.f13783k = this.f13777e.readInt();
            this.f13782j += readInt;
        }
        return this.f13783k == i;
    }

    /* renamed from: E */
    public final byte[] mo9094E() {
        int readInt = this.f13777e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f13777e.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: a */
    public final int mo9096a() {
        return this.f13777e.readInt();
    }

    /* renamed from: c */
    public final long mo9098c() {
        return this.f13777e.readLong();
    }

    /* renamed from: d */
    public final Bundle mo9099d() {
        return this.f13777e.readBundle(getClass().getClassLoader());
    }

    /* renamed from: e */
    public final IBinder mo9100e() {
        return this.f13777e.readStrongBinder();
    }

    /* renamed from: f */
    public final Parcelable mo9101f() {
        return this.f13777e.readParcelable(getClass().getClassLoader());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C4265d mo9103h() {
        Parcel parcel = this.f13777e;
        int dataPosition = parcel.dataPosition();
        int i = this.f13782j;
        if (i == this.f13778f) {
            i = this.f13779g;
        }
        return new C4266e(parcel, dataPosition, i, this.f13780h.concat("  "), this.f13773a, this.f13774b, this.f13775c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final CharSequence mo9106k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f13777e);
    }

    /* renamed from: m */
    public final String mo9108m() {
        return this.f13777e.readString();
    }

    /* renamed from: o */
    public final void mo9110o() {
        int i = this.f13781i;
        if (i >= 0) {
            int i2 = this.f13776d.get(i);
            int dataPosition = this.f13777e.dataPosition();
            this.f13777e.setDataPosition(i2);
            this.f13777e.writeInt(dataPosition - i2);
            this.f13777e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: p */
    public final void mo9111p(int i) {
        mo9110o();
        this.f13781i = i;
        this.f13776d.put(i, this.f13777e.dataPosition());
        this.f13777e.writeInt(0);
        this.f13777e.writeInt(i);
    }

    /* renamed from: r */
    public final void mo9113r(boolean z) {
        this.f13777e.writeInt(z ? 1 : 0);
    }

    /* renamed from: s */
    public final void mo9114s(Bundle bundle) {
        this.f13777e.writeBundle(bundle);
    }

    /* renamed from: t */
    public final void mo9115t(byte[] bArr) {
        if (bArr != null) {
            this.f13777e.writeInt(bArr.length);
            this.f13777e.writeByteArray(bArr);
            return;
        }
        this.f13777e.writeInt(-1);
    }

    /* renamed from: u */
    public final void mo9116u(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f13777e, 0);
    }

    /* renamed from: v */
    public final void mo9117v(int i) {
        this.f13777e.writeInt(i);
    }

    /* renamed from: w */
    public final void mo9118w(long j) {
        this.f13777e.writeLong(j);
    }

    /* renamed from: x */
    public final void mo9119x(Parcelable parcelable) {
        this.f13777e.writeParcelable(parcelable, 0);
    }

    /* renamed from: y */
    public final void mo9120y(String str) {
        this.f13777e.writeString(str);
    }

    /* renamed from: z */
    public final void mo9121z(IBinder iBinder) {
        this.f13777e.writeStrongBinder(iBinder);
    }

    private C4266e(Parcel parcel, int i, int i2, String str, C0984n nVar, C0984n nVar2, C0984n nVar3) {
        super(nVar, nVar2, nVar3);
        this.f13776d = new SparseIntArray();
        this.f13781i = -1;
        this.f13783k = -1;
        this.f13777e = parcel;
        this.f13778f = i;
        this.f13779g = i2;
        this.f13782j = i;
        this.f13780h = str;
    }
}
