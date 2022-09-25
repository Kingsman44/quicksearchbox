package com.google.android.apps.search.transcription.voiceime;

import android.app.Dialog;
import android.inputmethodservice.InputMethodService;
import android.view.Window;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.search.transcription.voiceime.bg */
/* compiled from: PG */
public final /* synthetic */ class C141996bg implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C141998bi f385297a;

    public /* synthetic */ C141996bg(C141998bi biVar) {
        this.f385297a = biVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Dialog window;
        InputMethodService inputMethodService = this.f385297a.f385300b;
        if (inputMethodService == null || (window = inputMethodService.getWindow()) == null) {
            return C58836b.f156633a;
        }
        Window window2 = window.getWindow();
        if (window2 == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(window2.getAttributes().token);
    }
}
