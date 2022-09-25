package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public abstract class PeopleApiAffinity implements Parcelable {

    /* renamed from: e */
    public static final PeopleApiAffinity f110783e = m74377e(BuildConfig.FLAVOR, false);

    /* renamed from: e */
    public static PeopleApiAffinity m74377e(String str, boolean z) {
        return new AutoValue_PeopleApiAffinity(str, AffinityMetadata.f110679f, z);
    }

    /* renamed from: a */
    public abstract double mo45027a();

    /* renamed from: b */
    public abstract AffinityMetadata mo45028b();

    /* renamed from: c */
    public abstract String mo45029c();

    /* renamed from: d */
    public abstract boolean mo45030d();
}
