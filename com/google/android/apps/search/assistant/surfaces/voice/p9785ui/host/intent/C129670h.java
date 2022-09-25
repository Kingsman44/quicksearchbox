package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.h */
/* compiled from: PG */
public final class C129670h extends Binder {

    /* renamed from: a */
    private C69626l f355881a;

    public C129670h(C69626l lVar) {
        this.f355881a = lVar;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C69664n.m101061g(parcel, "data");
        C69626l lVar = this.f355881a;
        if (lVar != null) {
            Parcelable readParcelable = parcel.readParcelable(NavigatorArgs$Transition.Data.class.getClassLoader());
            C69664n.m101058d(readParcelable);
            lVar.mo5761a(readParcelable);
        }
        this.f355881a = null;
        return true;
    }
}
