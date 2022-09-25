package com.google.android.libraries.play.unison.binding;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.play.unison.binding.q */
/* compiled from: PG */
public final class C31991q implements C31982h {

    /* renamed from: a */
    final /* synthetic */ Bundle f85989a;

    public C31991q(Bundle bundle) {
        this.f85989a = bundle;
    }

    /* renamed from: b */
    public final Parcelable mo37720b(Object obj) {
        return this.f85989a.getParcelable(obj.toString());
    }

    /* renamed from: c */
    public final void mo37721c(Object obj, Parcelable parcelable) {
        this.f85989a.putParcelable(obj.toString(), parcelable);
    }
}
