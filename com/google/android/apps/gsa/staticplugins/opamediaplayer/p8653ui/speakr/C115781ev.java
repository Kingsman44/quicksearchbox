package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.DialogInterface;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115422a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115433c;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115435e;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115446p;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.ev */
/* compiled from: PG */
public final /* synthetic */ class C115781ev implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321053a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f321054b;

    /* renamed from: c */
    public final /* synthetic */ String f321055c;

    /* renamed from: d */
    public final /* synthetic */ String f321056d;

    public /* synthetic */ C115781ev(C115791fe feVar, byte[] bArr, String str, String str2) {
        this.f321053a = feVar;
        this.f321054b = bArr;
        this.f321055c = str;
        this.f321056d = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C115791fe feVar = this.f321053a;
        byte[] bArr = this.f321054b;
        String str = this.f321055c;
        String str2 = this.f321056d;
        C115446p pVar = feVar.f321096g;
        C115435e a = C115435e.m191424a(((C115433c) C115422a.f320241a.get(i)).f320259b);
        if (a == null) {
            a = C115435e.DEFAULT_FEEDBACK_TYPE;
        }
        pVar.mo101933y(bArr, a, str, str2);
    }
}
