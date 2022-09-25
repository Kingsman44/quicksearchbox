package com.google.android.apps.gsa.staticplugins.p8163o;

import androidx.media3.p132b.C2500d;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2505i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59332o;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.l */
/* compiled from: PG */
public final /* synthetic */ class C105840l implements C2504h {

    /* renamed from: a */
    public final /* synthetic */ C105846r f295267a;

    public /* synthetic */ C105840l(C105846r rVar) {
        this.f295267a = rVar;
    }

    /* renamed from: a */
    public final C2505i mo5878a() {
        byte[] bArr = new byte[0];
        try {
            bArr = C59332o.m92213d(this.f295267a.f295307c.getAssets().open("chime.aac"));
        } catch (IOException e) {
            C59104x c = C105846r.f295277a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "APWDelegate");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14075)).mo56386p("Unable to load chime sound.");
        }
        return new C2500d(bArr);
    }
}
