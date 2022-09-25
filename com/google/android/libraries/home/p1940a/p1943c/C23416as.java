package com.google.android.libraries.home.p1940a.p1943c;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.as */
/* compiled from: PG */
public final class C23416as {

    /* renamed from: a */
    public final String f63989a;

    /* renamed from: b */
    public final String f63990b;

    /* renamed from: c */
    public final C23419av f63991c;

    /* renamed from: d */
    public final C23553e f63992d;

    /* renamed from: e */
    public final C58528ij f63993e;

    /* renamed from: f */
    private final C23499c f63994f;

    /* renamed from: g */
    private final C58528ij f63995g;

    /* renamed from: h */
    private final Optional f63996h;

    /* renamed from: i */
    private final Optional f63997i;

    /* renamed from: j */
    private final C23410am f63998j;

    /* renamed from: k */
    private final Optional f63999k;

    public C23416as(String str, String str2, C23419av avVar, C23499c cVar, C58528ij ijVar, Optional optional, Optional optional2, C23553e eVar, C58528ij ijVar2, C23410am amVar, Optional optional3) {
        C69664n.m101061g(str, "id");
        C69664n.m101061g(str2, "name");
        C69664n.m101061g(avVar, "type");
        C69664n.m101061g(ijVar, "otherAgentsInfo");
        C69664n.m101061g(optional, "room");
        C69664n.m101061g(optional2, "homeId");
        C69664n.m101061g(ijVar2, "traitTypes");
        C69664n.m101061g(optional3, "chipId");
        this.f63989a = str;
        this.f63990b = str2;
        this.f63991c = avVar;
        this.f63994f = cVar;
        this.f63995g = ijVar;
        this.f63996h = optional;
        this.f63997i = optional2;
        this.f63992d = eVar;
        this.f63993e = ijVar2;
        this.f63998j = amVar;
        this.f63999k = optional3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23416as)) {
            return false;
        }
        C23416as asVar = (C23416as) obj;
        return C69664n.m101066l(this.f63989a, asVar.f63989a) && C69664n.m101066l(this.f63990b, asVar.f63990b) && this.f63991c == asVar.f63991c && C69664n.m101066l(this.f63994f, asVar.f63994f) && C69664n.m101066l(this.f63995g, asVar.f63995g) && C69664n.m101066l(this.f63996h, asVar.f63996h) && C69664n.m101066l(this.f63997i, asVar.f63997i) && C69664n.m101066l(this.f63992d, asVar.f63992d) && C69664n.m101066l(this.f63993e, asVar.f63993e) && C69664n.m101066l(this.f63998j, asVar.f63998j) && C69664n.m101066l(this.f63999k, asVar.f63999k);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.f63989a.hashCode() * 31) + this.f63990b.hashCode()) * 31) + this.f63991c.hashCode()) * 31) + this.f63994f.hashCode()) * 31) + ((C58733pz) this.f63995g).f156499d) * 31) + this.f63996h.hashCode()) * 31) + this.f63997i.hashCode()) * 31) + this.f63992d.f64463a.hashCode()) * 31) + this.f63993e.hashCode()) * 31) + this.f63998j.hashCode()) * 31) + this.f63999k.hashCode();
    }

    public final String toString() {
        String str = this.f63989a;
        String str2 = this.f63990b;
        C23419av avVar = this.f63991c;
        C23499c cVar = this.f63994f;
        C58528ij ijVar = this.f63995g;
        Optional optional = this.f63996h;
        Optional optional2 = this.f63997i;
        C23553e eVar = this.f63992d;
        C58528ij ijVar2 = this.f63993e;
        C23410am amVar = this.f63998j;
        Optional optional3 = this.f63999k;
        return "HomeAutomationDeviceStateless(id=" + str + ", name=" + str2 + ", type=" + avVar + ", agentInfo=" + cVar + ", otherAgentsInfo=" + ijVar + ", room=" + optional + ", homeId=" + optional2 + ", attributes=" + eVar + ", traitTypes=" + ijVar2 + ", deviceInfo=" + amVar + ", chipId=" + optional3 + ")";
    }
}
