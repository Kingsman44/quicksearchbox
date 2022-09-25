package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.aft */
/* compiled from: PG */
public final class aft extends C62934bn implements C63001dt {
    public aft() {
        super(afu.f129178e);
    }

    /* renamed from: a */
    public final void mo53358a(int i) {
        copyOnWrite();
        afu afu = (afu) this.instance;
        afu afu2 = afu.f129178e;
        C62961ch chVar = afu.f129182c;
        if (!chVar.mo58948c()) {
            afu.f129182c = C62942bv.mutableCopy(chVar);
        }
        afu.f129182c.mo58916g(i - 1);
    }
}
