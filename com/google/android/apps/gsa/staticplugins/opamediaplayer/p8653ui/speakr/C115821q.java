package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.os.Bundle;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115440j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115441k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.q */
/* compiled from: PG */
final class C115821q extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    public final TextView f321211a;

    /* renamed from: b */
    private final C115820p f321212b;

    public C115821q(View view, C115820p pVar) {
        super(view);
        this.f321211a = (TextView) view.findViewById(R.id.language_description);
        this.f321212b = pVar;
    }

    public final void onClick(View view) {
        C115820p pVar = this.f321212b;
        int bindingAdapterPosition = getBindingAdapterPosition();
        C115440j jVar = ((C115827w) pVar).f321221e;
        Bundle bundle = new Bundle();
        bundle.putInt("index", Integer.valueOf(bindingAdapterPosition).intValue());
        ((C115441k) jVar).f320284a.mo28345s("onLanguageSelected_int", "SpeakrLanguageSelectionEventsDispatcher", bundle);
    }
}
