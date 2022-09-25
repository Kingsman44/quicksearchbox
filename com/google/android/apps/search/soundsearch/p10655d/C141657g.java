package com.google.android.apps.search.soundsearch.p10655d;

import android.view.View;
import android.widget.Button;
import java.util.Arrays;

/* renamed from: com.google.android.apps.search.soundsearch.d.g */
/* compiled from: PG */
public final /* synthetic */ class C141657g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141658h f384492a;

    /* renamed from: b */
    public final /* synthetic */ Button f384493b;

    public /* synthetic */ C141657g(C141658h hVar, Button button) {
        this.f384492a = hVar;
        this.f384493b = button;
    }

    public final void onClick(View view) {
        C141658h hVar = this.f384492a;
        this.f384493b.setEnabled(false);
        hVar.f384496c.mo48997d(Arrays.asList(new String[]{"sound_search_fingerprinter_split"}));
    }
}
