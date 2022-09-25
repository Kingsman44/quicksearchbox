package com.google.android.libraries.assistant.p1363c.p1371b.p1376d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17074s;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.libraries.assistant.c.b.d.l */
/* compiled from: PG */
public final class C17093l {

    /* renamed from: a */
    public final Optional f49743a;

    /* renamed from: b */
    public final boolean f49744b;

    /* renamed from: c */
    private final Optional f49745c;

    /* renamed from: d */
    private final boolean f49746d;

    /* renamed from: e */
    private final boolean f49747e;

    public C17093l(Optional optional, Optional optional2, boolean z, boolean z2, boolean z3) {
        this.f49743a = optional;
        this.f49745c = optional2;
        this.f49746d = z;
        this.f49744b = z2;
        this.f49747e = z3;
    }

    /* renamed from: a */
    public final C17087f mo23181a() {
        if (this.f49745c.isPresent()) {
            return C17087f.FINISHED_ERROR;
        }
        if (this.f49746d) {
            return C17087f.FINISHED_CANCELLED;
        }
        if (this.f49743a.isEmpty()) {
            return C17087f.PREPARING;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(((C17074s) this.f49743a.get()).f49711a).map(C17088g.f49738a).collect(C58370cn.f155946a);
        if (guVar.contains(C17072q.UNKNOWN)) {
            throw new IllegalStateException("Got an unknown status back from the API: this should not happen.");
        } else if (guVar.contains(C17072q.DOWNLOADING) || guVar.contains(C17072q.READY_TO_DOWNLOAD)) {
            return this.f49747e ? C17087f.DOWNLOADING : C17087f.READY_TO_DOWNLOAD;
        } else {
            if (guVar.contains(C17072q.FINISHED_FAILURE)) {
                return C17087f.FINISHED_ERROR;
            }
            if (guVar.contains(C17072q.FINISHED_CANCELLED)) {
                return C17087f.FINISHED_CANCELLED;
            }
            if (guVar.contains(C17072q.FINISHED_SUCCESS)) {
                return C17087f.FINISHED_SUCCESS;
            }
            return C17087f.FINISHED_SUCCESS;
        }
    }

    /* renamed from: b */
    public final OptionalLong mo23182b() {
        C17087f a = mo23181a();
        if (a.equals(C17087f.DOWNLOADING) || a.equals(C17087f.FINISHED_SUCCESS) || a.equals(C17087f.READY_TO_DOWNLOAD)) {
            return OptionalLong.m71641of(Collection.EL.stream(((C17074s) this.f49743a.orElseThrow(C17091j.f49741a)).f49711a).mapToLong(C17092k.f49742a).sum());
        }
        return OptionalLong.empty();
    }

    /* renamed from: c */
    public final OptionalLong mo23183c() {
        C17087f a = mo23181a();
        if (a.equals(C17087f.DOWNLOADING) || a.equals(C17087f.FINISHED_SUCCESS) || a.equals(C17087f.READY_TO_DOWNLOAD)) {
            return OptionalLong.m71641of(Collection.EL.stream(((C17074s) this.f49743a.orElseThrow(C17089h.f49739a)).f49711a).mapToLong(C17090i.f49740a).sum());
        }
        return OptionalLong.empty();
    }
}
