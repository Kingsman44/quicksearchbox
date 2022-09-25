package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.b */
/* compiled from: PG */
public final class C23257b implements C23274s {
    /* renamed from: e */
    public static final byte[] m43596e(String str, C23120p pVar) {
        byte[] byteArray = pVar.f63472a.getByteArray(str);
        byteArray.getClass();
        return byteArray;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return new byte[0];
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        return m43596e(str, pVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putByteArray(str, (byte[]) obj);
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }
}
