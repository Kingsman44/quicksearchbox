package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.apps.search.assistant.verticals.p9880a.p9887d.C130358c;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C121582bi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C121584bk f337350a;

    /* renamed from: b */
    public final /* synthetic */ boolean f337351b;

    /* renamed from: c */
    public final /* synthetic */ String f337352c;

    public /* synthetic */ C121582bi(C121584bk bkVar, boolean z, String str) {
        this.f337350a = bkVar;
        this.f337351b = z;
        this.f337352c = str;
    }

    public final void run() {
        C121584bk bkVar = this.f337350a;
        boolean z = this.f337351b;
        String str = this.f337352c;
        C33884b bVar = bkVar.f337356a;
        if (z) {
            bVar.mo39112b(str);
        } else {
            ((C130358c) bVar).f357276d.remove(str);
        }
    }
}
