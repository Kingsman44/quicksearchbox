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

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.s */
/* compiled from: PG */
public final class C33385s implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        ChatMessageField chatMessageField = (ChatMessageField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_chat_message_field, (ViewGroup) null);
        chatMessageField.f89025b = dVar.f88740c;
        chatMessageField.f89026c = dVar.f88739b;
        chatMessageField.f89027d = dVar.f88745h;
        chatMessageField.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        return chatMessageField;
    }
}
