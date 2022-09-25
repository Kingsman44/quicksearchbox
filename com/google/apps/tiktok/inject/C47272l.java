package com.google.apps.tiktok.inject;

import android.content.Context;
import com.google.android.libraries.p11012aj.C147596b;
import com.google.android.libraries.p11012aj.C147605d;
import com.google.android.libraries.p11012aj.p11015c.C147601a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;
import java.io.EOFException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.inject.l */
/* compiled from: PG */
public final class C47272l implements C147601a {

    /* renamed from: a */
    public final Context f122916a;

    /* renamed from: b */
    public final C69464a f122917b;

    /* renamed from: c */
    public final C60887da f122918c;

    /* renamed from: d */
    public final C68214a f122919d;

    /* renamed from: e */
    public final C69464a f122920e;

    /* renamed from: f */
    public final C69464a f122921f;

    /* renamed from: g */
    private final C147605d f122922g;

    public C47272l(Context context, C147605d dVar, C69464a aVar, C60887da daVar, C68214a aVar2, C69464a aVar3, C69464a aVar4) {
        this.f122916a = context;
        this.f122922g = dVar;
        this.f122917b = aVar;
        this.f122918c = daVar;
        this.f122919d = aVar2;
        this.f122920e = aVar4;
        this.f122921f = aVar3;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static int m84080b(RandomAccessFile randomAccessFile) {
        try {
            int readInt = randomAccessFile.readInt();
            randomAccessFile.seek(0);
            return readInt;
        } catch (EOFException unused) {
            randomAccessFile.seek(0);
            return -1;
        } catch (Throwable th) {
            randomAccessFile.seek(0);
            throw th;
        }
    }

    /* renamed from: d */
    static void m84081d(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0);
    }

    /* renamed from: c */
    public final void mo51155c(boolean z) {
        C47558bi a = C47831fm.m85006a("StartupAfterPackageReplaced");
        try {
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(new C47271k(this, z)), this.f122918c);
            a.mo51417a(n);
            ((C46459k) this.f122919d.mo27525b()).mo50457e(n, 30, TimeUnit.SECONDS);
            a.close();
            return;
        } catch (Throwable th) {
            C47268h.m84078a(th, th);
        }
        throw th;
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        if (C147596b.m240670a() && this.f122922g.mo124374a()) {
            mo51155c(true);
        }
    }
}
