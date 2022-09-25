package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.gsa.staticplugins.settings.C117309af;

/* compiled from: PG */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: Zb */
    private CharSequence f12786Zb;

    /* renamed from: Zc */
    private CharSequence f12787Zc;

    /* renamed from: Zd */
    private boolean f12788Zd;

    /* renamed from: a */
    public boolean f12789a;

    /* renamed from: b */
    public boolean f12790b;

    public TwoStatePreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo8389ac(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.f12789a && !TextUtils.isEmpty(this.f12786Zb)) {
                textView.setText(this.f12786Zb);
            } else if (this.f12789a || TextUtils.isEmpty(this.f12787Zc)) {
                CharSequence m = mo8328m();
                if (!TextUtils.isEmpty(m)) {
                    textView.setText(m);
                } else {
                    i = 8;
                }
            } else {
                textView.setText(this.f12787Zc);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public final void mo8390ad(C3998ax axVar) {
        mo8389ac(axVar.mo8435a(16908304));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8315c() {
        boolean z = !this.f12789a;
        if (mo8351R(Boolean.valueOf(z))) {
            mo8391j(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: fo */
    public final Parcelable mo8319fo() {
        Parcelable fo = super.mo8319fo();
        if (this.f12751w) {
            return fo;
        }
        SavedState savedState = new SavedState(fo);
        savedState.f12791a = this.f12789a;
        return savedState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Object mo8320g(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
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
        mo8391j(savedState.f12791a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo8322i(Object obj) {
        if (obj == null) {
            obj = false;
        }
        mo8391j(mo8352S(((Boolean) obj).booleanValue()));
    }

    /* renamed from: j */
    public final void mo8391j(boolean z) {
        boolean z2 = this.f12789a != z;
        if (z2 || !this.f12788Zd) {
            this.f12789a = z;
            this.f12788Zd = true;
            if (mo8355V() && z != mo8352S(!z)) {
                C4028x s = mo8367s();
                if (s != null) {
                    ((C117309af) s).f325645a.edit().putBoolean(this.f12748t, z).apply();
                } else {
                    SharedPreferences.Editor b = this.f12739k.mo8429b();
                    b.putBoolean(this.f12748t, z);
                    super.mo8349P(b);
                }
            }
            if (z2) {
                mo8374y(mo8324k());
                mo8317e();
            }
        }
    }

    /* renamed from: k */
    public final boolean mo8324k() {
        if (this.f12790b) {
            if (this.f12789a) {
                return true;
            }
        } else if (!this.f12789a) {
            return true;
        }
        return super.mo8324k();
    }

    /* renamed from: l */
    public final void mo8392l(CharSequence charSequence) {
        this.f12787Zc = charSequence;
        if (!this.f12789a) {
            mo8317e();
        }
    }

    /* renamed from: o */
    public final void mo8393o(CharSequence charSequence) {
        this.f12786Zb = charSequence;
        if (this.f12789a) {
            mo8317e();
        }
    }

    /* compiled from: PG */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4006be();

        /* renamed from: a */
        boolean f12791a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12791a = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12791a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
