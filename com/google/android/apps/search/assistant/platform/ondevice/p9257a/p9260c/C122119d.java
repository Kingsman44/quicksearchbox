package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122101j;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.c.d */
/* compiled from: PG */
public abstract class C122119d {

    /* renamed from: b */
    public final C122106o f338773b;

    public C122119d(C122106o oVar) {
        this.f338773b = oVar;
    }

    /* renamed from: d */
    public static C122119d m201658d(C62917ay ayVar, C62917ay ayVar2) {
        if (((C62940bt) ayVar).f169971d.f169964b == ((C62940bt) ayVar2).f169971d.f169964b) {
            return new C122115b(ayVar, ayVar2);
        }
        throw new IllegalArgumentException("Request and response extensions' numbers don't match");
    }

    /* renamed from: a */
    public abstract C122099h mo105534a(MessageLite messageLite);

    /* renamed from: b */
    public abstract C122101j mo105535b(MessageLite messageLite);

    /* renamed from: c */
    public abstract MessageLite mo105536c(C122101j jVar);
}
