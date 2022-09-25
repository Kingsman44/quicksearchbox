package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.actions.SoundSearchResult;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.ao */
/* compiled from: PG */
public final class C93267ao extends C93278j {
    public C93267ao(Context context, C91097g gVar) {
        super(context, gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final Intent mo87585e(SoundSearchResult soundSearchResult) {
        int i = soundSearchResult.f236037m;
        if (i == 1) {
            Intent intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(soundSearchResult.f236033i)).setPackage("com.google.android.music");
            if (!C87489k.m142015c(this.f260113a, intent).mo81435e()) {
                return intent;
            }
            intent.setPackage((String) null);
            return intent;
        } else if (i != 2 || this.f260113a.getPackageManager() == null || soundSearchResult.f236036l == null) {
            return null;
        } else {
            return this.f260113a.getPackageManager().getLaunchIntentForPackage(soundSearchResult.f236036l);
        }
    }
}
