package com.google.android.libraries.home.coreui.devicetile.model;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.model.aa */
/* compiled from: PG */
public final class C23726aa extends C23739n {

    /* renamed from: a */
    public final String f64903a;

    /* renamed from: b */
    public final C23751z f64904b;

    /* renamed from: c */
    public final Integer f64905c = null;

    /* renamed from: d */
    private final C23730e f64906d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23726aa(String str, C23751z zVar, C23730e eVar) {
        super(str);
        C69664n.m101061g(str, "templateId");
        C69664n.m101061g(zVar, "actionType");
        this.f64903a = str;
        this.f64904b = zVar;
        this.f64906d = eVar;
    }

    /* renamed from: a */
    public final String mo29075a() {
        return this.f64903a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23726aa)) {
            return false;
        }
        C23726aa aaVar = (C23726aa) obj;
        if (!C69664n.m101066l(this.f64903a, aaVar.f64903a) || this.f64904b != aaVar.f64904b) {
            return false;
        }
        Integer num = aaVar.f64905c;
        return C69664n.m101066l((Object) null, (Object) null) && C69664n.m101066l(this.f64906d, aaVar.f64906d);
    }

    public final int hashCode() {
        int hashCode = ((this.f64903a.hashCode() * 31) + this.f64904b.hashCode()) * 961;
        C23730e eVar = this.f64906d;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        String str = this.f64903a;
        C23751z zVar = this.f64904b;
        C23730e eVar = this.f64906d;
        return "StepChangeAction(templateId=" + str + ", actionType=" + zVar + ", newMode=null, challengeValue=" + eVar + ")";
    }
}
