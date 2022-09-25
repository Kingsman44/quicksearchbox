package com.google.android.apps.gsa.shared.p7195y;

import com.google.android.apps.gsa.shared.util.p7159c.C90882ap;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59315ac;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.shared.y.aj */
/* compiled from: PG */
final class C91178aj extends C90882ap {
    public C91178aj() {
        super("GlideReadEncodedBytes", 8);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        File file = (File) obj;
        if (file == null) {
            return null;
        }
        try {
            return new C59315ac(file).mo56803a();
        } catch (IOException e) {
            C59104x c = C91188at.f254565b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GlideImageLoader");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10631)).mo56386p("Failed to load bytes from image file");
            return null;
        }
    }
}
