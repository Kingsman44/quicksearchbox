package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Intent;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public abstract class ResultState implements Parcelable {
    /* renamed from: d */
    public static C126762a m207358d() {
        C126762a aVar = new C126762a();
        aVar.f349096a = new Intent();
        aVar.f349097b = new Intent();
        aVar.f349098c = BuildConfig.FLAVOR;
        return aVar;
    }

    /* renamed from: a */
    public abstract Intent mo107753a();

    /* renamed from: b */
    public abstract Intent mo107754b();

    /* renamed from: c */
    public abstract String mo107755c();
}
