package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.l */
/* compiled from: PG */
public final /* synthetic */ class C122704l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ TextAnnotatorImpl f339979a;

    /* renamed from: b */
    public final /* synthetic */ String f339980b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f339981c;

    /* renamed from: d */
    public final /* synthetic */ Instant f339982d;

    /* renamed from: e */
    public final /* synthetic */ String f339983e;

    /* renamed from: f */
    public final /* synthetic */ C63179l f339984f;

    public /* synthetic */ C122704l(TextAnnotatorImpl textAnnotatorImpl, String str, C58485gu guVar, Instant instant, String str2, C63179l lVar) {
        this.f339979a = textAnnotatorImpl;
        this.f339980b = str;
        this.f339981c = guVar;
        this.f339982d = instant;
        this.f339983e = str2;
        this.f339984f = lVar;
    }

    /* JADX INFO: finally extract failed */
    public final C60870cx apply(Object obj) {
        TextAnnotatorImpl textAnnotatorImpl = this.f339979a;
        TextAnnotatorImpl textAnnotatorImpl2 = textAnnotatorImpl;
        C122700h hVar = new C122700h(textAnnotatorImpl2, this.f339980b, this.f339981c, (Optional) obj, this.f339982d, this.f339983e, this.f339984f);
        ReentrantReadWriteLock.ReadLock readLock = textAnnotatorImpl.f339792e.readLock();
        readLock.lock();
        try {
            if (!textAnnotatorImpl.f339793f) {
                Object call = hVar.call();
                readLock.unlock();
                return C60856cj.m92900i((C58485gu) call);
            }
            throw new C122872ec("TextAnnotatorImpl", "Attempt to run annotation request when already destroyed");
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }
}
