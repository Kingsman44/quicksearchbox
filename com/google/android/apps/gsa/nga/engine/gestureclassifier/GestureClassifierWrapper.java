package com.google.android.apps.gsa.nga.engine.gestureclassifier;

import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public class GestureClassifierWrapper {

    /* renamed from: a */
    public static final C58974d f211009a = C58974d.m91136j();

    /* renamed from: b */
    public static final C76114d f211010b;

    /* renamed from: c */
    public final C78007b f211011c;

    static {
        C76111a aVar = (C76111a) C76114d.f211013d.createBuilder();
        aVar.copyOnWrite();
        C76114d dVar = (C76114d) aVar.instance;
        dVar.f211017c = 1;
        dVar.f211015a = 1 | dVar.f211015a;
        f211010b = (C76114d) aVar.build();
    }

    public GestureClassifierWrapper(C78007b bVar) {
        this.f211011c = bVar;
    }

    public native byte[] nativeClassify(byte[] bArr);
}
