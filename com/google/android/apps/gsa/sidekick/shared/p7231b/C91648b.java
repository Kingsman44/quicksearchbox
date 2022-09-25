package com.google.android.apps.gsa.sidekick.shared.p7231b;

import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.b.b */
/* compiled from: PG */
public class C91648b implements C91647a {

    /* renamed from: a */
    private final C91728l f255604a;

    /* renamed from: b */
    private final C8142xb f255605b;

    public C91648b(C91728l lVar, C8142xb xbVar) {
        this.f255604a = lVar;
        this.f255605b = xbVar;
    }

    /* renamed from: a */
    public final C8142xb mo85966a() {
        return this.f255605b;
    }

    /* renamed from: b */
    public void mo85967b(LoggingRequest loggingRequest) {
        this.f255604a.mo86219f(loggingRequest);
    }

    /* renamed from: c */
    public final void mo85968c(C7718hj hjVar, C7681g gVar, C7526an anVar) {
        mo85967b(LoggingRequest.m150674y(hjVar, gVar, anVar, this.f255605b));
    }

    /* renamed from: d */
    public void mo85969d(C7718hj hjVar, C7681g gVar) {
        this.f255604a.mo86221h(hjVar, gVar, this.f255605b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C91648b) {
            C91648b bVar = (C91648b) obj;
            if (bVar.f255605b == this.f255605b && bVar.f255604a == this.f255604a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f255605b, this.f255604a});
    }
}
