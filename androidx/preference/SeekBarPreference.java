package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.gsa.staticplugins.settings.C117309af;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class SeekBarPreference extends Preference {

    /* renamed from: I */
    private boolean f12765I;

    /* renamed from: J */
    private final SeekBar.OnSeekBarChangeListener f12766J = new C4000az(this);

    /* renamed from: K */
    private final View.OnKeyListener f12767K = new C4002ba(this);

    /* renamed from: a */
    int f12768a;

    /* renamed from: b */
    int f12769b;

    /* renamed from: c */
    boolean f12770c;

    /* renamed from: d */
    SeekBar f12771d;

    /* renamed from: e */
    boolean f12772e;

    /* renamed from: f */
    public boolean f12773f;

    /* renamed from: g */
    private int f12774g;

    /* renamed from: h */
    private int f12775h;

    /* renamed from: i */
    private TextView f12776i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12859k, R.attr.seekBarPreferenceStyle, 0);
        this.f12769b = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.f12769b;
        i = i < i2 ? i2 : i;
        if (i != this.f12774g) {
            this.f12774g = i;
            mo8317e();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f12775h) {
            this.f12775h = Math.min(this.f12774g - this.f12769b, Math.abs(i3));
            mo8317e();
        }
        this.f12772e = obtainStyledAttributes.getBoolean(2, true);
        this.f12765I = obtainStyledAttributes.getBoolean(5, false);
        this.f12773f = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        axVar.itemView.setOnKeyListener(this.f12767K);
        this.f12771d = (SeekBar) axVar.mo8435a(R.id.seekbar);
        TextView textView = (TextView) axVar.mo8435a(R.id.seekbar_value);
        this.f12776i = textView;
        if (this.f12765I) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f12776i = null;
        }
        SeekBar seekBar = this.f12771d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f12766J);
        this.f12771d.setMax(this.f12774g - this.f12769b);
        int i = this.f12775h;
        if (i != 0) {
            this.f12771d.setKeyProgressIncrement(i);
        } else {
            this.f12775h = this.f12771d.getKeyProgressIncrement();
        }
        this.f12771d.setProgress(this.f12768a - this.f12769b);
        mo8387o(this.f12768a);
        this.f12771d.setEnabled(mo8354U());
    }

    /* access modifiers changed from: protected */
    /* renamed from: fo */
    public final Parcelable mo8319fo() {
        Parcelable fo = super.mo8319fo();
        if (this.f12751w) {
            return fo;
        }
        SavedState savedState = new SavedState(fo);
        savedState.f12777a = this.f12768a;
        savedState.f12778b = this.f12769b;
        savedState.f12779c = this.f12774g;
        return savedState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Object mo8320g(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
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
        this.f12768a = savedState.f12777a;
        this.f12769b = savedState.f12778b;
        this.f12774g = savedState.f12779c;
        mo8317e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo8322i(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        mo8385j(mo8364p(((Integer) obj).intValue()), true);
    }

    /* renamed from: j */
    public final void mo8385j(int i, boolean z) {
        int i2 = this.f12769b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f12774g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f12768a) {
            this.f12768a = i;
            mo8387o(i);
            if (mo8355V() && i != mo8364p(i ^ -1)) {
                C4028x s = mo8367s();
                if (s != null) {
                    ((C117309af) s).f325645a.edit().putInt(this.f12748t, i).apply();
                } else {
                    SharedPreferences.Editor b = this.f12739k.mo8429b();
                    b.putInt(this.f12748t, i);
                    super.mo8349P(b);
                }
            }
            if (z) {
                mo8317e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo8386l(SeekBar seekBar) {
        int progress = this.f12769b + seekBar.getProgress();
        if (progress == this.f12768a) {
            return;
        }
        if (mo8351R(Integer.valueOf(progress))) {
            mo8385j(progress, false);
            return;
        }
        seekBar.setProgress(this.f12768a - this.f12769b);
        mo8387o(this.f12768a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo8387o(int i) {
        TextView textView = this.f12776i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* compiled from: PG */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4003bb();

        /* renamed from: a */
        int f12777a;

        /* renamed from: b */
        int f12778b;

        /* renamed from: c */
        int f12779c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12777a = parcel.readInt();
            this.f12778b = parcel.readInt();
            this.f12779c = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12777a);
            parcel.writeInt(this.f12778b);
            parcel.writeInt(this.f12779c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
