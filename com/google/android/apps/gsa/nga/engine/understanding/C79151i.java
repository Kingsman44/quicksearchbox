package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.ax.c.g;
import com.google.android.apps.gsa.nga.engine.ax.c.s;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77388am;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.i */
/* compiled from: PG */
final class C79151i extends C78994au {

    /* renamed from: a */
    private final s f217566a;

    /* renamed from: b */
    private final C78977ad f217567b;

    /* renamed from: c */
    private final C77388am f217568c;

    /* renamed from: d */
    private final C77402o f217569d;

    /* renamed from: e */
    private final C79004ba f217570e;

    /* renamed from: f */
    private final g f217571f;

    public C79151i(s sVar, C78977ad adVar, C77388am amVar, C77402o oVar, C79004ba baVar, g gVar) {
        this.f217566a = sVar;
        this.f217567b = adVar;
        this.f217568c = amVar;
        this.f217569d = oVar;
        this.f217570e = baVar;
        this.f217571f = gVar;
    }

    /* renamed from: a */
    public final C77402o mo73753a() {
        return this.f217569d;
    }

    /* renamed from: b */
    public final C77388am mo73754b() {
        return this.f217568c;
    }

    /* renamed from: c */
    public final C78977ad mo73755c() {
        return this.f217567b;
    }

    /* renamed from: d */
    public final C79004ba mo73756d() {
        return this.f217570e;
    }

    /* renamed from: e */
    public final g mo73757e() {
        return this.f217571f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78994au) {
            C78994au auVar = (C78994au) obj;
            return this.f217566a.equals(auVar.mo73758f()) && this.f217567b.equals(auVar.mo73755c()) && this.f217568c.equals(auVar.mo73754b()) && this.f217569d.equals(auVar.mo73753a()) && this.f217570e.equals(auVar.mo73756d()) && this.f217571f.equals(auVar.mo73757e());
        }
    }

    /* renamed from: f */
    public final s mo73758f() {
        return this.f217566a;
    }

    public final int hashCode() {
        return ((((((((((this.f217566a.hashCode() ^ 1000003) * 1000003) ^ this.f217567b.hashCode()) * 1000003) ^ this.f217568c.hashCode()) * 1000003) ^ this.f217569d.hashCode()) * 1000003) ^ this.f217570e.hashCode()) * 1000003) ^ this.f217571f.hashCode();
    }

    public final String toString() {
        String obj = this.f217566a.toString();
        String obj2 = this.f217567b.toString();
        String obj3 = this.f217568c.toString();
        String obj4 = this.f217569d.toString();
        String obj5 = this.f217570e.toString();
        String obj6 = this.f217571f.toString();
        return "UnderstandingResult{understandingResults=" + obj + ", priorityRunner=" + obj2 + ", scorer=" + obj3 + ", featureExtractor=" + obj4 + ", understandingStreamzEventsBuilder=" + obj5 + ", hypothesesSource=" + obj6 + "}";
    }
}
