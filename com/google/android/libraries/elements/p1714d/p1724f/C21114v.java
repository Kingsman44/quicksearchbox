package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.android.libraries.elements.interfaces.C21233ac;
import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21293ci;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.p5166b.C66086at;
import com.google.protos.youtube.elements.p5166b.C66091ay;
import com.google.protos.youtube.elements.p5166b.C66092az;
import com.google.protos.youtube.elements.p5166b.C66094ba;
import com.google.protos.youtube.elements.p5166b.C66095bb;
import com.google.protos.youtube.elements.p5166b.C66096bc;
import com.google.protos.youtube.elements.p5166b.C66097bd;
import com.google.protos.youtube.elements.p5166b.C66105j;
import com.youtube.android.libraries.elements.templates.C68107c;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import com.youtube.p5283a.p5284a.C68039ab;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import java.io.IOException;
import java.nio.ByteBuffer;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.d.f.v */
/* compiled from: PG */
public final class C21114v implements C21293ci {

    /* renamed from: a */
    final /* synthetic */ C21115w f59157a;

    /* renamed from: b */
    private final byte[] f59158b;

    /* renamed from: c */
    private final byte[] f59159c;

    /* renamed from: d */
    private final String f59160d;

    public C21114v(C21115w wVar, byte[] bArr, C68045ah ahVar, String str) {
        byte[] bArr2;
        this.f59157a = wVar;
        this.f59158b = bArr;
        C68044ag agVar = new C68044ag();
        int i = 0;
        while (true) {
            if (i >= ahVar.mo60108g()) {
                bArr2 = C21258ba.f59581a;
                break;
            }
            ahVar.mo60110i(agVar, i);
            if (agVar.mo60106i() == 224886694) {
                bArr2 = new byte[agVar.mo60105h()];
                agVar.mo16918f(6).get(bArr2);
                break;
            }
            i++;
        }
        this.f59159c = bArr2;
        this.f59160d = str;
    }

    /* renamed from: a */
    public final C68039ab mo26157a(C21279bv bvVar, C21292ch chVar, C21319z zVar) {
        int i;
        long[] jArr;
        byte[] bArr;
        int i2;
        C21292ch chVar2 = chVar;
        try {
            C68039ab abVar = new C68039ab();
            C68107c cVar = this.f59157a.f59166c ? new C68107c() : null;
            C66086at f = ((C21233ac) this.f59157a.f59168e.mo17428b()).mo26165b() ? C21168q.m39752f(zVar) : null;
            if (f != null) {
                C66094ba baVar = (C66094ba) C66095bb.f179730d.createBuilder();
                baVar.copyOnWrite();
                C66095bb bbVar = (C66095bb) baVar.instance;
                bbVar.f179733b = f;
                bbVar.f179732a |= 1;
                String a = C21115w.m39647a(this.f59158b);
                baVar.copyOnWrite();
                C66095bb bbVar2 = (C66095bb) baVar.instance;
                a.getClass();
                bbVar2.f179732a |= 2;
                bbVar2.f179734c = a;
                C66095bb bbVar3 = (C66095bb) baVar.build();
                C66096bc bcVar = (C66096bc) C66097bd.f179735e.createBuilder();
                C63042fg d = C21168q.m39750d();
                bcVar.copyOnWrite();
                C66097bd bdVar = (C66097bd) bcVar.instance;
                d.getClass();
                bdVar.f179740d = d;
                bdVar.f179737a |= 1;
                bcVar.copyOnWrite();
                C66097bd bdVar2 = (C66097bd) bcVar.instance;
                bbVar3.getClass();
                bdVar2.f179739c = bbVar3;
                bdVar2.f179738b = 2;
                ((DebuggerClient) this.f59157a.f59167d.mo17428b()).sendTimelineEvent(((C66097bd) bcVar.build()).toByteArray());
            }
            StringBuilder sb = new StringBuilder();
            ByteBuffer b = C21115w.m39648b(this.f59157a.f59165b, bvVar);
            UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) this.f59157a.f59164a.mo17428b();
            byte[] bArr2 = this.f59158b;
            byte[] array = b.array();
            int arrayOffset = b.arrayOffset() + b.position();
            int remaining = b.remaining();
            byte[] bArr3 = this.f59159c;
            String str = this.f59160d;
            if (bArr2 != null) {
                byte[][] bArr4 = {null, null, null};
                if (cVar != null) {
                    i = remaining;
                    jArr = new long[1];
                } else {
                    i = remaining;
                    jArr = null;
                }
                if (array == null) {
                    bArr = UnifiedTemplateResolver.f184334a;
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = arrayOffset;
                    bArr = array;
                }
                String str2 = "UnifiedTemplateResolver returned error ";
                Status jni_resolveFlat = unifiedTemplateResolver.jni_resolveFlat(bArr2, bArr, i2, i, bArr3, str, unifiedTemplateResolver.f184336b, unifiedTemplateResolver.f184337c, bArr4, jArr);
                if (jni_resolveFlat.mo61679g()) {
                    C68039ab.m98254o(ByteBuffer.wrap(bArr4[0]), abVar);
                    byte[] bArr5 = bArr4[2];
                    if (bArr5 != null) {
                        String str3 = new String(bArr5);
                        sb.append(str3);
                        if (cVar != null) {
                            cVar.f184342b = str3;
                        }
                    }
                    if (cVar != null) {
                        long j = jArr[0];
                        if (j > 0) {
                            cVar.f184341a = j;
                        }
                    }
                }
                if (jni_resolveFlat.mo61679g()) {
                    zVar.mo26846G(sb.toString(), "|");
                    if (cVar != null) {
                        long j2 = cVar.f184341a;
                        if (j2 > 0) {
                            chVar2.mo26278f(j2);
                        }
                        String str4 = cVar.f184342b;
                        if (str4 != null) {
                            chVar2.mo26279g(str4);
                        }
                    }
                } else {
                    C21319z zVar2 = zVar;
                }
                if (!(f == null || zVar.mo26814o() == null)) {
                    C66091ay ayVar = (C66091ay) C66092az.f179718d.createBuilder();
                    ayVar.copyOnWrite();
                    C66092az azVar = (C66092az) ayVar.instance;
                    azVar.f179721b = f;
                    azVar.f179720a |= 1;
                    C66105j e = C21168q.m39751e(abVar, (C21279bv) null, (byte[]) null, zVar.mo26814o());
                    if (e != null) {
                        ayVar.copyOnWrite();
                        C66092az azVar2 = (C66092az) ayVar.instance;
                        azVar2.f179722c = e;
                        azVar2.f179720a |= 2;
                    }
                    C66096bc bcVar2 = (C66096bc) C66097bd.f179735e.createBuilder();
                    C63042fg d2 = C21168q.m39750d();
                    bcVar2.copyOnWrite();
                    C66097bd bdVar3 = (C66097bd) bcVar2.instance;
                    d2.getClass();
                    bdVar3.f179740d = d2;
                    bdVar3.f179737a |= 1;
                    bcVar2.copyOnWrite();
                    C66097bd bdVar4 = (C66097bd) bcVar2.instance;
                    C66092az azVar3 = (C66092az) ayVar.build();
                    azVar3.getClass();
                    bdVar4.f179739c = azVar3;
                    bdVar4.f179738b = 3;
                    ((DebuggerClient) this.f59157a.f59167d.mo17428b()).sendTimelineEvent(((C66097bd) bcVar2.build()).toByteArray());
                }
                if (jni_resolveFlat.mo61679g()) {
                    return abVar;
                }
                throw new C21260bc(str2 + jni_resolveFlat.getCode().toString() + ", " + C21115w.m39647a(this.f59158b) + ": " + jni_resolveFlat.getDescription());
            }
            throw new IllegalArgumentException("Attempt to resolve a null TemplateConfig");
        } catch (IOException e2) {
            throw new C21260bc("Error resolving template with UnifiedTemplateResolver", e2);
        }
    }
}
