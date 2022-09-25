package com.android.datetimepicker.date;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.datetimepicker.C5068c;
import com.android.datetimepicker.C5069d;
import com.google.android.googlequicksearchbox.R;
import java.util.Calendar;

/* renamed from: com.android.datetimepicker.date.o */
/* compiled from: PG */
public final class C5092o extends C5069d implements C5086i, C5080c {

    /* renamed from: a */
    public C5090m f16246a;

    /* renamed from: b */
    private final C5081d f16247b = new C5081d(this);

    /* renamed from: a */
    public final C5097t mo10082a() {
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5081d dVar = this.f16247b;
        getActivity().getWindow().setSoftInputMode(3);
        if (bundle != null) {
            dVar.f16209b.set(1, bundle.getInt("year"));
            dVar.f16209b.set(2, bundle.getInt("month"));
            dVar.f16209b.set(5, bundle.getInt("day"));
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C5084g) {
            this.f16246a = new C5090m((C5084g) targetFragment);
        }
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3;
        C5081d dVar = this.f16247b;
        C0167am activity = getActivity();
        Log.d("DatePickerDialog", "onCreateView: ");
        dVar.f16208a.getDialog().getWindow().requestFeature(1);
        View inflate = layoutInflater.inflate(R.layout.date_picker_dialog, (ViewGroup) null);
        dVar.f16212e = (TextView) inflate.findViewById(R.id.date_picker_header);
        dVar.f16213f = (LinearLayout) inflate.findViewById(R.id.date_picker_month_and_day);
        dVar.f16213f.setOnClickListener(dVar);
        dVar.f16214g = (TextView) inflate.findViewById(R.id.date_picker_month);
        dVar.f16215h = (TextView) inflate.findViewById(R.id.date_picker_day);
        dVar.f16216i = (TextView) inflate.findViewById(R.id.date_picker_year);
        dVar.f16216i.setOnClickListener(dVar);
        if (bundle != null) {
            dVar.f16221n = bundle.getInt("week_start");
            dVar.f16222o = bundle.getInt("year_start");
            dVar.f16223p = bundle.getInt("year_end");
            i3 = bundle.getInt("current_view");
            i2 = bundle.getInt("list_position");
            i = bundle.getInt("list_position_offset");
            if (bundle.containsKey("min_date")) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(bundle.getLong("min_date"));
                dVar.f16224q = instance;
                C5095r rVar = dVar.f16217j;
                if (rVar != null) {
                    rVar.mo10102d();
                }
            }
            if (bundle.containsKey("max_date")) {
                Calendar instance2 = Calendar.getInstance();
                instance2.setTimeInMillis(bundle.getLong("max_date"));
                dVar.f16225r = instance2;
                C5095r rVar2 = dVar.f16217j;
                if (rVar2 != null) {
                    rVar2.mo10102d();
                }
            }
        } else {
            i3 = 0;
            i2 = -1;
            i = 0;
        }
        dVar.f16217j = new C5073ac(activity, dVar);
        C5098u uVar = dVar.f16217j.f16256d;
        dVar.f16218k = new C5078ah(activity, dVar);
        Resources resources = activity.getResources();
        dVar.f16227t = resources.getString(R.string.day_picker_description);
        dVar.f16228u = resources.getString(R.string.select_day);
        dVar.f16229v = resources.getString(R.string.year_picker_description);
        dVar.f16230w = resources.getString(R.string.select_year);
        dVar.f16211d = (AccessibleDateAnimator) inflate.findViewById(R.id.animator);
        dVar.f16211d.addView(dVar.f16217j);
        dVar.f16211d.addView(dVar.f16218k);
        dVar.f16211d.f16146a = dVar.f16209b.getTimeInMillis();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        dVar.f16211d.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300);
        dVar.f16211d.setOutAnimation(alphaAnimation2);
        dVar.f16219l = (Button) inflate.findViewById(R.id.done);
        dVar.f16219l.setBackgroundResource(R.drawable.done_background_color);
        dVar.f16219l.setOnClickListener(new C5079b(dVar));
        dVar.mo10084c(activity, false);
        dVar.mo10083b(activity, i3);
        if (i2 != -1) {
            if (i3 == 0) {
                dVar.f16217j.mo10101c(i2);
            } else if (i3 == 1) {
                dVar.f16218k.mo10076c(i2, i);
            }
        }
        dVar.f16226s = new C5068c(activity);
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        C5068c cVar = this.f16247b.f16226s;
        cVar.f16143c = null;
        cVar.f16141a.getContentResolver().unregisterContentObserver(cVar.f16142b);
    }

    public final void onResume() {
        super.onResume();
        C5068c cVar = this.f16247b.f16226s;
        cVar.f16143c = (Vibrator) cVar.f16141a.getSystemService("vibrator");
        cVar.f16144d = C5068c.m13932b(cVar.f16141a);
        cVar.f16141a.getContentResolver().registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, cVar.f16142b);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        C5081d dVar = this.f16247b;
        bundle.putInt("year", dVar.f16209b.get(1));
        bundle.putInt("month", dVar.f16209b.get(2));
        bundle.putInt("day", dVar.f16209b.get(5));
        bundle.putInt("week_start", dVar.f16221n);
        bundle.putInt("year_start", dVar.f16222o);
        bundle.putInt("year_end", dVar.f16223p);
        bundle.putInt("current_view", dVar.f16220m);
        int i2 = dVar.f16220m;
        int i3 = 0;
        if (i2 == 0) {
            C5095r rVar = dVar.f16217j;
            int firstVisiblePosition = rVar.getFirstVisiblePosition();
            int height = rVar.getHeight();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i4 < height) {
                View childAt = rVar.getChildAt(i5);
                if (childAt == null) {
                    break;
                }
                int bottom = childAt.getBottom();
                int min = Math.min(bottom, height) - Math.max(0, childAt.getTop());
                if (min > i6) {
                    i7 = i5;
                }
                if (min > i6) {
                    i6 = min;
                }
                i5++;
                i4 = bottom;
            }
            i = firstVisiblePosition + i7;
        } else if (i2 == 1) {
            i = dVar.f16218k.getFirstVisiblePosition();
            View childAt2 = dVar.f16218k.getChildAt(0);
            if (childAt2 != null) {
                i3 = childAt2.getTop();
            }
            bundle.putInt("list_position_offset", i3);
        } else {
            i = -1;
        }
        bundle.putInt("list_position", i);
        Calendar calendar = dVar.f16224q;
        if (calendar != null) {
            bundle.putLong("min_date", calendar.getTimeInMillis());
        }
        Calendar calendar2 = dVar.f16225r;
        if (calendar2 != null) {
            bundle.putLong("max_date", calendar2.getTimeInMillis());
        }
    }
}
