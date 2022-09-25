package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2683g.p2684a;

import android.content.ContentUris;
import android.net.Uri;
import com.google.android.apps.gsa.shared.util.C90721ae;
import java.io.IOException;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.g.a.a */
/* compiled from: PG */
final class C34639a extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C34640b f91975a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34639a(C34640b bVar) {
        super(0);
        this.f91975a = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        long detachFd = (long) this.f91975a.f91976a.detachFd();
        if (detachFd != -1) {
            Uri withAppendedId = ContentUris.withAppendedId(C90721ae.f253802k, detachFd);
            C69664n.m101060f(withAppendedId, "withAppendedId(IntentCon…PROVIDER_CONTENT_URI, fd)");
            return withAppendedId;
        }
        throw new IOException("Cannot detach file descriptor.");
    }
}
