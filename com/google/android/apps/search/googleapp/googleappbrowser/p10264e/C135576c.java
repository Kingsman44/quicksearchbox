package com.google.android.apps.search.googleapp.googleappbrowser.p10264e;

import com.google.android.apps.search.googleapp.googleappbrowser.p10263d.C135569b;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.libraries.web.contrib.logging.C43712o;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.e.c */
/* compiled from: PG */
public final class C135576c implements C43712o {

    /* renamed from: a */
    private final C135574b f369298a;

    /* renamed from: b */
    private final boolean f369299b;

    public C135576c(C135574b bVar, boolean z) {
        this.f369298a = bVar;
        this.f369299b = z;
    }

    /* renamed from: a */
    public final C43713p mo32339a(C43367l lVar) {
        Object obj;
        if (this.f369299b) {
            return this.f369298a.mo112391a(lVar);
        }
        C43366k kVar = C43366k.UNSPECIFIED;
        C43366k a = C43366k.m76517a(lVar.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        int ordinal = a.ordinal();
        if ((ordinal == 0 || ordinal == 1 || ordinal == 2) && (lVar.f113295a & 16) != 0) {
            C43323b bVar = lVar.f113300f;
            if (bVar == null) {
                bVar = C43323b.f113174a;
            }
            C62940bt r2 = C62942bv.checkIsLite(C135569b.f369276g);
            bVar.mo58887l(r2);
            if (bVar.f169962ag.mo58857o(r2.f169971d)) {
                C43323b bVar2 = lVar.f113300f;
                if (bVar2 == null) {
                    bVar2 = C43323b.f113174a;
                }
                C62940bt r22 = C62942bv.checkIsLite(C135569b.f369276g);
                bVar2.mo58887l(r22);
                Object l = bVar2.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                C135569b bVar3 = (C135569b) obj;
                if ((bVar3.f369278a & 4) != 0) {
                    C139789b bVar4 = bVar3.f369281d;
                    if (bVar4 == null) {
                        bVar4 = C139789b.f379928d;
                    }
                    if (bVar4.f379932c) {
                        return this.f369298a.mo112391a(lVar);
                    }
                }
            }
        }
        return null;
    }
}
