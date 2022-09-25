package androidx.slice.widget;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.view.View;
import androidx.slice.SliceItem;
import com.google.android.googlequicksearchbox.R;
import java.util.Calendar;
import java.util.Date;

/* renamed from: androidx.slice.widget.f */
/* compiled from: PG */
final class C4150f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Date f13366a;

    /* renamed from: b */
    final /* synthetic */ boolean f13367b;

    /* renamed from: c */
    final /* synthetic */ SliceItem f13368c;

    /* renamed from: d */
    final /* synthetic */ int f13369d;

    /* renamed from: e */
    final /* synthetic */ GridRowView f13370e;

    public C4150f(GridRowView gridRowView, Date date, boolean z, SliceItem sliceItem, int i) {
        this.f13370e = gridRowView;
        this.f13366a = date;
        this.f13367b = z;
        this.f13368c = sliceItem;
        this.f13369d = i;
    }

    public final void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(this.f13366a);
        if (this.f13367b) {
            new DatePickerDialog(this.f13370e.getContext(), R.style.DialogTheme, new C4152h(this.f13370e, this.f13368c, this.f13369d), instance.get(1), instance.get(2), instance.get(5)).show();
        } else {
            new TimePickerDialog(this.f13370e.getContext(), R.style.DialogTheme, new C4153i(this.f13370e, this.f13368c, this.f13369d), instance.get(11), instance.get(12), false).show();
        }
    }
}
