package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ar */
/* compiled from: PG */
public final class C114987ar extends C114978ai {

    /* renamed from: a */
    private final C58833ax f319142a;

    /* renamed from: b */
    private final C58833ax f319143b;

    /* renamed from: c */
    private final C58833ax f319144c;

    /* renamed from: d */
    private final C58833ax f319145d;

    public C114987ar(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f319142a = axVar;
        this.f319143b = axVar2;
        this.f319144c = axVar3;
        this.f319145d = axVar4;
    }

    /* renamed from: a */
    public final C58833ax mo101774a() {
        return this.f319142a;
    }

    /* renamed from: c */
    public final C58833ax mo101775c() {
        return this.f319143b;
    }

    /* renamed from: d */
    public final C58833ax mo101776d() {
        return this.f319144c;
    }

    /* renamed from: e */
    public final C58833ax mo101777e() {
        return this.f319145d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C114978ai) {
            C114978ai aiVar = (C114978ai) obj;
            return this.f319142a.equals(aiVar.mo101774a()) && this.f319143b.equals(aiVar.mo101775c()) && this.f319144c.equals(aiVar.mo101776d()) && this.f319145d.equals(aiVar.mo101777e());
        }
    }

    public final int hashCode() {
        return ((((((this.f319142a.hashCode() ^ 1000003) * 1000003) ^ this.f319143b.hashCode()) * 1000003) ^ this.f319144c.hashCode()) * 1000003) ^ this.f319145d.hashCode();
    }

    public final String toString() {
        String obj = this.f319142a.toString();
        String obj2 = this.f319143b.toString();
        String obj3 = this.f319144c.toString();
        String obj4 = this.f319145d.toString();
        return "AmbientSummarySectionData{agendaData=" + obj + ", commuteData=" + obj2 + ", missedCallData=" + obj3 + ", unreadMessageData=" + obj4 + "}";
    }
}
