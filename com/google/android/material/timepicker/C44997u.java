package com.google.android.material.timepicker;

import android.text.TextUtils;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.chip.Chip;
import java.util.Locale;

/* renamed from: com.google.android.material.timepicker.u */
/* compiled from: PG */
final class C44997u implements C44984h, C44977ak, C44976aj, C44983g, C44998v {

    /* renamed from: f */
    private static final String[] f117587f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: g */
    private static final String[] f117588g = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: h */
    private static final String[] f117589h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: a */
    public final TimePickerView f117590a;

    /* renamed from: b */
    public final TimeModel f117591b;

    /* renamed from: c */
    public float f117592c;

    /* renamed from: d */
    public float f117593d;

    /* renamed from: e */
    public boolean f117594e = false;

    public C44997u(TimePickerView timePickerView, TimeModel timeModel) {
        this.f117590a = timePickerView;
        this.f117591b = timeModel;
        if (timeModel.f117513c == 0) {
            timePickerView.f117522e.setVisibility(0);
        }
        timePickerView.f117520c.mo48622a(this);
        timePickerView.f117524g = this;
        timePickerView.f117523f = this;
        timePickerView.f117520c.f117494e = this;
        m79976i(f117587f, "%d");
        m79976i(f117589h, "%02d");
        mo48641c();
    }

    /* renamed from: h */
    private final int m79975h() {
        return (this.f117591b.mo48629b() * 30) % 360;
    }

    /* renamed from: i */
    private final void m79976i(String[] strArr, String str) {
        for (int i = 0; i < 12; i++) {
            strArr[i] = TimeModel.m79949c(this.f117590a.getResources(), strArr[i], str);
        }
    }

    /* renamed from: a */
    public final void mo48619a(float f, boolean z) {
        if (!this.f117594e) {
            TimeModel timeModel = this.f117591b;
            int i = timeModel.f117514d;
            int i2 = timeModel.f117515e;
            int round = Math.round(f);
            TimeModel timeModel2 = this.f117591b;
            if (timeModel2.f117516f == 12) {
                int i3 = ((round + 3) / 6) % 60;
                timeModel2.f117515e = i3;
                this.f117592c = (float) Math.floor((double) (i3 * 6));
            } else {
                int i4 = (round + 15) / 30;
                if (timeModel2.f117513c == 1) {
                    i4 %= 12;
                    if (this.f117590a.f117521d.f117475a.f117496g == 2) {
                        i4 += 12;
                    }
                }
                timeModel2.mo48630d(i4);
                this.f117593d = (float) m79975h();
            }
            if (!z) {
                mo48666g();
                mo48664d(i, i2);
            }
        }
    }

    /* renamed from: b */
    public final void mo48640b() {
        this.f117590a.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo48641c() {
        this.f117593d = (float) m79975h();
        TimeModel timeModel = this.f117591b;
        this.f117592c = (float) (timeModel.f117515e * 6);
        mo48665e(timeModel.f117516f, false);
        mo48666g();
    }

    /* renamed from: d */
    public final void mo48664d(int i, int i2) {
        TimeModel timeModel = this.f117591b;
        if (timeModel.f117515e != i2 || timeModel.f117514d != i) {
            this.f117590a.performHapticFeedback(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo48665e(int i, boolean z) {
        String[] strArr;
        int i2;
        float f;
        boolean z2 = false;
        boolean z3 = i == 12;
        TimePickerView timePickerView = this.f117590a;
        timePickerView.f117520c.f117490a = z3;
        TimeModel timeModel = this.f117591b;
        timeModel.f117516f = i;
        if (z3) {
            strArr = f117589h;
        } else {
            strArr = timeModel.f117513c == 1 ? f117588g : f117587f;
        }
        if (z3) {
            i2 = R.string.material_minute_suffix;
        } else {
            i2 = timeModel.mo48628a();
        }
        ClockFaceView clockFaceView = timePickerView.f117521d;
        clockFaceView.f117479e = strArr;
        clockFaceView.mo48620c(i2);
        TimeModel timeModel2 = this.f117591b;
        int i3 = (timeModel2.f117516f == 10 && timeModel2.f117513c == 1 && timeModel2.f117514d >= 12) ? 2 : 1;
        ClockHandView clockHandView = this.f117590a.f117521d.f117475a;
        clockHandView.f117496g = i3;
        clockHandView.invalidate();
        TimePickerView timePickerView2 = this.f117590a;
        if (z3) {
            f = this.f117592c;
        } else {
            f = this.f117593d;
        }
        timePickerView2.f117520c.mo48623b(f, z);
        TimePickerView timePickerView3 = this.f117590a;
        TimePickerView.m79956a(timePickerView3.f117518a, i == 12);
        Chip chip = timePickerView3.f117519b;
        if (i == 10) {
            z2 = true;
        }
        TimePickerView.m79956a(chip, z2);
        C2043bi.m5526T(this.f117590a.f117519b, new C44995s(this, this.f117590a.getContext()));
        TimePickerView timePickerView4 = this.f117590a;
        C2043bi.m5526T(timePickerView4.f117518a, new C44996t(this, timePickerView4.getContext()));
    }

    /* renamed from: f */
    public final void mo48642f() {
        this.f117590a.setVisibility(0);
    }

    /* renamed from: g */
    public final void mo48666g() {
        TimePickerView timePickerView = this.f117590a;
        TimeModel timeModel = this.f117591b;
        int i = timeModel.f117517g;
        int b = timeModel.mo48629b();
        int i2 = this.f117591b.f117515e;
        timePickerView.f117522e.mo47572a(1 != i ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(i2)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(b)});
        if (!TextUtils.equals(timePickerView.f117518a.getText(), format)) {
            timePickerView.f117518a.setText(format);
        }
        if (!TextUtils.equals(timePickerView.f117519b.getText(), format2)) {
            timePickerView.f117519b.setText(format2);
        }
    }
}
