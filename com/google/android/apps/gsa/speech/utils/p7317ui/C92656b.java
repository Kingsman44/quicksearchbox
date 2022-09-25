package com.google.android.apps.gsa.speech.utils.p7317ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.utils.ui.b */
/* compiled from: PG */
public final class C92656b extends ClickableSpan {

    /* renamed from: a */
    public static final /* synthetic */ int f258639a = 0;

    /* renamed from: b */
    private final C91097g f258640b;

    /* renamed from: c */
    private final Context f258641c;

    public C92656b(C91097g gVar, Context context) {
        this.f258640b = gVar;
        this.f258641c = context;
    }

    public final void onClick(View view) {
        C58976aa aaVar = C58975e.f156826a;
        Intent putExtra = new Intent("android.intent.action.MAIN").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity").putExtra(":android:no_headers", false).putExtra(":android:show_fragment", "com.google.android.apps.gsa.speech.settingsui.hotword.HotwordSettingsFragment").putExtra("smart_lock", true).putExtra("enrollment_entry_id", 2);
        C91097g gVar = this.f258640b;
        if (gVar != null) {
            gVar.mo65090b(putExtra, C92655a.f258638a);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(C1878d.m5128a(this.f258641c, R.color.quantum_googblue));
    }
}
