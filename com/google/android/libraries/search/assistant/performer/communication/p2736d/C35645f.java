package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.C51809dy;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.f */
/* compiled from: PG */
final class C35645f extends C35615ah {

    /* renamed from: a */
    private final C35606g f93513a;

    /* renamed from: b */
    private final C51809dy f93514b;

    /* renamed from: c */
    private final String f93515c;

    /* renamed from: d */
    private final C35628au f93516d;

    /* renamed from: e */
    private final Boolean f93517e;

    /* renamed from: f */
    private final C35617aj f93518f;

    public C35645f(C35606g gVar, C51809dy dyVar, String str, C35628au auVar, Boolean bool, C35617aj ajVar) {
        this.f93513a = gVar;
        this.f93514b = dyVar;
        this.f93515c = str;
        this.f93516d = auVar;
        this.f93517e = bool;
        this.f93518f = ajVar;
    }

    /* renamed from: a */
    public final C35617aj mo39744a() {
        return this.f93518f;
    }

    /* renamed from: b */
    public final C35628au mo39745b() {
        return this.f93516d;
    }

    /* renamed from: c */
    public final C35606g mo39746c() {
        return this.f93513a;
    }

    /* renamed from: d */
    public final C51809dy mo39747d() {
        return this.f93514b;
    }

    /* renamed from: e */
    public final Boolean mo39748e() {
        return this.f93517e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35615ah) {
            C35615ah ahVar = (C35615ah) obj;
            return this.f93513a.equals(ahVar.mo39746c()) && this.f93514b.equals(ahVar.mo39747d()) && this.f93515c.equals(ahVar.mo39749f()) && this.f93516d.equals(ahVar.mo39745b()) && this.f93517e.equals(ahVar.mo39748e()) && this.f93518f.equals(ahVar.mo39744a());
        }
    }

    /* renamed from: f */
    public final String mo39749f() {
        return this.f93515c;
    }

    public final int hashCode() {
        return ((((((((((this.f93513a.hashCode() ^ 1000003) * 1000003) ^ this.f93514b.hashCode()) * 1000003) ^ this.f93515c.hashCode()) * 1000003) ^ this.f93516d.hashCode()) * 1000003) ^ this.f93517e.hashCode()) * 1000003) ^ this.f93518f.hashCode();
    }

    public final String toString() {
        String obj = this.f93513a.toString();
        String obj2 = this.f93514b.toString();
        String str = this.f93515c;
        String obj3 = this.f93516d.toString();
        Boolean bool = this.f93517e;
        String obj4 = this.f93518f.toString();
        return "ReadConfig{messageSnapshotCache=" + obj + ", clientOp=" + obj2 + ", locale=" + str + ", ttsPlayer=" + obj3 + ", fallbackToOfflineIfOnlineFailed=" + bool + ", appFlowLogger=" + obj4 + "}";
    }
}
