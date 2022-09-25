package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.af */
/* compiled from: PG */
public final /* synthetic */ class C88723af implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88727aj f239980a;

    /* renamed from: b */
    public final /* synthetic */ boolean f239981b;

    /* renamed from: c */
    public final /* synthetic */ Suggestion f239982c;

    /* renamed from: d */
    public final /* synthetic */ int f239983d;

    public /* synthetic */ C88723af(C88727aj ajVar, boolean z, Suggestion suggestion, int i) {
        this.f239980a = ajVar;
        this.f239981b = z;
        this.f239982c = suggestion;
        this.f239983d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C88727aj ajVar = this.f239980a;
        boolean z = this.f239981b;
        Suggestion suggestion = this.f239982c;
        int i2 = this.f239983d;
        if (z) {
            ajVar.f239998c.mo44278q(suggestion);
            return;
        }
        ajVar.f239997b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ajVar.f239997b.getResources().getString(i2, new Object[]{Locale.getDefault().getLanguage()}))));
    }
}
