package com.google.android.apps.gsa.shared.bisto.p7029b;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9402f.C124606a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.k */
/* compiled from: PG */
public final class C89640k {

    /* renamed from: a */
    public static final C89639j f242719a = new C89634e("raw");

    /* renamed from: c */
    private static final C59071e f242720c = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.b.k");

    /* renamed from: b */
    public C89639j f242721b = null;

    /* renamed from: d */
    private final C89656k f242722d;

    /* renamed from: e */
    private final C124606a f242723e;

    public C89640k(C89656k kVar, C124606a aVar) {
        this.f242722d = kVar;
        this.f242723e = aVar;
    }

    /* renamed from: a */
    public static void m145905a(C89639j jVar) {
        BufferedOutputStream bufferedOutputStream;
        if (jVar != null && (bufferedOutputStream = (BufferedOutputStream) jVar.f242716b.get()) != null) {
            try {
                bufferedOutputStream.flush();
            } catch (IOException e) {
                C59104x d = f242720c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MicRecorder");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10507)).mo56386p("can't flush");
            }
        }
    }

    /* renamed from: f */
    private static void m145906f(C89639j jVar) {
        BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) jVar.f242716b.getAndSet((Object) null);
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                C59104x d = f242720c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MicRecorder");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10505)).mo56386p("can't close");
            }
            AtomicInteger atomicInteger = jVar.f242717c;
            atomicInteger.set((atomicInteger.get() + 1) % 10000);
        }
    }

    /* renamed from: g */
    private final void m145907g(C89639j jVar) {
        if (jVar != null) {
            m145906f(jVar);
            jVar.f242718d.set(0);
            if (jVar.f242716b.get() == null) {
                try {
                    String str = ((C89634e) jVar).f242712a;
                    AtomicInteger atomicInteger = jVar.f242717c;
                    File file = new File(this.f242723e.mo106558b(), String.format(Locale.US, "%04d.%s", new Object[]{Integer.valueOf(atomicInteger.get()), str}));
                    C59104x b = f242720c.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "MicRecorder");
                    ((C59052c) ((C59052c) b).mo56372aa(10506)).mo56389s("writing file %s", file);
                    jVar.f242716b.set(new BufferedOutputStream(new FileOutputStream(file)));
                } catch (IOException unused) {
                    jVar.f242716b.set((Object) null);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo83523b() {
        if (this.f242722d.mo83553h("bistoRecordAudio")) {
            m145907g(f242719a);
            m145907g(this.f242721b);
        }
    }

    /* renamed from: c */
    public final void mo83524c(String str) {
        C89639j jVar = this.f242721b;
        if (jVar != null) {
            m145906f(jVar);
        }
        this.f242721b = new C89634e(str);
    }

    /* renamed from: d */
    public final void mo83525d(C89639j jVar, byte[] bArr) {
        if (this.f242722d.mo83553h("bistoRecordAudio")) {
            BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) jVar.f242716b.get();
            if (bufferedOutputStream == null) {
                mo83523b();
                BufferedOutputStream bufferedOutputStream2 = (BufferedOutputStream) jVar.f242716b.get();
                return;
            }
            AtomicInteger atomicInteger = jVar.f242718d;
            int length = bArr.length;
            if (atomicInteger.addAndGet(length) > 2097152) {
                m145907g(jVar);
                jVar.f242718d.set(length);
            }
            try {
                bufferedOutputStream.write(bArr);
            } catch (IOException e) {
                C59104x d = f242720c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MicRecorder");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10508)).mo56386p("can't write");
            }
        }
    }

    /* renamed from: e */
    public final void mo83526e(byte[] bArr) {
        if (this.f242721b == null) {
            mo83524c("sbc");
        }
        C89639j jVar = this.f242721b;
        if (jVar != null) {
            mo83525d(jVar, bArr);
        }
    }
}
