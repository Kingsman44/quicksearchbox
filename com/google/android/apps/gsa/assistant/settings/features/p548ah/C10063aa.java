package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.preference.C3998ax;
import androidx.preference.PreferenceCategory;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.aa */
/* compiled from: PG */
final class C10063aa extends PreferenceCategory {

    /* renamed from: e */
    public Boolean f34309e;

    public C10063aa(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        Boolean bool = this.f34309e;
        if (bool != null) {
            axVar.f12847d = bool.booleanValue();
        }
        TextView textView = (TextView) axVar.mo8435a(16908304);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
    }
}
