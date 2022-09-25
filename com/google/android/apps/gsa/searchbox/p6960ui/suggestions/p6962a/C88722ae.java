package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C88722ae implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f239979a;

    public /* synthetic */ C88722ae(Context context) {
        this.f239979a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f239979a;
        Integer num = C88727aj.f239990a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(context.getResources().getString(R.string.opa_suggestion_learn_more_url, new Object[]{Locale.getDefault().getLanguage()})));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
