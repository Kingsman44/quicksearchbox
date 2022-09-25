package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115435e;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ep */
/* compiled from: PG */
public final /* synthetic */ class C115327ep implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115331et f319977a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f319978b;

    public /* synthetic */ C115327ep(C115331et etVar, byte[] bArr) {
        this.f319977a = etVar;
        this.f319978b = bArr;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115331et etVar = this.f319977a;
        byte[] bArr = this.f319978b;
        C59104x c = C115331et.f319984a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SpeakrPlaylistC");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(29860)).mo56386p("Error getting narration voice.");
        etVar.f319988e.mo101988e(bArr, C58836b.f156633a, C115435e.DEFAULT_FEEDBACK_TYPE);
    }
}
