package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35628au;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.C51809dy;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.a */
/* compiled from: PG */
final class C13375a extends C13394f {

    /* renamed from: a */
    public final C35606g f41131a;

    /* renamed from: b */
    public final C51809dy f41132b;

    /* renamed from: c */
    public final String f41133c;

    /* renamed from: d */
    public final C35628au f41134d;

    /* renamed from: e */
    public final C15481g f41135e;

    public C13375a(C35606g gVar, C51809dy dyVar, String str, C35628au auVar, C15481g gVar2) {
        this.f41131a = gVar;
        this.f41132b = dyVar;
        this.f41133c = str;
        this.f41134d = auVar;
        this.f41135e = gVar2;
    }

    /* renamed from: a */
    public final C15481g mo21053a() {
        return this.f41135e;
    }

    /* renamed from: b */
    public final C35628au mo21054b() {
        return this.f41134d;
    }

    /* renamed from: c */
    public final C35606g mo21055c() {
        return this.f41131a;
    }

    /* renamed from: d */
    public final C51809dy mo21056d() {
        return this.f41132b;
    }

    /* renamed from: e */
    public final String mo21057e() {
        return this.f41133c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13394f) {
            C13394f fVar = (C13394f) obj;
            return this.f41131a.equals(fVar.mo21055c()) && this.f41132b.equals(fVar.mo21056d()) && this.f41133c.equals(fVar.mo21057e()) && this.f41134d.equals(fVar.mo21054b()) && this.f41135e.equals(fVar.mo21053a());
        }
    }

    public final int hashCode() {
        return ((((((((this.f41131a.hashCode() ^ 1000003) * 1000003) ^ this.f41132b.hashCode()) * 1000003) ^ this.f41133c.hashCode()) * 1000003) ^ this.f41134d.hashCode()) * 1000003) ^ this.f41135e.hashCode();
    }

    public final String toString() {
        String obj = this.f41131a.toString();
        String obj2 = this.f41132b.toString();
        String str = this.f41133c;
        String obj3 = this.f41134d.toString();
        String obj4 = this.f41135e.toString();
        return "NotificationAnnounceConfig{messageSnapshotCache=" + obj + ", clientOp=" + obj2 + ", locale=" + str + ", ttsPlayer=" + obj3 + ", appFlowLogger=" + obj4 + "}";
    }
}
