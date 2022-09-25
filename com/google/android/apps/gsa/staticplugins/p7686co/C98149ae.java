package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7957qf;
import com.google.p4184bj.p4189b.C55893j;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.ae */
/* compiled from: PG */
abstract class C98149ae {
    /* renamed from: a */
    public abstract C98484x mo90993a();

    /* renamed from: b */
    public abstract C58485gu mo90994b();

    /* renamed from: c */
    public abstract C7957qf mo90995c();

    /* renamed from: d */
    public abstract String mo90996d();

    /* renamed from: e */
    public final C98485y mo90997e() {
        C98485y yVar = new C98485y(mo90994b().size());
        C58485gu b = mo90994b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C98474n nVar = (C98474n) b.get(i);
            C55893j jVar = nVar.f274970b;
            if (jVar == null) {
                jVar = C55893j.f148728h;
            }
            yVar.put(jVar, nVar);
        }
        return yVar;
    }
}
