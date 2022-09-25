package com.google.android.apps.gsa.search.core.google.p6794d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.s */
/* compiled from: PG */
public final class C85952s extends C85949p {

    /* renamed from: b */
    private final C63010eb f232446b;

    /* renamed from: c */
    private final InputStream f232447c;

    public C85952s(C63010eb ebVar, InputStream inputStream) {
        this.f232446b = ebVar;
        this.f232447c = inputStream;
    }

    /* renamed from: a */
    public final C85945l mo79619a() {
        try {
            MessageLite messageLite = (MessageLite) this.f232446b.mo59007f(this.f232447c, C62921ba.m95368a());
            if (messageLite == null) {
                return null;
            }
            return new C85945l(BuildConfig.FLAVOR, false, messageLite, messageLite.getSerializedSize());
        } catch (C62974ct e) {
            throw new C90457d((Throwable) e, (int) C89885b.GWS_BAD_PELLET_PROTO_CONTENT_VALUE);
        }
    }
}
