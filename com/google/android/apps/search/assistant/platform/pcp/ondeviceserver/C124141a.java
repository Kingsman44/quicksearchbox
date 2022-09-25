package com.google.android.apps.search.assistant.platform.pcp.ondeviceserver;

import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58528ij;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.ondeviceserver.a */
/* compiled from: PG */
public final /* synthetic */ class C124141a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C53306j f342833a;

    /* renamed from: b */
    public final /* synthetic */ List f342834b;

    /* renamed from: c */
    public final /* synthetic */ boolean f342835c;

    public /* synthetic */ C124141a(C53306j jVar, List list, boolean z) {
        this.f342833a = jVar;
        this.f342834b = list;
        this.f342835c = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53306j jVar = this.f342833a;
        List list = this.f342834b;
        return ((C123587c) obj).mo106042b(jVar, C58528ij.m90006F(list), this.f342835c, C123755bv.f341837o);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
