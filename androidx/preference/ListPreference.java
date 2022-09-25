package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.p091b.C1875x;
import androidx.preference.Preference;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ListPreference extends DialogPreference {

    /* renamed from: I */
    private String f12705I;

    /* renamed from: J */
    private boolean f12706J;

    /* renamed from: g */
    public CharSequence[] f12707g;

    /* renamed from: h */
    public CharSequence[] f12708h;

    /* renamed from: i */
    public String f12709i;

    public ListPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo8318f(CharSequence[] charSequenceArr) {
        this.f12707g = charSequenceArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: fo */
    public final Parcelable mo8319fo() {
        Parcelable fo = super.mo8319fo();
        if (this.f12751w) {
            return fo;
        }
        SavedState savedState = new SavedState(fo);
        savedState.f12710a = this.f12709i;
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
        mo8330o(savedState.f12710a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo8322i(Object obj) {
        mo8330o(mo8368t((String) obj));
    }

    /* renamed from: j */
    public final int mo8326j(String str) {
        CharSequence[] charSequenceArr;
        if (!(str == null || (charSequenceArr = this.f12708h) == null)) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.f12708h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final CharSequence mo8327l() {
        CharSequence[] charSequenceArr;
        int j = mo8326j(this.f12709i);
        if (j < 0 || (charSequenceArr = this.f12707g) == null) {
            return null;
        }
        return charSequenceArr[j];
    }

    /* renamed from: m */
    public final CharSequence mo8328m() {
        C4026v vVar = this.f12722H;
        if (vVar != null) {
            return vVar.mo8450a(this);
        }
        Object l = mo8327l();
        CharSequence m = super.mo8328m();
        String str = this.f12705I;
        if (str == null) {
            return m;
        }
        Object[] objArr = new Object[1];
        if (l == null) {
            l = BuildConfig.FLAVOR;
        }
        objArr[0] = l;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, m)) {
            return m;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    /* renamed from: n */
    public final void mo8329n(CharSequence charSequence) {
        super.mo8329n(charSequence);
        if (charSequence == null) {
            this.f12705I = null;
        } else {
            this.f12705I = charSequence.toString();
        }
    }

    /* renamed from: o */
    public final void mo8330o(String str) {
        boolean z = !TextUtils.equals(this.f12709i, str);
        if (z || !this.f12706J) {
            this.f12709i = str;
            this.f12706J = true;
            mo8359Z(str);
            if (z) {
                mo8317e();
            }
        }
    }

    /* compiled from: PG */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4013i();

        /* renamed from: a */
        String f12710a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12710a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f12710a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1875x.m5115b(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12853e, i, i2);
        this.f12707g = C1875x.m5121h(obtainStyledAttributes, 2, 0);
        this.f12708h = C1875x.m5121h(obtainStyledAttributes, 3, 1);
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C4014j.f12876a == null) {
                C4014j.f12876a = new C4014j();
            }
            this.f12722H = C4014j.f12876a;
            mo8317e();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C3999ay.f12855g, i, i2);
        this.f12705I = C1875x.m5119f(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
