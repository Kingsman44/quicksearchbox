package com.google.android.apps.search.googleapp.p10257g;

import android.net.Uri;
import com.google.common.p4552o.C60416pk;
import com.google.p337aa.p338a.C6610l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.ae */
/* compiled from: PG */
public final class C135414ae extends C135422am {

    /* renamed from: a */
    public final C6610l f368929a;

    /* renamed from: b */
    public final Uri f368930b;

    /* renamed from: c */
    public final Integer f368931c;

    /* renamed from: d */
    public final String f368932d;

    /* renamed from: e */
    public final C135412ac f368933e;

    /* renamed from: f */
    public final C60416pk f368934f;

    /* renamed from: g */
    public final C135413ad f368935g;

    /* renamed from: h */
    public final int f368936h;

    public C135414ae(C6610l lVar, Uri uri, Integer num, String str, C135412ac acVar, C60416pk pkVar, C135413ad adVar) {
        C69664n.m101061g(lVar, "doodleImage");
        C69664n.m101061g(uri, "uri");
        C69664n.m101061g(str, "altText");
        C69664n.m101061g(pkVar, "logData");
        this.f368929a = lVar;
        this.f368930b = uri;
        this.f368931c = num;
        this.f368932d = str;
        this.f368933e = acVar;
        this.f368934f = pkVar;
        this.f368935g = adVar;
        this.f368936h = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135414ae)) {
            return false;
        }
        C135414ae aeVar = (C135414ae) obj;
        return C69664n.m101066l(this.f368929a, aeVar.f368929a) && C69664n.m101066l(this.f368930b, aeVar.f368930b) && C69664n.m101066l(this.f368931c, aeVar.f368931c) && C69664n.m101066l(this.f368932d, aeVar.f368932d) && C69664n.m101066l(this.f368933e, aeVar.f368933e) && C69664n.m101066l(this.f368934f, aeVar.f368934f) && C69664n.m101066l(this.f368935g, aeVar.f368935g);
    }

    public final int hashCode() {
        int hashCode = ((this.f368929a.hashCode() * 31) + this.f368930b.hashCode()) * 31;
        Integer num = this.f368931c;
        int i = 0;
        int hashCode2 = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f368932d.hashCode()) * 31) + this.f368933e.hashCode()) * 31) + this.f368934f.hashCode()) * 31;
        C135413ad adVar = this.f368935g;
        if (adVar != null) {
            i = adVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        C6610l lVar = this.f368929a;
        Uri uri = this.f368930b;
        Integer num = this.f368931c;
        String str = this.f368932d;
        C135412ac acVar = this.f368933e;
        C60416pk pkVar = this.f368934f;
        C135413ad adVar = this.f368935g;
        return "DoodleState(doodleImage=" + lVar + ", uri=" + uri + ", backgroundColor=" + num + ", altText=" + str + ", clickTarget=" + acVar + ", logData=" + pkVar + ", shareButtonState=" + adVar + ")";
    }
}
