package com.google.android.libraries.gsa.conversation.p1852f;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.gsa.conversation.f.m */
/* compiled from: PG */
public final class C22586m {

    /* renamed from: a */
    public final C58480gp f62231a = C58485gu.m89837e();

    /* renamed from: b */
    public boolean f62232b = false;

    /* renamed from: c */
    public String f62233c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private C63088z f62234d = C63088z.f170246b;

    /* renamed from: a */
    public final C22587n mo27691a() {
        C58833ax axVar;
        C63088z zVar = this.f62234d;
        if (this.f62232b) {
            axVar = C58833ax.m90834k(this.f62231a.mo55394f());
        } else {
            axVar = C58836b.f156633a;
        }
        return new C22576c(zVar, axVar);
    }

    /* renamed from: b */
    public final void mo27692b(C63088z zVar) {
        this.f62234d = this.f62234d.mo59177x(zVar);
    }
}
