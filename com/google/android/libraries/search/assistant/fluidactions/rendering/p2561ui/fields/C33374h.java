package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33179d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.h */
/* compiled from: PG */
public final class C33374h implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        AudioRecorderField audioRecorderField;
        if (dVar.f88744g.f88753c) {
            audioRecorderField = (AudioRecorderField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_audio_recorder_field_glanceable, (ViewGroup) null);
        } else {
            audioRecorderField = (AudioRecorderField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_audio_recorder_field, (ViewGroup) null);
        }
        C33375i a = audioRecorderField.mo17754z();
        a.f89426j = dVar.f88740c;
        a.f89427k = dVar.f88739b;
        a.f89428l = dVar.f88745h;
        a.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        ImageButton imageButton = a.f89423g;
        if (!(imageButton == null || a.f89424h == null)) {
            imageButton.setOnClickListener(new C33348d(a));
            a.f89424h.setOnClickListener(new C33371e(a));
        }
        return audioRecorderField;
    }
}
