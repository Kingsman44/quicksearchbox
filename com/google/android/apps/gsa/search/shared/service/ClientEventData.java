package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;

/* compiled from: PG */
public class ClientEventData extends EventData {
    public static final Parcelable.Creator CREATOR = new C88488i();

    /* renamed from: a */
    public final C87741bw f236955a;

    public ClientEventData(C87741bw bwVar, Parcelable parcelable) {
        super(parcelable);
        this.f236955a = bwVar;
    }

    /* renamed from: a */
    public final byte[] mo81911a() {
        return this.f236955a.toByteArray();
    }
}
