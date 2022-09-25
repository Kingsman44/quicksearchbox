package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b.C120125a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.h */
/* compiled from: PG */
final class C102979h extends C102960co {

    /* renamed from: a */
    public final NgaState f287556a;

    /* renamed from: b */
    public final C120125a f287557b;

    public C102979h(NgaState ngaState, C120125a aVar) {
        if (ngaState != null) {
            this.f287556a = ngaState;
            if (aVar != null) {
                this.f287557b = aVar;
                return;
            }
            throw new NullPointerException("Null specialExperience");
        }
        throw new NullPointerException("Null state");
    }

    /* renamed from: a */
    public final NgaState mo93539a() {
        return this.f287556a;
    }

    /* renamed from: b */
    public final C120125a mo93540b() {
        return this.f287557b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102960co) {
            C102960co coVar = (C102960co) obj;
            return this.f287556a.equals(coVar.mo93539a()) && this.f287557b.equals(coVar.mo93540b());
        }
    }

    public final int hashCode() {
        return ((this.f287556a.hashCode() ^ 1000003) * 1000003) ^ this.f287557b.hashCode();
    }

    public final String toString() {
        String obj = this.f287556a.toString();
        String obj2 = this.f287557b.toString();
        return "NgaStateDetails{state=" + obj + ", specialExperience=" + obj2 + "}";
    }
}
