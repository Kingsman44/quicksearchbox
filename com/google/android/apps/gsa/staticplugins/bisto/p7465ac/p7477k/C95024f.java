package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7477k;

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
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.k.f */
/* compiled from: PG */
public final class C95024f {

    /* renamed from: a */
    private static final C59071e f265855a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.k.f");

    /* renamed from: b */
    private final C89656k f265856b;

    /* renamed from: c */
    private final String f265857c;

    /* renamed from: d */
    private final AtomicReference f265858d = new AtomicReference();

    /* renamed from: e */
    private final AtomicReference f265859e = new AtomicReference(C95023e.RAW);

    /* renamed from: f */
    private final AtomicInteger f265860f = new AtomicInteger(0);

    /* renamed from: g */
    private final C124606a f265861g;

    public C95024f(C124606a aVar, C89656k kVar, String str) {
        this.f265861g = aVar;
        this.f265856b = kVar;
        this.f265857c = str;
    }

    /* renamed from: a */
    public final void mo88936a(C95023e eVar) {
        String str;
        if (this.f265856b.mo83553h("bistoSpeechTestingMode") || this.f265856b.mo83553h("bistoRecordAudio")) {
            try {
                mo88938c();
                this.f265859e.set(eVar);
                AtomicReference atomicReference = this.f265858d;
                Locale locale = Locale.US;
                C95023e eVar2 = C95023e.OPUS;
                int ordinal = ((C95023e) this.f265859e.get()).ordinal();
                if (ordinal == 0) {
                    str = "%s-%d.opus";
                } else if (ordinal == 1) {
                    str = "%s-%d.raw";
                } else {
                    throw new AssertionError();
                }
                String format = String.format(locale, str, new Object[]{this.f265857c, Integer.valueOf(this.f265860f.get())});
                C59104x b = f265855a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoFileWriter");
                ((C59052c) ((C59052c) b).mo56372aa(17907)).mo56389s("Current file: %s", format);
                atomicReference.set(new BufferedOutputStream(new FileOutputStream(new File(this.f265861g.mo106558b(), format))));
            } catch (IOException unused) {
                this.f265858d.set((Object) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo88937b(byte[] bArr) {
        BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) this.f265858d.get();
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.write(bArr);
            } catch (IOException e) {
                C59104x d = f265855a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoFileWriter");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17910)).mo56386p("Can't write to audio file");
            }
        }
    }

    /* renamed from: c */
    public final void mo88938c() {
        BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) this.f265858d.getAndSet((Object) null);
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                C59104x d = f265855a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoFileWriter");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17909)).mo56386p("Can't close audio file");
            }
            AtomicInteger atomicInteger = this.f265860f;
            atomicInteger.set((atomicInteger.get() + 1) % 1200);
        }
    }
}
