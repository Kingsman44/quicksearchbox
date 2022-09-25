package com.google.android.libraries.assistant.p1484g.p1485a.p1486a.p1487a;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18101b;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52801c;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.assistant.p3931f.p3939c.C52846w;

/* renamed from: com.google.android.libraries.assistant.g.a.a.a.a */
/* compiled from: PG */
public final class C17958a implements C18101b {
    /* renamed from: a */
    public final /* synthetic */ Bundle mo23502a(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("app_action_arg", ((C52846w) obj).toByteArray());
        return bundle;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo23503b(Bundle bundle) {
        return (C52813ac) C52801c.m86708a(bundle, "app_action_result", C52813ac.f138569c);
    }

    /* renamed from: c */
    public final String mo23504c() {
        return "app_action";
    }

    /* renamed from: d */
    public final boolean mo23505d(C18102c cVar) {
        return cVar.mo23599e().equals("app_action") && cVar.mo23595a() != null;
    }
}
