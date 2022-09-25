package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.util.Log;
import com.google.assistant.p3863av.p3864a.p3865a.p3866a.C50532j;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61843a;
import com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61844b;
import com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61845c;
import com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61846d;
import com.google.protobuf.C63088z;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.cw */
/* compiled from: PG */
public final /* synthetic */ class C61940cw implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C61878ao f167417a;

    public /* synthetic */ C61940cw(C61878ao aoVar) {
        this.f167417a = aoVar;
    }

    public final Object call() {
        C61907bq a;
        FileInputStream createInputStream;
        C61878ao aoVar = this.f167417a;
        if (aoVar.f167322b == null) {
            return null;
        }
        aoVar.mo58321a();
        C61843a aVar = (C61843a) C61846d.f167118n.createBuilder();
        if (aoVar.f167322b.mo58380j()) {
            Log.v("ContactModelManager", "Append shortcut contacts.");
            C58485gu b = aoVar.f167322b.mo58372b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                String str = (String) b.get(i);
                if (!str.isEmpty()) {
                    C61844b bVar = (C61844b) C61845c.f167104m.createBuilder();
                    bVar.copyOnWrite();
                    C61845c cVar = (C61845c) bVar.instance;
                    str.getClass();
                    cVar.f167106a |= 1;
                    cVar.f167107b = str;
                    bVar.copyOnWrite();
                    C61845c cVar2 = (C61845c) bVar.instance;
                    cVar2.f167106a |= 512;
                    cVar2.f167116k = "0";
                    aVar.mo58209a((C61845c) bVar.build());
                }
            }
        }
        for (C61845c a2 : C61875al.m94540a(aoVar.f167321a.getContentResolver())) {
            aVar.mo58209a(a2);
        }
        aVar.copyOnWrite();
        C61846d dVar = (C61846d) aVar.instance;
        dVar.f167120a |= 1;
        dVar.f167122c = 4;
        aVar.copyOnWrite();
        C61846d dVar2 = (C61846d) aVar.instance;
        dVar2.f167120a |= 2;
        dVar2.f167123d = 20;
        boolean f = aoVar.f167322b.mo58376f();
        aVar.copyOnWrite();
        C61846d dVar3 = (C61846d) aVar.instance;
        dVar3.f167120a = 4 | dVar3.f167120a;
        dVar3.f167124e = f;
        boolean e = aoVar.f167322b.mo58375e();
        aVar.copyOnWrite();
        C61846d dVar4 = (C61846d) aVar.instance;
        dVar4.f167120a |= 8;
        dVar4.f167125f = e;
        boolean d = aoVar.f167322b.mo58374d();
        aVar.copyOnWrite();
        C61846d dVar5 = (C61846d) aVar.instance;
        dVar5.f167120a |= 16;
        dVar5.f167126g = d;
        boolean g = aoVar.f167322b.mo58377g();
        aVar.copyOnWrite();
        C61846d dVar6 = (C61846d) aVar.instance;
        dVar6.f167120a |= 32;
        dVar6.f167127h = g;
        boolean i2 = aoVar.f167322b.mo58379i();
        aVar.copyOnWrite();
        C61846d dVar7 = (C61846d) aVar.instance;
        dVar7.f167120a |= 64;
        dVar7.f167128i = i2;
        C63088z zVar = C63088z.f170246b;
        try {
            a = aoVar.f167322b.mo58373c().mo58311a();
            if (a != null) {
                if (a.mo58341a() != null) {
                    createInputStream = ((CloseableAssetFileDescriptor) a.mo58341a()).createInputStream();
                    zVar = C63088z.m96144F(createInputStream);
                    if (createInputStream != null) {
                        createInputStream.close();
                    }
                }
            }
            if (a != null) {
                a.close();
            }
        } catch (IOException unused) {
            Log.w("ContactModelManager", "Could not load lightweighTokens model.");
        } catch (Throwable th) {
            C61876am.m94541a(th, th);
        }
        aVar.copyOnWrite();
        C61846d dVar8 = (C61846d) aVar.instance;
        zVar.getClass();
        dVar8.f167120a |= 128;
        dVar8.f167129j = zVar;
        C50532j a3 = aoVar.f167322b.mo58371a();
        aVar.copyOnWrite();
        C61846d dVar9 = (C61846d) aVar.instance;
        a3.getClass();
        dVar9.f167131l = a3;
        dVar9.f167120a |= 512;
        C61846d dVar10 = (C61846d) aVar.build();
        if (dVar10.equals(aoVar.f167323c)) {
            return null;
        }
        aoVar.f167323c = dVar10;
        aoVar.f167324d = true;
        return null;
        throw th;
        throw th;
    }
}
