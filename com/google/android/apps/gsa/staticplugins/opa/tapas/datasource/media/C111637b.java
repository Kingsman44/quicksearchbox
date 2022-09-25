package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113142b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113178ci;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58485gu;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.b */
/* compiled from: PG */
public final /* synthetic */ class C111637b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ TapasMediaSource f310402a;

    public /* synthetic */ C111637b(TapasMediaSource tapasMediaSource) {
        this.f310402a = tapasMediaSource;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        TapasMediaSource tapasMediaSource = this.f310402a;
        C113178ci ciVar = tapasMediaSource.f310340b;
        Context context = tapasMediaSource.f310339a;
        C58485gu guVar = tapasMediaSource.f310341c;
        String str = null;
        long j = 0;
        for (Map.Entry entry : ciVar.f313497a.mo99898c(context).entrySet()) {
            if (!(entry == null || entry.getValue() == null)) {
                String str2 = (String) entry.getKey();
                long j2 = ((C113142b) entry.getValue()).f313458b;
                if (guVar.contains(str2) && j2 > j) {
                    str = str2;
                    j = j2;
                }
            }
        }
        Optional ofNullable = Optional.ofNullable(str);
        return ofNullable.isPresent() ? (String) ofNullable.get() : "com.google.android.music";
    }
}
