package com.android.recurrencepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.TimeFormatException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.android.datetimepicker.date.C5084g;
import com.android.p256b.C5033s;
import com.android.p256b.C5034t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

/* compiled from: PG */
public final class RecurrencePickerBaseDialog implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener, View.OnClickListener, RadioGroup.OnCheckedChangeListener, C5084g {

    /* renamed from: m */
    private static final String f16558m = C5034t.m13835a("RecurrencePickerBaseDialog");

    /* renamed from: n */
    private static final int[] f16559n = {4, 5, 6, 7};

    /* renamed from: A */
    private TextView f16560A;

    /* renamed from: B */
    private TextView f16561B;

    /* renamed from: C */
    private final ArrayList f16562C = new ArrayList(3);

    /* renamed from: D */
    private C5481e f16563D;

    /* renamed from: E */
    private String f16564E;

    /* renamed from: F */
    private LinearLayout f16565F;

    /* renamed from: G */
    private LinearLayout f16566G;

    /* renamed from: H */
    private final ToggleButton[] f16567H = new ToggleButton[7];

    /* renamed from: I */
    private String[][] f16568I;

    /* renamed from: J */
    private LinearLayout f16569J;

    /* renamed from: K */
    private RadioGroup f16570K;

    /* renamed from: L */
    private RadioButton f16571L;

    /* renamed from: M */
    private RadioButton f16572M;

    /* renamed from: N */
    private RadioButton f16573N;

    /* renamed from: O */
    private String f16574O;

    /* renamed from: P */
    private Button f16575P;

    /* renamed from: Q */
    private int f16576Q = -1;

    /* renamed from: a */
    public Resources f16577a;

    /* renamed from: b */
    public RecurrenceModel f16578b = new RecurrenceModel();

    /* renamed from: c */
    public EditText f16579c;

    /* renamed from: d */
    public int f16580d = -1;

    /* renamed from: e */
    public Spinner f16581e;

    /* renamed from: f */
    public EditText f16582f;

    /* renamed from: g */
    public TextView f16583g;

    /* renamed from: h */
    public boolean f16584h;

    /* renamed from: i */
    public String f16585i;

    /* renamed from: j */
    public String f16586j;

    /* renamed from: k */
    public C5484h f16587k;

    /* renamed from: l */
    public boolean f16588l = false;

    /* renamed from: o */
    private final C5480d f16589o;

    /* renamed from: p */
    private Context f16590p;

    /* renamed from: q */
    private final C5033s f16591q = new C5033s();

    /* renamed from: r */
    private final Time f16592r = new Time();

    /* renamed from: s */
    private int f16593s;

    /* renamed from: t */
    private final int[] f16594t = {1, 2, 3, 4, 5, 6, 7};

    /* renamed from: u */
    private View f16595u;

    /* renamed from: v */
    private Spinner f16596v;

    /* renamed from: w */
    private TextView f16597w;

    /* renamed from: x */
    private LinearLayout f16598x;

    /* renamed from: y */
    private Switch f16599y;

    /* renamed from: z */
    private TextView f16600z;

    /* compiled from: PG */
    class RecurrenceModel implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C5482f();

        /* renamed from: a */
        int f16601a;

        /* renamed from: b */
        int f16602b = 1;

        /* renamed from: c */
        int f16603c = 1;

        /* renamed from: d */
        int f16604d;

        /* renamed from: e */
        Time f16605e;

        /* renamed from: f */
        int f16606f = 5;

        /* renamed from: g */
        boolean[] f16607g = new boolean[7];

        /* renamed from: h */
        int f16608h;

        /* renamed from: i */
        int f16609i;

        /* renamed from: j */
        int f16610j;

        /* renamed from: k */
        int f16611k;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            int i = this.f16602b;
            int i2 = this.f16603c;
            int i3 = this.f16604d;
            String valueOf = String.valueOf(this.f16605e);
            int i4 = this.f16606f;
            String arrays = Arrays.toString(this.f16607g);
            int i5 = this.f16608h;
            int i6 = this.f16609i;
            int i7 = this.f16610j;
            int i8 = this.f16611k;
            return "Model [freq=" + i + ", interval=" + i2 + ", end=" + i3 + ", endDate=" + valueOf + ", endCount=" + i4 + ", weeklyByDayOfWeek=" + arrays + ", monthlyRepeat=" + i5 + ", monthlyByMonthDay=" + i6 + ", monthlyByDayOfWeek=" + i7 + ", monthlyByNthDayOfWeek=" + i8 + "]";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f16602b);
            parcel.writeInt(this.f16603c);
            parcel.writeInt(this.f16604d);
            parcel.writeInt(this.f16605e.year);
            parcel.writeInt(this.f16605e.month);
            parcel.writeInt(this.f16605e.monthDay);
            parcel.writeInt(this.f16606f);
            parcel.writeBooleanArray(this.f16607g);
            parcel.writeInt(this.f16608h);
            parcel.writeInt(this.f16609i);
            parcel.writeInt(this.f16610j);
            parcel.writeInt(this.f16611k);
            parcel.writeInt(this.f16601a);
        }
    }

    public RecurrencePickerBaseDialog(C5480d dVar) {
        this.f16589o = dVar;
    }

    /* renamed from: j */
    private final void m14181j() {
        this.f16578b.f16611k = (this.f16592r.monthDay + 6) / 7;
        if (this.f16592r.monthDay + 7 > this.f16593s) {
            this.f16578b.f16611k = -1;
        }
        this.f16578b.f16610j = this.f16592r.weekDay;
    }

    /* renamed from: k */
    private static boolean m14182k(int i) {
        return (i > 0 && i <= 5) || i == -1;
    }

    /* renamed from: a */
    public final void mo10090a(int i, int i2, int i3) {
        RecurrenceModel recurrenceModel = this.f16578b;
        if (recurrenceModel.f16605e == null) {
            recurrenceModel.f16605e = new Time(this.f16592r.timezone);
            Time time = this.f16578b.f16605e;
            time.second = 0;
            time.minute = 0;
            time.hour = 0;
        }
        this.f16578b.f16605e.year = i;
        this.f16578b.f16605e.month = i2;
        this.f16578b.f16605e.monthDay = i3;
        this.f16578b.f16605e.normalize(false);
        mo11794e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final View mo11791b(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
        boolean z;
        int i;
        int i2 = this.f16576Q;
        if (i2 == -1) {
            i2 = Calendar.getInstance().getFirstDayOfWeek();
            this.f16576Q = i2;
        }
        this.f16591q.f15893h = C5033s.m13826a(i2);
        int i3 = 1;
        this.f16589o.getDialog().getWindow().requestFeature(1);
        if (bundle != null) {
            this.f16592r.set(bundle.getLong("bundle_event_start_time"));
            String string = bundle.getString("bundle_event_time_zone");
            if (!TextUtils.isEmpty(string)) {
                this.f16592r.timezone = string;
            }
            this.f16592r.normalize(false);
            this.f16588l = bundle.getBoolean("bundle_event_is_weekly_only");
            Calendar instance = Calendar.getInstance();
            instance.set(1, this.f16592r.year);
            instance.set(2, this.f16592r.month);
            this.f16593s = instance.getActualMaximum(5);
        } else {
            this.f16592r.setToNow();
        }
        if (bundle2 != null) {
            RecurrenceModel recurrenceModel = (RecurrenceModel) bundle2.get("bundle_model");
            if (recurrenceModel != null) {
                this.f16578b = recurrenceModel;
            }
            z = bundle2.getBoolean("bundle_end_count_has_focus");
            this.f16588l = bundle2.getBoolean("weekly_only_view");
        } else {
            if (bundle != null) {
                this.f16578b.f16607g[this.f16592r.weekDay] = true;
                String string2 = bundle.getString("bundle_event_rrule");
                if (!TextUtils.isEmpty(string2)) {
                    this.f16578b.f16601a = 1;
                    this.f16591q.mo9970e(string2);
                    m14180i(this.f16591q, this.f16578b);
                    C5033s sVar = this.f16591q;
                    int i4 = sVar.f15902q;
                    if (i4 == 0) {
                        this.f16578b.f16607g[this.f16592r.weekDay] = true;
                    } else if (i4 == 1 && sVar.f15889d == 6) {
                        m14181j();
                    }
                }
            }
            z = false;
        }
        this.f16590p = context;
        this.f16577a = context.getResources();
        View inflate = layoutInflater.inflate(R.layout.recurrencepicker, viewGroup, true);
        this.f16595u = inflate;
        this.f16598x = (LinearLayout) inflate.findViewById(R.id.mainLayout);
        this.f16597w = (TextView) this.f16595u.findViewById(R.id.repeatText);
        this.f16599y = (Switch) this.f16595u.findViewById(R.id.repeat_switch);
        this.f16596v = (Spinner) this.f16595u.findViewById(R.id.freqSpinner);
        this.f16579c = (EditText) this.f16595u.findViewById(R.id.interval);
        this.f16600z = (TextView) this.f16595u.findViewById(R.id.intervalPreText);
        this.f16560A = (TextView) this.f16595u.findViewById(R.id.intervalPostText);
        this.f16581e = (Spinner) this.f16595u.findViewById(R.id.endSpinner);
        this.f16582f = (EditText) this.f16595u.findViewById(R.id.endCount);
        this.f16583g = (TextView) this.f16595u.findViewById(R.id.postEndCount);
        this.f16561B = (TextView) this.f16595u.findViewById(R.id.endDate);
        this.f16565F = (LinearLayout) this.f16595u.findViewById(R.id.weekGroup);
        this.f16566G = (LinearLayout) this.f16595u.findViewById(R.id.weekGroup2);
        this.f16569J = (LinearLayout) this.f16595u.findViewById(R.id.monthGroup);
        this.f16570K = (RadioGroup) this.f16595u.findViewById(R.id.monthGroup);
        this.f16571L = (RadioButton) this.f16595u.findViewById(R.id.repeatMonthlyByNthDayOfTheWeek);
        this.f16572M = (RadioButton) this.f16595u.findViewById(R.id.repeatMonthlyByNthDayOfMonth);
        this.f16573N = (RadioButton) this.f16595u.findViewById(R.id.repeatMonthlyByLastDayOfMonth);
        this.f16575P = (Button) this.f16595u.findViewById(R.id.done);
        if (this.f16588l) {
            this.f16597w.setVisibility(0);
            this.f16598x.getLayoutParams().height = -2;
            this.f16596v.setVisibility(8);
            this.f16579c.setVisibility(8);
            this.f16600z.setVisibility(8);
            this.f16560A.setVisibility(8);
            this.f16581e.setVisibility(8);
            this.f16582f.setVisibility(8);
            this.f16583g.setVisibility(8);
            this.f16561B.setVisibility(8);
            this.f16569J.setVisibility(8);
            this.f16570K.setVisibility(8);
            this.f16571L.setVisibility(8);
            this.f16572M.setVisibility(8);
            this.f16573N.setVisibility(8);
        }
        this.f16599y.setChecked(this.f16578b.f16601a == 1);
        this.f16599y.setOnCheckedChangeListener(new C5477a(this));
        this.f16596v.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this.f16590p, R.array.recurrence_freq, R.layout.recurrencepicker_freq_title);
        createFromResource.setDropDownViewResource(R.layout.recurrencepicker_freq_item);
        this.f16596v.setAdapter(createFromResource);
        this.f16579c.addTextChangedListener(new C5478b(this));
        this.f16564E = this.f16577a.getString(R.string.recurrence_end_continously);
        this.f16585i = this.f16577a.getString(R.string.recurrence_end_date_label);
        this.f16586j = this.f16577a.getString(R.string.recurrence_end_count_label);
        this.f16562C.add(this.f16564E);
        this.f16562C.add(this.f16585i);
        this.f16562C.add(this.f16586j);
        this.f16581e.setOnItemSelectedListener(this);
        C5481e eVar = new C5481e(this, this.f16590p, this.f16562C);
        this.f16563D = eVar;
        eVar.setDropDownViewResource(R.layout.recurrencepicker_freq_item);
        this.f16581e.setAdapter(this.f16563D);
        this.f16582f.setVisibility(this.f16578b.f16604d == 2 ? 0 : 8);
        this.f16582f.addTextChangedListener(new C5479c(this));
        this.f16561B.setOnClickListener(this);
        RecurrenceModel recurrenceModel2 = this.f16578b;
        if (recurrenceModel2.f16605e == null) {
            recurrenceModel2.f16605e = new Time(this.f16592r);
            RecurrenceModel recurrenceModel3 = this.f16578b;
            int i5 = recurrenceModel3.f16602b;
            if (i5 == 0 || i5 == 1) {
                recurrenceModel3.f16605e.month++;
            } else if (i5 == 2) {
                recurrenceModel3.f16605e.month += 3;
            } else if (i5 == 3) {
                recurrenceModel3.f16605e.year += 3;
            }
            this.f16578b.f16605e.normalize(false);
        }
        String[][] strArr = new String[7][];
        this.f16568I = strArr;
        strArr[0] = this.f16577a.getStringArray(R.array.repeat_by_nth_sun);
        this.f16568I[1] = this.f16577a.getStringArray(R.array.repeat_by_nth_mon);
        this.f16568I[2] = this.f16577a.getStringArray(R.array.repeat_by_nth_tues);
        this.f16568I[3] = this.f16577a.getStringArray(R.array.repeat_by_nth_wed);
        int i6 = 4;
        this.f16568I[4] = this.f16577a.getStringArray(R.array.repeat_by_nth_thurs);
        this.f16568I[5] = this.f16577a.getStringArray(R.array.repeat_by_nth_fri);
        this.f16568I[6] = this.f16577a.getStringArray(R.array.repeat_by_nth_sat);
        switch (this.f16576Q) {
            case 1:
                i3 = 0;
                break;
            case 2:
                break;
            case 3:
                i3 = 2;
                break;
            case 4:
                i3 = 3;
                break;
            case 5:
                i3 = 4;
                break;
            case 6:
                i3 = 5;
                break;
            case 7:
                i3 = 6;
                break;
            default:
                throw new IllegalArgumentException("Argument must be between Calendar.SUNDAY and Calendar.SATURDAY");
        }
        String[] shortWeekdays = new DateFormatSymbols().getShortWeekdays();
        if (this.f16577a.getConfiguration().screenWidthDp > 450) {
            this.f16566G.setVisibility(8);
            this.f16566G.getChildAt(3).setVisibility(8);
            i = 0;
            i6 = 7;
        } else {
            this.f16566G.setVisibility(0);
            this.f16566G.getChildAt(3).setVisibility(4);
            i = 3;
        }
        for (int i7 = 0; i7 < 7; i7++) {
            if (i7 >= i6) {
                this.f16565F.getChildAt(i7).setVisibility(8);
            } else {
                this.f16567H[i3] = (ToggleButton) this.f16565F.getChildAt(i7);
                this.f16567H[i3].setTextOff(shortWeekdays[this.f16594t[i3]]);
                this.f16567H[i3].setTextOn(shortWeekdays[this.f16594t[i3]]);
                this.f16567H[i3].setOnCheckedChangeListener(this);
                i3++;
                if (i3 >= 7) {
                    i3 = 0;
                }
            }
        }
        for (int i8 = 0; i8 < 3; i8++) {
            if (i8 >= i) {
                this.f16566G.getChildAt(i8).setVisibility(8);
            } else {
                this.f16567H[i3] = (ToggleButton) this.f16566G.getChildAt(i8);
                this.f16567H[i3].setTextOff(shortWeekdays[this.f16594t[i3]]);
                this.f16567H[i3].setTextOn(shortWeekdays[this.f16594t[i3]]);
                this.f16567H[i3].setOnCheckedChangeListener(this);
                i3++;
                if (i3 >= 7) {
                    i3 = 0;
                }
            }
        }
        this.f16570K.setOnCheckedChangeListener(this);
        if (this.f16592r.monthDay != this.f16593s) {
            this.f16573N.setVisibility(8);
        }
        this.f16575P.setOnClickListener(this);
        mo11793d();
        mo11794e();
        if (z) {
            this.f16582f.requestFocus();
        }
        return this.f16595u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11792c(Bundle bundle) {
        bundle.putParcelable("bundle_model", this.f16578b);
        if (this.f16582f.hasFocus()) {
            bundle.putBoolean("bundle_end_count_has_focus", true);
        }
        if (this.f16588l) {
            bundle.putBoolean("weekly_only_view", true);
        }
    }

    /* renamed from: d */
    public final void mo11793d() {
        if (this.f16578b.f16601a == 0) {
            this.f16596v.setEnabled(false);
            this.f16581e.setEnabled(false);
            this.f16600z.setEnabled(false);
            this.f16579c.setEnabled(false);
            this.f16560A.setEnabled(false);
            this.f16570K.setEnabled(false);
            this.f16582f.setEnabled(false);
            this.f16583g.setEnabled(false);
            this.f16561B.setEnabled(false);
            this.f16571L.setEnabled(false);
            this.f16572M.setEnabled(false);
            this.f16573N.setEnabled(false);
            ToggleButton[] toggleButtonArr = this.f16567H;
            for (int i = 0; i < 7; i++) {
                toggleButtonArr[i].setEnabled(false);
            }
        } else {
            this.f16595u.findViewById(R.id.options).setEnabled(true);
            this.f16596v.setEnabled(true);
            this.f16581e.setEnabled(true);
            this.f16600z.setEnabled(true);
            this.f16579c.setEnabled(true);
            this.f16560A.setEnabled(true);
            this.f16570K.setEnabled(true);
            this.f16582f.setEnabled(true);
            this.f16583g.setEnabled(true);
            this.f16561B.setEnabled(true);
            this.f16571L.setEnabled(true);
            this.f16572M.setEnabled(true);
            this.f16573N.setEnabled(true);
            ToggleButton[] toggleButtonArr2 = this.f16567H;
            for (int i2 = 0; i2 < 7; i2++) {
                toggleButtonArr2[i2].setEnabled(true);
            }
        }
        mo11795f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo11794e() {
        String format = String.format("%d", new Object[]{Integer.valueOf(this.f16578b.f16603c)});
        if (!format.equals(this.f16579c.getText().toString())) {
            this.f16579c.setText(format);
        }
        this.f16596v.setSelection(this.f16578b.f16602b);
        int i = 8;
        this.f16565F.setVisibility(this.f16578b.f16602b == 1 ? 0 : 8);
        this.f16566G.setVisibility(this.f16578b.f16602b == 1 ? 0 : 8);
        LinearLayout linearLayout = this.f16569J;
        if (this.f16578b.f16602b == 2) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        RecurrenceModel recurrenceModel = this.f16578b;
        int i2 = recurrenceModel.f16602b;
        if (i2 == 0) {
            this.f16580d = R.plurals.recurrence_interval_daily;
        } else if (i2 == 1) {
            this.f16580d = R.plurals.recurrence_interval_weekly;
            for (int i3 = 0; i3 < 7; i3++) {
                this.f16567H[i3].setChecked(this.f16578b.f16607g[i3]);
            }
        } else if (i2 == 2) {
            this.f16580d = R.plurals.recurrence_interval_monthly;
            int i4 = recurrenceModel.f16608h;
            if (i4 == 0) {
                if (recurrenceModel.f16609i == -1) {
                    this.f16570K.check(R.id.repeatMonthlyByLastDayOfMonth);
                } else {
                    this.f16570K.check(R.id.repeatMonthlyByNthDayOfMonth);
                }
            } else if (i4 == 1) {
                this.f16570K.check(R.id.repeatMonthlyByNthDayOfTheWeek);
            }
            if (this.f16574O == null) {
                if (this.f16578b.f16611k == 0) {
                    m14181j();
                }
                String[][] strArr = this.f16568I;
                RecurrenceModel recurrenceModel2 = this.f16578b;
                String[] strArr2 = strArr[recurrenceModel2.f16610j];
                int i5 = recurrenceModel2.f16611k;
                if (i5 < 0) {
                    i5 = 5;
                }
                String str = strArr2[i5 - 1];
                this.f16574O = str;
                this.f16571L.setText(str);
            }
        } else if (i2 == 3) {
            this.f16580d = R.plurals.recurrence_interval_yearly;
        }
        mo11797h();
        mo11795f();
        this.f16581e.setSelection(this.f16578b.f16604d);
        RecurrenceModel recurrenceModel3 = this.f16578b;
        int i6 = recurrenceModel3.f16604d;
        if (i6 == 1) {
            this.f16561B.setText(DateUtils.formatDateTime(this.f16590p, recurrenceModel3.f16605e.toMillis(false), C89885b.S3REQUEST_VALUE));
        } else if (i6 == 2) {
            String format2 = String.format("%d", new Object[]{Integer.valueOf(recurrenceModel3.f16606f)});
            if (!format2.equals(this.f16582f.getText().toString())) {
                this.f16582f.setText(format2);
            }
        }
    }

    /* renamed from: f */
    public final void mo11795f() {
        if (this.f16578b.f16601a == 0) {
            this.f16575P.setEnabled(true);
        } else if (this.f16579c.getText().toString().length() == 0) {
            this.f16575P.setEnabled(false);
        } else if (this.f16582f.getVisibility() == 0 && this.f16582f.getText().toString().length() == 0) {
            this.f16575P.setEnabled(false);
        } else if (this.f16578b.f16602b == 1) {
            ToggleButton[] toggleButtonArr = this.f16567H;
            for (int i = 0; i < 7; i++) {
                if (toggleButtonArr[i].isChecked()) {
                    this.f16575P.setEnabled(true);
                    return;
                }
            }
            this.f16575P.setEnabled(false);
        } else {
            this.f16575P.setEnabled(true);
        }
    }

    /* renamed from: g */
    public final void mo11796g() {
        String quantityString = this.f16577a.getQuantityString(R.plurals.recurrence_end_count, this.f16578b.f16606f);
        int indexOf = quantityString.indexOf("%d");
        if (indexOf == -1) {
            return;
        }
        if (indexOf == 0) {
            C5034t.m13836b(f16558m, new Object[0]);
        } else {
            this.f16583g.setText(quantityString.substring(indexOf + 2, quantityString.length()).trim());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = r5.f16577a.getQuantityString(r0, r5.f16578b.f16603c);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11797h() {
        /*
            r5 = this;
            int r0 = r5.f16580d
            r1 = -1
            if (r0 != r1) goto L_0x0006
            return
        L_0x0006:
            android.content.res.Resources r2 = r5.f16577a
            com.android.recurrencepicker.RecurrencePickerBaseDialog$RecurrenceModel r3 = r5.f16578b
            int r3 = r3.f16603c
            java.lang.String r0 = r2.getQuantityString(r0, r3)
            java.lang.String r2 = "%d"
            int r2 = r0.indexOf(r2)
            if (r2 == r1) goto L_0x0039
            android.widget.TextView r1 = r5.f16560A
            int r3 = r2 + 2
            int r4 = r0.length()
            java.lang.String r3 = r0.substring(r3, r4)
            java.lang.String r3 = r3.trim()
            r1.setText(r3)
            android.widget.TextView r1 = r5.f16600z
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            java.lang.String r0 = r0.trim()
            r1.setText(r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.recurrencepicker.RecurrencePickerBaseDialog.mo11797h():void");
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = -1;
        for (int i2 = 0; i2 < 7; i2++) {
            if (i == -1) {
                if (compoundButton == this.f16567H[i2]) {
                    this.f16578b.f16607g[i2] = z;
                    i = i2;
                } else {
                    i = -1;
                }
            }
        }
        mo11794e();
    }

    public final void onClick(View view) {
        int i;
        int i2;
        if (this.f16587k == null) {
            C5480d dVar = this.f16589o;
            if (dVar != null) {
                dVar.dismiss();
            }
        } else if (this.f16561B == view) {
            Calendar instance = Calendar.getInstance();
            instance.set(this.f16592r.year, this.f16592r.month, this.f16592r.monthDay);
            this.f16589o.mo11809a(this, this.f16576Q, instance, this.f16578b.f16605e);
        } else if (this.f16575P == view) {
            RecurrenceModel recurrenceModel = this.f16578b;
            int i3 = recurrenceModel.f16601a;
            String str = null;
            if (i3 != 0) {
                C5033s sVar = this.f16591q;
                if (i3 != 0) {
                    sVar.f15889d = f16559n[recurrenceModel.f16602b];
                    int i4 = recurrenceModel.f16603c;
                    int i5 = 0;
                    if (i4 <= 1) {
                        sVar.f15892g = 0;
                    } else {
                        sVar.f15892g = i4;
                    }
                    int i6 = recurrenceModel.f16604d;
                    if (i6 == 1) {
                        Time time = recurrenceModel.f16605e;
                        if (time != null) {
                            time.switchTimezone("UTC");
                            if (recurrenceModel.f16605e.allDay) {
                                Time time2 = recurrenceModel.f16605e;
                                time2.second = 0;
                                time2.minute = 0;
                                time2.hour = 0;
                            }
                            recurrenceModel.f16605e.normalize(false);
                            sVar.f15890e = recurrenceModel.f16605e.format2445();
                            sVar.f15891f = 0;
                        } else {
                            throw new IllegalStateException("end = END_BY_DATE but endDate is null");
                        }
                    } else if (i6 != 2) {
                        sVar.f15891f = 0;
                        sVar.f15890e = null;
                    } else {
                        int i7 = recurrenceModel.f16606f;
                        sVar.f15891f = i7;
                        sVar.f15890e = null;
                        if (i7 <= 0) {
                            throw new IllegalStateException("count is " + i7);
                        }
                    }
                    sVar.f15902q = 0;
                    sVar.f15904s = 0;
                    int i8 = recurrenceModel.f16602b;
                    if (i8 == 1) {
                        int i9 = 0;
                        for (int i10 = 0; i10 < 7; i10++) {
                            if (recurrenceModel.f16607g[i10]) {
                                i9++;
                            }
                        }
                        if (sVar.f15902q < i9 || sVar.f15900o == null || sVar.f15901p == null) {
                            sVar.f15900o = new int[i9];
                            sVar.f15901p = new int[i9];
                        }
                        sVar.f15902q = i9;
                        for (int i11 = 6; i11 >= 0; i11--) {
                            if (recurrenceModel.f16607g[i11]) {
                                i9--;
                                sVar.f15901p[i9] = 0;
                                sVar.f15900o[i9] = C5033s.m13829d(i11);
                            }
                        }
                    } else if (i8 == 2) {
                        int i12 = recurrenceModel.f16608h;
                        if (i12 == 0) {
                            int i13 = recurrenceModel.f16609i;
                            if (i13 <= 0) {
                                if (i13 == -1) {
                                    i13 = -1;
                                }
                            }
                            sVar.f15903r = new int[1];
                            sVar.f15903r[0] = i13;
                            sVar.f15904s = 1;
                        } else if (i12 == 1) {
                            int i14 = recurrenceModel.f16611k;
                            if (m14182k(i14)) {
                                sVar.f15900o = new int[1];
                                sVar.f15901p = new int[1];
                                sVar.f15902q = 1;
                                sVar.f15900o[0] = C5033s.m13829d(recurrenceModel.f16610j);
                                sVar.f15901p[0] = recurrenceModel.f16611k;
                            } else {
                                throw new IllegalStateException("month repeat by nth week but n is " + i14);
                            }
                        }
                    }
                    int i15 = sVar.f15889d;
                    if ((i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) && (sVar.f15891f <= 0 || TextUtils.isEmpty(sVar.f15890e))) {
                        int i16 = 0;
                        while (true) {
                            i = sVar.f15902q;
                            if (i5 >= i) {
                                break;
                            }
                            if (m14182k(sVar.f15901p[i5])) {
                                i16++;
                            }
                            i5++;
                        }
                        if (i16 <= 1 && ((i16 <= 0 || sVar.f15889d == 6) && (i2 = sVar.f15904s) <= 1 && (sVar.f15889d != 6 || (i <= 1 && (i <= 0 || i2 <= 0))))) {
                            str = this.f16591q.toString();
                        }
                    }
                    throw new IllegalStateException("UI generated recurrence that it can't handle. ER:" + sVar.toString() + " Model: " + recurrenceModel.toString());
                }
                throw new IllegalStateException("There's no recurrence");
            }
            this.f16587k.mo11819a(str);
            this.f16589o.dismiss();
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int i2;
        if (adapterView == this.f16596v) {
            RecurrenceModel recurrenceModel = this.f16578b;
            i2 = recurrenceModel.f16602b;
            recurrenceModel.f16602b = i;
        } else if (adapterView == this.f16581e) {
            RecurrenceModel recurrenceModel2 = this.f16578b;
            i2 = recurrenceModel2.f16604d;
            int i3 = 0;
            if (i == 0) {
                recurrenceModel2.f16604d = 0;
            } else if (i == 1) {
                recurrenceModel2.f16604d = 1;
            } else if (i == 2) {
                recurrenceModel2.f16604d = 2;
                int i4 = recurrenceModel2.f16606f;
                if (i4 <= 1) {
                    recurrenceModel2.f16606f = 1;
                } else if (i4 > 730) {
                    recurrenceModel2.f16606f = 730;
                }
                mo11796g();
            }
            this.f16582f.setVisibility(this.f16578b.f16604d == 2 ? 0 : 8);
            this.f16561B.setVisibility(this.f16578b.f16604d == 1 ? 0 : 8);
            TextView textView = this.f16583g;
            if (this.f16578b.f16604d != 2 || this.f16584h) {
                i3 = 8;
            }
            textView.setVisibility(i3);
        } else {
            i2 = -1;
        }
        if (i2 != -1 && i2 != i) {
            mo11794e();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* renamed from: i */
    private static void m14180i(C5033s sVar, RecurrenceModel recurrenceModel) {
        int i;
        int i2 = sVar.f15889d;
        if (i2 == 4) {
            recurrenceModel.f16602b = 0;
        } else if (i2 == 5) {
            recurrenceModel.f16602b = 1;
        } else if (i2 == 6) {
            recurrenceModel.f16602b = 2;
        } else if (i2 == 7) {
            recurrenceModel.f16602b = 3;
        } else {
            throw new IllegalStateException("freq=" + i2);
        }
        int i3 = sVar.f15892g;
        if (i3 > 0) {
            recurrenceModel.f16603c = i3;
        }
        int i4 = sVar.f15891f;
        recurrenceModel.f16606f = i4;
        if (i4 > 0) {
            recurrenceModel.f16604d = 2;
        }
        if (!TextUtils.isEmpty(sVar.f15890e)) {
            if (recurrenceModel.f16605e == null) {
                recurrenceModel.f16605e = new Time();
            }
            try {
                recurrenceModel.f16605e.parse(sVar.f15890e);
            } catch (TimeFormatException unused) {
                recurrenceModel.f16605e = null;
            }
            if (recurrenceModel.f16604d != 2 || recurrenceModel.f16605e == null) {
                recurrenceModel.f16604d = 1;
            } else {
                int i5 = sVar.f15889d;
                throw new IllegalStateException("freq=" + i5);
            }
        }
        Arrays.fill(recurrenceModel.f16607g, false);
        if (sVar.f15902q > 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i = sVar.f15902q;
                if (i6 >= i) {
                    break;
                }
                int c = C5033s.m13828c(sVar.f15900o[i6]);
                recurrenceModel.f16607g[c] = true;
                if (recurrenceModel.f16602b == 2) {
                    int i8 = sVar.f15901p[i6];
                    if (m14182k(i8)) {
                        recurrenceModel.f16610j = c;
                        recurrenceModel.f16611k = i8;
                        recurrenceModel.f16608h = 1;
                        i7++;
                    }
                }
                i6++;
            }
            if (recurrenceModel.f16602b == 2) {
                if (i != 1) {
                    throw new IllegalStateException("Can handle only 1 byDayOfWeek in monthly");
                } else if (i7 != 1) {
                    throw new IllegalStateException("Didn't specify which nth day of week to repeat for a monthly");
                }
            }
        }
        if (recurrenceModel.f16602b != 2) {
            return;
        }
        if (sVar.f15904s == 1) {
            if (recurrenceModel.f16608h != 1) {
                recurrenceModel.f16609i = sVar.f15903r[0];
                recurrenceModel.f16608h = 0;
                return;
            }
            throw new IllegalStateException("Can handle only by monthday or by nth day of week, not both");
        } else if (sVar.f15910y > 1) {
            throw new IllegalStateException("Can handle only one bymonthday");
        }
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == R.id.repeatMonthlyByNthDayOfMonth) {
            RecurrenceModel recurrenceModel = this.f16578b;
            recurrenceModel.f16608h = 0;
            recurrenceModel.f16609i = this.f16592r.monthDay;
        } else if (i == R.id.repeatMonthlyByLastDayOfMonth) {
            RecurrenceModel recurrenceModel2 = this.f16578b;
            recurrenceModel2.f16608h = 0;
            recurrenceModel2.f16609i = -1;
        } else if (i == R.id.repeatMonthlyByNthDayOfTheWeek) {
            this.f16578b.f16608h = 1;
        }
        mo11794e();
    }
}
