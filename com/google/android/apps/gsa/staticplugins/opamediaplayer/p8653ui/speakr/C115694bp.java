package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.DialogInterface;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115422a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115433c;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115435e;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115446p;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.bp */
/* compiled from: PG */
public final /* synthetic */ class C115694bp implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320891a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f320892b;

    public /* synthetic */ C115694bp(C115711cf cfVar, byte[] bArr) {
        this.f320891a = cfVar;
        this.f320892b = bArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C115711cf cfVar = this.f320891a;
        byte[] bArr = this.f320892b;
        C115446p pVar = cfVar.f320936g;
        C115435e a = C115435e.m191424a(((C115433c) C115422a.f320241a.get(i)).f320259b);
        if (a == null) {
            a = C115435e.DEFAULT_FEEDBACK_TYPE;
        }
        pVar.mo101933y(bArr, a, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }
}
