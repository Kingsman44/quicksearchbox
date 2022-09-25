package androidx.slice.widget;

import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import android.widget.DatePicker;
import androidx.slice.SliceItem;
import java.util.Calendar;

/* renamed from: androidx.slice.widget.h */
/* compiled from: PG */
final class C4152h implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    final /* synthetic */ GridRowView f13372a;

    /* renamed from: b */
    private final SliceItem f13373b;

    /* renamed from: c */
    private final int f13374c;

    public C4152h(GridRowView gridRowView, SliceItem sliceItem, int i) {
        this.f13372a = gridRowView;
        this.f13373b = sliceItem;
        this.f13374c = i;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        try {
            this.f13373b.mo8599g(this.f13372a.getContext(), new Intent().addFlags(268435456).putExtra("android.app.slice.extra.RANGE_VALUE", instance.getTime().getTime()));
            GridRowView gridRowView = this.f13372a;
            C4141as asVar = gridRowView.f13256o;
            if (asVar != null) {
                asVar.mo8726b(new C4147c(gridRowView.mo8706fy(), 6, 7, this.f13374c), this.f13373b);
            }
        } catch (PendingIntent.CanceledException e) {
            Log.e("GridRowView", "PendingIntent for slice cannot be sent", e);
        }
    }
}
