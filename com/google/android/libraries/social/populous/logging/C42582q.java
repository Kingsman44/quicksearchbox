package com.google.android.libraries.social.populous.logging;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.social.populous.logging.q */
/* compiled from: PG */
public final class C42582q {

    /* renamed from: a */
    public final String f111749a;

    /* renamed from: b */
    public final ClientConfigInternal f111750b;

    /* renamed from: c */
    public final SocialAffinityAllEventSource f111751c;

    /* renamed from: d */
    public final ClientVersion f111752d;

    /* renamed from: e */
    public final SessionContext f111753e;

    private C42582q(String str, ClientConfigInternal clientConfigInternal, ClientVersion clientVersion, SessionContext sessionContext) {
        this.f111749a = str;
        this.f111750b = clientConfigInternal;
        this.f111751c = clientConfigInternal.f110733s;
        this.f111752d = clientVersion;
        this.f111753e = sessionContext;
    }

    /* renamed from: a */
    public static C42582q m75152a(String str, ClientConfigInternal clientConfigInternal, ClientVersion clientVersion, SessionContext sessionContext) {
        return new C42582q(C58837ba.m90858g(str), clientConfigInternal, clientVersion, sessionContext);
    }
}
