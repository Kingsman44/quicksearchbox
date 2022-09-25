package com.google.android.apps.search.assistant.libraries.p8956c.p8957a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.protobuf.C62940bt;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65575d;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65582k;
import org.chromium.net.NetworkException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.c.a.b */
/* compiled from: PG */
public final class C119256b extends Exception implements C34820a {

    /* renamed from: a */
    public static final C119255a f332583a = new C119255a();

    /* renamed from: b */
    public final NetworkException f332584b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119256b(NetworkException networkException) {
        super(networkException);
        C69664n.m101061g(networkException, "cause");
        this.f332584b = networkException;
    }

    /* renamed from: a */
    public final C34819a mo23265a() {
        C62940bt btVar = C65582k.f178253b;
        C65575d a = C65575d.m96735a(this.f332584b.getErrorCode());
        if (a == null) {
            a = C65575d.UNKNOWN_OR_INTERNAL;
        }
        return C34819a.m63580c(btVar, a);
    }

    public final /* synthetic */ Throwable getCause() {
        return this.f332584b;
    }
}
