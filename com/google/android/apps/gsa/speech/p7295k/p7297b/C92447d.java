package com.google.android.apps.gsa.speech.p7295k.p7297b;

import com.google.protobuf.C63088z;
import com.google.speech.p5195a.C66449d;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5202d.p5203a.C66489b;
import com.google.speech.recognizer.p5233a.C67451at;
import com.google.speech.recognizer.p5233a.C67452au;
import com.google.speech.recognizer.p5233a.C67453av;

/* renamed from: com.google.android.apps.gsa.speech.k.b.d */
/* compiled from: PG */
public final class C92447d {
    /* renamed from: a */
    public static C67453av m151921a(int i, boolean z, boolean z2, C66422b bVar, C66489b bVar2, int i2, byte[] bArr) {
        C67452au auVar = (C67452au) C67453av.f183322n.createBuilder();
        C67451at atVar = C67451at.LINEAR16;
        auVar.copyOnWrite();
        C67453av avVar = (C67453av) auVar.instance;
        avVar.f183326c = atVar.f183321p;
        avVar.f183324a |= 1;
        auVar.copyOnWrite();
        C67453av avVar2 = (C67453av) auVar.instance;
        avVar2.f183324a |= 4;
        avVar2.f183328e = z2;
        auVar.copyOnWrite();
        C67453av avVar3 = (C67453av) auVar.instance;
        avVar3.f183324a |= 2;
        avVar3.f183327d = (float) i;
        if (bVar != null) {
            auVar.copyOnWrite();
            C67453av avVar4 = (C67453av) auVar.instance;
            avVar4.f183334k = bVar;
            avVar4.f183325b |= 128;
        }
        if (bVar2 != null) {
            auVar.copyOnWrite();
            C67453av avVar5 = (C67453av) auVar.instance;
            avVar5.f183333j = bVar2;
            avVar5.f183325b |= 32;
        }
        if (z) {
            auVar.copyOnWrite();
            C67453av avVar6 = (C67453av) auVar.instance;
            avVar6.f183324a |= 64;
            avVar6.f183331h = true;
        }
        if (i2 > 0) {
            auVar.copyOnWrite();
            C67453av avVar7 = (C67453av) auVar.instance;
            avVar7.f183324a |= 2048;
            avVar7.f183332i = i2;
        }
        if (bArr != null) {
            C63088z A = C63088z.m96139A(bArr);
            auVar.copyOnWrite();
            C67453av avVar8 = (C67453av) auVar.instance;
            avVar8.f183325b |= 2048;
            avVar8.f183336m = A;
            auVar.copyOnWrite();
            C67453av avVar9 = (C67453av) auVar.instance;
            avVar9.f183325b |= 1024;
            avVar9.f183335l = true;
        }
        auVar.copyOnWrite();
        C67453av avVar10 = (C67453av) auVar.instance;
        avVar10.f183324a |= 8;
        avVar10.f183329f = true;
        C66449d a = C92449f.m151923a();
        auVar.copyOnWrite();
        C67453av avVar11 = (C67453av) auVar.instance;
        a.getClass();
        avVar11.f183330g = a;
        avVar11.f183324a |= 16;
        return (C67453av) auVar.build();
    }
}
