package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129630i;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.m */
/* compiled from: PG */
public final class C129675m {

    /* renamed from: a */
    public final IBinder f355889a;

    public C129675m(IBinder iBinder) {
        this.f355889a = iBinder;
    }

    public C129675m(C129630i iVar) {
        this.f355889a = new C129673k(iVar);
    }

    /* renamed from: a */
    public final void mo109187a() {
        this.f355889a.transact(C129671i.KILL.ordinal(), Parcel.obtain(), (Parcel) null, 0);
    }

    public final String toString() {
        return this.f355889a.toString();
    }
}
