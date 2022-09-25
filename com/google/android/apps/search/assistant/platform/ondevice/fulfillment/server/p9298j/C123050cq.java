package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import android.net.Uri;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.io.InputStream;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cq */
/* compiled from: PG */
public final class C123050cq {
    /* renamed from: a */
    public static Optional m202384a(C42813k kVar, C29690f fVar, String str, MessageLite messageLite) {
        Optional map = Collection.EL.stream(fVar.f80416g).filter(new C123048co(str)).findFirst().map(C123049cp.f340613a);
        if (!map.isPresent()) {
            return Optional.empty();
        }
        InputStream inputStream = (InputStream) kVar.mo45889c(Uri.parse((String) map.get()), new C42790n());
        try {
            MessageLite messageLite2 = (MessageLite) messageLite.getParserForType().mo59013l(inputStream, C62921ba.m95368a());
            if (inputStream != null) {
                inputStream.close();
            }
            return Optional.m71637of(messageLite2);
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
