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

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cs */
/* compiled from: PG */
public final class C33340cs implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        MessageCarouselField messageCarouselField = (MessageCarouselField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_message_carousel_field, (ViewGroup) null);
        C33341ct a = messageCarouselField.mo17754z();
        a.f89375a = dVar.f88740c;
        a.f89376b = dVar.f88739b;
        a.f89377c = dVar.f88745h;
        a.f89378d = dVar.f88741d;
        a.f89379e = dVar.f88743f;
        a.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        return messageCarouselField;
    }
}
