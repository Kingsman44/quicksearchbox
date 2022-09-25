package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p6995aq.C89267j;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.k */
/* compiled from: PG */
public final class C88638k {

    /* renamed from: a */
    public final Context f239625a;

    /* renamed from: b */
    public final SharedPreferences f239626b;

    public C88638k(Context context, SharedPreferences sharedPreferences) {
        this.f239625a = context;
        this.f239626b = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo82296a(C89267j jVar) {
        if (!this.f239626b.getString("search_widget_current_hint_list", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            Intent v = C89257aa.m145199v(BuildConfig.FLAVOR);
            v.putExtra("hint-text-update-context", jVar.toByteArray());
            this.f239625a.sendBroadcast(v);
        }
    }
}
