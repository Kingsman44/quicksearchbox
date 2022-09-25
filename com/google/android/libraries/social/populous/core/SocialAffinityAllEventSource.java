package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class SocialAffinityAllEventSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42336dh();

    /* renamed from: a */
    public final int f110820a;

    /* renamed from: b */
    public final int f110821b;

    /* renamed from: c */
    public final int f110822c;

    /* renamed from: d */
    public final int f110823d;

    /* renamed from: e */
    public final int f110824e;

    /* renamed from: f */
    public final int f110825f;

    /* renamed from: g */
    public final int f110826g;

    /* renamed from: h */
    public final int f110827h;

    /* renamed from: i */
    public final int f110828i;

    /* renamed from: j */
    public final int f110829j;

    public SocialAffinityAllEventSource(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f110820a = i;
        this.f110821b = i2;
        this.f110822c = i3;
        this.f110823d = i4;
        this.f110824e = i5;
        this.f110825f = i6;
        this.f110826g = i7;
        this.f110827h = i8;
        this.f110828i = i9;
        this.f110829j = i10;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SocialAffinityAllEventSource)) {
            return false;
        }
        SocialAffinityAllEventSource socialAffinityAllEventSource = (SocialAffinityAllEventSource) obj;
        int i = this.f110820a;
        int i2 = socialAffinityAllEventSource.f110820a;
        if (i != 0) {
            if (i == i2) {
                int i3 = this.f110821b;
                int i4 = socialAffinityAllEventSource.f110821b;
                if (i3 == 0) {
                    throw null;
                } else if (i3 == i4) {
                    int i5 = this.f110822c;
                    int i6 = socialAffinityAllEventSource.f110822c;
                    if (i5 == 0) {
                        throw null;
                    } else if (i5 == i6) {
                        int i7 = this.f110823d;
                        int i8 = socialAffinityAllEventSource.f110823d;
                        if (i7 == 0) {
                            throw null;
                        } else if (i7 == i8) {
                            int i9 = this.f110824e;
                            int i10 = socialAffinityAllEventSource.f110824e;
                            if (i9 == 0) {
                                throw null;
                            } else if (i9 == i10) {
                                int i11 = this.f110825f;
                                int i12 = socialAffinityAllEventSource.f110825f;
                                if (i11 == 0) {
                                    throw null;
                                } else if (i11 == i12) {
                                    int i13 = this.f110826g;
                                    int i14 = socialAffinityAllEventSource.f110826g;
                                    if (i13 == 0) {
                                        throw null;
                                    } else if (i13 == i14) {
                                        int i15 = this.f110827h;
                                        int i16 = socialAffinityAllEventSource.f110827h;
                                        if (i15 == 0) {
                                            throw null;
                                        } else if (i15 == i16) {
                                            int i17 = this.f110828i;
                                            int i18 = socialAffinityAllEventSource.f110828i;
                                            if (i17 == 0) {
                                                throw null;
                                            } else if (i17 == i18) {
                                                int i19 = this.f110829j;
                                                int i20 = socialAffinityAllEventSource.f110829j;
                                                if (i19 == 0) {
                                                    throw null;
                                                } else if (i19 == i20) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f110820a), Integer.valueOf(this.f110821b), Integer.valueOf(this.f110822c), Integer.valueOf(this.f110823d), Integer.valueOf(this.f110824e), Integer.valueOf(this.f110825f), Integer.valueOf(this.f110826g), Integer.valueOf(this.f110827h), Integer.valueOf(this.f110828i), Integer.valueOf(this.f110829j)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f110820a;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            int i4 = this.f110821b;
            int i5 = i4 - 1;
            if (i4 != 0) {
                parcel.writeInt(i5);
                int i6 = this.f110822c;
                int i7 = i6 - 1;
                if (i6 != 0) {
                    parcel.writeInt(i7);
                    int i8 = this.f110823d;
                    int i9 = i8 - 1;
                    if (i8 != 0) {
                        parcel.writeInt(i9);
                        int i10 = this.f110824e;
                        int i11 = i10 - 1;
                        if (i10 != 0) {
                            parcel.writeInt(i11);
                            int i12 = this.f110825f;
                            int i13 = i12 - 1;
                            if (i12 != 0) {
                                parcel.writeInt(i13);
                                int i14 = this.f110826g;
                                int i15 = i14 - 1;
                                if (i14 != 0) {
                                    parcel.writeInt(i15);
                                    int i16 = this.f110827h;
                                    int i17 = i16 - 1;
                                    if (i16 != 0) {
                                        parcel.writeInt(i17);
                                        int i18 = this.f110828i;
                                        int i19 = i18 - 1;
                                        if (i18 != 0) {
                                            parcel.writeInt(i19);
                                            int i20 = this.f110829j;
                                            int i21 = i20 - 1;
                                            if (i20 != 0) {
                                                parcel.writeInt(i21);
                                                return;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
