package com.google.android.libraries.storage.protostore;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.android.libraries.storage.protostore.p3320e.C42992a;
import com.google.apps.tiktok.tracing.C47523ai;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.dt */
/* compiled from: PG */
public final class C42984dt {
    /* renamed from: a */
    public static C42876ab m75881a(String str, C60870cx cxVar, MessageLite messageLite, Executor executor, C43007j jVar, C42813k kVar) {
        return new C42876ab(new C42981dq(str, cxVar, new C42992a(messageLite, C62921ba.m95368a()), executor, kVar, jVar, new C47523ai()), C42932a.f112315a, C60856cj.m92900i(BuildConfig.FLAVOR), true);
    }
}
