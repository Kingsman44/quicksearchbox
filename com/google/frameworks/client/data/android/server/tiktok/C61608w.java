package com.google.frameworks.client.data.android.server.tiktok;

import android.content.Context;
import com.google.frameworks.client.data.android.server.C61550ae;
import com.google.frameworks.client.data.android.server.C61551af;
import java.util.Map;
import java.util.concurrent.Executor;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.w */
/* compiled from: PG */
public final class C61608w implements C61607v {

    /* renamed from: a */
    static final C70297cz f166476a = C70297cz.m102495c("alternate-service-key-bin", C61601p.f166465a);

    /* renamed from: b */
    public final Context f166477b;

    /* renamed from: c */
    public final Executor f166478c;

    /* renamed from: d */
    private final C61551af f166479d;

    /* renamed from: com.google.frameworks.client.data.android.server.tiktok.w$a */
    /* compiled from: PG */
    public interface C61609a {
        /* renamed from: iQ */
        Map mo58146iQ();

        /* renamed from: iR */
        Map mo58147iR();
    }

    public C61608w(Context context, Executor executor, C61601p pVar) {
        this.f166477b = context;
        this.f166478c = executor;
        this.f166479d = new C61551af(new C61612z(this, pVar), executor);
    }

    /* renamed from: a */
    public final C70298d mo58143a(C70716eu euVar) {
        return new C61550ae(this.f166479d, euVar);
    }

    /* renamed from: b */
    public final C70298d mo58144b(C70716eu euVar, C61592g gVar) {
        return new C61550ae(new C61551af(new C61612z(this, gVar), this.f166478c), euVar);
    }

    /* renamed from: c */
    public final C70866e mo58145c(C70866e eVar, String str) {
        C70334de deVar = new C70334de();
        deVar.mo62033h(f166476a, str);
        return eVar.mo62576o(new C70879r(deVar));
    }
}
