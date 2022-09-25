package com.google.frameworks.client.data.android;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.frameworks.client.data.android.u */
/* compiled from: PG */
final class C61620u {

    /* renamed from: a */
    final List f166492a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58149a(ByteBuffer byteBuffer) {
        if (!this.f166492a.isEmpty()) {
            List list = this.f166492a;
            if (list.get(list.size() - 1) == byteBuffer) {
                return;
            }
        }
        this.f166492a.add(byteBuffer);
    }
}
