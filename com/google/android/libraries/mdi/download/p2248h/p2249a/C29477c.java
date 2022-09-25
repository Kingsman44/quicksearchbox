package com.google.android.libraries.mdi.download.p2248h.p2249a;

import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.p2248h.C29614k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.a.c */
/* compiled from: PG */
public final class C29477c implements C29614k {
    /* renamed from: b */
    public final C60870cx mo34749b(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28706al alVar = (C28706al) it.next();
            if (alVar.f77979b.startsWith("global") || alVar.f77979b.equals("model_metadata.pb") || alVar.f77979b.equals("word_embeddings") || alVar.f77979b.equals("RefNet.tflite")) {
                e.mo55395g(alVar);
            }
        }
        return C60856cj.m92900i(e.mo55394f());
    }
}
