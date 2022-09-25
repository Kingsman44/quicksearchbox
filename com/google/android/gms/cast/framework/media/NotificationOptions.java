package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class NotificationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143542z();

    /* renamed from: a */
    public static final C58485gu f389043a = C58485gu.m89847o(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);

    /* renamed from: b */
    public static final int[] f389044b = {0, 1};

    /* renamed from: A */
    public final int f389045A;

    /* renamed from: B */
    public final int f389046B;

    /* renamed from: C */
    public final int f389047C;

    /* renamed from: D */
    public final int f389048D;

    /* renamed from: E */
    public final int f389049E;

    /* renamed from: F */
    public final int f389050F;

    /* renamed from: G */
    public final int f389051G;

    /* renamed from: H */
    public final C143505g f389052H;

    /* renamed from: I */
    public final boolean f389053I;

    /* renamed from: J */
    public final boolean f389054J;

    /* renamed from: c */
    public final List f389055c;

    /* renamed from: d */
    public final int[] f389056d;

    /* renamed from: e */
    public final long f389057e;

    /* renamed from: f */
    public final String f389058f;

    /* renamed from: g */
    public final int f389059g;

    /* renamed from: h */
    public final int f389060h;

    /* renamed from: i */
    public final int f389061i;

    /* renamed from: j */
    public final int f389062j;

    /* renamed from: k */
    public final int f389063k;

    /* renamed from: l */
    public final int f389064l;

    /* renamed from: m */
    public final int f389065m;

    /* renamed from: n */
    public final int f389066n;

    /* renamed from: o */
    public final int f389067o;

    /* renamed from: p */
    public final int f389068p;

    /* renamed from: q */
    public final int f389069q;

    /* renamed from: r */
    public final int f389070r;

    /* renamed from: s */
    public final int f389071s;

    /* renamed from: t */
    public final int f389072t;

    /* renamed from: u */
    public final int f389073u;

    /* renamed from: v */
    public final int f389074v;

    /* renamed from: w */
    public final int f389075w;

    /* renamed from: x */
    public final int f389076x;

    /* renamed from: y */
    public final int f389077y;

    /* renamed from: z */
    public final int f389078z;

    public NotificationOptions(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        IBinder iBinder2 = iBinder;
        List list2 = list;
        this.f389055c = new ArrayList(list);
        this.f389056d = Arrays.copyOf(iArr, iArr.length);
        this.f389057e = j;
        this.f389058f = str;
        this.f389059g = i;
        this.f389060h = i2;
        this.f389061i = i3;
        this.f389062j = i4;
        this.f389063k = i5;
        this.f389064l = i6;
        this.f389065m = i7;
        this.f389066n = i8;
        this.f389067o = i9;
        this.f389068p = i10;
        this.f389069q = i11;
        this.f389070r = i12;
        this.f389071s = i13;
        this.f389072t = i14;
        this.f389073u = i15;
        this.f389074v = i16;
        this.f389075w = i17;
        this.f389076x = i18;
        this.f389077y = i19;
        this.f389078z = i20;
        this.f389045A = i21;
        this.f389046B = i22;
        this.f389047C = i23;
        this.f389048D = i24;
        this.f389049E = i25;
        this.f389050F = i26;
        this.f389051G = i27;
        this.f389053I = z;
        this.f389054J = z2;
        if (iBinder2 == null) {
            this.f389052H = null;
            return;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        this.f389052H = queryLocalInterface instanceof C143505g ? (C143505g) queryLocalInterface : new C143504f(iBinder2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234078A(parcel, 2, this.f389055c);
        int[] iArr = this.f389056d;
        C143947c.m234099r(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        C143947c.m234090i(parcel, 4, this.f389057e);
        C143947c.m234106y(parcel, 5, this.f389058f);
        C143947c.m234089h(parcel, 6, this.f389059g);
        C143947c.m234089h(parcel, 7, this.f389060h);
        C143947c.m234089h(parcel, 8, this.f389061i);
        C143947c.m234089h(parcel, 9, this.f389062j);
        C143947c.m234089h(parcel, 10, this.f389063k);
        C143947c.m234089h(parcel, 11, this.f389064l);
        C143947c.m234089h(parcel, 12, this.f389065m);
        C143947c.m234089h(parcel, 13, this.f389066n);
        C143947c.m234089h(parcel, 14, this.f389067o);
        C143947c.m234089h(parcel, 15, this.f389068p);
        C143947c.m234089h(parcel, 16, this.f389069q);
        C143947c.m234089h(parcel, 17, this.f389070r);
        C143947c.m234089h(parcel, 18, this.f389071s);
        C143947c.m234089h(parcel, 19, this.f389072t);
        C143947c.m234089h(parcel, 20, this.f389073u);
        C143947c.m234089h(parcel, 21, this.f389074v);
        C143947c.m234089h(parcel, 22, this.f389075w);
        C143947c.m234089h(parcel, 23, this.f389076x);
        C143947c.m234089h(parcel, 24, this.f389077y);
        C143947c.m234089h(parcel, 25, this.f389078z);
        C143947c.m234089h(parcel, 26, this.f389045A);
        C143947c.m234089h(parcel, 27, this.f389046B);
        C143947c.m234089h(parcel, 28, this.f389047C);
        C143947c.m234089h(parcel, 29, this.f389048D);
        C143947c.m234089h(parcel, 30, this.f389049E);
        C143947c.m234089h(parcel, 31, this.f389050F);
        C143947c.m234089h(parcel, 32, this.f389051G);
        C143505g gVar = this.f389052H;
        if (gVar == null) {
            iBinder = null;
        } else {
            iBinder = gVar.asBinder();
        }
        C143947c.m234098q(parcel, 33, iBinder);
        C143947c.m234084c(parcel, 34, this.f389053I);
        C143947c.m234084c(parcel, 35, this.f389054J);
        C143947c.m234083b(parcel, a);
    }
}
