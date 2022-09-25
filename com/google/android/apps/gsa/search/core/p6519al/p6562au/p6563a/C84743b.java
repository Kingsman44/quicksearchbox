package com.google.android.apps.gsa.search.core.p6519al.p6562au.p6563a;

import com.google.android.apps.gsa.search.core.p6519al.p6562au.C84741a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.search.core.al.au.a.b */
/* compiled from: PG */
public final class C84743b extends C86731k {

    /* renamed from: c */
    private final String f230369c;

    /* renamed from: d */
    private final int f230370d;

    /* renamed from: e */
    private final C70334de f230371e;

    /* renamed from: f */
    private final String f230372f;

    /* renamed from: g */
    private final int f230373g;

    public C84743b(String str, int i, C70334de deVar, String str2, int i2) {
        super("http", "http::createGrpcChannel", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230369c = str;
        this.f230370d = i;
        this.f230371e = deVar;
        this.f230372f = str2;
        this.f230373g = i2;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84741a) obj).mo78454c(this.f230369c, this.f230370d, this.f230371e, this.f230372f, this.f230373g);
    }
}
