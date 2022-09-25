package com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81498p;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81502t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.k.a.e */
/* compiled from: PG */
public final class C77737e extends C81498p {

    /* renamed from: a */
    public static final C59071e f214149a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.recognition.k.a.e");

    /* renamed from: b */
    private C77739g f214150b;

    public C77737e(C77739g gVar) {
        this.f214150b = gVar;
    }

    /* renamed from: c */
    public static void m124726c(C81502t tVar, byte[] bArr) {
        try {
            if (bArr.length > 0) {
                tVar.mo75111f(bArr);
            } else {
                tVar.mo75110e();
            }
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f214149a.mo56226d()).mo56382g(e)).mo56372aa(4412)).mo56386p("Unable to send read result to remote, remote died?");
        }
    }

    /* renamed from: a */
    public final void mo72800a() {
        C77739g gVar = this.f214150b;
        if (gVar != null) {
            synchronized (gVar.f214156c.f214159b) {
                gVar.f214155b = Math.min(gVar.f214155b, 0);
                gVar.f214156c.mo72804a();
            }
        }
        this.f214150b = null;
    }

    /* renamed from: b */
    public final void mo72801b(C81502t tVar) {
        C77738f fVar;
        C77739g gVar = this.f214150b;
        if (gVar == null) {
            m124726c(tVar, new byte[0]);
            return;
        }
        synchronized (gVar.f214156c.f214159b) {
            C77741i iVar = gVar.f214156c;
            fVar = new C77738f(iVar, gVar.f214154a + 1, gVar);
            iVar.f214162e.add(fVar);
            fVar.mo72802c();
        }
        C60856cj.m92911t(fVar, new C77736d(tVar), C60826bg.f164896a);
    }
}
