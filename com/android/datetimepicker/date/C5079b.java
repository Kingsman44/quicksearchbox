package com.android.datetimepicker.date;

import android.view.View;
import java.util.Calendar;

/* renamed from: com.android.datetimepicker.date.b */
/* compiled from: PG */
final class C5079b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C5081d f16205a;

    public C5079b(C5081d dVar) {
        this.f16205a = dVar;
    }

    public final void onClick(View view) {
        this.f16205a.f16226s.mo10050a();
        C5081d dVar = this.f16205a;
        C5080c cVar = dVar.f16208a;
        Calendar calendar = dVar.f16209b;
        C5090m mVar = ((C5092o) cVar).f16246a;
        if (mVar != null) {
            mVar.f16243a.mo10090a(calendar.get(1), calendar.get(2), calendar.get(5));
        }
        this.f16205a.f16208a.dismiss();
    }
}
