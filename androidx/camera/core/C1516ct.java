package androidx.camera.core;

import androidx.camera.core.p069a.C1299am;
import androidx.camera.core.p069a.C1303aq;
import androidx.camera.core.p069a.C1331br;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.camera.core.ct */
/* compiled from: PG */
final class C1516ct {

    /* renamed from: a */
    protected final C1331br f4161a;

    /* renamed from: b */
    protected final C1299am f4162b;

    /* renamed from: c */
    protected final C1303aq f4163c;

    /* renamed from: d */
    protected int f4164d;

    /* renamed from: e */
    protected Executor f4165e = Executors.newSingleThreadExecutor();

    public C1516ct(C1331br brVar, C1299am amVar, C1303aq aqVar) {
        this.f4161a = brVar;
        this.f4162b = amVar;
        this.f4163c = aqVar;
        this.f4164d = brVar.mo4199b();
    }
}
