package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.media.session.MediaController;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bk */
/* compiled from: PG */
public final /* synthetic */ class C14823bk implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C14828bp f44644a;

    /* renamed from: b */
    public final /* synthetic */ MediaController f44645b;

    public /* synthetic */ C14823bk(C14828bp bpVar, MediaController mediaController) {
        this.f44644a = bpVar;
        this.f44645b = mediaController;
    }

    public final Object apply(Object obj) {
        C14828bp bpVar = this.f44644a;
        MediaController mediaController = this.f44645b;
        C59104x d = C14828bp.f44655a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MediaBrwsrClnt");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Throwable) obj)).mo56372aa(45572)).mo56389s("MediaBrowse connection failed for %s", mediaController.getPackageName());
        return new C14784a(Optional.empty(), bpVar.mo21760a(mediaController));
    }
}
