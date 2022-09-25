package com.google.android.apps.gsa.reminders;

import com.google.android.apps.gsa.sidekick.shared.util.C91954ae;
import com.google.android.libraries.p11024al.p11025a.C147756l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7944pt;
import com.google.p375ai.p378b.C7947pw;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.reminders.f */
/* compiled from: PG */
final class C84259f extends C91954ae {

    /* renamed from: a */
    private final Collection f229308a;

    /* renamed from: b */
    private final Collection f229309b;

    public C84259f(Collection collection, Collection collection2) {
        this.f229308a = collection;
        this.f229309b = collection2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77745a(C7718hj hjVar) {
        C58833ax axVar;
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a == C7746ik.REMINDER && (hjVar.f26955a & 32768) != 0) {
            C7947pw pwVar = hjVar.f26979t;
            if (pwVar == null) {
                pwVar = C7947pw.f27896j;
            }
            C7944pt ptVar = pwVar.f27905h;
            if (ptVar == null) {
                ptVar = C7944pt.f27891b;
            }
            if (!ptVar.f27893a.isEmpty()) {
                axVar = C58833ax.m90834k(C147756l.m240821c(ptVar.f27893a));
            } else {
                axVar = C58836b.f156633a;
            }
            if (this.f229308a.contains(pwVar.f27899b) || (axVar.mo56113h() && this.f229308a.contains(axVar.mo56107c()))) {
                this.f229309b.add(hjVar);
            }
        }
    }
}
