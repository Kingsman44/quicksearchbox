package com.google.p5238v.p5239a.p5250f;

import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.v.a.f.g */
/* compiled from: PG */
public abstract class C67600g {

    /* renamed from: a */
    private final Map f183535a;

    /* renamed from: b */
    public final Class f183536b;

    /* renamed from: c */
    public final Class f183537c;

    @SafeVarargs
    protected C67600g(Class cls, C67612s... sVarArr) {
        this.f183536b = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            C67612s sVar = sVarArr[i];
            if (!hashMap.containsKey(sVar.f183551a)) {
                hashMap.put(sVar.f183551a, sVar);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(sVar.f183551a.getCanonicalName())));
            }
        }
        this.f183537c = sVarArr[0].f183551a;
        this.f183535a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public C67599f mo59891a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract C67720cw mo59892b();

    /* renamed from: c */
    public abstract MessageLite mo59893c(C63088z zVar);

    /* renamed from: d */
    public abstract String mo59894d();

    /* renamed from: e */
    public abstract void mo59895e(MessageLite messageLite);

    /* renamed from: f */
    public int mo59902f() {
        return 1;
    }

    /* renamed from: i */
    public final Object mo59937i(MessageLite messageLite, Class cls) {
        C67612s sVar = (C67612s) this.f183535a.get(cls);
        if (sVar != null) {
            return sVar.mo59896a(messageLite);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    /* renamed from: j */
    public final Set mo59938j() {
        return this.f183535a.keySet();
    }
}
