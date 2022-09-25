package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b;

import com.google.android.apps.gsa.shared.p6968aa.C89060p;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.speech.p7139a.C90525q;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58833ax;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.z.e.a.b.c */
/* compiled from: PG */
public final class C118962c {
    /* renamed from: a */
    public static C90525q m197481a(C58833ax axVar) {
        C90525q qVar = null;
        if (axVar.mo56113h() && ((C89061q) axVar.mo56107c()).mo27435e().isDone()) {
            try {
                C90457d dVar = ((C89060p) C90877ak.m148472f(((C89061q) axVar.mo56107c()).mo27435e())).f241368f;
                if (dVar != null) {
                    qVar = new C90525q(dVar);
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        if (qVar != null) {
            return qVar;
        }
        return new C90525q();
    }
}
