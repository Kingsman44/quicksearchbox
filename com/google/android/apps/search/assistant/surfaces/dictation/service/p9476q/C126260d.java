package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.d */
/* compiled from: PG */
public final /* synthetic */ class C126260d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C126264h f347904a;

    /* renamed from: b */
    public final /* synthetic */ C89885b f347905b;

    /* renamed from: c */
    public final /* synthetic */ String f347906c;

    /* renamed from: d */
    public final /* synthetic */ Object[] f347907d;

    public /* synthetic */ C126260d(C126264h hVar, C89885b bVar, String str, Object[] objArr) {
        this.f347904a = hVar;
        this.f347905b = bVar;
        this.f347906c = str;
        this.f347907d = objArr;
    }

    public final void accept(Object obj) {
        C126264h hVar = this.f347904a;
        C89885b bVar = this.f347905b;
        String str = this.f347906c;
        Object[] objArr = this.f347907d;
        Throwable th = (Throwable) obj;
        C59052c cVar = (C59052c) C126264h.f347912a.mo56225c();
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(bVar.f246280a));
        ((C59052c) ((C59052c) cVar.mo56382g(th)).mo56372aa(36882)).mo56368U(str, objArr);
        hVar.f347918g.mo107496b(th);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
