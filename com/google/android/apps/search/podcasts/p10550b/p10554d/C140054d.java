package com.google.android.apps.search.podcasts.p10550b.p10554d;

import androidx.core.p097i.C1966a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.podcasts.b.d.d */
/* compiled from: PG */
public final /* synthetic */ class C140054d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C140057g f380630a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f380631b;

    public /* synthetic */ C140054d(C140057g gVar, MessageLite messageLite) {
        this.f380630a = gVar;
        this.f380631b = messageLite;
    }

    public final Object call() {
        C140057g gVar = this.f380630a;
        MessageLite messageLite = this.f380631b;
        synchronized (C140057g.class) {
            File c = gVar.mo115423c(gVar.f380636b);
            int length = (int) c.length();
            if (length > 1000000) {
                c.delete();
                String str = gVar.f380636b;
                throw new IOException("Corrupted file '" + str + "'");
            } else if (length > 0) {
                byte[] d = new C1966a(c).mo5122d();
                gVar.f380637c = Arrays.hashCode(d);
                messageLite = messageLite.toBuilder().mergeFrom(d, C62921ba.m95368a()).build();
            }
        }
        return messageLite;
    }
}
