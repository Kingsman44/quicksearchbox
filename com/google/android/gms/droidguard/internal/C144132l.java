package com.google.android.gms.droidguard.internal;

import android.os.Build;
import android.util.Base64;
import com.google.android.gms.droidguard.C144112b;
import com.google.android.gms.droidguard.p10791b.C144113a;
import com.google.android.gms.droidguard.p10791b.C144116d;
import com.google.android.gms.droidguard.p10791b.C144117e;
import com.google.android.gms.droidguard.p10791b.C144118f;
import com.google.p4658k.p4659a.p4660a.C61725a;
import com.google.p4658k.p4659a.p4660a.C61726b;
import com.google.p4658k.p4659a.p4660a.C61731g;
import com.google.p4658k.p4659a.p4660a.C61732h;
import com.google.p4658k.p4659a.p4660a.C61733i;
import com.google.protobuf.C63088z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import p5304e.p5305a.p5306a.p5390n.p5399e.p5400a.C68847a;

/* renamed from: com.google.android.gms.droidguard.internal.l */
/* compiled from: PG */
final class C144132l implements C144112b {

    /* renamed from: a */
    final C144135o f390431a;

    /* renamed from: b */
    public volatile byte[] f390432b;

    /* renamed from: c */
    public volatile C144136p f390433c;

    /* renamed from: d */
    private final long f390434d;

    /* renamed from: e */
    private final C144116d f390435e;

    public C144132l(C144135o oVar, C144136p pVar, long j, C144116d dVar) {
        this.f390431a = oVar;
        this.f390433c = pVar;
        this.f390434d = j;
        this.f390435e = dVar;
    }

    public C144132l(C144135o oVar, String str, C144116d dVar) {
        this.f390431a = oVar;
        this.f390435e = dVar;
        this.f390432b = C144117e.m234325a(str, Build.VERSION.SDK_INT, (Throwable) null);
        this.f390434d = 0;
    }

    /* renamed from: a */
    public final String mo119658a(Map map) {
        byte[] bArr;
        C144116d a = this.f390435e.mo119663a();
        a.mo119665c(14, C144118f.COARSE);
        if (this.f390432b != null) {
            bArr = this.f390432b;
        } else {
            C144113a aVar = new C144113a();
            this.f390431a.mo119685g(new C144130j(this, map, aVar));
            try {
                bArr = (byte[]) aVar.mo119661a(this.f390434d);
                if (bArr == null) {
                    bArr = C144117e.m234325a("Snapshot timeout: " + this.f390434d + " ms", Build.VERSION.SDK_INT, (Throwable) null);
                }
            } catch (InterruptedException e) {
                bArr = C144117e.m234325a("Results transfer failed: ".concat(e.toString()), Build.VERSION.SDK_INT, e);
            }
        }
        a.mo119665c(15, C144118f.COARSE);
        if (C68847a.m99669c()) {
            C61732h hVar = (C61732h) C61733i.f166775f.createBuilder();
            C63088z A = C63088z.m96139A(bArr);
            hVar.copyOnWrite();
            C61733i iVar = (C61733i) hVar.instance;
            iVar.f166777a |= 2;
            iVar.f166779c = A;
            C61731g b = a.mo119664b();
            hVar.copyOnWrite();
            C61733i iVar2 = (C61733i) hVar.instance;
            b.getClass();
            iVar2.f166780d = b;
            iVar2.f166777a |= 4;
            C61726b bVar = C61726b.f166762c;
            C61725a aVar2 = (C61725a) C61726b.f166762c.createBuilder();
            if (!bVar.f166765b) {
                aVar2.copyOnWrite();
                C61726b bVar2 = (C61726b) aVar2.instance;
                bVar2.f166764a |= 1;
                bVar2.f166765b = true;
            }
            C61726b bVar3 = (C61726b) aVar2.build();
            hVar.copyOnWrite();
            C61733i iVar3 = (C61733i) hVar.instance;
            bVar3.getClass();
            iVar3.f166781e = bVar3;
            iVar3.f166777a |= 8;
            C61733i iVar4 = (C61733i) hVar.build();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[8];
                new Random().nextBytes(bArr2);
                bArr2[0] = 10;
                bArr2[1] = 6;
                byte b2 = 3;
                for (int i = 0; i < 8; i++) {
                    b2 ^= bArr2[i];
                }
                bArr2[2] = (byte) (((byte) b2) ^ bArr2[2]);
                byteArrayOutputStream.write(bArr2);
                C61732h hVar2 = (C61732h) iVar4.toBuilder();
                hVar2.copyOnWrite();
                C61733i iVar5 = (C61733i) hVar2.instance;
                iVar5.f166777a &= -2;
                iVar5.f166778b = C61733i.f166775f.f166778b;
                ((C61733i) hVar2.build()).writeTo(byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    public final boolean mo119659b() {
        return this.f390433c != null && this.f390432b == null && this.f390433c.f30761a.pingBinder();
    }

    public final void close() {
        this.f390431a.mo119685g(new C144131k(this));
    }

    public C144132l(C144135o oVar, String str, C144116d dVar, Throwable th) {
        this.f390431a = oVar;
        this.f390435e = dVar;
        this.f390432b = C144117e.m234325a(str, Build.VERSION.SDK_INT, th);
        this.f390434d = 0;
    }
}
