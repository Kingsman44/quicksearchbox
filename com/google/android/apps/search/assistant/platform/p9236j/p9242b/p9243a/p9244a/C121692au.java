package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.au */
/* compiled from: PG */
final class C121692au {

    /* renamed from: a */
    public final C33729b f337615a;

    /* renamed from: b */
    public final C34053bp f337616b;

    /* renamed from: c */
    public final C33514d f337617c;

    /* renamed from: d */
    public final boolean f337618d;

    /* renamed from: e */
    public final Set f337619e;

    public C121692au(C33729b bVar, C34053bp bpVar, C33514d dVar, boolean z, Set set) {
        C69664n.m101061g(bVar, "invocationParams");
        C69664n.m101061g(bpVar, "invocationToken");
        C69664n.m101061g(set, "acquiredResourceTypes");
        this.f337615a = bVar;
        this.f337616b = bpVar;
        this.f337617c = dVar;
        this.f337618d = z;
        this.f337619e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121692au)) {
            return false;
        }
        C121692au auVar = (C121692au) obj;
        return C69664n.m101066l(this.f337615a, auVar.f337615a) && C69664n.m101066l(this.f337616b, auVar.f337616b) && C69664n.m101066l(this.f337617c, auVar.f337617c) && this.f337618d == auVar.f337618d && C69664n.m101066l(this.f337619e, auVar.f337619e);
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f337615a.hashCode() * 31) + this.f337616b.hashCode()) * 31;
        C33514d dVar = this.f337617c;
        if (dVar == null) {
            i = 0;
        } else {
            long j = dVar.f89676a;
            i = (int) (j ^ (j >>> 32));
        }
        return ((((hashCode + i) * 31) + (this.f337618d ? 1 : 0)) * 31) + this.f337619e.hashCode();
    }

    public final String toString() {
        C33729b bVar = this.f337615a;
        C34053bp bpVar = this.f337616b;
        C33514d dVar = this.f337617c;
        boolean z = this.f337618d;
        Set set = this.f337619e;
        return "ResourceAcquisitionParams(invocationParams=" + bVar + ", invocationToken=" + bpVar + ", voiceInteractionSessionId=" + dVar + ", implicit=" + z + ", acquiredResourceTypes=" + set + ")";
    }
}
