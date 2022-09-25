package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;

/* compiled from: PG */
public abstract class MatchInfo implements Parcelable, Comparable {
    /* renamed from: a */
    public abstract int mo45022a();

    /* renamed from: b */
    public abstract int mo45023b();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        MatchInfo matchInfo = (MatchInfo) obj;
        int a = C42303cb.m74472a(mo45023b(), matchInfo.mo45023b());
        return a == 0 ? C42303cb.m74472a(mo45022a(), matchInfo.mo45022a()) : a;
    }
}
