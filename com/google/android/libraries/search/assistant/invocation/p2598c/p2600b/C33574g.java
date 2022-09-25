package com.google.android.libraries.search.assistant.invocation.p2598c.p2600b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71816z;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.libraries.search.assistant.invocation.c.b.g */
/* compiled from: PG */
public final class C33574g {

    /* renamed from: a */
    public static final C59071e f89756a = C59071e.m91331h();

    /* renamed from: b */
    public final Object f89757b = new Object();

    /* renamed from: c */
    public C33568a f89758c;

    /* renamed from: d */
    public C71816z f89759d = new C71816z();

    /* renamed from: a */
    public final void mo38990a(String str, C69626l lVar) {
        C33568a aVar;
        synchronized (this.f89757b) {
            aVar = this.f89758c;
        }
        if (aVar == null) {
            C59052c cVar = (C59052c) f89756a.mo56224b();
            cVar.mo56379ah(new C59094n(51227));
            cVar.mo56389s("Listener was null, %s is not propagated", str);
            return;
        }
        lVar.mo5761a(aVar);
    }
}
