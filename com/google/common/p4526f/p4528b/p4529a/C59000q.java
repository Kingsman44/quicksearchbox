package com.google.common.p4526f.p4528b.p4529a;

import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.common.f.b.a.q */
/* compiled from: PG */
public final /* synthetic */ class C59000q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C59002s f156867a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f156868b;

    public /* synthetic */ C59000q(C59002s sVar, SettableFuture settableFuture) {
        this.f156867a = sVar;
        this.f156868b = settableFuture;
    }

    public final void run() {
        C59002s sVar = this.f156867a;
        SettableFuture settableFuture = this.f156868b;
        if (!(settableFuture.value instanceof C60873d.C60875b)) {
            C59002s.m91192c();
            ArrayList<InputStream> arrayList = new ArrayList<>();
            int i = 1;
            boolean z = false;
            boolean z2 = false;
            while (i <= sVar.f156877g) {
                try {
                    File a = sVar.mo56267a(i);
                    if (a.exists()) {
                        arrayList.add(new FileInputStream(a));
                        if (z) {
                            z = true;
                            z2 = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                    i++;
                } catch (Throwable th) {
                    try {
                        for (InputStream close : arrayList) {
                            close.close();
                        }
                        settableFuture.mo57357o(th);
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        settableFuture.mo57357o(th);
                        throw th2;
                    }
                }
            }
            File file = (File) sVar.f156874d.mo6453a();
            if (file.exists()) {
                arrayList.add(new FileInputStream(file));
            }
            if (z2) {
                arrayList.add(0, C59002s.f156873c);
            }
            SequenceInputStream sequenceInputStream = new SequenceInputStream(Collections.enumeration(arrayList));
            if (!settableFuture.mo57356n(sequenceInputStream)) {
                sequenceInputStream.close();
            }
        }
    }
}
