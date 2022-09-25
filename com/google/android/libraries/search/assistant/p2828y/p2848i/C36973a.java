package com.google.android.libraries.search.assistant.p2828y.p2848i;

import com.google.assistant.p3897e.p3921j.C52265li;
import com.google.assistant.p3897e.p3921j.amf;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.y.i.a */
/* compiled from: PG */
public final class C36973a {

    /* renamed from: a */
    private amf f96250a;

    /* renamed from: b */
    private C52265li f96251b;

    /* renamed from: c */
    private boolean f96252c;

    /* renamed from: d */
    private byte f96253d;

    /* renamed from: a */
    public final C36974b mo40499a() {
        byte b = this.f96253d ^ -1;
        if ((b & 3) == 0) {
            return new C36974b(this.f96250a, this.f96251b, (List) null, (List) null, this.f96252c, false, b & 124);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f96253d & 1) == 0) {
            sb.append(" surfaceIdentity");
        }
        if ((this.f96253d & 2) == 0) {
            sb.append(" supportedFeatures");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo40500b() {
        this.f96252c = true;
        this.f96253d = (byte) (this.f96253d | 16);
    }

    /* renamed from: c */
    public final void mo40501c(C52265li liVar) {
        if (liVar != null) {
            this.f96251b = liVar;
            this.f96253d = (byte) (this.f96253d | 2);
            return;
        }
        throw new NullPointerException("Null supportedFeatures");
    }

    /* renamed from: d */
    public final void mo40502d(amf amf) {
        if (amf != null) {
            this.f96250a = amf;
            this.f96253d = (byte) (this.f96253d | 1);
            return;
        }
        throw new NullPointerException("Null surfaceIdentity");
    }
}
