package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33179d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dv */
/* compiled from: PG */
public final class C33370dv implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        TimerInstanceField timerInstanceField = (TimerInstanceField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_timer_instance_field, (ViewGroup) null);
        timerInstanceField.f89208a = dVar.f88740c;
        timerInstanceField.f89209b = dVar.f88739b;
        timerInstanceField.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        return timerInstanceField;
    }
}
