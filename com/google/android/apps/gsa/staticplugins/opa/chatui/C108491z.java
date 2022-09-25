package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.z */
/* compiled from: PG */
final class C108491z extends C108323el {

    /* renamed from: a */
    private final String f301876a;

    /* renamed from: b */
    private final C90735as f301877b;

    /* renamed from: c */
    private final Boolean f301878c;

    /* renamed from: d */
    private final C58833ax f301879d;

    /* renamed from: e */
    private final C58833ax f301880e;

    public C108491z(String str, C90735as asVar, Boolean bool, C58833ax axVar, C58833ax axVar2) {
        this.f301876a = str;
        this.f301877b = asVar;
        this.f301878c = bool;
        this.f301879d = axVar;
        this.f301880e = axVar2;
    }

    /* renamed from: a */
    public final C90735as mo96690a() {
        return this.f301877b;
    }

    /* renamed from: b */
    public final C58833ax mo96691b() {
        return this.f301880e;
    }

    /* renamed from: c */
    public final C58833ax mo96692c() {
        return this.f301879d;
    }

    /* renamed from: d */
    public final Boolean mo96693d() {
        return this.f301878c;
    }

    /* renamed from: e */
    public final Boolean mo96694e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C108323el) {
            C108323el elVar = (C108323el) obj;
            String str = this.f301876a;
            if (str != null ? str.equals(elVar.mo96696i()) : elVar.mo96696i() == null) {
                C90735as asVar = this.f301877b;
                if (asVar != null ? asVar.equals(elVar.mo96690a()) : elVar.mo96690a() == null) {
                    Boolean bool = this.f301878c;
                    if (bool != null ? bool.equals(elVar.mo96693d()) : elVar.mo96693d() == null) {
                        return elVar.mo96694e() == null && elVar.mo96695f() == null && this.f301879d.equals(elVar.mo96692c()) && this.f301880e.equals(elVar.mo96691b());
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final Boolean mo96695f() {
        return null;
    }

    /* renamed from: i */
    public final String mo96696i() {
        return this.f301876a;
    }

    public final String toString() {
        String str = this.f301876a;
        String valueOf = String.valueOf(this.f301877b);
        Boolean bool = this.f301878c;
        String valueOf2 = String.valueOf(this.f301879d);
        String valueOf3 = String.valueOf(this.f301880e);
        return "SingleClickData{query=" + str + ", range=" + valueOf + ", editHintShown=" + bool + ", userQueryHighlighted=null, userQueryInvisible=null, queryAlternatives=" + valueOf2 + ", highlightUserQueryArgs=" + valueOf3 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f301876a;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        C90735as asVar = this.f301877b;
        if (asVar == null) {
            i2 = 0;
        } else {
            i2 = asVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Boolean bool = this.f301878c;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return ((((i5 ^ i3) * 583896283) ^ this.f301879d.hashCode()) * 1000003) ^ this.f301880e.hashCode();
    }
}
