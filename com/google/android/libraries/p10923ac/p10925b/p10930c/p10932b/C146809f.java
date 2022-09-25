package com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146801h;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.b.c.b.f */
/* compiled from: PG */
final class C146809f extends C146817n {

    /* renamed from: b */
    private final List f396368b;

    /* renamed from: c */
    private final C146801h f396369c;

    public C146809f(List list, C146801h hVar) {
        if (list != null) {
            this.f396368b = list;
            if (hVar != null) {
                this.f396369c = hVar;
                return;
            }
            throw new NullPointerException("Null syncStatus");
        }
        throw new NullPointerException("Null footprints");
    }

    /* renamed from: a */
    public final C146801h mo123689a() {
        return this.f396369c;
    }

    /* renamed from: b */
    public final List mo123690b() {
        return this.f396368b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146817n) {
            C146817n nVar = (C146817n) obj;
            return this.f396368b.equals(nVar.mo123690b()) && this.f396369c.equals(nVar.mo123689a());
        }
    }

    public final int hashCode() {
        return ((this.f396368b.hashCode() ^ 1000003) * 1000003) ^ this.f396369c.hashCode();
    }

    public final String toString() {
        String obj = this.f396368b.toString();
        String obj2 = this.f396369c.toString();
        return "CoreMdhFootprintsReadResult{footprints=" + obj + ", syncStatus=" + obj2 + "}";
    }
}
