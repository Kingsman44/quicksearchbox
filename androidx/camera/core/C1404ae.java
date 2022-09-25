package androidx.camera.core;

import androidx.camera.core.p069a.C1299am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.ae */
/* compiled from: PG */
final class C1404ae implements C1299am {

    /* renamed from: a */
    final List f3951a;

    public C1404ae(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.f3951a = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public final List mo4156a() {
        return this.f3951a;
    }
}
