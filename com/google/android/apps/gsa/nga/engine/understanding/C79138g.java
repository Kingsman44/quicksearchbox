package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.g */
/* compiled from: PG */
public final class C79138g extends C78985al {

    /* renamed from: a */
    private final C80386p f217541a;

    /* renamed from: b */
    private final C78984ak f217542b;

    public C79138g(C80386p pVar, C78984ak akVar) {
        if (pVar != null) {
            this.f217541a = pVar;
            if (akVar != null) {
                this.f217542b = akVar;
                return;
            }
            throw new NullPointerException("Null stage");
        }
        throw new NullPointerException("Null rankingFeatures");
    }

    /* renamed from: a */
    public final C78984ak mo73749a() {
        return this.f217542b;
    }

    /* renamed from: b */
    public final C80386p mo73750b() {
        return this.f217541a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78985al) {
            C78985al alVar = (C78985al) obj;
            return this.f217541a.equals(alVar.mo73750b()) && this.f217542b.equals(alVar.mo73749a());
        }
    }

    public final int hashCode() {
        return ((this.f217541a.hashCode() ^ 1000003) * 1000003) ^ this.f217542b.hashCode();
    }

    public final String toString() {
        String obj = this.f217541a.toString();
        String obj2 = this.f217542b.toString();
        return "TaskScore{rankingFeatures=" + obj + ", stage=" + obj2 + "}";
    }
}
