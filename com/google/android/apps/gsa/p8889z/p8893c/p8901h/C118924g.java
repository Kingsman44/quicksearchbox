package com.google.android.apps.gsa.p8889z.p8893c.p8901h;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.search.p2904c.p2951n.C37899a;
import com.google.android.libraries.search.p2904c.p2951n.C37900b;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.common.p4541l.C59332o;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.z.c.h.g */
/* compiled from: PG */
public final /* synthetic */ class C118924g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118927j f331677a;

    /* renamed from: b */
    public final /* synthetic */ InputStream f331678b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f331679c;

    public /* synthetic */ C118924g(C118927j jVar, InputStream inputStream, byte[] bArr) {
        this.f331677a = jVar;
        this.f331678b = inputStream;
        this.f331679c = bArr;
    }

    public final Object call() {
        C118927j jVar = this.f331677a;
        InputStream inputStream = this.f331678b;
        byte[] bArr = this.f331679c;
        while (true) {
            try {
                int a = C59332o.m92210a(inputStream, bArr, 0, bArr.length);
                if (a <= 0) {
                    break;
                }
                synchronized (jVar.f331683a) {
                    C118926i iVar = jVar.f331684b;
                    if (iVar == null) {
                        break;
                    } else if (!iVar.f155044c.get()) {
                        break;
                    } else {
                        jVar.f331684b.mo54583c(C118919a.m197404b(bArr, a));
                    }
                }
            } catch (C37899a e) {
                throw new C90457d((Throwable) e, (int) C89885b.f246265x6249b11);
            } catch (C37901c e2) {
                throw new C90457d((Throwable) e2, (int) C89885b.f246263xcf0c19f6);
            } catch (C37900b e3) {
                throw new C90457d((Throwable) e3, (int) C89885b.f246267xa75eb827);
            } catch (IOException e4) {
                throw new C90457d((Throwable) e4, (int) C89885b.AUDIO_DATA_FAILED_READ_LIBRARY_MAIN_AUDIO_STREAM_SOURCE_VALUE);
            } catch (C90457d e5) {
                jVar.mo104072c(false, e5);
            }
        }
        jVar.mo104072c(true, (Throwable) null);
        return C118826c.f331422a;
    }
}
