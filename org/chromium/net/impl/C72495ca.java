package org.chromium.net.impl;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;
import p3186j$.time.Duration;

/* renamed from: org.chromium.net.impl.ca */
/* compiled from: PG */
final class C72495ca {

    /* renamed from: a */
    final C72522da f192878a;

    /* renamed from: b */
    final Executor f192879b;

    /* renamed from: c */
    final Executor f192880c;

    /* renamed from: d */
    final /* synthetic */ C72499ce f192881d;

    public C72495ca(C72499ce ceVar, UrlRequest.Callback callback, Executor executor) {
        this.f192881d = ceVar;
        this.f192878a = new C72522da(callback);
        if (ceVar.f192899h) {
            this.f192879b = executor;
            this.f192880c = null;
            return;
        }
        this.f192879b = new C72502ch(executor);
        this.f192880c = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64239a(C72500cf cfVar) {
        try {
            this.f192879b.execute(new C72486bs(this.f192881d, cfVar));
        } catch (RejectedExecutionException e) {
            this.f192881d.mo64246e(new C72534p("Exception posting task to executor", e));
        }
    }

    /* renamed from: b */
    public final void mo64240b() {
        String str;
        int i;
        boolean z;
        Map map;
        long j;
        long j2;
        long j3;
        long j4;
        try {
            C72499ce ceVar = this.f192881d;
            C72539u uVar = ceVar.f192911t;
            int i2 = ceVar.f192910s;
            C72513cs csVar = ceVar.f192906o;
            if (csVar != null) {
                map = csVar.f192955e.getAsMap();
                C72513cs csVar2 = this.f192881d.f192906o;
                String str2 = csVar2.f192953c;
                int i3 = csVar2.f192951a;
                z = csVar2.f192952b;
                str = str2;
                i = i3;
            } else {
                map = Collections.emptyMap();
                str = BuildConfig.FLAVOR;
                z = false;
                i = 0;
            }
            if (z) {
                j2 = 0;
                j = 0;
            } else {
                j2 = C72499ce.m107195b(this.f192881d.f192896e);
                j = -1;
            }
            if (z) {
                j4 = 0;
                j3 = 0;
            } else {
                j3 = C72499ce.m107196c(map);
                if (map.containsKey("Content-Length")) {
                    try {
                        j4 = Long.parseLong((String) ((List) map.get("Content-Length")).get(0));
                    } catch (NumberFormatException unused) {
                        j4 = 0;
                    }
                } else {
                    j4 = -1;
                }
            }
            C72537s sVar = r7;
            C72537s sVar2 = new C72537s(j2, j, j3, j4, i, Duration.ofSeconds(0), Duration.ofSeconds(0), str, false, false);
            uVar.mo58624a(i2, sVar);
        } catch (RuntimeException e) {
            Log.e(C72499ce.f192892a, "Error while trying to log CronetTrafficInfo: ", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo64241c() {
        mo64239a(new C72489bv(this));
    }
}
