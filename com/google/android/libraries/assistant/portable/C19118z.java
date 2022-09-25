package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18217au;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18287g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.portable.z */
/* compiled from: PG */
public abstract class C19118z {
    /* renamed from: a */
    public abstract C18217au mo24263a();

    /* renamed from: b */
    public abstract C18287g mo24264b();

    /* renamed from: c */
    public abstract C19115w mo24265c();

    /* renamed from: d */
    public final void mo24286d() {
        C19115w c = mo24265c();
        c.f53578a.f53438h.remove(Long.valueOf(c.f53579b.mo23676a()));
        mo24263a().close();
        try {
            mo24264b().close();
        } catch (Exception e) {
            C59104x d = PortableAssistant.f53431a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "POP");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(47527)).mo56386p("FutureStream failed to close.");
        }
    }
}
