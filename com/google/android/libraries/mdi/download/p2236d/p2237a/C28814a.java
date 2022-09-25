package com.google.android.libraries.mdi.download.p2236d.p2237a;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;

/* renamed from: com.google.android.libraries.mdi.download.d.a.a */
/* compiled from: PG */
public final class C28814a extends C28816c {

    /* renamed from: a */
    private final C29392ep f78282a;

    /* renamed from: b */
    private final C29334dr f78283b;

    public C28814a(C29392ep epVar, C29334dr drVar) {
        if (epVar != null) {
            this.f78282a = epVar;
            if (drVar != null) {
                this.f78283b = drVar;
                return;
            }
            throw new NullPointerException("Null dataFileGroup");
        }
        throw new NullPointerException("Null groupKey");
    }

    /* renamed from: a */
    public final C29334dr mo34483a() {
        return this.f78283b;
    }

    /* renamed from: b */
    public final C29392ep mo34484b() {
        return this.f78282a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28816c) {
            C28816c cVar = (C28816c) obj;
            return this.f78282a.equals(cVar.mo34484b()) && this.f78283b.equals(cVar.mo34483a());
        }
    }

    public final int hashCode() {
        return ((this.f78282a.hashCode() ^ 1000003) * 1000003) ^ this.f78283b.hashCode();
    }

    public final String toString() {
        String obj = this.f78282a.toString();
        String obj2 = this.f78283b.toString();
        return "GroupKeyAndGroup{groupKey=" + obj + ", dataFileGroup=" + obj2 + "}";
    }
}
