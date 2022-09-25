package com.google.android.apps.search.transcription.voiceime;

import android.content.Context;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.transcription.voiceime.i */
/* compiled from: PG */
public final class C142006i {

    /* renamed from: a */
    public static final C59071e f385318a = C59071e.m91332i("com.google.android.apps.search.transcription.voiceime.i");

    /* renamed from: b */
    public final InputMethodManager f385319b;

    /* renamed from: c */
    public C58881cr f385320c = C142005h.f385317a;

    public C142006i(Context context) {
        this.f385319b = (InputMethodManager) context.getSystemService("input_method");
    }

    /* renamed from: a */
    public final void mo116962a() {
        ((C59052c) ((C59052c) f385318a.mo56224b()).mo56372aa(41970)).mo56386p("#switchToLastInputMethod");
        C58833ax axVar = (C58833ax) this.f385320c.mo6453a();
        InputMethodManager inputMethodManager = this.f385319b;
        if (inputMethodManager != null && axVar != null && axVar.mo56113h()) {
            try {
                inputMethodManager.switchToLastInputMethod((IBinder) axVar.mo56107c());
            } catch (NullPointerException e) {
                ((C59052c) ((C59052c) ((C59052c) f385318a.mo56226d()).mo56382g(e)).mo56372aa(41971)).mo56386p("Expected exception from framework.");
            }
        }
    }

    /* renamed from: b */
    public final void mo116963b(C58881cr crVar) {
        ((C59052c) ((C59052c) f385318a.mo56224b()).mo56372aa(41972)).mo56386p("#updateService");
        this.f385320c = crVar;
    }
}
