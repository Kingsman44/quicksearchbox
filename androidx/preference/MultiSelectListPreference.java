package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.core.content.p091b.C1875x;
import androidx.preference.Preference;
import com.google.android.apps.gsa.staticplugins.settings.C117309af;
import com.google.android.googlequicksearchbox.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: g */
    public CharSequence[] f12711g;

    /* renamed from: h */
    public CharSequence[] f12712h;

    /* renamed from: i */
    public Set f12713i;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1875x.m5115b(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    /* access modifiers changed from: protected */
    /* renamed from: fo */
    public final Parcelable mo8319fo() {
        Parcelable fo = super.mo8319fo();
        if (this.f12751w) {
            return fo;
        }
        SavedState savedState = new SavedState(fo);
        savedState.f12714a = this.f12713i;
        return savedState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Object mo8320g(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence obj : textArray) {
            hashSet.add(obj.toString());
        }
        return hashSet;
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
        mo8332j(savedState.f12714a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo8322i(Object obj) {
        mo8332j(mo8370u((Set) obj));
    }

    /* renamed from: j */
    public final void mo8332j(Set set) {
        this.f12713i.clear();
        this.f12713i.addAll(set);
        if (mo8355V() && !set.equals(mo8370u((Set) null))) {
            C4028x s = mo8367s();
            if (s != null) {
                ((C117309af) s).f325645a.edit().putStringSet(this.f12748t, set).apply();
            } else {
                SharedPreferences.Editor b = this.f12739k.mo8429b();
                b.putStringSet(this.f12748t, set);
                super.mo8349P(b);
            }
        }
        mo8317e();
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f12713i = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12854f, i, 0);
        this.f12711g = C1875x.m5121h(obtainStyledAttributes, 2, 0);
        this.f12712h = C1875x.m5121h(obtainStyledAttributes, 3, 1);
        obtainStyledAttributes.recycle();
    }

    /* compiled from: PG */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4017m();

        /* renamed from: a */
        Set f12714a;

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f12714a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f12714a, strArr);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12714a.size());
            Set set = this.f12714a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
