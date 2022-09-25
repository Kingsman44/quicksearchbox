package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dd */
/* compiled from: PG */
final class C94252dd implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f263371a;

    /* renamed from: b */
    final /* synthetic */ C83923j f263372b;

    /* renamed from: c */
    final /* synthetic */ C94256dh f263373c;

    public C94252dd(C94256dh dhVar, List list, C83923j jVar) {
        this.f263373c = dhVar;
        this.f263371a = list;
        this.f263372b = jVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        for (C60870cx f : this.f263371a) {
            try {
                C90877ak.m148472f(f);
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56382g(e)).mo56372aa(14289)).mo56386p("Exception during parsing!");
                return false;
            }
        }
        for (C83917d dVar : this.f263372b.f228573b) {
            String str = dVar.f228555b;
            if (!this.f263373c.f263407v.containsKey(str)) {
                return false;
            }
            if (!((Boolean) this.f263373c.f263407v.get(str)).booleanValue()) {
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14288)).mo56386p("verify account linked failed.");
                return false;
            }
        }
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14286)).mo56386p("Verify account linked succeed.");
        return true;
    }
}
