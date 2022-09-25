package com.google.android.apps.gsa.speech.p7272e.p7274b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59315ac;
import com.google.speech.recognizer.ResourceManager;
import com.google.speech.recognizer.p5233a.C67446ao;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.speech.e.b.r */
/* compiled from: PG */
public final class C92256r extends ResourceManager {

    /* renamed from: b */
    private static final C59071e f257231b = C59071e.m91332i("com.google.android.apps.gsa.speech.e.b.r");

    /* renamed from: a */
    public static C92256r m151486a(String str, String[] strArr) {
        byte[] bArr;
        C92256r rVar = new C92256r();
        try {
            bArr = new C59315ac(new File(str)).mo56803a();
        } catch (IOException unused) {
            bArr = null;
        }
        if (bArr == null) {
            ((C59052c) ((C59052c) f257231b.mo56225c()).mo56372aa(12321)).mo56389s("Error reading g3 config file: %s", str);
            return null;
        }
        long j = rVar.f183250a;
        if (j != 0) {
            C67446ao a = C67446ao.m97470a(super.nativeInitFromProto(j, bArr, strArr));
            if (a == C67446ao.STATUS_SUCCESS) {
                return rVar;
            }
            ((C59052c) ((C59052c) f257231b.mo56225c()).mo56372aa(12320)).mo56389s("Failed to bring up g3, Status code: %s", a);
            return null;
        }
        throw new IllegalStateException("recognizer is not initialized");
    }
}
