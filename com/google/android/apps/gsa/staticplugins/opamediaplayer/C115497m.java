package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.m */
/* compiled from: PG */
public final /* synthetic */ class C115497m implements C115139az {

    /* renamed from: a */
    public final /* synthetic */ String f320359a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f320360b;

    public /* synthetic */ C115497m(String str, Bundle bundle) {
        this.f320359a = str;
        this.f320360b = bundle;
    }

    /* renamed from: a */
    public final C60870cx mo101844a(C115493i iVar) {
        String str = this.f320359a;
        iVar.f320350a.mo1037e().mo1021f(Uri.parse(str), this.f320360b);
        return C60856cj.m92900i(C84272l.SUCCESS);
    }
}
