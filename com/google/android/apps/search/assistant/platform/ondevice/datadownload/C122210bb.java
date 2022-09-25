package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17136an;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17160w;
import com.google.android.libraries.mdi.C29690f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import org.p5610a.p5611a.p5612a.C71978d;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.bb */
/* compiled from: PG */
public final class C122210bb {

    /* renamed from: c */
    private static final C58974d f338915c = C58974d.m91136j();

    /* renamed from: a */
    public final C60887da f338916a;

    /* renamed from: b */
    public final C60887da f338917b;

    /* renamed from: d */
    private final Context f338918d;

    public C122210bb(Context context, C60887da daVar, C60887da daVar2) {
        this.f338918d = context;
        this.f338916a = daVar;
        this.f338917b = daVar2;
    }

    /* renamed from: a */
    public final C60870cx mo105569a(C29690f fVar) {
        if (C17160w.m34311b(fVar)) {
            return C60856cj.m92900i(Optional.empty());
        }
        C122176ax axVar = new C122176ax(this, fVar);
        return C60856cj.m92904m(C47810es.m84978r(axVar), this.f338916a);
    }

    /* renamed from: b */
    public final synchronized Optional mo105570b(C29690f fVar) {
        File i = C17136an.m34274i(this.f338918d, C17136an.m34276k(fVar));
        if (!i.exists()) {
            ((C58970a) ((C58970a) f338915c.mo56226d()).mo56372aa(34719)).mo56389s("Config group is not stored for group %s", fVar.f80411b);
            return Optional.empty();
        }
        return Optional.m71637of((C48773e) C62942bv.parseFrom((C62942bv) C48773e.f126198g, C71978d.m105270k(i), C62921ba.m95368a()));
    }

    /* renamed from: c */
    public final synchronized void mo105571c(Predicate predicate) {
        File[] listFiles = C17136an.m34273h(this.f338918d).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (predicate.test(file.getName().replaceAll("\\.binarypb$", BuildConfig.FLAVOR))) {
                    if (!file.delete()) {
                        throw new IOException("Failed to delete config ".concat(String.valueOf(String.valueOf(file))));
                    }
                }
            }
        } else {
            throw new IOException("Failed to get config directory listing");
        }
    }

    /* renamed from: d */
    public final synchronized void mo105572d(String str, C48773e eVar) {
        File h = C17136an.m34273h(this.f338918d);
        if (!h.isDirectory()) {
            if (!h.mkdir()) {
                throw new IOException("failed to create configs directory ".concat(h.toString()));
            }
        }
        File i = C17136an.m34274i(this.f338918d, str);
        byte[] byteArray = eVar.toByteArray();
        BigInteger bigInteger = C71978d.f191683a;
        C71978d.m105278s(i, byteArray, byteArray.length);
    }
}
