package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p033v7.app.C0358as;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.j.a.a.a.a */
/* compiled from: PG */
final class C23923a extends C0358as implements View.OnClickListener {

    /* renamed from: a */
    private final CharSequence f65420a;

    public C23923a(Context context, CharSequence charSequence) {
        super(context, 0);
        this.f65420a = charSequence;
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.dismiss_button) {
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo1201e();
        mo1197b().mo1188p(R.layout.material_info_dialog);
        mo1197b().mo1177e(R.id.dismiss_button).setOnClickListener(this);
        ((TextView) mo1197b().mo1177e(R.id.dialog_text)).setText(this.f65420a);
    }
}
