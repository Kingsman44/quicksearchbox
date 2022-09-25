package com.google.android.apps.gsa.search.shared.p6941ui;

import android.database.DataSetObserver;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.i */
/* compiled from: PG */
public final class C88529i extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ C88530j f239260a;

    /* renamed from: b */
    private boolean f239261b = true;

    public C88529i(C88530j jVar) {
        this.f239260a = jVar;
    }

    public final void onChanged() {
        boolean z = !TextUtils.isEmpty(this.f239260a.f239262a.getText().toString());
        this.f239260a.mo82163a(z);
        if (z && this.f239261b && this.f239260a.f239264c.getVisibility() == 0) {
            TextView textView = this.f239260a.f239264c;
            textView.announceForAccessibility(textView.getContext().getString(R.string.edit_reminder_no_matching_places_found));
            this.f239261b = false;
        } else if (this.f239260a.f239264c.getVisibility() != 0) {
            this.f239261b = true;
        }
    }
}
