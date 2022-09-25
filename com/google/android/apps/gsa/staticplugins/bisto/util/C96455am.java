package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.media.session.MediaController;
import android.media.session.MediaSession;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.am */
/* compiled from: PG */
final class C96455am {

    /* renamed from: a */
    final String f269834a;

    /* renamed from: b */
    final MediaSession.Token f269835b;

    public C96455am(MediaController mediaController) {
        this.f269834a = mediaController.getPackageName();
        this.f269835b = mediaController.getSessionToken();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C96455am)) {
            return false;
        }
        C96455am amVar = (C96455am) obj;
        if (!this.f269834a.equals(amVar.f269834a) || !this.f269835b.equals(amVar.f269835b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f269834a, this.f269835b});
    }
}
