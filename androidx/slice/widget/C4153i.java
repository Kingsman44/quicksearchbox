package androidx.slice.widget;

import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.util.Log;
import android.widget.TimePicker;
import androidx.slice.SliceItem;
import java.util.Calendar;
import java.util.Date;

/* renamed from: androidx.slice.widget.i */
/* compiled from: PG */
final class C4153i implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    final /* synthetic */ GridRowView f13375a;

    /* renamed from: b */
    private final SliceItem f13376b;

    /* renamed from: c */
    private final int f13377c;

    public C4153i(GridRowView gridRowView, SliceItem sliceItem, int i) {
        this.f13375a = gridRowView;
        this.f13376b = sliceItem;
        this.f13377c = i;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        Date time = Calendar.getInstance().getTime();
        time.setHours(i);
        time.setMinutes(i2);
        try {
            this.f13376b.mo8599g(this.f13375a.getContext(), new Intent().addFlags(268435456).putExtra("android.app.slice.extra.RANGE_VALUE", time.getTime()));
            GridRowView gridRowView = this.f13375a;
            C4141as asVar = gridRowView.f13256o;
            if (asVar != null) {
                asVar.mo8726b(new C4147c(gridRowView.mo8706fy(), 7, 8, this.f13377c), this.f13376b);
            }
        } catch (PendingIntent.CanceledException e) {
            Log.e("GridRowView", "PendingIntent for slice cannot be sent", e);
        }
    }
}
