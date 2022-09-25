package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.k */
/* compiled from: PG */
public final class C104347k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CharSequence f290294a;

    /* renamed from: b */
    final /* synthetic */ C104348l f290295b;

    public C104347k(C104348l lVar, CharSequence charSequence) {
        this.f290295b = lVar;
        this.f290294a = charSequence;
    }

    public final void onClick(View view) {
        String string = this.f290295b.f290307b.getString(R.string.copied_to_clipboard);
        ((ClipboardManager) this.f290295b.f290307b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(string, this.f290294a));
        Toast.makeText(this.f290295b.f290307b, string, 1).show();
    }
}
