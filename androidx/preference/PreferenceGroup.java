package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.p091b.C1875x;
import androidx.p060c.C0984n;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: a */
    final C0984n f12755a;

    /* renamed from: b */
    public final List f12756b;

    /* renamed from: c */
    public boolean f12757c;

    /* renamed from: d */
    public int f12758d;

    /* renamed from: e */
    private final Handler f12759e;

    /* renamed from: f */
    private int f12760f;

    /* renamed from: g */
    private boolean f12761g;

    /* renamed from: h */
    private final Runnable f12762h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    public final void mo8334A() {
        super.mo8338E();
        this.f12761g = true;
        int j = mo8381j();
        for (int i = 0; i < j; i++) {
            mo8383o(i).mo8334A();
        }
    }

    /* renamed from: C */
    public final void mo8336C() {
        super.mo8350Q();
        this.f12761g = false;
        int j = mo8381j();
        for (int i = 0; i < j; i++) {
            mo8383o(i).mo8336C();
        }
    }

    /* renamed from: ac */
    public final void mo8376ac() {
        synchronized (this) {
            List list = this.f12756b;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    mo8380ag((Preference) list.get(0));
                }
            }
        }
        mo8375z();
    }

    /* renamed from: ad */
    public final void mo8377ad(int i) {
        if (i != Integer.MAX_VALUE && !mo8353T()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.f12758d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public boolean mo8378ae() {
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: af */
    public final void mo8379af(Preference preference) {
        long j;
        if (!this.f12756b.contains(preference)) {
            if (preference.f12748t != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.f12721G;
                    if (preferenceGroup2 == null) {
                        break;
                    }
                    preferenceGroup = preferenceGroup2;
                }
                String str = preference.f12748t;
                if (preferenceGroup.mo8382l(str) != null) {
                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                }
            }
            if (preference.f12744p == Integer.MAX_VALUE) {
                if (this.f12757c) {
                    int i = this.f12760f;
                    this.f12760f = i + 1;
                    preference.mo8344K(i);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).f12757c = this.f12757c;
                }
            }
            int binarySearch = Collections.binarySearch(this.f12756b, preference);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            preference.mo8357X(mo8324k());
            synchronized (this) {
                this.f12756b.add(binarySearch, preference);
            }
            C3995au auVar = this.f12739k;
            String str2 = preference.f12748t;
            if (str2 == null || !this.f12755a.containsKey(str2)) {
                j = auVar.mo8428a();
            } else {
                j = ((Long) this.f12755a.get(str2)).longValue();
                this.f12755a.remove(str2);
            }
            preference.f12740l = j;
            preference.f12741m = true;
            try {
                preference.mo8335B(auVar);
                preference.f12741m = false;
                preference.mo8371v(this);
                if (this.f12761g) {
                    preference.mo8334A();
                }
                mo8375z();
            } catch (Throwable th) {
                preference.f12741m = false;
                throw th;
            }
        }
    }

    /* renamed from: ag */
    public final void mo8380ag(Preference preference) {
        synchronized (this) {
            super.mo8350Q();
            if (preference.f12721G == this) {
                preference.mo8371v((PreferenceGroup) null);
            }
            if (this.f12756b.remove(preference)) {
                String str = preference.f12748t;
                if (str != null) {
                    this.f12755a.put(str, Long.valueOf(preference.mo8363fn()));
                    this.f12759e.removeCallbacks(this.f12762h);
                    this.f12759e.post(this.f12762h);
                }
                if (this.f12761g) {
                    preference.mo8336C();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: fo */
    public final Parcelable mo8319fo() {
        return new SavedState(super.mo8319fo(), this.f12758d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo8321h(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo8321h(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f12758d = savedState.f12763a;
        super.mo8321h(savedState.getSuperState());
    }

    /* renamed from: j */
    public final int mo8381j() {
        return this.f12756b.size();
    }

    /* renamed from: l */
    public final Preference mo8382l(CharSequence charSequence) {
        Preference l;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.f12748t, charSequence)) {
            return this;
        } else {
            int j = mo8381j();
            for (int i = 0; i < j; i++) {
                Preference o = mo8383o(i);
                if (TextUtils.equals(o.f12748t, charSequence)) {
                    return o;
                }
                if ((o instanceof PreferenceGroup) && (l = ((PreferenceGroup) o).mo8382l(charSequence)) != null) {
                    return l;
                }
            }
            return null;
        }
    }

    /* renamed from: o */
    public final Preference mo8383o(int i) {
        return (Preference) this.f12756b.get(i);
    }

    /* renamed from: w */
    public final void mo8372w(Bundle bundle) {
        super.mo8372w(bundle);
        int j = mo8381j();
        for (int i = 0; i < j; i++) {
            mo8383o(i).mo8372w(bundle);
        }
    }

    /* renamed from: x */
    public final void mo8373x(Bundle bundle) {
        super.mo8373x(bundle);
        int j = mo8381j();
        for (int i = 0; i < j; i++) {
            mo8383o(i).mo8373x(bundle);
        }
    }

    /* renamed from: y */
    public final void mo8374y(boolean z) {
        super.mo8374y(z);
        int j = mo8381j();
        for (int i = 0; i < j; i++) {
            mo8383o(i).mo8357X(z);
        }
    }

    /* compiled from: PG */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C3986al();

        /* renamed from: a */
        int f12763a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12763a = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12763a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f12763a = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12755a = new C0984n(0);
        this.f12759e = new Handler(Looper.getMainLooper());
        this.f12757c = true;
        this.f12760f = 0;
        this.f12761g = false;
        this.f12758d = Integer.MAX_VALUE;
        this.f12762h = new C3984aj(this);
        this.f12756b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12857i, i, i2);
        this.f12757c = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            mo8377ad(C1875x.m5122i(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }
}
