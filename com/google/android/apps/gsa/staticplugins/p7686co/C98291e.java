package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p375ai.p378b.C7957qf;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.e */
/* compiled from: PG */
final class C98291e extends C98149ae {

    /* renamed from: a */
    public final String f274392a;

    /* renamed from: b */
    public final C7957qf f274393b;

    /* renamed from: c */
    public final C58485gu f274394c;

    /* renamed from: d */
    public final C98484x f274395d;

    public C98291e(String str, C7957qf qfVar, C58485gu guVar, C98484x xVar) {
        this.f274392a = str;
        this.f274393b = qfVar;
        if (guVar != null) {
            this.f274394c = guVar;
            if (xVar != null) {
                this.f274395d = xVar;
                return;
            }
            throw new NullPointerException("Null appOpenRefreshCondition");
        }
        throw new NullPointerException("Null fenceRegistrations");
    }

    /* renamed from: a */
    public final C98484x mo90993a() {
        return this.f274395d;
    }

    /* renamed from: b */
    public final C58485gu mo90994b() {
        return this.f274394c;
    }

    /* renamed from: c */
    public final C7957qf mo90995c() {
        return this.f274393b;
    }

    /* renamed from: d */
    public final String mo90996d() {
        return this.f274392a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98149ae) {
            C98149ae aeVar = (C98149ae) obj;
            String str = this.f274392a;
            if (str != null ? str.equals(aeVar.mo90996d()) : aeVar.mo90996d() == null) {
                C7957qf qfVar = this.f274393b;
                if (qfVar != null ? qfVar.equals(aeVar.mo90995c()) : aeVar.mo90995c() == null) {
                    return C58597ky.m90218i(this.f274394c, aeVar.mo90994b()) && this.f274395d.equals(aeVar.mo90993a());
                }
            }
        }
    }

    public final String toString() {
        String str = this.f274392a;
        String valueOf = String.valueOf(this.f274393b);
        String obj = this.f274394c.toString();
        String obj2 = this.f274395d.toString();
        return "RequestScheduleEvaluatorData{requestScheduleAccountName=" + str + ", requestSchedule=" + valueOf + ", fenceRegistrations=" + obj + ", appOpenRefreshCondition=" + obj2 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f274392a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C7957qf qfVar = this.f274393b;
        if (qfVar != null) {
            i2 = qfVar.hashCode();
        }
        return ((((i3 ^ i2) * 1000003) ^ this.f274394c.hashCode()) * 1000003) ^ this.f274395d.hashCode();
    }
}
