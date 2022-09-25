package android.support.p031v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.p031v4.media.MediaMetadataCompat;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
/* compiled from: PG */
public final class C0303e implements C0306h {

    /* renamed from: a */
    private final IBinder f1035a;

    public C0303e(IBinder iBinder) {
        this.f1035a = iBinder;
    }

    /* renamed from: A */
    public final boolean mo921A() {
        throw null;
    }

    /* renamed from: B */
    public final void mo922B() {
        throw null;
    }

    /* renamed from: C */
    public final void mo923C() {
        throw null;
    }

    /* renamed from: D */
    public final void mo924D() {
        throw null;
    }

    /* renamed from: E */
    public final void mo925E() {
        throw null;
    }

    /* renamed from: F */
    public final void mo926F() {
        throw null;
    }

    /* renamed from: G */
    public final void mo927G() {
        throw null;
    }

    /* renamed from: H */
    public final void mo928H() {
        throw null;
    }

    /* renamed from: I */
    public final void mo929I() {
        throw null;
    }

    /* renamed from: J */
    public final void mo930J() {
        throw null;
    }

    /* renamed from: K */
    public final void mo931K() {
        throw null;
    }

    /* renamed from: L */
    public final void mo932L() {
        throw null;
    }

    /* renamed from: M */
    public final void mo933M() {
        throw null;
    }

    /* renamed from: N */
    public final void mo934N() {
        throw null;
    }

    /* renamed from: O */
    public final void mo935O() {
        throw null;
    }

    /* renamed from: P */
    public final void mo936P() {
        throw null;
    }

    /* renamed from: Q */
    public final void mo937Q() {
        throw null;
    }

    /* renamed from: R */
    public final boolean mo938R() {
        throw null;
    }

    /* renamed from: S */
    public final void mo939S() {
        throw null;
    }

    /* renamed from: T */
    public final void mo940T() {
        throw null;
    }

    /* renamed from: U */
    public final void mo941U() {
        throw null;
    }

    /* renamed from: V */
    public final void mo942V() {
        throw null;
    }

    /* renamed from: W */
    public final void mo943W() {
        throw null;
    }

    /* renamed from: X */
    public final void mo944X() {
        throw null;
    }

    /* renamed from: a */
    public final int mo945a() {
        throw null;
    }

    public final IBinder asBinder() {
        return this.f1035a;
    }

    /* renamed from: b */
    public final int mo946b() {
        throw null;
    }

    /* renamed from: c */
    public final int mo947c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1035a.transact(47, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: d */
    public final long mo948d() {
        throw null;
    }

    /* renamed from: e */
    public final PendingIntent mo949e() {
        throw null;
    }

    /* renamed from: f */
    public final Bundle mo950f() {
        throw null;
    }

    /* renamed from: g */
    public final Bundle mo951g() {
        throw null;
    }

    /* renamed from: h */
    public final MediaMetadataCompat mo952h() {
        throw null;
    }

    /* renamed from: i */
    public final ParcelableVolumeInfo mo953i() {
        throw null;
    }

    /* renamed from: j */
    public final PlaybackStateCompat mo954j() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1035a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            return (PlaybackStateCompat) C0305g.m834a(obtain2, PlaybackStateCompat.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: k */
    public final CharSequence mo955k() {
        throw null;
    }

    /* renamed from: l */
    public final String mo956l() {
        throw null;
    }

    /* renamed from: m */
    public final String mo957m() {
        throw null;
    }

    /* renamed from: n */
    public final List mo958n() {
        throw null;
    }

    /* renamed from: o */
    public final void mo959o() {
        throw null;
    }

    /* renamed from: p */
    public final void mo960p() {
        throw null;
    }

    /* renamed from: q */
    public final void mo961q() {
        throw null;
    }

    /* renamed from: r */
    public final void mo962r() {
        throw null;
    }

    /* renamed from: s */
    public final void mo963s() {
        throw null;
    }

    /* renamed from: t */
    public final void mo964t() {
        throw null;
    }

    /* renamed from: u */
    public final void mo965u(C0302d dVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(dVar);
            this.f1035a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: v */
    public final void mo966v() {
        throw null;
    }

    /* renamed from: w */
    public final void mo967w() {
        throw null;
    }

    /* renamed from: x */
    public final void mo968x(C0302d dVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(dVar);
            this.f1035a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: y */
    public final boolean mo969y() {
        throw null;
    }

    /* renamed from: z */
    public final boolean mo970z() {
        throw null;
    }
}
