package com.google.android.libraries.storage.protostore;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.android.libraries.storage.protostore.p3320e.C42992a;
import com.google.apps.tiktok.tracing.C47523ai;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.storage.protostore.ds */
/* compiled from: PG */
public final class C42983ds {
    /* renamed from: a */
    public static C42876ab m75880a(String str, C60870cx cxVar, MessageLite messageLite, Executor executor, C43007j jVar, C42813k kVar) {
        MessageLite messageLite2 = messageLite;
        C42992a aVar = new C42992a(messageLite, C62921ba.m95368a());
        C58881cr crVar = C42925bu.f112290a;
        Objects.requireNonNull(crVar);
        return new C42876ab(new C42929by(str, cxVar, aVar, executor, kVar, jVar, true, new C42982dr(crVar), false, new C47523ai()), C42932a.f112315a, C60856cj.m92900i(BuildConfig.FLAVOR), true);
    }
}
