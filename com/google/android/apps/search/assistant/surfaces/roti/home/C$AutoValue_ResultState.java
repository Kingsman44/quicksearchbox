package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Intent;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.$AutoValue_ResultState  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_ResultState extends ResultState {

    /* renamed from: a */
    public final Intent f349083a;

    /* renamed from: b */
    public final Intent f349084b;

    /* renamed from: c */
    public final String f349085c;

    public C$AutoValue_ResultState(Intent intent, Intent intent2, String str) {
        if (intent != null) {
            this.f349083a = intent;
            if (intent2 != null) {
                this.f349084b = intent2;
                if (str != null) {
                    this.f349085c = str;
                    return;
                }
                throw new NullPointerException("Null showText");
            }
            throw new NullPointerException("Null externalIntent");
        }
        throw new NullPointerException("Null activityResult");
    }

    /* renamed from: a */
    public final Intent mo107753a() {
        return this.f349083a;
    }

    /* renamed from: b */
    public final Intent mo107754b() {
        return this.f349084b;
    }

    /* renamed from: c */
    public final String mo107755c() {
        return this.f349085c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResultState) {
            ResultState resultState = (ResultState) obj;
            return this.f349083a.equals(resultState.mo107753a()) && this.f349084b.equals(resultState.mo107754b()) && this.f349085c.equals(resultState.mo107755c());
        }
    }

    public final int hashCode() {
        return ((((this.f349083a.hashCode() ^ 1000003) * 1000003) ^ this.f349084b.hashCode()) * 1000003) ^ this.f349085c.hashCode();
    }

    public final String toString() {
        String obj = this.f349083a.toString();
        String obj2 = this.f349084b.toString();
        String str = this.f349085c;
        return "ResultState{activityResult=" + obj + ", externalIntent=" + obj2 + ", showText=" + str + "}";
    }
}
