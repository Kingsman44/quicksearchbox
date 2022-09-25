package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.p4527a.C58974d;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.am */
/* compiled from: PG */
public final class C106878am {

    /* renamed from: a */
    public final C90021c f297773a;

    /* renamed from: b */
    public final C39141kp f297774b;

    /* renamed from: c */
    public final C58974d f297775c;

    public C106878am(C90021c cVar, C39141kp kpVar, C83564a aVar) {
        this.f297773a = cVar;
        this.f297774b = kpVar;
        this.f297775c = aVar.mo76900a("MediaItemUtils");
    }

    /* renamed from: a */
    public static byte[] m177637a(Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 64, 64, true);
        ByteBuffer allocate = ByteBuffer.allocate(createScaledBitmap.getByteCount());
        createScaledBitmap.copyPixelsToBuffer(allocate);
        return allocate.array();
    }
}
