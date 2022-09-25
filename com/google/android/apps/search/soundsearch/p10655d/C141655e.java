package com.google.android.apps.search.soundsearch.p10655d;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.play.core.p3538g.C45121ag;
import com.google.android.play.core.p3538g.C45122ah;
import com.google.android.play.core.p3538g.C45187v;

/* renamed from: com.google.android.apps.search.soundsearch.d.e */
/* compiled from: PG */
public final /* synthetic */ class C141655e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141658h f384485a;

    /* renamed from: b */
    public final /* synthetic */ Button f384486b;

    /* renamed from: c */
    public final /* synthetic */ Button f384487c;

    /* renamed from: d */
    public final /* synthetic */ TextView f384488d;

    public /* synthetic */ C141655e(C141658h hVar, Button button, Button button2, TextView textView) {
        this.f384485a = hVar;
        this.f384486b = button;
        this.f384487c = button2;
        this.f384488d = textView;
    }

    public final void onClick(View view) {
        C141658h hVar = this.f384485a;
        Button button = this.f384486b;
        Button button2 = this.f384487c;
        TextView textView = this.f384488d;
        button.setEnabled(false);
        button2.setEnabled(false);
        C45187v vVar = hVar.f384496c;
        C45121ag agVar = new C45121ag();
        agVar.mo48957a("sound_search_fingerprinter_split");
        vVar.mo48998e(new C45122ah(agVar));
        hVar.f384496c.mo49001h(new C141654d(hVar, textView));
    }
}
