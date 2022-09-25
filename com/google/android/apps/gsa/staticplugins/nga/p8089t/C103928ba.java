package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3793ae.p3794a.C48774f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ba */
/* compiled from: PG */
public final /* synthetic */ class C103928ba implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103943bp f289260a;

    public /* synthetic */ C103928ba(C103943bp bpVar) {
        this.f289260a = bpVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        InputStream open = this.f289260a.f289284b.getAssets().open("nga_sync_sot_configs.binarypb");
        try {
            C48774f fVar = (C48774f) C62942bv.parseFrom((C62942bv) C48774f.f126206b, open, C62921ba.f169869a);
            if (open != null) {
                open.close();
            }
            return fVar;
        } catch (Throwable th) {
            C103925ay.m171864a(th, th);
        }
        throw th;
    }
}
