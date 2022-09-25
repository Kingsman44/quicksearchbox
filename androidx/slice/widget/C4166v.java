package androidx.slice.widget;

import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import android.widget.DatePicker;
import androidx.slice.SliceItem;
import java.util.Calendar;
import java.util.Date;

/* renamed from: androidx.slice.widget.v */
/* compiled from: PG */
final class C4166v implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    final /* synthetic */ C4168x f13433a;

    /* renamed from: b */
    private final SliceItem f13434b;

    /* renamed from: c */
    private final int f13435c;

    public C4166v(C4168x xVar, SliceItem sliceItem, int i) {
        this.f13433a = xVar;
        this.f13434b = sliceItem;
        this.f13435c = i;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        Date time = instance.getTime();
        SliceItem sliceItem = this.f13434b;
        if (sliceItem != null) {
            try {
                sliceItem.mo8599g(this.f13433a.getContext(), new Intent().addFlags(268435456).putExtra("android.app.slice.extra.RANGE_VALUE", time.getTime()));
                C4168x xVar = this.f13433a;
                C4141as asVar = xVar.f13256o;
                if (asVar != null) {
                    asVar.mo8726b(new C4147c(xVar.mo8706fy(), 6, 7, this.f13435c), this.f13434b);
                }
            } catch (PendingIntent.CanceledException e) {
                Log.e("RowView", "PendingIntent for slice cannot be sent", e);
            }
        }
    }
}
