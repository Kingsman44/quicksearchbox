package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.al */
/* compiled from: PG */
public final class C116169al extends C116176e {
    public C116169al(Resources resources, Context context, DialogInterface.OnCancelListener onCancelListener) {
        super(resources, context, onCancelListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AlertDialog mo102532a() {
        return new AlertDialog.Builder(this.f322143d).setTitle(this.f322142c.getString(R.string.recently_removed_item_dialog_title)).setMessage(this.f322142c.getString(R.string.recently_removed_item_dialog_message)).setPositiveButton(this.f322142c.getString(R.string.recently_removed_item_dialog_ok), new C116168ak(this)).setOnCancelListener(this.f322144e).create();
    }

    /* renamed from: b */
    public final void mo102533b(AlertDialog alertDialog) {
        alertDialog.getButton(-1).setTextColor(this.f322142c.getColor(R.color.agsa_color_primary_variant));
        ((TextView) alertDialog.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
