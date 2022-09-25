package com.google.common.p4526f.p4528b.p4529a;

import com.google.common.p4541l.C59332o;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.InputStream;

/* renamed from: com.google.common.f.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C58993j implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C58993j f156855a = new C58993j();

    private /* synthetic */ C58993j() {
    }

    public final C60870cx apply(Object obj) {
        InputStream inputStream = (InputStream) obj;
        try {
            C60870cx i = C60856cj.m92900i(C59332o.m92213d(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            return i;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
