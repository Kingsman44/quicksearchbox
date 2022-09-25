package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.os.Handler;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0310l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bo */
/* compiled from: PG */
final class C14827bo extends C0310l {

    /* renamed from: d */
    public final C14826bn f44652d;

    /* renamed from: e */
    final /* synthetic */ C14828bp f44653e;

    /* renamed from: f */
    private final ComponentName f44654f;

    public C14827bo(C14828bp bpVar, C14826bn bnVar, ComponentName componentName) {
        this.f44653e = bpVar;
        this.f44652d = bnVar;
        this.f44654f = componentName;
        ((C14784a) bnVar).f44560b.mo1040h(this, (Handler) null);
        C59104x b = C14828bp.f44655a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.MediaBrwsrClnt");
        ((C59052c) ((C59052c) b).mo56372aa(45569)).mo56389s("Registering MediaController callback: %s", ((C14784a) bnVar).f44560b.mo1039g());
    }

    /* renamed from: i */
    public final void mo1010i() {
        C59104x b = C14828bp.f44655a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.MediaBrwsrClnt");
        ((C59052c) ((C59052c) b).mo56372aa(45570)).mo56389s("Session destroyed: %s", ((C14784a) this.f44652d).f44560b.mo1039g());
        Optional optional = ((C14784a) this.f44652d).f44559a;
        if (optional.isPresent()) {
            ((MediaBrowserCompat) optional.get()).mo801e();
        }
        ((C14784a) this.f44652d).f44560b.mo1041i(this);
        this.f44653e.f44660f.remove(this.f44654f);
    }
}
