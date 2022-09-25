package com.google.android.gms.usonia.p10879c;

import com.google.android.gms.usonia.metrics.internal.C146293a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70898m;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.gms.usonia.c.g */
/* compiled from: PG */
public final class C146171g implements C70899n {

    /* renamed from: b */
    private static final C59071e f394949b = C59071e.m91332i("com.google.android.gms.usonia.c.g");

    /* renamed from: a */
    public final C146166b f394950a;

    /* renamed from: c */
    private final C146168d f394951c;

    public C146171g(C146168d dVar, C146166b bVar) {
        this.f394951c = dVar;
        this.f394950a = bVar;
    }

    /* renamed from: b */
    public static String m238096b(String str) {
        return str == null ? "UNKNOWN" : str;
    }

    /* renamed from: c */
    public static C70899n[] m238097c(String str, C146168d dVar, C146166b bVar) {
        C70334de deVar = new C70334de();
        C70290cs csVar = new C70290cs("custom-service-name", C70334de.f187481c);
        if (!dVar.f394943a.isEmpty()) {
            str = dVar.f394943a;
        }
        deVar.mo62033h(csVar, str);
        return new C70899n[]{new C70879r(deVar), new C146171g(dVar, bVar)};
    }

    /* renamed from: a */
    public final C70898m mo27479a(C70338di diVar, C70851i iVar, C70888j jVar) {
        if (!this.f394951c.f394944b.isEmpty()) {
            ((C59052c) ((C59052c) f394949b.mo56226d()).mo56372aa(42066)).mo56386p("User identity is currently not supported. Ignoring.");
        }
        boolean z = this.f394951c.f394945c;
        this.f394950a.mo122733d(C146293a.SERVICE_CLIENT_REQUEST_COUNT, m238096b(diVar.f187498c), 1);
        return new C146170f(this, jVar.mo39510a(diVar, iVar), diVar);
    }
}
