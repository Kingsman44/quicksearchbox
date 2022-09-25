package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import com.google.android.libraries.assistant.trainingcache.agsa.C19427e;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5228m.C67278ai;
import com.google.speech.p5228m.C67314br;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.ac */
/* compiled from: PG */
public final /* synthetic */ class C101201ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C101202ad f282477a;

    /* renamed from: b */
    public final /* synthetic */ int f282478b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f282479c;

    /* renamed from: d */
    public final /* synthetic */ int f282480d;

    public /* synthetic */ C101201ac(C101202ad adVar, int i, byte[] bArr, int i2) {
        this.f282477a = adVar;
        this.f282478b = i;
        this.f282479c = bArr;
        this.f282480d = i2;
    }

    public final Object call() {
        int length;
        C101202ad adVar = this.f282477a;
        int i = this.f282478b;
        byte[] bArr = this.f282479c;
        int i2 = this.f282480d;
        TrainingCacheService trainingCacheService = adVar.f282481a;
        int b = C67278ai.m97449b(i);
        if (b == 0) {
            ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56226d()).mo56372aa(19904)).mo56387q("Invalid ClientEvent: %d", i);
            return null;
        }
        int a = C67314br.m97450a(i2);
        if (a == 0) {
            ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56225c()).mo56372aa(19903)).mo56387q("Invalid session tag: %d", i2);
            return null;
        } else if (b == 1012 || (length = bArr.length) <= 1000000) {
            try {
                ((C19427e) trainingCacheService.f282464b.f281666d.mo27525b()).mo24618d(b, bArr, a);
                return null;
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56225c()).mo56382g(e)).mo56372aa(19901)).mo56387q("Exception while inserting ClientEvent '%d' into cache.", b - 1);
                return null;
            }
        } else {
            ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56226d()).mo56372aa(19902)).mo56393w("Payload too large (size: %d) with Client.EventType '%d'.", length, b - 1);
            return null;
        }
    }
}
