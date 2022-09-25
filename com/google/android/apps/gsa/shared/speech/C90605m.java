package com.google.android.apps.gsa.shared.speech;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;
import com.google.speech.p5224k.p5225a.C67193ak;
import com.google.speech.p5224k.p5225a.C67194al;

/* renamed from: com.google.android.apps.gsa.shared.speech.m */
/* compiled from: PG */
public final class C90605m {

    /* renamed from: a */
    private C63088z f253276a = C63088z.f170246b;

    /* renamed from: b */
    private final C58480gp f253277b = C58485gu.m89837e();

    /* renamed from: c */
    private boolean f253278c = false;

    /* renamed from: d */
    private String f253279d = BuildConfig.FLAVOR;

    /* renamed from: a */
    public final C90606n mo84745a() {
        C58833ax axVar;
        C63088z zVar = this.f253276a;
        if (this.f253278c) {
            axVar = C58833ax.m90834k(this.f253277b.mo55394f());
        } else {
            axVar = C58836b.f156633a;
        }
        return new C90530b(zVar, axVar);
    }

    /* renamed from: b */
    public final void mo84746b(C63088z zVar) {
        this.f253276a = this.f253276a.mo59177x(zVar);
    }

    /* renamed from: c */
    public final void mo84747c(C67194al alVar) {
        C67193ak akVar = alVar.f182646b;
        if (akVar == null) {
            akVar = C67193ak.f182639c;
        }
        if ((akVar.f182641a & 8) != 0) {
            String str = this.f253279d;
            C67193ak akVar2 = alVar.f182646b;
            if (akVar2 == null) {
                akVar2 = C67193ak.f182639c;
            }
            if (!str.equals(akVar2.f182642b)) {
                this.f253278c = true;
                this.f253277b.mo55395g(alVar);
                C67193ak akVar3 = alVar.f182646b;
                if (akVar3 == null) {
                    akVar3 = C67193ak.f182639c;
                }
                this.f253279d = akVar3.f182642b;
            }
        }
    }
}
