package com.google.p386ak;

import com.google.p386ak.p388b.C8343aq;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8388d;
import java.io.IOException;
import java.io.StringReader;

/* renamed from: com.google.ak.s */
/* compiled from: PG */
public final class C8403s {
    /* renamed from: a */
    public static C8398n m23252a(C8385a aVar) {
        boolean z = aVar.f29216a;
        aVar.f29216a = true;
        try {
            C8398n a = C8343aq.m23114a(aVar);
            aVar.f29216a = z;
            return a;
        } catch (StackOverflowError e) {
            String obj = aVar.toString();
            throw new C8402r("Failed parsing JSON source: " + obj + " to Json", e);
        } catch (OutOfMemoryError e2) {
            String obj2 = aVar.toString();
            throw new C8402r("Failed parsing JSON source: " + obj2 + " to Json", e2);
        } catch (Throwable th) {
            aVar.f29216a = z;
            throw th;
        }
    }

    /* renamed from: b */
    public static C8398n m23253b(String str) {
        try {
            C8385a aVar = new C8385a(new StringReader(str));
            C8398n a = m23252a(aVar);
            if (!(a instanceof C8400p)) {
                if (aVar.mo17127r() != 10) {
                    throw new C8406v("Did not consume the entire document.");
                }
            }
            return a;
        } catch (C8388d e) {
            throw new C8406v((Throwable) e);
        } catch (IOException e2) {
            throw new C8399o((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new C8406v((Throwable) e3);
        }
    }
}
