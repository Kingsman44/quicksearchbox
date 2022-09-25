package com.google.android.apps.gsa.staticplugins.p7960g.p7961a;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.assist.C9332ac;
import com.google.android.apps.gsa.assist.C9433w;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.a.b */
/* compiled from: PG */
final class C101264b extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C101265c f282609a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101264b(C101265c cVar) {
        super("AssistDataBuilder.ProcessScreenshot.ScreenshotWorker", 1, 16);
        this.f282609a = cVar;
    }

    public final void run() {
        C101265c cVar = this.f282609a;
        Bitmap bitmap = cVar.f282616g;
        if (bitmap == null || cVar.f282614e == null) {
            ((C59052c) ((C59052c) C101272j.f282651a.mo56225c()).mo56372aa(13827)).mo56386p("Downscaled Bitmap or OutputStream is null.");
            return;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        C101265c cVar2 = this.f282609a;
        bitmap.compress(compressFormat, cVar2.f282615f, cVar2.f282614e);
        C101265c cVar3 = this.f282609a;
        C63087y yVar = cVar3.f282614e;
        if (yVar != null) {
            C9433w wVar = cVar3.f282617h;
            C63088z b = yVar.mo59165b();
            wVar.copyOnWrite();
            C9332ac acVar = (C9332ac) wVar.instance;
            C9332ac acVar2 = C9332ac.f32378j;
            b.getClass();
            acVar.f32380a |= 2;
            acVar.f32381b = b;
            if (cVar3.f282612c) {
                cVar3.f282611b.mo17504b(5);
            }
            if (cVar3.f282613d.compareAndSet(false, true)) {
                cVar3.f282610a.mo57356n((C9332ac) cVar3.f282617h.build());
            }
            cVar3.f282616g = null;
            cVar3.f282614e = null;
        }
    }
}
