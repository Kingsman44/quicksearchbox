package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import android.media.AudioRecordingConfiguration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.c.o.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C37920b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C37920b f100518a = new C37920b();

    private /* synthetic */ C37920b() {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        int i = C37927i.f100526b;
        return ((AudioRecordingConfiguration) obj).getClientAudioSource() != 1999;
    }
}
