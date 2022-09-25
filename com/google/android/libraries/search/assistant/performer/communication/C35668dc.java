package com.google.android.libraries.search.assistant.performer.communication;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dc */
/* compiled from: PG */
public abstract class C35668dc {
    /* renamed from: e */
    public static C35667db m64073e() {
        C35763i iVar = new C35763i();
        iVar.f93693b = BuildConfig.FLAVOR;
        iVar.f93692a = BuildConfig.FLAVOR;
        iVar.mo39786b(C58485gu.m89845m());
        iVar.mo39788d(C58485gu.m89845m());
        return iVar;
    }

    /* renamed from: a */
    public abstract C58485gu mo39791a();

    /* renamed from: b */
    public abstract C58485gu mo39792b();

    /* renamed from: c */
    public abstract String mo39793c();

    /* renamed from: d */
    public abstract String mo39794d();

    /* renamed from: f */
    public final boolean mo39795f() {
        return !mo39791a().isEmpty();
    }
}
