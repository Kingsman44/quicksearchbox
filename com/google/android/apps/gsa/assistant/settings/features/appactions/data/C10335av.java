package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.av */
/* compiled from: PG */
final class C10335av extends C10339az {

    /* renamed from: a */
    private final C49838aw f35014a;

    /* renamed from: b */
    private final C58485gu f35015b;

    /* renamed from: c */
    private final C58485gu f35016c;

    /* renamed from: d */
    private final int f35017d;

    public C10335av(C49838aw awVar, C58485gu guVar, C58485gu guVar2, int i) {
        if (awVar != null) {
            this.f35014a = awVar;
            if (guVar != null) {
                this.f35015b = guVar;
                if (guVar2 != null) {
                    this.f35016c = guVar2;
                    this.f35017d = i;
                    return;
                }
                throw new NullPointerException("Null educationUiList");
            }
            throw new NullPointerException("Null shortcutEntryList");
        }
        throw new NullPointerException("Null applicationInfo");
    }

    /* renamed from: a */
    public final int mo18431a() {
        return this.f35017d;
    }

    /* renamed from: b */
    public final C49838aw mo18432b() {
        return this.f35014a;
    }

    /* renamed from: c */
    public final C58485gu mo18433c() {
        return this.f35016c;
    }

    /* renamed from: d */
    public final C58485gu mo18434d() {
        return this.f35015b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10339az) {
            C10339az azVar = (C10339az) obj;
            return this.f35014a.equals(azVar.mo18432b()) && C58597ky.m90218i(this.f35015b, azVar.mo18434d()) && C58597ky.m90218i(this.f35016c, azVar.mo18433c()) && this.f35017d == azVar.mo18431a();
        }
    }

    public final int hashCode() {
        return ((((((this.f35014a.hashCode() ^ 1000003) * 1000003) ^ this.f35015b.hashCode()) * 1000003) ^ this.f35016c.hashCode()) * 1000003) ^ this.f35017d;
    }

    public final String toString() {
        String obj = this.f35014a.toString();
        String obj2 = this.f35015b.toString();
        String obj3 = this.f35016c.toString();
        int i = this.f35017d;
        return "AppSpecificPageData{applicationInfo=" + obj + ", shortcutEntryList=" + obj2 + ", educationUiList=" + obj3 + ", responseStatus=" + i + "}";
    }
}
