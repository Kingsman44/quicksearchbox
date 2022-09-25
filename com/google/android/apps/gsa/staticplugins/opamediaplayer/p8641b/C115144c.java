package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.b.c */
/* compiled from: PG */
final class C115144c extends C115153l {

    /* renamed from: a */
    private final C58833ax f319560a;

    /* renamed from: b */
    private final C58833ax f319561b;

    /* renamed from: c */
    private final C58833ax f319562c;

    /* renamed from: d */
    private final C58833ax f319563d;

    /* renamed from: e */
    private final C58833ax f319564e;

    /* renamed from: f */
    private final int f319565f;

    public C115144c(int i, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5) {
        this.f319565f = i;
        this.f319560a = axVar;
        this.f319561b = axVar2;
        this.f319562c = axVar3;
        this.f319563d = axVar4;
        this.f319564e = axVar5;
    }

    /* renamed from: a */
    public final C58833ax mo101848a() {
        return this.f319564e;
    }

    /* renamed from: b */
    public final C58833ax mo101849b() {
        return this.f319562c;
    }

    /* renamed from: c */
    public final C58833ax mo101850c() {
        return this.f319563d;
    }

    /* renamed from: d */
    public final C58833ax mo101851d() {
        return this.f319560a;
    }

    /* renamed from: e */
    public final C58833ax mo101852e() {
        return this.f319561b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C115153l) {
            C115153l lVar = (C115153l) obj;
            return this.f319565f == lVar.mo101854f() && this.f319560a.equals(lVar.mo101851d()) && this.f319561b.equals(lVar.mo101852e()) && this.f319562c.equals(lVar.mo101849b()) && this.f319563d.equals(lVar.mo101850c()) && this.f319564e.equals(lVar.mo101848a());
        }
    }

    /* renamed from: f */
    public final int mo101854f() {
        return this.f319565f;
    }

    public final int hashCode() {
        return ((((((((((this.f319565f ^ 1000003) * 1000003) ^ this.f319560a.hashCode()) * 1000003) ^ this.f319561b.hashCode()) * 1000003) ^ this.f319562c.hashCode()) * 1000003) ^ this.f319563d.hashCode()) * 1000003) ^ this.f319564e.hashCode();
    }

    public final String toString() {
        int i = this.f319565f;
        String valueOf = String.valueOf(this.f319560a);
        String valueOf2 = String.valueOf(this.f319561b);
        String valueOf3 = String.valueOf(this.f319562c);
        String valueOf4 = String.valueOf(this.f319563d);
        String valueOf5 = String.valueOf(this.f319564e);
        return "EventData{eventType=" + C115154m.m190856a(i) + ", playbackState=" + valueOf + ", skipMediaId=" + valueOf2 + ", playbackAction=" + valueOf3 + ", playbackActionData=" + valueOf4 + ", mediaSessionId=" + valueOf5 + "}";
    }
}
