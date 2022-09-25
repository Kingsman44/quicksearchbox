package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.de */
/* compiled from: PG */
final class C18886de implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C18887df f53157a;

    /* renamed from: b */
    private final Object f53158b;

    /* renamed from: c */
    private final boolean f53159c;

    /* renamed from: d */
    private final Optional f53160d;

    public C18886de(C18887df dfVar, Object obj, boolean z, Optional optional) {
        this.f53157a = dfVar;
        this.f53158b = obj;
        this.f53159c = z;
        this.f53160d = optional;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        this.f53160d.ifPresent(C18885dd.f53156a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        this.f53160d.ifPresent(C18884dc.f53155a);
        Optional j = C18887df.m36317j((Optional) obj);
        if (j.isPresent()) {
            C0320v vVar = (C0320v) j.get();
            C58976aa aaVar = C58975e.f156826a;
            vVar.mo1038f();
            Object obj2 = this.f53158b;
            if (obj2 instanceof String) {
                if (((String) obj2).isEmpty()) {
                    vVar.mo1037e().mo1018c();
                } else {
                    vVar.mo1037e().mo1019d((String) this.f53158b, new Bundle());
                }
            } else if (obj2 instanceof Uri) {
                vVar.mo1037e().mo1021f((Uri) this.f53158b, new Bundle());
            } else {
                C59104x c = C18887df.f53161a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
                ((C59052c) ((C59052c) c).mo56372aa(47496)).mo56386p("#onSuccess() Invalid format of media ID.");
            }
            if (this.f53159c) {
                this.f53157a.f53164d.mo24202a(vVar);
            }
        }
    }
}
