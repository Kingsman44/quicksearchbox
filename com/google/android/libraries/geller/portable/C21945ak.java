package com.google.android.libraries.geller.portable;

import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p4985f.p5030q.p5032b.C65021af;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.libraries.geller.portable.ak */
/* compiled from: PG */
final class C21945ak implements GellerStorageOperationsCallback {

    /* renamed from: a */
    private static final C59071e f60542a = C59071e.m91332i("com.google.android.libraries.geller.portable.ak");

    /* renamed from: b */
    private final Geller f60543b;

    /* renamed from: c */
    private final C60887da f60544c;

    /* renamed from: d */
    private final C65021af f60545d;

    public C21945ak(Geller geller, C60887da daVar, C65021af afVar) {
        this.f60543b = geller;
        this.f60544c = daVar;
        this.f60545d = afVar;
    }

    /* renamed from: a */
    public final void mo27226a(String str, byte[] bArr) {
        ((C59052c) ((C59052c) f60542a.mo56224b()).mo56372aa(48044)).mo56386p("Performing deletion propagation for Geller data.");
        Geller geller = this.f60543b;
        try {
            geller.nativePropagateDeletion(geller.f60381c, geller.mo27174a(str), bArr);
        } catch (GellerException e) {
            ((C59052c) ((C59052c) ((C59052c) Geller.f60378a.mo56226d()).mo56382g(e)).mo56372aa(48039)).mo56386p("propagateDeletion call failed.");
        }
        GellerDatabase c = geller.mo27176c(str);
        if (c == null) {
            ((C59052c) ((C59052c) Geller.f60378a.mo56226d()).mo56372aa(48038)).mo56386p("The GellerDatabase is null, skipping setting DELETION_PROCESSED status.");
        } else {
            c.mo27246d(bArr);
        }
    }

    public final void onDeletion(String str, byte[] bArr) {
        ((C59052c) ((C59052c) f60542a.mo56224b()).mo56372aa(48042)).mo56386p("Scheduling deletion propagation for Geller data.");
        try {
            if (this.f60545d.f176082e) {
                mo27226a(str, bArr);
            } else {
                this.f60544c.mo19398a(C47810es.m84977q(new C21944aj(this, str, bArr)));
            }
        } catch (RejectedExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f60542a.mo56225c()).mo56382g(e)).mo56372aa(48043)).mo56386p("Failed to schedule deletion propagation task.");
        }
    }
}
