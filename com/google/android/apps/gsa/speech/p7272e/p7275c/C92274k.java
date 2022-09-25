package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.speech.p7139a.C90514f;
import com.google.android.apps.gsa.shared.util.C90727ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59315ac;
import com.google.speech.recognizer.AbstractRecognizer;
import com.google.speech.recognizer.p5233a.C67446ao;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.speech.e.c.k */
/* compiled from: PG */
public final class C92274k extends AbstractRecognizer {

    /* renamed from: d */
    private static final C59071e f257306d = C59071e.m91332i("com.google.android.apps.gsa.speech.e.c.k");

    /* renamed from: e */
    private static boolean f257307e = false;

    /* renamed from: a */
    public final C92273j f257308a;

    /* renamed from: b */
    public int f257309b;

    /* renamed from: c */
    public long f257310c;

    /* renamed from: f */
    private final int f257311f;

    /* renamed from: g */
    private final int f257312g;

    public C92274k(int i, int i2, int i3) {
        C92273j jVar = new C92273j();
        this.f257308a = jVar;
        this.f257309b = i;
        this.f257311f = i2;
        this.f257312g = i3;
        addCallback(jVar);
    }

    /* renamed from: a */
    public static synchronized void m151521a() {
        synchronized (C92274k.class) {
            if (!f257307e) {
                if (!m151523c()) {
                    ((C59052c) ((C59052c) f257306d.mo56225c()).mo56372aa(12392)).mo56386p("Failed to load speech library");
                    C90727ak.m148184a("google_recognizer_jni");
                }
                int i = 1;
                while (i <= 10) {
                    try {
                        nativeInit();
                        break;
                    } catch (UnsatisfiedLinkError e) {
                        if (i != 10) {
                            i++;
                        } else {
                            throw e;
                        }
                    }
                }
                f257307e = true;
            }
        }
    }

    /* renamed from: b */
    public static C92274k m151522b(C92270g gVar, int i, int i2) {
        byte[] bArr;
        C92274k kVar = new C92274k(i, 2, i2);
        try {
            bArr = new C59315ac(new File(gVar.f257276b)).mo56803a();
        } catch (IOException unused) {
            bArr = null;
        }
        if (bArr == null || bArr.length == 0) {
            ((C59052c) ((C59052c) f257306d.mo56225c()).mo56372aa(12390)).mo56389s("Error reading g3 config file: %s", gVar.f257276b);
            return null;
        }
        C67446ao initFromProto = kVar.initFromProto(bArr, gVar.f257275a);
        if (initFromProto == C67446ao.STATUS_SUCCESS) {
            return kVar;
        }
        ((C59052c) ((C59052c) f257306d.mo56225c()).mo56372aa(12391)).mo56389s("Failed to bring up g3, Status code: %s", initFromProto);
        return null;
    }

    /* renamed from: c */
    private static boolean m151523c() {
        String[] strArr = {"google_speech_jni", "google_speech_with_aec_jni"};
        int i = 0;
        while (i < 2) {
            String str = strArr[i];
            try {
                C90727ak.m148184a(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                ((C59052c) ((C59052c) ((C59052c) f257306d.mo56225c()).mo56382g(e)).mo56372aa(12393)).mo56389s("Failed to load speech library%s", str);
                i++;
            }
        }
        return false;
    }

    public final C67446ao cancel() {
        C92265b bVar = this.f257308a.f257305a;
        if (bVar != null) {
            bVar.mo86945a();
        }
        this.f257308a.f257305a = null;
        return super.cancel();
    }

    /* access modifiers changed from: protected */
    public final int read(byte[] bArr) {
        C92265b bVar;
        try {
            int read = super.read(bArr);
            if (read > 0) {
                long j = this.f257310c + ((long) ((read * 1000) / ((this.f257311f * this.f257312g) * this.f257309b)));
                this.f257310c = j;
                if (j % 200 == 0 && (bVar = this.f257308a.f257305a) != null) {
                    bVar.mo86947c(j);
                }
            }
            return read;
        } catch (IOException e) {
            C92273j jVar = this.f257308a;
            C90514f fVar = new C90514f((Throwable) e, 458758);
            C92265b bVar2 = jVar.f257305a;
            if (bVar2 != null) {
                bVar2.mo86946b(fVar);
            }
            throw new C90457d((Throwable) e, 458758);
        }
    }
}
