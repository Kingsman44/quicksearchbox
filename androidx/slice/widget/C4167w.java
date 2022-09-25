package androidx.slice.widget;

import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.util.Log;
import android.widget.TimePicker;
import androidx.slice.SliceItem;
import java.util.Calendar;
import java.util.Date;

/* renamed from: androidx.slice.widget.w */
/* compiled from: PG */
final class C4167w implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    final /* synthetic */ C4168x f13436a;

    /* renamed from: b */
    private final SliceItem f13437b;

    /* renamed from: c */
    private final int f13438c;

    public C4167w(C4168x xVar, SliceItem sliceItem, int i) {
        this.f13436a = xVar;
        this.f13437b = sliceItem;
        this.f13438c = i;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        Date time = Calendar.getInstance().getTime();
        time.setHours(i);
        time.setMinutes(i2);
        SliceItem sliceItem = this.f13437b;
        if (sliceItem != null) {
            try {
                sliceItem.mo8599g(this.f13436a.getContext(), new Intent().addFlags(268435456).putExtra("android.app.slice.extra.RANGE_VALUE", time.getTime()));
                C4168x xVar = this.f13436a;
                C4141as asVar = xVar.f13256o;
                if (asVar != null) {
                    asVar.mo8726b(new C4147c(xVar.mo8706fy(), 7, 8, this.f13438c), this.f13437b);
                }
            } catch (PendingIntent.CanceledException e) {
                Log.e("RowView", "PendingIntent for slice cannot be sent", e);
            }
        }
    }
}
