package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import com.google.android.libraries.p1963i.p1964a.C23820c;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50582d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.s */
/* compiled from: PG */
public final class C132105s implements C132095i {

    /* renamed from: a */
    public static final C58974d f360495a = C58974d.m91136j();

    /* renamed from: b */
    public final C42850e f360496b;

    /* renamed from: c */
    public final C42813k f360497c;

    /* renamed from: d */
    public final Executor f360498d;

    public C132105s(C42850e eVar, C42813k kVar, Executor executor) {
        this.f360496b = eVar;
        this.f360497c = kVar;
        this.f360498d = executor;
    }

    /* renamed from: a */
    public final boolean mo110406a(C50582d[] dVarArr, int i) {
        try {
            C23820c.m44350a(this.f360496b.mo45938b(new C132096j(i, dVarArr)));
            return true;
        } catch (InterruptedException | ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f360495a.mo56225c()).mo56382g(e)).mo56372aa(39787)).mo56386p("Error writing deeplink database");
            return false;
        }
    }
}
