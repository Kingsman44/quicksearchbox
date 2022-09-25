package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.p091b.C1875x;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class EditTextPreference extends DialogPreference {

    /* renamed from: g */
    public String f12703g;

    public EditTextPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: fo */
    public final Parcelable mo8319fo() {
        Parcelable fo = super.mo8319fo();
        if (this.f12751w) {
            return fo;
        }
        SavedState savedState = new SavedState(fo);
        savedState.f12704a = this.f12703g;
        return savedState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Object mo8320g(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo8321h(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo8321h(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo8321h(savedState.getSuperState());
        mo8323j(savedState.f12704a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo8322i(Object obj) {
        mo8323j(mo8368t((String) obj));
    }

    /* renamed from: j */
    public void mo8323j(String str) {
        boolean k = mo8324k();
        this.f12703g = str;
        mo8359Z(str);
        boolean k2 = mo8324k();
        if (k2 != k) {
            mo8374y(k2);
        }
        mo8317e();
    }

    /* renamed from: k */
    public final boolean mo8324k() {
        return TextUtils.isEmpty(this.f12703g) || super.mo8324k();
    }

    /* compiled from: PG */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4008d();

        /* renamed from: a */
        String f12704a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12704a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f12704a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1875x.m5115b(context, R.attr.editTextPreferenceStyle, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12852d, i, i2);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (C4009e.f12867a == null) {
                C4009e.f12867a = new C4009e();
            }
            this.f12722H = C4009e.f12867a;
            mo8317e();
        }
        obtainStyledAttributes.recycle();
    }
}
