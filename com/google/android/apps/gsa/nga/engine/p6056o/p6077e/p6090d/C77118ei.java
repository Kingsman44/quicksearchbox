package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.app.assist.AssistContent;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.ei */
/* compiled from: PG */
public final /* synthetic */ class C77118ei implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212830a;

    /* renamed from: b */
    public final /* synthetic */ C77088df f212831b;

    public /* synthetic */ C77118ei(C77123en enVar, C77088df dfVar) {
        this.f212830a = enVar;
        this.f212831b = dfVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212830a;
        C77088df dfVar = this.f212831b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        Uri webUri = ((AssistContent) optional.get()).getWebUri();
        if (webUri != null) {
            C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
            lVar.mo74319k(76319);
            C80303ay ayVar = (C80303ay) C80307bb.f220382e.createBuilder();
            return enVar.f212853j.mo28210j(enVar.f212848e.mo72416b(dfVar, ayVar), "[NGA] ShareFulfiller.shareAssistContentUri", new C77105dw(enVar, webUri, lVar, ayVar));
        }
        Intent intent = ((AssistContent) optional.get()).getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            String type = intent.getType();
            if (data != null && type != null && C77123en.m123790j(type) && enVar.f212856m.mo71212a(data)) {
                return enVar.mo72430g(dfVar, data, type, (C80399l) C80401n.f220656k.createBuilder());
            }
        }
        return C60856cj.m92900i(Optional.empty());
    }
}
