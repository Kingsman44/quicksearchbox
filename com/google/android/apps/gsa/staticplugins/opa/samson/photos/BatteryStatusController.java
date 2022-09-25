package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109013a;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: PG */
public final class BatteryStatusController {

    /* renamed from: d */
    private static final C59071e f307454d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.photos.BatteryStatusController");

    /* renamed from: a */
    public final Context f307455a;

    /* renamed from: b */
    public final IntentFilter f307456b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: c */
    C110348bg f307457c;

    /* renamed from: e */
    private final C109024k f307458e;

    /* renamed from: f */
    private BroadcastReceiver f307459f;

    /* compiled from: PG */
    class Observer implements C2376g {
        public Observer() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final void mo3522gX(C2391v vVar) {
            BatteryStatusController batteryStatusController = BatteryStatusController.this;
            batteryStatusController.f307455a.unregisterReceiver(batteryStatusController.mo98562a());
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            BatteryStatusController batteryStatusController = BatteryStatusController.this;
            Intent registerReceiver = batteryStatusController.f307455a.registerReceiver(batteryStatusController.mo98562a(), BatteryStatusController.this.f307456b);
            if (registerReceiver != null) {
                BatteryStatusController.this.mo98564c(registerReceiver);
            }
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    public BatteryStatusController(C109024k kVar, Context context) {
        this.f307458e = kVar;
        this.f307455a = context;
    }

    /* renamed from: d */
    private static final boolean m183675d(int i) {
        return i == 4;
    }

    /* renamed from: a */
    public final BroadcastReceiver mo98562a() {
        if (this.f307459f == null) {
            this.f307459f = new C110347bf(this);
        }
        return this.f307459f;
    }

    /* renamed from: b */
    public final void mo98563b(C2391v vVar) {
        vVar.getLifecycle().mo5790b(new Observer());
    }

    /* renamed from: c */
    public final void mo98564c(Intent intent) {
        C109013a aVar;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        int intExtra3 = intent.getIntExtra("status", -1);
        int intExtra4 = intent.getIntExtra("plugged", -1);
        if (intExtra == -1 || intExtra2 == -1 || intExtra2 == 0 || intExtra3 == -1) {
            C59104x c = f307454d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BatteryStatusCtrlr");
            ((C59052c) ((C59052c) c).mo56372aa(25870)).mo56386p("bad changed intent");
            aVar = null;
        } else if (intExtra3 != 5 && intExtra3 != 2 && intExtra3 != 4) {
            aVar = new C109013a(this.f307455a.getString(R.string.empty_string));
        } else if (intExtra3 == 4) {
            aVar = new C109013a(this.f307455a.getString(R.string.charging_status_not_charging));
        } else {
            Context context = this.f307455a;
            String format = NumberFormat.getPercentInstance().format((double) (((float) intExtra) / ((float) intExtra2)));
            if (intExtra3 == 5 || format.equals("100%")) {
                str = context.getString(R.string.charging_status_charged_alt);
            } else {
                if (this.f307457c == null) {
                    this.f307457c = new C110348bg(this.f307455a);
                }
                long computeChargeTimeRemaining = this.f307457c.f307563a.computeChargeTimeRemaining();
                if (computeChargeTimeRemaining > 0) {
                    long j = (computeChargeTimeRemaining + 59999) / 60000;
                    if (j == 0 || j == 1) {
                        str2 = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.SHORT).format(new Measure(Long.valueOf(j), MeasureUnit.MINUTE));
                    } else {
                        long j2 = (j * 60000) / 1000;
                        if (j2 >= 86400) {
                            i = (int) (j2 / 86400);
                            j2 -= (long) (86400 * i);
                        } else {
                            i = 0;
                        }
                        if (j2 >= 3600) {
                            i2 = (int) (j2 / 3600);
                            j2 -= (long) (i2 * 3600);
                        } else {
                            i2 = 0;
                        }
                        if (j2 >= 60) {
                            i3 = (int) (j2 / 60);
                            j2 -= (long) (i3 * 60);
                        } else {
                            i3 = 0;
                        }
                        int i4 = (int) j2;
                        MeasureFormat instance = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.SHORT);
                        if (i < 2) {
                            if (i <= 0) {
                                if (i2 < 2) {
                                    if (i2 <= 0) {
                                        if (i3 < 2) {
                                            if (i3 <= 0) {
                                                str2 = instance.format(new Measure(Integer.valueOf(i4), MeasureUnit.SECOND));
                                            } else if (i4 == 0) {
                                                i4 = 0;
                                            } else {
                                                str2 = instance.formatMeasures(new Measure[]{new Measure(1, MeasureUnit.MINUTE), new Measure(Integer.valueOf(i4), MeasureUnit.SECOND)});
                                            }
                                        }
                                        str2 = instance.format(new Measure(Integer.valueOf(i3 + ((i4 + 30) / 60)), MeasureUnit.MINUTE));
                                    } else if (i3 == 0) {
                                        i3 = 0;
                                    } else {
                                        str2 = instance.formatMeasures(new Measure[]{new Measure(1, MeasureUnit.HOUR), new Measure(Integer.valueOf(i3), MeasureUnit.MINUTE)});
                                    }
                                }
                                str2 = instance.format(new Measure(Integer.valueOf(i2 + ((i3 + 30) / 60)), MeasureUnit.HOUR));
                            } else if (i2 == 0) {
                                i2 = 0;
                            } else {
                                str2 = instance.formatMeasures(new Measure[]{new Measure(1, MeasureUnit.DAY), new Measure(Integer.valueOf(i2), MeasureUnit.HOUR)});
                            }
                        }
                        str2 = instance.format(new Measure(Integer.valueOf(i + ((i2 + 12) / 24)), MeasureUnit.DAY));
                    }
                    if (m183675d(intExtra4)) {
                        str = context.getString(R.string.charging_status_charging_time_fast, new Object[]{str2, format});
                    } else {
                        str = context.getString(R.string.charging_status_charging_time_fast_traditional, new Object[]{str2, format});
                    }
                } else if (m183675d(intExtra4)) {
                    str = context.getString(R.string.charging_status_charging_fast, new Object[]{format});
                } else {
                    str = context.getString(R.string.charging_status_charging_fast_traditional, new Object[]{format});
                }
            }
            aVar = new C109013a(str);
        }
        if (aVar != null) {
            this.f307458e.f303168d.mo5708l(aVar);
        }
    }
}
