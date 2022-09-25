package com.google.android.apps.gsa.staticplugins.customtabs;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.y */
/* compiled from: PG */
public final /* synthetic */ class C98705y implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98583ai f275695a;

    /* renamed from: b */
    public final /* synthetic */ String f275696b;

    public /* synthetic */ C98705y(C98583ai aiVar, String str) {
        this.f275695a = aiVar;
        this.f275696b = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C98583ai aiVar = this.f275695a;
        String str = this.f275696b;
        String string = aiVar.f275328b.getString(R.string.custom_tabs_link_copied);
        ((ClipboardManager) aiVar.f275328b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(string, str));
        Toast.makeText(aiVar.f275328b, string, 1).show();
        C89949q.m146523g(661);
        return C118826c.f331422a;
    }
}
