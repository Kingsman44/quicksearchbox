package com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.TimeoutException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.a.i */
/* compiled from: PG */
final class C128552i implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ Object f353483a;

    /* renamed from: b */
    final /* synthetic */ Object f353484b;

    public C128552i(Object obj, Object obj2) {
        this.f353483a = obj;
        this.f353484b = obj2;
    }

    public final /* synthetic */ Object apply(Object obj) {
        C69664n.m101061g((TimeoutException) obj, "it");
        C59052c cVar = (C59052c) C128555l.f353489b.mo56226d();
        Object obj2 = this.f353483a;
        cVar.mo56379ah(new C59094n(37875));
        cVar.mo56389s("Execution timed out because no result was returned. EventData:\n%s", obj2);
        return this.f353484b;
    }
}
