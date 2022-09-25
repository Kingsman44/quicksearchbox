package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.p3507d.C44603a;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.p3512i.C44698h;
import java.util.Locale;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public final class BadgeState {

    /* renamed from: a */
    public final State f115790a;

    /* renamed from: b */
    public final State f115791b;

    /* renamed from: c */
    final float f115792c;

    /* renamed from: d */
    final float f115793d;

    /* renamed from: e */
    final float f115794e;

    /* compiled from: PG */
    public final class State implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C44537b();

        /* renamed from: a */
        public int f115795a;

        /* renamed from: b */
        public Integer f115796b;

        /* renamed from: c */
        public Integer f115797c;

        /* renamed from: d */
        public int f115798d = PrivateKeyType.INVALID;

        /* renamed from: e */
        public int f115799e = -2;

        /* renamed from: f */
        public int f115800f = -2;

        /* renamed from: g */
        public Locale f115801g;

        /* renamed from: h */
        public CharSequence f115802h;

        /* renamed from: i */
        public int f115803i;

        /* renamed from: j */
        public int f115804j;

        /* renamed from: k */
        public Integer f115805k;

        /* renamed from: l */
        public Boolean f115806l = true;

        /* renamed from: m */
        public Integer f115807m;

        /* renamed from: n */
        public Integer f115808n;

        /* renamed from: o */
        public Integer f115809o;

        /* renamed from: p */
        public Integer f115810p;

        /* renamed from: q */
        public Integer f115811q;

        /* renamed from: r */
        public Integer f115812r;

        public State() {
        }

        public State(Parcel parcel) {
            this.f115795a = parcel.readInt();
            this.f115796b = (Integer) parcel.readSerializable();
            this.f115797c = (Integer) parcel.readSerializable();
            this.f115798d = parcel.readInt();
            this.f115799e = parcel.readInt();
            this.f115800f = parcel.readInt();
            this.f115802h = parcel.readString();
            this.f115803i = parcel.readInt();
            this.f115805k = (Integer) parcel.readSerializable();
            this.f115807m = (Integer) parcel.readSerializable();
            this.f115808n = (Integer) parcel.readSerializable();
            this.f115809o = (Integer) parcel.readSerializable();
            this.f115810p = (Integer) parcel.readSerializable();
            this.f115811q = (Integer) parcel.readSerializable();
            this.f115812r = (Integer) parcel.readSerializable();
            this.f115806l = (Boolean) parcel.readSerializable();
            this.f115801g = (Locale) parcel.readSerializable();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            parcel.writeInt(this.f115795a);
            parcel.writeSerializable(this.f115796b);
            parcel.writeSerializable(this.f115797c);
            parcel.writeInt(this.f115798d);
            parcel.writeInt(this.f115799e);
            parcel.writeInt(this.f115800f);
            CharSequence charSequence = this.f115802h;
            if (charSequence == null) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f115803i);
            parcel.writeSerializable(this.f115805k);
            parcel.writeSerializable(this.f115807m);
            parcel.writeSerializable(this.f115808n);
            parcel.writeSerializable(this.f115809o);
            parcel.writeSerializable(this.f115810p);
            parcel.writeSerializable(this.f115811q);
            parcel.writeSerializable(this.f115812r);
            parcel.writeSerializable(this.f115806l);
            parcel.writeSerializable(this.f115801g);
        }
    }

    public BadgeState(Context context, State state) {
        AttributeSet attributeSet;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        State state2 = new State();
        this.f115791b = state2;
        int i9 = state.f115795a;
        int i10 = 0;
        if (i9 != 0) {
            AttributeSet e = C44603a.m79021e(context, i9);
            i = e.getStyleAttribute();
            attributeSet = e;
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray a = C44733be.m79295a(context, attributeSet, C44539d.f115826a, R.attr.badgeStyle, i == 0 ? 2132151730 : i, new int[0]);
        Resources resources = context.getResources();
        this.f115792c = (float) a.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f115794e = (float) a.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f115793d = (float) a.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        int i11 = state.f115798d;
        state2.f115798d = i11 == -2 ? PrivateKeyType.INVALID : i11;
        CharSequence charSequence = state.f115802h;
        state2.f115802h = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        int i12 = state.f115803i;
        state2.f115803i = i12 == 0 ? R.plurals.mtrl_badge_content_description : i12;
        int i13 = state.f115804j;
        state2.f115804j = i13 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i13;
        Boolean bool = state.f115806l;
        state2.f115806l = Boolean.valueOf(bool == null || bool.booleanValue());
        int i14 = state.f115800f;
        state2.f115800f = i14 == -2 ? a.getInt(8, 4) : i14;
        int i15 = state.f115799e;
        if (i15 != -2) {
            state2.f115799e = i15;
        } else {
            state2.f115799e = a.hasValue(9) ? a.getInt(9, 0) : -1;
        }
        Integer num = state.f115796b;
        if (num == null) {
            i2 = C44694d.m79230b(context, a, 0).getDefaultColor();
        } else {
            i2 = num.intValue();
        }
        state2.f115796b = Integer.valueOf(i2);
        Integer num2 = state.f115797c;
        if (num2 != null) {
            state2.f115797c = num2;
        } else if (a.hasValue(3)) {
            state2.f115797c = Integer.valueOf(C44694d.m79230b(context, a, 3).getDefaultColor());
        } else {
            state2.f115797c = Integer.valueOf(new C44698h(context, 2132150530).f116503j.getDefaultColor());
        }
        Integer num3 = state.f115805k;
        if (num3 == null) {
            i3 = a.getInt(1, 8388661);
        } else {
            i3 = num3.intValue();
        }
        state2.f115805k = Integer.valueOf(i3);
        Integer num4 = state.f115807m;
        if (num4 == null) {
            i4 = a.getDimensionPixelOffset(6, 0);
        } else {
            i4 = num4.intValue();
        }
        state2.f115807m = Integer.valueOf(i4);
        Integer num5 = state.f115808n;
        if (num5 == null) {
            i5 = a.getDimensionPixelOffset(10, 0);
        } else {
            i5 = num5.intValue();
        }
        state2.f115808n = Integer.valueOf(i5);
        Integer num6 = state.f115809o;
        if (num6 == null) {
            i6 = a.getDimensionPixelOffset(7, state2.f115807m.intValue());
        } else {
            i6 = num6.intValue();
        }
        state2.f115809o = Integer.valueOf(i6);
        Integer num7 = state.f115810p;
        if (num7 == null) {
            i7 = a.getDimensionPixelOffset(11, state2.f115808n.intValue());
        } else {
            i7 = num7.intValue();
        }
        state2.f115810p = Integer.valueOf(i7);
        Integer num8 = state.f115811q;
        if (num8 == null) {
            i8 = 0;
        } else {
            i8 = num8.intValue();
        }
        state2.f115811q = Integer.valueOf(i8);
        Integer num9 = state.f115812r;
        state2.f115812r = Integer.valueOf(num9 != null ? num9.intValue() : i10);
        a.recycle();
        Locale locale = state.f115801g;
        state2.f115801g = locale == null ? Locale.getDefault(Locale.Category.FORMAT) : locale;
        this.f115790a = state;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47471a() {
        return this.f115791b.f115805k.intValue();
    }

    /* renamed from: b */
    public final int mo47472b() {
        return this.f115791b.f115807m.intValue();
    }

    /* renamed from: c */
    public final boolean mo47473c() {
        return this.f115791b.f115799e != -1;
    }
}
