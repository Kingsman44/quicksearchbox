package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.gsa.shared.logger.C89929j;
import com.google.android.apps.gsa.shared.logger.C89950r;
import com.google.android.apps.gsa.shared.logger.C89952t;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.aw */
/* compiled from: PG */
final class C97564aw extends C89952t {

    /* renamed from: b */
    final /* synthetic */ C97565ax f272499b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97564aw(C97565ax axVar, C89950r rVar) {
        super(rVar);
        this.f272499b = axVar;
    }

    /* renamed from: b */
    public final C89929j mo83803b(C60555uf ufVar, C60321oe oeVar, C63196b bVar, C19088t tVar, String str) {
        byte[] bArr;
        this.f272499b.f272545f.add(ufVar);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f272499b.f272546g;
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = ufVar.toByteArray();
        if (oeVar == null) {
            bArr = null;
        } else {
            bArr = oeVar.toByteArray();
        }
        bArr2[1] = bArr;
        concurrentLinkedQueue.add(bArr2);
        return this.f246463a.mo83803b(ufVar, oeVar, bVar, tVar, str);
    }
}
