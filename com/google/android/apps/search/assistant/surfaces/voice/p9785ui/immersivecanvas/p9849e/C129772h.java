package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e;

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.h */
/* compiled from: PG */
public final /* synthetic */ class C129772h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C129776l f356085a;

    /* renamed from: b */
    public final /* synthetic */ LogoView f356086b;

    /* renamed from: c */
    public final /* synthetic */ EditText f356087c;

    public /* synthetic */ C129772h(C129776l lVar, LogoView logoView, EditText editText) {
        this.f356085a = lVar;
        this.f356086b = logoView;
        this.f356087c = editText;
    }

    public final void onClick(View view) {
        C129776l lVar = this.f356085a;
        LogoView logoView = this.f356086b;
        EditText editText = this.f356087c;
        int i = logoView.f332962d.f333027j;
        if (i == 7 || i == 13) {
            lVar.mo109255i(editText, false);
            lVar.mo109257k();
        }
    }
}
