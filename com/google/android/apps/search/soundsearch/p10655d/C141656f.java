package com.google.android.apps.search.soundsearch.p10655d;

import android.view.View;
import android.widget.Button;
import java.util.Arrays;

/* renamed from: com.google.android.apps.search.soundsearch.d.f */
/* compiled from: PG */
public final /* synthetic */ class C141656f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141658h f384489a;

    /* renamed from: b */
    public final /* synthetic */ Button f384490b;

    /* renamed from: c */
    public final /* synthetic */ Button f384491c;

    public /* synthetic */ C141656f(C141658h hVar, Button button, Button button2) {
        this.f384489a = hVar;
        this.f384490b = button;
        this.f384491c = button2;
    }

    public final void onClick(View view) {
        C141658h hVar = this.f384489a;
        Button button = this.f384490b;
        Button button2 = this.f384491c;
        button.setEnabled(false);
        button2.setEnabled(false);
        hVar.f384496c.mo48994a(Arrays.asList(new String[]{"sound_search_fingerprinter_split"}));
    }
}
